package com.xiaopeng.musicradio.search.result.mix.presenter;

import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.search.common.presenter.BaseSearchPresenter;
import com.xiaopeng.musicradio.search.result.mix.view.a;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.agh;
import defpackage.agp;
import defpackage.agq;
import defpackage.ayg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class SearchResultMixPresenter extends BaseSearchPresenter<a> {
    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
        u.c(new agh.d(false));
        if (a() != null) {
            if (!a().u() || ayi.a().b(0)) {
                e();
                ayi.a().a(0);
            } else {
                a().as_();
                u.c(new agh.d(true));
            }
        } else {
            e();
        }
        azw.a();
    }

    public void e() {
        if (a() != null) {
            a().v();
            a().a(true, 0, 0);
        }
        ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.mix.presenter.SearchResultMixPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                SearchResultMixPresenter.this.a(ayi.a().c(), 0, 1, 50, new avc<MixSearchResultBean>() { // from class: com.xiaopeng.musicradio.search.result.mix.presenter.SearchResultMixPresenter.1.1
                    @Override // defpackage.avc
                    public void a(MixSearchResultBean mixSearchResultBean) {
                        if (mixSearchResultBean == null || mixSearchResultBean.getData() == null) {
                            return;
                        }
                        if (SearchResultMixPresenter.this.a() != null) {
                            SearchResultMixPresenter.this.a().a(false, 0, 0);
                            SearchResultMixPresenter.this.a().a(mixSearchResultBean.getData(), 1, 1);
                        }
                        u.c(new agh.d(true));
                    }

                    @Override // defpackage.avc
                    public void a(int i, String str) {
                        if (SearchResultMixPresenter.this.a() != null) {
                            SearchResultMixPresenter.this.a().a(str, 1);
                        }
                        if (i == 5020005) {
                            u.c(new agp.a());
                            apx.a().a(null);
                            return;
                        }
                        u.c(new agh.d(true));
                    }
                });
            }
        }, 900L);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechShow(agg.y yVar) {
        if (a() != null) {
            a().as_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNewSearchKeyword(ayg.a aVar) {
        if (a() != null) {
            a().a(true, 1, 0);
        }
        e();
        ayi.a().a(0);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealPlayState(age.l lVar) {
        if (a() != null) {
            a().as_();
        }
        if (lVar.a() == 2 || lVar.a() == 3) {
            u.c(new agh.d(true));
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealLoveState(agq.l lVar) {
        if (a() != null) {
            a().a(lVar);
            a().as_();
        }
        u.c(new agh.d(true));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        if (a() != null) {
            a().as_();
        }
        u.c(new agh.d(false));
    }
}
