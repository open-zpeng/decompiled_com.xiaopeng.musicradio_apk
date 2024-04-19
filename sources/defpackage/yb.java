package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ay;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.n;
import com.google.android.material.internal.t;
import com.xiaopeng.speech.protocol.node.navi.bean.NaviPreferenceBean;
import defpackage.go;
import defpackage.ib;
import defpackage.vu;
import defpackage.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TabLayout.java */
@ViewPager.a
/* renamed from: yb  reason: default package */
/* loaded from: classes3.dex */
public class yb extends HorizontalScrollView {
    private static final int y = vu.k.Widget_Design_TabLayout;
    private static final go.a<f> z = new go.c(16);
    private final ArrayList<f> A;
    private f B;
    private int C;
    private final int D;
    private final int E;
    private final int F;
    private int G;
    private xz H;
    private b I;

    /* renamed from: J  reason: collision with root package name */
    private final ArrayList<b> f165J;
    private b K;
    private ValueAnimator L;
    private androidx.viewpager.widget.a M;
    private DataSetObserver N;
    private g O;
    private a P;
    private boolean Q;
    private final go.a<h> R;
    final e a;
    int b;
    int c;
    int d;
    int e;
    int f;
    ColorStateList g;
    ColorStateList h;
    ColorStateList i;
    Drawable j;
    PorterDuff.Mode k;
    float l;
    float m;
    final int n;
    int o;
    int p;
    int q;
    int r;
    int s;
    boolean t;
    boolean u;
    int v;
    boolean w;
    ViewPager x;

    /* compiled from: TabLayout.java */
    @Deprecated
    /* renamed from: yb$b */
    /* loaded from: classes3.dex */
    public interface b<T extends f> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    /* compiled from: TabLayout.java */
    /* renamed from: yb$c */
    /* loaded from: classes3.dex */
    public interface c extends b<f> {
    }

    public yb(Context context) {
        this(context, null);
    }

    public yb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vu.b.tabStyle);
    }

    public yb(Context context, AttributeSet attributeSet, int i2) {
        super(yc.a(context, attributeSet, i2, y), attributeSet, i2);
        this.A = new ArrayList<>();
        this.j = new GradientDrawable();
        this.C = 0;
        this.o = Integer.MAX_VALUE;
        this.f165J = new ArrayList<>();
        this.R = new go.b(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        this.a = new e(context2);
        super.addView(this.a, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a2 = n.a(context2, attributeSet, vu.l.TabLayout, i2, y, vu.l.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            xp xpVar = new xp();
            xpVar.g(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            xpVar.a(context2);
            xpVar.r(hq.o(this));
            hq.a(this, xpVar);
        }
        setSelectedTabIndicator(xa.b(context2, a2, vu.l.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(a2.getColor(vu.l.TabLayout_tabIndicatorColor, 0));
        this.a.a(a2.getDimensionPixelSize(vu.l.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(a2.getInt(vu.l.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(a2.getBoolean(vu.l.TabLayout_tabIndicatorFullWidth, true));
        setTabIndicatorAnimationMode(a2.getInt(vu.l.TabLayout_tabIndicatorAnimationMode, 0));
        int dimensionPixelSize = a2.getDimensionPixelSize(vu.l.TabLayout_tabPadding, 0);
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.b = dimensionPixelSize;
        this.b = a2.getDimensionPixelSize(vu.l.TabLayout_tabPaddingStart, this.b);
        this.c = a2.getDimensionPixelSize(vu.l.TabLayout_tabPaddingTop, this.c);
        this.d = a2.getDimensionPixelSize(vu.l.TabLayout_tabPaddingEnd, this.d);
        this.e = a2.getDimensionPixelSize(vu.l.TabLayout_tabPaddingBottom, this.e);
        this.f = a2.getResourceId(vu.l.TabLayout_tabTextAppearance, vu.k.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(this.f, z.j.TextAppearance);
        try {
            this.l = obtainStyledAttributes.getDimensionPixelSize(z.j.TextAppearance_android_textSize, 0);
            this.g = xa.a(context2, obtainStyledAttributes, z.j.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (a2.hasValue(vu.l.TabLayout_tabTextColor)) {
                this.g = xa.a(context2, a2, vu.l.TabLayout_tabTextColor);
            }
            if (a2.hasValue(vu.l.TabLayout_tabSelectedTextColor)) {
                this.g = a(this.g.getDefaultColor(), a2.getColor(vu.l.TabLayout_tabSelectedTextColor, 0));
            }
            this.h = xa.a(context2, a2, vu.l.TabLayout_tabIconTint);
            this.k = t.a(a2.getInt(vu.l.TabLayout_tabIconTintMode, -1), (PorterDuff.Mode) null);
            this.i = xa.a(context2, a2, vu.l.TabLayout_tabRippleColor);
            this.q = a2.getInt(vu.l.TabLayout_tabIndicatorAnimationDuration, NaviPreferenceBean.ATMS_ID);
            this.D = a2.getDimensionPixelSize(vu.l.TabLayout_tabMinWidth, -1);
            this.E = a2.getDimensionPixelSize(vu.l.TabLayout_tabMaxWidth, -1);
            this.n = a2.getResourceId(vu.l.TabLayout_tabBackground, 0);
            this.G = a2.getDimensionPixelSize(vu.l.TabLayout_tabContentStart, 0);
            this.s = a2.getInt(vu.l.TabLayout_tabMode, 1);
            this.p = a2.getInt(vu.l.TabLayout_tabGravity, 0);
            this.t = a2.getBoolean(vu.l.TabLayout_tabInlineLabel, false);
            this.w = a2.getBoolean(vu.l.TabLayout_tabUnboundedRipple, false);
            a2.recycle();
            Resources resources = getResources();
            this.m = resources.getDimensionPixelSize(vu.d.design_tab_text_size_2line);
            this.F = resources.getDimensionPixelSize(vu.d.design_tab_scrollable_min_width);
            i();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.C = i2;
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.a.a(i2);
    }

    public void a(int i2, float f2, boolean z2) {
        a(i2, f2, z2, true);
    }

    public void a(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(i2 + f2);
        if (round < 0 || round >= this.a.getChildCount()) {
            return;
        }
        if (z3) {
            this.a.a(i2, f2);
        }
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.L.cancel();
        }
        scrollTo(a(i2, f2), 0);
        if (z2) {
            setSelectedTabView(round);
        }
    }

    public void a(f fVar) {
        a(fVar, this.A.isEmpty());
    }

    public void a(f fVar, int i2) {
        a(fVar, i2, this.A.isEmpty());
    }

    public void a(f fVar, boolean z2) {
        a(fVar, this.A.size(), z2);
    }

    public void a(f fVar, int i2, boolean z2) {
        if (fVar.a != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        b(fVar, i2);
        e(fVar);
        if (z2) {
            fVar.f();
        }
    }

    private void a(ya yaVar) {
        f a2 = a();
        if (yaVar.a != null) {
            a2.a(yaVar.a);
        }
        if (yaVar.b != null) {
            a2.a(yaVar.b);
        }
        if (yaVar.c != 0) {
            a2.a(yaVar.c);
        }
        if (!TextUtils.isEmpty(yaVar.getContentDescription())) {
            a2.b(yaVar.getContentDescription());
        }
        a(a2);
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        setOnTabSelectedListener((b) cVar);
    }

    @Deprecated
    public void setOnTabSelectedListener(b bVar) {
        b bVar2 = this.I;
        if (bVar2 != null) {
            b(bVar2);
        }
        this.I = bVar;
        if (bVar != null) {
            a(bVar);
        }
    }

    public void a(c cVar) {
        a((b) cVar);
    }

    @Deprecated
    public void a(b bVar) {
        if (this.f165J.contains(bVar)) {
            return;
        }
        this.f165J.add(bVar);
    }

    @Deprecated
    public void b(b bVar) {
        this.f165J.remove(bVar);
    }

    public f a() {
        f b2 = b();
        b2.a = this;
        b2.b = d(b2);
        if (b2.j != -1) {
            b2.b.setId(b2.j);
        }
        return b2;
    }

    protected f b() {
        f acquire = z.acquire();
        return acquire == null ? new f() : acquire;
    }

    protected boolean b(f fVar) {
        return z.release(fVar);
    }

    public int getTabCount() {
        return this.A.size();
    }

    public f a(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.A.get(i2);
    }

    public int getSelectedTabPosition() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.c();
        }
        return -1;
    }

    public void c() {
        for (int childCount = this.a.getChildCount() - 1; childCount >= 0; childCount--) {
            b(childCount);
        }
        Iterator<f> it = this.A.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.i();
            b(next);
        }
        this.B = null;
    }

    public void setTabMode(int i2) {
        if (i2 != this.s) {
            this.s = i2;
            i();
        }
    }

    public int getTabMode() {
        return this.s;
    }

    public void setTabGravity(int i2) {
        if (this.p != i2) {
            this.p = i2;
            i();
        }
    }

    public int getTabGravity() {
        return this.p;
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.r != i2) {
            this.r = i2;
            hq.e(this.a);
        }
    }

    public int getTabIndicatorGravity() {
        return this.r;
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.v = i2;
        switch (i2) {
            case 0:
                this.H = new xz();
                return;
            case 1:
                this.H = new xy();
                return;
            default:
                throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public int getTabIndicatorAnimationMode() {
        return this.v;
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.u = z2;
        hq.e(this.a);
    }

    public boolean d() {
        return this.u;
    }

    public void setInlineLabel(boolean z2) {
        if (this.t != z2) {
            this.t = z2;
            for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
                View childAt = this.a.getChildAt(i2);
                if (childAt instanceof h) {
                    ((h) childAt).c();
                }
            }
            i();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.w != z2) {
            this.w = z2;
            for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
                View childAt = this.a.getChildAt(i2);
                if (childAt instanceof h) {
                    ((h) childAt).a(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            f();
        }
    }

    public ColorStateList getTabTextColors() {
        return this.g;
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            f();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(aa.a(getContext(), i2));
    }

    public ColorStateList getTabIconTint() {
        return this.h;
    }

    public ColorStateList getTabRippleColor() {
        return this.i;
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
                View childAt = this.a.getChildAt(i2);
                if (childAt instanceof h) {
                    ((h) childAt).a(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(aa.a(getContext(), i2));
    }

    public Drawable getTabSelectedIndicator() {
        return this.j;
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.j != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.j = drawable;
        }
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(aa.b(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        a(viewPager, true);
    }

    public void a(ViewPager viewPager, boolean z2) {
        a(viewPager, z2, false);
    }

    private void a(ViewPager viewPager, boolean z2, boolean z3) {
        ViewPager viewPager2 = this.x;
        if (viewPager2 != null) {
            g gVar = this.O;
            if (gVar != null) {
                viewPager2.removeOnPageChangeListener(gVar);
            }
            a aVar = this.P;
            if (aVar != null) {
                this.x.removeOnAdapterChangeListener(aVar);
            }
        }
        b bVar = this.K;
        if (bVar != null) {
            b(bVar);
            this.K = null;
        }
        if (viewPager != null) {
            this.x = viewPager;
            if (this.O == null) {
                this.O = new g(this);
            }
            this.O.a();
            viewPager.addOnPageChangeListener(this.O);
            this.K = new i(viewPager);
            a(this.K);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                a(adapter, z2);
            }
            if (this.P == null) {
                this.P = new a();
            }
            this.P.a(z2);
            viewPager.addOnAdapterChangeListener(this.P);
            a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.x = null;
            a((androidx.viewpager.widget.a) null, false);
        }
        this.Q = z3;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        a(aVar, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        xq.a(this);
        if (this.x == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.Q) {
            setupWithViewPager(null);
            this.Q = false;
        }
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    void a(androidx.viewpager.widget.a aVar, boolean z2) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.M;
        if (aVar2 != null && (dataSetObserver = this.N) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.M = aVar;
        if (z2 && aVar != null) {
            if (this.N == null) {
                this.N = new d();
            }
            aVar.registerDataSetObserver(this.N);
        }
        e();
    }

    void e() {
        int currentItem;
        c();
        androidx.viewpager.widget.a aVar = this.M;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                a(a().a(this.M.getPageTitle(i2)), false);
            }
            ViewPager viewPager = this.x;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            c(a(currentItem));
        }
    }

    private void f() {
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A.get(i2).h();
        }
    }

    private h d(f fVar) {
        go.a<h> aVar = this.R;
        h acquire = aVar != null ? aVar.acquire() : null;
        if (acquire == null) {
            acquire = new h(getContext());
        }
        acquire.setTab(fVar);
        acquire.setFocusable(true);
        acquire.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f)) {
            acquire.setContentDescription(fVar.e);
        } else {
            acquire.setContentDescription(fVar.f);
        }
        return acquire;
    }

    private void b(f fVar, int i2) {
        fVar.b(i2);
        this.A.add(i2, fVar);
        int size = this.A.size();
        while (true) {
            i2++;
            if (i2 >= size) {
                return;
            }
            this.A.get(i2).b(i2);
        }
    }

    private void e(f fVar) {
        h hVar = fVar.b;
        hVar.setSelected(false);
        hVar.setActivated(false);
        this.a.addView(hVar, fVar.c(), g());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    private void a(View view) {
        if (view instanceof ya) {
            a((ya) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private LinearLayout.LayoutParams g() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    private void a(LinearLayout.LayoutParams layoutParams) {
        if (this.s == 1 && this.p == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        xq.a(this, f2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ib.a(accessibilityNodeInfo).a(ib.b.a(1, getTabCount(), false, 1));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
            View childAt = this.a.getChildAt(i2);
            if (childAt instanceof h) {
                ((h) childAt).a(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int round = Math.round(t.a(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i3);
        boolean z2 = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i4 = this.E;
            if (i4 <= 0) {
                i4 = (int) (size - t.a(getContext(), 56));
            }
            this.o = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            switch (this.s) {
                case 0:
                case 2:
                    if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                        z2 = true;
                        break;
                    }
                    break;
                case 1:
                    if (childAt.getMeasuredWidth() != getMeasuredWidth()) {
                        z2 = true;
                        break;
                    }
                    break;
            }
            if (z2) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    private void b(int i2) {
        h hVar = (h) this.a.getChildAt(i2);
        this.a.removeViewAt(i2);
        if (hVar != null) {
            hVar.a();
            this.R.release(hVar);
        }
        requestLayout();
    }

    private void c(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() == null || !hq.B(this) || this.a.a()) {
            a(i2, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int a2 = a(i2, 0.0f);
        if (scrollX != a2) {
            h();
            this.L.setIntValues(scrollX, a2);
            this.L.start();
        }
        this.a.a(i2, this.q);
    }

    private void h() {
        if (this.L == null) {
            this.L = new ValueAnimator();
            this.L.setInterpolator(vv.b);
            this.L.setDuration(this.q);
            this.L.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yb.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    yb.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        h();
        this.L.addListener(animatorListener);
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.a.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.a.getChildAt(i3);
                boolean z2 = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z2 = false;
                }
                childAt.setActivated(z2);
                i3++;
            }
        }
    }

    public void c(f fVar) {
        b(fVar, true);
    }

    public void b(f fVar, boolean z2) {
        f fVar2 = this.B;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                h(fVar);
                c(fVar.c());
                return;
            }
            return;
        }
        int c2 = fVar != null ? fVar.c() : -1;
        if (z2) {
            if ((fVar2 == null || fVar2.c() == -1) && c2 != -1) {
                a(c2, 0.0f, true);
            } else {
                c(c2);
            }
            if (c2 != -1) {
                setSelectedTabView(c2);
            }
        }
        this.B = fVar;
        if (fVar2 != null) {
            g(fVar2);
        }
        if (fVar != null) {
            f(fVar);
        }
    }

    private void f(f fVar) {
        for (int size = this.f165J.size() - 1; size >= 0; size--) {
            this.f165J.get(size).a(fVar);
        }
    }

    private void g(f fVar) {
        for (int size = this.f165J.size() - 1; size >= 0; size--) {
            this.f165J.get(size).b(fVar);
        }
    }

    private void h(f fVar) {
        for (int size = this.f165J.size() - 1; size >= 0; size--) {
            this.f165J.get(size).c(fVar);
        }
    }

    private int a(int i2, float f2) {
        int i3 = this.s;
        if (i3 == 0 || i3 == 2) {
            View childAt = this.a.getChildAt(i2);
            int i4 = i2 + 1;
            View childAt2 = i4 < this.a.getChildCount() ? this.a.getChildAt(i4) : null;
            int width = childAt != null ? childAt.getWidth() : 0;
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i5 = (int) ((width + width2) * 0.5f * f2);
            return hq.h(this) == 0 ? left + i5 : left - i5;
        }
        return 0;
    }

    private void i() {
        int i2 = this.s;
        hq.b(this.a, (i2 == 0 || i2 == 2) ? Math.max(0, this.G - this.b) : 0, 0, 0, 0);
        switch (this.s) {
            case 0:
                d(this.p);
                break;
            case 1:
            case 2:
                if (this.p == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.a.setGravity(1);
                break;
        }
        a(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void d(int i2) {
        switch (i2) {
            case 0:
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                break;
            case 1:
                this.a.setGravity(1);
                return;
            case 2:
                break;
            default:
                return;
        }
        this.a.setGravity(8388611);
    }

    void a(boolean z2) {
        for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
            View childAt = this.a.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    /* compiled from: TabLayout.java */
    /* renamed from: yb$f */
    /* loaded from: classes3.dex */
    public static class f {
        public yb a;
        public h b;
        private Object c;
        private Drawable d;
        private CharSequence e;
        private CharSequence f;
        private View h;
        private int g = -1;
        private int i = 1;
        private int j = -1;

        public View a() {
            return this.h;
        }

        public f a(View view) {
            this.h = view;
            h();
            return this;
        }

        public f a(int i) {
            return a(LayoutInflater.from(this.b.getContext()).inflate(i, (ViewGroup) this.b, false));
        }

        public Drawable b() {
            return this.d;
        }

        public int c() {
            return this.g;
        }

        void b(int i) {
            this.g = i;
        }

        public CharSequence d() {
            return this.e;
        }

        public f a(Drawable drawable) {
            this.d = drawable;
            if (this.a.p == 1 || this.a.s == 2) {
                this.a.a(true);
            }
            h();
            if (com.google.android.material.badge.a.a && this.b.i() && this.b.f.isVisible()) {
                this.b.invalidate();
            }
            return this;
        }

        public f a(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f) && !TextUtils.isEmpty(charSequence)) {
                this.b.setContentDescription(charSequence);
            }
            this.e = charSequence;
            h();
            return this;
        }

        public int e() {
            return this.i;
        }

        public void f() {
            yb ybVar = this.a;
            if (ybVar == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            ybVar.c(this);
        }

        public boolean g() {
            yb ybVar = this.a;
            if (ybVar != null) {
                return ybVar.getSelectedTabPosition() == this.g;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public f b(CharSequence charSequence) {
            this.f = charSequence;
            h();
            return this;
        }

        void h() {
            h hVar = this.b;
            if (hVar != null) {
                hVar.b();
            }
        }

        void i() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.j = -1;
            this.e = null;
            this.f = null;
            this.g = -1;
            this.h = null;
        }
    }

    /* compiled from: TabLayout.java */
    /* renamed from: yb$h */
    /* loaded from: classes3.dex */
    public final class h extends LinearLayout {
        private f b;
        private TextView c;
        private ImageView d;
        private View e;
        private BadgeDrawable f;
        private View g;
        private TextView h;
        private ImageView i;
        private Drawable j;
        private int k;

        public h(Context context) {
            super(context);
            this.k = 2;
            a(context);
            hq.b(this, yb.this.b, yb.this.c, yb.this.d, yb.this.e);
            setGravity(17);
            setOrientation(!yb.this.t ? 1 : 0);
            setClickable(true);
            hq.a(this, hn.a(getContext(), 1002));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Context context) {
            if (yb.this.n != 0) {
                this.j = aa.b(context, yb.this.n);
                Drawable drawable = this.j;
                if (drawable != null && drawable.isStateful()) {
                    this.j.setState(getDrawableState());
                }
            } else {
                this.j = null;
            }
            Drawable gradientDrawable = new GradientDrawable();
            ((GradientDrawable) gradientDrawable).setColor(0);
            if (yb.this.i != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a = xf.a(yb.this.i);
                if (Build.VERSION.SDK_INT >= 21) {
                    if (yb.this.w) {
                        gradientDrawable = null;
                    }
                    if (yb.this.w) {
                        gradientDrawable2 = null;
                    }
                    gradientDrawable = new RippleDrawable(a, gradientDrawable, gradientDrawable2);
                } else {
                    Drawable g = androidx.core.graphics.drawable.a.g(gradientDrawable2);
                    androidx.core.graphics.drawable.a.a(g, a);
                    gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, g});
                }
            }
            hq.a(this, gradientDrawable);
            yb.this.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Canvas canvas) {
            Drawable drawable = this.j;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.j.draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.j;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.j.setState(drawableState);
            }
            if (z) {
                invalidate();
                yb.this.invalidate();
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.b != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.b.f();
                return true;
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.g;
            if (view != null) {
                view.setSelected(z);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f.g()));
            }
            ib a = ib.a(accessibilityNodeInfo);
            a.b(ib.c.a(0, 1, this.b.c(), 1, false, isSelected()));
            if (isSelected()) {
                a.g(false);
                a.b(ib.a.e);
            }
            a.j(getResources().getString(vu.j.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = yb.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(yb.this.o, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.c != null) {
                float f = yb.this.l;
                int i3 = this.k;
                ImageView imageView = this.d;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = yb.this.m;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.c.getTextSize();
                int lineCount = this.c.getLineCount();
                int a = androidx.core.widget.i.a(this.c);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (a >= 0 && i3 != a)) {
                    if (yb.this.s == 1 && i4 > 0 && lineCount == 1 && ((layout = this.c.getLayout()) == null || a(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.c.setTextSize(0, f);
                        this.c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        void setTab(f fVar) {
            if (fVar != this.b) {
                this.b = fVar;
                b();
            }
        }

        void a() {
            setTab(null);
            setSelected(false);
        }

        final void b() {
            f fVar = this.b;
            Drawable drawable = null;
            View a = fVar != null ? fVar.a() : null;
            if (a != null) {
                ViewParent parent = a.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(a);
                    }
                    addView(a);
                }
                this.g = a;
                TextView textView = this.c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
                this.h = (TextView) a.findViewById(16908308);
                TextView textView2 = this.h;
                if (textView2 != null) {
                    this.k = androidx.core.widget.i.a(textView2);
                }
                this.i = (ImageView) a.findViewById(16908294);
            } else {
                View view = this.g;
                if (view != null) {
                    removeView(view);
                    this.g = null;
                }
                this.h = null;
                this.i = null;
            }
            if (this.g == null) {
                if (this.d == null) {
                    d();
                }
                if (fVar != null && fVar.b() != null) {
                    drawable = androidx.core.graphics.drawable.a.g(fVar.b()).mutate();
                }
                if (drawable != null) {
                    androidx.core.graphics.drawable.a.a(drawable, yb.this.h);
                    if (yb.this.k != null) {
                        androidx.core.graphics.drawable.a.a(drawable, yb.this.k);
                    }
                }
                if (this.c == null) {
                    e();
                    this.k = androidx.core.widget.i.a(this.c);
                }
                androidx.core.widget.i.a(this.c, yb.this.f);
                if (yb.this.g != null) {
                    this.c.setTextColor(yb.this.g);
                }
                a(this.c, this.d);
                g();
                a(this.d);
                a(this.c);
            } else if (this.h != null || this.i != null) {
                a(this.h, this.i);
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.f)) {
                setContentDescription(fVar.f);
            }
            setSelected(fVar != null && fVar.g());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void d() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.a.a) {
                frameLayout = f();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            this.d = (ImageView) LayoutInflater.from(getContext()).inflate(vu.h.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            frameLayout.addView(this.d, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void e() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.a.a) {
                frameLayout = f();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            this.c = (TextView) LayoutInflater.from(getContext()).inflate(vu.h.design_layout_tab_text, (ViewGroup) frameLayout, false);
            frameLayout.addView(this.c);
        }

        private FrameLayout f() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.f == null) {
                this.f = BadgeDrawable.a(getContext());
            }
            g();
            BadgeDrawable badgeDrawable = this.f;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private BadgeDrawable getBadge() {
            return this.f;
        }

        private void a(final View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: yb.h.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (view.getVisibility() == 0) {
                        h.this.c(view);
                    }
                }
            });
        }

        private void g() {
            f fVar;
            f fVar2;
            if (i()) {
                if (this.g != null) {
                    h();
                } else if (this.d != null && (fVar2 = this.b) != null && fVar2.b() != null) {
                    View view = this.e;
                    ImageView imageView = this.d;
                    if (view != imageView) {
                        h();
                        b(this.d);
                        return;
                    }
                    c(imageView);
                } else if (this.c != null && (fVar = this.b) != null && fVar.e() == 1) {
                    View view2 = this.e;
                    TextView textView = this.c;
                    if (view2 != textView) {
                        h();
                        b(this.c);
                        return;
                    }
                    c(textView);
                } else {
                    h();
                }
            }
        }

        private void b(View view) {
            if (i() && view != null) {
                a(false);
                com.google.android.material.badge.a.a(this.f, view, d(view));
                this.e = view;
            }
        }

        private void h() {
            if (i()) {
                a(true);
                View view = this.e;
                if (view != null) {
                    com.google.android.material.badge.a.a(this.f, view);
                    this.e = null;
                }
            }
        }

        private void a(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        final void c() {
            setOrientation(!yb.this.t ? 1 : 0);
            if (this.h != null || this.i != null) {
                a(this.h, this.i);
            } else {
                a(this.c, this.d);
            }
        }

        private void a(TextView textView, ImageView imageView) {
            f fVar = this.b;
            Drawable mutate = (fVar == null || fVar.b() == null) ? null : androidx.core.graphics.drawable.a.g(this.b.b()).mutate();
            f fVar2 = this.b;
            CharSequence d = fVar2 != null ? fVar2.d() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (textView != null) {
                if (z) {
                    textView.setText(d);
                    if (this.b.i == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int a = (z && imageView.getVisibility() == 0) ? (int) t.a(getContext(), 8) : 0;
                if (yb.this.t) {
                    if (a != gy.b(marginLayoutParams)) {
                        gy.b(marginLayoutParams, a);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (a != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = a;
                    gy.b(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar3 = this.b;
            CharSequence charSequence = fVar3 != null ? fVar3.f : null;
            if (z) {
                charSequence = d;
            }
            ay.a(this, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(View view) {
            if (i() && view == this.e) {
                com.google.android.material.badge.a.b(this.f, view, d(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i() {
            return this.f != null;
        }

        private FrameLayout d(View view) {
            if ((view == this.d || view == this.c) && com.google.android.material.badge.a.a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr;
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (View view : new View[]{this.c, this.d, this.g}) {
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr;
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (View view : new View[]{this.c, this.d, this.g}) {
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        public f getTab() {
            return this.b;
        }

        private float a(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TabLayout.java */
    /* renamed from: yb$e */
    /* loaded from: classes3.dex */
    public class e extends LinearLayout {
        ValueAnimator a;
        int b;
        float c;
        private int e;

        e(Context context) {
            super(context);
            this.b = -1;
            this.e = -1;
            setWillNotDraw(false);
        }

        void a(int i) {
            Rect bounds = yb.this.j.getBounds();
            yb.this.j.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        boolean a() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        void a(int i, float f) {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.a.cancel();
            }
            this.b = i;
            this.c = f;
            a(getChildAt(this.b), getChildAt(this.b + 1), this.c);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.e == i) {
                return;
            }
            requestLayout();
            this.e = i;
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            boolean z;
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            if (yb.this.p == 1 || yb.this.s == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) t.a(getContext(), 16)) * 2)) {
                    z = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z = true;
                        }
                    }
                } else {
                    yb ybVar = yb.this;
                    ybVar.p = 0;
                    ybVar.a(false);
                    z = true;
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                a(false, this.b, -1);
            } else {
                b();
            }
        }

        private void b() {
            View childAt = getChildAt(this.b);
            xz xzVar = yb.this.H;
            yb ybVar = yb.this;
            xzVar.a(ybVar, childAt, ybVar.j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                xz xzVar = yb.this.H;
                yb ybVar = yb.this;
                xzVar.a(ybVar, view, view2, f, ybVar.j);
            } else {
                yb.this.j.setBounds(-1, yb.this.j.getBounds().top, -1, yb.this.j.getBounds().bottom);
            }
            hq.e(this);
        }

        void a(int i, int i2) {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.a.cancel();
            }
            a(true, i, i2);
        }

        private void a(boolean z, final int i, int i2) {
            final View childAt = getChildAt(this.b);
            final View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                b();
                return;
            }
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: yb.e.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    e.this.a(childAt, childAt2, valueAnimator.getAnimatedFraction());
                }
            };
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.a = valueAnimator;
                valueAnimator.setInterpolator(vv.b);
                valueAnimator.setDuration(i2);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(animatorUpdateListener);
                valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: yb.e.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        e.this.b = i;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        e.this.b = i;
                    }
                });
                valueAnimator.start();
                return;
            }
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener(animatorUpdateListener);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height = yb.this.j.getBounds().height();
            if (height < 0) {
                height = yb.this.j.getIntrinsicHeight();
            }
            int i = 0;
            switch (yb.this.r) {
                case 0:
                    i = getHeight() - height;
                    height = getHeight();
                    break;
                case 1:
                    i = (getHeight() - height) / 2;
                    height = (getHeight() + height) / 2;
                    break;
                case 2:
                    break;
                case 3:
                    height = getHeight();
                    break;
                default:
                    height = 0;
                    break;
            }
            if (yb.this.j.getBounds().width() > 0) {
                Rect bounds = yb.this.j.getBounds();
                yb.this.j.setBounds(bounds.left, i, bounds.right, height);
                Drawable drawable = yb.this.j;
                if (yb.this.C != 0) {
                    drawable = androidx.core.graphics.drawable.a.g(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(yb.this.C, PorterDuff.Mode.SRC_IN);
                    } else {
                        androidx.core.graphics.drawable.a.a(drawable, yb.this.C);
                    }
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }
    }

    private static ColorStateList a(int i2, int i3) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private int getDefaultHeight() {
        int size = this.A.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                f fVar = this.A.get(i2);
                if (fVar != null && fVar.b() != null && !TextUtils.isEmpty(fVar.d())) {
                    z2 = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!z2 || this.t) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.D;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.s;
        if (i3 == 0 || i3 == 2) {
            return this.F;
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    int getTabMaxWidth() {
        return this.o;
    }

    /* compiled from: TabLayout.java */
    /* renamed from: yb$g */
    /* loaded from: classes3.dex */
    public static class g implements ViewPager.f {
        private final WeakReference<yb> a;
        private int b;
        private int c;

        public g(yb ybVar) {
            this.a = new WeakReference<>(ybVar);
        }

        @Override // androidx.viewpager.widget.ViewPager.f
        public void onPageScrollStateChanged(int i) {
            this.b = this.c;
            this.c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.f
        public void onPageScrolled(int i, float f, int i2) {
            yb ybVar = this.a.get();
            if (ybVar != null) {
                boolean z = false;
                boolean z2 = this.c != 2 || this.b == 1;
                if (this.c != 2 || this.b != 0) {
                    z = true;
                }
                ybVar.a(i, f, z2, z);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.f
        public void onPageSelected(int i) {
            yb ybVar = this.a.get();
            if (ybVar == null || ybVar.getSelectedTabPosition() == i || i >= ybVar.getTabCount()) {
                return;
            }
            int i2 = this.c;
            ybVar.b(ybVar.a(i), i2 == 0 || (i2 == 2 && this.b == 0));
        }

        void a() {
            this.c = 0;
            this.b = 0;
        }
    }

    /* compiled from: TabLayout.java */
    /* renamed from: yb$i */
    /* loaded from: classes3.dex */
    public static class i implements c {
        private final ViewPager a;

        @Override // defpackage.yb.b
        public void b(f fVar) {
        }

        @Override // defpackage.yb.b
        public void c(f fVar) {
        }

        public i(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // defpackage.yb.b
        public void a(f fVar) {
            this.a.setCurrentItem(fVar.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TabLayout.java */
    /* renamed from: yb$d */
    /* loaded from: classes3.dex */
    public class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            yb.this.e();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            yb.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TabLayout.java */
    /* renamed from: yb$a */
    /* loaded from: classes3.dex */
    public class a implements ViewPager.e {
        private boolean b;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public void onAdapterChanged(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            if (yb.this.x == viewPager) {
                yb.this.a(aVar2, this.b);
            }
        }

        void a(boolean z) {
            this.b = z;
        }
    }
}
