package com.xiaopeng.musicradio.music.player.view;

import android.content.Context;
import android.util.Pair;
import android.view.View;
/* compiled from: BtMusicSmallPlayer.java */
/* loaded from: classes.dex */
public class b implements awa {
    @Override // defpackage.awa
    public boolean b() {
        return true;
    }

    @Override // defpackage.awa
    public View a(Context context) {
        return new BtMusicSmallPlayerSubView(context);
    }

    @Override // defpackage.awa
    public Pair<String, String> a() {
        if (com.xiaopeng.musicradio.model.bluetooth.a.i().v()) {
            return new Pair<>(com.xiaopeng.musicradio.model.bluetooth.a.a, com.xiaopeng.musicradio.model.bluetooth.a.b);
        }
        arg b = amt.a().b();
        if (b != null) {
            return new Pair<>(b.a(), b.b());
        }
        return null;
    }
}
