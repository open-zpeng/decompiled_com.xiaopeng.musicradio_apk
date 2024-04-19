package com.xiaopeng.musicradio.utils;

import android.content.Context;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.xui.app.XToast;
import java.util.Objects;
/* compiled from: MusicToast.java */
/* loaded from: classes2.dex */
public class ak {
    public static void a(Context context, String str) {
        if (b.a(com.xiaopeng.musicradio.a.a)) {
            a(com.xiaopeng.musicradio.a.a, str, 0);
            LogUtils.i("MusicToast", Objects.toString(str));
        }
    }

    public static void a(Context context, int i) {
        if (b.a(com.xiaopeng.musicradio.a.a)) {
            a(com.xiaopeng.musicradio.a.a, com.xiaopeng.musicradio.a.a.getString(i), 0);
            LogUtils.i("MusicToast", com.xiaopeng.musicradio.a.a.getResources().getString(i));
        }
    }

    public static void b(Context context, String str) {
        a(com.xiaopeng.musicradio.a.a, str, 0);
        LogUtils.i("MusicToast", Objects.toString(str));
    }

    public static void b(Context context, int i) {
        a(com.xiaopeng.musicradio.a.a, com.xiaopeng.musicradio.a.a.getString(i), 0);
        LogUtils.i("MusicToast", com.xiaopeng.musicradio.a.a.getResources().getString(i));
    }

    private static void a(Context context, final String str, int i) {
        ban.j(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ak.1
            @Override // java.lang.Runnable
            public void run() {
                XToast.showLong(str);
            }
        });
    }
}
