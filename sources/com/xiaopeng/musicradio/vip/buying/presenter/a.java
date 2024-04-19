package com.xiaopeng.musicradio.vip.buying.presenter;

import android.util.Log;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.UserAccountInfo;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import defpackage.bdd;
/* compiled from: VipBuyingPresenter.java */
/* loaded from: classes2.dex */
public class a extends e<bcy> {
    private boolean b;

    public void h() {
        Log.i("VipBuyingPresenter", "getAccountInfo:" + this.b);
        if (this.b) {
            return;
        }
        if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a())) {
            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.vip.buying.presenter.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.j() != null) {
                        a.this.j().a();
                    }
                }
            });
            return;
        }
        Log.i("VipBuyingPresenter", "getAccountInfo:enter==");
        this.b = true;
        final String b = aqh.a().b();
        bdd.c().a(b, 0, new bdd.b() { // from class: com.xiaopeng.musicradio.vip.buying.presenter.a.2
            @Override // defpackage.bdd.b
            public void a(UserAccountInfo userAccountInfo) {
                a.this.b = false;
                Log.i("VipBuyingPresenter", "getAccountInfo.response:" + userAccountInfo);
                if (userAccountInfo != null) {
                    userAccountInfo.setOpenId(b);
                    if (a.this.j() != null) {
                        a.this.j().a(userAccountInfo.getNickName(), userAccountInfo.getBuyVipUrl());
                    }
                } else if (a.this.j() != null) {
                    a.this.j().a();
                }
            }

            @Override // defpackage.bdd.b
            public void a(int i, String str) {
                a.this.b = false;
                Log.i("VipBuyingPresenter", "getAccountInfo.error:" + i + ListSignBean.COLLECTID_SUFFIX + str);
                if (a.this.j() != null) {
                    a.this.j().a();
                }
            }
        });
    }
}
