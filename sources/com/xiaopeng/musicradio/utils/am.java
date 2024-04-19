package com.xiaopeng.musicradio.utils;

import android.util.Log;
/* compiled from: NavigationUtil.java */
/* loaded from: classes2.dex */
public class am {
    public static void a() {
        Log.i("NavigationUtil", "doTopApp.. top: " + b.a(com.xiaopeng.musicradio.a.a) + ", loging: " + aqi.a().e());
        if (b.a(com.xiaopeng.musicradio.a.a) || aqi.a().e() || w.i()) {
            return;
        }
        b.a(com.xiaopeng.musicradio.a.a.getPackageName(), com.xiaopeng.musicradio.a.a);
    }

    public static void b() {
        boolean a = b.a(com.xiaopeng.musicradio.a.a);
        Log.i("NavigationUtil", "compulsoryTopApp.. isTop: " + a);
        if (a || w.i()) {
            return;
        }
        b.a(com.xiaopeng.musicradio.a.a.getPackageName(), com.xiaopeng.musicradio.a.a);
    }
}
