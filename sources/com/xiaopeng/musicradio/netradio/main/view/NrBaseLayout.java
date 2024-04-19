package com.xiaopeng.musicradio.netradio.main.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.GridLayoutManager;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.netradio.main.presenter.NrBasePresenter;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class NrBaseLayout extends BaseFrameLayout<a, NrBasePresenter<a>> implements bic, a {
    public Context c;
    public BaseRecycleView d;
    public aun e;
    public GridLayoutManager f;
    public LoadingTipsView g;
    private acv h;

    public NrBaseLayout(Context context) {
        super(context);
        this.c = context;
    }

    public NrBaseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
        this.h = acv.a(context, attributeSet);
    }

    public NrBaseLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = context;
        this.h = acv.a(context, attributeSet);
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

    @Override // com.xiaopeng.musicradio.netradio.main.view.a
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

    @Override // com.xiaopeng.musicradio.netradio.main.view.a
    public void a(boolean z) {
        if (z) {
            int l = this.e.l();
            if (l != -1) {
                this.e.c(l);
            }
            ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.main.view.NrBaseLayout.1
                @Override // java.lang.Runnable
                public void run() {
                    NetRadioProgramInfo d = aps.i().d();
                    NetRadioInfo parentInfo = d != null ? d.getParentInfo() : null;
                    List<NetRadioInfo> o = NrBaseLayout.this.e.o();
                    for (final int i = 0; i < o.size(); i++) {
                        if (parentInfo != null && parentInfo.getId() == o.get(i).getId()) {
                            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.main.view.NrBaseLayout.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    NrBaseLayout.this.e.c(i);
                                }
                            });
                        }
                    }
                }
            });
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h.a(this, configuration);
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

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
    }
}
