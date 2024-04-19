package com.xiaopeng.musicradio;

import android.util.Log;
import com.xiaopeng.musicradio.player.o;
import com.xiaopeng.musicradio.utils.w;
/* loaded from: classes.dex */
public class MusicAppInit extends arb {
    private static final String TAG = "MusicAppInit";

    @Override // defpackage.arb
    public void igOff() {
    }

    @Override // defpackage.arb
    public void igOn() {
    }

    @Override // defpackage.arb
    public void initDelay() {
    }

    @Override // defpackage.arb
    public void onMusicBinded() {
    }

    @Override // defpackage.arb
    public void registerService() {
    }

    @Override // defpackage.arb
    public void initNow() {
        Log.i(TAG, "initNow: ===== ");
        if (w.i()) {
            aex.a().a(new com.xiaopeng.musicradio.proxy.c());
            aex.a().a(new agv());
            aex.a().a(new o());
            aex.a().a(new avr());
            aex.a().a("MusicCommonProxy", true, true);
        }
    }
}
