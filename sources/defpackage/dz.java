package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: KeyCycle.java */
/* renamed from: dz  reason: default package */
/* loaded from: classes3.dex */
public class dz extends dx {
    private String g = null;
    private int h = 0;
    private int i = -1;
    private String j = null;
    private float k = Float.NaN;
    private float l = 0.0f;
    private float m = 0.0f;
    private float n = Float.NaN;
    private int o = -1;
    private float p = Float.NaN;
    private float q = Float.NaN;
    private float r = Float.NaN;
    private float s = Float.NaN;
    private float t = Float.NaN;
    private float u = Float.NaN;
    private float v = Float.NaN;
    private float w = Float.NaN;
    private float x = Float.NaN;
    private float y = Float.NaN;
    private float z = Float.NaN;

    public dz() {
        this.e = 4;
        this.f = new HashMap<>();
    }

    @Override // defpackage.dx
    public void a(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, h.b.KeyCycle));
    }

    @Override // defpackage.dx
    public void a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.p)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.x)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.y)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.z)) {
            hashSet.add("translationZ");
        }
        if (this.f.size() > 0) {
            Iterator<String> it = this.f.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void c(HashMap<String, dq> hashMap) {
        dq dqVar;
        dq dqVar2;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = this.f.get(str.substring(7));
                if (aVar != null && aVar.a() == a.EnumC0025a.FLOAT_TYPE && (dqVar = hashMap.get(str)) != null) {
                    dqVar.a(this.b, this.i, this.j, this.o, this.k, this.l, this.m, aVar.d(), aVar);
                }
            } else {
                float b = b(str);
                if (!Float.isNaN(b) && (dqVar2 = hashMap.get(str)) != null) {
                    dqVar2.a(this.b, this.i, this.j, this.o, this.k, this.l, this.m, b);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public float b(String str) {
        char c;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return this.p;
            case 1:
                return this.q;
            case 2:
                return this.r;
            case 3:
                return this.t;
            case 4:
                return this.u;
            case 5:
                return this.s;
            case 6:
                return this.v;
            case 7:
                return this.w;
            case '\b':
                return this.x;
            case '\t':
                return this.y;
            case '\n':
                return this.z;
            case 11:
                return this.l;
            case '\f':
                return this.m;
            case '\r':
                return this.n;
            default:
                if (str.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    @Override // defpackage.dx
    public void a(HashMap<String, dr> hashMap) {
        du.a("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String str : hashMap.keySet()) {
            dr drVar = hashMap.get(str);
            if (drVar != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            c = '\f';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        drVar.a(this.b, this.p);
                        continue;
                    case 1:
                        drVar.a(this.b, this.q);
                        continue;
                    case 2:
                        drVar.a(this.b, this.r);
                        continue;
                    case 3:
                        drVar.a(this.b, this.t);
                        continue;
                    case 4:
                        drVar.a(this.b, this.u);
                        continue;
                    case 5:
                        drVar.a(this.b, this.s);
                        continue;
                    case 6:
                        drVar.a(this.b, this.v);
                        continue;
                    case 7:
                        drVar.a(this.b, this.w);
                        continue;
                    case '\b':
                        drVar.a(this.b, this.x);
                        continue;
                    case '\t':
                        drVar.a(this.b, this.y);
                        continue;
                    case '\n':
                        drVar.a(this.b, this.z);
                        continue;
                    case 11:
                        drVar.a(this.b, this.l);
                        continue;
                    case '\f':
                        drVar.a(this.b, this.m);
                        continue;
                    case '\r':
                        drVar.a(this.b, this.n);
                        continue;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    /* compiled from: KeyCycle.java */
    /* renamed from: dz$a */
    /* loaded from: classes3.dex */
    private static class a {
        private static SparseIntArray a = new SparseIntArray();

        static {
            a.append(h.b.KeyCycle_motionTarget, 1);
            a.append(h.b.KeyCycle_framePosition, 2);
            a.append(h.b.KeyCycle_transitionEasing, 3);
            a.append(h.b.KeyCycle_curveFit, 4);
            a.append(h.b.KeyCycle_waveShape, 5);
            a.append(h.b.KeyCycle_wavePeriod, 6);
            a.append(h.b.KeyCycle_waveOffset, 7);
            a.append(h.b.KeyCycle_waveVariesBy, 8);
            a.append(h.b.KeyCycle_android_alpha, 9);
            a.append(h.b.KeyCycle_android_elevation, 10);
            a.append(h.b.KeyCycle_android_rotation, 11);
            a.append(h.b.KeyCycle_android_rotationX, 12);
            a.append(h.b.KeyCycle_android_rotationY, 13);
            a.append(h.b.KeyCycle_transitionPathRotate, 14);
            a.append(h.b.KeyCycle_android_scaleX, 15);
            a.append(h.b.KeyCycle_android_scaleY, 16);
            a.append(h.b.KeyCycle_android_translationX, 17);
            a.append(h.b.KeyCycle_android_translationY, 18);
            a.append(h.b.KeyCycle_android_translationZ, 19);
            a.append(h.b.KeyCycle_motionProgress, 20);
            a.append(h.b.KeyCycle_wavePhase, 21);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(dz dzVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        if (ek.a) {
                            dzVar.c = typedArray.getResourceId(index, dzVar.c);
                            if (dzVar.c == -1) {
                                dzVar.d = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            dzVar.d = typedArray.getString(index);
                            break;
                        } else {
                            dzVar.c = typedArray.getResourceId(index, dzVar.c);
                            break;
                        }
                    case 2:
                        dzVar.b = typedArray.getInt(index, dzVar.b);
                        break;
                    case 3:
                        dzVar.g = typedArray.getString(index);
                        break;
                    case 4:
                        dzVar.h = typedArray.getInteger(index, dzVar.h);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            dzVar.j = typedArray.getString(index);
                            dzVar.i = 7;
                            break;
                        } else {
                            dzVar.i = typedArray.getInt(index, dzVar.i);
                            break;
                        }
                    case 6:
                        dzVar.k = typedArray.getFloat(index, dzVar.k);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            dzVar.l = typedArray.getDimension(index, dzVar.l);
                            break;
                        } else {
                            dzVar.l = typedArray.getFloat(index, dzVar.l);
                            break;
                        }
                    case 8:
                        dzVar.o = typedArray.getInt(index, dzVar.o);
                        break;
                    case 9:
                        dzVar.p = typedArray.getFloat(index, dzVar.p);
                        break;
                    case 10:
                        dzVar.q = typedArray.getDimension(index, dzVar.q);
                        break;
                    case 11:
                        dzVar.r = typedArray.getFloat(index, dzVar.r);
                        break;
                    case 12:
                        dzVar.t = typedArray.getFloat(index, dzVar.t);
                        break;
                    case 13:
                        dzVar.u = typedArray.getFloat(index, dzVar.u);
                        break;
                    case 14:
                        dzVar.s = typedArray.getFloat(index, dzVar.s);
                        break;
                    case 15:
                        dzVar.v = typedArray.getFloat(index, dzVar.v);
                        break;
                    case 16:
                        dzVar.w = typedArray.getFloat(index, dzVar.w);
                        break;
                    case 17:
                        dzVar.x = typedArray.getDimension(index, dzVar.x);
                        break;
                    case 18:
                        dzVar.y = typedArray.getDimension(index, dzVar.y);
                        break;
                    case 19:
                        if (Build.VERSION.SDK_INT >= 21) {
                            dzVar.z = typedArray.getDimension(index, dzVar.z);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        dzVar.n = typedArray.getFloat(index, dzVar.n);
                        break;
                    case 21:
                        dzVar.m = typedArray.getFloat(index, dzVar.m) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                        break;
                }
            }
        }
    }

    @Override // defpackage.dx
    public dx a(dx dxVar) {
        super.a(dxVar);
        dz dzVar = (dz) dxVar;
        this.g = dzVar.g;
        this.h = dzVar.h;
        this.i = dzVar.i;
        this.j = dzVar.j;
        this.k = dzVar.k;
        this.l = dzVar.l;
        this.m = dzVar.m;
        this.n = dzVar.n;
        this.o = dzVar.o;
        this.p = dzVar.p;
        this.q = dzVar.q;
        this.r = dzVar.r;
        this.s = dzVar.s;
        this.t = dzVar.t;
        this.u = dzVar.u;
        this.v = dzVar.v;
        this.w = dzVar.w;
        this.x = dzVar.x;
        this.y = dzVar.y;
        this.z = dzVar.z;
        return this;
    }

    @Override // defpackage.dx
    /* renamed from: a */
    public dx clone() {
        return new dz().a((dx) this);
    }
}
