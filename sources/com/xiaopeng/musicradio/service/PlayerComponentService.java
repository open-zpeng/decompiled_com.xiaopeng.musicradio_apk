package com.xiaopeng.musicradio.service;

import android.util.Log;
import com.xiaopeng.musicradio.playercomponent.small.SmallPlayerService;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agn;
/* loaded from: classes2.dex */
public class PlayerComponentService extends a implements avq {
    private static final String TAG = "PlayerComponentService";

    @Override // com.xiaopeng.musicradio.service.a
    protected void a() {
    }

    public void showSmallPlayer() {
        SmallPlayerService.b();
    }

    public void hideSmallPlayer() {
        Log.i(TAG, "hideSmallPlayer: ==========");
        avx.a(false);
        u.c(new agn.a(false));
    }
}
