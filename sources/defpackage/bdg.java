package defpackage;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.adapter.Call;
import com.xiaopeng.musicradio.bean.UserAccountBean;
import com.xiaopeng.musicradio.bean.VipSaleResult;
import com.xiaopeng.musicradio.bean.VipSaleResultV2;
import com.xiaopeng.musicradio.bean.VipUrlResult;
import com.xiaopeng.musicradio.bean.XmlyAccountBean;
/* compiled from: VipHttpModel.java */
/* renamed from: bdg  reason: default package */
/* loaded from: classes2.dex */
public class bdg {

    /* compiled from: VipHttpModel.java */
    /* renamed from: bdg$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final bdg a = new bdg();
    }

    public static bdg a() {
        return a.a;
    }

    public Call<UserAccountBean> a(avc<UserAccountBean> avcVar) {
        return auu.a("https://xmart.xiaopeng.com/media/v3/music/user/accountInfo").a(new ava(avcVar));
    }

    public Call<XmlyAccountBean> b(avc<XmlyAccountBean> avcVar) {
        return auu.a("https://xmart.xiaopeng.com/media/v3/reading/user/userInfo").a(new ava(avcVar));
    }

    public Call<VipSaleResult> c(avc<VipSaleResult> avcVar) {
        OkGo.getInstance().cancelTag("getVipSaleBanner");
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/common/bannerList").tag("getVipSaleBanner")).a(new ava(avcVar));
    }

    public Call<VipSaleResultV2> d(avc<VipSaleResultV2> avcVar) {
        OkGo.getInstance().cancelTag("getVipSaleBannerV2");
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/common/bannerListV2").tag("getVipSaleBannerV2")).a(new ava(avcVar));
    }

    public Call<VipUrlResult> e(avc<VipUrlResult> avcVar) {
        OkGo.getInstance().cancelTag("getVipUrlList");
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/common/vipUrlList").tag("getVipUrlList")).a(new ava(avcVar));
    }
}
