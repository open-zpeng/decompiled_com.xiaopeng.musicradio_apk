package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* compiled from: ViewPropertyAnimatorCompat.java */
/* renamed from: hu  reason: default package */
/* loaded from: classes3.dex */
public final class hu {
    Runnable a = null;
    Runnable b = null;
    int c = -1;
    private WeakReference<View> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hu(View view) {
        this.d = new WeakReference<>(view);
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* renamed from: hu$a */
    /* loaded from: classes3.dex */
    static class a implements hv {
        hu a;
        boolean b;

        a(hu huVar) {
            this.a = huVar;
        }

        @Override // defpackage.hv
        public void a(View view) {
            this.b = false;
            if (this.a.c > -1) {
                view.setLayerType(2, null);
            }
            if (this.a.a != null) {
                Runnable runnable = this.a.a;
                this.a.a = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            hv hvVar = tag instanceof hv ? (hv) tag : null;
            if (hvVar != null) {
                hvVar.a(view);
            }
        }

        @Override // defpackage.hv
        @SuppressLint({"WrongConstant"})
        public void b(View view) {
            if (this.a.c > -1) {
                view.setLayerType(this.a.c, null);
                this.a.c = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.b) {
                if (this.a.b != null) {
                    Runnable runnable = this.a.b;
                    this.a.b = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                hv hvVar = tag instanceof hv ? (hv) tag : null;
                if (hvVar != null) {
                    hvVar.b(view);
                }
                this.b = true;
            }
        }

        @Override // defpackage.hv
        public void c(View view) {
            Object tag = view.getTag(2113929216);
            hv hvVar = tag instanceof hv ? (hv) tag : null;
            if (hvVar != null) {
                hvVar.c(view);
            }
        }
    }

    public hu a(long j) {
        View view = this.d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public hu a(float f) {
        View view = this.d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public hu b(float f) {
        View view = this.d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public long a() {
        View view = this.d.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public hu a(Interpolator interpolator) {
        View view = this.d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public hu b(long j) {
        View view = this.d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public void b() {
        View view = this.d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public void c() {
        View view = this.d.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public hu a(hv hvVar) {
        View view = this.d.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                a(view, hvVar);
            } else {
                view.setTag(2113929216, hvVar);
                a(view, new a(this));
            }
        }
        return this;
    }

    private void a(final View view, final hv hvVar) {
        if (hvVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() { // from class: hu.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    hvVar.c(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    hvVar.b(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    hvVar.a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public hu a(final hx hxVar) {
        final View view = this.d.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(hxVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: hu.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    hxVar.a(view);
                }
            } : null);
        }
        return this;
    }
}
