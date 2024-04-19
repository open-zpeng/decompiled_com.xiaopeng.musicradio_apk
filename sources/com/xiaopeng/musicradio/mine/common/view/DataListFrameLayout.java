package com.xiaopeng.musicradio.mine.common.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.datalist.h;
import com.xiaopeng.musicradio.mine.common.presenter.DataBasePresenter;
/* loaded from: classes.dex */
public abstract class DataListFrameLayout<UIInterface, Presenter extends BasePresenter<UIInterface>> extends BaseFrameLayout<UIInterface, Presenter> implements h {
    private com.xiaopeng.musicradio.datalist.b c;

    public DataListFrameLayout(Context context) {
        super(context);
    }

    public DataListFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DataListFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.xiaopeng.musicradio.datalist.h
    public void setDataHolder(com.xiaopeng.musicradio.datalist.b bVar) {
        this.c = bVar;
    }

    @Override // com.xiaopeng.musicradio.datalist.h
    public com.xiaopeng.musicradio.datalist.b getDataHolder() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (acs.b(configuration) && (this.b instanceof DataBasePresenter)) {
            if (this instanceof b) {
                ((b) this).j_();
            }
            ((DataBasePresenter) this.b).w();
        }
    }
}
