package com.xiaopeng.musicradio.widget;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.o;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.aa;
/* loaded from: classes2.dex */
public class SmallLoadingView extends o {
    protected int a;
    private Animator b;
    private DrawFilter c;

    public SmallLoadingView(Context context) {
        super(context);
        this.a = f.e.ic_loading;
        c();
    }

    public SmallLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = f.e.ic_loading;
        a(context, attributeSet, 0);
        c();
    }

    public SmallLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = f.e.ic_loading;
        a(context, attributeSet, i);
        c();
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.SmallLoadingView);
        this.a = obtainStyledAttributes.getResourceId(f.j.SmallLoadingView_loadingBackground, f.e.ic_loading);
        obtainStyledAttributes.recycle();
    }

    private void c() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        setLayerType(1, paint);
        this.c = new PaintFlagsDrawFilter(0, 3);
    }

    public void a() {
        aa.a(this.a, (ImageView) this);
        if (this.b == null) {
            this.b = AnimatorInflater.loadAnimator(getContext(), f.a.animator_rotate);
            this.b.setTarget(this);
            this.b.start();
        }
        setVisibility(0);
    }

    public void b() {
        Animator animator = this.b;
        if (animator != null) {
            animator.cancel();
            this.b = null;
        }
        setVisibility(8);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.setDrawFilter(this.c);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        invalidate();
    }
}
