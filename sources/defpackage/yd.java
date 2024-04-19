package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.fastjson.asm.Opcodes;
import com.google.android.material.internal.l;
import com.google.android.material.internal.n;
import defpackage.vu;
/* compiled from: TooltipDrawable.java */
/* renamed from: yd  reason: default package */
/* loaded from: classes3.dex */
public class yd extends xp implements l.a {
    private static final int a = vu.k.Widget_MaterialComponents_Tooltip;
    private static final int b = vu.b.tooltipStyle;
    private CharSequence c;
    private final Context d;
    private final Paint.FontMetrics e;
    private final l f;
    private final View.OnLayoutChangeListener g;
    private final Rect h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private float o;
    private float p;
    private final float q;
    private float r;
    private float s;

    public static yd a(Context context, AttributeSet attributeSet, int i, int i2) {
        yd ydVar = new yd(context, attributeSet, i, i2);
        ydVar.a(attributeSet, i, i2);
        return ydVar;
    }

    private yd(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = new Paint.FontMetrics();
        this.f = new l(this);
        this.g = new View.OnLayoutChangeListener() { // from class: yd.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                yd.this.c(view);
            }
        };
        this.h = new Rect();
        this.o = 1.0f;
        this.p = 1.0f;
        this.q = 0.5f;
        this.r = 0.5f;
        this.s = 1.0f;
        this.d = context;
        this.f.a().density = context.getResources().getDisplayMetrics().density;
        this.f.a().setTextAlign(Paint.Align.CENTER);
    }

    private void a(AttributeSet attributeSet, int i, int i2) {
        TypedArray a2 = n.a(this.d, attributeSet, vu.l.Tooltip, i, i2, new int[0]);
        this.m = this.d.getResources().getDimensionPixelSize(vu.d.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(M().n().a(b()).a());
        a(a2.getText(vu.l.Tooltip_android_text));
        a(xa.c(this.d, a2, vu.l.Tooltip_android_textAppearance));
        g(ColorStateList.valueOf(a2.getColor(vu.l.Tooltip_backgroundTint, wp.a(fd.b(wp.a(this.d, 16842801, yd.class.getCanonicalName()), 229), fd.b(wp.a(this.d, vu.b.colorOnBackground, yd.class.getCanonicalName()), Opcodes.IFEQ)))));
        h(ColorStateList.valueOf(wp.a(this.d, vu.b.colorSurface, yd.class.getCanonicalName())));
        this.i = a2.getDimensionPixelSize(vu.l.Tooltip_android_padding, 0);
        this.j = a2.getDimensionPixelSize(vu.l.Tooltip_android_minWidth, 0);
        this.k = a2.getDimensionPixelSize(vu.l.Tooltip_android_minHeight, 0);
        this.l = a2.getDimensionPixelSize(vu.l.Tooltip_android_layout_margin, 0);
        a2.recycle();
    }

    public void a(CharSequence charSequence) {
        if (TextUtils.equals(this.c, charSequence)) {
            return;
        }
        this.c = charSequence;
        this.f.a(true);
        invalidateSelf();
    }

    public void a(xb xbVar) {
        this.f.a(xbVar, this.d);
    }

    public void a(float f) {
        this.r = 1.2f;
        this.o = f;
        this.p = f;
        this.s = vv.a(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    public void a(View view) {
        if (view == null) {
            return;
        }
        c(view);
        view.addOnLayoutChangeListener(this.g);
    }

    public void b(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.g);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.i * 2) + c(), this.j);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f.a().getTextSize(), this.k);
    }

    @Override // defpackage.xp, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.scale(this.o, this.p, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.r));
        canvas.translate(a(), (float) (-((this.m * Math.sqrt(2.0d)) - this.m)));
        super.draw(canvas);
        a(canvas);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xp, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(M().n().a(b()).a());
    }

    @Override // defpackage.xp, android.graphics.drawable.Drawable, com.google.android.material.internal.l.a
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.l.a
    public void f() {
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.n = iArr[0];
        view.getWindowVisibleDisplayFrame(this.h);
    }

    private float a() {
        if (((this.h.right - getBounds().right) - this.n) - this.l < 0) {
            return ((this.h.right - getBounds().right) - this.n) - this.l;
        }
        if (((this.h.left - getBounds().left) - this.n) + this.l > 0) {
            return ((this.h.left - getBounds().left) - this.n) + this.l;
        }
        return 0.0f;
    }

    private xn b() {
        float width = ((float) (getBounds().width() - (this.m * Math.sqrt(2.0d)))) / 2.0f;
        return new xr(new xo(this.m), Math.min(Math.max(-a(), -width), width));
    }

    private void a(Canvas canvas) {
        if (this.c == null) {
            return;
        }
        Rect bounds = getBounds();
        int a2 = (int) a(bounds);
        if (this.f.b() != null) {
            this.f.a().drawableState = getState();
            this.f.a(this.d);
            this.f.a().setAlpha((int) (this.s * 255.0f));
        }
        CharSequence charSequence = this.c;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), a2, this.f.a());
    }

    private float c() {
        CharSequence charSequence = this.c;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f.a(charSequence.toString());
    }

    private float a(Rect rect) {
        return rect.centerY() - d();
    }

    private float d() {
        this.f.a().getFontMetrics(this.e);
        return (this.e.descent + this.e.ascent) / 2.0f;
    }
}
