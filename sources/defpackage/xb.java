package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import defpackage.fb;
import defpackage.vu;
/* compiled from: TextAppearance.java */
/* renamed from: xb  reason: default package */
/* loaded from: classes3.dex */
public class xb {
    public final ColorStateList a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final String e;
    public final int f;
    public final int g;
    public final boolean h;
    public final float i;
    public final float j;
    public final float k;
    public final boolean l;
    public final float m;
    public float n;
    private final int o;
    private boolean p = false;
    private Typeface q;

    public xb(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, vu.l.TextAppearance);
        this.n = obtainStyledAttributes.getDimension(vu.l.TextAppearance_android_textSize, 0.0f);
        this.a = xa.a(context, obtainStyledAttributes, vu.l.TextAppearance_android_textColor);
        this.b = xa.a(context, obtainStyledAttributes, vu.l.TextAppearance_android_textColorHint);
        this.c = xa.a(context, obtainStyledAttributes, vu.l.TextAppearance_android_textColorLink);
        this.f = obtainStyledAttributes.getInt(vu.l.TextAppearance_android_textStyle, 0);
        this.g = obtainStyledAttributes.getInt(vu.l.TextAppearance_android_typeface, 1);
        int a = xa.a(obtainStyledAttributes, vu.l.TextAppearance_fontFamily, vu.l.TextAppearance_android_fontFamily);
        this.o = obtainStyledAttributes.getResourceId(a, 0);
        this.e = obtainStyledAttributes.getString(a);
        this.h = obtainStyledAttributes.getBoolean(vu.l.TextAppearance_textAllCaps, false);
        this.d = xa.a(context, obtainStyledAttributes, vu.l.TextAppearance_android_shadowColor);
        this.i = obtainStyledAttributes.getFloat(vu.l.TextAppearance_android_shadowDx, 0.0f);
        this.j = obtainStyledAttributes.getFloat(vu.l.TextAppearance_android_shadowDy, 0.0f);
        this.k = obtainStyledAttributes.getFloat(vu.l.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, vu.l.MaterialTextAppearance);
            this.l = obtainStyledAttributes2.hasValue(vu.l.MaterialTextAppearance_android_letterSpacing);
            this.m = obtainStyledAttributes2.getFloat(vu.l.MaterialTextAppearance_android_letterSpacing, 0.0f);
            obtainStyledAttributes2.recycle();
            return;
        }
        this.l = false;
        this.m = 0.0f;
    }

    public Typeface a(Context context) {
        if (this.p) {
            return this.q;
        }
        if (!context.isRestricted()) {
            try {
                this.q = fb.a(context, this.o);
                if (this.q != null) {
                    this.q = Typeface.create(this.q, this.f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.e, e);
            }
        }
        b();
        this.p = true;
        return this.q;
    }

    public void a(Context context, final xd xdVar) {
        if (b(context)) {
            a(context);
        } else {
            b();
        }
        if (this.o == 0) {
            this.p = true;
        }
        if (this.p) {
            xdVar.a(this.q, true);
            return;
        }
        try {
            fb.a(context, this.o, new fb.a() { // from class: xb.1
                @Override // defpackage.fb.a
                public void a(Typeface typeface) {
                    xb xbVar = xb.this;
                    xbVar.q = Typeface.create(typeface, xbVar.f);
                    xb.this.p = true;
                    xdVar.a(xb.this.q, false);
                }

                @Override // defpackage.fb.a
                public void a(int i) {
                    xb.this.p = true;
                    xdVar.a(i);
                }
            }, null);
        } catch (Resources.NotFoundException unused) {
            this.p = true;
            xdVar.a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.e, e);
            this.p = true;
            xdVar.a(-3);
        }
    }

    public void a(Context context, final TextPaint textPaint, final xd xdVar) {
        a(textPaint, a());
        a(context, new xd() { // from class: xb.2
            @Override // defpackage.xd
            public void a(Typeface typeface, boolean z) {
                xb.this.a(textPaint, typeface);
                xdVar.a(typeface, z);
            }

            @Override // defpackage.xd
            public void a(int i) {
                xdVar.a(i);
            }
        });
    }

    public Typeface a() {
        b();
        return this.q;
    }

    private void b() {
        String str;
        if (this.q == null && (str = this.e) != null) {
            this.q = Typeface.create(str, this.f);
        }
        if (this.q == null) {
            switch (this.g) {
                case 1:
                    this.q = Typeface.SANS_SERIF;
                    break;
                case 2:
                    this.q = Typeface.SERIF;
                    break;
                case 3:
                    this.q = Typeface.MONOSPACE;
                    break;
                default:
                    this.q = Typeface.DEFAULT;
                    break;
            }
            this.q = Typeface.create(this.q, this.f);
        }
    }

    public void b(Context context, TextPaint textPaint, xd xdVar) {
        c(context, textPaint, xdVar);
        ColorStateList colorStateList = this.a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.a.getDefaultColor()) : -16777216);
        float f = this.k;
        float f2 = this.i;
        float f3 = this.j;
        ColorStateList colorStateList2 = this.d;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, this.d.getDefaultColor()) : 0);
    }

    public void c(Context context, TextPaint textPaint, xd xdVar) {
        if (b(context)) {
            a(textPaint, a(context));
        } else {
            a(context, textPaint, xdVar);
        }
    }

    public void a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.n);
        if (Build.VERSION.SDK_INT < 21 || !this.l) {
            return;
        }
        textPaint.setLetterSpacing(this.m);
    }

    private boolean b(Context context) {
        return xc.a();
    }
}
