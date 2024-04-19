package com.nex3z.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.nex3z.flowlayout.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class FlowLayout extends ViewGroup {
    private static final String a = "FlowLayout";
    private boolean b;
    private int c;
    private int d;
    private int e;
    private float f;
    private float g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private List<Float> m;
    private List<Integer> n;
    private List<Integer> o;
    private List<Integer> p;

    public FlowLayout(Context context) {
        this(context, null);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        this.c = 0;
        this.d = 0;
        this.e = -65538;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = false;
        this.i = Integer.MAX_VALUE;
        this.j = -1;
        this.k = -65536;
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.C0106a.FlowLayout, 0, 0);
        try {
            this.b = obtainStyledAttributes.getBoolean(a.C0106a.FlowLayout_flFlow, true);
            try {
                this.c = obtainStyledAttributes.getInt(a.C0106a.FlowLayout_flChildSpacing, 0);
            } catch (NumberFormatException unused) {
                this.c = obtainStyledAttributes.getDimensionPixelSize(a.C0106a.FlowLayout_flChildSpacing, (int) a(0.0f));
            }
            try {
                this.d = obtainStyledAttributes.getInt(a.C0106a.FlowLayout_flMinChildSpacing, 0);
            } catch (NumberFormatException unused2) {
                this.d = obtainStyledAttributes.getDimensionPixelSize(a.C0106a.FlowLayout_flMinChildSpacing, (int) a(0.0f));
            }
            try {
                this.e = obtainStyledAttributes.getInt(a.C0106a.FlowLayout_flChildSpacingForLastRow, -65538);
            } catch (NumberFormatException unused3) {
                this.e = obtainStyledAttributes.getDimensionPixelSize(a.C0106a.FlowLayout_flChildSpacingForLastRow, (int) a(0.0f));
            }
            try {
                this.f = obtainStyledAttributes.getInt(a.C0106a.FlowLayout_flRowSpacing, 0);
            } catch (NumberFormatException unused4) {
                this.f = obtainStyledAttributes.getDimension(a.C0106a.FlowLayout_flRowSpacing, a(0.0f));
            }
            this.i = obtainStyledAttributes.getInt(a.C0106a.FlowLayout_flMaxRows, Integer.MAX_VALUE);
            this.h = obtainStyledAttributes.getBoolean(a.C0106a.FlowLayout_flRtl, false);
            this.j = obtainStyledAttributes.getInt(a.C0106a.FlowLayout_android_gravity, -1);
            this.k = obtainStyledAttributes.getInt(a.C0106a.FlowLayout_flRowVerticalGravity, -65536);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int min;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View view;
        int i15;
        int i16;
        int measuredWidth;
        int i17;
        int i18;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m.clear();
        this.n.clear();
        this.o.clear();
        this.p.clear();
        int childCount = getChildCount();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        boolean z = mode != 0 && this.b;
        int i19 = -65536;
        int i20 = (this.c == -65536 && mode == 0) ? 0 : this.c;
        float f2 = i20 == -65536 ? this.d : i20;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (i23 < childCount) {
            float f3 = f2;
            View childAt = getChildAt(i23);
            int i28 = i21;
            if (childAt.getVisibility() == 8) {
                i5 = i23;
                i17 = i20;
                i7 = mode;
                i8 = mode2;
                i9 = childCount;
                f = f3;
                i11 = -65536;
                measuredWidth = i22;
                i12 = size;
                i18 = i28;
                i13 = size2;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    i9 = childCount;
                    i10 = i28;
                    i13 = size2;
                    i14 = i22;
                    i5 = i23;
                    i8 = mode2;
                    f = f3;
                    i12 = size;
                    view = childAt;
                    i6 = i20;
                    i7 = mode;
                    i11 = -65536;
                    measureChildWithMargins(childAt, i, 0, i2, i26);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    i16 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    i5 = i23;
                    i6 = i20;
                    i7 = mode;
                    i8 = mode2;
                    i9 = childCount;
                    f = f3;
                    i10 = i28;
                    i11 = -65536;
                    i12 = size;
                    i13 = size2;
                    i14 = i22;
                    view = childAt;
                    measureChild(view, i, i2);
                    i15 = 0;
                    i16 = 0;
                }
                measuredWidth = view.getMeasuredWidth() + i15;
                int measuredHeight = view.getMeasuredHeight() + i16;
                if (z && i25 + measuredWidth > paddingLeft) {
                    i17 = i6;
                    this.m.add(Float.valueOf(b(i17, paddingLeft, i14, i10)));
                    this.p.add(Integer.valueOf(i10));
                    this.n.add(Integer.valueOf(i27));
                    int i29 = (int) f;
                    this.o.add(Integer.valueOf(i25 - i29));
                    if (this.m.size() <= this.i) {
                        i26 += i27;
                    }
                    i27 = measuredHeight;
                    i24 = Math.max(i24, i25);
                    i25 = i29 + measuredWidth;
                    i18 = 1;
                } else {
                    i17 = i6;
                    i18 = i10 + 1;
                    measuredWidth += i14;
                    i27 = Math.max(i27, measuredHeight);
                    i25 = (int) (i25 + measuredWidth + f);
                }
            }
            i23 = i5 + 1;
            i22 = measuredWidth;
            i20 = i17;
            i21 = i18;
            i19 = i11;
            f2 = f;
            size = i12;
            size2 = i13;
            mode = i7;
            childCount = i9;
            mode2 = i8;
        }
        int i30 = i21;
        int i31 = size;
        int i32 = mode;
        int i33 = size2;
        int i34 = mode2;
        int i35 = i22;
        float f4 = f2;
        int i36 = i19;
        int i37 = i27;
        int i38 = i20;
        int i39 = this.e;
        if (i39 == -65537) {
            if (this.m.size() >= 1) {
                List<Float> list = this.m;
                list.add(list.get(list.size() - 1));
            } else {
                this.m.add(Float.valueOf(b(i38, paddingLeft, i35, i30)));
            }
        } else if (i39 != -65538) {
            this.m.add(Float.valueOf(b(i39, paddingLeft, i35, i30)));
        } else {
            this.m.add(Float.valueOf(b(i38, paddingLeft, i35, i30)));
        }
        this.p.add(Integer.valueOf(i30));
        this.n.add(Integer.valueOf(i37));
        this.o.add(Integer.valueOf(i25 - ((int) f4)));
        if (this.m.size() <= this.i) {
            i26 += i37;
        }
        int max = Math.max(i24, i25);
        if (i38 == i36) {
            i3 = i31;
            min = i3;
        } else if (i32 == 0) {
            min = max + getPaddingLeft() + getPaddingRight();
            i3 = i31;
        } else {
            i3 = i31;
            min = Math.min(max + getPaddingLeft() + getPaddingRight(), i3);
        }
        int paddingTop = i26 + getPaddingTop() + getPaddingBottom();
        int min2 = Math.min(this.m.size(), this.i);
        float f5 = (this.f == -65536.0f && i34 == 0) ? 0.0f : this.f;
        if (f5 == -65536.0f) {
            if (min2 > 1) {
                this.g = (i33 - paddingTop) / (min2 - 1);
            } else {
                this.g = 0.0f;
            }
            i4 = i33;
            paddingTop = i4;
        } else {
            this.g = f5;
            if (min2 <= 1) {
                i4 = i33;
            } else if (i34 == 0) {
                paddingTop = (int) (paddingTop + (this.g * (min2 - 1)));
                i4 = i33;
            } else {
                i4 = i33;
                paddingTop = Math.min((int) (paddingTop + (this.g * (min2 - 1))), i4);
            }
        }
        this.l = paddingTop;
        if (i32 == 1073741824) {
            min = i3;
        }
        if (i34 != 1073741824) {
            i4 = paddingTop;
        }
        setMeasuredDimension(min, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = this.h ? getWidth() - paddingRight : paddingLeft;
        int i15 = this.j;
        int i16 = i15 & 112;
        int i17 = i15 & 7;
        if (i16 == 16) {
            paddingTop += ((((i4 - i2) - paddingTop) - paddingBottom) - this.l) / 2;
        } else if (i16 == 80) {
            paddingTop += (((i4 - i2) - paddingTop) - paddingBottom) - this.l;
        }
        int i18 = paddingLeft + paddingRight;
        int i19 = i3 - i;
        int a2 = width + a(i17, i19, i18, 0);
        int i20 = this.k & 112;
        int size = this.p.size();
        int i21 = paddingTop;
        int i22 = 0;
        int i23 = 0;
        while (i22 < size) {
            int intValue = this.p.get(i22).intValue();
            int intValue2 = this.n.get(i22).intValue();
            float floatValue = this.m.get(i22).floatValue();
            int i24 = a2;
            int i25 = 0;
            while (i25 < intValue && i23 < getChildCount()) {
                int i26 = i23 + 1;
                View childAt = getChildAt(i23);
                int i27 = paddingLeft;
                if (childAt.getVisibility() == 8) {
                    i23 = i26;
                    paddingLeft = i27;
                } else {
                    int i28 = i25 + 1;
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i10 = marginLayoutParams.leftMargin;
                        i5 = i28;
                        int i29 = marginLayoutParams.rightMargin;
                        i9 = marginLayoutParams.topMargin;
                        i8 = marginLayoutParams.bottomMargin;
                        i7 = intValue;
                        int i30 = size;
                        i11 = i29;
                        i6 = i30;
                    } else {
                        i5 = i28;
                        i6 = size;
                        i7 = intValue;
                        i8 = 0;
                        i9 = 0;
                        i10 = 0;
                        i11 = 0;
                    }
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i31 = i21 + i9;
                    int i32 = i18;
                    if (i20 == 80) {
                        i12 = ((i21 + intValue2) - i8) - measuredHeight;
                    } else {
                        i12 = i20 == 16 ? i31 + ((((intValue2 - i9) - i8) - measuredHeight) / 2) : i31;
                    }
                    int i33 = i12 + measuredHeight;
                    if (this.h) {
                        int i34 = i24;
                        i14 = i20;
                        int i35 = i34 - i11;
                        i13 = intValue2;
                        childAt.layout(i35 - measuredWidth, i12, i35, i33);
                        f = i34 - (((measuredWidth + floatValue) + i10) + i11);
                    } else {
                        i13 = intValue2;
                        int i36 = i24;
                        i14 = i20;
                        int i37 = i36 + i10;
                        childAt.layout(i37, i12, i37 + measuredWidth, i33);
                        f = i36 + measuredWidth + floatValue + i10 + i11;
                    }
                    i23 = i26;
                    i25 = i5;
                    size = i6;
                    intValue = i7;
                    i20 = i14;
                    intValue2 = i13;
                    i18 = i32;
                    i24 = (int) f;
                    paddingLeft = i27;
                }
            }
            int i38 = paddingLeft;
            int i39 = intValue2;
            int i40 = i20;
            int i41 = size;
            i22++;
            i18 = i18;
            a2 = a(i17, i19, i18, i22) + (this.h ? getWidth() - paddingRight : i38);
            i21 = (int) (i21 + i39 + this.g);
            size = i41;
            i20 = i40;
            paddingLeft = i38;
        }
    }

    private int a(int i, int i2, int i3, int i4) {
        if (this.c == -65536 || i4 >= this.o.size() || i4 >= this.p.size() || this.p.get(i4).intValue() <= 0) {
            return 0;
        }
        if (i != 1) {
            if (i != 5) {
                return 0;
            }
            return (i2 - i3) - this.o.get(i4).intValue();
        }
        return ((i2 - i3) - this.o.get(i4).intValue()) / 2;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void setFlow(boolean z) {
        this.b = z;
        requestLayout();
    }

    public int getChildSpacing() {
        return this.c;
    }

    public void setChildSpacing(int i) {
        this.c = i;
        requestLayout();
    }

    public int getChildSpacingForLastRow() {
        return this.e;
    }

    public void setChildSpacingForLastRow(int i) {
        this.e = i;
        requestLayout();
    }

    public float getRowSpacing() {
        return this.f;
    }

    public void setRowSpacing(float f) {
        this.f = f;
        requestLayout();
    }

    public int getMaxRows() {
        return this.i;
    }

    public void setMaxRows(int i) {
        this.i = i;
        requestLayout();
    }

    public void setGravity(int i) {
        if (this.j != i) {
            this.j = i;
            requestLayout();
        }
    }

    public void setRowVerticalGravity(int i) {
        if (this.k != i) {
            this.k = i;
            requestLayout();
        }
    }

    public void setRtl(boolean z) {
        this.h = z;
        requestLayout();
    }

    public int getMinChildSpacing() {
        return this.d;
    }

    public void setMinChildSpacing(int i) {
        this.d = i;
        requestLayout();
    }

    public int getRowsCount() {
        return this.p.size();
    }

    private float b(int i, int i2, int i3, int i4) {
        if (i == -65536) {
            if (i4 > 1) {
                return (i2 - i3) / (i4 - 1);
            }
            return 0.0f;
        }
        return i;
    }

    private float a(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }
}
