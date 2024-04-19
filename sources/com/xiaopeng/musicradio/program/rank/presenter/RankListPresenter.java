package com.xiaopeng.musicradio.program.rank.presenter;

import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.ReadingHotRankListBean;
import com.xiaopeng.musicradio.program.common.presenter.BaseProgramListPresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class RankListPresenter extends BaseProgramListPresenter<axq> {
    private int d;

    public RankListPresenter() {
    }

    public RankListPresenter(int i) {
        this.d = i;
    }

    @Override // com.xiaopeng.musicradio.program.common.presenter.BaseProgramPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        c();
        u.a(this);
    }

    public void c() {
        a(1);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChanged(age.l lVar) {
        ProgramBean r;
        if (lVar.b() != 3 || a() == 0 || (r = axn.i().r()) == null) {
            return;
        }
        ((axq) a()).a_(r.getAlbumId());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChange(agg.y yVar) {
        if (a() != 0) {
            ((axq) a()).a_(0L);
        }
    }

    @Override // com.xiaopeng.musicradio.program.common.presenter.BaseProgramListPresenter
    protected void a(final int i) {
        if (this.d == 0) {
            return;
        }
        if (a() != 0) {
            ((axq) a()).a(true, i, this.c);
        }
        axp.a().a(this.d, i, 20, new avc<ReadingHotRankListBean>() { // from class: com.xiaopeng.musicradio.program.rank.presenter.RankListPresenter.1
            @Override // defpackage.avc
            public void a(ReadingHotRankListBean readingHotRankListBean) {
                RankListPresenter.this.c = readingHotRankListBean.getData().getPage().getTotalPage();
                RankListPresenter.this.b = readingHotRankListBean.getData().getPage().getPage();
                if (RankListPresenter.this.a() != 0) {
                    ((axq) RankListPresenter.this.a()).a(readingHotRankListBean.getData().getList(), RankListPresenter.this.b, readingHotRankListBean.isFromCache());
                }
                if (RankListPresenter.this.a() != 0) {
                    ((axq) RankListPresenter.this.a()).a(false, RankListPresenter.this.b, RankListPresenter.this.c);
                    if (RankListPresenter.this.c == 0) {
                        ((axq) RankListPresenter.this.a()).X_();
                    }
                }
            }

            @Override // defpackage.avc
            public void a(int i2, String str) {
                if (RankListPresenter.this.a() != 0) {
                    ((axq) RankListPresenter.this.a()).a(false, i, RankListPresenter.this.c);
                    ((axq) RankListPresenter.this.a()).a(str, i);
                }
            }
        });
    }

    public void b(int i) {
        this.d = i;
    }
}
