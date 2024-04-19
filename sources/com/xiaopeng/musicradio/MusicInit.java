package com.xiaopeng.musicradio;

import com.xiaopeng.musicradio.model.dui.d;
import com.xiaopeng.musicradio.model.dui.e;
import com.xiaopeng.musicradio.model.dui.f;
import com.xiaopeng.musicradio.model.player.MusicPlayerWrapper;
import com.xiaopeng.musicradio.music.FlavorMusicInit;
import com.xiaopeng.musicradio.player.g;
import com.xiaopeng.musicradio.utils.w;
/* loaded from: classes.dex */
public class MusicInit extends arb {
    private FlavorMusicInit mInit = new FlavorMusicInit();

    @Override // defpackage.arb
    public void igOff() {
    }

    @Override // defpackage.arb
    public void igOn() {
    }

    @Override // defpackage.arb
    public void initPlayer() {
        g.a().a(0, MusicPlayerWrapper.class);
    }

    @Override // defpackage.arb
    public void initNow() {
        this.mInit.initNow();
        aex.a().a(new com.xiaopeng.musicradio.music.a());
        aei.a().a(0, apk.i());
        aei.a().a(2, com.xiaopeng.musicradio.model.bluetooth.a.i());
        anc.a();
        aeh.a().a(new apg());
        aeh.a().a(new apf());
        avu.a().a(0, "/music/fragment/player");
        avu.a().a(2, "/music/fragment/player");
        avu.a().a(-1, "/music/fragment/player");
    }

    @Override // defpackage.arb
    public void initDelay() {
        this.mInit.initDelay();
        anv.a().b();
        apk.i().j();
        f.a();
        aed.a();
        f.a().a(0, new d());
        com.xiaopeng.musicradio.model.dui.g.a().a(0, new e());
        if (w.e()) {
            apc.a();
        }
        ant.a().a("initDelay");
        anu.a().b("initDelay");
        ans.a().a("initDelay");
        anb.a().c();
    }

    @Override // defpackage.arb
    public void registerService() {
        com.xiaopeng.musicradio.service.c.a().a(arf.class, "com.xiaopeng.musicradio.service.MusicService");
        com.xiaopeng.musicradio.service.c.a().a(ard.class, "com.xiaopeng.musicradio.service.MusicMineService");
        if (2 == w.f()) {
            com.xiaopeng.musicradio.service.c.a().a(are.class, "com.xiaopeng.musicradio.service.MusicQqService");
        }
    }

    @Override // defpackage.arb
    public void onMusicBinded() {
        ant.a().a("onMusicBinded");
        anu.a().b("onMusicBinded");
        ans.a().a("onMusicBinded");
        aos.a().b();
        any.a().a(aqh.a().b());
    }
}
