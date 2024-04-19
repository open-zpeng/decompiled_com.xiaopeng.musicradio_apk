package com.xiaopeng.musicradio.utils;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
/* compiled from: AudioPlayUtil.java */
/* loaded from: classes2.dex */
public class e {
    public static void a(ahp<MusicInfo> ahpVar) {
        aei.a().c();
        apk.i().a(ahpVar);
    }

    public static boolean a() {
        MusicInfo d = apk.i().d();
        if (d != null) {
            return d.getMusicFrom() == 61 || d.getMusicFrom() == 60 || d.getOldMusicFrom() == 61 || d.getOldMusicFrom() == 60 || au.a();
        }
        return false;
    }
}
