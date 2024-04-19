package defpackage;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.xiaopeng.musicradio.bean.ListSignBean;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ViewSpline.java */
/* renamed from: dr  reason: default package */
/* loaded from: classes3.dex */
public abstract class dr extends cf {
    public abstract void a(View view, float f2);

    public static dr a(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static dr b(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return new a();
            case 1:
                return new c();
            case 2:
                return new h();
            case 3:
                return new i();
            case 4:
                return new j();
            case 5:
                return new e();
            case 6:
                return new f();
            case 7:
                return new d();
            case '\b':
                return new k();
            case '\t':
                return new l();
            case '\n':
                return new a();
            case 11:
                return new a();
            case '\f':
                return new m();
            case '\r':
                return new n();
            case 14:
                return new o();
            case 15:
                return new g();
            default:
                return null;
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$c */
    /* loaded from: classes3.dex */
    static class c extends dr {
        c() {
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(a(f));
            }
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$a */
    /* loaded from: classes3.dex */
    static class a extends dr {
        a() {
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$h */
    /* loaded from: classes3.dex */
    static class h extends dr {
        h() {
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$i */
    /* loaded from: classes3.dex */
    static class i extends dr {
        i() {
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$j */
    /* loaded from: classes3.dex */
    static class j extends dr {
        j() {
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$e */
    /* loaded from: classes3.dex */
    static class e extends dr {
        e() {
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            view.setPivotX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$f */
    /* loaded from: classes3.dex */
    static class f extends dr {
        f() {
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            view.setPivotY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$d */
    /* loaded from: classes3.dex */
    public static class d extends dr {
        @Override // defpackage.dr
        public void a(View view, float f) {
        }

        public void a(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$k */
    /* loaded from: classes3.dex */
    static class k extends dr {
        k() {
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$l */
    /* loaded from: classes3.dex */
    static class l extends dr {
        l() {
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$m */
    /* loaded from: classes3.dex */
    static class m extends dr {
        m() {
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$n */
    /* loaded from: classes3.dex */
    static class n extends dr {
        n() {
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$o */
    /* loaded from: classes3.dex */
    static class o extends dr {
        o() {
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(a(f));
            }
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$b */
    /* loaded from: classes3.dex */
    public static class b extends dr {
        String d;
        SparseArray<androidx.constraintlayout.widget.a> e;
        float[] f;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.d = str.split(ListSignBean.COLLECTID_SUFFIX)[1];
            this.e = sparseArray;
        }

        @Override // defpackage.cf
        public void a(int i) {
            float[] fArr;
            int size = this.e.size();
            int c = this.e.valueAt(0).c();
            double[] dArr = new double[size];
            this.f = new float[c];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, c);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = this.e.keyAt(i2) * 0.01d;
                this.e.valueAt(i2).a(this.f);
                int i3 = 0;
                while (true) {
                    if (i3 < this.f.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.a = bx.a(i, dArr, dArr2);
        }

        @Override // defpackage.cf
        public void a(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void a(int i, androidx.constraintlayout.widget.a aVar) {
            this.e.append(i, aVar);
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            this.a.a(f, this.f);
            this.e.valueAt(0).a(view, this.f);
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: dr$g */
    /* loaded from: classes3.dex */
    static class g extends dr {
        boolean d = false;

        g() {
        }

        @Override // defpackage.dr
        public void a(View view, float f) {
            if (view instanceof ek) {
                ((ek) view).setProgress(a(f));
            } else if (this.d) {
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.d = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(f)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewSpline", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewSpline", "unable to setProgress", e2);
                    }
                }
            }
        }
    }
}
