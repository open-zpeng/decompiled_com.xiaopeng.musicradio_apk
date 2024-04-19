package defpackage;

import android.content.res.Configuration;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumBean;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.result.album.presenter.SearchResultAlbumPresenter;
import com.xiaopeng.musicradio.utils.be;
import java.util.ArrayList;
/* compiled from: SearchResultAlbumFragment.java */
@Route(path = "/search/fragment/result/album")
/* renamed from: ayl  reason: default package */
/* loaded from: classes2.dex */
public class ayl extends azt<ayk, SearchResultAlbumPresenter> implements ayk {
    private aya h;

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "SearchResultAlbum";
    }

    @Override // defpackage.azt
    protected void a() {
        ((SearchResultAlbumPresenter) this.b).g();
    }

    @Override // defpackage.azt
    protected int r() {
        return a.f.tab_search_album;
    }

    @Override // defpackage.azt
    protected axy s() {
        return this.h;
    }

    @Override // defpackage.azt, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        super.g();
        this.h = new aya(getContext(), this);
        this.f.setAdapter(this.h);
        this.e.a(new GridLayoutManager.c() { // from class: ayl.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int a(int i) {
                if (ayl.this.h.f(i)) {
                    return ayl.this.e.c();
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: t */
    public SearchResultAlbumPresenter ao_() {
        return new SearchResultAlbumPresenter();
    }

    @Override // defpackage.azo
    public void a(MixSearchResultBean.DataBean dataBean, int i, int i2) {
        if (i == 1) {
            this.h.a(dataBean.getAlbumList());
            if (dataBean.getAlbumList() == null || dataBean.getAlbumList().size() == 0) {
                B();
            }
        } else {
            this.h.c(dataBean.getAlbumList());
        }
        y();
    }

    private void y() {
        ban.d(new Runnable() { // from class: ayl.2
            @Override // java.lang.Runnable
            public void run() {
                final ArrayList<MusicAlbumBean> arrayList = new ArrayList();
                arrayList.addAll(ayl.this.h.n());
                for (MusicAlbumBean musicAlbumBean : arrayList) {
                    musicAlbumBean.setHighlightName(be.a(bak.c(a.C0165a.x_theme_primary_normal), musicAlbumBean.getName(), ayi.a().c()));
                }
                ban.g(new Runnable() { // from class: ayl.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ayl.this.h.a(arrayList);
                    }
                });
            }
        });
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
