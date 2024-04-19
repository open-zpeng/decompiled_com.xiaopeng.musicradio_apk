package com.xiaopeng.musicradio.music.concentration.recommend.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.recommend.presenter.MsRmCategoryLayoutPresenter;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.bj;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aep;
import java.util.List;
/* loaded from: classes.dex */
public class MsRmCategoryDetailLayout extends BaseFrameLayout<b, MsRmCategoryLayoutPresenter> implements View.OnClickListener, bic, b {
    private Context c;
    private BaseRecycleView d;
    private asd e;
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

    public MsRmCategoryDetailLayout(Context context) {
        super(context);
        this.c = context;
    }

    public MsRmCategoryDetailLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
    }

    public MsRmCategoryDetailLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public MsRmCategoryLayoutPresenter a() {
        return new MsRmCategoryLayoutPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.g = (LoadingTipsView) findViewById(b.d.rm_category_loading);
        this.g.setAutoClickLoadingEnable(false);
        this.d = (BaseRecycleView) findViewById(b.d.rm_category_rv);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.e = new asd(getContext(), b.e.music_item_recommend_list, 8, new aep.b() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmCategoryDetailLayout.1
            @Override // defpackage.aep.b
            public void a() {
                if (MsRmCategoryDetailLayout.this.e.a() > 0) {
                    MsRmCategoryDetailLayout.this.e.d();
                }
            }
        });
        this.d.setItemAnimator(new androidx.recyclerview.widget.e());
        h hVar = new h(4, 33, false);
        hVar.a(35);
        this.d.addItemDecoration(hVar);
        this.f = new GridLayoutManager(getContext(), 4);
        this.d.setHasFixedSize(true);
        this.d.setLayoutManager(this.f);
        ((q) this.d.getItemAnimator()).a(false);
        this.d.setAdapter(this.e);
        this.f.a(new GridLayoutManager.c() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmCategoryDetailLayout.2
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int a(int i) {
                if (MsRmCategoryDetailLayout.this.e.a(i) == 1) {
                    return MsRmCategoryDetailLayout.this.f.c();
                }
                return 1;
            }
        });
        this.d.initVuiAttr("MusicConcentrationCategory", VuiEngine.getInstance(getContext()), true, true, true);
        this.d.setVuiLabel(be.a(b.f.vui_right));
        this.d.setVuiPriority(bik.LEVEL2);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.g.setOnClickListener(this);
        this.e.a(new aep.c() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmCategoryDetailLayout.3
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                MusicRadioItem g = MsRmCategoryDetailLayout.this.e.g(i2);
                if (g == null) {
                    return;
                }
                switch (i) {
                    case 0:
                        if (apk.i().y()) {
                            return;
                        }
                        if (((MsRmCategoryLayoutPresenter) MsRmCategoryDetailLayout.this.b).k() != 3) {
                            atv.c();
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
        this.d.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmCategoryDetailLayout.4
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                boolean i2 = ((MsRmCategoryLayoutPresenter) MsRmCategoryDetailLayout.this.b).i();
                if (recyclerView == null || !i2 || recyclerView.getAdapter() == null) {
                    return;
                }
                int a = recyclerView.getAdapter().a();
                int r = ((GridLayoutManager) recyclerView.getLayoutManager()).r();
                int childCount = recyclerView.getChildCount();
                if (i != 0 || r != a - 1 || childCount <= 0 || !ShakeUtil.canExecuteLong(MsRmCategoryDetailLayout.this.d.getId(), 1000) || MsRmCategoryDetailLayout.this.e.l() == 0 || MsRmCategoryDetailLayout.this.e.l() == 1) {
                    return;
                }
                if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
                    ((MsRmCategoryLayoutPresenter) MsRmCategoryDetailLayout.this.b).c();
                    MsRmCategoryDetailLayout.this.b(0);
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
        ((MsRmCategoryLayoutPresenter) this.b).c(1);
        ((MsRmCategoryLayoutPresenter) this.b).c();
    }

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.b
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

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.b
    public void b(List<MusicRadioItem> list) {
        if (list.size() > 0) {
            b(2);
            this.e.b((List) list, true);
            list.clear();
            return;
        }
        b(1);
        this.e.i();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        this.d.setVisibility(8);
        a(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        if (((MsRmCategoryLayoutPresenter) this.b).j() == 1) {
            this.d.setVisibility(8);
            a(2);
            return;
        }
        b(2);
        ak.a(getContext(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmCategoryDetailLayout.5
                @Override // java.lang.Runnable
                public void run() {
                    MsRmCategoryDetailLayout.this.e.f(i);
                }
            });
        } else {
            this.e.f(i);
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        this.d.setVisibility(8);
        a(3);
        b(2);
    }

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.b
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
        if (TextUtils.isEmpty(str) || !str.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.COLLECTID_PREFIX);
        sb.append(j);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        return str.contains(sb.toString());
    }

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.b
    public void e() {
        i();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        i();
    }

    private void i() {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmCategoryDetailLayout.6
                @Override // java.lang.Runnable
                public void run() {
                    if (MsRmCategoryDetailLayout.this.e == null || MsRmCategoryDetailLayout.this.e.a() <= 0) {
                        return;
                    }
                    MsRmCategoryDetailLayout.this.e.a(0, MsRmCategoryDetailLayout.this.e.a(), "payload");
                }
            });
            return;
        }
        asd asdVar = this.e;
        if (asdVar == null || asdVar.a() <= 0) {
            return;
        }
        asd asdVar2 = this.e;
        asdVar2.a(0, asdVar2.a(), "payload");
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
            ((MsRmCategoryLayoutPresenter) this.b).c();
        }
    }

    public void setmType(int i) {
        ((MsRmCategoryLayoutPresenter) this.b).a(i);
    }

    public void setmId(String str) {
        ((MsRmCategoryLayoutPresenter) this.b).c(str);
    }

    public void setmName(String str) {
        ((MsRmCategoryLayoutPresenter) this.b).d(str);
    }

    public void setmSort(int i) {
        ((MsRmCategoryLayoutPresenter) this.b).b(i);
    }

    public void a(String str, String str2, bik bikVar) {
        this.d.initVuiAttr(str, VuiEngine.getInstance(getContext()), true, true, true);
        this.d.setVuiLabel(str2);
        this.d.setVuiPriority(bikVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.e.d();
    }
}
