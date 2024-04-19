package com.xiaopeng.musicradio;
/* loaded from: classes.dex */
public class VipInit extends arb {
    @Override // defpackage.arb
    public void igOff() {
    }

    @Override // defpackage.arb
    public void igOn() {
    }

    @Override // defpackage.arb
    public void initPlayer() {
    }

    @Override // defpackage.arb
    public void onMusicBinded() {
    }

    @Override // defpackage.arb
    public void initNow() {
        bdd.c();
        aex.a().a(new bcs());
    }

    @Override // defpackage.arb
    public void initDelay() {
        if (apx.a().d()) {
            bdd.c().a(-1);
        }
    }

    @Override // defpackage.arb
    public void registerService() {
        com.xiaopeng.musicradio.service.c.a().a(bcu.class, "com.xiaopeng.musicradio.service.VipService");
        com.xiaopeng.musicradio.service.c.a().a(bct.class, "com.xiaopeng.musicradio.service.QqVipService");
        com.xiaopeng.musicradio.service.c.a().a(bcv.class, "com.xiaopeng.musicradio.service.XmlyVipService");
    }
}
