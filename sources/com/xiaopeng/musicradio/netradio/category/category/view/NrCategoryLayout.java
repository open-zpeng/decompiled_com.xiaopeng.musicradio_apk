package com.xiaopeng.musicradio.netradio.category.category.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.q;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.bean.netradio.NetRadioTagInfo;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.netradio.category.category.presenter.NrCategoryPresenter;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aep;
import defpackage.beo;
import java.util.List;
/* loaded from: classes.dex */
public class NrCategoryLayout extends BaseFrameLayout<b, NrCategoryPresenter> implements b {
    private LoadingTipsView c;
    private BaseRecycleView d;
    private aue e;
    private GridLayoutManager f;
    private Context g;
    private acv h;

    public NrCategoryLayout(Context context) {
        super(context);
        this.g = context;
    }

    public NrCategoryLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = context;
        this.h = acv.a(context, attributeSet);
    }

    public NrCategoryLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = context;
        this.h = acv.a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public NrCategoryPresenter a() {
        return new NrCategoryPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return beo.d.netradio_layout_category;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (LoadingTipsView) findViewById(beo.c.netradio_loading_item_category);
        this.c.setAutoClickLoadingEnable(false);
        this.d = (BaseRecycleView) findViewById(beo.c.netradio_rv_category);
        this.d.setVuiCanControlScroll(false);
        this.d.initVuiAttr("MainNetRadioCategory", VuiEngine.getInstance(getContext()), true, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        g();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.netradio.category.category.view.NrCategoryLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((NrCategoryPresenter) NrCategoryLayout.this.b).c();
            }
        });
        this.e.a(new aep.c() { // from class: com.xiaopeng.musicradio.netradio.category.category.view.NrCategoryLayout.2
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                NetRadioTagInfo g = NrCategoryLayout.this.e.g(i2);
                if (g != null) {
                    aup.d();
                    sp.a().a("/xpnetradio/activity/category_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withInt("radio_id", g.getBizVal()).withString("radio_title", g.getName()).navigation();
                }
            }
        });
    }

    private void g() {
        this.e = new aue(this.g);
        this.d.setItemAnimator(new e());
        h hVar = new h(3, 40, false);
        hVar.a(40);
        this.d.addItemDecoration(hVar);
        this.f = new GridLayoutManager(this.g, 3);
        this.d.setHasFixedSize(true);
        this.d.setLayoutManager(this.f);
        ((q) this.d.getItemAnimator()).a(false);
        this.d.setAdapter(this.e);
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

    @Override // com.xiaopeng.musicradio.netradio.category.category.view.b
    public void a(List<NetRadioTagInfo> list) {
        a(0);
        this.d.setVisibility(0);
        if (this.e.a() != list.size()) {
            Log.d("NRCategoryLayout", "NrCategoryLayout getData notify data changed");
            this.e.a((List) list, true);
        } else {
            this.e.a((List) list, false);
            this.e.a(0, list.size());
        }
        list.clear();
    }

    @Override // com.xiaopeng.musicradio.netradio.category.category.view.b
    public void K_() {
        i();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        i();
    }

    private void i() {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.category.category.view.NrCategoryLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    if (NrCategoryLayout.this.e == null || NrCategoryLayout.this.e.a() <= 0) {
                        return;
                    }
                    NrCategoryLayout.this.e.a(0, NrCategoryLayout.this.e.a(), "payload");
                }
            });
            return;
        }
        aue aueVar = this.e;
        if (aueVar == null || aueVar.a() <= 0) {
            return;
        }
        aue aueVar2 = this.e;
        aueVar2.a(0, aueVar2.a(), "payload");
    }

    private void a(int i) {
        this.c.setState(i);
        if (i == 1) {
            this.c.setClickable(false);
        } else {
            this.c.setClickable(true);
        }
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
