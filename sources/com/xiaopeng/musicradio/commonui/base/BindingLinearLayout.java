package com.xiaopeng.musicradio.commonui.base;

import androidx.databinding.ViewDataBinding;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.commonui.vui.VuiBaseLinearLayout;
/* loaded from: classes.dex */
public abstract class BindingLinearLayout<VDB extends ViewDataBinding, UIInterface, Presenter extends BasePresenter<UIInterface>> extends VuiBaseLinearLayout<UIInterface, Presenter> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseLinearLayout, com.xiaopeng.musicradio.commonui.base.BaseLinearLayout, android.view.View
    public void onFinishInflate() {
        this.a = true;
        super.onFinishInflate();
    }
}
