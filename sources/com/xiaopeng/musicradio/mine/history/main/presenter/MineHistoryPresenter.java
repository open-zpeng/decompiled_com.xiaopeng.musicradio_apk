package com.xiaopeng.musicradio.mine.history.main.presenter;

import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.mine.common.presenter.MineBasePresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.amh;
/* loaded from: classes.dex */
public class MineHistoryPresenter extends MineBasePresenter<akt> implements amh.a {
    private amh b = aks.a();

    public MineHistoryPresenter() {
        akr.a();
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        akr.a().b();
        super.onCreate(iVar);
        u.a(this);
        aks.a().a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        LogUtils.i("MineHistoryPresenter", "onDestroy");
        u.b(this);
        aks.a().a((amh.a) null);
    }

    @Override // defpackage.amh.a
    public void a(int i) {
        LogUtils.i("MineHistoryPresenter", "onStateChecked:state=" + i);
        if (a() == null) {
            return;
        }
        a().c_(i);
    }
}
