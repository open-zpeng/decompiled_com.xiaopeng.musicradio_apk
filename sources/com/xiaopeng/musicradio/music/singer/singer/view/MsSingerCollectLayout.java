package com.xiaopeng.musicradio.music.singer.singer.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.q;
import com.google.android.exoplayer2.C;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.singer.singer.presenter.MsSingerCollectPresenter;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.bj;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aep;
import java.util.List;
/* loaded from: classes.dex */
public class MsSingerCollectLayout extends BaseFrameLayout<a, MsSingerCollectPresenter> implements View.OnClickListener, bic, a {
    private Context c;
    private BaseRecycleView d;
    private atq e;
    private GridLayoutManager f;
    private LoadingTipsView g;

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        return null;
    }

    @Override // defpackage.bic
    public boolean onVuiElementEvent(View view, bio bioVar) {
        return false;
    }

    public MsSingerCollectLayout(Context context) {
        super(context);
        this.c = context;
    }

    public MsSingerCollectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
    }

    public MsSingerCollectLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public MsSingerCollectPresenter a() {
        return new MsSingerCollectPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.g = (LoadingTipsView) findViewById(b.d.rm_category_loading);
        this.g.setAutoClickLoadingEnable(false);
        this.d = (BaseRecycleView) findViewById(b.d.rm_category_rv);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.e = new atq(getContext());
        this.d.setItemAnimator(new e());
        h hVar = new h(4, 33, false);
        hVar.a(35);
        this.d.addItemDecoration(hVar);
        this.f = new GridLayoutManager(getContext(), 4);
        this.d.setHasFixedSize(true);
        this.d.setLayoutManager(this.f);
        ((q) this.d.getItemAnimator()).a(false);
        this.d.setAdapter(this.e);
        this.f.a(new GridLayoutManager.c() { // from class: com.xiaopeng.musicradio.music.singer.singer.view.MsSingerCollectLayout.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int a(int i) {
                if (MsSingerCollectLayout.this.e.a(i) == 1) {
                    return MsSingerCollectLayout.this.f.c();
                }
                return 1;
            }
        });
        this.d.initVuiAttr("MusicSingerDetail", VuiEngine.getInstance(getContext()), true, true, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.g.setOnClickListener(this);
        this.e.a(new aep.c() { // from class: com.xiaopeng.musicradio.music.singer.singer.view.MsSingerCollectLayout.2
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                MusicRadioItem g = MsSingerCollectLayout.this.e.g(i2);
                if (g == null) {
                    return;
                }
                switch (i) {
                    case 0:
                        if (apk.i().y()) {
                            return;
                        }
                        atf.a().a(au.g(g.getId(), g.getTitle()).toJson());
                        ams.a().a(g);
                        return;
                    case 1:
                        sp.a().a("/music/activity/fav_singer_collect_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("detail_id", g.getId()).withString("detail_LOGO", g.getLogoUrl()).withString("detail_title", g.getName()).withString("detail_description", g.getAlbumDesc()).navigation();
                        return;
                    default:
                        return;
                }
            }
        });
        this.d.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.music.singer.singer.view.MsSingerCollectLayout.3
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                boolean g = ((MsSingerCollectPresenter) MsSingerCollectLayout.this.b).g();
                if (recyclerView == null || !g || recyclerView.getAdapter() == null) {
                    return;
                }
                int a = recyclerView.getAdapter().a();
                int r = ((GridLayoutManager) recyclerView.getLayoutManager()).r();
                int childCount = recyclerView.getChildCount();
                if (i != 0 || r != a - 1 || childCount <= 0 || !ShakeUtil.canExecuteLong(MsSingerCollectLayout.this.d.getId(), 1000) || MsSingerCollectLayout.this.e.l() == 0 || MsSingerCollectLayout.this.e.l() == 1) {
                    return;
                }
                if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
                    ((MsSingerCollectPresenter) MsSingerCollectLayout.this.b).d();
                    MsSingerCollectLayout.this.b(0);
                    return;
                }
                ak.b(com.xiaopeng.musicradio.a.a, bj.b(-1, null));
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.music_layout_rm_category;
    }

    public void g() {
        ((MsSingerCollectPresenter) this.b).d();
    }

    @Override // com.xiaopeng.musicradio.music.singer.singer.view.a
    public void a(List<MusicRadioItem> list) {
        a(0);
        this.d.setVisibility(0);
        if (this.e.a() != list.size()) {
            this.e.a((List) list, true);
        } else {
            this.e.a((List) list, false);
            this.e.a(0, list.size());
        }
        list.clear();
        b(2);
    }

    @Override // com.xiaopeng.musicradio.music.singer.singer.view.a
    public void b(List<MusicRadioItem> list) {
        if (list.size() > 0) {
            b(2);
            this.e.b((List) list, true);
            list.clear();
            return;
        }
        b(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: com.xiaopeng.musicradio.music.singer.singer.view.MsSingerCollectLayout.4
                @Override // java.lang.Runnable
                public void run() {
                    MsSingerCollectLayout.this.e.f(i);
                }
            });
        } else {
            this.e.f(i);
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        this.d.setVisibility(8);
        a(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        if (((MsSingerCollectPresenter) this.b).i() == 1) {
            this.d.setVisibility(8);
            a(2);
        } else {
            ak.a(this.c, str);
        }
        b(2);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        this.d.setVisibility(8);
        a(3);
        b(2);
    }

    @Override // com.xiaopeng.musicradio.music.singer.singer.view.a
    public void a(boolean z) {
        if (z) {
            int o = this.e.o();
            if (o != -1) {
                this.e.c(o);
            }
            String x = apk.i().x();
            if (TextUtils.isEmpty(x)) {
                return;
            }
            List<MusicRadioItem> p = this.e.p();
            for (int i = 0; i < p.size(); i++) {
                if (a(x, p.get(i).getId())) {
                    this.e.c(i);
                }
            }
            return;
        }
        int o2 = this.e.o();
        if (o2 != -1) {
            this.e.c(o2);
            this.e.h(-1);
        }
    }

    public boolean a(String str, long j) {
        if (TextUtils.isEmpty(str) || !str.contains("listsign_singer_single_music")) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.COLLECTID_PREFIX);
        sb.append(j);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        return str.contains(sb.toString());
    }

    @Override // com.xiaopeng.musicradio.music.singer.singer.view.a
    public void e() {
        this.e.d();
    }

    public void a(int i) {
        this.g.setState(i);
        if (i == 1) {
            this.g.setClickable(false);
        } else {
            this.g.setClickable(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == b.d.rm_category_loading) {
            ((MsSingerCollectPresenter) this.b).d();
        }
    }

    public void setmId(String str) {
        ((MsSingerCollectPresenter) this.b).b(str);
    }
}
