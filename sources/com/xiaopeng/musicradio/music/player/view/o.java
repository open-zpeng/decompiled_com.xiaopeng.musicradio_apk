package com.xiaopeng.musicradio.music.player.view;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
/* compiled from: MusicSmallPlayer.java */
/* loaded from: classes.dex */
public class o implements awa {
    @Override // defpackage.awa
    public boolean b() {
        return false;
    }

    @Override // defpackage.awa
    public View a(Context context) {
        return new MusicSmallPlayerSubView(context);
    }

    @Override // defpackage.awa
    public Pair<String, String> a() {
        MusicInfo d = apk.i().d();
        if (d != null) {
            return new Pair<>(d.getSong(), d.getSinger());
        }
        return null;
    }
}
