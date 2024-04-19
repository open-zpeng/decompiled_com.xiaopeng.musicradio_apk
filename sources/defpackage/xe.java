package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.b;
/* compiled from: RippleDrawableCompat.java */
/* renamed from: xe  reason: default package */
/* loaded from: classes3.dex */
public class xe extends Drawable implements b, xx {
    private a a;

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public xe(xu xuVar) {
        this(new a(new xp(xuVar)));
    }

    private xe(a aVar) {
        this.a = aVar;
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        this.a.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.a.a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.a.a.setTintList(colorStateList);
    }

    @Override // defpackage.xx
    public void setShapeAppearanceModel(xu xuVar) {
        this.a.a.setShapeAppearanceModel(xuVar);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.a.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean a2 = xf.a(iArr);
        if (this.a.b != a2) {
            this.a.b = a2;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.a.b) {
            this.a.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a */
    public xe mutate() {
        this.a = new a(this.a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.a.getOpacity();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleDrawableCompat.java */
    /* renamed from: xe$a */
    /* loaded from: classes3.dex */
    public static final class a extends Drawable.ConstantState {
        xp a;
        boolean b;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public a(xp xpVar) {
            this.a = xpVar;
            this.b = false;
        }

        public a(a aVar) {
            this.a = (xp) aVar.a.getConstantState().newDrawable();
            this.b = aVar.b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public xe newDrawable() {
            return new xe(new a(this));
        }
    }
}
