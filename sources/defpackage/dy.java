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
/* compiled from: KeyAttributes.java */
/* renamed from: dy  reason: default package */
/* loaded from: classes3.dex */
public class dy extends dx {
    private String g;
    private int h = -1;
    private boolean i = false;
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
    private float u = Float.NaN;
    private float v = Float.NaN;
    private float w = Float.NaN;

    public dy() {
        this.e = 1;
        this.f = new HashMap<>();
    }

    @Override // defpackage.dx
    public void a(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, h.b.KeyAttribute));
    }

    @Override // defpackage.dx
    public void a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.w)) {
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
        if (!Float.isNaN(this.j)) {
            hashMap.put("alpha", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put("elevation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("rotation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.m)) {
            hashMap.put("rotationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("rotationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.p)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.t)) {
            hashMap.put("translationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.u)) {
            hashMap.put("translationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.v)) {
            hashMap.put("translationZ", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.q)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.r)) {
            hashMap.put("scaleX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.s)) {
            hashMap.put("scaleY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.w)) {
            hashMap.put("progress", Integer.valueOf(this.h));
        }
        if (this.f.size() > 0) {
            Iterator<String> it = this.f.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.h));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r1.equals("transitionPathRotate") != false) goto L15;
     */
    @Override // defpackage.dx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.HashMap<java.lang.String, defpackage.dr> r7) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy.a(java.util.HashMap):void");
    }

    /* compiled from: KeyAttributes.java */
    /* renamed from: dy$a */
    /* loaded from: classes3.dex */
    private static class a {
        private static SparseIntArray a = new SparseIntArray();

        static {
            a.append(h.b.KeyAttribute_android_alpha, 1);
            a.append(h.b.KeyAttribute_android_elevation, 2);
            a.append(h.b.KeyAttribute_android_rotation, 4);
            a.append(h.b.KeyAttribute_android_rotationX, 5);
            a.append(h.b.KeyAttribute_android_rotationY, 6);
            a.append(h.b.KeyAttribute_android_transformPivotX, 19);
            a.append(h.b.KeyAttribute_android_transformPivotY, 20);
            a.append(h.b.KeyAttribute_android_scaleX, 7);
            a.append(h.b.KeyAttribute_transitionPathRotate, 8);
            a.append(h.b.KeyAttribute_transitionEasing, 9);
            a.append(h.b.KeyAttribute_motionTarget, 10);
            a.append(h.b.KeyAttribute_framePosition, 12);
            a.append(h.b.KeyAttribute_curveFit, 13);
            a.append(h.b.KeyAttribute_android_scaleY, 14);
            a.append(h.b.KeyAttribute_android_translationX, 15);
            a.append(h.b.KeyAttribute_android_translationY, 16);
            a.append(h.b.KeyAttribute_android_translationZ, 17);
            a.append(h.b.KeyAttribute_motionProgress, 18);
        }

        public static void a(dy dyVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        dyVar.j = typedArray.getFloat(index, dyVar.j);
                        break;
                    case 2:
                        dyVar.k = typedArray.getDimension(index, dyVar.k);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                        break;
                    case 4:
                        dyVar.l = typedArray.getFloat(index, dyVar.l);
                        break;
                    case 5:
                        dyVar.m = typedArray.getFloat(index, dyVar.m);
                        break;
                    case 6:
                        dyVar.n = typedArray.getFloat(index, dyVar.n);
                        break;
                    case 7:
                        dyVar.r = typedArray.getFloat(index, dyVar.r);
                        break;
                    case 8:
                        dyVar.q = typedArray.getFloat(index, dyVar.q);
                        break;
                    case 9:
                        dyVar.g = typedArray.getString(index);
                        break;
                    case 10:
                        if (ek.a) {
                            dyVar.c = typedArray.getResourceId(index, dyVar.c);
                            if (dyVar.c == -1) {
                                dyVar.d = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            dyVar.d = typedArray.getString(index);
                            break;
                        } else {
                            dyVar.c = typedArray.getResourceId(index, dyVar.c);
                            break;
                        }
                    case 12:
                        dyVar.b = typedArray.getInt(index, dyVar.b);
                        break;
                    case 13:
                        dyVar.h = typedArray.getInteger(index, dyVar.h);
                        break;
                    case 14:
                        dyVar.s = typedArray.getFloat(index, dyVar.s);
                        break;
                    case 15:
                        dyVar.t = typedArray.getDimension(index, dyVar.t);
                        break;
                    case 16:
                        dyVar.u = typedArray.getDimension(index, dyVar.u);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT >= 21) {
                            dyVar.v = typedArray.getDimension(index, dyVar.v);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        dyVar.w = typedArray.getFloat(index, dyVar.w);
                        break;
                    case 19:
                        dyVar.o = typedArray.getDimension(index, dyVar.o);
                        break;
                    case 20:
                        dyVar.p = typedArray.getDimension(index, dyVar.p);
                        break;
                }
            }
        }
    }

    @Override // defpackage.dx
    public dx a(dx dxVar) {
        super.a(dxVar);
        dy dyVar = (dy) dxVar;
        this.h = dyVar.h;
        this.i = dyVar.i;
        this.j = dyVar.j;
        this.k = dyVar.k;
        this.l = dyVar.l;
        this.m = dyVar.m;
        this.n = dyVar.n;
        this.o = dyVar.o;
        this.p = dyVar.p;
        this.q = dyVar.q;
        this.r = dyVar.r;
        this.s = dyVar.s;
        this.t = dyVar.t;
        this.u = dyVar.u;
        this.v = dyVar.v;
        this.w = dyVar.w;
        return this;
    }

    @Override // defpackage.dx
    /* renamed from: a */
    public dx clone() {
        return new dy().a((dx) this);
    }
}
