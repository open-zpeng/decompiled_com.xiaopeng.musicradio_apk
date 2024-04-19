package com.xiaopeng.musicradio.utils;

import android.os.Looper;
/* compiled from: LooperUtil.java */
/* loaded from: classes2.dex */
public class af {
    public static void a() {
        if (!b()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
