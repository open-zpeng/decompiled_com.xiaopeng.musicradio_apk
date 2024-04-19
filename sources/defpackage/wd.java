package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* compiled from: MotionTiming.java */
/* renamed from: wd  reason: default package */
/* loaded from: classes3.dex */
public class wd {
    private long a;
    private long b;
    private TimeInterpolator c;
    private int d;
    private int e;

    public wd(long j, long j2) {
        this.a = 0L;
        this.b = 300L;
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
    }

    public wd(long j, long j2, TimeInterpolator timeInterpolator) {
        this.a = 0L;
        this.b = 300L;
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(a());
        animator.setDuration(b());
        animator.setInterpolator(c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(d());
            valueAnimator.setRepeatMode(e());
        }
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public TimeInterpolator c() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : vv.b;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static wd a(ValueAnimator valueAnimator) {
        wd wdVar = new wd(valueAnimator.getStartDelay(), valueAnimator.getDuration(), b(valueAnimator));
        wdVar.d = valueAnimator.getRepeatCount();
        wdVar.e = valueAnimator.getRepeatMode();
        return wdVar;
    }

    private static TimeInterpolator b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return vv.b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return vv.c;
        }
        return interpolator instanceof DecelerateInterpolator ? vv.d : interpolator;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wd) {
            wd wdVar = (wd) obj;
            if (a() == wdVar.a() && b() == wdVar.b() && d() == wdVar.d() && e() == wdVar.e()) {
                return c().getClass().equals(wdVar.c().getClass());
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (a() ^ (a() >>> 32))) * 31) + ((int) (b() ^ (b() >>> 32)))) * 31) + c().getClass().hashCode()) * 31) + d()) * 31) + e();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + a() + " duration: " + b() + " interpolator: " + c().getClass() + " repeatCount: " + d() + " repeatMode: " + e() + "}\n";
    }
}
