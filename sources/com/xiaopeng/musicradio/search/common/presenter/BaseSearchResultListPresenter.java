package com.xiaopeng.musicradio.search.common.presenter;

import android.text.TextUtils;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.search.result.program.presenter.SearchResultProgramPresenter;
import com.xiaopeng.musicradio.search.result.song.presenter.SearchResultSongPresenter;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.speech.vui.utils.LogUtils;
import defpackage.age;
import defpackage.agg;
import defpackage.agh;
import defpackage.agp;
import defpackage.agq;
import defpackage.ayg;
import defpackage.azo;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public abstract class BaseSearchResultListPresenter<UIInterface extends azo> extends BaseSearchPresenter<UIInterface> {
    protected int b;
    protected int c;

    protected abstract void a(String str, int i);

    protected abstract int e();

    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.c(new agh.d(false));
        if (f()) {
            if (a() != 0) {
                ((azo) a()).a(true, 1, ayi.a().d());
            }
            ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter.1
                @Override // java.lang.Runnable
                public void run() {
                    BaseSearchResultListPresenter.this.a(ayi.a().e(), ayi.a().d());
                }
            }, 900L);
        } else if (a() != 0) {
            if (!((azo) a()).u() || ayi.a().b(e())) {
                c(1);
                ayi.a().a(e());
            } else {
                ((azo) a()).as_();
                u.c(new agh.d(true));
            }
        } else {
            c(1);
        }
        switch (e()) {
            case 1:
                azw.b();
                return;
            case 2:
                azw.c();
                return;
            case 3:
                azw.d();
                return;
            case 4:
            default:
                return;
            case 5:
                azw.e();
                return;
            case 6:
                azw.f();
                return;
        }
    }

    protected boolean f() {
        LogUtils.i("BaseSearchPresenter", "isInVoiceSearchMode getSearchType(): " + e() + ",,,," + ayi.a().f());
        return w.f() == 2 ? !TextUtils.isEmpty(ayi.a().e()) && ayi.a().f() == e() : TextUtils.isEmpty(ayi.a().h()) ? e() == 1 ? !TextUtils.isEmpty(ayi.a().e()) && ayi.a().f() == 1 : e() == 5 && !TextUtils.isEmpty(ayi.a().e()) && ayi.a().f() == 2 : !TextUtils.isEmpty(ayi.a().e()) && ayi.a().f() == e();
    }

    public void c(final int i) {
        if (i == 1 && a() != 0) {
            ((azo) a()).v();
            ((azo) a()).a(true, 1, 0);
        }
        u.c(new agh.d(false));
        ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter.2
            @Override // java.lang.Runnable
            public void run() {
                BaseSearchResultListPresenter.this.a(ayi.a().c(), BaseSearchResultListPresenter.this.e(), i, 50, new avc<MixSearchResultBean>() { // from class: com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter.2.1
                    @Override // defpackage.avc
                    public void a(MixSearchResultBean mixSearchResultBean) {
                        if (mixSearchResultBean == null || mixSearchResultBean.getData() == null) {
                            return;
                        }
                        if (BaseSearchResultListPresenter.this.a() != 0) {
                            ((azo) BaseSearchResultListPresenter.this.a()).a(false, i, mixSearchResultBean.getData().getPage().getTotalPage());
                            ((azo) BaseSearchResultListPresenter.this.a()).a(mixSearchResultBean.getData(), i, mixSearchResultBean.getData().getPage().getTotalPage());
                        }
                        BaseSearchResultListPresenter.this.c = mixSearchResultBean.getData().getPage().getTotalPage();
                        BaseSearchResultListPresenter.this.b = mixSearchResultBean.getData().getPage().getPage();
                        u.c(new agh.d(true));
                    }

                    @Override // defpackage.avc
                    public void a(int i2, String str) {
                        if (BaseSearchResultListPresenter.this.a() != 0) {
                            if (i == 1) {
                                ((azo) BaseSearchResultListPresenter.this.a()).a(str, i);
                            } else {
                                LogUtils.d("BaseSearchPresenter", "loadPageData more fail, at page:" + i + ", totalPage:" + BaseSearchResultListPresenter.this.c);
                                ((azo) BaseSearchResultListPresenter.this.a()).a(false, BaseSearchResultListPresenter.this.b, BaseSearchResultListPresenter.this.c);
                            }
                        }
                        if (i2 == 5020005) {
                            u.c(new agp.a());
                            apx.a().a(null);
                            return;
                        }
                        u.c(new agh.d(true));
                    }
                });
            }
        }, i == 1 ? 900 : 0);
    }

    public void g() {
        int i = this.b;
        if (i + 1 <= this.c) {
            c(i + 1);
            return;
        }
        if (a() != 0) {
            ((azo) a()).a(false, this.b, this.c);
        }
        u.c(new agh.d(true));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechShow(agg.y yVar) {
        if (a() != 0) {
            ((azo) a()).as_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNewSearchKeyword(ayg.a aVar) {
        c(1);
        ayi.a().a(e());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealPlayState(age.l lVar) {
        if (a() != 0) {
            ((azo) a()).as_();
        }
        if (lVar.a() == 2 || lVar.a() == 3) {
            u.c(new agh.d(true));
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealLoveState(agq.l lVar) {
        azo azoVar = (azo) a();
        if (azoVar != null) {
            if (azoVar instanceof azq) {
                ((azq) azoVar).a(lVar);
            }
            azoVar.as_();
        }
        u.c(new agh.d(true));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        if (a() != 0) {
            ((azo) a()).as_();
        }
        u.c(new agh.d(true));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNewVoiceSearchRsult(agp.d dVar) {
        if (w.f() == 2) {
            LogUtils.i("BaseSearchPresenter", " isInVoiceSearchMode onNewVoiceSearchRsult handle tab data: ");
            if (dVar.b() == e()) {
                a(dVar.a(), dVar.c());
            }
        } else if (dVar.d()) {
            if (dVar.b() == e()) {
                a(dVar.a(), dVar.c());
            }
        } else if (dVar.b() == 2 && (this instanceof SearchResultProgramPresenter)) {
            a(dVar.a(), dVar.c());
        } else if (dVar.b() == 1 && (this instanceof SearchResultSongPresenter)) {
            a(dVar.a(), dVar.c());
        }
    }
}
