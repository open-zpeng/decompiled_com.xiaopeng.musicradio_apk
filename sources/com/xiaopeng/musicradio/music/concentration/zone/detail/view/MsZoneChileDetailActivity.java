package com.xiaopeng.musicradio.music.concentration.zone.detail.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.VipMusicMoreDetails;
import com.xiaopeng.musicradio.bean.VipMusicMoreInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.zone.detail.presenter.MsZoneChildDetailActPresenter;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.bj;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.DialogTopLayout;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aep;
import java.util.ArrayList;
import java.util.List;
@Route(path = "/music/activity/zone_child_detail")
/* loaded from: classes.dex */
public class MsZoneChileDetailActivity extends com.xiaopeng.musicradio.commonui.vui.a<a, MsZoneChildDetailActPresenter> implements a {
    private DialogTopLayout f;
    private LoadingTipsView g;
    private BaseRecycleView h;
    private asd i;
    private VipMusicMoreInfo.ModuleBean j;
    private List<MusicRadioItem> k = new ArrayList();
    private Context l;
    private GridLayoutManager m;

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MusicZoneChildDetail";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: q */
    public MsZoneChildDetailActPresenter e() {
        return new MsZoneChildDetailActPresenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return b.e.music_activity_zone_child_detail;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.f = (DialogTopLayout) findViewById(b.d.zone_child_top_layout);
        this.f.a(false);
        this.h = (BaseRecycleView) findViewById(b.d.zone_child_detail_rv);
        this.g = (LoadingTipsView) findViewById(b.d.loadingview);
        this.g.setState(1);
        this.g.setAutoClickLoadingEnable(false);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        r();
        this.i = new asd(this);
        this.h.setItemAnimator(new androidx.recyclerview.widget.e());
        h hVar = new h(4, 40, false);
        hVar.a(26);
        this.h.addItemDecoration(hVar);
        this.m = new GridLayoutManager(this, 4);
        this.h.setHasFixedSize(true);
        this.h.setLayoutManager(this.m);
        ((q) this.h.getItemAnimator()).a(false);
        this.h.setAdapter(this.i);
        this.m.a(new GridLayoutManager.c() { // from class: com.xiaopeng.musicradio.music.concentration.zone.detail.view.MsZoneChileDetailActivity.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int a(int i) {
                if (MsZoneChileDetailActivity.this.i.a(i) == 1) {
                    return MsZoneChileDetailActivity.this.m.c();
                }
                return 1;
            }
        });
        this.f.setCloseListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.zone.detail.view.MsZoneChileDetailActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MsZoneChileDetailActivity.this.finish();
            }
        });
        if (getIntent() != null) {
            a((VipMusicMoreInfo.ModuleBean) z.a(getIntent().getStringExtra("module_info"), (Class<Object>) VipMusicMoreInfo.ModuleBean.class));
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        this.i.a(new aep.c() { // from class: com.xiaopeng.musicradio.music.concentration.zone.detail.view.MsZoneChileDetailActivity.3
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                MusicRadioItem g = MsZoneChileDetailActivity.this.i.g(i2);
                if (g == null) {
                    return;
                }
                switch (i) {
                    case 0:
                        if (apk.i().y()) {
                            return;
                        }
                        atf.a().a(au.b(g.getId(), g.getTitle()).toJson());
                        ams.a().a(g);
                        return;
                    case 1:
                        atz.a(g.getId(), g.getLogoUrl(), g.getName(), g.getDescription());
                        return;
                    default:
                        return;
                }
            }
        });
        this.h.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.music.concentration.zone.detail.view.MsZoneChileDetailActivity.4
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (recyclerView == null || recyclerView.getAdapter() == null) {
                    return;
                }
                int a = recyclerView.getAdapter().a();
                int r = ((GridLayoutManager) recyclerView.getLayoutManager()).r();
                int childCount = recyclerView.getChildCount();
                if (i != 0 || r != a - 1 || childCount <= 0 || !ShakeUtil.canExecuteLong(MsZoneChileDetailActivity.this.h.getId(), 1000) || MsZoneChileDetailActivity.this.i.l() == 0 || MsZoneChileDetailActivity.this.i.l() == 1) {
                    return;
                }
                if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
                    ((MsZoneChildDetailActPresenter) MsZoneChileDetailActivity.this.b).b(String.valueOf(MsZoneChileDetailActivity.this.j.getModuleId()));
                    MsZoneChileDetailActivity.this.b(0);
                    return;
                }
                ak.b(com.xiaopeng.musicradio.a.a, bj.b(-1, null));
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.zone.detail.view.MsZoneChileDetailActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MsZoneChileDetailActivity.this.b == null || MsZoneChileDetailActivity.this.j == null) {
                    return;
                }
                Log.i("MsZoneChileDetailActivity", "mLoadView onClick.. state: " + MsZoneChileDetailActivity.this.g.getState());
                if (MsZoneChileDetailActivity.this.g.getState() == 3 || MsZoneChileDetailActivity.this.g.getState() == 2) {
                    MsZoneChileDetailActivity.this.g.setState(1);
                    ((MsZoneChildDetailActPresenter) MsZoneChileDetailActivity.this.b).a(1);
                    ((MsZoneChildDetailActPresenter) MsZoneChileDetailActivity.this.b).b(String.valueOf(MsZoneChileDetailActivity.this.j.getModuleId()));
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.music.concentration.zone.detail.view.a
    public void a(VipMusicMoreDetails vipMusicMoreDetails, int i) {
        if (i == 1) {
            this.k.clear();
        }
        if (vipMusicMoreDetails != null && vipMusicMoreDetails.getData() != null && vipMusicMoreDetails.getData().getList() != null) {
            if (vipMusicMoreDetails.getData().getList().size() > 0) {
                for (VipMusicMoreDetails.CollectBean collectBean : vipMusicMoreDetails.getData().getList()) {
                    MusicRadioItem collect = collectBean.getCollect();
                    collect.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
                    collect.setTitle(collect.getName());
                    collect.setName(collect.getName());
                    collect.setLogoUrl(collect.getLogo());
                    this.k.add(collect);
                }
                b(2);
            } else {
                b(1);
                this.i.i();
            }
        }
        this.i.a((List) this.k, true);
        if (i == 1) {
            this.h.scrollToPosition(0);
        }
        this.h.setVisibility(0);
        this.g.setState(0);
    }

    @Override // com.xiaopeng.musicradio.music.concentration.zone.detail.view.a
    public void a() {
        s();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        s();
    }

    private void s() {
        asd asdVar = this.i;
        if (asdVar == null || asdVar.a() <= 0) {
            return;
        }
        if (this.h.isComputingLayout()) {
            this.h.post(new Runnable() { // from class: com.xiaopeng.musicradio.music.concentration.zone.detail.view.MsZoneChileDetailActivity.6
                @Override // java.lang.Runnable
                public void run() {
                    MsZoneChileDetailActivity.this.i.d();
                }
            });
        } else {
            this.i.d();
        }
    }

    @Override // com.xiaopeng.musicradio.music.concentration.zone.detail.view.a
    public void a(boolean z) {
        if (z) {
            int o = this.i.o();
            if (o != -1) {
                this.i.c(o);
            }
            String x = apk.i().x();
            if (TextUtils.isEmpty(x)) {
                return;
            }
            List<MusicRadioItem> p = this.i.p();
            for (int i = 0; i < p.size(); i++) {
                if (a(x, p.get(i).getId())) {
                    this.i.c(i);
                }
            }
            return;
        }
        int o2 = this.i.o();
        if (o2 != -1) {
            this.i.c(o2);
            this.i.h(-1);
        }
    }

    public boolean a(String str, long j) {
        if (TextUtils.isEmpty(str) || !str.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.COLLECTID_PREFIX);
        sb.append(j);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        return str.contains(sb.toString());
    }

    private void a(int i) {
        this.g.setState(i);
        if (i == 1) {
            this.g.setClickable(false);
        } else {
            this.g.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        if (this.h.isComputingLayout()) {
            this.h.post(new Runnable() { // from class: com.xiaopeng.musicradio.music.concentration.zone.detail.view.MsZoneChileDetailActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    MsZoneChileDetailActivity.this.i.f(i);
                }
            });
        } else {
            this.i.f(i);
        }
    }

    public void a(VipMusicMoreInfo.ModuleBean moduleBean) {
        this.j = moduleBean;
        this.f.setTitle(moduleBean.getName());
        ((MsZoneChildDetailActPresenter) this.b).a(1);
        ((MsZoneChildDetailActPresenter) this.b).b(String.valueOf(moduleBean.getModuleId()));
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        baj.a().b();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        this.h.setVisibility(8);
        a(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        if (((MsZoneChildDetailActPresenter) this.b).d() == 1) {
            this.h.setVisibility(8);
            a(2);
        } else {
            ak.a(this.l, str);
        }
        b(2);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        this.h.setVisibility(8);
        a(3);
        b(2);
    }

    protected void r() {
        this.h.initVuiAttr("MusicZoneChildDetail", VuiEngine.getInstance(this), true, true);
    }
}
