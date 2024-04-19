package defpackage;

import android.content.res.Configuration;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.result.program.presenter.SearchResultProgramPresenter;
import com.xiaopeng.musicradio.utils.be;
import java.util.ArrayList;
/* compiled from: SearchResultProgramFragment.java */
@Route(path = "/search/fragment/result/program")
/* renamed from: azh  reason: default package */
/* loaded from: classes2.dex */
public class azh extends azt<azg, SearchResultProgramPresenter> implements azg {
    private ayd h;

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "SearchResultProgram";
    }

    @Override // defpackage.azt
    protected void a() {
        ((SearchResultProgramPresenter) this.b).g();
    }

    @Override // defpackage.azt
    protected int r() {
        return a.f.tab_search_program;
    }

    @Override // defpackage.azt
    protected axy s() {
        return this.h;
    }

    @Override // defpackage.azt, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        super.g();
        this.h = new ayd(getContext(), this);
        this.f.setAdapter(this.h);
        this.e.a(new GridLayoutManager.c() { // from class: azh.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int a(int i) {
                if (azh.this.h.f(i)) {
                    return azh.this.e.c();
                }
                return 1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: w */
    public SearchResultProgramPresenter ao_() {
        return new SearchResultProgramPresenter();
    }

    @Override // defpackage.azo
    public void a(MixSearchResultBean.DataBean dataBean, int i, int i2) {
        if (i == 1) {
            this.h.a(dataBean.getReadingAlbumList());
            if (dataBean.getReadingAlbumList() == null || dataBean.getReadingAlbumList().size() == 0) {
                B();
            }
        } else {
            this.h.c(dataBean.getReadingAlbumList());
        }
        y();
    }

    private void y() {
        ban.d(new Runnable() { // from class: azh.2
            @Override // java.lang.Runnable
            public void run() {
                final ArrayList<RdAlbumBean> arrayList = new ArrayList();
                arrayList.addAll(azh.this.h.n());
                for (RdAlbumBean rdAlbumBean : arrayList) {
                    rdAlbumBean.setHighlightTitle(be.a(bak.c(a.C0165a.x_theme_primary_normal), rdAlbumBean.getTitle(), ayi.a().c()));
                }
                ban.g(new Runnable() { // from class: azh.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        azh.this.h.a(arrayList);
                    }
                });
            }
        });
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
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
