package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.lcodecore.tkrefreshlayout.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: BallPulseView.java */
/* renamed from: aaj  reason: default package */
/* loaded from: classes2.dex */
public class aaj extends View implements a {
    private float a;
    private float[] b;
    private ArrayList<ValueAnimator> c;
    private Map<ValueAnimator, ValueAnimator.AnimatorUpdateListener> d;
    private Paint e;
    private int f;
    private int g;

    @Override // com.lcodecore.tkrefreshlayout.a
    public View getView() {
        return this;
    }

    public aaj(Context context) {
        this(context, null);
    }

    public aaj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public aaj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new float[]{1.0f, 1.0f, 1.0f};
        this.d = new HashMap();
        this.f = -1118482;
        this.g = -1615546;
        int a = aaq.a(context, 50.0f);
        setLayoutParams(new FrameLayout.LayoutParams(a, a, 17));
        this.a = aaq.a(context, 4.0f);
        this.e = new Paint();
        this.e.setColor(-1);
        this.e.setStyle(Paint.Style.FILL);
        this.e.setAntiAlias(true);
    }

    public void setIndicatorColor(int i) {
        this.e.setColor(i);
    }

    public void setNormalColor(int i) {
        this.f = i;
    }

    public void setAnimatingColor(int i) {
        this.g = i;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float min = (Math.min(getWidth(), getHeight()) - (this.a * 2.0f)) / 6.0f;
        float f = 2.0f * min;
        float width = (getWidth() / 2) - (this.a + f);
        float height = getHeight() / 2;
        for (int i = 0; i < 3; i++) {
            canvas.save();
            float f2 = i;
            canvas.translate((f * f2) + width + (this.a * f2), height);
            float[] fArr = this.b;
            canvas.scale(fArr[i], fArr[i]);
            canvas.drawCircle(0.0f, 0.0f, min, this.e);
            canvas.restore();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.c != null) {
            for (int i = 0; i < this.c.size(); i++) {
                this.c.get(i).cancel();
            }
        }
    }

    public void c() {
        if (this.c == null) {
            f();
        }
        if (this.c == null || e()) {
            return;
        }
        for (int i = 0; i < this.c.size(); i++) {
            ValueAnimator valueAnimator = this.c.get(i);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.d.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
        setIndicatorColor(this.g);
    }

    public void d() {
        ArrayList<ValueAnimator> arrayList = this.c;
        if (arrayList != null) {
            Iterator<ValueAnimator> it = arrayList.iterator();
            while (it.hasNext()) {
                ValueAnimator next = it.next();
                if (next != null && next.isStarted()) {
                    next.removeAllUpdateListeners();
                    next.end();
                }
            }
        }
        setIndicatorColor(this.f);
    }

    private boolean e() {
        Iterator<ValueAnimator> it = this.c.iterator();
        if (it.hasNext()) {
            return it.next().isStarted();
        }
        return false;
    }

    private void f() {
        this.c = new ArrayList<>();
        int[] iArr = {120, PsExtractor.VIDEO_STREAM_MASK, 360};
        for (final int i = 0; i < 3; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            ofFloat.setDuration(750L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay(iArr[i]);
            this.d.put(ofFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: aaj.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    aaj.this.b[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    aaj.this.postInvalidate();
                }
            });
            this.c.add(ofFloat);
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.a
    public void a(float f, float f2, float f3) {
        d();
    }

    @Override // com.lcodecore.tkrefreshlayout.a
    public void a(float f, float f2) {
        c();
    }

    @Override // com.lcodecore.tkrefreshlayout.a
    public void b(float f, float f2, float f3) {
        d();
    }

    @Override // com.lcodecore.tkrefreshlayout.a
    public void a() {
        d();
    }

    @Override // com.lcodecore.tkrefreshlayout.a
    public void b() {
        d();
    }
}
