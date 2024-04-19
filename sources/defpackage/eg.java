package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.d;
import com.xiaopeng.musicradio.bean.ListSignBean;
import defpackage.dq;
import defpackage.dr;
import defpackage.dt;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: MotionController.java */
/* renamed from: eg  reason: default package */
/* loaded from: classes3.dex */
public class eg {
    private HashMap<String, dt> A;
    private HashMap<String, dr> B;
    private HashMap<String, dq> C;
    private ee[] D;
    View b;
    int c;
    String d;
    float h;
    float i;
    private bx[] o;
    private bx p;
    private int[] q;
    private double[] r;
    private double[] s;
    private String[] t;
    private int[] u;
    Rect a = new Rect();
    private int j = -1;
    private el k = new el();
    private el l = new el();
    private ef m = new ef();
    private ef n = new ef();
    float e = Float.NaN;
    float f = 0.0f;
    float g = 1.0f;
    private int v = 4;
    private float[] w = new float[this.v];
    private ArrayList<el> x = new ArrayList<>();
    private float[] y = new float[1];
    private ArrayList<dx> z = new ArrayList<>();
    private int E = dx.a;
    private int F = dx.a;
    private View G = null;
    private int H = dx.a;
    private float I = Float.NaN;

    /* renamed from: J  reason: collision with root package name */
    private Interpolator f159J = null;
    private boolean K = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public el a(int i) {
        return this.x.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public eg(View view) {
        a(view);
    }

    public float a() {
        return this.l.f;
    }

    public float b() {
        return this.l.g;
    }

    public int c() {
        return this.k.m;
    }

    public void a(eg egVar) {
        this.k.a(egVar, egVar.k);
        this.l.a(egVar, egVar.l);
    }

    public float d() {
        return this.h;
    }

    public float e() {
        return this.i;
    }

    public void a(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        int[] iArr = new int[4];
        this.o[0].a(d, dArr);
        this.o[0].b(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.k.a(d, this.q, dArr, fArr, dArr2, fArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float[] fArr, int i) {
        float f;
        double d;
        float f2;
        float f3 = 1.0f;
        float f4 = 1.0f / (i - 1);
        HashMap<String, dr> hashMap = this.B;
        dr drVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, dr> hashMap2 = this.B;
        dr drVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, dq> hashMap3 = this.C;
        dq dqVar = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, dq> hashMap4 = this.C;
        dq dqVar2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i2 = 0;
        while (i2 < i) {
            float f5 = i2 * f4;
            if (this.g != f3) {
                if (f5 < this.f) {
                    f5 = 0.0f;
                }
                float f6 = this.f;
                f = (f5 <= f6 || ((double) f5) >= 1.0d) ? f5 : Math.min((f5 - f6) * this.g, f3);
            } else {
                f = f5;
            }
            double d2 = f;
            by byVar = this.k.b;
            float f7 = Float.NaN;
            Iterator<el> it = this.x.iterator();
            float f8 = 0.0f;
            while (it.hasNext()) {
                el next = it.next();
                if (next.b != null) {
                    if (next.d < f) {
                        byVar = next.b;
                        f8 = next.d;
                    } else if (Float.isNaN(f7)) {
                        f7 = next.d;
                    }
                }
            }
            if (byVar != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                d = (((float) byVar.a((f - f8) / f2)) * (f7 - f8)) + f8;
            } else {
                d = d2;
            }
            this.o[0].a(d, this.r);
            bx bxVar = this.p;
            if (bxVar != null) {
                double[] dArr = this.r;
                if (dArr.length > 0) {
                    bxVar.a(d, dArr);
                }
            }
            int i3 = i2 * 2;
            float f9 = f;
            int i4 = i2;
            this.k.a(d, this.q, this.r, fArr, i3);
            if (dqVar != null) {
                fArr[i3] = fArr[i3] + dqVar.a(f9);
            } else if (drVar != null) {
                fArr[i3] = fArr[i3] + drVar.a(f9);
            }
            if (dqVar2 != null) {
                int i5 = i3 + 1;
                fArr[i5] = fArr[i5] + dqVar2.a(f9);
            } else if (drVar2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + drVar2.a(f9);
            }
            i2 = i4 + 1;
            f3 = 1.0f;
        }
    }

    private float h() {
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float f3 = 0.0f;
        while (i < 100) {
            float f4 = i * f2;
            double d3 = f4;
            by byVar = this.k.b;
            float f5 = Float.NaN;
            Iterator<el> it = this.x.iterator();
            float f6 = 0.0f;
            while (it.hasNext()) {
                el next = it.next();
                if (next.b != null) {
                    if (next.d < f4) {
                        byVar = next.b;
                        f6 = next.d;
                    } else if (Float.isNaN(f5)) {
                        f5 = next.d;
                    }
                }
            }
            if (byVar != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                d3 = (((float) byVar.a((f4 - f6) / f)) * (f5 - f6)) + f6;
            }
            this.o[0].a(d3, this.r);
            this.k.a(d3, this.q, this.r, fArr, 0);
            if (i > 0) {
                f3 = (float) (f3 + Math.hypot(d2 - fArr[1], d - fArr[0]));
            }
            i++;
            d = fArr[0];
            d2 = fArr[1];
        }
        return f3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(float[] fArr, int[] iArr) {
        if (fArr != null) {
            double[] a = this.o[0].a();
            if (iArr != null) {
                Iterator<el> it = this.x.iterator();
                int i = 0;
                while (it.hasNext()) {
                    iArr[i] = it.next().q;
                    i++;
                }
            }
            int i2 = 0;
            for (int i3 = 0; i3 < a.length; i3++) {
                this.o[0].a(a[i3], this.r);
                this.k.a(a[i3], this.q, this.r, fArr, i2);
                i2 += 2;
            }
            return i2 / 2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float[] fArr, int i) {
        this.o[0].a(a(f, (float[]) null), this.r);
        this.k.a(this.q, this.r, fArr, i);
    }

    private void a(el elVar) {
        int binarySearch = Collections.binarySearch(this.x, elVar);
        if (binarySearch == 0) {
            Log.e("MotionController", " KeyPath position \"" + elVar.e + "\" outside of range");
        }
        this.x.add((-binarySearch) - 1, elVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ArrayList<dx> arrayList) {
        this.z.addAll(arrayList);
    }

    public void a(dx dxVar) {
        this.z.add(dxVar);
    }

    public void b(int i) {
        this.E = i;
    }

    public void a(int i, int i2, float f, long j) {
        ArrayList arrayList;
        double[] dArr;
        a aVar;
        dt a;
        a aVar2;
        Integer num;
        dr b;
        a aVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (this.E != dx.a) {
            this.k.l = this.E;
        }
        this.m.a(this.n, hashSet2);
        ArrayList<dx> arrayList2 = this.z;
        if (arrayList2 != null) {
            Iterator<dx> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                dx next = it.next();
                if (next instanceof eb) {
                    eb ebVar = (eb) next;
                    a(new el(i, i2, ebVar, this.k, this.l));
                    if (ebVar.q != dx.a) {
                        this.j = ebVar.q;
                    }
                } else if (next instanceof dz) {
                    next.a(hashSet3);
                } else if (next instanceof ed) {
                    next.a(hashSet);
                } else if (next instanceof ee) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((ee) next);
                } else {
                    next.b(hashMap);
                    next.a(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.D = (ee[]) arrayList.toArray(new ee[0]);
        }
        if (!hashSet2.isEmpty()) {
            this.B = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(ListSignBean.COLLECTID_SUFFIX)[1];
                    Iterator<dx> it3 = this.z.iterator();
                    while (it3.hasNext()) {
                        dx next3 = it3.next();
                        if (next3.f != null && (aVar3 = next3.f.get(str)) != null) {
                            sparseArray.append(next3.b, aVar3);
                        }
                    }
                    b = dr.a(next2, sparseArray);
                } else {
                    b = dr.b(next2);
                }
                if (b != null) {
                    b.a(next2);
                    this.B.put(next2, b);
                }
            }
            ArrayList<dx> arrayList3 = this.z;
            if (arrayList3 != null) {
                Iterator<dx> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    dx next4 = it4.next();
                    if (next4 instanceof dy) {
                        next4.a(this.B);
                    }
                }
            }
            this.m.a(this.B, 0);
            this.n.a(this.B, 100);
            for (String str2 : this.B.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                dr drVar = this.B.get(str2);
                if (drVar != null) {
                    drVar.a(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.A == null) {
                this.A = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.A.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(ListSignBean.COLLECTID_SUFFIX)[1];
                        Iterator<dx> it6 = this.z.iterator();
                        while (it6.hasNext()) {
                            dx next6 = it6.next();
                            if (next6.f != null && (aVar2 = next6.f.get(str3)) != null) {
                                sparseArray2.append(next6.b, aVar2);
                            }
                        }
                        a = dt.a(next5, sparseArray2);
                    } else {
                        a = dt.a(next5, j);
                    }
                    if (a != null) {
                        a.a(next5);
                        this.A.put(next5, a);
                    }
                }
            }
            ArrayList<dx> arrayList4 = this.z;
            if (arrayList4 != null) {
                Iterator<dx> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    dx next7 = it7.next();
                    if (next7 instanceof ed) {
                        ((ed) next7).c(this.A);
                    }
                }
            }
            for (String str4 : this.A.keySet()) {
                this.A.get(str4).a(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        el[] elVarArr = new el[this.x.size() + 2];
        elVarArr[0] = this.k;
        elVarArr[elVarArr.length - 1] = this.l;
        if (this.x.size() > 0 && this.j == -1) {
            this.j = 0;
        }
        Iterator<el> it8 = this.x.iterator();
        int i3 = 1;
        while (it8.hasNext()) {
            elVarArr[i3] = it8.next();
            i3++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.l.p.keySet()) {
            if (this.k.p.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        this.t = (String[]) hashSet4.toArray(new String[0]);
        this.u = new int[this.t.length];
        int i4 = 0;
        while (true) {
            String[] strArr = this.t;
            if (i4 >= strArr.length) {
                break;
            }
            String str6 = strArr[i4];
            this.u[i4] = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= elVarArr.length) {
                    break;
                }
                if (elVarArr[i5].p.containsKey(str6) && (aVar = elVarArr[i5].p.get(str6)) != null) {
                    int[] iArr = this.u;
                    iArr[i4] = iArr[i4] + aVar.c();
                    break;
                }
                i5++;
            }
            i4++;
        }
        boolean z = elVarArr[0].l != dx.a;
        boolean[] zArr = new boolean[18 + this.t.length];
        for (int i6 = 1; i6 < elVarArr.length; i6++) {
            elVarArr[i6].a(elVarArr[i6 - 1], zArr, this.t, z);
        }
        int i7 = 0;
        for (int i8 = 1; i8 < zArr.length; i8++) {
            if (zArr[i8]) {
                i7++;
            }
        }
        this.q = new int[i7];
        int max = Math.max(2, i7);
        this.r = new double[max];
        this.s = new double[max];
        int i9 = 0;
        for (int i10 = 1; i10 < zArr.length; i10++) {
            if (zArr[i10]) {
                this.q[i9] = i10;
                i9++;
            }
        }
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, elVarArr.length, this.q.length);
        double[] dArr3 = new double[elVarArr.length];
        for (int i11 = 0; i11 < elVarArr.length; i11++) {
            elVarArr[i11].a(dArr2[i11], this.q);
            dArr3[i11] = elVarArr[i11].d;
        }
        int i12 = 0;
        while (true) {
            int[] iArr2 = this.q;
            if (i12 >= iArr2.length) {
                break;
            }
            if (iArr2[i12] < el.a.length) {
                String str7 = el.a[this.q[i12]] + " [";
                for (int i13 = 0; i13 < elVarArr.length; i13++) {
                    str7 = str7 + dArr2[i13][i12];
                }
            }
            i12++;
        }
        this.o = new bx[this.t.length + 1];
        int i14 = 0;
        while (true) {
            String[] strArr2 = this.t;
            if (i14 >= strArr2.length) {
                break;
            }
            String str8 = strArr2[i14];
            int i15 = 0;
            int i16 = 0;
            double[] dArr4 = null;
            double[][] dArr5 = null;
            while (i15 < elVarArr.length) {
                if (elVarArr[i15].a(str8)) {
                    if (dArr5 == null) {
                        dArr4 = new double[elVarArr.length];
                        dArr5 = (double[][]) Array.newInstance(double.class, elVarArr.length, elVarArr[i15].b(str8));
                    }
                    dArr = dArr3;
                    dArr4[i16] = elVarArr[i15].d;
                    elVarArr[i15].a(str8, dArr5[i16], 0);
                    i16++;
                } else {
                    dArr = dArr3;
                }
                i15++;
                dArr3 = dArr;
            }
            i14++;
            this.o[i14] = bx.a(this.j, Arrays.copyOf(dArr4, i16), (double[][]) Arrays.copyOf(dArr5, i16));
            dArr3 = dArr3;
        }
        this.o[0] = bx.a(this.j, dArr3, dArr2);
        if (elVarArr[0].l != dx.a) {
            int length = elVarArr.length;
            int[] iArr3 = new int[length];
            double[] dArr6 = new double[length];
            double[][] dArr7 = (double[][]) Array.newInstance(double.class, length, 2);
            for (int i17 = 0; i17 < length; i17++) {
                iArr3[i17] = elVarArr[i17].l;
                dArr6[i17] = elVarArr[i17].d;
                dArr7[i17][0] = elVarArr[i17].f;
                dArr7[i17][1] = elVarArr[i17].g;
            }
            this.p = bx.a(iArr3, dArr6, dArr7);
        }
        float f2 = Float.NaN;
        this.C = new HashMap<>();
        if (this.z != null) {
            Iterator<String> it9 = hashSet3.iterator();
            while (it9.hasNext()) {
                String next8 = it9.next();
                dq b2 = dq.b(next8);
                if (b2 != null) {
                    if (b2.a() && Float.isNaN(f2)) {
                        f2 = h();
                    }
                    b2.a(next8);
                    this.C.put(next8, b2);
                }
            }
            Iterator<dx> it10 = this.z.iterator();
            while (it10.hasNext()) {
                dx next9 = it10.next();
                if (next9 instanceof dz) {
                    ((dz) next9).c(this.C);
                }
            }
            for (dq dqVar : this.C.values()) {
                dqVar.b(f2);
            }
        }
    }

    public String toString() {
        return " start: x: " + this.k.f + " y: " + this.k.g + " end: x: " + this.l.f + " y: " + this.l.g;
    }

    private void b(el elVar) {
        elVar.a((int) this.b.getX(), (int) this.b.getY(), this.b.getWidth(), this.b.getHeight());
    }

    public void a(View view) {
        this.b = view;
        this.c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            this.d = ((ConstraintLayout.a) layoutParams).b();
        }
    }

    public View f() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(View view) {
        el elVar = this.k;
        elVar.d = 0.0f;
        elVar.e = 0.0f;
        elVar.a(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.m.b(view);
    }

    public void a(ds dsVar, View view, int i, int i2, int i3) {
        el elVar = this.k;
        elVar.d = 0.0f;
        elVar.e = 0.0f;
        Rect rect = new Rect();
        switch (i) {
            case 1:
                int i4 = dsVar.b + dsVar.d;
                rect.left = ((dsVar.c + dsVar.e) - dsVar.a()) / 2;
                rect.top = i2 - ((i4 + dsVar.b()) / 2);
                rect.right = rect.left + dsVar.a();
                rect.bottom = rect.top + dsVar.b();
                break;
            case 2:
                int i5 = dsVar.b + dsVar.d;
                rect.left = i3 - (((dsVar.c + dsVar.e) + dsVar.a()) / 2);
                rect.top = (i5 - dsVar.b()) / 2;
                rect.right = rect.left + dsVar.a();
                rect.bottom = rect.top + dsVar.b();
                break;
        }
        this.k.a(rect.left, rect.top, rect.width(), rect.height());
        this.m.a(rect, view, i, dsVar.a);
    }

    void a(Rect rect, Rect rect2, int i, int i2, int i3) {
        switch (i) {
            case 1:
                int i4 = rect.left + rect.right;
                rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
                rect2.top = i3 - ((i4 + rect.height()) / 2);
                rect2.right = rect2.left + rect.width();
                rect2.bottom = rect2.top + rect.height();
                return;
            case 2:
                int i5 = rect.left + rect.right;
                rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
                rect2.top = (i5 - rect.height()) / 2;
                rect2.right = rect2.left + rect.width();
                rect2.bottom = rect2.top + rect.height();
                return;
            case 3:
                int i6 = rect.left + rect.right;
                int i7 = rect.top;
                int i8 = rect.bottom;
                rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
                rect2.top = i3 - ((i6 + rect.height()) / 2);
                rect2.right = rect2.left + rect.width();
                rect2.bottom = rect2.top + rect.height();
                return;
            case 4:
                int i9 = rect.left + rect.right;
                rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
                rect2.top = (i9 - rect.height()) / 2;
                rect2.right = rect2.left + rect.width();
                rect2.bottom = rect2.top + rect.height();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Rect rect, d dVar, int i, int i2) {
        int i3 = dVar.c;
        if (i3 != 0) {
            a(rect, this.a, i3, i, i2);
        }
        el elVar = this.k;
        elVar.d = 0.0f;
        elVar.e = 0.0f;
        b(elVar);
        this.k.a(rect.left, rect.top, rect.width(), rect.height());
        d.a a = dVar.a(this.c);
        this.k.a(a);
        this.e = a.d.g;
        this.m.a(rect, dVar, i3, this.c);
        this.F = a.f.i;
        this.H = a.d.k;
        this.I = a.d.j;
        this.f159J = a(this.b.getContext(), a.d.m, a.d.l, a.d.n);
    }

    private static Interpolator a(Context context, int i, String str, int i2) {
        switch (i) {
            case -2:
                return AnimationUtils.loadInterpolator(context, i2);
            case -1:
                final by a = by.a(str);
                return new Interpolator() { // from class: eg.1
                    @Override // android.animation.TimeInterpolator
                    public float getInterpolation(float f) {
                        return (float) by.this.a(f);
                    }
                };
            case 0:
                return new AccelerateDecelerateInterpolator();
            case 1:
                return new AccelerateInterpolator();
            case 2:
                return new DecelerateInterpolator();
            case 3:
                return null;
            case 4:
                return new BounceInterpolator();
            case 5:
                return new OvershootInterpolator();
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Rect rect, d dVar, int i, int i2) {
        int i3 = dVar.c;
        if (i3 != 0) {
            a(rect, this.a, i3, i, i2);
            rect = this.a;
        }
        el elVar = this.l;
        elVar.d = 1.0f;
        elVar.e = 1.0f;
        b(elVar);
        this.l.a(rect.left, rect.top, rect.width(), rect.height());
        this.l.a(dVar.a(this.c));
        this.n.a(rect, dVar, i3, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(View view) {
        el elVar = this.k;
        elVar.d = 0.0f;
        elVar.e = 0.0f;
        this.K = true;
        elVar.a(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.l.a(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.m.b(view);
        this.n.b(view);
    }

    private float a(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else if (this.g != 1.0d) {
            if (f < this.f) {
                f = 0.0f;
            }
            float f3 = this.f;
            if (f > f3 && f < 1.0d) {
                f = Math.min((f - f3) * this.g, 1.0f);
            }
        }
        by byVar = this.k.b;
        float f4 = Float.NaN;
        Iterator<el> it = this.x.iterator();
        while (it.hasNext()) {
            el next = it.next();
            if (next.b != null) {
                if (next.d < f) {
                    byVar = next.b;
                    f2 = next.d;
                } else if (Float.isNaN(f4)) {
                    f4 = next.d;
                }
            }
        }
        if (byVar != null) {
            float f5 = (Float.isNaN(f4) ? 1.0f : f4) - f2;
            double d = (f - f2) / f5;
            f = (((float) byVar.a(d)) * f5) + f2;
            if (fArr != null) {
                fArr[0] = (float) byVar.b(d);
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        if (!"button".equals(du.a(this.b)) || this.D == null) {
            return;
        }
        int i = 0;
        while (true) {
            ee[] eeVarArr = this.D;
            if (i >= eeVarArr.length) {
                return;
            }
            eeVarArr[i].a(z ? -100.0f : 100.0f, this.b);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(View view, float f, long j, bz bzVar) {
        float f2;
        dt.d dVar;
        boolean z;
        int i;
        double d;
        View view2;
        float f3;
        float a = a(f, (float[]) null);
        if (this.H != dx.a) {
            float f4 = 1.0f / this.H;
            float floor = ((float) Math.floor(a / f4)) * f4;
            float f5 = (a % f4) / f4;
            if (!Float.isNaN(this.I)) {
                f5 = (f5 + this.I) % 1.0f;
            }
            Interpolator interpolator = this.f159J;
            if (interpolator != null) {
                f3 = interpolator.getInterpolation(f5);
            } else {
                f3 = ((double) f5) > 0.5d ? 1.0f : 0.0f;
            }
            f2 = (f3 * f4) + floor;
        } else {
            f2 = a;
        }
        HashMap<String, dr> hashMap = this.B;
        if (hashMap != null) {
            for (dr drVar : hashMap.values()) {
                drVar.a(view, f2);
            }
        }
        HashMap<String, dt> hashMap2 = this.A;
        if (hashMap2 != null) {
            dVar = null;
            boolean z2 = false;
            for (dt dtVar : hashMap2.values()) {
                if (dtVar instanceof dt.d) {
                    dVar = (dt.d) dtVar;
                } else {
                    z2 |= dtVar.a(view, f2, j, bzVar);
                }
            }
            z = z2;
        } else {
            dVar = null;
            z = false;
        }
        bx[] bxVarArr = this.o;
        if (bxVarArr != null) {
            double d2 = f2;
            bxVarArr[0].a(d2, this.r);
            this.o[0].b(d2, this.s);
            bx bxVar = this.p;
            if (bxVar != null) {
                double[] dArr = this.r;
                if (dArr.length > 0) {
                    bxVar.a(d2, dArr);
                    this.p.b(d2, this.s);
                }
            }
            if (this.K) {
                d = d2;
            } else {
                d = d2;
                this.k.a(f2, view, this.q, this.r, this.s, (double[]) null);
            }
            if (this.F != dx.a) {
                if (this.G == null) {
                    this.G = ((View) view.getParent()).findViewById(this.F);
                }
                if (this.G != null) {
                    float top = (view2.getTop() + this.G.getBottom()) / 2.0f;
                    float left = (this.G.getLeft() + this.G.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, dr> hashMap3 = this.B;
            if (hashMap3 != null) {
                for (dr drVar2 : hashMap3.values()) {
                    if (drVar2 instanceof dr.d) {
                        double[] dArr2 = this.s;
                        if (dArr2.length > 1) {
                            ((dr.d) drVar2).a(view, f2, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.s;
                i = 1;
                z |= dVar.a(view, bzVar, f2, j, dArr3[0], dArr3[1]);
            } else {
                i = 1;
            }
            int i2 = i;
            while (true) {
                bx[] bxVarArr2 = this.o;
                if (i2 >= bxVarArr2.length) {
                    break;
                }
                bxVarArr2[i2].a(d, this.w);
                this.k.p.get(this.t[i2 - 1]).a(view, this.w);
                i2++;
            }
            if (this.m.a == 0) {
                if (f2 <= 0.0f) {
                    view.setVisibility(this.m.b);
                } else if (f2 >= 1.0f) {
                    view.setVisibility(this.n.b);
                } else if (this.n.b != this.m.b) {
                    view.setVisibility(0);
                }
            }
            if (this.D != null) {
                int i3 = 0;
                while (true) {
                    ee[] eeVarArr = this.D;
                    if (i3 >= eeVarArr.length) {
                        break;
                    }
                    eeVarArr[i3].a(f2, view);
                    i3++;
                }
            }
        } else {
            i = 1;
            float f6 = this.k.f + ((this.l.f - this.k.f) * f2);
            float f7 = f6 + 0.5f;
            int i4 = (int) f7;
            float f8 = this.k.g + ((this.l.g - this.k.g) * f2) + 0.5f;
            int i5 = (int) f8;
            int i6 = (int) (f7 + this.k.h + ((this.l.h - this.k.h) * f2));
            int i7 = (int) (f8 + this.k.i + ((this.l.i - this.k.i) * f2));
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (this.l.h != this.k.h || this.l.i != this.k.i) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
            }
            view.layout(i4, i5, i6, i7);
        }
        HashMap<String, dq> hashMap4 = this.C;
        if (hashMap4 != null) {
            for (dq dqVar : hashMap4.values()) {
                if (dqVar instanceof dq.d) {
                    double[] dArr4 = this.s;
                    ((dq.d) dqVar).a(view, f2, dArr4[0], dArr4[i]);
                } else {
                    dqVar.a(view, f2);
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float a = a(f, this.y);
        bx[] bxVarArr = this.o;
        int i = 0;
        if (bxVarArr != null) {
            double d = a;
            bxVarArr[0].b(d, this.s);
            this.o[0].a(d, this.r);
            float f4 = this.y[0];
            while (true) {
                dArr = this.s;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * f4;
                i++;
            }
            bx bxVar = this.p;
            if (bxVar != null) {
                double[] dArr2 = this.r;
                if (dArr2.length > 0) {
                    bxVar.a(d, dArr2);
                    this.p.b(d, this.s);
                    this.k.a(f2, f3, fArr, this.q, this.s, this.r);
                    return;
                }
                return;
            }
            this.k.a(f2, f3, fArr, this.q, dArr, this.r);
            return;
        }
        float f5 = this.l.f - this.k.f;
        float f6 = this.l.g - this.k.g;
        float f7 = (this.l.i - this.k.i) + f6;
        fArr[0] = (f5 * (1.0f - f2)) + (((this.l.h - this.k.h) + f5) * f2);
        fArr[1] = (f6 * (1.0f - f3)) + (f7 * f3);
    }

    public int g() {
        int i = this.k.c;
        Iterator<el> it = this.x.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().c);
        }
        return Math.max(i, this.l.c);
    }
}
