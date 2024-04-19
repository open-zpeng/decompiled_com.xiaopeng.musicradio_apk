package me.yokeyword.fragmentation.helper.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import java.util.List;
/* compiled from: VisibleDelegate.java */
/* loaded from: classes2.dex */
public class c {
    private boolean a;
    private boolean c;
    private Runnable g;
    private Handler h;
    private Bundle i;
    private me.yokeyword.fragmentation.c j;
    private Fragment k;
    private boolean b = true;
    private boolean d = true;
    private boolean e = true;
    private boolean f = false;

    public c(me.yokeyword.fragmentation.c cVar) {
        this.j = cVar;
        this.k = (Fragment) cVar;
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.i = bundle;
            this.c = bundle.getBoolean("fragmentation_invisible_when_leave");
            this.e = bundle.getBoolean("fragmentation_compat_replace");
        }
    }

    public void b(Bundle bundle) {
        bundle.putBoolean("fragmentation_invisible_when_leave", this.c);
        bundle.putBoolean("fragmentation_compat_replace", this.e);
    }

    public void c(Bundle bundle) {
        if (this.e || this.k.getTag() == null || !this.k.getTag().startsWith("android:switcher:")) {
            if (this.e) {
                this.e = false;
            }
            e();
        }
    }

    private void e() {
        if (this.c || this.k.isHidden() || !this.k.getUserVisibleHint()) {
            return;
        }
        if ((this.k.getParentFragment() == null || !a(this.k.getParentFragment())) && this.k.getParentFragment() != null) {
            return;
        }
        this.b = false;
        c(true);
    }

    public void a() {
        if (!this.d) {
            if (this.a || this.c || !a(this.k)) {
                return;
            }
            this.b = false;
            d(true);
        } else if (this.f) {
            this.f = false;
            e();
        }
    }

    public void b() {
        if (this.g != null) {
            k().removeCallbacks(this.g);
            this.f = true;
        } else if (this.a && a(this.k)) {
            this.b = false;
            this.c = false;
            d(false);
        } else {
            this.c = true;
        }
    }

    public void a(boolean z) {
        if (!z && !this.k.isResumed()) {
            f();
        } else if (z) {
            c(false);
        } else {
            h();
        }
    }

    private void f() {
        this.c = false;
        g();
    }

    private void g() {
        List<Fragment> d = x.d(this.k.getChildFragmentManager());
        if (d != null) {
            for (Fragment fragment : d) {
                if ((fragment instanceof me.yokeyword.fragmentation.c) && !fragment.isHidden() && fragment.getUserVisibleHint()) {
                    ((me.yokeyword.fragmentation.c) fragment).u().k().f();
                }
            }
        }
    }

    public void c() {
        this.d = true;
    }

    public void b(boolean z) {
        if (this.k.isResumed() || (!this.k.isAdded() && z)) {
            if (!this.a && z) {
                c(true);
            } else if (!this.a || z) {
            } else {
                d(false);
            }
        }
    }

    private void c(boolean z) {
        if (!this.d) {
            d(z);
        } else if (z) {
            h();
        }
    }

    private void h() {
        this.g = new Runnable() { // from class: me.yokeyword.fragmentation.helper.internal.c.1
            @Override // java.lang.Runnable
            public void run() {
                c.this.g = null;
                c.this.d(true);
            }
        };
        k().post(this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (z && i()) {
            return;
        }
        if (this.a == z) {
            this.b = true;
            return;
        }
        this.a = z;
        if (z) {
            if (j()) {
                return;
            }
            this.j.v();
            if (this.d) {
                this.d = false;
                this.j.b(this.i);
            }
            e(true);
            return;
        }
        e(false);
        this.j.w();
    }

    private void e(boolean z) {
        List<Fragment> d;
        if (!this.b) {
            this.b = true;
        } else if (!j() && (d = x.d(this.k.getChildFragmentManager())) != null) {
            for (Fragment fragment : d) {
                if ((fragment instanceof me.yokeyword.fragmentation.c) && !fragment.isHidden() && fragment.getUserVisibleHint()) {
                    ((me.yokeyword.fragmentation.c) fragment).u().k().d(z);
                }
            }
        }
    }

    private boolean i() {
        Fragment parentFragment = this.k.getParentFragment();
        if (parentFragment instanceof me.yokeyword.fragmentation.c) {
            return !((me.yokeyword.fragmentation.c) parentFragment).x();
        }
        return (parentFragment == null || parentFragment.isVisible()) ? false : true;
    }

    private boolean j() {
        if (this.k.isAdded()) {
            return false;
        }
        this.a = !this.a;
        return true;
    }

    private boolean a(Fragment fragment) {
        return !fragment.isHidden() && fragment.getUserVisibleHint();
    }

    public boolean d() {
        return this.a;
    }

    private Handler k() {
        if (this.h == null) {
            this.h = new Handler(Looper.getMainLooper());
        }
        return this.h;
    }
}
