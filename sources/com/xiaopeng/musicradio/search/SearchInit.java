package com.xiaopeng.musicradio.search;

import android.util.Log;
import com.xiaopeng.musicradio.utils.w;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class SearchInit extends arb {
    private static final String TAG = "SearchInit";

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
        if (w.i()) {
            aex.a().a(new b());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDialogShow(agg.x xVar) {
        Log.i(TAG, "onDialogShow===========");
        if (xVar.a != null) {
            azx.a(com.xiaopeng.musicradio.a.a, xVar.a);
        }
    }
}
