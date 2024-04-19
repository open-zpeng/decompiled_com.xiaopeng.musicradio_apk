package com.xiaopeng.musicradio.service;

import android.app.Dialog;
import android.content.Context;
import com.xiaopeng.musicradio.bean.VipDetail;
import java.util.List;
/* loaded from: classes2.dex */
public class QqVipService extends a implements bct {
    @Override // com.xiaopeng.musicradio.service.a
    protected void a() {
    }

    @Override // defpackage.bct
    public String getNickName() {
        return bdd.c().f();
    }

    @Override // defpackage.bct
    public String getUserLogo() {
        return bdd.c().g();
    }

    @Override // defpackage.bct
    public boolean isVip() {
        return bdd.c().e();
    }

    @Override // defpackage.bct
    public String getVipEndTime() {
        return bdd.c().h();
    }

    @Override // defpackage.bct
    public boolean isGreenVip() {
        return bdd.c().j();
    }

    @Override // defpackage.bct
    public void loadUserInfo() {
        bdd.c().k();
    }

    @Override // defpackage.bct
    public void fetchUserInfo() {
        bdd.c().a(0);
    }

    public Dialog createVipBuyingDlg(Context context) {
        return new bcx().a(context);
    }

    @Override // defpackage.bct
    public List<VipDetail> getVipDetial() {
        return bdd.c().i();
    }
}
