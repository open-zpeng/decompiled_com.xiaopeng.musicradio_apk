package com.xiaopeng.musicradio.program.choice.presenter.guesslike;

import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.GuessLikeListBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.choice.view.guesslike.e;
import com.xiaopeng.musicradio.program.common.presenter.BaseProgramListPresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class GuessLikeListPresenter extends BaseProgramListPresenter<e> {
    @Override // com.xiaopeng.musicradio.program.common.presenter.BaseProgramPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        c();
        u.a(this);
    }

    public void c() {
        a(1);
    }

    @Override // com.xiaopeng.musicradio.program.common.presenter.BaseProgramListPresenter
    protected void a(final int i) {
        if (a() != 0) {
            ((e) a()).a(true, i, this.c);
        }
        List<RdAlbumBean> g = axe.c().g();
        if (g != null && g.size() > 0) {
            this.b = 1;
            this.c = 1;
            if (a() != 0) {
                ((e) a()).a(g, this.b, false);
                ((e) a()).a(false, i, this.c);
                return;
            }
            return;
        }
        axp.a().a(i, new avc<GuessLikeListBean>() { // from class: com.xiaopeng.musicradio.program.choice.presenter.guesslike.GuessLikeListPresenter.1
            @Override // defpackage.avc
            public void a(GuessLikeListBean guessLikeListBean) {
                GuessLikeListPresenter.this.b = guessLikeListBean.getData().getPageBean().getPage();
                GuessLikeListPresenter.this.c = guessLikeListBean.getData().getPageBean().getTotalPage();
                if (GuessLikeListPresenter.this.a() != 0) {
                    ((e) GuessLikeListPresenter.this.a()).a(guessLikeListBean.getData().getList(), GuessLikeListPresenter.this.b, guessLikeListBean.isFromCache());
                }
                if (GuessLikeListPresenter.this.a() != 0) {
                    ((e) GuessLikeListPresenter.this.a()).a(false, i, GuessLikeListPresenter.this.c);
                    if (GuessLikeListPresenter.this.c == 0) {
                        ((e) GuessLikeListPresenter.this.a()).X_();
                    }
                }
            }

            @Override // defpackage.avc
            public void a(int i2, String str) {
                if (GuessLikeListPresenter.this.a() != 0) {
                    ((e) GuessLikeListPresenter.this.a()).a(false, i, GuessLikeListPresenter.this.c);
                    ((e) GuessLikeListPresenter.this.a()).a(str, i);
                }
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChanged(age.l lVar) {
        ProgramBean r;
        if (lVar.b() != 3 || a() == 0 || (r = axn.i().r()) == null) {
            return;
        }
        ((e) a()).a_(r.getAlbumId());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChanged(agg.y yVar) {
        if (a() != 0) {
            ((e) a()).a_(0L);
        }
    }
}
