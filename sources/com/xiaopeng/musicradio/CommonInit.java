package com.xiaopeng.musicradio;

import com.xiaopeng.musicradio.bean.player.PlayerReport;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.w;
import defpackage.agq;
/* loaded from: classes.dex */
public class CommonInit extends arb {
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
    public void registerService() {
    }

    @Override // defpackage.arb
    public void initNow() {
        PlayerReport.initReport();
        com.xiaopeng.musicradio.model.car.a.a();
        amp.a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (w.f() == 2) {
            aqf.a();
        }
        apx.a();
    }

    private void b() {
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.CommonInit.1
            @Override // java.lang.Runnable
            public void run() {
                CommonInit.this.a();
                if (w.f() != 2) {
                    aqk.a();
                    aqi.a().h();
                    aqi.a().d();
                    aqi.a().i();
                } else {
                    aqf.a().d();
                    bcv bcvVar = (bcv) com.xiaopeng.musicradio.service.c.a().b(bcv.class);
                    if (bcvVar != null) {
                        bcvVar.loadUserInfo();
                    }
                }
                apx.a().f();
                bct bctVar = (bct) com.xiaopeng.musicradio.service.c.a().b(bct.class);
                if (bctVar != null) {
                    bctVar.loadUserInfo();
                }
                u.c(new agq.d());
            }
        });
    }

    @Override // defpackage.arb
    public void initDelay() {
        com.xiaopeng.musicradio.model.car.c.a().b();
    }
}
