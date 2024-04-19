package com.xiaopeng.musicradio.program.choice.view.banner;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.reading.BannelHistoryInfo;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsCardBean;
import com.xiaopeng.musicradio.program.choice.presenter.banner.ChoiceBannerPresenter;
import com.xiaopeng.musicradio.proto.Netprogram;
import com.xiaopeng.musicradio.utils.be;
import java.util.List;
import org.json.JSONObject;
/* compiled from: BannerItemLayoutViewProxy.java */
/* loaded from: classes2.dex */
public class a extends aeu<c, ChoiceBannerPresenter> implements c {
    @Override // com.xiaopeng.musicradio.program.choice.view.banner.c
    public void a(int i) {
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.c
    public void h() {
    }

    public a(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public ChoiceBannerPresenter g() {
        return new ChoiceBannerPresenter();
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.c
    public void a(List<TodayNewsCardBean.DataBean.ListBean> list, boolean z) {
        a(list, 0);
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.c
    public void a(String str, String str2, String str3, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("title", str);
            jSONObject.put("percent", str2);
            jSONObject.put("logo", str3);
            jSONObject.put("isPlaying", z);
            BannelHistoryInfo bannelHistoryInfo = new BannelHistoryInfo();
            bannelHistoryInfo.setTitle(str);
            bannelHistoryInfo.setPercent(str2);
            bannelHistoryInfo.setLogo(str3);
            a(bannelHistoryInfo, 0);
        } catch (Exception unused) {
            ag_();
            a((BannelHistoryInfo) null, 2);
        }
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        Log.i("BannerItemLayoutViewProxy_", "monoMessage" + str + "value--" + bArr);
        super.a(str, bArr);
        if ("requestBannerList".equalsIgnoreCase(str)) {
            axe.c().a(true, true);
        } else if ("requestHistoryList".equalsIgnoreCase(str)) {
            ((ChoiceBannerPresenter) this.c).b(3);
        } else if ("playHeadSpeech".equalsIgnoreCase(str)) {
            try {
                if (((ChoiceBannerPresenter) this.c).d(Netprogram.BannerDataBean.parseFrom(bArr).getChannelId())) {
                    axn.i().pause();
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("BannerItemLayoutViewProxy_", "playHeadSpeech: " + e.getMessage());
            }
        } else if ("readBannerClick".equalsIgnoreCase(str)) {
            try {
                if (((ChoiceBannerPresenter) this.c).d(Netprogram.BannerDataBean.parseFrom(bArr).getChannelId())) {
                    Log.d("BannerItemLayoutViewProxy_", " readBannerClick monoMessage isPalying: ");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                Log.e("BannerItemLayoutViewProxy_", "bannerClick: " + e2.getMessage());
            }
        } else if ("playControlHistory".equalsIgnoreCase(str)) {
            ((ChoiceBannerPresenter) this.c).d();
        }
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.c
    public void ag_() {
        a((BannelHistoryInfo) null, 2);
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.c
    public void setLoadingState(int i) {
        b(i);
        if (i == 2) {
            a((List<TodayNewsCardBean.DataBean.ListBean>) null, 1);
        } else if (i == 3) {
            a((List<TodayNewsCardBean.DataBean.ListBean>) null, 2);
        }
    }

    private void b(int i) {
        Log.i("BannerItemLayoutViewProxy_", "ShowLoadingTip" + i);
    }

    private void a(List<TodayNewsCardBean.DataBean.ListBean> list, int i) {
        Log.i("BannerItemLayoutViewProxy_", "msgId:BannerItemLayoutViewProxy_program_banner_datalist--" + list);
        Netprogram.BannerDataBeanList.a a = Netprogram.BannerDataBeanList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (TodayNewsCardBean.DataBean.ListBean listBean : list) {
                Netprogram.BannerDataBean.a b = Netprogram.BannerDataBean.newBuilder().a(listBean.getCardId()).a(be.e(listBean.getImage1().getCoverUrl())).a(Netprogram.BackgroundColor.newBuilder().a(listBean.getImage1().getStartColorDaytime()).build()).b("0").b(listBean.getTotal());
                List<TodayNewsCardBean.DataBean.ListBean.TrackInfoBosBean> trackInfoBos = listBean.getTrackInfoBos();
                if (trackInfoBos != null && trackInfoBos.size() > 0) {
                    for (TodayNewsCardBean.DataBean.ListBean.TrackInfoBosBean trackInfoBosBean : trackInfoBos) {
                        b.a(Netprogram.TrackInfoBo.newBuilder().a(trackInfoBosBean.getTitle()).build());
                    }
                }
                a.a(b.build());
            }
        }
        a("BannerItemLayoutViewProxy_program_banner_datalist", (AbstractMessageLite) a.build());
    }

    private void a(BannelHistoryInfo bannelHistoryInfo, int i) {
        Log.i("BannerItemLayoutViewProxy_", "msgId:BannerItemLayoutViewProxy_program_banner_history--" + bannelHistoryInfo);
        if (bannelHistoryInfo != null) {
            a("BannerItemLayoutViewProxy_program_banner_history", (AbstractMessageLite) Netprogram.BannelHistoryInfo.newBuilder().c(be.e(bannelHistoryInfo.getLogo())).b(be.e(bannelHistoryInfo.getPercent())).a(be.e(bannelHistoryInfo.getTitle())).build());
        } else {
            a("BannerItemLayoutViewProxy_program_banner_history", (AbstractMessageLite) null);
        }
    }
}
