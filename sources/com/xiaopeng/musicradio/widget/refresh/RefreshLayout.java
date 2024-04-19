package com.xiaopeng.musicradio.widget.refresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.aw;
/* loaded from: classes2.dex */
public class RefreshLayout extends TwinklingRefreshLayout implements hf {
    private final hi a;
    private final he b;
    private final int[] c;
    private final int[] d;

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.hf
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return false;
    }

    public RefreshLayout(Context context) {
        this(context, null);
    }

    public RefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new int[2];
        this.d = new int[2];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.RefreshLayout);
        try {
            setHeaderTopMargin(obtainStyledAttributes.getDimensionPixelSize(f.j.RefreshLayout_headerTopMargin, 0));
            obtainStyledAttributes.recycle();
            this.a = new hi(this);
            this.b = (he) aw.b(this, "mChildHelper");
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setHeaderTopMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mHeadLayout.getLayoutParams();
        marginLayoutParams.topMargin = i;
        this.mHeadLayout.setLayoutParams(marginLayoutParams);
    }

    public boolean a() {
        return this.isRefreshing;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.hf
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.a.a(view, view2, i);
        startNestedScroll(i & 2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.hf
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int[] iArr2 = this.c;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.a.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.hf
    public void onStopNestedScroll(View view) {
        this.a.a(view);
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.hf
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.d);
    }

    @Override // com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout, android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        he heVar = this.b;
        if (heVar != null) {
            heVar.a(z);
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout, android.view.View, defpackage.hb
    public boolean isNestedScrollingEnabled() {
        return this.b.a();
    }

    @Override // com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout, android.view.View
    public boolean startNestedScroll(int i) {
        return this.b.b(i);
    }

    @Override // com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout, android.view.View, defpackage.hb
    public void stopNestedScroll() {
        this.b.c();
    }

    @Override // com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout, android.view.View
    public boolean hasNestedScrollingParent() {
        return this.b.b();
    }

    @Override // com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout, android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.b.a(i, i2, i3, i4, iArr);
    }

    @Override // com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout, android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.b.a(i, i2, iArr, iArr2);
    }

    @Override // com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout, android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.b.a(f, f2, z);
    }

    @Override // com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout, android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.b.a(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.hf
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.hf
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }
}
