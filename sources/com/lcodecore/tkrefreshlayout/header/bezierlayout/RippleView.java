package com.lcodecore.tkrefreshlayout.header.bezierlayout;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public class RippleView extends View {
    ValueAnimator a;
    private Paint b;
    private int c;
    private a d;

    /* loaded from: classes.dex */
    public interface a {
    }

    public int getR() {
        return this.c;
    }

    public void setR(int i) {
        this.c = i;
    }

    public RippleView(Context context) {
        this(context, null, 0);
    }

    public RippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        this.b = new Paint();
        this.b.setAntiAlias(true);
        this.b.setColor(-1);
        this.b.setStyle(Paint.Style.FILL);
    }

    public void setRippleColor(int i) {
        Paint paint = this.b;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.c, this.b);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void setRippleEndListener(a aVar) {
        this.d = aVar;
    }
}
