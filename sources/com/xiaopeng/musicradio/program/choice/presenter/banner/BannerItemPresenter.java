package com.xiaopeng.musicradio.program.choice.presenter.banner;

import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsCardBean;
import com.xiaopeng.musicradio.program.choice.view.banner.b;
import com.xiaopeng.musicradio.program.common.presenter.BaseProgramPresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.ago;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class BannerItemPresenter extends BaseProgramPresenter<b> {
    private TodayNewsCardBean.DataBean.ListBean b;
    private int c;

    public void a(TodayNewsCardBean.DataBean.ListBean listBean) {
        this.b = listBean;
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        TodayNewsCardBean.DataBean.ListBean listBean = this.b;
        if (listBean != null && e(listBean.getCardId())) {
            if (a() != null) {
                a().a(2);
            }
        } else if (a() != null) {
            a().a(3);
        }
        if (a() != null) {
            a().i();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChanged(age.l lVar) {
        if (lVar.b() != 3 || a() == null) {
            return;
        }
        if (e(this.b.getCardId())) {
            a().a(lVar.a());
        } else {
            a().a(3);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAudioTypeChangeEvent(agg.g gVar) {
        if (gVar.a() == 3 || a() == null) {
            return;
        }
        a().a(3);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onPagerSelectedEvent(ago.b bVar) {
        u.d(bVar);
        if (this.c == bVar.a()) {
            if (a() != null) {
                a().g();
            }
        } else if (a() != null) {
            a().h();
        }
    }

    public void c() {
        if (e(this.b.getCardId())) {
            axn.i().pause();
            return;
        }
        a(this.b.getTrackInfoBos(), this.b);
        axt.a();
        axe.c().a(true, true);
    }

    public void a(int i) {
        this.c = i;
    }
}
