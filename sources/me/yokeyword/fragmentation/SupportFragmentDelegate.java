package me.yokeyword.fragmentation;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import me.yokeyword.fragmentation.anim.FragmentAnimator;
/* loaded from: classes2.dex */
public class SupportFragmentDelegate {
    FragmentAnimator a;
    boolean b;
    int c;
    me.yokeyword.fragmentation.helper.internal.b d;
    Bundle e;
    protected androidx.fragment.app.d f;
    a h;
    private boolean j;
    me.yokeyword.fragmentation.helper.internal.a mAnimHelper;
    private Handler n;
    private boolean p;
    private i r;
    private me.yokeyword.fragmentation.helper.internal.c s;
    private Bundle t;
    private c u;
    private Fragment v;
    private b w;
    private boolean x;
    private int i = 0;
    private int k = Integer.MIN_VALUE;
    private int l = Integer.MIN_VALUE;
    private int m = Integer.MIN_VALUE;
    private boolean o = true;
    private boolean q = true;
    boolean g = true;
    private Runnable y = new Runnable() { // from class: me.yokeyword.fragmentation.SupportFragmentDelegate.3
        @Override // java.lang.Runnable
        public void run() {
            final View view;
            c a2;
            if (SupportFragmentDelegate.this.v == null) {
                return;
            }
            SupportFragmentDelegate.this.u.a(SupportFragmentDelegate.this.t);
            if (SupportFragmentDelegate.this.x || (view = SupportFragmentDelegate.this.v.getView()) == null || (a2 = h.a(SupportFragmentDelegate.this.v)) == null) {
                return;
            }
            SupportFragmentDelegate.this.n.postDelayed(new Runnable() { // from class: me.yokeyword.fragmentation.SupportFragmentDelegate.3.1
                @Override // java.lang.Runnable
                public void run() {
                    view.setClickable(false);
                }
            }, a2.u().u() - SupportFragmentDelegate.this.t());
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public void a(int i, int i2, Bundle bundle) {
    }

    public void d(Bundle bundle) {
    }

    public void e() {
    }

    public void e(Bundle bundle) {
    }

    public void f() {
    }

    public void f(Bundle bundle) {
    }

    public boolean j() {
        return false;
    }

    public SupportFragmentDelegate(c cVar) {
        if (!(cVar instanceof Fragment)) {
            throw new RuntimeException("Must extends Fragment");
        }
        this.u = cVar;
        this.v = (Fragment) cVar;
    }

    public void a(Activity activity) {
        if (activity instanceof b) {
            this.w = (b) activity;
            this.f = (androidx.fragment.app.d) activity;
            this.r = this.w.t().a();
            return;
        }
        throw new RuntimeException(activity.getClass().getSimpleName() + " must impl ISupportActivity!");
    }

    public void a(Bundle bundle) {
        k().a(bundle);
        Bundle arguments = this.v.getArguments();
        if (arguments != null) {
            this.i = arguments.getInt("fragmentation_arg_root_status", 0);
            this.j = arguments.getBoolean("fragmentation_arg_is_shared_element", false);
            this.c = arguments.getInt("fragmentation_arg_container");
            this.p = arguments.getBoolean("fragmentation_arg_replace", false);
            this.k = arguments.getInt("fragmentation_arg_custom_enter_anim", Integer.MIN_VALUE);
            this.l = arguments.getInt("fragmentation_arg_custom_exit_anim", Integer.MIN_VALUE);
            this.m = arguments.getInt("fragmentation_arg_custom_pop_exit_anim", Integer.MIN_VALUE);
        }
        if (bundle == null) {
            i();
        } else {
            bundle.setClassLoader(getClass().getClassLoader());
            this.t = bundle;
            this.a = (FragmentAnimator) bundle.getParcelable("fragmentation_state_save_animator");
            this.q = bundle.getBoolean("fragmentation_state_save_status");
            this.c = bundle.getInt("fragmentation_arg_container");
        }
        this.mAnimHelper = new me.yokeyword.fragmentation.helper.internal.a(this.f.getApplicationContext(), this.a);
        final Animation s = s();
        if (s == null) {
            return;
        }
        s().setAnimationListener(new Animation.AnimationListener() { // from class: me.yokeyword.fragmentation.SupportFragmentDelegate.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                SupportFragmentDelegate.this.w.t().b = false;
                SupportFragmentDelegate.this.n.postDelayed(new Runnable() { // from class: me.yokeyword.fragmentation.SupportFragmentDelegate.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SupportFragmentDelegate.this.w.t().b = true;
                    }
                }, s.getDuration());
            }
        });
    }

    public Animation a(int i, boolean z, int i2) {
        if (this.w.t().a || this.b) {
            if (i == 8194 && z) {
                return this.mAnimHelper.b();
            }
            return this.mAnimHelper.a();
        } else if (i == 4097) {
            if (z) {
                if (this.i == 1) {
                    return this.mAnimHelper.a();
                }
                Animation animation = this.mAnimHelper.a;
                a(animation);
                return animation;
            }
            return this.mAnimHelper.d;
        } else if (i == 8194) {
            return z ? this.mAnimHelper.c : this.mAnimHelper.b;
        } else {
            if (this.j && z) {
                o();
            }
            if (z) {
                return null;
            }
            return this.mAnimHelper.a(this.v);
        }
    }

    public void b(Bundle bundle) {
        k().b(bundle);
        bundle.putParcelable("fragmentation_state_save_animator", this.a);
        bundle.putBoolean("fragmentation_state_save_status", this.v.isHidden());
        bundle.putInt("fragmentation_arg_container", this.c);
    }

    public void c(Bundle bundle) {
        k().c(bundle);
        View view = this.v.getView();
        if (view != null) {
            this.x = view.isClickable();
            view.setClickable(true);
            a(view);
        }
        if (bundle != null || this.i == 1 || ((this.v.getTag() != null && this.v.getTag().startsWith("android:switcher:")) || (this.p && !this.o))) {
            q();
        } else {
            int i = this.k;
            if (i != Integer.MIN_VALUE) {
                a(i == 0 ? this.mAnimHelper.a() : AnimationUtils.loadAnimation(this.f, i));
            }
        }
        if (this.o) {
            this.o = false;
        }
    }

    public void a() {
        k().a();
    }

    public void b() {
        k().b();
    }

    public void c() {
        this.w.t().b = true;
        k().c();
        r().removeCallbacks(this.y);
    }

    public void d() {
        this.r.a(this.v);
    }

    public void a(boolean z) {
        k().a(z);
    }

    public void b(boolean z) {
        k().b(z);
    }

    public final boolean g() {
        return k().d();
    }

    public FragmentAnimator h() {
        return this.w.v();
    }

    public FragmentAnimator i() {
        if (this.w == null) {
            throw new RuntimeException("Fragment has not been attached to Activity!");
        }
        if (this.a == null) {
            this.a = this.u.y();
            if (this.a == null) {
                this.a = this.w.v();
            }
        }
        return this.a;
    }

    private void a(Animation animation) {
        r().postDelayed(this.y, animation.getDuration());
        this.w.t().b = true;
        if (this.h != null) {
            r().post(new Runnable() { // from class: me.yokeyword.fragmentation.SupportFragmentDelegate.2
                @Override // java.lang.Runnable
                public void run() {
                    SupportFragmentDelegate.this.h.a();
                    SupportFragmentDelegate.this.h = null;
                }
            });
        }
    }

    private void o() {
        q();
    }

    public void a(View view) {
        if ((this.v.getTag() == null || !this.v.getTag().startsWith("android:switcher:")) && this.i == 0 && view.getBackground() == null) {
            int d = this.w.t().d();
            if (d == 0) {
                view.setBackgroundResource(p());
            } else {
                view.setBackgroundResource(d);
            }
        }
    }

    private int p() {
        TypedArray obtainStyledAttributes = this.f.getTheme().obtainStyledAttributes(new int[]{16842836});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void q() {
        r().post(this.y);
        this.w.t().b = true;
    }

    private Handler r() {
        if (this.n == null) {
            this.n = new Handler(Looper.getMainLooper());
        }
        return this.n;
    }

    public me.yokeyword.fragmentation.helper.internal.c k() {
        if (this.s == null) {
            this.s = new me.yokeyword.fragmentation.helper.internal.c(this.u);
        }
        return this.s;
    }

    public androidx.fragment.app.d l() {
        return this.f;
    }

    private Animation s() {
        int i = this.k;
        if (i == Integer.MIN_VALUE) {
            me.yokeyword.fragmentation.helper.internal.a aVar = this.mAnimHelper;
            if (aVar == null || aVar.a == null) {
                return null;
            }
            return this.mAnimHelper.a;
        }
        try {
            return AnimationUtils.loadAnimation(this.f, i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long t() {
        Animation s = s();
        if (s != null) {
            return s.getDuration();
        }
        return 300L;
    }

    public long m() {
        int i = this.l;
        if (i == Integer.MIN_VALUE) {
            me.yokeyword.fragmentation.helper.internal.a aVar = this.mAnimHelper;
            if (aVar == null || aVar.b == null) {
                return 300L;
            }
            return this.mAnimHelper.b.getDuration();
        }
        try {
            return AnimationUtils.loadAnimation(this.f, i).getDuration();
        } catch (Exception e) {
            e.printStackTrace();
            return 300L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long u() {
        int i = this.m;
        if (i == Integer.MIN_VALUE) {
            me.yokeyword.fragmentation.helper.internal.a aVar = this.mAnimHelper;
            if (aVar == null || aVar.d == null) {
                return 300L;
            }
            return this.mAnimHelper.d.getDuration();
        }
        try {
            return AnimationUtils.loadAnimation(this.f, i).getDuration();
        } catch (Exception e) {
            e.printStackTrace();
            return 300L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Animation n() {
        int i = this.l;
        if (i == Integer.MIN_VALUE) {
            me.yokeyword.fragmentation.helper.internal.a aVar = this.mAnimHelper;
            if (aVar == null || aVar.b == null) {
                return null;
            }
            return this.mAnimHelper.b;
        }
        try {
            return AnimationUtils.loadAnimation(this.f, i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
