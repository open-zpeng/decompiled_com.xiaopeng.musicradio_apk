package defpackage;

import android.view.Choreographer;
import com.airbnb.lottie.d;
/* compiled from: LottieValueAnimator.java */
/* renamed from: rz  reason: default package */
/* loaded from: classes3.dex */
public class rz extends rx implements Choreographer.FrameCallback {
    private d i;
    private float b = 1.0f;
    private boolean c = false;
    private long d = 0;
    private float e = 0.0f;
    private int f = 0;
    private float g = -2.14748365E9f;
    private float h = 2.14748365E9f;
    protected boolean a = false;

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    public float d() {
        d dVar = this.i;
        if (dVar == null) {
            return 0.0f;
        }
        return (this.e - dVar.d()) / (this.i.e() - this.i.d());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        if (this.i == null) {
            return 0.0f;
        }
        if (p()) {
            return (l() - this.e) / (l() - k());
        }
        return (this.e - k()) / (l() - k());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        d dVar = this.i;
        if (dVar == null) {
            return 0L;
        }
        return dVar.c();
    }

    public float e() {
        return this.e;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.a;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        m();
        if (this.i == null || !isRunning()) {
            return;
        }
        long nanoTime = System.nanoTime();
        float o = ((float) (nanoTime - this.d)) / o();
        float f = this.e;
        if (p()) {
            o = -o;
        }
        this.e = f + o;
        boolean z = !sb.c(this.e, k(), l());
        this.e = sb.b(this.e, k(), l());
        this.d = nanoTime;
        c();
        if (z) {
            if (getRepeatCount() != -1 && this.f >= getRepeatCount()) {
                this.e = l();
                n();
                b(p());
            } else {
                a();
                this.f++;
                if (getRepeatMode() == 2) {
                    this.c = !this.c;
                    g();
                } else {
                    this.e = p() ? l() : k();
                }
                this.d = nanoTime;
            }
        }
        q();
    }

    private float o() {
        d dVar = this.i;
        if (dVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dVar.f()) / Math.abs(this.b);
    }

    public void f() {
        this.i = null;
        this.g = -2.14748365E9f;
        this.h = 2.14748365E9f;
    }

    public void a(d dVar) {
        boolean z = this.i == null;
        this.i = dVar;
        if (z) {
            a((int) Math.max(this.g, dVar.d()), (int) Math.min(this.h, dVar.e()));
        } else {
            a((int) dVar.d(), (int) dVar.e());
        }
        a((int) this.e);
        this.d = System.nanoTime();
    }

    public void a(int i) {
        float f = i;
        if (this.e == f) {
            return;
        }
        this.e = sb.b(f, k(), l());
        this.d = System.nanoTime();
        c();
    }

    public void b(int i) {
        a(i, (int) this.h);
    }

    public void c(int i) {
        a((int) this.g, i);
    }

    public void a(int i, int i2) {
        d dVar = this.i;
        float d = dVar == null ? -3.4028235E38f : dVar.d();
        d dVar2 = this.i;
        float e = dVar2 == null ? Float.MAX_VALUE : dVar2.e();
        float f = i;
        this.g = sb.b(f, d, e);
        float f2 = i2;
        this.h = sb.b(f2, d, e);
        a((int) sb.b(this.e, f, f2));
    }

    public void g() {
        a(-h());
    }

    public void a(float f) {
        this.b = f;
    }

    public float h() {
        return this.b;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.c) {
            return;
        }
        this.c = false;
        g();
    }

    public void i() {
        this.a = true;
        a(p());
        a((int) (p() ? l() : k()));
        this.d = System.nanoTime();
        this.f = 0;
        m();
    }

    public void j() {
        n();
        b(p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        b();
        n();
    }

    private boolean p() {
        return h() < 0.0f;
    }

    public float k() {
        d dVar = this.i;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.g;
        return f == -2.14748365E9f ? dVar.d() : f;
    }

    public float l() {
        d dVar = this.i;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.h;
        return f == 2.14748365E9f ? dVar.e() : f;
    }

    protected void m() {
        if (isRunning()) {
            c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void n() {
        c(true);
    }

    protected void c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.a = false;
        }
    }

    private void q() {
        if (this.i == null) {
            return;
        }
        float f = this.e;
        if (f < this.g || f > this.h) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.g), Float.valueOf(this.h), Float.valueOf(this.e)));
        }
    }
}
