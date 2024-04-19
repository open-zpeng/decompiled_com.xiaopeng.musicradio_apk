package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.util.AttributeSet;
/* loaded from: classes2.dex */
public class ClickableLoadingTipsView extends LoadingTipsView {
    public ClickableLoadingTipsView(Context context) {
        this(context, null);
    }

    public ClickableLoadingTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClickableLoadingTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAutoClickLoadingEnable(false);
    }
}
