package com.xiaopeng.musicradio.playercomponent.big.presenter;

import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.playercomponent.big.view.a;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.amx;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class MediaLogoBlurPresener extends BasePresenter<a> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
        c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRefreshLogo(agg.w wVar) {
        if (wVar.a() == aei.a().c()) {
            c();
        }
    }

    public void c() {
        amx.a d = amx.a().d();
        if (d == null || a() == null) {
            return;
        }
        a().a(d.c(), d.d());
    }
}
