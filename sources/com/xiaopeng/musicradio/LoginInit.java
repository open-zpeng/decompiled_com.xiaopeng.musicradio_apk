package com.xiaopeng.musicradio;

import defpackage.agq;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class LoginInit extends arb {
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
    public void registerService() {
    }

    @Override // defpackage.arb
    public void initNow() {
        aex.a().a(new agx());
    }

    @Override // defpackage.arb
    public void initDelay() {
        acz.a().a(a.a());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onShowMain(agq.t tVar) {
        if (com.xiaopeng.musicradio.utils.b.a(a.a)) {
            axu.a();
        }
    }
}
