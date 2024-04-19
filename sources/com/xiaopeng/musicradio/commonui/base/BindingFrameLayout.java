package com.xiaopeng.musicradio.commonui.base;

import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout;
/* loaded from: classes.dex */
public abstract class BindingFrameLayout<VDB extends ViewDataBinding, UIInterface, Presenter extends BasePresenter<UIInterface>> extends VuiBaseFrameLayout<UIInterface, Presenter> {
    protected VDB c;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void c() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void a(LayoutInflater layoutInflater) {
        super.a(layoutInflater);
        final View childAt = getChildAt(0);
        ban.j(new Runnable() { // from class: com.xiaopeng.musicradio.commonui.base.BindingFrameLayout.1
            @Override // java.lang.Runnable
            public void run() {
                BindingFrameLayout.this.c = (VDB) g.a(childAt);
                BindingFrameLayout.this.b();
                BindingFrameLayout.this.c();
                BindingFrameLayout.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout, com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, android.view.View
    public void onFinishInflate() {
        this.a = true;
        super.onFinishInflate();
    }
}
