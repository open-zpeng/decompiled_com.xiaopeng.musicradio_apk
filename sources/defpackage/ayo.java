package defpackage;

import android.content.res.Configuration;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.result.collection.presenter.SearchResultCollectionPresenter;
import com.xiaopeng.musicradio.utils.be;
import java.util.ArrayList;
/* compiled from: SearchResultCollectionFragment.java */
@Route(path = "/search/fragment/result/song_list")
/* renamed from: ayo  reason: default package */
/* loaded from: classes2.dex */
public class ayo extends azt<ayn, SearchResultCollectionPresenter> implements ayn {
    private ayb h;

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "SearchResultCollection";
    }

    @Override // defpackage.azt
    protected void a() {
        ((SearchResultCollectionPresenter) this.b).g();
    }

    @Override // defpackage.azt
    protected int r() {
        return a.f.tab_search_song_list;
    }

    @Override // defpackage.azt
    protected axy s() {
        return this.h;
    }

    @Override // defpackage.azt, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        super.g();
        this.h = new ayb(getContext(), this);
        this.f.setAdapter(this.h);
        this.e.a(new GridLayoutManager.c() { // from class: ayo.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int a(int i) {
                if (ayo.this.h.f(i)) {
                    return ayo.this.e.c();
                }
                return 1;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        y();
    }

    private void y() {
        ban.d(new Runnable() { // from class: ayo.2
            @Override // java.lang.Runnable
            public void run() {
                final ArrayList<MixSearchResultBean.CollectBean> arrayList = new ArrayList();
                arrayList.addAll(ayo.this.h.n());
                for (MixSearchResultBean.CollectBean collectBean : arrayList) {
                    collectBean.setHighlightName(be.a(bak.c(a.C0165a.x_theme_primary_normal), collectBean.getName(), ayi.a().c()));
                }
                ban.g(new Runnable() { // from class: ayo.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ayo.this.h.a(arrayList);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: t */
    public SearchResultCollectionPresenter ao_() {
        return new SearchResultCollectionPresenter();
    }

    @Override // defpackage.azo
    public void a(MixSearchResultBean.DataBean dataBean, int i, int i2) {
        if (i == 1) {
            this.h.a(dataBean.getCollectList());
            if (dataBean.getCollectList() == null || dataBean.getCollectList().size() == 0) {
                B();
            }
        } else {
            this.h.c(dataBean.getCollectList());
        }
        y();
    }

    @Override // defpackage.azo
    public boolean u() {
        return this.h.a() > 1;
    }

    @Override // defpackage.azo
    public void v() {
        this.h.a(new ArrayList());
    }
}
