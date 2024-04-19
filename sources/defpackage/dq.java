package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ViewOscillator.java */
/* renamed from: dq  reason: default package */
/* loaded from: classes3.dex */
public abstract class dq extends ca {
    public abstract void a(View view, float f2);

    public static dq b(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c2 = '\f';
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c2 = '\r';
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c2 = 2;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c2 = 1;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = 5;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 0;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c2 = '\b';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new a();
            case 1:
                return new c();
            case 2:
                return new f();
            case 3:
                return new g();
            case 4:
                return new h();
            case 5:
                return new d();
            case 6:
                return new i();
            case 7:
                return new j();
            case '\b':
                return new a();
            case '\t':
                return new a();
            case '\n':
                return new k();
            case 11:
                return new l();
            case '\f':
                return new m();
            case '\r':
                return new e();
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: dq$c */
    /* loaded from: classes3.dex */
    public static class c extends dq {
        c() {
        }

        @Override // defpackage.dq
        public void a(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(a(f));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: dq$a */
    /* loaded from: classes3.dex */
    public static class a extends dq {
        a() {
        }

        @Override // defpackage.dq
        public void a(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: dq$f */
    /* loaded from: classes3.dex */
    public static class f extends dq {
        f() {
        }

        @Override // defpackage.dq
        public void a(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: dq$g */
    /* loaded from: classes3.dex */
    public static class g extends dq {
        g() {
        }

        @Override // defpackage.dq
        public void a(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: dq$h */
    /* loaded from: classes3.dex */
    public static class h extends dq {
        h() {
        }

        @Override // defpackage.dq
        public void a(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* renamed from: dq$d */
    /* loaded from: classes3.dex */
    public static class d extends dq {
        @Override // defpackage.dq
        public void a(View view, float f) {
        }

        public void a(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: dq$i */
    /* loaded from: classes3.dex */
    public static class i extends dq {
        i() {
        }

        @Override // defpackage.dq
        public void a(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: dq$j */
    /* loaded from: classes3.dex */
    public static class j extends dq {
        j() {
        }

        @Override // defpackage.dq
        public void a(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: dq$k */
    /* loaded from: classes3.dex */
    public static class k extends dq {
        k() {
        }

        @Override // defpackage.dq
        public void a(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: dq$l */
    /* loaded from: classes3.dex */
    public static class l extends dq {
        l() {
        }

        @Override // defpackage.dq
        public void a(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: dq$m */
    /* loaded from: classes3.dex */
    public static class m extends dq {
        m() {
        }

        @Override // defpackage.dq
        public void a(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(a(f));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: dq$b */
    /* loaded from: classes3.dex */
    public static class b extends dq {
        float[] c = new float[1];
        protected androidx.constraintlayout.widget.a d;

        b() {
        }

        @Override // defpackage.ca
        protected void a(Object obj) {
            this.d = (androidx.constraintlayout.widget.a) obj;
        }

        @Override // defpackage.dq
        public void a(View view, float f) {
            this.c[0] = a(f);
            this.d.a(view, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: dq$e */
    /* loaded from: classes3.dex */
    public static class e extends dq {
        boolean c = false;

        e() {
        }

        @Override // defpackage.dq
        public void a(View view, float f) {
            if (view instanceof ek) {
                ((ek) view).setProgress(a(f));
            } else if (this.c) {
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.c = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(f)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewOscillator", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewOscillator", "unable to setProgress", e2);
                    }
                }
            }
        }
    }
}
