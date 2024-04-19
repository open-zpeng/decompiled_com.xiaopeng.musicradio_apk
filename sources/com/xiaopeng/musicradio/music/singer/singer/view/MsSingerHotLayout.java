package com.xiaopeng.musicradio.music.singer.singer.view;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.q;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.xpbean.SingerResultBean;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.singer.singer.presenter.MsSingerHotPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.quicksidebar.XQuickSideBarView;
import defpackage.aep;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class MsSingerHotLayout extends BaseFrameLayout<b, MsSingerHotPresenter> implements b {
    private LoadingTipsView c;
    private BaseRecycleView d;
    private ato e;
    private GridLayoutManager f;
    private MsSingerSelectLayout g;
    private boolean h;
    private XQuickSideBarView i;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public MsSingerHotPresenter a() {
        return new MsSingerHotPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.music_layout_singer_hot;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (LoadingTipsView) findViewById(b.d.loading_item);
        this.c.setAutoClickLoadingEnable(false);
        this.d = (BaseRecycleView) findViewById(b.d.hot_recycleview);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.e = new ato(getContext());
        this.d.setItemAnimator(new e());
        h hVar = new h(4, 76, false);
        hVar.a(45);
        this.d.addItemDecoration(hVar);
        this.d.addItemDecoration(new j(0, 100));
        this.f = new GridLayoutManager(getContext(), 4);
        this.d.setLayoutManager(this.f);
        this.d.setHasFixedSize(true);
        ((q) this.d.getItemAnimator()).a(false);
        this.d.setAdapter(this.e);
        this.d.initVuiAttr("MusicSinger", VuiEngine.getInstance(getContext()), true, true, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.singer.singer.view.MsSingerHotLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((MsSingerHotPresenter) MsSingerHotLayout.this.b).d();
            }
        });
        this.d.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.music.singer.singer.view.MsSingerHotLayout.2
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
            }
        });
        this.e.a(new aep.c() { // from class: com.xiaopeng.musicradio.music.singer.singer.view.MsSingerHotLayout.3
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                SingerResultBean.DataBean.ArtistGroupsBean.ListBean g = MsSingerHotLayout.this.e.g(i2);
                if (g == null) {
                    return;
                }
                switch (i) {
                    case 0:
                        if (apk.i().y()) {
                            return;
                        }
                        atf.a().a(au.f(g.getId(), g.getName()).toJson());
                        return;
                    case 1:
                        atv.j();
                        sp.a().a("/music/activity/fav_singer_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("detail_id", g.getId()).withString("detail_LOGO", g.getLogo()).withString("detail_title", g.getName()).navigation();
                        return;
                    default:
                        return;
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        this.h = false;
        this.d.setVisibility(8);
        a(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        this.h = false;
        this.d.setVisibility(8);
        a(2);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        this.h = false;
        this.d.setVisibility(8);
        a(3);
    }

    @Override // com.xiaopeng.musicradio.music.singer.singer.view.b
    public void a(ArrayList<SingerResultBean.DataBean.ArtistGroupsBean.ListBean> arrayList) {
        XQuickSideBarView xQuickSideBarView = this.i;
        if (xQuickSideBarView != null) {
            xQuickSideBarView.setVisibility(8);
        }
        if (arrayList.size() > 0) {
            a(0);
            this.d.setVisibility(0);
            this.e.a((List) arrayList, true);
            this.h = true;
            return;
        }
        b("");
    }

    private void a(int i) {
        this.c.setState(i);
        if (i == 1) {
            this.c.setClickable(false);
        } else {
            this.c.setClickable(true);
        }
    }

    @Override // com.xiaopeng.musicradio.music.singer.singer.view.b
    public void a(boolean z) {
        if (z) {
            int l = this.e.l();
            if (l != -1) {
                this.e.c(l);
            }
            String x = apk.i().x();
            if (TextUtils.isEmpty(x)) {
                return;
            }
            List<SingerResultBean.DataBean.ArtistGroupsBean.ListBean> o = this.e.o();
            for (int i = 0; i < o.size(); i++) {
                if (a(x, o.get(i).getId())) {
                    this.e.c(i);
                }
            }
            return;
        }
        int l2 = this.e.l();
        if (l2 != -1) {
            this.e.c(l2);
            this.e.f(-1);
        }
    }

    public boolean a(String str, long j) {
        if (TextUtils.isEmpty(str) || !str.contains(ListSignBean.LISTSIGN_ARTIST_RADIO)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.COLLECTID_PREFIX);
        sb.append(j);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        return str.contains(sb.toString());
    }

    public void setSingerSelectLayout(MsSingerSelectLayout msSingerSelectLayout) {
        this.g = msSingerSelectLayout;
    }

    public void setQuickSideBarBig(XQuickSideBarView xQuickSideBarView) {
        this.i = xQuickSideBarView;
    }

    public void setData(int i) {
        ((MsSingerHotPresenter) this.b).a(i);
        ((MsSingerHotPresenter) this.b).d();
    }

    @Override // com.xiaopeng.musicradio.music.singer.singer.view.b
    public void e() {
        g();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        g();
    }

    private void g() {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: com.xiaopeng.musicradio.music.singer.singer.view.MsSingerHotLayout.4
                @Override // java.lang.Runnable
                public void run() {
                    if (MsSingerHotLayout.this.e == null || MsSingerHotLayout.this.e.a() <= 0) {
                        return;
                    }
                    MsSingerHotLayout.this.e.a(0, MsSingerHotLayout.this.e.a(), "payload");
                }
            });
            return;
        }
        ato atoVar = this.e;
        if (atoVar == null || atoVar.a() <= 0) {
            return;
        }
        ato atoVar2 = this.e;
        atoVar2.a(0, atoVar2.a(), "payload");
    }
}
