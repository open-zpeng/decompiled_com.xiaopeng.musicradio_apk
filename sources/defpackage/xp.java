package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.b;
import defpackage.vu;
import defpackage.xu;
import defpackage.xv;
import defpackage.xw;
import java.util.BitSet;
/* compiled from: MaterialShapeDrawable.java */
/* renamed from: xp  reason: default package */
/* loaded from: classes3.dex */
public class xp extends Drawable implements b, xx {
    private static final String a = "xp";
    private static final Paint b = new Paint(1);
    private a c;
    private final xw.f[] d;
    private final xw.f[] e;
    private final BitSet f;
    private boolean g;
    private final Matrix h;
    private final Path i;
    private final Path j;
    private final RectF k;
    private final RectF l;
    private final Region m;
    private final Region n;
    private xu o;
    private final Paint p;
    private final Paint q;
    private final xg r;
    private final xv.b s;
    private final xv t;
    private PorterDuffColorFilter u;
    private PorterDuffColorFilter v;
    private final RectF w;
    private boolean x;

    private static int a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public static xp a(Context context, float f) {
        int a2 = wp.a(context, vu.b.colorSurface, xp.class.getSimpleName());
        xp xpVar = new xp();
        xpVar.a(context);
        xpVar.g(ColorStateList.valueOf(a2));
        xpVar.r(f);
        return xpVar;
    }

    public xp() {
        this(new xu());
    }

    public xp(Context context, AttributeSet attributeSet, int i, int i2) {
        this(xu.a(context, attributeSet, i, i2).a());
    }

    public xp(xu xuVar) {
        this(new a(xuVar, null));
    }

    private xp(a aVar) {
        this.d = new xw.f[4];
        this.e = new xw.f[4];
        this.f = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        this.p = new Paint(1);
        this.q = new Paint(1);
        this.r = new xg();
        this.t = Looper.getMainLooper().getThread() == Thread.currentThread() ? xv.a() : new xv();
        this.w = new RectF();
        this.x = true;
        this.c = aVar;
        this.q.setStyle(Paint.Style.STROKE);
        this.p.setStyle(Paint.Style.FILL);
        b.setColor(-1);
        b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        g();
        a(getState());
        this.s = new xv.b() { // from class: xp.1
            @Override // defpackage.xv.b
            public void a(xw xwVar, Matrix matrix, int i) {
                xp.this.f.set(i, xwVar.a());
                xp.this.d[i] = xwVar.a(matrix);
            }

            @Override // defpackage.xv.b
            public void b(xw xwVar, Matrix matrix, int i) {
                xp.this.f.set(i + 4, xwVar.a());
                xp.this.e[i] = xwVar.a(matrix);
            }
        };
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.c = new a(this.c);
        return this;
    }

    @Override // defpackage.xx
    public void setShapeAppearanceModel(xu xuVar) {
        this.c.a = xuVar;
        invalidateSelf();
    }

    public xu M() {
        return this.c.a;
    }

    public void g(ColorStateList colorStateList) {
        if (this.c.d != colorStateList) {
            this.c.d = colorStateList;
            onStateChange(getState());
        }
    }

    public ColorStateList N() {
        return this.c.d;
    }

    public void h(ColorStateList colorStateList) {
        if (this.c.e != colorStateList) {
            this.c.e = colorStateList;
            onStateChange(getState());
        }
    }

    public ColorStateList O() {
        return this.c.e;
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.c.h != mode) {
            this.c.h = mode;
            g();
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.c.g = colorStateList;
        g();
        b();
    }

    public ColorStateList P() {
        return this.c.g;
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void a(float f, int i) {
        n(f);
        h(ColorStateList.valueOf(i));
    }

    public void a(float f, ColorStateList colorStateList) {
        n(f);
        h(colorStateList);
    }

    public float Q() {
        return this.c.l;
    }

    public void n(float f) {
        this.c.l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.c.m != i) {
            this.c.m = i;
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.c.c = colorFilter;
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.m.set(getBounds());
        b(R(), this.i);
        this.n.setPath(this.i, this.m);
        this.m.op(this.n, Region.Op.DIFFERENCE);
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RectF R() {
        this.k.set(getBounds());
        return this.k;
    }

    public void o(float f) {
        setShapeAppearanceModel(this.c.a.a(f));
    }

    public void a(xk xkVar) {
        setShapeAppearanceModel(this.c.a.a(xkVar));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.c.i != null) {
            rect.set(this.c.i);
            return true;
        }
        return super.getPadding(rect);
    }

    public void a(int i, int i2, int i3, int i4) {
        if (this.c.i == null) {
            this.c.i = new Rect();
        }
        this.c.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public boolean S() {
        return this.c.b != null && this.c.b.a();
    }

    public void a(Context context) {
        this.c.b = new ws(context);
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int D(int i) {
        return this.c.b != null ? this.c.b.a(i, X() + U()) : i;
    }

    public float T() {
        return this.c.k;
    }

    public void p(float f) {
        if (this.c.k != f) {
            this.c.k = f;
            this.g = true;
            invalidateSelf();
        }
    }

    public float U() {
        return this.c.n;
    }

    public void q(float f) {
        if (this.c.n != f) {
            this.c.n = f;
            a();
        }
    }

    public float V() {
        return this.c.o;
    }

    public void r(float f) {
        if (this.c.o != f) {
            this.c.o = f;
            a();
        }
    }

    public float W() {
        return this.c.p;
    }

    public float X() {
        return V() + W();
    }

    private void a() {
        float X = X();
        this.c.r = (int) Math.ceil(0.75f * X);
        this.c.s = (int) Math.ceil(X * 0.25f);
        g();
        b();
    }

    public void g(boolean z) {
        this.x = z;
    }

    public void E(int i) {
        if (this.c.t != i) {
            this.c.t = i;
            b();
        }
    }

    public int Y() {
        return this.c.r;
    }

    public boolean Z() {
        return Build.VERSION.SDK_INT < 21 || !(ag() || this.i.isConvex() || Build.VERSION.SDK_INT >= 29);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.g = true;
        super.invalidateSelf();
    }

    private void b() {
        super.invalidateSelf();
    }

    private boolean c() {
        return this.c.q != 1 && this.c.r > 0 && (this.c.q == 2 || Z());
    }

    private boolean d() {
        return this.c.v == Paint.Style.FILL_AND_STROKE || this.c.v == Paint.Style.FILL;
    }

    private boolean e() {
        return (this.c.v == Paint.Style.FILL_AND_STROKE || this.c.v == Paint.Style.STROKE) && this.q.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.g = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.p.setColorFilter(this.u);
        int alpha = this.p.getAlpha();
        this.p.setAlpha(a(alpha, this.c.m));
        this.q.setColorFilter(this.v);
        this.q.setStrokeWidth(this.c.l);
        int alpha2 = this.q.getAlpha();
        this.q.setAlpha(a(alpha2, this.c.m));
        if (this.g) {
            f();
            b(R(), this.i);
            this.g = false;
        }
        a(canvas);
        if (d()) {
            b(canvas);
        }
        if (e()) {
            c(canvas);
        }
        this.p.setAlpha(alpha);
        this.q.setAlpha(alpha2);
    }

    private void a(Canvas canvas) {
        if (c()) {
            canvas.save();
            d(canvas);
            if (!this.x) {
                e(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.w.width() - getBounds().width());
            int height = (int) (this.w.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.w.width()) + (this.c.r * 2) + width, ((int) this.w.height()) + (this.c.r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.c.r) - width;
            float f2 = (getBounds().top - this.c.r) - height;
            canvas2.translate(-f, -f2);
            e(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Canvas canvas, Paint paint, Path path, RectF rectF) {
        a(canvas, paint, path, this.c.a, rectF);
    }

    private void a(Canvas canvas, Paint paint, Path path, xu xuVar, RectF rectF) {
        if (xuVar.a(rectF)) {
            float a2 = xuVar.g().a(rectF) * this.c.k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void b(Canvas canvas) {
        a(canvas, this.p, this.i, this.c.a, R());
    }

    private void c(Canvas canvas) {
        a(canvas, this.q, this.j, this.o, i());
    }

    private void d(Canvas canvas) {
        int aa = aa();
        int ab = ab();
        if (Build.VERSION.SDK_INT < 21 && this.x) {
            Rect clipBounds = canvas.getClipBounds();
            clipBounds.inset(-this.c.r, -this.c.r);
            clipBounds.offset(aa, ab);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(aa, ab);
    }

    private void e(Canvas canvas) {
        if (this.f.cardinality() > 0) {
            Log.w(a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.c.s != 0) {
            canvas.drawPath(this.i, this.r.a());
        }
        for (int i = 0; i < 4; i++) {
            this.d[i].a(this.r, this.c.r, canvas);
            this.e[i].a(this.r, this.c.r, canvas);
        }
        if (this.x) {
            int aa = aa();
            int ab = ab();
            canvas.translate(-aa, -ab);
            canvas.drawPath(this.i, b);
            canvas.translate(aa, ab);
        }
    }

    public int aa() {
        return (int) (this.c.s * Math.sin(Math.toRadians(this.c.t)));
    }

    public int ab() {
        return (int) (this.c.s * Math.cos(Math.toRadians(this.c.t)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(RectF rectF, Path path) {
        this.t.a(this.c.a, this.c.k, rectF, this.s, path);
    }

    private void f() {
        final float f = -h();
        this.o = M().a(new xu.b() { // from class: xp.2
            @Override // defpackage.xu.b
            public xk a(xk xkVar) {
                return xkVar instanceof xs ? xkVar : new xj(f, xkVar);
            }
        });
        this.t.a(this.o, this.c.k, i(), this.j);
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.c.q == 2) {
            return;
        }
        if (ag()) {
            outline.setRoundRect(getBounds(), ac() * this.c.k);
            return;
        }
        b(R(), this.i);
        if (this.i.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.i);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private void b(RectF rectF, Path path) {
        a(rectF, path);
        if (this.c.j != 1.0f) {
            this.h.reset();
            this.h.setScale(this.c.j, this.c.j, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.h);
        }
        path.computeBounds(this.w, true);
    }

    private boolean g() {
        PorterDuffColorFilter porterDuffColorFilter = this.u;
        PorterDuffColorFilter porterDuffColorFilter2 = this.v;
        this.u = a(this.c.g, this.c.h, this.p, true);
        this.v = a(this.c.f, this.c.h, this.q, false);
        if (this.c.u) {
            this.r.a(this.c.g.getColorForState(getState(), 0));
        }
        return (gm.a(porterDuffColorFilter, this.u) && gm.a(porterDuffColorFilter2, this.v)) ? false : true;
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return a(paint, z);
        }
        return a(colorStateList, mode, z);
    }

    private PorterDuffColorFilter a(Paint paint, boolean z) {
        int color;
        int D;
        if (!z || (D = D((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(D, PorterDuff.Mode.SRC_IN);
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = D(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return super.isStateful() || (this.c.g != null && this.c.g.isStateful()) || ((this.c.f != null && this.c.f.isStateful()) || ((this.c.e != null && this.c.e.isStateful()) || (this.c.d != null && this.c.d.isStateful())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.l.a
    public boolean onStateChange(int[] iArr) {
        boolean z = a(iArr) || g();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    private boolean a(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.c.d == null || color2 == (colorForState2 = this.c.d.getColorForState(iArr, (color2 = this.p.getColor())))) {
            z = false;
        } else {
            this.p.setColor(colorForState2);
            z = true;
        }
        if (this.c.e == null || color == (colorForState = this.c.e.getColorForState(iArr, (color = this.q.getColor())))) {
            return z;
        }
        this.q.setColor(colorForState);
        return true;
    }

    private float h() {
        if (e()) {
            return this.q.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private RectF i() {
        this.l.set(R());
        float h = h();
        this.l.inset(h, h);
        return this.l;
    }

    public float ac() {
        return this.c.a.f().a(R());
    }

    public float ad() {
        return this.c.a.g().a(R());
    }

    public float ae() {
        return this.c.a.i().a(R());
    }

    public float af() {
        return this.c.a.h().a(R());
    }

    public boolean ag() {
        return this.c.a.a(R());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: xp$a */
    /* loaded from: classes3.dex */
    public static final class a extends Drawable.ConstantState {
        public xu a;
        public ws b;
        public ColorFilter c;
        public ColorStateList d;
        public ColorStateList e;
        public ColorStateList f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public a(xu xuVar, ws wsVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = xuVar;
            this.b = wsVar;
        }

        public a(a aVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = aVar.a;
            this.b = aVar.b;
            this.l = aVar.l;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.h = aVar.h;
            this.g = aVar.g;
            this.m = aVar.m;
            this.j = aVar.j;
            this.s = aVar.s;
            this.q = aVar.q;
            this.u = aVar.u;
            this.k = aVar.k;
            this.n = aVar.n;
            this.o = aVar.o;
            this.p = aVar.p;
            this.r = aVar.r;
            this.t = aVar.t;
            this.f = aVar.f;
            this.v = aVar.v;
            Rect rect = aVar.i;
            if (rect != null) {
                this.i = new Rect(rect);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            xp xpVar = new xp(this);
            xpVar.g = true;
            return xpVar;
        }
    }
}
