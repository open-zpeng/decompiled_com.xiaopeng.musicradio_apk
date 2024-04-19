package com.xiaopeng.musicradio.commonui.base;

import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import defpackage.aem;
/* compiled from: BindingActivity.java */
/* loaded from: classes.dex */
public abstract class c<VDB extends ViewDataBinding, UIInterface, Presenter extends BasePresenter<UIInterface>> extends com.xiaopeng.musicradio.commonui.vui.a<UIInterface, Presenter> {
    protected VDB f;

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    protected void aq_() {
        this.f = (VDB) g.a(this, f());
        this.f.f().setTag(aem.c.tag_lifecycle_owner, getLifecycle());
    }
}
