package defpackage;

import android.util.Log;
/* compiled from: SmallPlayerHelper.java */
/* renamed from: avx  reason: default package */
/* loaded from: classes2.dex */
public class avx {
    private static boolean a = true;
    private static boolean b = false;

    public static void a(boolean z) {
        Log.i("SmallPlayerHelper", "setSmallPlayerShow: ==");
        a = z;
    }

    public static boolean a() {
        return a;
    }

    public static void b(boolean z) {
        b = z;
    }

    public static boolean b() {
        return b;
    }
}
