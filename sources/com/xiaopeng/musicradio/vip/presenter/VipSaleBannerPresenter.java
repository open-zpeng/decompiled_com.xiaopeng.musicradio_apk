package com.xiaopeng.musicradio.vip.presenter;

import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.vip.view.a;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class VipSaleBannerPresenter extends BasePresenter<a> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void vipSaleEven(agg.al alVar) {
        LogUtils.i("sunny123", "vipSaleEven: ");
        if (a() != null) {
            a().aA_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void vipSaleEvenV2(agg.am amVar) {
        LogUtils.i("sunny123", "vipSaleEven: ");
        if (a() != null) {
            a().aA_();
        }
    }
}
