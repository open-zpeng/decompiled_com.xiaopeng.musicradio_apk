package com.xiaopeng.musicradio;
/* loaded from: classes.dex */
public class MineInit extends arb {
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
        afr.a();
        aex.a().a(new ahs());
        aex.a().a("MineEventViewProxy", true, true);
    }

    @Override // defpackage.arb
    public void initDelay() {
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.MineInit.1
            @Override // java.lang.Runnable
            public void run() {
                afr.a().b();
            }
        });
    }

    @Override // defpackage.arb
    public void registerService() {
        com.xiaopeng.musicradio.service.c.a().a(ahu.class, "com.xiaopeng.musicradio.service.MineService");
    }
}
