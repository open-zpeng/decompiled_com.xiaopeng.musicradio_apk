package com.xiaopeng.musicradio.netradio.player.presenter;

import android.util.Log;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.netradio.player.view.c;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import defpackage.age;
import defpackage.agg;
import defpackage.aud;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: NetRadioSmallPlayerSubViewPresenter.java */
/* loaded from: classes2.dex */
public class a extends e<c> {
    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void f_() {
        super.f_();
        u.a(this);
        Q_();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void g_() {
        super.g_();
        u.b(this);
    }

    public void f() {
        NetRadioProgramInfo d = aps.i().d();
        Log.i("NetRadioSmallPlayerSubV", "clickLove: =========");
        if (d == null || d.getParentInfo() == null) {
            return;
        }
        Log.i("NetRadioSmallPlayerSubV", "clickLove: ==========name = " + d.getName() + " id = " + d.getId());
        ane.a().a(d.getParentInfo());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealReadLove(agg.k kVar) {
        Log.i("NetRadioSmallPlayerSubV", "dealLoveEvent..");
        NetRadioProgramInfo d = aps.i().d();
        if (d == null || d.getParentInfo() == null || j() == null) {
            return;
        }
        j().updateLove(apt.a().a(d.getParentInfo()));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealDownloadNetRadioCollect(aud.b bVar) {
        Log.i("NetRadioSmallPlayerSubV", "dealDownloadNetRadioCollect..");
        NetRadioProgramInfo d = aps.i().d();
        if (d == null || d.getParentInfo() == null || j() == null) {
            return;
        }
        j().updateLove(apt.a().a(d.getParentInfo()));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealClearNetRadioCollect(aud.a aVar) {
        Log.i("NetRadioSmallPlayerSubV", "dealClearNetRadioCollect..");
        NetRadioProgramInfo d = aps.i().d();
        if (d == null || d.getParentInfo() == null || j() == null) {
            return;
        }
        j().updateLove(apt.a().a(d.getParentInfo()));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAudioInfo(age.c cVar) {
        Q_();
    }

    public void Q_() {
        aek e = aei.a().e();
        if (e == null || e.d() == null) {
            return;
        }
        h();
    }

    private void h() {
        NetRadioProgramInfo d = aps.i().d();
        if (d == null || d.getParentInfo() == null || j() == null) {
            return;
        }
        j().updateLove(apt.a().a(d.getParentInfo()));
    }
}
