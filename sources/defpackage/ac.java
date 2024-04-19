package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import com.alibaba.fastjson.asm.Opcodes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawableContainer.java */
/* renamed from: ac  reason: default package */
/* loaded from: classes2.dex */
public class ac extends Drawable implements Drawable.Callback {
    private c a;
    private Rect b;
    private Drawable c;
    private Drawable d;
    private boolean f;
    private boolean h;
    private Runnable i;
    private long j;
    private long k;
    private b l;
    private int e = 255;
    private int g = -1;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    private boolean a() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.i(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect f = this.a.f();
        if (f != null) {
            rect.set(f);
            padding = (f.right | ((f.left | f.top) | f.bottom)) != 0;
        } else {
            Drawable drawable = this.c;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (a()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            a.a(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f && this.e == i) {
            return;
        }
        this.f = true;
        this.e = i;
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.j == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        if (this.a.z != z) {
            c cVar = this.a;
            cVar.z = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(cVar.z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.a;
        cVar.G = true;
        if (cVar.F != colorFilter) {
            this.a.F = colorFilter;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.a;
        cVar.f137J = true;
        if (cVar.H != colorStateList) {
            this.a.H = colorStateList;
            androidx.core.graphics.drawable.a.a(this.c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.a;
        cVar.K = true;
        if (cVar.I != mode) {
            this.a.I = mode;
            androidx.core.graphics.drawable.a.a(this.c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.a.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.a.E != z) {
            c cVar = this.a;
            cVar.E = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.a(drawable, cVar.E);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.a.E;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if (this.k != 0) {
            this.k = 0L;
            z = true;
        }
        if (this.j != 0) {
            this.j = 0L;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.a.d(i, d());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.a.g()) {
            return this.a.h();
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.a.g()) {
            return this.a.i();
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.a.g()) {
            return this.a.j();
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.a.g()) {
            return this.a.k();
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.a;
        if (cVar != null) {
            cVar.b();
        }
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.a.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i) {
        if (i == this.g) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.a.D > 0) {
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.c;
            if (drawable2 != null) {
                this.d = drawable2;
                this.k = this.a.D + uptimeMillis;
            } else {
                this.d = null;
                this.k = 0L;
            }
        } else {
            Drawable drawable3 = this.c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0 && i < this.a.j) {
            Drawable b2 = this.a.b(i);
            this.c = b2;
            this.g = i;
            if (b2 != null) {
                if (this.a.C > 0) {
                    this.j = uptimeMillis + this.a.C;
                }
                a(b2);
            }
        } else {
            this.c = null;
            this.g = -1;
        }
        if (this.j != 0 || this.k != 0) {
            Runnable runnable = this.i;
            if (runnable == null) {
                this.i = new Runnable() { // from class: ac.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ac.this.a(true);
                        ac.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(runnable);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    private void a(Drawable drawable) {
        if (this.l == null) {
            this.l = new b();
        }
        drawable.setCallback(this.l.a(drawable.getCallback()));
        try {
            if (this.a.C <= 0 && this.f) {
                drawable.setAlpha(this.e);
            }
            if (this.a.G) {
                drawable.setColorFilter(this.a.F);
            } else {
                if (this.a.f137J) {
                    androidx.core.graphics.drawable.a.a(drawable, this.a.H);
                }
                if (this.a.K) {
                    androidx.core.graphics.drawable.a.a(drawable, this.a.I);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.b(drawable, androidx.core.graphics.drawable.a.i(this));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                androidx.core.graphics.drawable.a.a(drawable, this.a.E);
            }
            Rect rect = this.b;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                androidx.core.graphics.drawable.a.a(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.l.a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.j
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.e
            r3.setAlpha(r9)
            r13.j = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r3 = (int) r9
            ac$c r9 = r13.a
            int r9 = r9.C
            int r3 = r3 / r9
            android.graphics.drawable.Drawable r9 = r13.c
            int r3 = 255 - r3
            int r10 = r13.e
            int r3 = r3 * r10
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r3 = r0
            goto L3b
        L38:
            r13.j = r7
        L3a:
            r3 = r6
        L3b:
            android.graphics.drawable.Drawable r9 = r13.d
            if (r9 == 0) goto L65
            long r10 = r13.k
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.d = r0
            r13.k = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            ac$c r4 = r13.a
            int r4 = r4.D
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r13.d
            int r5 = r13.e
            int r3 = r3 * r5
            int r3 = r3 / 255
            r4.setAlpha(r3)
            goto L68
        L65:
            r13.k = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Resources resources) {
        this.a.a(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.a.a(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a.o()) {
            this.a.f = getChangingConfigurations();
            return this.a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            c c2 = c();
            c2.a();
            a(c2);
            this.h = true;
        }
        return this;
    }

    c c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearMutated() {
        this.a.e();
        this.h = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableContainer.java */
    /* renamed from: ac$c */
    /* loaded from: classes2.dex */
    public static abstract class c extends Drawable.ConstantState {
        boolean A;
        int B;
        int C;
        int D;
        boolean E;
        ColorFilter F;
        boolean G;
        ColorStateList H;
        PorterDuff.Mode I;

        /* renamed from: J  reason: collision with root package name */
        boolean f137J;
        boolean K;
        final ac c;
        Resources d;
        int e;
        int f;
        int g;
        SparseArray<Drawable.ConstantState> h;
        Drawable[] i;
        int j;
        boolean k;
        boolean l;
        Rect m;
        boolean n;
        boolean o;
        int p;
        int q;
        int r;
        int s;
        boolean t;
        int u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        boolean z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(c cVar, ac acVar, Resources resources) {
            Resources resources2;
            this.k = false;
            this.n = false;
            this.z = true;
            this.C = 0;
            this.D = 0;
            this.c = acVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = cVar != null ? cVar.d : null;
            }
            this.d = resources2;
            this.e = ac.a(resources, cVar != null ? cVar.e : 0);
            if (cVar != null) {
                this.f = cVar.f;
                this.g = cVar.g;
                this.x = true;
                this.y = true;
                this.k = cVar.k;
                this.n = cVar.n;
                this.z = cVar.z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                this.H = cVar.H;
                this.I = cVar.I;
                this.f137J = cVar.f137J;
                this.K = cVar.K;
                if (cVar.e == this.e) {
                    if (cVar.l) {
                        Rect rect = cVar.m;
                        this.m = rect != null ? new Rect(rect) : null;
                        this.l = true;
                    }
                    if (cVar.o) {
                        this.p = cVar.p;
                        this.q = cVar.q;
                        this.r = cVar.r;
                        this.s = cVar.s;
                        this.o = true;
                    }
                }
                if (cVar.t) {
                    this.u = cVar.u;
                    this.t = true;
                }
                if (cVar.v) {
                    this.w = cVar.w;
                    this.v = true;
                }
                Drawable[] drawableArr = cVar.i;
                this.i = new Drawable[drawableArr.length];
                this.j = cVar.j;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.h;
                if (sparseArray != null) {
                    this.h = sparseArray.clone();
                } else {
                    this.h = new SparseArray<>(this.j);
                }
                int i = this.j;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.h.put(i2, constantState);
                        } else {
                            this.i[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.i = new Drawable[10];
            this.j = 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f | this.g;
        }

        public final int a(Drawable drawable) {
            int i = this.j;
            if (i >= this.i.length) {
                e(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.c);
            this.i[i] = drawable;
            this.j++;
            this.g = drawable.getChangingConfigurations() | this.g;
            b();
            this.m = null;
            this.l = false;
            this.o = false;
            this.x = false;
            return i;
        }

        void b() {
            this.t = false;
            this.v = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int c() {
            return this.i.length;
        }

        private void p() {
            SparseArray<Drawable.ConstantState> sparseArray = this.h;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.i[this.h.keyAt(i)] = b(this.h.valueAt(i).newDrawable(this.d));
                }
                this.h = null;
            }
        }

        private Drawable b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.b(drawable, this.B);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.c);
            return mutate;
        }

        public final int d() {
            return this.j;
        }

        public final Drawable b(int i) {
            int indexOfKey;
            Drawable drawable = this.i[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.h;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable b = b(this.h.valueAt(indexOfKey).newDrawable(this.d));
            this.i[i] = b;
            this.h.removeAt(indexOfKey);
            if (this.h.size() == 0) {
                this.h = null;
            }
            return b;
        }

        final boolean d(int i, int i2) {
            int i3 = this.j;
            Drawable[] drawableArr = this.i;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean b = Build.VERSION.SDK_INT >= 23 ? androidx.core.graphics.drawable.a.b(drawableArr[i4], i) : false;
                    if (i4 == i2) {
                        z = b;
                    }
                }
            }
            this.B = i;
            return z;
        }

        final void a(Resources resources) {
            if (resources != null) {
                this.d = resources;
                int a = ac.a(resources, this.e);
                int i = this.e;
                this.e = a;
                if (i != a) {
                    this.o = false;
                    this.l = false;
                }
            }
        }

        final void a(Resources.Theme theme) {
            if (theme != null) {
                p();
                int i = this.j;
                Drawable[] drawableArr = this.i;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && androidx.core.graphics.drawable.a.d(drawableArr[i2])) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i2], theme);
                        this.g |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                a(a.a(theme));
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.j;
            Drawable[] drawableArr = this.i;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    if (androidx.core.graphics.drawable.a.d(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.h.get(i2);
                    if (constantState != null && a.a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        void a() {
            int i = this.j;
            Drawable[] drawableArr = this.i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.A = true;
        }

        final void e() {
            this.A = false;
        }

        public final void a(boolean z) {
            this.k = z;
        }

        public final Rect f() {
            if (this.k) {
                return null;
            }
            if (this.m != null || this.l) {
                return this.m;
            }
            p();
            Rect rect = new Rect();
            int i = this.j;
            Drawable[] drawableArr = this.i;
            Rect rect2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    if (rect.left > rect2.left) {
                        rect2.left = rect.left;
                    }
                    if (rect.top > rect2.top) {
                        rect2.top = rect.top;
                    }
                    if (rect.right > rect2.right) {
                        rect2.right = rect.right;
                    }
                    if (rect.bottom > rect2.bottom) {
                        rect2.bottom = rect.bottom;
                    }
                }
            }
            this.l = true;
            this.m = rect2;
            return rect2;
        }

        public final void b(boolean z) {
            this.n = z;
        }

        public final boolean g() {
            return this.n;
        }

        public final int h() {
            if (!this.o) {
                l();
            }
            return this.p;
        }

        public final int i() {
            if (!this.o) {
                l();
            }
            return this.q;
        }

        public final int j() {
            if (!this.o) {
                l();
            }
            return this.r;
        }

        public final int k() {
            if (!this.o) {
                l();
            }
            return this.s;
        }

        protected void l() {
            this.o = true;
            p();
            int i = this.j;
            Drawable[] drawableArr = this.i;
            this.q = -1;
            this.p = -1;
            this.s = 0;
            this.r = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.p) {
                    this.p = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.q) {
                    this.q = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.r) {
                    this.r = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.s) {
                    this.s = minimumHeight;
                }
            }
        }

        public final void c(int i) {
            this.C = i;
        }

        public final void d(int i) {
            this.D = i;
        }

        public final int m() {
            if (this.t) {
                return this.u;
            }
            p();
            int i = this.j;
            Drawable[] drawableArr = this.i;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.u = opacity;
            this.t = true;
            return opacity;
        }

        public final boolean n() {
            if (this.v) {
                return this.w;
            }
            p();
            int i = this.j;
            Drawable[] drawableArr = this.i;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.w = z;
            this.v = true;
            return z;
        }

        public void e(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.i;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.i = drawableArr;
        }

        public boolean o() {
            if (this.x) {
                return this.y;
            }
            p();
            this.x = true;
            int i = this.j;
            Drawable[] drawableArr = this.i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.y = false;
                    return false;
                }
            }
            this.y = true;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar) {
        this.a = cVar;
        int i = this.g;
        if (i >= 0) {
            this.c = cVar.b(i);
            Drawable drawable = this.c;
            if (drawable != null) {
                a(drawable);
            }
        }
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableContainer.java */
    /* renamed from: ac$b */
    /* loaded from: classes2.dex */
    public static class b implements Drawable.Callback {
        private Drawable.Callback a;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        b() {
        }

        public b a(Drawable.Callback callback) {
            this.a = callback;
            return this;
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.a;
            this.a = null;
            return callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static int a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        return i == 0 ? Opcodes.IF_ICMPNE : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DrawableContainer.java */
    /* renamed from: ac$a */
    /* loaded from: classes2.dex */
    public static class a {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static Resources a(Resources.Theme theme) {
            return theme.getResources();
        }

        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }
}
