package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.aw;
/* compiled from: CardView.java */
/* renamed from: ax  reason: default package */
/* loaded from: classes2.dex */
public class ax extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {16842801};
    private static final bc IMPL;
    private final bb mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            IMPL = new az();
        } else if (Build.VERSION.SDK_INT >= 17) {
            IMPL = new ay();
        } else {
            IMPL = new ba();
        }
        IMPL.a();
    }

    public ax(Context context) {
        this(context, null);
    }

    public ax(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aw.a.cardViewStyle);
    }

    public ax(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        this.mContentPadding = new Rect();
        this.mShadowBounds = new Rect();
        this.mCardViewDelegate = new bb() { // from class: ax.1
            private Drawable b;

            @Override // defpackage.bb
            public void a(Drawable drawable) {
                this.b = drawable;
                ax.this.setBackgroundDrawable(drawable);
            }

            @Override // defpackage.bb
            public boolean a() {
                return ax.this.getUseCompatPadding();
            }

            @Override // defpackage.bb
            public boolean b() {
                return ax.this.getPreventCornerOverlap();
            }

            @Override // defpackage.bb
            public void a(int i2, int i3, int i4, int i5) {
                ax.this.mShadowBounds.set(i2, i3, i4, i5);
                ax axVar = ax.this;
                ax.super.setPadding(i2 + axVar.mContentPadding.left, i3 + ax.this.mContentPadding.top, i4 + ax.this.mContentPadding.right, i5 + ax.this.mContentPadding.bottom);
            }

            @Override // defpackage.bb
            public void a(int i2, int i3) {
                if (i2 > ax.this.mUserSetMinWidth) {
                    ax.super.setMinimumWidth(i2);
                }
                if (i3 > ax.this.mUserSetMinHeight) {
                    ax.super.setMinimumHeight(i3);
                }
            }

            @Override // defpackage.bb
            public Drawable c() {
                return this.b;
            }

            @Override // defpackage.bb
            public View d() {
                return ax.this;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aw.e.CardView, i, aw.d.CardView);
        if (obtainStyledAttributes.hasValue(aw.e.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(aw.e.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(aw.b.cardview_light_background);
            } else {
                color = getResources().getColor(aw.b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(aw.e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(aw.e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(aw.e.CardView_cardMaxElevation, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(aw.e.CardView_cardUseCompatPadding, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(aw.e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(aw.e.CardView_contentPadding, 0);
        this.mContentPadding.left = obtainStyledAttributes.getDimensionPixelSize(aw.e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.mContentPadding.top = obtainStyledAttributes.getDimensionPixelSize(aw.e.CardView_contentPaddingTop, dimensionPixelSize);
        this.mContentPadding.right = obtainStyledAttributes.getDimensionPixelSize(aw.e.CardView_contentPaddingRight, dimensionPixelSize);
        this.mContentPadding.bottom = obtainStyledAttributes.getDimensionPixelSize(aw.e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(aw.e.CardView_android_minWidth, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(aw.e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        IMPL.a(this.mCardViewDelegate, context, valueOf, dimension, dimension2, f);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.g(this.mCardViewDelegate);
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.f(this.mCardViewDelegate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!(IMPL instanceof az)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(IMPL.b(this.mCardViewDelegate)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(IMPL.c(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(int i) {
        IMPL.a(this.mCardViewDelegate, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.a(this.mCardViewDelegate, colorStateList);
    }

    public ColorStateList getCardBackgroundColor() {
        return IMPL.i(this.mCardViewDelegate);
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public void setRadius(float f) {
        IMPL.a(this.mCardViewDelegate, f);
    }

    public float getRadius() {
        return IMPL.d(this.mCardViewDelegate);
    }

    public void setCardElevation(float f) {
        IMPL.c(this.mCardViewDelegate, f);
    }

    public float getCardElevation() {
        return IMPL.e(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.b(this.mCardViewDelegate, f);
    }

    public float getMaxCardElevation() {
        return IMPL.a(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.h(this.mCardViewDelegate);
        }
    }
}
