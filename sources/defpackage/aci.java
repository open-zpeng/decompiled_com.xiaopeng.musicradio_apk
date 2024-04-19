package defpackage;
/* compiled from: StartPerfUtils.java */
/* renamed from: aci  reason: default package */
/* loaded from: classes2.dex */
public class aci {
    private static volatile boolean a = true;
    private static long b;
    private static long c;
    private static long d;

    public static void a() {
        b = System.currentTimeMillis();
    }

    public static void b() {
        c = System.currentTimeMillis();
        d = c - b;
    }
}
