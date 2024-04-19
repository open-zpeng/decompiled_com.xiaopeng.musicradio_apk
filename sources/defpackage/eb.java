package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.h;
import java.util.HashMap;
/* compiled from: KeyPosition.java */
/* renamed from: eb  reason: default package */
/* loaded from: classes3.dex */
public class eb extends ec {
    String g = null;
    int h = a;
    int i = 0;
    float j = Float.NaN;
    float k = Float.NaN;
    float l = Float.NaN;
    float m = Float.NaN;
    float n = Float.NaN;
    float o = Float.NaN;
    int p = 0;
    private float r = Float.NaN;
    private float s = Float.NaN;

    @Override // defpackage.dx
    public void a(HashMap<String, dr> hashMap) {
    }

    public eb() {
        this.e = 2;
    }

    @Override // defpackage.dx
    public void a(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, h.b.KeyPosition));
    }

    /* compiled from: KeyPosition.java */
    /* renamed from: eb$a */
    /* loaded from: classes3.dex */
    private static class a {
        private static SparseIntArray a = new SparseIntArray();

        static {
            a.append(h.b.KeyPosition_motionTarget, 1);
            a.append(h.b.KeyPosition_framePosition, 2);
            a.append(h.b.KeyPosition_transitionEasing, 3);
            a.append(h.b.KeyPosition_curveFit, 4);
            a.append(h.b.KeyPosition_drawPath, 5);
            a.append(h.b.KeyPosition_percentX, 6);
            a.append(h.b.KeyPosition_percentY, 7);
            a.append(h.b.KeyPosition_keyPositionType, 9);
            a.append(h.b.KeyPosition_sizePercent, 8);
            a.append(h.b.KeyPosition_percentWidth, 11);
            a.append(h.b.KeyPosition_percentHeight, 12);
            a.append(h.b.KeyPosition_pathMotionArc, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(eb ebVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        if (ek.a) {
                            ebVar.c = typedArray.getResourceId(index, ebVar.c);
                            if (ebVar.c == -1) {
                                ebVar.d = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            ebVar.d = typedArray.getString(index);
                            break;
                        } else {
                            ebVar.c = typedArray.getResourceId(index, ebVar.c);
                            break;
                        }
                    case 2:
                        ebVar.b = typedArray.getInt(index, ebVar.b);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            ebVar.g = typedArray.getString(index);
                            break;
                        } else {
                            ebVar.g = by.c[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        ebVar.q = typedArray.getInteger(index, ebVar.q);
                        break;
                    case 5:
                        ebVar.i = typedArray.getInt(index, ebVar.i);
                        break;
                    case 6:
                        ebVar.l = typedArray.getFloat(index, ebVar.l);
                        break;
                    case 7:
                        ebVar.m = typedArray.getFloat(index, ebVar.m);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, ebVar.k);
                        ebVar.j = f;
                        ebVar.k = f;
                        break;
                    case 9:
                        ebVar.p = typedArray.getInt(index, ebVar.p);
                        break;
                    case 10:
                        ebVar.h = typedArray.getInt(index, ebVar.h);
                        break;
                    case 11:
                        ebVar.j = typedArray.getFloat(index, ebVar.j);
                        break;
                    case 12:
                        ebVar.k = typedArray.getFloat(index, ebVar.k);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                        break;
                }
            }
            if (ebVar.b == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    @Override // defpackage.dx
    public dx a(dx dxVar) {
        super.a(dxVar);
        eb ebVar = (eb) dxVar;
        this.g = ebVar.g;
        this.h = ebVar.h;
        this.i = ebVar.i;
        this.j = ebVar.j;
        this.k = Float.NaN;
        this.l = ebVar.l;
        this.m = ebVar.m;
        this.n = ebVar.n;
        this.o = ebVar.o;
        this.r = ebVar.r;
        this.s = ebVar.s;
        return this;
    }

    @Override // defpackage.dx
    /* renamed from: a */
    public dx clone() {
        return new eb().a(this);
    }
}
