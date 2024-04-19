package com.xiaopeng.musicradio.netradio.concentration.allradio.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.q;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.netradio.concentration.allradio.presenter.NrAllRadioPresenter;
import com.xiaopeng.musicradio.netradio.main.presenter.NrBasePresenter;
import com.xiaopeng.musicradio.netradio.main.view.NrBaseLayout;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import defpackage.beo;
/* loaded from: classes.dex */
public class NrAllRadioLayout extends NrBaseLayout implements View.OnClickListener, bic {
    private Context h;
    private XTextView i;
    private XLinearLayout j;

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        return null;
    }

    @Override // defpackage.bic
    public boolean onVuiElementEvent(View view, bio bioVar) {
        return false;
    }

    public NrAllRadioLayout(Context context) {
        super(context);
        this.h = context;
    }

    public NrAllRadioLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = context;
    }

    public NrAllRadioLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public NrAllRadioPresenter a() {
        return new NrAllRadioPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.i = (XTextView) findViewById(beo.c.allradio_tv);
        this.j = (XLinearLayout) findViewById(beo.c.title_layout);
        this.g = (LoadingTipsView) findViewById(beo.c.allradio_loading);
        this.g.setAutoClickLoadingEnable(false);
        this.d = (BaseRecycleView) findViewById(beo.c.allradio_rv);
        this.d.setVuiCanControlScroll(false);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.e = new aun(getContext());
        this.e.a("MainNetRadioConcentration");
        this.d.setItemAnimator(new e());
        h hVar = new h(3, 25, false);
        hVar.a(40);
        hVar.c(100);
        this.d.addItemDecoration(hVar);
        this.f = new GridLayoutManager(this.h, 3) { // from class: com.xiaopeng.musicradio.netradio.concentration.allradio.view.NrAllRadioLayout.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean g() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean h() {
                return false;
            }
        };
        this.d.setHasFixedSize(true);
        this.d.setLayoutManager(this.f);
        ((q) this.d.getItemAnimator()).a(false);
        this.d.setAdapter(this.e);
        this.d.enableViewVuiMode(true);
        this.d.initVuiAttr("MainNetRadioConcentration", VuiEngine.getInstance(getContext()), false, true, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.e.a(new aep.c() { // from class: com.xiaopeng.musicradio.netradio.concentration.allradio.view.NrAllRadioLayout.2
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                auo.a().a(NrAllRadioLayout.this.e.o().get(i2));
            }
        });
        this.j.setOnClickListener(this);
        this.g.setOnClickListener(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return beo.d.netradio_layout_allradio;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == beo.c.title_layout) {
            aup.b();
            sp.a().a("/xpnetradio/activity/allradio").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).navigation();
        } else if (id == beo.c.allradio_loading) {
            ((NrBasePresenter) this.b).c();
        }
    }

    @Override // com.xiaopeng.musicradio.netradio.main.view.a
    public void P_() {
        g();
    }

    @Override // com.xiaopeng.musicradio.netradio.main.view.NrBaseLayout, com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        g();
    }

    private void g() {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.concentration.allradio.view.NrAllRadioLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    if (NrAllRadioLayout.this.e == null || NrAllRadioLayout.this.e.a() <= 0) {
                        return;
                    }
                    NrAllRadioLayout.this.e.a(0, NrAllRadioLayout.this.e.a(), "payload");
                }
            });
        } else if (this.e == null || this.e.a() <= 0) {
        } else {
            this.e.a(0, this.e.a(), "payload");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.netradio.main.view.NrBaseLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g();
    }
}
