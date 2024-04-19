package com.xiaopeng.musicradio.utils;

import android.media.AudioManager;
import android.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
/* compiled from: AudioUtil.java */
/* loaded from: classes2.dex */
public class f {
    public static final int a;

    static {
        a = bf.d() ? 8 : 4;
    }

    public static AudioManager a() {
        return (AudioManager) com.xiaopeng.musicradio.a.a.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public static boolean b() {
        return a().isStreamMute(3);
    }

    public static boolean c() {
        return b() || f();
    }

    @Deprecated
    public static void d() {
        if (f()) {
            a(a);
        }
    }

    public static boolean e() {
        if (w.c()) {
            return b() || f();
        }
        return b();
    }

    public static boolean f() {
        return g() == 0;
    }

    @Deprecated
    public static void a(int i) {
        if (!bf.d()) {
            i *= 2;
        }
        Log.i("AudioUtil", "setMusicVolume: " + i, new Throwable());
        a().setStreamVolume(3, i, 16);
    }

    public static int g() {
        int c = c(3);
        return bf.d() ? c : c / 2;
    }

    private static int c(int i) {
        if (b()) {
            return a().getStreamVolume(i);
        }
        Object a2 = aw.a(a(), "getLastAudibleStreamVolume", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)});
        if (a2 == null) {
            return a().getStreamVolume(i);
        }
        return ((Integer) a2).intValue();
    }

    public static int b(int i) {
        return a().getStreamVolume(i);
    }
}
