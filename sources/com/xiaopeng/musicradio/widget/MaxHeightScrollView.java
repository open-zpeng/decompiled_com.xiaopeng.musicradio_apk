package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.xiaopeng.musicradio.common.f;
/* loaded from: classes2.dex */
public class MaxHeightScrollView extends ScrollView {
    private int a;
    private boolean b;

    public MaxHeightScrollView(Context context) {
        this(context, null);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.MaxHeightScrollView);
        this.a = obtainStyledAttributes.getDimensionPixelSize(f.j.MaxHeightScrollView_max_height, -2);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.a, Integer.MIN_VALUE));
    }

    public void setMaxHeight(int i) {
        this.a = i;
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setScrollEnable(boolean z) {
        this.b = z;
    }
}
