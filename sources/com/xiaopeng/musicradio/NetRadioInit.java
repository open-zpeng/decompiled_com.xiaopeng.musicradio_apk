package com.xiaopeng.musicradio;

import com.xiaopeng.musicradio.model.dui.f;
import com.xiaopeng.musicradio.model.player.NetRadioPlayerWrapper;
import com.xiaopeng.musicradio.netradio.FlavorNetRadioInit;
import com.xiaopeng.musicradio.player.g;
import com.xiaopeng.musicradio.utils.ao;
/* loaded from: classes.dex */
public class NetRadioInit extends arb {
    private FlavorNetRadioInit mInit = new FlavorNetRadioInit();

    @Override // defpackage.arb
    public void igOff() {
    }

    @Override // defpackage.arb
    public void igOn() {
    }

    @Override // defpackage.arb
    public void onMusicBinded() {
    }

    @Override // defpackage.arb
    public void initPlayer() {
        g.a().a(6, NetRadioPlayerWrapper.class);
    }

    @Override // defpackage.arb
    public void initNow() {
        this.mInit.initNow();
        ao.a();
        aei.a().a(6, aps.i());
        new ane();
        avu.a().a(6, "/netradio/fragment/player");
        aex.a().a(new c());
    }

    @Override // defpackage.arb
    public void initDelay() {
        this.mInit.initDelay();
        com.xiaopeng.musicradio.model.dui.c.a().b();
        f.a().a(6, new com.xiaopeng.musicradio.model.dui.a());
        com.xiaopeng.musicradio.model.dui.g.a().a(6, new com.xiaopeng.musicradio.model.dui.b());
        apt.a();
    }

    @Override // defpackage.arb
    public void registerService() {
        com.xiaopeng.musicradio.service.c.a().a(aub.class, "com.xiaopeng.musicradio.service.NetRadioService");
        com.xiaopeng.musicradio.service.c.a().a(aua.class, "com.xiaopeng.musicradio.service.NetRadioMineService");
    }
}
