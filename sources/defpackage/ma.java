package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
/* compiled from: ConstructorConstructor.java */
/* renamed from: ma  reason: default package */
/* loaded from: classes3.dex */
public final class ma {
    private final Map<Type, mr<?>> a;

    public ma(Map<Type, mr<?>> map) {
        this.a = map;
    }

    private <T> md<T> a(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new md<T>() { // from class: ma.9
                @Override // defpackage.md
                public T a() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    } catch (InstantiationException e2) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e3.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> md<T> a(final Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new md<T>() { // from class: ma.10
                @Override // defpackage.md
                public T a() {
                    return (T) new TreeSet();
                }
            } : EnumSet.class.isAssignableFrom(cls) ? new md<T>() { // from class: ma.11
                @Override // defpackage.md
                public T a() {
                    Type type2 = type;
                    if (!(type2 instanceof ParameterizedType)) {
                        throw new mu("Invalid EnumSet type: " + type.toString());
                    }
                    Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                    if (type3 instanceof Class) {
                        return (T) EnumSet.noneOf((Class) type3);
                    }
                    throw new mu("Invalid EnumSet type: " + type.toString());
                }
            } : Set.class.isAssignableFrom(cls) ? new md<T>() { // from class: ma.12
                @Override // defpackage.md
                public T a() {
                    return (T) new LinkedHashSet();
                }
            } : Queue.class.isAssignableFrom(cls) ? new md<T>() { // from class: ma.2
                @Override // defpackage.md
                public T a() {
                    return (T) new LinkedList();
                }
            } : new md<T>() { // from class: ma.3
                @Override // defpackage.md
                public T a() {
                    return (T) new ArrayList();
                }
            };
        } else if (Map.class.isAssignableFrom(cls)) {
            return SortedMap.class.isAssignableFrom(cls) ? new md<T>() { // from class: ma.4
                @Override // defpackage.md
                public T a() {
                    return (T) new TreeMap();
                }
            } : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(mo.a(((ParameterizedType) type).getActualTypeArguments()[0]).a())) ? new md<T>() { // from class: ma.6
                @Override // defpackage.md
                public T a() {
                    return (T) new me();
                }
            } : new md<T>() { // from class: ma.5
                @Override // defpackage.md
                public T a() {
                    return (T) new LinkedHashMap();
                }
            };
        } else {
            return null;
        }
    }

    private <T> md<T> b(final Type type, final Class<? super T> cls) {
        return new md<T>() { // from class: ma.7
            private final mf d = mf.a();

            @Override // defpackage.md
            public T a() {
                try {
                    return (T) this.d.a(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". Register an InstanceCreator with Gson for this type may fix this problem.", e);
                }
            }
        };
    }

    public <T> md<T> a(mo<T> moVar) {
        final Type b = moVar.b();
        Class<? super T> a = moVar.a();
        final mr<?> mrVar = this.a.get(b);
        if (mrVar != null) {
            return new md<T>() { // from class: ma.1
                @Override // defpackage.md
                public T a() {
                    return (T) mrVar.a(b);
                }
            };
        }
        final mr<?> mrVar2 = this.a.get(a);
        if (mrVar2 != null) {
            return new md<T>() { // from class: ma.8
                @Override // defpackage.md
                public T a() {
                    return (T) mrVar2.a(b);
                }
            };
        }
        md<T> a2 = a(a);
        if (a2 != null) {
            return a2;
        }
        md<T> a3 = a(b, a);
        return a3 != null ? a3 : b(b, a);
    }

    public String toString() {
        return this.a.toString();
    }
}
