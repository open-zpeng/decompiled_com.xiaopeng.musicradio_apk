package com.lcodecore.tkrefreshlayout.header.bezierlayout;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
/* loaded from: classes.dex */
public class RoundProgressView extends View {
    ValueAnimator a;
    private Paint b;
    private Paint c;
    private float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private RectF j;
    private RectF k;

    public void setCir_x(int i) {
        this.i = i;
    }

    public RoundProgressView(Context context) {
        this(context, null, 0);
    }

    public RoundProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 40.0f;
        this.e = 7;
        this.f = 270;
        this.g = 0;
        this.h = 15;
        a();
    }

    private void a() {
        this.b = new Paint();
        this.c = new Paint();
        this.c.setColor(-1);
        this.c.setAntiAlias(true);
        this.b.setAntiAlias(true);
        this.b.setColor(Color.rgb(114, 114, 114));
        this.a = ValueAnimator.ofInt(0, 360);
        this.a.setDuration(720L);
        this.a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.lcodecore.tkrefreshlayout.header.bezierlayout.RoundProgressView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RoundProgressView.this.g = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                RoundProgressView.this.postInvalidate();
            }
        });
        this.a.setRepeatCount(-1);
        this.a.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth() / this.e;
        this.b.setStyle(Paint.Style.FILL);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, this.d, this.b);
        canvas.save();
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setStrokeWidth(6.0f);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, this.d + 15.0f, this.b);
        canvas.restore();
        this.c.setStyle(Paint.Style.FILL);
        if (this.j == null) {
            this.j = new RectF();
        }
        this.j.set((getMeasuredWidth() / 2) - this.d, (getMeasuredHeight() / 2) - this.d, (getMeasuredWidth() / 2) + this.d, (getMeasuredHeight() / 2) + this.d);
        canvas.drawArc(this.j, this.f, this.g, true, this.c);
        canvas.save();
        this.c.setStrokeWidth(6.0f);
        this.c.setStyle(Paint.Style.STROKE);
        if (this.k == null) {
            this.k = new RectF();
        }
        this.k.set(((getMeasuredWidth() / 2) - this.d) - this.h, ((getMeasuredHeight() / 2) - this.d) - this.h, (getMeasuredWidth() / 2) + this.d + this.h, (getMeasuredHeight() / 2) + this.d + this.h);
        canvas.drawArc(this.k, this.f, this.g, false, this.c);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
