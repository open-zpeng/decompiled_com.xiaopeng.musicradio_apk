package com.xiaopeng.musicradio.search.home.view;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.home.presenter.HomeMainSearchFragmentPresenter;
import com.xiaopeng.musicradio.search.widget.view.SearchHotLayout;
import com.xiaopeng.musicradio.search.widget.view.a;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import defpackage.agq;
import defpackage.ayg;
import java.util.Arrays;
import java.util.List;
/* compiled from: SearchHomeMainFragment.java */
@Route(path = "/search/fragment/home/main")
/* loaded from: classes2.dex */
public class d extends com.xiaopeng.musicradio.widget.d<b, HomeMainSearchFragmentPresenter> implements b {
    private SearchHotLayout d;
    private com.xiaopeng.musicradio.search.widget.view.a e;
    private LoadingTipsView f;
    private List<String> g;
    private List<MusicSongBean> h;

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "SearchMain";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return a.e.layout_search_history_hot;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.d = (SearchHotLayout) a(a.d.search_hot_layout);
        SearchHotLayout searchHotLayout = this.d;
        if (searchHotLayout != null) {
            this.e = searchHotLayout.getSearchHistoryLayout();
        }
        this.f = (LoadingTipsView) a(a.d.loading_tips);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        this.f.setState(1);
        this.d.a();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.e.setCallback(new a.InterfaceC0174a() { // from class: com.xiaopeng.musicradio.search.home.view.d.1
            @Override // com.xiaopeng.musicradio.search.widget.view.a.InterfaceC0174a
            public void a() {
                ((HomeMainSearchFragmentPresenter) d.this.b).e();
            }

            @Override // com.xiaopeng.musicradio.search.widget.view.a.InterfaceC0174a
            public void a(String str) {
                ayi.a().a(str);
                ayi.a().b((String) null);
                u.c(new ayg.b(str, true));
                u.c(new ayg.a());
            }
        });
        this.d.setCallback(new SearchHotLayout.c() { // from class: com.xiaopeng.musicradio.search.home.view.d.2
            @Override // com.xiaopeng.musicradio.search.widget.view.SearchHotLayout.c
            public int a(String str, long j) {
                return ((HomeMainSearchFragmentPresenter) d.this.b).a(str, j);
            }

            @Override // com.xiaopeng.musicradio.search.widget.view.SearchHotLayout.c
            public void a(boolean z, int i) {
                if (i == 0) {
                    ((HomeMainSearchFragmentPresenter) d.this.b).a(z);
                }
            }

            @Override // com.xiaopeng.musicradio.search.widget.view.SearchHotLayout.c
            public void a(String str) {
                ((HomeMainSearchFragmentPresenter) d.this.b).b(str);
            }

            @Override // com.xiaopeng.musicradio.search.widget.view.SearchHotLayout.c
            public void a(MusicSongBean musicSongBean) {
                ((HomeMainSearchFragmentPresenter) d.this.b).b(musicSongBean);
            }

            @Override // com.xiaopeng.musicradio.search.widget.view.SearchHotLayout.c
            public String a() {
                return ((HomeMainSearchFragmentPresenter) d.this.b).d();
            }

            @Override // com.xiaopeng.musicradio.search.widget.view.SearchHotLayout.c
            public boolean b(MusicSongBean musicSongBean) {
                return ((HomeMainSearchFragmentPresenter) d.this.b).c(musicSongBean);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.d, com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        List<String> list = this.g;
        if (list != null) {
            a(list);
        }
        List<MusicSongBean> list2 = this.h;
        if (list2 != null) {
            b(list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public HomeMainSearchFragmentPresenter ao_() {
        return new HomeMainSearchFragmentPresenter();
    }

    @Override // com.xiaopeng.musicradio.search.home.view.b
    public void a(List<String> list) {
        com.xiaopeng.musicradio.search.widget.view.a aVar = this.e;
        if (aVar == null) {
            this.g = list;
            return;
        }
        this.g = null;
        aVar.a(list);
        this.d.d();
    }

    @Override // com.xiaopeng.musicradio.search.home.view.b
    public void b(List<MusicSongBean> list) {
        SearchHotLayout searchHotLayout = this.d;
        if (searchHotLayout == null) {
            this.h = list;
            return;
        }
        this.h = null;
        searchHotLayout.a(list);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("vui_search_local_top");
    }

    @Override // com.xiaopeng.musicradio.search.home.view.b
    public void a(int i, int i2) {
        SearchHotLayout searchHotLayout = this.d;
        if (searchHotLayout != null) {
            searchHotLayout.a(i);
        }
    }

    @Override // com.xiaopeng.musicradio.search.home.view.b
    public void an_() {
        SearchHotLayout searchHotLayout = this.d;
        if (searchHotLayout != null) {
            searchHotLayout.b();
        }
    }

    @Override // com.xiaopeng.musicradio.search.home.view.b
    public boolean h() {
        SearchHotLayout searchHotLayout = this.d;
        if (searchHotLayout != null) {
            return searchHotLayout.c();
        }
        return false;
    }

    @Override // com.xiaopeng.musicradio.search.home.view.b
    public void i() {
        com.xiaopeng.musicradio.search.widget.view.a aVar = this.e;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // defpackage.azp
    public void a(boolean z, int i, int i2) {
        LoadingTipsView loadingTipsView = this.f;
        if (loadingTipsView != null) {
            if (z) {
                loadingTipsView.setState(1);
            } else {
                loadingTipsView.setState(0);
            }
        }
    }

    @Override // defpackage.azp
    public void a(String str, int i) {
        LoadingTipsView loadingTipsView = this.f;
        if (loadingTipsView != null) {
            loadingTipsView.setState(0);
        }
    }

    @Override // defpackage.azq
    public void a(agq.l lVar) {
        SearchHotLayout searchHotLayout = this.d;
        if (searchHotLayout != null) {
            searchHotLayout.a(lVar);
        }
    }
}
