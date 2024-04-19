package com.xiaopeng.musicradio.webview.presenter;

import android.text.TextUtils;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.VipUrlInfo;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.webview.view.a;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class VipBuyPresenter extends BasePresenter<a> {
    private int b;

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    public void a(int i) {
        if (a() != null) {
            a().e();
        }
        this.b = i;
        bcu bcuVar = (bcu) c.a().b(bcu.class);
        if (bcuVar != null) {
            VipUrlInfo vipUrlInfo = null;
            switch (i) {
                case 0:
                    vipUrlInfo = bcuVar.getQqBuyUrl();
                    break;
                case 1:
                    vipUrlInfo = bcuVar.getNeteaseBuyUrl();
                    break;
                case 2:
                    vipUrlInfo = bcuVar.getReadingBuyUrl();
                    break;
            }
            if (vipUrlInfo != null && !TextUtils.isEmpty(vipUrlInfo.getUrl())) {
                if (a() != null) {
                    a().a(vipUrlInfo.getUrl(), vipUrlInfo.getUrlNight());
                    return;
                }
                return;
            }
            bcuVar.vipUrlList();
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        u.b(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onVipBuyUrlEvent(agg.aj ajVar) {
        LogUtils.i("VipBuyViewPresenter", "onVipBuyUrlEvent");
        if (ajVar.a()) {
            a(this.b);
        } else if (a() != null) {
            a().a("");
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUserBuyUrlEvent(agg.af afVar) {
        LogUtils.i("VipBuyViewPresenter", "onUserBuyUrlEvent");
        if (afVar.a() == null) {
            if (a() != null) {
                a().a("");
            }
        } else if (a() != null) {
            a().a(afVar.a());
        }
    }
}
