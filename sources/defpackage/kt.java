package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import defpackage.jk;
import defpackage.jw;
/* compiled from: Visibility.java */
/* renamed from: kt  reason: default package */
/* loaded from: classes3.dex */
public abstract class kt extends jw {
    private static final String[] h = {"android:visibility:visibility", "android:visibility:parent"};
    private int i = 3;

    public Animator a(ViewGroup viewGroup, View view, kc kcVar, kc kcVar2) {
        return null;
    }

    public Animator b(ViewGroup viewGroup, View view, kc kcVar, kc kcVar2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* renamed from: kt$b */
    /* loaded from: classes3.dex */
    public static class b {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

        b() {
        }
    }

    public void a(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.i = i;
    }

    @Override // defpackage.jw
    public String[] a() {
        return h;
    }

    private void d(kc kcVar) {
        kcVar.a.put("android:visibility:visibility", Integer.valueOf(kcVar.b.getVisibility()));
        kcVar.a.put("android:visibility:parent", kcVar.b.getParent());
        int[] iArr = new int[2];
        kcVar.b.getLocationOnScreen(iArr);
        kcVar.a.put("android:visibility:screenLocation", iArr);
    }

    @Override // defpackage.jw
    public void a(kc kcVar) {
        d(kcVar);
    }

    @Override // defpackage.jw
    public void b(kc kcVar) {
        d(kcVar);
    }

    private b b(kc kcVar, kc kcVar2) {
        b bVar = new b();
        bVar.a = false;
        bVar.b = false;
        if (kcVar != null && kcVar.a.containsKey("android:visibility:visibility")) {
            bVar.c = ((Integer) kcVar.a.get("android:visibility:visibility")).intValue();
            bVar.e = (ViewGroup) kcVar.a.get("android:visibility:parent");
        } else {
            bVar.c = -1;
            bVar.e = null;
        }
        if (kcVar2 != null && kcVar2.a.containsKey("android:visibility:visibility")) {
            bVar.d = ((Integer) kcVar2.a.get("android:visibility:visibility")).intValue();
            bVar.f = (ViewGroup) kcVar2.a.get("android:visibility:parent");
        } else {
            bVar.d = -1;
            bVar.f = null;
        }
        if (kcVar != null && kcVar2 != null) {
            if (bVar.c == bVar.d && bVar.e == bVar.f) {
                return bVar;
            }
            if (bVar.c != bVar.d) {
                if (bVar.c == 0) {
                    bVar.b = false;
                    bVar.a = true;
                } else if (bVar.d == 0) {
                    bVar.b = true;
                    bVar.a = true;
                }
            } else if (bVar.f == null) {
                bVar.b = false;
                bVar.a = true;
            } else if (bVar.e == null) {
                bVar.b = true;
                bVar.a = true;
            }
        } else if (kcVar == null && bVar.d == 0) {
            bVar.b = true;
            bVar.a = true;
        } else if (kcVar2 == null && bVar.c == 0) {
            bVar.b = false;
            bVar.a = true;
        }
        return bVar;
    }

    @Override // defpackage.jw
    public Animator a(ViewGroup viewGroup, kc kcVar, kc kcVar2) {
        b b2 = b(kcVar, kcVar2);
        if (b2.a) {
            if (b2.e == null && b2.f == null) {
                return null;
            }
            if (b2.b) {
                return a(viewGroup, kcVar, b2.c, kcVar2, b2.d);
            }
            return b(viewGroup, kcVar, b2.c, kcVar2, b2.d);
        }
        return null;
    }

    public Animator a(ViewGroup viewGroup, kc kcVar, int i, kc kcVar2, int i2) {
        if ((this.i & 1) != 1 || kcVar2 == null) {
            return null;
        }
        if (kcVar == null) {
            View view = (View) kcVar2.b.getParent();
            if (b(b(view, false), a(view, false)).a) {
                return null;
            }
        }
        return a(viewGroup, kcVar2.b, kcVar, kcVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
        if (r9.e != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator b(final android.view.ViewGroup r10, defpackage.kc r11, int r12, defpackage.kc r13, int r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt.b(android.view.ViewGroup, kc, int, kc, int):android.animation.Animator");
    }

    @Override // defpackage.jw
    public boolean a(kc kcVar, kc kcVar2) {
        if (kcVar == null && kcVar2 == null) {
            return false;
        }
        if (kcVar == null || kcVar2 == null || kcVar2.a.containsKey("android:visibility:visibility") == kcVar.a.containsKey("android:visibility:visibility")) {
            b b2 = b(kcVar, kcVar2);
            if (b2.a) {
                return b2.c == 0 || b2.d == 0;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* renamed from: kt$a */
    /* loaded from: classes3.dex */
    public static class a extends AnimatorListenerAdapter implements jk.a, jw.c {
        boolean a = false;
        private final View b;
        private final int c;
        private final ViewGroup d;
        private final boolean e;
        private boolean f;

        @Override // defpackage.jw.c
        public void a(jw jwVar) {
        }

        @Override // defpackage.jw.c
        public void e(jw jwVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        a(View view, int i, boolean z) {
            this.b = view;
            this.c = i;
            this.d = (ViewGroup) view.getParent();
            this.e = z;
            a(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, defpackage.jk.a
        public void onAnimationPause(Animator animator) {
            if (this.a) {
                return;
            }
            km.a(this.b, this.c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, defpackage.jk.a
        public void onAnimationResume(Animator animator) {
            if (this.a) {
                return;
            }
            km.a(this.b, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // defpackage.jw.c
        public void b(jw jwVar) {
            a();
            jwVar.b(this);
        }

        @Override // defpackage.jw.c
        public void c(jw jwVar) {
            a(false);
        }

        @Override // defpackage.jw.c
        public void d(jw jwVar) {
            a(true);
        }

        private void a() {
            if (!this.a) {
                km.a(this.b, this.c);
                ViewGroup viewGroup = this.d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        private void a(boolean z) {
            ViewGroup viewGroup;
            if (!this.e || this.f == z || (viewGroup = this.d) == null) {
                return;
            }
            this.f = z;
            kh.a(viewGroup, z);
        }
    }
}
