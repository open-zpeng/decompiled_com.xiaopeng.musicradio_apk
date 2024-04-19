package defpackage;
/* compiled from: Longs.java */
/* renamed from: zq  reason: default package */
/* loaded from: classes3.dex */
public final class zq {
    public static long a(long... jArr) {
        yj.a(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] < j) {
                j = jArr[i];
            }
        }
        return j;
    }
}
