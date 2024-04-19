package com.xiaopeng.musicradio.program.model.dui;

import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.model.dui.g;
import com.xiaopeng.speech.protocol.query.music.bean.PlayInfo;
/* compiled from: DuiProgramMediaQueryModel.java */
/* loaded from: classes2.dex */
public class b implements g.a {
    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public void a(PlayInfo playInfo) {
        ProgramBean r = axn.i().r();
        if (r != null) {
            playInfo.setPlayType(2);
            playInfo.setAlbum(r.getAlbumName());
            playInfo.setArtist(r.getArtistName());
            playInfo.setTitle(r.getTitle());
            playInfo.setPlayTime(axn.i().getPosition());
            playInfo.setRemainingTime(axn.i().getDuration() - axn.i().getPosition());
        }
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public String a() {
        ProgramBean r = axn.i().r();
        return r != null ? r.getTitle() : "";
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public String b() {
        ProgramBean r = axn.i().r();
        return r != null ? r.getArtistName() : "";
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public String c() {
        ProgramBean r = axn.i().r();
        return r != null ? r.getAlbumName() : "";
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public boolean d() {
        return axi.a().c() <= 0;
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public boolean e() {
        return axj.a().c().size() == 0;
    }
}
