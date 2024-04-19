package com.xiaopeng.musicradio;

import android.util.Log;
import com.xiaopeng.musicradio.player.m;
import com.xiaopeng.musicradio.playercomponent.small.SmallPlayerService;
import defpackage.afx;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class PlayerComponentInit extends arb {
    private static final String TAG = "PlayerComponentInit";

    @Override // defpackage.arb
    public void igOff() {
    }

    @Override // defpackage.arb
    public void igOn() {
    }

    @Override // defpackage.arb
    public void initNow() {
    }

    @Override // defpackage.arb
    public void onMusicBinded() {
    }

    @Override // defpackage.arb
    public void initDelay() {
        m.a().b();
    }

    @Override // defpackage.arb
    public void registerService() {
        com.xiaopeng.musicradio.service.c.a().a(avq.class, "com.xiaopeng.musicradio.service.PlayerComponentService");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onApplicationBack(afx.a aVar) {
        Log.i(TAG, "onApplicationBack: " + aVar.a() + " focus = " + SmallPlayerService.c());
        if (aVar.a() || !SmallPlayerService.c()) {
            return;
        }
        SmallPlayerService.a();
    }
}
