package defpackage;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import defpackage.vu;
/* compiled from: MaterialCardView.java */
/* renamed from: wh  reason: default package */
/* loaded from: classes3.dex */
public class wh extends ax implements Checkable, xx {
    private static final int[] a = {16842911};
    private static final int[] b = {16842912};
    private static final int[] c = {vu.b.state_dragged};
    private static final int d = vu.k.Widget_MaterialComponents_CardView;
    private final wi e;
    private boolean f;
    private boolean g;
    private boolean h;
    private a i;

    /* compiled from: MaterialCardView.java */
    /* renamed from: wh$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a(wh whVar, boolean z);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(e_());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // defpackage.ax, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.e.a(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setStrokeColor(int i) {
        this.e.a(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.e.a(colorStateList);
    }

    @Deprecated
    public int getStrokeColor() {
        return this.e.b();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.e.c();
    }

    public void setStrokeWidth(int i) {
        this.e.a(i);
    }

    public int getStrokeWidth() {
        return this.e.d();
    }

    @Override // defpackage.ax
    public void setRadius(float f) {
        super.setRadius(f);
        this.e.a(f);
    }

    @Override // defpackage.ax
    public float getRadius() {
        return this.e.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public void setProgress(float f) {
        this.e.b(f);
    }

    public float getProgress() {
        return this.e.k();
    }

    @Override // defpackage.ax
    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.e.a(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    @Override // defpackage.ax
    public int getContentPaddingLeft() {
        return this.e.h().left;
    }

    @Override // defpackage.ax
    public int getContentPaddingTop() {
        return this.e.h().top;
    }

    @Override // defpackage.ax
    public int getContentPaddingRight() {
        return this.e.h().right;
    }

    @Override // defpackage.ax
    public int getContentPaddingBottom() {
        return this.e.h().bottom;
    }

    @Override // defpackage.ax
    public void setCardBackgroundColor(int i) {
        this.e.b(ColorStateList.valueOf(i));
    }

    @Override // defpackage.ax
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.e.b(colorStateList);
    }

    @Override // defpackage.ax
    public ColorStateList getCardBackgroundColor() {
        return this.e.f();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.e.c(colorStateList);
    }

    public ColorStateList getCardForegroundColor() {
        return this.e.g();
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        wi wiVar = this.e;
        if (wiVar != null) {
            wiVar.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        xq.a(this, this.e.e());
    }

    @Override // defpackage.ax
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.e.l();
    }

    @Override // defpackage.ax
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.e.m();
    }

    @Override // defpackage.ax
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.e.m();
        this.e.o();
    }

    @Override // defpackage.ax
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.e.m();
        this.e.o();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f) {
            if (!this.e.a()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.e.a(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.g;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.g != z) {
            toggle();
        }
    }

    public void setDragged(boolean z) {
        if (this.h != z) {
            this.h = z;
            refreshDrawableState();
            c();
            invalidate();
        }
    }

    public boolean d_() {
        return this.h;
    }

    public boolean e_() {
        wi wiVar = this.e;
        return wiVar != null && wiVar.p();
    }

    public void setCheckable(boolean z) {
        this.e.b(z);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (e_() && isEnabled()) {
            this.g = !this.g;
            refreshDrawableState();
            c();
            a aVar = this.i;
            if (aVar != null) {
                aVar.a(this, this.g);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (e_()) {
            mergeDrawableStates(onCreateDrawableState, a);
        }
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, b);
        }
        if (d_()) {
            mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.i = aVar;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.e.d(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.e.d(aa.a(getContext(), i));
    }

    public ColorStateList getRippleColor() {
        return this.e.r();
    }

    public Drawable getCheckedIcon() {
        return this.e.s();
    }

    public void setCheckedIconResource(int i) {
        this.e.a(aa.b(getContext(), i));
    }

    public void setCheckedIcon(Drawable drawable) {
        this.e.a(drawable);
    }

    public ColorStateList getCheckedIconTint() {
        return this.e.q();
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.e.e(colorStateList);
    }

    public int getCheckedIconSize() {
        return this.e.t();
    }

    public void setCheckedIconSize(int i) {
        this.e.b(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.e.b(getResources().getDimensionPixelSize(i));
        }
    }

    public int getCheckedIconMargin() {
        return this.e.u();
    }

    public void setCheckedIconMargin(int i) {
        this.e.c(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.e.c(getResources().getDimensionPixelSize(i));
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.e.e().getBounds());
        return rectF;
    }

    @Override // defpackage.xx
    public void setShapeAppearanceModel(xu xuVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(xuVar.a(getBoundsAsRectF()));
        }
        this.e.a(xuVar);
    }

    public xu getShapeAppearanceModel() {
        return this.e.w();
    }

    private void c() {
        if (Build.VERSION.SDK_INT > 26) {
            this.e.v();
        }
    }
}
