package com.to.aboomy.banner;

import android.content.Context;
import android.widget.Scroller;
/* loaded from: classes.dex */
class ViewPagerScroller extends Scroller {
    private int scrollDuration;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewPagerScroller(Context context) {
        super(context);
        this.scrollDuration = 800;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.scrollDuration);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.scrollDuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setScrollDuration(int i) {
        this.scrollDuration = i;
    }
}
