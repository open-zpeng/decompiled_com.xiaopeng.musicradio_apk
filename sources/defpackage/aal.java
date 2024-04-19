package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
/* compiled from: AnimProcessor.java */
/* renamed from: aal  reason: default package */
/* loaded from: classes2.dex */
public class aal {
    private TwinklingRefreshLayout.a a;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private ValueAnimator.AnimatorUpdateListener o = new ValueAnimator.AnimatorUpdateListener() { // from class: aal.2
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (!aal.this.c || !aal.this.a.c()) {
                aal.this.a.l().getLayoutParams().height = intValue;
                aal.this.a.l().requestLayout();
                aal.this.a.l().setTranslationY(0.0f);
                aal.this.a.c(intValue);
            } else {
                aal.this.c(intValue);
            }
            if (aal.this.a.J()) {
                return;
            }
            aal.this.a.k().setTranslationY(intValue);
            aal.this.c(intValue);
        }
    };
    private ValueAnimator.AnimatorUpdateListener p = new ValueAnimator.AnimatorUpdateListener() { // from class: aal.3
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (!aal.this.d || !aal.this.a.c()) {
                aal.this.a.m().getLayoutParams().height = intValue;
                aal.this.a.m().requestLayout();
                aal.this.a.m().setTranslationY(0.0f);
                aal.this.a.d(intValue);
            } else {
                aal.this.d(intValue);
            }
            aal.this.a.k().setTranslationY(-intValue);
        }
    };
    private ValueAnimator.AnimatorUpdateListener q = new ValueAnimator.AnimatorUpdateListener() { // from class: aal.4
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (aal.this.a.M()) {
                if (aal.this.a.l().getVisibility() != 0) {
                    aal.this.a.l().setVisibility(0);
                }
            } else if (aal.this.a.l().getVisibility() != 8) {
                aal.this.a.l().setVisibility(8);
            }
            if (!aal.this.c || !aal.this.a.c()) {
                aal.this.a.l().setTranslationY(0.0f);
                aal.this.a.l().getLayoutParams().height = intValue;
                aal.this.a.l().requestLayout();
                aal.this.a.c(intValue);
            } else {
                aal.this.c(intValue);
            }
            aal.this.a.k().setTranslationY(intValue);
            aal.this.c(intValue);
        }
    };
    private ValueAnimator.AnimatorUpdateListener r = new ValueAnimator.AnimatorUpdateListener() { // from class: aal.5
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (aal.this.a.N()) {
                if (aal.this.a.m().getVisibility() != 0) {
                    aal.this.a.m().setVisibility(0);
                }
            } else if (aal.this.a.m().getVisibility() != 8) {
                aal.this.a.m().setVisibility(8);
            }
            if (!aal.this.d || !aal.this.a.c()) {
                aal.this.a.m().getLayoutParams().height = intValue;
                aal.this.a.m().requestLayout();
                aal.this.a.m().setTranslationY(0.0f);
                aal.this.a.d(intValue);
            } else {
                aal.this.d(intValue);
            }
            aal.this.a.k().setTranslationY(-intValue);
        }
    };
    private DecelerateInterpolator b = new DecelerateInterpolator(8.0f);

    public aal(TwinklingRefreshLayout.a aVar) {
        this.a = aVar;
    }

    public void a(float f) {
        float interpolation = (this.b.getInterpolation((f / this.a.f()) / 2.0f) * f) / 2.0f;
        if (this.a.L() || (!this.a.C() && !this.a.M())) {
            if (this.a.l().getVisibility() != 8) {
                this.a.l().setVisibility(8);
            }
        } else if (this.a.l().getVisibility() != 0) {
            this.a.l().setVisibility(0);
        }
        if (this.c && this.a.c()) {
            this.a.l().setTranslationY(interpolation - this.a.l().getLayoutParams().height);
        } else {
            this.a.l().setTranslationY(0.0f);
            this.a.l().getLayoutParams().height = (int) Math.abs(interpolation);
            this.a.l().requestLayout();
            this.a.a(interpolation);
        }
        if (this.a.J()) {
            return;
        }
        this.a.k().setTranslationY(interpolation);
        c((int) interpolation);
    }

    public void b(float f) {
        float interpolation = (this.b.getInterpolation((f / this.a.h()) / 2.0f) * f) / 2.0f;
        if (this.a.L() || (!this.a.D() && !this.a.N())) {
            if (this.a.m().getVisibility() != 8) {
                this.a.m().setVisibility(8);
            }
        } else if (this.a.m().getVisibility() != 0) {
            this.a.m().setVisibility(0);
        }
        if (this.d && this.a.c()) {
            this.a.m().setTranslationY(this.a.m().getLayoutParams().height - interpolation);
        } else {
            this.a.m().setTranslationY(0.0f);
            this.a.m().getLayoutParams().height = (int) Math.abs(interpolation);
            this.a.m().requestLayout();
            this.a.b(-interpolation);
        }
        this.a.k().setTranslationY(-interpolation);
    }

    public void a() {
        if (!this.a.L() && this.a.C() && e() >= this.a.g() - this.a.n()) {
            c();
        } else {
            a(false);
        }
    }

    public void b() {
        if (!this.a.L() && this.a.D() && f() >= this.a.i() - this.a.n()) {
            d();
        } else {
            b(false);
        }
    }

    private int e() {
        aar.a("header translationY:" + this.a.l().getTranslationY() + ",Visible head height:" + (this.a.l().getLayoutParams().height + this.a.l().getTranslationY()));
        return (int) (this.a.l().getLayoutParams().height + this.a.l().getTranslationY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int f() {
        aar.a("footer translationY:" + this.a.m().getTranslationY() + "");
        return (int) (this.a.m().getLayoutParams().height - this.a.m().getTranslationY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(float f) {
        this.a.l().setTranslationY(f - this.a.l().getLayoutParams().height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(float f) {
        this.a.m().setTranslationY(this.a.m().getLayoutParams().height - f);
    }

    public void c() {
        aar.a("animHeadToRefresh:");
        this.e = true;
        a(e(), this.a.g(), this.o, new AnimatorListenerAdapter() { // from class: aal.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                aal.this.e = false;
                if (aal.this.a.l().getVisibility() != 0) {
                    aal.this.a.l().setVisibility(0);
                }
                aal.this.a.a(true);
                if (aal.this.a.c()) {
                    if (aal.this.c) {
                        return;
                    }
                    aal.this.a.c(true);
                    aal.this.a.O();
                    aal.this.c = true;
                    return;
                }
                aal.this.a.c(true);
                aal.this.a.O();
            }
        });
    }

    public void a(final boolean z) {
        aar.a("animHeadBack：finishRefresh?->" + z);
        this.f = true;
        if (z && this.c && this.a.c()) {
            this.a.e(true);
        }
        a(e(), 0, this.o, new AnimatorListenerAdapter() { // from class: aal.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                aal.this.f = false;
                aal.this.a.a(false);
                if (z && aal.this.c && aal.this.a.c()) {
                    aal.this.a.l().getLayoutParams().height = 0;
                    aal.this.a.l().requestLayout();
                    aal.this.a.l().setTranslationY(0.0f);
                    aal.this.c = false;
                    aal.this.a.c(false);
                    aal.this.a.o();
                }
            }
        });
    }

    public void d() {
        aar.a("animBottomToLoad");
        this.g = true;
        a(f(), this.a.i(), this.p, new AnimatorListenerAdapter() { // from class: aal.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                aal.this.g = false;
                if (aal.this.a.m().getVisibility() != 0) {
                    aal.this.a.m().setVisibility(0);
                }
                aal.this.a.b(true);
                if (aal.this.a.c()) {
                    if (aal.this.d) {
                        return;
                    }
                    aal.this.a.d(true);
                    aal.this.a.P();
                    aal.this.d = true;
                    return;
                }
                aal.this.a.d(true);
                aal.this.a.P();
            }
        });
    }

    public void b(final boolean z) {
        aar.a("animBottomBack：finishLoading?->" + z);
        this.h = true;
        if (z && this.d && this.a.c()) {
            this.a.f(true);
        }
        a(f(), 0, new ValueAnimator.AnimatorUpdateListener() { // from class: aal.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int f;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (!aas.b(aal.this.a.k(), aal.this.a.n()) && (f = aal.this.f() - intValue) > 0) {
                    if (aal.this.a.k() instanceof RecyclerView) {
                        aas.c(aal.this.a.k(), f);
                    } else {
                        aas.c(aal.this.a.k(), f / 2);
                    }
                }
                aal.this.p.onAnimationUpdate(valueAnimator);
            }
        }, new AnimatorListenerAdapter() { // from class: aal.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                aal.this.h = false;
                aal.this.a.b(false);
                if (z && aal.this.d && aal.this.a.c()) {
                    aal.this.a.m().getLayoutParams().height = 0;
                    aal.this.a.m().requestLayout();
                    aal.this.a.m().setTranslationY(0.0f);
                    aal.this.d = false;
                    aal.this.a.p();
                    aal.this.a.d(false);
                }
            }
        });
    }

    public void a(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        aar.a("animHeadHideByVy：vy->" + i);
        int abs = Math.abs(i);
        if (abs < 5000) {
            abs = 8000;
        }
        a(e(), 0, Math.abs((e() * 1000) / abs) * 5, this.o, new AnimatorListenerAdapter() { // from class: aal.10
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                aal.this.i = false;
                aal.this.a.a(false);
                if (aal.this.a.c()) {
                    return;
                }
                aal.this.a.c(false);
                aal.this.a.S();
                aal.this.a.o();
            }
        });
    }

    public void b(int i) {
        aar.a("animBottomHideByVy：vy->" + i);
        if (this.j) {
            return;
        }
        this.j = true;
        int abs = Math.abs(i);
        if (abs < 5000) {
            abs = 8000;
        }
        a(f(), 0, ((f() * 5) * 1000) / abs, this.p, new AnimatorListenerAdapter() { // from class: aal.11
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                aal.this.j = false;
                aal.this.a.b(false);
                if (aal.this.a.c()) {
                    return;
                }
                aal.this.a.d(false);
                aal.this.a.T();
                aal.this.a.p();
            }
        });
    }

    public void a(float f, int i) {
        aar.a("animOverScrollTop：vy->" + f + ",computeTimes->" + i);
        if (this.l) {
            return;
        }
        this.l = true;
        this.k = true;
        this.a.U();
        int abs = (int) Math.abs((f / i) / 2.0f);
        if (abs > this.a.j()) {
            abs = this.a.j();
        }
        final int i2 = abs;
        final int i3 = i2 <= 50 ? 115 : (int) ((i2 * 0.3d) + 100.0d);
        a(e(), i2, i3, this.q, new AnimatorListenerAdapter() { // from class: aal.12
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (aal.this.c && aal.this.a.c() && aal.this.a.d()) {
                    aal.this.c();
                    aal.this.k = false;
                    aal.this.l = false;
                    return;
                }
                aal aalVar = aal.this;
                aalVar.a(i2, 0, i3 * 2, aalVar.q, new AnimatorListenerAdapter() { // from class: aal.12.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                        aal.this.k = false;
                        aal.this.l = false;
                    }
                });
            }
        });
    }

    public void b(float f, int i) {
        aar.a("animOverScrollBottom：vy->" + f + ",computeTimes->" + i);
        if (this.n) {
            return;
        }
        this.a.V();
        int abs = (int) Math.abs((f / i) / 2.0f);
        if (abs > this.a.j()) {
            abs = this.a.j();
        }
        final int i2 = abs;
        final int i3 = i2 <= 50 ? 115 : (int) ((i2 * 0.3d) + 100.0d);
        if (!this.d && this.a.K()) {
            this.a.v();
            return;
        }
        this.n = true;
        this.m = true;
        a(0, i2, i3, this.r, new AnimatorListenerAdapter() { // from class: aal.13
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (aal.this.d && aal.this.a.c() && aal.this.a.e()) {
                    aal.this.d();
                    aal.this.m = false;
                    aal.this.n = false;
                    return;
                }
                aal aalVar = aal.this;
                aalVar.a(i2, 0, i3 * 2, aalVar.r, new AnimatorListenerAdapter() { // from class: aal.13.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                        aal.this.m = false;
                        aal.this.n = false;
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (this.a.s()) {
            return;
        }
        this.a.q().setTranslationY(i);
    }

    public void a(int i, int i2, long j, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(animatorUpdateListener);
        ofInt.addListener(animatorListener);
        ofInt.setDuration(j);
        ofInt.start();
    }

    public void a(int i, int i2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(animatorUpdateListener);
        ofInt.addListener(animatorListener);
        ofInt.setDuration((int) (Math.abs(i - i2) * 1.0f));
        ofInt.start();
    }
}
