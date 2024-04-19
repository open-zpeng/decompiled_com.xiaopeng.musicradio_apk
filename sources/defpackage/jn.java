package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: Fade.java */
/* renamed from: jn  reason: default package */
/* loaded from: classes3.dex */
public class jn extends kt {
    public jn(int i) {
        a(i);
    }

    public jn() {
    }

    @Override // defpackage.kt, defpackage.jw
    public void a(kc kcVar) {
        super.a(kcVar);
        kcVar.a.put("android:fade:transitionAlpha", Float.valueOf(km.c(kcVar.b)));
    }

    private Animator a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        km.a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, km.a, f2);
        ofFloat.addListener(new a(view));
        a(new jx() { // from class: jn.1
            @Override // defpackage.jx, defpackage.jw.c
            public void b(jw jwVar) {
                km.a(view, 1.0f);
                km.e(view);
                jwVar.b(this);
            }
        });
        return ofFloat;
    }

    @Override // defpackage.kt
    public Animator a(ViewGroup viewGroup, View view, kc kcVar, kc kcVar2) {
        float a2 = a(kcVar, 0.0f);
        return a(view, a2 != 1.0f ? a2 : 0.0f, 1.0f);
    }

    @Override // defpackage.kt
    public Animator b(ViewGroup viewGroup, View view, kc kcVar, kc kcVar2) {
        km.d(view);
        return a(view, a(kcVar, 1.0f), 0.0f);
    }

    private static float a(kc kcVar, float f) {
        Float f2;
        return (kcVar == null || (f2 = (Float) kcVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Fade.java */
    /* renamed from: jn$a */
    /* loaded from: classes3.dex */
    public static class a extends AnimatorListenerAdapter {
        private final View a;
        private boolean b = false;

        a(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (hq.v(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            km.a(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }
    }
}
