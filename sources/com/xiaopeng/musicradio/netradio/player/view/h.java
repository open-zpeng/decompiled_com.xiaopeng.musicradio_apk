package com.xiaopeng.musicradio.netradio.player.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.utils.be;
import defpackage.beo;
/* compiled from: NetRadioSmallPlayer.java */
/* loaded from: classes2.dex */
public class h implements awa {
    @Override // defpackage.awa
    public boolean b() {
        return true;
    }

    @Override // defpackage.awa
    public View a(Context context) {
        return new NetRadioSmallPlayerSubView(context);
    }

    @Override // defpackage.awa
    public Pair<String, String> a() {
        NetRadioProgramInfo d = aps.i().d();
        if (d == null || d.getParentInfo() == null) {
            return null;
        }
        return new Pair<>(d.getParentInfo().getName(), a(d.getName()));
    }

    private String a(String str) {
        if (TextUtils.equals(str, com.xiaopeng.musicradio.a.a.getString(beo.e.netradio_play_live))) {
            str = be.a(beo.e.netradio_live_no_program);
        }
        return c() ? String.format("%s：%s", com.xiaopeng.musicradio.a.a.getString(beo.e.netradio_play_live), str) : String.format("%s：%s", com.xiaopeng.musicradio.a.a.getString(beo.e.netradio_play_back), str);
    }

    public boolean c() {
        return aps.i().m() == 1;
    }
}
