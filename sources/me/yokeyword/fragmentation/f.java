package me.yokeyword.fragmentation;

import android.os.Bundle;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.x;
import me.yokeyword.fragmentation.anim.DefaultVerticalAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;
/* compiled from: SupportActivityDelegate.java */
/* loaded from: classes2.dex */
public class f {
    private b c;
    private androidx.fragment.app.d d;
    private i e;
    private FragmentAnimator f;
    private bjc h;
    boolean a = false;
    boolean b = true;
    private int g = 0;

    public f(b bVar) {
        if (!(bVar instanceof androidx.fragment.app.d)) {
            throw new RuntimeException("Must extends FragmentActivity/AppCompatActivity");
        }
        this.c = bVar;
        this.d = (androidx.fragment.app.d) bVar;
        this.h = new bjc(this.d);
    }

    public void a(Bundle bundle) {
        this.e = a();
        this.f = this.c.w();
        this.h.a(a.a().c());
    }

    public i a() {
        if (this.e == null) {
            this.e = new i(this.c);
        }
        return this.e;
    }

    public void b(Bundle bundle) {
        this.h.b(a.a().c());
    }

    public FragmentAnimator b() {
        return this.f.a();
    }

    public void a(FragmentAnimator fragmentAnimator) {
        this.f = fragmentAnimator;
        for (Fragment fragment : x.d(i())) {
            if (fragment instanceof c) {
                SupportFragmentDelegate u = ((c) fragment).u();
                if (u.g) {
                    u.a = fragmentAnimator.a();
                    if (u.mAnimHelper != null) {
                        u.mAnimHelper.a(u.a);
                    }
                }
            }
        }
    }

    public FragmentAnimator c() {
        return new DefaultVerticalAnimator();
    }

    public int d() {
        return this.g;
    }

    public void e() {
        this.e.a.a(new bjf(3) { // from class: me.yokeyword.fragmentation.f.1
            @Override // defpackage.bjf
            public void a() {
                if (!f.this.b) {
                    f.this.b = true;
                }
                if (f.this.e.a(h.b(f.this.i()))) {
                    return;
                }
                f.this.c.u();
            }
        });
    }

    public void f() {
        if (i().getBackStackEntryCount() > 1) {
            h();
        } else {
            androidx.core.app.a.b(this.d);
        }
    }

    public void g() {
        this.h.a();
    }

    public boolean a(MotionEvent motionEvent) {
        return !this.b;
    }

    public void a(int i, c cVar) {
        a(i, cVar, true, false);
    }

    public void a(int i, c cVar, boolean z, boolean z2) {
        this.e.a(i(), i, cVar, z, z2);
    }

    public void a(c cVar, boolean z) {
        this.e.a(i(), j(), cVar, 0, 0, z ? 10 : 11);
    }

    public void h() {
        this.e.a(i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FragmentManager i() {
        return this.d.getSupportFragmentManager();
    }

    private c j() {
        return h.a(i());
    }
}
