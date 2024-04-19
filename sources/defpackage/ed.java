package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: KeyTimeCycle.java */
/* renamed from: ed  reason: default package */
/* loaded from: classes3.dex */
public class ed extends dx {
    private String g;
    private int h = -1;
    private float i = Float.NaN;
    private float j = Float.NaN;
    private float k = Float.NaN;
    private float l = Float.NaN;
    private float m = Float.NaN;
    private float n = Float.NaN;
    private float o = Float.NaN;
    private float p = Float.NaN;
    private float q = Float.NaN;
    private float r = Float.NaN;
    private float s = Float.NaN;
    private float t = Float.NaN;
    private int u = 0;
    private String v = null;
    private float w = Float.NaN;
    private float x = 0.0f;

    public ed() {
        this.e = 3;
        this.f = new HashMap<>();
    }

    @Override // defpackage.dx
    public void a(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, h.b.KeyTimeCycle));
    }

    @Override // defpackage.dx
    public void a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("progress");
        }
        if (this.f.size() > 0) {
            Iterator<String> it = this.f.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // defpackage.dx
    public void b(HashMap<String, Integer> hashMap) {
        if (this.h == -1) {
            return;
        }
        if (!Float.isNaN(this.i)) {
            hashMap.put("alpha", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.j)) {
            hashMap.put("elevation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put("rotation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("rotationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.m)) {
            hashMap.put("rotationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.q)) {
            hashMap.put("translationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.r)) {
            hashMap.put("translationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.s)) {
            hashMap.put("translationZ", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("scaleX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("scaleY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.t)) {
            hashMap.put("progress", Integer.valueOf(this.h));
        }
        if (this.f.size() > 0) {
            Iterator<String> it = this.f.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.h));
            }
        }
    }

    @Override // defpackage.dx
    public void a(HashMap<String, dr> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        if (r1.equals("scaleY") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.util.HashMap<java.lang.String, defpackage.dt> r11) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed.c(java.util.HashMap):void");
    }

    /* compiled from: KeyTimeCycle.java */
    /* renamed from: ed$a */
    /* loaded from: classes3.dex */
    private static class a {
        private static SparseIntArray a = new SparseIntArray();

        static {
            a.append(h.b.KeyTimeCycle_android_alpha, 1);
            a.append(h.b.KeyTimeCycle_android_elevation, 2);
            a.append(h.b.KeyTimeCycle_android_rotation, 4);
            a.append(h.b.KeyTimeCycle_android_rotationX, 5);
            a.append(h.b.KeyTimeCycle_android_rotationY, 6);
            a.append(h.b.KeyTimeCycle_android_scaleX, 7);
            a.append(h.b.KeyTimeCycle_transitionPathRotate, 8);
            a.append(h.b.KeyTimeCycle_transitionEasing, 9);
            a.append(h.b.KeyTimeCycle_motionTarget, 10);
            a.append(h.b.KeyTimeCycle_framePosition, 12);
            a.append(h.b.KeyTimeCycle_curveFit, 13);
            a.append(h.b.KeyTimeCycle_android_scaleY, 14);
            a.append(h.b.KeyTimeCycle_android_translationX, 15);
            a.append(h.b.KeyTimeCycle_android_translationY, 16);
            a.append(h.b.KeyTimeCycle_android_translationZ, 17);
            a.append(h.b.KeyTimeCycle_motionProgress, 18);
            a.append(h.b.KeyTimeCycle_wavePeriod, 20);
            a.append(h.b.KeyTimeCycle_waveOffset, 21);
            a.append(h.b.KeyTimeCycle_waveShape, 19);
        }

        public static void a(ed edVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        edVar.i = typedArray.getFloat(index, edVar.i);
                        break;
                    case 2:
                        edVar.j = typedArray.getDimension(index, edVar.j);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                        break;
                    case 4:
                        edVar.k = typedArray.getFloat(index, edVar.k);
                        break;
                    case 5:
                        edVar.l = typedArray.getFloat(index, edVar.l);
                        break;
                    case 6:
                        edVar.m = typedArray.getFloat(index, edVar.m);
                        break;
                    case 7:
                        edVar.o = typedArray.getFloat(index, edVar.o);
                        break;
                    case 8:
                        edVar.n = typedArray.getFloat(index, edVar.n);
                        break;
                    case 9:
                        edVar.g = typedArray.getString(index);
                        break;
                    case 10:
                        if (ek.a) {
                            edVar.c = typedArray.getResourceId(index, edVar.c);
                            if (edVar.c == -1) {
                                edVar.d = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            edVar.d = typedArray.getString(index);
                            break;
                        } else {
                            edVar.c = typedArray.getResourceId(index, edVar.c);
                            break;
                        }
                    case 12:
                        edVar.b = typedArray.getInt(index, edVar.b);
                        break;
                    case 13:
                        edVar.h = typedArray.getInteger(index, edVar.h);
                        break;
                    case 14:
                        edVar.p = typedArray.getFloat(index, edVar.p);
                        break;
                    case 15:
                        edVar.q = typedArray.getDimension(index, edVar.q);
                        break;
                    case 16:
                        edVar.r = typedArray.getDimension(index, edVar.r);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT >= 21) {
                            edVar.s = typedArray.getDimension(index, edVar.s);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        edVar.t = typedArray.getFloat(index, edVar.t);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            edVar.v = typedArray.getString(index);
                            edVar.u = 7;
                            break;
                        } else {
                            edVar.u = typedArray.getInt(index, edVar.u);
                            break;
                        }
                    case 20:
                        edVar.w = typedArray.getFloat(index, edVar.w);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            edVar.x = typedArray.getDimension(index, edVar.x);
                            break;
                        } else {
                            edVar.x = typedArray.getFloat(index, edVar.x);
                            break;
                        }
                }
            }
        }
    }

    @Override // defpackage.dx
    public dx a(dx dxVar) {
        super.a(dxVar);
        ed edVar = (ed) dxVar;
        this.g = edVar.g;
        this.h = edVar.h;
        this.u = edVar.u;
        this.w = edVar.w;
        this.x = edVar.x;
        this.t = edVar.t;
        this.i = edVar.i;
        this.j = edVar.j;
        this.k = edVar.k;
        this.n = edVar.n;
        this.l = edVar.l;
        this.m = edVar.m;
        this.o = edVar.o;
        this.p = edVar.p;
        this.q = edVar.q;
        this.r = edVar.r;
        this.s = edVar.s;
        return this;
    }

    @Override // defpackage.dx
    /* renamed from: a */
    public dx clone() {
        return new ed().a((dx) this);
    }
}
