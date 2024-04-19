package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.alibaba.fastjson.asm.Opcodes;
import com.lcodecore.tkrefreshlayout.b;
import com.lcodecore.tkrefreshlayout.c;
import com.lcodecore.tkrefreshlayout.f;
/* compiled from: GoogleDotView.java */
/* renamed from: aak  reason: default package */
/* loaded from: classes2.dex */
public class aak extends View implements b {
    float a;
    float b;
    boolean c;
    ValueAnimator d;
    ValueAnimator e;
    private Paint f;
    private float g;
    private int h;
    private int i;

    @Override // com.lcodecore.tkrefreshlayout.b
    public View getView() {
        return this;
    }

    public void setCir_x(int i) {
        this.i = i;
    }

    public aak(Context context) {
        this(context, null, 0);
    }

    public aak(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 5;
        this.c = false;
        b();
    }

    private void b() {
        this.g = aaq.a(getContext(), 4.0f);
        this.f = new Paint();
        this.f.setAntiAlias(true);
        this.f.setColor(Color.rgb(114, 114, 114));
        this.d = ValueAnimator.ofFloat(1.0f, 1.2f, 1.0f, 0.8f);
        this.d.setDuration(800L);
        this.d.setInterpolator(new DecelerateInterpolator());
        this.d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: aak.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                aak.this.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aak.this.invalidate();
            }
        });
        this.d.setRepeatCount(-1);
        this.d.setRepeatMode(2);
        this.e = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f, 1.2f);
        this.e.setDuration(800L);
        this.e.setInterpolator(new DecelerateInterpolator());
        this.e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: aak.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                aak.this.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        this.e.setRepeatCount(-1);
        this.e.setRepeatMode(2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = (getMeasuredWidth() / this.h) - 10;
        for (int i = 0; i < this.h; i++) {
            if (this.c) {
                switch (i) {
                    case 0:
                        this.f.setAlpha(105);
                        this.f.setColor(getResources().getColor(f.a.Yellow));
                        canvas.drawCircle(((getMeasuredWidth() / 2) - (this.i * 2)) - (((measuredWidth * 2) / 3) * 2), getMeasuredHeight() / 2, this.g * this.b, this.f);
                        continue;
                    case 1:
                        this.f.setAlpha(Opcodes.I2B);
                        this.f.setColor(getResources().getColor(f.a.Green));
                        canvas.drawCircle(((getMeasuredWidth() / 2) - (this.i * 1)) - ((measuredWidth / 3) * 2), getMeasuredHeight() / 2, this.g * this.b, this.f);
                        continue;
                    case 2:
                        this.f.setAlpha(255);
                        this.f.setColor(getResources().getColor(f.a.Blue));
                        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, this.g * this.a, this.f);
                        continue;
                    case 3:
                        this.f.setAlpha(Opcodes.I2B);
                        this.f.setColor(getResources().getColor(f.a.Orange));
                        canvas.drawCircle((getMeasuredWidth() / 2) + (this.i * 1) + ((measuredWidth / 3) * 2), getMeasuredHeight() / 2, this.g * this.b, this.f);
                        continue;
                    case 4:
                        this.f.setAlpha(105);
                        this.f.setColor(getResources().getColor(f.a.Yellow));
                        canvas.drawCircle((getMeasuredWidth() / 2) + (this.i * 2) + (((measuredWidth * 2) / 3) * 2), getMeasuredHeight() / 2, this.g * this.b, this.f);
                        continue;
                }
            } else {
                switch (i) {
                    case 0:
                        this.f.setAlpha(105);
                        this.f.setColor(getResources().getColor(f.a.Yellow));
                        canvas.drawCircle(((getMeasuredWidth() / 2) - (this.i * 2)) - (((measuredWidth * 2) / 3) * 2), getMeasuredHeight() / 2, this.g, this.f);
                        continue;
                    case 1:
                        this.f.setAlpha(Opcodes.I2B);
                        this.f.setColor(getResources().getColor(f.a.Green));
                        canvas.drawCircle(((getMeasuredWidth() / 2) - (this.i * 1)) - ((measuredWidth / 3) * 2), getMeasuredHeight() / 2, this.g, this.f);
                        continue;
                    case 2:
                        this.f.setAlpha(255);
                        this.f.setColor(getResources().getColor(f.a.Blue));
                        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, this.g, this.f);
                        continue;
                    case 3:
                        this.f.setAlpha(Opcodes.I2B);
                        this.f.setColor(getResources().getColor(f.a.Orange));
                        canvas.drawCircle((getMeasuredWidth() / 2) + (this.i * 1) + ((measuredWidth / 3) * 2), getMeasuredHeight() / 2, this.g, this.f);
                        continue;
                    case 4:
                        this.f.setAlpha(105);
                        this.f.setColor(getResources().getColor(f.a.Yellow));
                        canvas.drawCircle((getMeasuredWidth() / 2) + (this.i * 2) + (((measuredWidth * 2) / 3) * 2), getMeasuredHeight() / 2, this.g, this.f);
                        continue;
                }
            }
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.b
    public void a(float f, float f2, float f3) {
        float f4 = (f / 2.0f) + 1.0f;
        setScaleX(f4);
        setScaleY(f4);
        this.c = false;
        if (this.d.isRunning()) {
            this.d.cancel();
            invalidate();
        }
        if (this.e.isRunning()) {
            this.e.cancel();
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.b
    public void b(float f, float f2, float f3) {
        float f4 = (f / 2.0f) + 1.0f;
        setScaleX(f4);
        setScaleY(f4);
        if (f < 1.0f) {
            this.c = false;
            if (this.d.isRunning()) {
                this.d.cancel();
                invalidate();
            }
            if (this.e.isRunning()) {
                this.e.cancel();
            }
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.b
    public void a(float f, float f2) {
        this.c = true;
        this.d.start();
        this.e.start();
    }

    @Override // com.lcodecore.tkrefreshlayout.b
    public void a(c cVar) {
        cVar.a();
    }

    @Override // com.lcodecore.tkrefreshlayout.b
    public void a() {
        this.c = false;
        if (this.d.isRunning()) {
            this.d.cancel();
        }
        if (this.e.isRunning()) {
            this.e.cancel();
        }
        invalidate();
    }
}
