package com.xiaopeng.musicradio.music.player.presenter;

import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.music.player.view.d;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agd;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class BtNoConnectPresenter extends BasePresenter<d> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    public void c() {
        if (com.xiaopeng.musicradio.model.bluetooth.a.i().n()) {
            com.xiaopeng.musicradio.model.bluetooth.a.i().r();
            com.xiaopeng.musicradio.model.bluetooth.a.i().play();
            return;
        }
        bcp.a();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMediaCenterBtStatusChanged(agd.e eVar) {
        if (a() != null) {
            a().a(eVar.a());
        }
    }
}
