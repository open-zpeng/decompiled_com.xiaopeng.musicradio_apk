package com.xiaopeng.musicradio.commonui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
/* loaded from: classes.dex */
public class NoScrollViewPager extends MusicViewPager {
    @Override // com.xiaopeng.musicradio.commonui.widget.MusicViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.xiaopeng.musicradio.commonui.widget.MusicViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoScrollViewPager(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    @Override // com.xiaopeng.musicradio.commonui.widget.MusicViewPager
    public void a(int i, boolean z) {
        super.a(i, z);
    }

    @Override // com.xiaopeng.musicradio.commonui.widget.MusicViewPager
    public void setCurrentItem(int i) {
        super.a(i, false);
    }
}
