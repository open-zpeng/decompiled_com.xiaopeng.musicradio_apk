package com.xiaopeng.musicradio.commonui.base;

import androidx.databinding.ViewDataBinding;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.commonui.vui.VuiBaseRelativeLayout;
/* loaded from: classes.dex */
public abstract class BindingRelativeLayout<VDB extends ViewDataBinding, UIInterface, Presenter extends BasePresenter<UIInterface>> extends VuiBaseRelativeLayout<UIInterface, Presenter> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseRelativeLayout, com.xiaopeng.musicradio.commonui.base.BaseRelativeLayout, android.view.View
    public void onFinishInflate() {
        this.a = true;
        super.onFinishInflate();
    }
}
