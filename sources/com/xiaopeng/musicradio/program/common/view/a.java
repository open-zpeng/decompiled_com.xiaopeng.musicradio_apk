package com.xiaopeng.musicradio.program.common.view;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.program.activity.ProgramSubActivity;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.common.view.b;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.widget.DialogTopLayout;
import com.xiaopeng.musicradio.widget.d;
import com.xiaopeng.musicradio.widget.recyclerview.ListVuiRecyclerView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
/* compiled from: BaseSubListFragment.java */
/* loaded from: classes2.dex */
public abstract class a<UIInterface extends b, Presenter extends BasePresenter<UIInterface>> extends d<UIInterface, Presenter> implements b {
    protected ListVuiRecyclerView e;
    protected DialogTopLayout f;
    protected GridLayoutManager g;

    protected int W_() {
        return 4;
    }

    protected abstract void r();

    protected abstract awe s();

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return b.e.fragment_common_list;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.e = (ListVuiRecyclerView) a(b.d.rv_reading);
        this.f = (DialogTopLayout) a(b.d.dialog_top_layout);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    public void g() {
        this.f.a(false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(b.C0158b.dp_38);
        h hVar = new h(W_(), 33, false);
        hVar.a(dimensionPixelSize);
        hVar.c(0);
        hVar.b(0);
        this.e.getRecycledViewPool().a(0, 30);
        this.e.addItemDecoration(hVar);
        this.g = new GridLayoutManager(getContext(), W_());
        this.e.setGridLayoutManager(this.g);
        this.e.setOnLoadMoreListener(new ListVuiRecyclerView.c() { // from class: com.xiaopeng.musicradio.program.common.view.a.1
            @Override // com.xiaopeng.musicradio.widget.recyclerview.ListVuiRecyclerView.c
            public void a() {
                if (NetUtils.isNetworkAvailable(a.this.getContext())) {
                    a.this.r();
                    return;
                }
                ak.a(a.this.getContext(), b.f.net_error_tip);
                if (a.this.s() != null && a.this.s().l() != null) {
                    a.this.s().l().setVisibility(8);
                }
                a.this.e.c();
            }

            @Override // com.xiaopeng.musicradio.widget.recyclerview.ListVuiRecyclerView.c
            public void a(boolean z) {
                if (a.this.s() == null || a.this.s().l() == null) {
                    return;
                }
                if (z) {
                    a.this.s().l().setVisibility(0);
                } else {
                    a.this.s().l().setVisibility(8);
                }
            }
        });
        this.f.setTitle(a("category_name"));
        this.f.setCloseListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.common.view.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (a.this.getActivity() instanceof ProgramSubActivity) {
                    ((ProgramSubActivity) a.this.getActivity()).u();
                }
            }
        });
        this.e.initVuiAttr(o(), VuiEngine.getInstance(getContext()), true, true, true);
    }

    @Override // com.xiaopeng.musicradio.program.common.view.b
    public void a(boolean z, int i, int i2) {
        if (z) {
            if (i == 1) {
                this.e.setTipViewClickable(false);
                this.e.setTipsState(1);
                return;
            }
            return;
        }
        this.e.setTipsState(0);
        if (i >= 1 && i2 >= 1 && i < i2) {
            this.e.setLoadMoreEnable(true);
        } else {
            this.e.setLoadMoreEnable(false);
        }
        this.e.c();
        if (s() == null || s().l() == null) {
            return;
        }
        s().l().setVisibility(8);
    }

    protected String a(String str) {
        if (getArguments() != null) {
            return getArguments().getString(str, "");
        }
        return null;
    }

    @Override // com.xiaopeng.musicradio.program.common.view.b
    public void X_() {
        this.e.setTipViewClickable(true);
        this.e.setTipsState(3);
        if (s() == null || s().l() == null) {
            return;
        }
        s().l().setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.program.common.view.b
    public void a(String str, int i) {
        this.e.setTipViewClickable(true);
        if (i == 1) {
            this.e.setTipsState(2);
        } else {
            this.e.setTipsState(0);
        }
        if (s() == null || s().l() == null) {
            return;
        }
        s().l().setVisibility(8);
    }

    public void a_(long j) {
        if (this.e.getAdapter() != null) {
            if (j == 0) {
                this.e.getAdapter().d();
            } else if (this.e.getAdapter() instanceof awo) {
                ((awo) this.e.getAdapter()).a(j);
            } else {
                this.e.getAdapter().d();
            }
        }
    }
}
