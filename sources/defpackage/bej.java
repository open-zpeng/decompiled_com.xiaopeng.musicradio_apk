package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: Indicator.java */
/* renamed from: bej  reason: default package */
/* loaded from: classes2.dex */
public abstract class bej extends Drawable implements Animatable {
    private static final Rect e = new Rect();
    private ArrayList<ValueAnimator> c;
    private boolean f;
    private HashMap<ValueAnimator, ValueAnimator.AnimatorUpdateListener> b = new HashMap<>();
    private int d = 255;
    protected Rect a = e;
    private Paint g = new Paint();

    public abstract ArrayList<ValueAnimator> a();

    public abstract void a(Canvas canvas, Paint paint);

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public bej() {
        this.g.setColor(-16777216);
        this.g.setStyle(Paint.Style.FILL);
        this.g.setAntiAlias(true);
    }

    public void a(int i) {
        this.g.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.d = i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        a(canvas, this.g);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        g();
        if (this.c == null || h()) {
            return;
        }
        e();
        invalidateSelf();
    }

    private void e() {
        for (int i = 0; i < this.c.size(); i++) {
            ValueAnimator valueAnimator = this.c.get(i);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.b.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
    }

    private void f() {
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
    }

    private void g() {
        if (this.f) {
            return;
        }
        this.c = a();
        this.f = true;
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        f();
    }

    private boolean h() {
        Iterator<ValueAnimator> it = this.c.iterator();
        if (it.hasNext()) {
            return it.next().isStarted();
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ArrayList<ValueAnimator> arrayList = this.c;
        if (arrayList == null) {
            return false;
        }
        Iterator<ValueAnimator> it = arrayList.iterator();
        if (it.hasNext()) {
            return it.next().isRunning();
        }
        return false;
    }

    public void a(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.b.put(valueAnimator, animatorUpdateListener);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    public void a(Rect rect) {
        a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.a = new Rect(i, i2, i3, i4);
    }

    public void b() {
        invalidateSelf();
    }

    public int c() {
        return this.a.width();
    }

    public int d() {
        return this.a.height();
    }
}
