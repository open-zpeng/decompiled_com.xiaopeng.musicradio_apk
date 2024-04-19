package defpackage;

import android.os.Build;
/* compiled from: BuildCompat.java */
/* renamed from: fs  reason: default package */
/* loaded from: classes3.dex */
public class fs {
    @Deprecated
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }
}
