package com.xiaopeng.musicradio.mine.collect.main.presenter;

import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.mine.common.presenter.MineBasePresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.amh;
/* loaded from: classes.dex */
public class MineCollectPresenter extends MineBasePresenter<aib> implements amh.a {
    public MineCollectPresenter() {
        aia.a();
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        aia.a().b();
        super.onCreate(iVar);
        u.a(this);
        ahz.a().a(this);
        aml.e(2);
        aml.f();
        amn.e();
        amm.d();
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        LogUtils.i("MineCollectPresenter", "onDestroy");
        u.b(this);
        ahz.a().a((amh.a) null);
    }

    @Override // defpackage.amh.a
    public void a(int i) {
        LogUtils.i("MineCollectPresenter", "onStateChecked:state=" + i);
        if (a() == null) {
            return;
        }
        a().b_(i);
    }
}
