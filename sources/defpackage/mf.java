package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: UnsafeAllocator.java */
/* renamed from: mf  reason: default package */
/* loaded from: classes3.dex */
public abstract class mf {
    public static mf a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            final Method method = cls.getMethod("allocateInstance", Class.class);
            return new mf() { // from class: mf.1
                @Override // defpackage.mf
                public <T> T a(Class<T> cls2) {
                    return (T) method.invoke(obj, cls2);
                }
            };
        } catch (Exception unused) {
            try {
                try {
                    final Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod.setAccessible(true);
                    return new mf() { // from class: mf.2
                        @Override // defpackage.mf
                        public <T> T a(Class<T> cls2) {
                            return (T) declaredMethod.invoke(null, cls2, Object.class);
                        }
                    };
                } catch (Exception unused2) {
                    return new mf() { // from class: mf.4
                        @Override // defpackage.mf
                        public <T> T a(Class<T> cls2) {
                            throw new UnsupportedOperationException("Cannot allocate " + cls2);
                        }
                    };
                }
            } catch (Exception unused3) {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                final int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                final Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod3.setAccessible(true);
                return new mf() { // from class: mf.3
                    @Override // defpackage.mf
                    public <T> T a(Class<T> cls2) {
                        return (T) declaredMethod3.invoke(null, cls2, Integer.valueOf(intValue));
                    }
                };
            }
        }
    }

    public abstract <T> T a(Class<T> cls);
}
