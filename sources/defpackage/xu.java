package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import defpackage.vu;
/* compiled from: ShapeAppearanceModel.java */
/* renamed from: xu  reason: default package */
/* loaded from: classes3.dex */
public class xu {
    public static final xk a = new xs(0.5f);
    xl b;
    xl c;
    xl d;
    xl e;
    xk f;
    xk g;
    xk h;
    xk i;
    xn j;
    xn k;
    xn l;
    xn m;

    /* compiled from: ShapeAppearanceModel.java */
    /* renamed from: xu$b */
    /* loaded from: classes3.dex */
    public interface b {
        xk a(xk xkVar);
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* renamed from: xu$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private xl a;
        private xl b;
        private xl c;
        private xl d;
        private xk e;
        private xk f;
        private xk g;
        private xk h;
        private xn i;
        private xn j;
        private xn k;
        private xn l;

        public a() {
            this.a = xq.a();
            this.b = xq.a();
            this.c = xq.a();
            this.d = xq.a();
            this.e = new xi(0.0f);
            this.f = new xi(0.0f);
            this.g = new xi(0.0f);
            this.h = new xi(0.0f);
            this.i = xq.b();
            this.j = xq.b();
            this.k = xq.b();
            this.l = xq.b();
        }

        public a(xu xuVar) {
            this.a = xq.a();
            this.b = xq.a();
            this.c = xq.a();
            this.d = xq.a();
            this.e = new xi(0.0f);
            this.f = new xi(0.0f);
            this.g = new xi(0.0f);
            this.h = new xi(0.0f);
            this.i = xq.b();
            this.j = xq.b();
            this.k = xq.b();
            this.l = xq.b();
            this.a = xuVar.b;
            this.b = xuVar.c;
            this.c = xuVar.d;
            this.d = xuVar.e;
            this.e = xuVar.f;
            this.f = xuVar.g;
            this.g = xuVar.h;
            this.h = xuVar.i;
            this.i = xuVar.j;
            this.j = xuVar.k;
            this.k = xuVar.l;
            this.l = xuVar.m;
        }

        public a a(int i, float f) {
            return a(xq.a(i)).a(f);
        }

        public a a(xl xlVar) {
            return b(xlVar).c(xlVar).d(xlVar).e(xlVar);
        }

        public a a(xk xkVar) {
            return b(xkVar).c(xkVar).d(xkVar).e(xkVar);
        }

        public a a(float f) {
            return b(f).c(f).d(f).e(f);
        }

        public a b(float f) {
            this.e = new xi(f);
            return this;
        }

        public a b(xk xkVar) {
            this.e = xkVar;
            return this;
        }

        public a c(float f) {
            this.f = new xi(f);
            return this;
        }

        public a c(xk xkVar) {
            this.f = xkVar;
            return this;
        }

        public a d(float f) {
            this.g = new xi(f);
            return this;
        }

        public a d(xk xkVar) {
            this.g = xkVar;
            return this;
        }

        public a e(float f) {
            this.h = new xi(f);
            return this;
        }

        public a e(xk xkVar) {
            this.h = xkVar;
            return this;
        }

        public a a(int i, xk xkVar) {
            return b(xq.a(i)).b(xkVar);
        }

        public a b(xl xlVar) {
            this.a = xlVar;
            float f = f(xlVar);
            if (f != -1.0f) {
                b(f);
            }
            return this;
        }

        public a b(int i, xk xkVar) {
            return c(xq.a(i)).c(xkVar);
        }

        public a c(xl xlVar) {
            this.b = xlVar;
            float f = f(xlVar);
            if (f != -1.0f) {
                c(f);
            }
            return this;
        }

        public a c(int i, xk xkVar) {
            return d(xq.a(i)).d(xkVar);
        }

        public a d(xl xlVar) {
            this.c = xlVar;
            float f = f(xlVar);
            if (f != -1.0f) {
                d(f);
            }
            return this;
        }

        public a d(int i, xk xkVar) {
            return e(xq.a(i)).e(xkVar);
        }

        public a e(xl xlVar) {
            this.d = xlVar;
            float f = f(xlVar);
            if (f != -1.0f) {
                e(f);
            }
            return this;
        }

        public a a(xn xnVar) {
            this.k = xnVar;
            return this;
        }

        private static float f(xl xlVar) {
            if (xlVar instanceof xt) {
                return ((xt) xlVar).a;
            }
            if (xlVar instanceof xm) {
                return ((xm) xlVar).a;
            }
            return -1.0f;
        }

        public xu a() {
            return new xu(this);
        }
    }

    public static a a() {
        return new a();
    }

    public static a a(Context context, AttributeSet attributeSet, int i, int i2) {
        return a(context, attributeSet, i, i2, 0);
    }

    public static a a(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return a(context, attributeSet, i, i2, new xi(i3));
    }

    public static a a(Context context, AttributeSet attributeSet, int i, int i2, xk xkVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vu.l.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(vu.l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(vu.l.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, xkVar);
    }

    public static a a(Context context, int i, int i2) {
        return a(context, i, i2, 0);
    }

    private static a a(Context context, int i, int i2, int i3) {
        return a(context, i, i2, new xi(i3));
    }

    private static a a(Context context, int i, int i2, xk xkVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, vu.l.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(vu.l.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(vu.l.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(vu.l.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(vu.l.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(vu.l.ShapeAppearance_cornerFamilyBottomLeft, i3);
            xk a2 = a(obtainStyledAttributes, vu.l.ShapeAppearance_cornerSize, xkVar);
            xk a3 = a(obtainStyledAttributes, vu.l.ShapeAppearance_cornerSizeTopLeft, a2);
            xk a4 = a(obtainStyledAttributes, vu.l.ShapeAppearance_cornerSizeTopRight, a2);
            xk a5 = a(obtainStyledAttributes, vu.l.ShapeAppearance_cornerSizeBottomRight, a2);
            return new a().a(i4, a3).b(i5, a4).c(i6, a5).d(i7, a(obtainStyledAttributes, vu.l.ShapeAppearance_cornerSizeBottomLeft, a2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static xk a(TypedArray typedArray, int i, xk xkVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return xkVar;
        }
        if (peekValue.type == 5) {
            return new xi(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return peekValue.type == 6 ? new xs(peekValue.getFraction(1.0f, 1.0f)) : xkVar;
    }

    private xu(a aVar) {
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
        this.f = aVar.e;
        this.g = aVar.f;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
    }

    public xu() {
        this.b = xq.a();
        this.c = xq.a();
        this.d = xq.a();
        this.e = xq.a();
        this.f = new xi(0.0f);
        this.g = new xi(0.0f);
        this.h = new xi(0.0f);
        this.i = new xi(0.0f);
        this.j = xq.b();
        this.k = xq.b();
        this.l = xq.b();
        this.m = xq.b();
    }

    public xl b() {
        return this.b;
    }

    public xl c() {
        return this.c;
    }

    public xl d() {
        return this.d;
    }

    public xl e() {
        return this.e;
    }

    public xk f() {
        return this.f;
    }

    public xk g() {
        return this.g;
    }

    public xk h() {
        return this.h;
    }

    public xk i() {
        return this.i;
    }

    public xn j() {
        return this.m;
    }

    public xn k() {
        return this.j;
    }

    public xn l() {
        return this.k;
    }

    public xn m() {
        return this.l;
    }

    public a n() {
        return new a(this);
    }

    public xu a(float f) {
        return n().a(f).a();
    }

    public xu a(xk xkVar) {
        return n().a(xkVar).a();
    }

    public xu a(b bVar) {
        return n().b(bVar.a(f())).c(bVar.a(g())).e(bVar.a(i())).d(bVar.a(h())).a();
    }

    public boolean a(RectF rectF) {
        boolean z = this.m.getClass().equals(xn.class) && this.k.getClass().equals(xn.class) && this.j.getClass().equals(xn.class) && this.l.getClass().equals(xn.class);
        float a2 = this.f.a(rectF);
        return z && ((this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0 && (this.i.a(rectF) > a2 ? 1 : (this.i.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.c instanceof xt) && (this.b instanceof xt) && (this.d instanceof xt) && (this.e instanceof xt));
    }
}
