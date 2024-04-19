package com.xiaopeng.musicradio;

import com.xiaopeng.musicradio.model.dui.f;
import com.xiaopeng.musicradio.player.g;
import com.xiaopeng.musicradio.program.FlavorProgramInit;
import com.xiaopeng.musicradio.program.model.player.ProgramPlayerWrapper;
import com.xiaopeng.musicradio.utils.ar;
/* loaded from: classes.dex */
public class ProgramInit extends arb {
    private FlavorProgramInit mInit = new FlavorProgramInit();

    @Override // defpackage.arb
    public void igOn() {
    }

    @Override // defpackage.arb
    public void onMusicBinded() {
    }

    @Override // defpackage.arb
    public void initPlayer() {
        g.a().a(3, ProgramPlayerWrapper.class);
    }

    @Override // defpackage.arb
    public void initNow() {
        this.mInit.initNow();
        ar.a();
        aei.a().a(3, axn.i());
        axh.a();
        avu.a().a(3, "/program/fragment/player");
        aex.a().a(new com.xiaopeng.musicradio.program.a());
    }

    @Override // defpackage.arb
    public void initDelay() {
        this.mInit.initDelay();
        aef.a();
        f.a().a(3, new com.xiaopeng.musicradio.program.model.dui.a());
        com.xiaopeng.musicradio.model.dui.g.a().a(3, new com.xiaopeng.musicradio.program.model.dui.b());
    }

    @Override // defpackage.arb
    public void registerService() {
        com.xiaopeng.musicradio.service.c.a().a(awh.class, "com.xiaopeng.musicradio.service.ProgramService");
        com.xiaopeng.musicradio.service.c.a().a(awg.class, "com.xiaopeng.musicradio.service.ProgramMineService");
    }

    @Override // defpackage.arb
    public void igOff() {
        axl.a().d();
    }
}
