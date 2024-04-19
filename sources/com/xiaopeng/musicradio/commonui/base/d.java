package com.xiaopeng.musicradio.commonui.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
/* compiled from: BindingFragment.java */
/* loaded from: classes.dex */
public abstract class d<VDB extends ViewDataBinding, UIInterface, Presenter extends BasePresenter<UIInterface>> extends com.xiaopeng.musicradio.commonui.vui.b<UIInterface, Presenter> {
    protected VDB d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    public void E_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected final boolean az_() {
        return false;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a = super.a(layoutInflater, viewGroup);
        this.d = (VDB) g.a(a);
        return a;
    }
}
