package com.xiaopeng.musicradio.model.dui;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.model.dui.g;
import com.xiaopeng.speech.protocol.query.music.bean.PlayInfo;
/* compiled from: DuiFmMediaQueryModel.java */
/* loaded from: classes.dex */
public class b implements g.a {
    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public void a(PlayInfo playInfo) {
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public String b() {
        return "";
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public String c() {
        return "";
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public boolean d() {
        return false;
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public String a() {
        NetRadioProgramInfo d = aps.i().d();
        if (d != null) {
            NetRadioInfo parentInfo = d.getParentInfo();
            return !TextUtils.isEmpty(parentInfo.getName()) ? parentInfo.getName() : "";
        }
        return "";
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public boolean e() {
        return apt.a().b().size() <= 0;
    }
}
