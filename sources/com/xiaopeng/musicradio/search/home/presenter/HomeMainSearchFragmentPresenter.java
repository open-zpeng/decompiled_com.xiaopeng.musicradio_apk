package com.xiaopeng.musicradio.search.home.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.google.gson.reflect.TypeToken;
import com.lzy.okgo.OkGo;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.SearchHistoryBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.search.api.bean.SearchResultServiceBean;
import com.xiaopeng.musicradio.search.common.presenter.BaseSearchPresenter;
import com.xiaopeng.musicradio.search.home.view.b;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agd;
import defpackage.age;
import defpackage.agg;
import defpackage.agh;
import defpackage.agq;
import defpackage.ayg;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class HomeMainSearchFragmentPresenter extends BaseSearchPresenter<b> implements arj {
    private boolean b = true;

    @Override // defpackage.arj
    public void a(List<SearchResultServiceBean> list, int i, String str) {
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        f();
        if (this.b) {
            this.b = false;
            g();
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        OkGo.getInstance().cancelTag("okgo_hotword");
        super.onDestroy(iVar);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUpdateSearchKeyword(ayg.b bVar) {
        f();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onHistorySearchKeyword(ayg.b bVar) {
        LogUtils.i("HomeMainSearchFragmentPresenter", "onSearchHistoryKeyword:" + bVar.b());
        if (TextUtils.isEmpty(bVar.b())) {
            Log.d("HomeMainSearchFragmentPresenter", "onHistorySearchKeyword 搜索关键词为空: " + bVar.b());
            return;
        }
        Log.d("HomeMainSearchFragmentPresenter", "onHistorySearchKeyword 将搜索历史插入数据库: " + bVar.b());
        ayj.a().a(bVar.b());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechShow(agg.y yVar) {
        if (a() != null) {
            a().an_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPhoneCallChange(agd.f fVar) {
        if (!fVar.a() || a() == null) {
            return;
        }
        a().i();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetValid(agg.p pVar) {
        if (a() == null || a().h()) {
            return;
        }
        g();
    }

    private void g() {
        arf arfVar = (arf) c.a().b(arf.class);
        if (arfVar != null) {
            if (a() != null) {
                a().a(true, 0, 0);
            }
            arfVar.querySearchHotSongs(this);
        }
    }

    public void e() {
        ayj.a().b();
        f();
    }

    public void f() {
        LogUtils.d("HomeMainSearchFragmentPresenter", "startLoadHistory");
        ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.search.home.presenter.HomeMainSearchFragmentPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtils.d("HomeMainSearchFragmentPresenter", "startLoadHistory in thread");
                List<SearchHistoryBean> c = ayj.a().c();
                final ArrayList arrayList = new ArrayList();
                for (SearchHistoryBean searchHistoryBean : c) {
                    arrayList.add(searchHistoryBean.getKey());
                }
                LogUtils.d("HomeMainSearchFragmentPresenter", "startLoadHistory done in thread");
                if (HomeMainSearchFragmentPresenter.this.a() != null) {
                    ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.search.home.presenter.HomeMainSearchFragmentPresenter.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            LogUtils.d("HomeMainSearchFragmentPresenter", "startLoadHistory call back main thread");
                            if (HomeMainSearchFragmentPresenter.this.a() != null) {
                                Log.d("HomeMainSearchFragmentPresenter", "run 当前Java搜索历史为: " + arrayList.size());
                                HomeMainSearchFragmentPresenter.this.a().a(arrayList);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // defpackage.arj
    public void a(String str) {
        final List list = (List) z.a(str, new TypeToken<List<MusicSongBean>>() { // from class: com.xiaopeng.musicradio.search.home.presenter.HomeMainSearchFragmentPresenter.2
        }.getType());
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.search.home.presenter.HomeMainSearchFragmentPresenter.3
            @Override // java.lang.Runnable
            public void run() {
                if (HomeMainSearchFragmentPresenter.this.a() != null) {
                    HomeMainSearchFragmentPresenter.this.a().b(list);
                    HomeMainSearchFragmentPresenter.this.a().a(false, 0, 0);
                }
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealPlayState(age.l lVar) {
        if ((lVar.b() == 0 || lVar.b() == 3) && a() != null) {
            a().a(lVar.a(), lVar.b());
        }
        u.c(new agh.d(true));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealLoveState(agq.l lVar) {
        if (a() != null) {
            a().a(lVar);
            a().an_();
        }
        u.c(new agh.d(true));
    }

    public void b(String str) {
        arf arfVar = (arf) c.a().b(arf.class);
        if (arfVar != null) {
            arfVar.playHotMusic(str);
        }
        if (a() != null) {
            a().a(1, 0);
        }
        u.c(new agh.d(true));
    }
}
