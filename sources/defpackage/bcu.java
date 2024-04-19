package defpackage;

import com.xiaopeng.musicradio.bean.VipSaleInfo;
import com.xiaopeng.musicradio.bean.VipUrlInfo;
import java.util.List;
/* compiled from: IVipService.java */
/* renamed from: bcu  reason: default package */
/* loaded from: classes2.dex */
public interface bcu {
    void clearUserData();

    VipUrlInfo getNeteaseBuyUrl();

    VipUrlInfo getQqBuyUrl();

    List<VipSaleInfo> getQqInfos();

    List<VipSaleInfo> getRadioInfos();

    VipUrlInfo getReadingBuyUrl();

    List<VipSaleInfo> getReadingInfos();

    int getSongQuality();

    List<VipSaleInfo> getUserInfos();

    boolean isMusicVip();

    boolean isXpVip();

    void loadSaleData();

    void onReceiveMqttMsg(String str);

    void setSongQuality(int i);

    void sycUserInfoWithServer();

    void vipUrlList();
}
