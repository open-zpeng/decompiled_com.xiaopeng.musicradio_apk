package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.xui.drawable.XLoadingDrawable;
/* loaded from: classes2.dex */
public class PlayAllLogoNoCoverLayout extends PlayAllLogoLayout {
    public PlayAllLogoNoCoverLayout(Context context) {
        super(context);
    }

    public PlayAllLogoNoCoverLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        XLoadingDrawable xLoadingDrawable = new XLoadingDrawable();
        xLoadingDrawable.setType(0);
        xLoadingDrawable.setColorFilter(new PorterDuffColorFilter(getContext().getColor(f.c.x_theme_text_01), PorterDuff.Mode.SRC_ATOP));
        this.b.setBackground(xLoadingDrawable);
    }

    @Override // com.xiaopeng.musicradio.widget.PlayAllLogoLayout
    protected int getLayoutId() {
        return f.g.layout_playall_no_cover;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.setCompoundDrawableTintList(ColorStateList.valueOf(getContext().getColor(f.c.x_theme_text_01)));
        XLoadingDrawable xLoadingDrawable = new XLoadingDrawable();
        xLoadingDrawable.setType(0);
        xLoadingDrawable.setColorFilter(new PorterDuffColorFilter(getContext().getColor(f.c.x_theme_text_01), PorterDuff.Mode.SRC_ATOP));
        this.b.setBackground(xLoadingDrawable);
    }
}
