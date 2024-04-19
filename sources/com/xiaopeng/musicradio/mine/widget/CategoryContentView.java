package com.xiaopeng.musicradio.mine.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import com.xiaopeng.xui.theme.XThemeManager;
import com.xiaopeng.xui.widget.XRelativeLayout;
/* loaded from: classes.dex */
public class CategoryContentView extends XRelativeLayout {
    private a a;

    public CategoryContentView(Context context) {
        super(context);
    }

    public CategoryContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CategoryContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XRelativeLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        a aVar;
        super.onConfigurationChanged(configuration);
        if (!XThemeManager.isThemeChanged(configuration) || (aVar = this.a) == null) {
            return;
        }
        aVar.b();
    }

    public void setCategoryViewHolder(a aVar) {
        this.a = aVar;
    }
}
