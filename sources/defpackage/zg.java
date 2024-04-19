package defpackage;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
/* compiled from: ObjectArrays.java */
/* renamed from: zg  reason: default package */
/* loaded from: classes3.dex */
public final class zg {
    public static <T> T[] a(T[] tArr, int i) {
        return (T[]) zi.a(tArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    public static Object[] a(Object... objArr) {
        return b(objArr, objArr.length);
    }

    @CanIgnoreReturnValue
    static Object[] b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
        return objArr;
    }

    @CanIgnoreReturnValue
    static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }
}
