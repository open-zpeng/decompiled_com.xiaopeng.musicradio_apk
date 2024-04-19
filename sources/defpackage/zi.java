package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
/* compiled from: Platform.java */
/* renamed from: zi  reason: default package */
/* loaded from: classes3.dex */
final class zi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T[] a(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T[] a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }
}
