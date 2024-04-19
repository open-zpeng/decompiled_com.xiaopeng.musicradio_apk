package defpackage;

import android.content.res.Configuration;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.result.song.presenter.SearchResultSongPresenter;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.agq;
import java.util.ArrayList;
import java.util.Objects;
/* compiled from: SearchResultSongFragment.java */
@Route(path = "/search/fragment/result/song")
/* renamed from: azl  reason: default package */
/* loaded from: classes2.dex */
public class azl extends azt<azk, SearchResultSongPresenter> implements azk {
    private ayf h;

    @Override // defpackage.azt
    protected int ar_() {
        return 60;
    }

    @Override // defpackage.azt
    protected int at_() {
        return 1;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "SearchResultSong";
    }

    @Override // defpackage.azt
    protected void a() {
        ((SearchResultSongPresenter) this.b).g();
    }

    @Override // defpackage.azt
    protected int r() {
        return a.f.tab_search_song;
    }

    @Override // defpackage.azt
    protected axy s() {
        return this.h;
    }

    @Override // defpackage.azt
    protected int x() {
        return a.b.dp_12;
    }

    @Override // defpackage.azt, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        super.g();
        this.h = new ayf(getContext(), a.e.item_search_song_layout, this);
        this.f.setAdapter(this.h);
        this.d.setVisibility(0);
        VuiEngine.getInstance(getContext()).updateScene(o(), this.d);
        this.e.a(new GridLayoutManager.c() { // from class: azl.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int a(int i) {
                if (azl.this.h.f(i)) {
                    return azl.this.e.c();
                }
                return 1;
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.d.setButtonClickListener(new View.OnClickListener() { // from class: azl.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (azl.this.h.a() > 0) {
                    ((SearchResultSongPresenter) azl.this.b).a(azl.this.h.g(0), azl.this.h.n(), 0);
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: y */
    public SearchResultSongPresenter ao_() {
        return new SearchResultSongPresenter();
    }

    @Override // defpackage.azo
    public void a(MixSearchResultBean.DataBean dataBean, int i, int i2) {
        if (i == 1) {
            this.h.a(dataBean.getSongList());
            if (dataBean.getSongList() == null || dataBean.getSongList().size() == 0) {
                if (i2 > 1) {
                    a(true, 2, i2);
                    ((SearchResultSongPresenter) this.b).c(2);
                } else {
                    B();
                    this.d.setVisibility(8);
                }
            }
        } else {
            this.h.c(dataBean.getSongList());
            this.d.setVisibility(0);
        }
        VuiEngine.getInstance(getContext()).updateScene(o(), this.d);
        C();
        azz.a(dataBean.getSongList());
    }

    private void C() {
        ban.d(new Runnable() { // from class: azl.3
            @Override // java.lang.Runnable
            public void run() {
                final ArrayList<MusicSongBean> arrayList = new ArrayList();
                arrayList.addAll(azl.this.h.n());
                for (MusicSongBean musicSongBean : arrayList) {
                    musicSongBean.setHighlightSongName(be.a(bak.c(a.C0165a.x_theme_primary_normal), musicSongBean.getSongName(), ayi.a().c()));
                    musicSongBean.setHightlightSinger(be.a(bak.c(a.C0165a.x_theme_primary_normal), musicSongBean.getSingers(), ayi.a().c()));
                }
                ban.g(new Runnable() { // from class: azl.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        azl.this.h.a(arrayList);
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

    @Override // defpackage.azq
    public void a(agq.l lVar) {
        int a = this.h.a();
        for (int i = 0; i < a; i++) {
            MusicSongBean g = this.h.g(i);
            if (Objects.equals(g.getHash(), lVar.a())) {
                g.setHot(lVar.c());
                return;
            }
        }
    }
}
