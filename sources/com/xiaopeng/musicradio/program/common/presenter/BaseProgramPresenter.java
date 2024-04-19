package com.xiaopeng.musicradio.program.common.presenter;

import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsCardBean;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.at;
import com.xiaopeng.musicradio.utils.u;
import defpackage.axm;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class BaseProgramPresenter<UIInterface> extends BasePresenter<UIInterface> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    private boolean c() {
        if (aei.a().c() == 3) {
            return axn.i().getPlayState() == 2 || axn.i().getPlayState() == 1;
        }
        return false;
    }

    public boolean b(long j) {
        ProgramBean r = axn.i().r();
        if (r == null) {
            return false;
        }
        return r.getOriginalAlbumId() > 0 ? c() && r.getOriginalAlbumId() == j : r.getAlbumId() == j && c();
    }

    public boolean d(int i) {
        return ad.a(axn.i().s(), (long) i) && c();
    }

    public boolean e(int i) {
        return ad.b(axn.i().s(), (long) i) && c();
    }

    public void g() {
        sp.a().a("/player/player").navigation();
    }

    public void b(RdAlbumBean rdAlbumBean) {
        if (b(rdAlbumBean.getId())) {
            axn.i().pause();
        } else {
            axn.i().a(rdAlbumBean);
        }
    }

    public void a(List<TodayNewsCardBean.DataBean.ListBean.TrackInfoBosBean> list, TodayNewsCardBean.DataBean.ListBean listBean) {
        LogUtils.i("BaseProgramPresenter", "playHeadSpeech, cardId:" + listBean.getCardId());
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (TodayNewsCardBean.DataBean.ListBean.TrackInfoBosBean trackInfoBosBean : list) {
            arrayList.add(aq.a(trackInfoBosBean, listBean));
        }
        at.a(new axm.a().a(ad.b(listBean.getCardId()).toJson()).b(true).c(0).b(10).e(listBean.getCardId()).a(1).b("timeDesc").d(1).a());
    }
}
