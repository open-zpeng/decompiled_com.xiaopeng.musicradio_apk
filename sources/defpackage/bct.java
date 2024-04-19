package defpackage;

import com.xiaopeng.musicradio.bean.VipDetail;
import java.util.List;
/* compiled from: IQqVipService.java */
/* renamed from: bct  reason: default package */
/* loaded from: classes2.dex */
public interface bct {
    void fetchUserInfo();

    String getNickName();

    String getUserLogo();

    List<VipDetail> getVipDetial();

    String getVipEndTime();

    boolean isGreenVip();

    boolean isVip();

    void loadUserInfo();
}
