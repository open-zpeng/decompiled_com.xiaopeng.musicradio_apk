package com.xiaopeng.musicradio.netradio.main.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.q;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.netradio.main.presenter.NrCategoryOrAreaDetailPresenter;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aep;
import defpackage.beo;
import java.util.List;
/* loaded from: classes2.dex */
public class NrCategoryOrAreaDetailLayout extends BaseFrameLayout<b, NrCategoryOrAreaDetailPresenter> implements View.OnClickListener, bic, b {
    private Context c;
    private BaseRecycleView d;
    private aun e;
    private GridLayoutManager f;
    private LoadingTipsView g;
    private acv h;

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        return null;
    }

    @Override // defpackage.bic
    public boolean onVuiElementEvent(View view, bio bioVar) {
        return false;
    }

    public NrCategoryOrAreaDetailLayout(Context context) {
        super(context);
        this.c = context;
    }

    public NrCategoryOrAreaDetailLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
        this.h = acv.a(context, attributeSet);
    }

    public NrCategoryOrAreaDetailLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = context;
        this.h = acv.a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public NrCategoryOrAreaDetailPresenter a() {
        return new NrCategoryOrAreaDetailPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.g = (LoadingTipsView) findViewById(beo.c.allradio_loading);
        this.g.setAutoClickLoadingEnable(false);
        this.d = (BaseRecycleView) findViewById(beo.c.allradio_rv);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.e = new aun(getContext(), beo.d.netradio_item_radio_list, 12, new aep.b() { // from class: com.xiaopeng.musicradio.netradio.main.view.NrCategoryOrAreaDetailLayout.1
            @Override // defpackage.aep.b
            public void a() {
                if (NrCategoryOrAreaDetailLayout.this.e.a() > 0) {
                    NrCategoryOrAreaDetailLayout.this.e.d();
                }
            }
        });
        this.d.setItemAnimator(new androidx.recyclerview.widget.e());
        h hVar = new h(3, 25, false);
        hVar.a(40);
        hVar.c(100);
        this.d.addItemDecoration(hVar);
        this.f = new GridLayoutManager(this.c, 3);
        this.d.setHasFixedSize(true);
        this.d.setLayoutManager(this.f);
        ((q) this.d.getItemAnimator()).a(false);
        this.d.setAdapter(this.e);
        this.g.setNoResultText(beo.e.no_netradio);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.e.a(new aep.c() { // from class: com.xiaopeng.musicradio.netradio.main.view.NrCategoryOrAreaDetailLayout.2
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                List<NetRadioInfo> o = NrCategoryOrAreaDetailLayout.this.e.o();
                if (o == null || i2 >= o.size()) {
                    return;
                }
                auo.a().a(o.get(i2));
            }
        });
        this.g.setOnClickListener(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return beo.d.netradio_layout_area_or_category;
    }

    public void a(String str, String str2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (TextUtils.equals(str, "2")) {
            layoutParams.setMargins(0, 0, 110, 0);
        } else {
            layoutParams.setMargins(0, 0, 30, 0);
        }
        BaseRecycleView baseRecycleView = this.d;
        if (baseRecycleView != null) {
            baseRecycleView.setLayoutParams(layoutParams);
        }
        ((NrCategoryOrAreaDetailPresenter) this.b).a(str);
        if (str2.equals(be.a(beo.e.netradio_allradio_title))) {
            this.e.a("AllRadioCategoryDetail");
            this.d.initVuiAttr("AllRadioCategoryDetail", VuiEngine.getInstance(getContext()), true, true, true);
            this.d.setVuiLabel(be.a(beo.e.vui_right));
            this.d.setVuiPriority(bik.LEVEL2);
            return;
        }
        this.e.a("RadioCategoryDetail");
        this.d.initVuiAttr("RadioCategoryDetail", VuiEngine.getInstance(getContext()), true, true, true);
    }

    public void setmId(int i) {
        ((NrCategoryOrAreaDetailPresenter) this.b).a(i);
    }

    public void g() {
        ((NrCategoryOrAreaDetailPresenter) this.b).c();
    }

    @Override // com.xiaopeng.musicradio.netradio.main.view.b
    public void a(List<NetRadioInfo> list) {
        a(0);
        this.d.setVisibility(0);
        if (this.e.a() != list.size()) {
            this.e.a((List) list, true);
        } else {
            this.e.a((List) list, false);
            this.e.a(0, list.size());
        }
        list.clear();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        this.d.setVisibility(8);
        a(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        this.d.setVisibility(8);
        a(2);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        this.d.setVisibility(8);
        a(3);
    }

    @Override // com.xiaopeng.musicradio.netradio.main.view.b
    public void a(boolean z) {
        if (z) {
            int l = this.e.l();
            if (l != -1) {
                this.e.c(l);
            }
            NetRadioProgramInfo d = aps.i().d();
            NetRadioInfo parentInfo = d != null ? d.getParentInfo() : null;
            List<NetRadioInfo> o = this.e.o();
            for (int i = 0; i < o.size(); i++) {
                if (parentInfo != null && parentInfo.getId() == o.get(i).getId()) {
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
        if (view.getId() == beo.c.allradio_loading) {
            ((NrCategoryOrAreaDetailPresenter) this.b).c();
        }
    }

    @Override // com.xiaopeng.musicradio.netradio.main.view.b
    public void O_() {
        i();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        i();
    }

    private void i() {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.main.view.NrCategoryOrAreaDetailLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    if (NrCategoryOrAreaDetailLayout.this.e == null || NrCategoryOrAreaDetailLayout.this.e.a() <= 0) {
                        return;
                    }
                    NrCategoryOrAreaDetailLayout.this.e.a(0, NrCategoryOrAreaDetailLayout.this.e.a(), "payload");
                }
            });
            return;
        }
        aun aunVar = this.e;
        if (aunVar == null || aunVar.a() <= 0) {
            return;
        }
        aun aunVar2 = this.e;
        aunVar2.a(0, aunVar2.a(), "payload");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h.a(this, configuration);
        if (acs.b(configuration)) {
            this.e.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.a((View) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.b(this);
    }
}
