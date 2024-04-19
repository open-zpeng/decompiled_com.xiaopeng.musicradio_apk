package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.h;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: KeyTrigger.java */
/* renamed from: ee  reason: default package */
/* loaded from: classes3.dex */
public class ee extends dx {
    private float z;
    private int n = -1;
    private String o = null;
    private int p = a;
    private String q = null;
    private String r = null;
    private int s = a;
    private int t = a;
    private View u = null;
    float g = 0.1f;
    private boolean v = true;
    private boolean w = true;
    private boolean x = true;
    private float y = Float.NaN;
    private boolean A = false;
    int h = a;
    int i = a;
    int j = a;
    RectF k = new RectF();
    RectF l = new RectF();
    HashMap<String, Method> m = new HashMap<>();

    @Override // defpackage.dx
    public void a(HashMap<String, dr> hashMap) {
    }

    @Override // defpackage.dx
    public void a(HashSet<String> hashSet) {
    }

    public ee() {
        this.e = 5;
        this.f = new HashMap<>();
    }

    @Override // defpackage.dx
    public void a(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, h.b.KeyTrigger), context);
    }

    private void a(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    public void a(float f, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this.t != a) {
            if (this.u == null) {
                this.u = ((ViewGroup) view.getParent()).findViewById(this.t);
            }
            a(this.k, this.u, this.A);
            a(this.l, view, this.A);
            if (this.k.intersect(this.l)) {
                if (this.v) {
                    this.v = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.x) {
                    this.x = false;
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.w = true;
                z5 = z6;
                z4 = false;
            } else {
                if (this.v) {
                    z = false;
                } else {
                    this.v = true;
                    z = true;
                }
                if (this.w) {
                    this.w = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.x = true;
                z5 = false;
            }
            boolean z7 = z5;
            z2 = z4;
            z3 = z7;
        } else {
            if (this.v) {
                float f2 = this.y;
                if ((f - f2) * (this.z - f2) < 0.0f) {
                    this.v = false;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                if (Math.abs(f - this.y) > this.g) {
                    this.v = true;
                }
                z = false;
            }
            if (this.w) {
                float f3 = this.y;
                float f4 = f - f3;
                if ((this.z - f3) * f4 >= 0.0f || f4 >= 0.0f) {
                    z2 = false;
                } else {
                    this.w = false;
                    z2 = true;
                }
            } else {
                if (Math.abs(f - this.y) > this.g) {
                    this.w = true;
                }
                z2 = false;
            }
            if (this.x) {
                float f5 = this.y;
                float f6 = f - f5;
                if ((this.z - f5) * f6 >= 0.0f || f6 <= 0.0f) {
                    z3 = false;
                } else {
                    this.x = false;
                    z3 = true;
                }
            } else {
                if (Math.abs(f - this.y) > this.g) {
                    this.x = true;
                }
                z3 = false;
            }
        }
        this.z = f;
        if (z2 || z || z3) {
            ((ek) view.getParent()).a(this.s, z3, f);
        }
        View findViewById = this.p == a ? view : ((ek) view.getParent()).findViewById(this.p);
        if (z2) {
            String str = this.q;
            if (str != null) {
                a(str, findViewById);
            }
            if (this.h != a) {
                ((ek) view.getParent()).a(this.h, findViewById);
            }
        }
        if (z3) {
            String str2 = this.r;
            if (str2 != null) {
                a(str2, findViewById);
            }
            if (this.i != a) {
                ((ek) view.getParent()).a(this.i, findViewById);
            }
        }
        if (z) {
            String str3 = this.o;
            if (str3 != null) {
                a(str3, findViewById);
            }
            if (this.j != a) {
                ((ek) view.getParent()).a(this.j, findViewById);
            }
        }
    }

    private void a(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            b(str, view);
            return;
        }
        if (this.m.containsKey(str)) {
            method = this.m.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.m.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.m.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + du.a(view));
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.o + "\"on class " + view.getClass().getSimpleName() + " " + du.a(view));
        }
    }

    private void b(String str, View view) {
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.a aVar = this.f.get(str2);
                if (aVar != null) {
                    aVar.a(view);
                }
            }
        }
    }

    /* compiled from: KeyTrigger.java */
    /* renamed from: ee$a */
    /* loaded from: classes3.dex */
    private static class a {
        private static SparseIntArray a = new SparseIntArray();

        static {
            a.append(h.b.KeyTrigger_framePosition, 8);
            a.append(h.b.KeyTrigger_onCross, 4);
            a.append(h.b.KeyTrigger_onNegativeCross, 1);
            a.append(h.b.KeyTrigger_onPositiveCross, 2);
            a.append(h.b.KeyTrigger_motionTarget, 7);
            a.append(h.b.KeyTrigger_triggerId, 6);
            a.append(h.b.KeyTrigger_triggerSlack, 5);
            a.append(h.b.KeyTrigger_motion_triggerOnCollision, 9);
            a.append(h.b.KeyTrigger_motion_postLayoutCollision, 10);
            a.append(h.b.KeyTrigger_triggerReceiver, 11);
            a.append(h.b.KeyTrigger_viewTransitionOnCross, 12);
            a.append(h.b.KeyTrigger_viewTransitionOnNegativeCross, 13);
            a.append(h.b.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        public static void a(ee eeVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        eeVar.q = typedArray.getString(index);
                        break;
                    case 2:
                        eeVar.r = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                        break;
                    case 4:
                        eeVar.o = typedArray.getString(index);
                        break;
                    case 5:
                        eeVar.g = typedArray.getFloat(index, eeVar.g);
                        break;
                    case 6:
                        eeVar.s = typedArray.getResourceId(index, eeVar.s);
                        break;
                    case 7:
                        if (ek.a) {
                            eeVar.c = typedArray.getResourceId(index, eeVar.c);
                            if (eeVar.c == -1) {
                                eeVar.d = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            eeVar.d = typedArray.getString(index);
                            break;
                        } else {
                            eeVar.c = typedArray.getResourceId(index, eeVar.c);
                            break;
                        }
                    case 8:
                        eeVar.b = typedArray.getInteger(index, eeVar.b);
                        eeVar.y = (eeVar.b + 0.5f) / 100.0f;
                        break;
                    case 9:
                        eeVar.t = typedArray.getResourceId(index, eeVar.t);
                        break;
                    case 10:
                        eeVar.A = typedArray.getBoolean(index, eeVar.A);
                        break;
                    case 11:
                        eeVar.p = typedArray.getResourceId(index, eeVar.p);
                        break;
                    case 12:
                        eeVar.j = typedArray.getResourceId(index, eeVar.j);
                        break;
                    case 13:
                        eeVar.h = typedArray.getResourceId(index, eeVar.h);
                        break;
                    case 14:
                        eeVar.i = typedArray.getResourceId(index, eeVar.i);
                        break;
                }
            }
        }
    }

    @Override // defpackage.dx
    public dx a(dx dxVar) {
        super.a(dxVar);
        ee eeVar = (ee) dxVar;
        this.n = eeVar.n;
        this.o = eeVar.o;
        this.p = eeVar.p;
        this.q = eeVar.q;
        this.r = eeVar.r;
        this.s = eeVar.s;
        this.t = eeVar.t;
        this.u = eeVar.u;
        this.g = eeVar.g;
        this.v = eeVar.v;
        this.w = eeVar.w;
        this.x = eeVar.x;
        this.y = eeVar.y;
        this.z = eeVar.z;
        this.A = eeVar.A;
        this.k = eeVar.k;
        this.l = eeVar.l;
        this.m = eeVar.m;
        return this;
    }

    @Override // defpackage.dx
    /* renamed from: a */
    public dx clone() {
        return new ee().a((dx) this);
    }
}
