package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.d;
/* compiled from: Keyframe.java */
/* renamed from: sd  reason: default package */
/* loaded from: classes3.dex */
public class sd<T> {
    public final T a;
    public final T b;
    public final Interpolator c;
    public final float d;
    public Float e;
    public PointF f;
    public PointF g;
    private final d h;
    private float i;
    private float j;

    public sd(d dVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.i = Float.MIN_VALUE;
        this.j = Float.MIN_VALUE;
        this.f = null;
        this.g = null;
        this.h = dVar;
        this.a = t;
        this.b = t2;
        this.c = interpolator;
        this.d = f;
        this.e = f2;
    }

    public sd(T t) {
        this.i = Float.MIN_VALUE;
        this.j = Float.MIN_VALUE;
        this.f = null;
        this.g = null;
        this.h = null;
        this.a = t;
        this.b = t;
        this.c = null;
        this.d = Float.MIN_VALUE;
        this.e = Float.valueOf(Float.MAX_VALUE);
    }

    public float b() {
        d dVar = this.h;
        if (dVar == null) {
            return 0.0f;
        }
        if (this.i == Float.MIN_VALUE) {
            this.i = (this.d - dVar.d()) / this.h.k();
        }
        return this.i;
    }

    public float c() {
        if (this.h == null) {
            return 1.0f;
        }
        if (this.j == Float.MIN_VALUE) {
            if (this.e == null) {
                this.j = 1.0f;
            } else {
                this.j = b() + ((this.e.floatValue() - this.d) / this.h.k());
            }
        }
        return this.j;
    }

    public boolean d() {
        return this.c == null;
    }

    public boolean a(float f) {
        return f >= b() && f < c();
    }

    public String toString() {
        return "Keyframe{startValue=" + this.a + ", endValue=" + this.b + ", startFrame=" + this.d + ", endFrame=" + this.e + ", interpolator=" + this.c + '}';
    }
}
