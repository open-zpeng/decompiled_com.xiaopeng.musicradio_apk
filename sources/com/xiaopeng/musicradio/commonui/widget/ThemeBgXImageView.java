package com.xiaopeng.musicradio.commonui.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import com.xiaopeng.xui.theme.XThemeManager;
import com.xiaopeng.xui.widget.XImageView;
/* loaded from: classes.dex */
public class ThemeBgXImageView extends XImageView {
    private int a;

    public ThemeBgXImageView(Context context) {
        super(context);
    }

    public ThemeBgXImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ThemeBgXImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.appcompat.widget.o, android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XImageView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        if (!XThemeManager.isThemeChanged(configuration) || (i = this.a) == 0) {
            return;
        }
        super.setBackgroundResource(i);
    }
}
