package com.xiaopeng.musicradio.netradio.player.presenter;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.netradio.player.view.b;
import com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerBasePresenter;
import com.xiaopeng.musicradio.utils.be;
import defpackage.agg;
import defpackage.aud;
import defpackage.beo;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class NetRadioPlayerPresenter extends PlayerBasePresenter<b> {
    @Override // com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerBasePresenter
    public void z_() {
        super.z_();
        if (a() != 0) {
            ((b) a()).d_(aps.i().m() == 1);
        }
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerBasePresenter
    protected void d() {
        NetRadioProgramInfo d = aps.i().d();
        if (d == null || d.getParentInfo() == null || a() == 0) {
            return;
        }
        ((b) a()).b(d.getParentInfo().getName(), a(d.getName()));
        ((b) a()).b(apt.a().a(d.getParentInfo()));
    }

    private String a(String str) {
        if (TextUtils.equals(str, com.xiaopeng.musicradio.a.a.getString(beo.e.netradio_play_live))) {
            str = be.a(beo.e.netradio_live_no_program);
        }
        return h() ? String.format("%s：%s", com.xiaopeng.musicradio.a.a.getString(beo.e.netradio_play_live), str) : String.format("%s：%s", com.xiaopeng.musicradio.a.a.getString(beo.e.netradio_play_back), str);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerBasePresenter
    protected void g() {
        if (a() != 0) {
            ((b) a()).F_();
        }
    }

    public void e() {
        NetRadioProgramInfo d = aps.i().d();
        Log.i("NetRadioPlayerPresenter", "clickLove: =========");
        if (d == null || d.getParentInfo() == null) {
            return;
        }
        Log.i("NetRadioPlayerPresenter", "clickLove: ==========name = " + d.getName() + " id = " + d.getId());
        ane.a().a(d.getParentInfo());
    }

    public void f() {
        Log.i("NetRadioPlayerPresenter", "playLive: ======");
        NetRadioProgramInfo d = aps.i().d();
        if (d == null || d.getParentInfo() == null || d.getParentInfo().getPlayingInfo() == null) {
            return;
        }
        Log.i("NetRadioPlayerPresenter", "clickLove: ==========name = " + d.getName() + " id = " + d.getId());
        aps.i().a(d.getParentInfo().getPlayingInfo());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealLoveEvent(agg.k kVar) {
        Log.i("NetRadioPlayerPresenter", "dealLoveEvent..");
        i();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetLoveEvent(aud.b bVar) {
        Log.i("NetRadioPlayerPresenter", "dealNetLoveEvent..");
        i();
    }

    private void i() {
        NetRadioProgramInfo d = aps.i().d();
        if (d == null || d.getParentInfo() == null || a() == 0) {
            return;
        }
        ((b) a()).b(apt.a().a(d.getParentInfo()));
    }

    public boolean h() {
        return aps.i().m() == 1;
    }
}
