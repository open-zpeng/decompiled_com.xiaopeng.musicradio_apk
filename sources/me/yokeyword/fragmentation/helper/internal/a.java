package me.yokeyword.fragmentation.helper.internal;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import me.yokeyword.fragmentation.anim.FragmentAnimator;
import me.yokeyword.fragmentation.d;
/* compiled from: AnimatorHelper.java */
/* loaded from: classes2.dex */
public final class a {
    public Animation a;
    public Animation b;
    public Animation c;
    public Animation d;
    private Animation e;
    private Animation f;
    private Context g;
    private FragmentAnimator h;

    public a(Context context, FragmentAnimator fragmentAnimator) {
        this.g = context;
        a(fragmentAnimator);
    }

    public void a(FragmentAnimator fragmentAnimator) {
        this.h = fragmentAnimator;
        c();
        d();
        e();
        f();
    }

    public Animation a() {
        if (this.e == null) {
            this.e = AnimationUtils.loadAnimation(this.g, d.a.no_anim);
        }
        return this.e;
    }

    public Animation b() {
        if (this.f == null) {
            this.f = new Animation() { // from class: me.yokeyword.fragmentation.helper.internal.a.1
            };
        }
        return this.f;
    }

    public Animation a(Fragment fragment) {
        if (!(fragment.getTag() != null && fragment.getTag().startsWith("android:switcher:") && fragment.getUserVisibleHint()) && (fragment.getParentFragment() == null || !fragment.getParentFragment().isRemoving() || fragment.isHidden())) {
            return null;
        }
        Animation animation = new Animation() { // from class: me.yokeyword.fragmentation.helper.internal.a.2
        };
        animation.setDuration(this.b.getDuration());
        return animation;
    }

    private Animation c() {
        if (this.h.b() == 0) {
            this.a = AnimationUtils.loadAnimation(this.g, d.a.no_anim);
        } else {
            this.a = AnimationUtils.loadAnimation(this.g, this.h.b());
        }
        return this.a;
    }

    private Animation d() {
        if (this.h.c() == 0) {
            this.b = AnimationUtils.loadAnimation(this.g, d.a.no_anim);
        } else {
            this.b = AnimationUtils.loadAnimation(this.g, this.h.c());
        }
        return this.b;
    }

    private Animation e() {
        if (this.h.d() == 0) {
            this.c = AnimationUtils.loadAnimation(this.g, d.a.no_anim);
        } else {
            this.c = AnimationUtils.loadAnimation(this.g, this.h.d());
        }
        return this.c;
    }

    private Animation f() {
        if (this.h.e() == 0) {
            this.d = AnimationUtils.loadAnimation(this.g, d.a.no_anim);
        } else {
            this.d = AnimationUtils.loadAnimation(this.g, this.h.e());
        }
        return this.d;
    }
}
