package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.a;
import defpackage.vu;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialCardViewHelper.java */
/* renamed from: wi  reason: default package */
/* loaded from: classes3.dex */
public class wi {
    private static final int[] a = {16842912};
    private static final double b = Math.cos(Math.toRadians(45.0d));
    private final wh c;
    private final Rect d;
    private final xp e;
    private final xp f;
    private int g;
    private int h;
    private int i;
    private Drawable j;
    private Drawable k;
    private ColorStateList l;
    private ColorStateList m;
    private xu n;
    private ColorStateList o;
    private Drawable p;
    private LayerDrawable q;
    private xp r;
    private xp s;
    private boolean t;
    private boolean u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.t = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.o == colorStateList) {
            return;
        }
        this.o = colorStateList;
        n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        ColorStateList colorStateList = this.o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public xp e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        this.e.g(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.e.N();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(ColorStateList colorStateList) {
        xp xpVar = this.f;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        xpVar.g(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList g() {
        return this.f.N();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, int i4) {
        this.d.set(i, i2, i3, i4);
        o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rect h() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.j;
        this.j = this.c.isClickable() ? E() : this.f;
        Drawable drawable2 = this.j;
        if (drawable != drawable2) {
            b(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f) {
        a(this.n.a(f));
        this.j.invalidateSelf();
        if (C() || B()) {
            o();
        }
        if (C()) {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.e.ac();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(float f) {
        this.e.p(f);
        xp xpVar = this.f;
        if (xpVar != null) {
            xpVar.p(f);
        }
        xp xpVar2 = this.s;
        if (xpVar2 != null) {
            xpVar2.p(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        return this.e.T();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        this.e.r(this.c.getCardElevation());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        if (!a()) {
            this.c.setBackgroundInternal(c(this.e));
        }
        this.c.setForeground(c(this.j));
    }

    void n() {
        this.f.a(this.i, this.o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        int D = (int) ((B() || C() ? D() : 0.0f) - A());
        this.c.a(this.d.left + D, this.d.top + D, this.d.right + D, this.d.bottom + D);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        this.u = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ColorStateList colorStateList) {
        this.l = colorStateList;
        H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(ColorStateList colorStateList) {
        this.m = colorStateList;
        Drawable drawable = this.k;
        if (drawable != null) {
            a.a(drawable, colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList q() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList r() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable s() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Drawable drawable) {
        this.k = drawable;
        if (drawable != null) {
            this.k = a.g(drawable.mutate());
            a.a(this.k, this.m);
        }
        if (this.q != null) {
            this.q.setDrawableByLayerId(vu.f.mtrl_card_checked_layer_id, I());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int t() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i) {
        this.g = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.q != null) {
            int i6 = this.g;
            int i7 = this.h;
            int i8 = (i - i6) - i7;
            int i9 = (i2 - i6) - i7;
            if ((Build.VERSION.SDK_INT < 21) || this.c.getUseCompatPadding()) {
                int ceil = i9 - ((int) Math.ceil(x() * 2.0f));
                i8 -= (int) Math.ceil(y() * 2.0f);
                i3 = ceil;
            } else {
                i3 = i9;
            }
            int i10 = this.g;
            if (hq.h(this.c) == 1) {
                i5 = i8;
                i4 = i10;
            } else {
                i4 = i8;
                i5 = i10;
            }
            this.q.setLayerInset(2, i4, this.g, i5, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        Drawable drawable = this.p;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.p.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(xu xuVar) {
        this.n = xuVar;
        this.e.setShapeAppearanceModel(xuVar);
        xp xpVar = this.e;
        xpVar.g(!xpVar.ag());
        xp xpVar2 = this.f;
        if (xpVar2 != null) {
            xpVar2.setShapeAppearanceModel(xuVar);
        }
        xp xpVar3 = this.s;
        if (xpVar3 != null) {
            xpVar3.setShapeAppearanceModel(xuVar);
        }
        xp xpVar4 = this.r;
        if (xpVar4 != null) {
            xpVar4.setShapeAppearanceModel(xuVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public xu w() {
        return this.n;
    }

    private void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && (this.c.getForeground() instanceof InsetDrawable)) {
            ((InsetDrawable) this.c.getForeground()).setDrawable(drawable);
        } else {
            this.c.setForeground(c(drawable));
        }
    }

    private Drawable c(Drawable drawable) {
        int ceil;
        int i;
        if ((Build.VERSION.SDK_INT < 21) || this.c.getUseCompatPadding()) {
            int ceil2 = (int) Math.ceil(x());
            ceil = (int) Math.ceil(y());
            i = ceil2;
        } else {
            ceil = 0;
            i = 0;
        }
        return new InsetDrawable(drawable, ceil, i, ceil, i) { // from class: wi.1
            @Override // android.graphics.drawable.Drawable
            public int getMinimumHeight() {
                return -1;
            }

            @Override // android.graphics.drawable.Drawable
            public int getMinimumWidth() {
                return -1;
            }

            @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public boolean getPadding(Rect rect) {
                return false;
            }
        };
    }

    private float x() {
        return (this.c.getMaxCardElevation() * 1.5f) + (C() ? D() : 0.0f);
    }

    private float y() {
        return this.c.getMaxCardElevation() + (C() ? D() : 0.0f);
    }

    private boolean z() {
        return Build.VERSION.SDK_INT >= 21 && this.e.ag();
    }

    private float A() {
        if (this.c.getPreventCornerOverlap()) {
            if (Build.VERSION.SDK_INT < 21 || this.c.getUseCompatPadding()) {
                return (float) ((1.0d - b) * this.c.getCardViewRadius());
            }
            return 0.0f;
        }
        return 0.0f;
    }

    private boolean B() {
        return this.c.getPreventCornerOverlap() && !z();
    }

    private boolean C() {
        return this.c.getPreventCornerOverlap() && z() && this.c.getUseCompatPadding();
    }

    private float D() {
        return Math.max(Math.max(a(this.n.b(), this.e.ac()), a(this.n.c(), this.e.ad())), Math.max(a(this.n.d(), this.e.af()), a(this.n.e(), this.e.ae())));
    }

    private float a(xl xlVar, float f) {
        if (xlVar instanceof xt) {
            return (float) ((1.0d - b) * f);
        }
        if (xlVar instanceof xm) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    private Drawable E() {
        if (this.p == null) {
            this.p = F();
        }
        if (this.q == null) {
            this.q = new LayerDrawable(new Drawable[]{this.p, this.f, I()});
            this.q.setId(2, vu.f.mtrl_card_checked_layer_id);
        }
        return this.q;
    }

    private Drawable F() {
        if (xf.a) {
            this.s = J();
            return new RippleDrawable(this.l, null, this.s);
        }
        return G();
    }

    private Drawable G() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.r = J();
        this.r.g(this.l);
        stateListDrawable.addState(new int[]{16842919}, this.r);
        return stateListDrawable;
    }

    private void H() {
        Drawable drawable;
        if (xf.a && (drawable = this.p) != null) {
            ((RippleDrawable) drawable).setColor(this.l);
            return;
        }
        xp xpVar = this.r;
        if (xpVar != null) {
            xpVar.g(this.l);
        }
    }

    private Drawable I() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.k;
        if (drawable != null) {
            stateListDrawable.addState(a, drawable);
        }
        return stateListDrawable;
    }

    private xp J() {
        return new xp(this.n);
    }
}
