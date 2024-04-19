package com.xiaopeng.musicradio.service;

import android.app.Dialog;
import android.content.Context;
import com.xiaopeng.musicradio.bean.VipSaleInfo;
import com.xiaopeng.musicradio.bean.VipSaleInfoV2;
import com.xiaopeng.musicradio.bean.VipUrlInfo;
import java.util.List;
/* loaded from: classes2.dex */
public class VipService extends a implements bcu {
    @Override // com.xiaopeng.musicradio.service.a
    protected void a() {
    }

    public void clearVipStatus() {
    }

    public Dialog createVipBuyingDlg(Context context) {
        return null;
    }

    public int getSongMaxCollectCount() {
        return 10000;
    }

    public long getXpVipValidity() {
        return 0L;
    }

    public void initAdapterPreLoader(Context context) {
    }

    @Override // defpackage.bcu
    public void onReceiveMqttMsg(String str) {
    }

    public String getNickName() {
        return bdd.c().f();
    }

    public String getUserLogo() {
        return bdd.c().g();
    }

    @Override // defpackage.bcu
    public boolean isMusicVip() {
        return bdd.c().e();
    }

    @Override // defpackage.bcu
    public boolean isXpVip() {
        return bdd.c().e();
    }

    @Override // defpackage.bcu
    public int getSongQuality() {
        return bdc.a().b();
    }

    @Override // defpackage.bcu
    public void sycUserInfoWithServer() {
        bdd.c().a(-1);
    }

    @Override // defpackage.bcu
    public void setSongQuality(int i) {
        bdc.a().a(i);
    }

    @Override // defpackage.bcu
    public void clearUserData() {
        bdd.c().d();
    }

    @Override // defpackage.bcu
    public VipUrlInfo getQqBuyUrl() {
        return bde.a().i();
    }

    @Override // defpackage.bcu
    public VipUrlInfo getNeteaseBuyUrl() {
        return bde.a().j();
    }

    @Override // defpackage.bcu
    public VipUrlInfo getReadingBuyUrl() {
        return bde.a().k();
    }

    @Override // defpackage.bcu
    public void vipUrlList() {
        bde.a().c();
    }

    public void userBuyUrl() {
        bde.a().d();
    }

    @Override // defpackage.bcu
    public List<VipSaleInfo> getQqInfos() {
        return bde.a().e();
    }

    @Override // defpackage.bcu
    public List<VipSaleInfo> getReadingInfos() {
        return bde.a().f();
    }

    @Override // defpackage.bcu
    public List<VipSaleInfo> getUserInfos() {
        return bde.a().g();
    }

    @Override // defpackage.bcu
    public List<VipSaleInfo> getRadioInfos() {
        return bde.a().h();
    }

    @Override // defpackage.bcu
    public void loadSaleData() {
        bde.a().b();
    }

    public void loadSaleDataV2() {
        bdf.a().b();
    }

    public List<VipSaleInfoV2> getQqUserMain() {
        return bdf.a().c();
    }

    public List<VipSaleInfoV2> getNeteaseMain() {
        return bdf.a().d();
    }

    public List<VipSaleInfoV2> getKugouUserMan() {
        return bdf.a().e();
    }

    public List<VipSaleInfoV2> getNeteaseUserMain() {
        return bdf.a().f();
    }

    public List<VipSaleInfoV2> getKugouMain() {
        return bdf.a().g();
    }

    public List<VipSaleInfoV2> getReadingUserMain() {
        return bdf.a().h();
    }

    public List<VipSaleInfoV2> getQqMain() {
        return bdf.a().i();
    }

    public List<VipSaleInfoV2> getReadingMain() {
        return bdf.a().j();
    }

    public List<VipSaleInfoV2> getRadioMain() {
        return bdf.a().k();
    }

    public List<VipSaleInfoV2> getRadioUserMain() {
        return bdf.a().l();
    }
}
