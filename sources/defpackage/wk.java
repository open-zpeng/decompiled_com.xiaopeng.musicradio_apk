package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import defpackage.wn;
/* compiled from: CircularRevealCompat.java */
/* renamed from: wk  reason: default package */
/* loaded from: classes3.dex */
public final class wk {
    public static Animator a(wn wnVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(wnVar, (Property<wn, V>) wn.b.a, (TypeEvaluator) wn.a.a, (Object[]) new wn.d[]{new wn.d(f, f2, f3)});
        if (Build.VERSION.SDK_INT >= 21) {
            wn.d revealInfo = wnVar.getRevealInfo();
            if (revealInfo == null) {
                throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) wnVar, (int) f, (int) f2, revealInfo.c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        return ofObject;
    }

    public static Animator.AnimatorListener a(final wn wnVar) {
        return new AnimatorListenerAdapter() { // from class: wk.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                wn.this.a();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                wn.this.b();
            }
        };
    }
}
