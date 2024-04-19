package com.xiaopeng.musicradio.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.vui.VuiRecyclerView;
/* compiled from: RecyclerTabLayout.java */
/* loaded from: classes2.dex */
public class f extends VuiRecyclerView {
    private int A;
    private int B;
    private int C;
    protected Paint a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected boolean h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected LinearLayoutManager n;
    protected c o;
    protected ViewPager p;
    protected a<?> q;
    protected int r;
    protected int s;
    protected int t;
    protected float u;
    protected float v;
    protected boolean w;
    protected boolean x;
    public Context y;

    public f(Context context) {
        this(context, null);
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.a = new Paint();
        a(context, attributeSet, i);
        this.n = new LinearLayoutManager(getContext()) { // from class: com.xiaopeng.musicradio.widget.f.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean g() {
                return f.this.x;
            }
        };
        this.n.b(this.C);
        setLayoutManager(this.n);
        setItemAnimator(null);
        this.v = 0.6f;
        this.y = context;
        setVuiLayoutLoadable(false);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.rtl_RecyclerTabLayout, i, f.i.rtl_RecyclerTabLayout);
        setIndicatorColor(0);
        setIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(f.j.rtl_RecyclerTabLayout_rtl_tabIndicatorHeight, 0));
        this.f = obtainStyledAttributes.getResourceId(f.j.rtl_RecyclerTabLayout_rtl_tabTextAppearance, f.i.rtl_RecyclerTabLayout_Tab);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(f.j.rtl_RecyclerTabLayout_rtl_tabPadding, 0);
        this.l = dimensionPixelSize;
        this.k = dimensionPixelSize;
        this.j = dimensionPixelSize;
        this.i = dimensionPixelSize;
        this.i = obtainStyledAttributes.getDimensionPixelSize(f.j.rtl_RecyclerTabLayout_rtl_tabPaddingStart, this.i);
        this.j = obtainStyledAttributes.getDimensionPixelSize(f.j.rtl_RecyclerTabLayout_rtl_tabPaddingTop, this.j);
        this.k = obtainStyledAttributes.getDimensionPixelSize(f.j.rtl_RecyclerTabLayout_rtl_tabPaddingEnd, this.k);
        this.l = obtainStyledAttributes.getDimensionPixelSize(f.j.rtl_RecyclerTabLayout_rtl_tabPaddingBottom, this.l);
        this.C = obtainStyledAttributes.getInt(f.j.rtl_RecyclerTabLayout_rtl_orientation, 0);
        if (obtainStyledAttributes.hasValue(f.j.rtl_RecyclerTabLayout_rtl_tabSelectedTextColor)) {
            this.g = 0;
            this.h = true;
        }
        this.c = obtainStyledAttributes.getInteger(f.j.rtl_RecyclerTabLayout_rtl_tabOnScreenLimit, 0);
        if (this.c == 0) {
            this.d = obtainStyledAttributes.getDimensionPixelSize(f.j.rtl_RecyclerTabLayout_rtl_tabMinWidth, 0);
            this.e = obtainStyledAttributes.getDimensionPixelSize(f.j.rtl_RecyclerTabLayout_rtl_tabMaxWidth, 0);
        }
        this.b = 0;
        this.x = obtainStyledAttributes.getBoolean(f.j.rtl_RecyclerTabLayout_rtl_scrollEnabled, true);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView, com.xiaopeng.xui.widget.XRecyclerView, com.xiaopeng.xui.vui.VuiRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        c cVar = this.o;
        if (cVar != null) {
            removeOnScrollListener(cVar);
            this.o = null;
        }
        super.onDetachedFromWindow();
    }

    public void setIndicatorColor(int i) {
        this.a.setColor(i);
    }

    public void setIndicatorHeight(int i) {
        this.m = i;
    }

    public void setAutoSelectionMode(boolean z) {
        c cVar = this.o;
        if (cVar != null) {
            removeOnScrollListener(cVar);
            this.o = null;
        }
        if (z) {
            this.o = new c(this, this.n);
            addOnScrollListener(this.o);
        }
    }

    public void setPositionThreshold(float f) {
        this.v = f;
    }

    public void setUpWithViewPager(ViewPager viewPager) {
        b bVar = new b(viewPager);
        bVar.a(this.i, this.j, this.k, this.l);
        bVar.f(this.f);
        bVar.a(this.h, this.g);
        bVar.g(this.e);
        bVar.h(this.d);
        bVar.i(this.b);
        bVar.j(this.c);
        setUpWithAdapter(bVar);
    }

    public void setUpWithAdapter(a<?> aVar) {
        this.q = aVar;
        this.p = aVar.f();
        if (this.p.getAdapter() == null) {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.p.addOnPageChangeListener(new e(this));
        setAdapter(aVar);
        a(this.p.getCurrentItem());
    }

    public void a(int i, boolean z) {
        ViewPager viewPager = this.p;
        if (viewPager != null) {
            viewPager.setCurrentItem(i, z);
            a(this.p.getCurrentItem());
        } else if (z && i != this.r) {
            b(i);
        } else {
            a(i);
        }
    }

    protected void b(final int i) {
        View c2 = this.n.c(i);
        float abs = c2 != null ? Math.abs((getMeasuredWidth() / 2.0f) - (c2.getX() + (c2.getMeasuredWidth() / 2.0f))) / c2.getMeasuredWidth() : 1.0f;
        ValueAnimator ofFloat = i < this.r ? ValueAnimator.ofFloat(abs, 0.0f) : ValueAnimator.ofFloat(-abs, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xiaopeng.musicradio.widget.f.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.a(i, ((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
            }
        });
        ofFloat.start();
    }

    public void a(int i) {
        a(i, 0.0f, false);
        a<?> aVar = this.q;
        if (aVar != null) {
            aVar.e(i);
            this.q.d();
        }
    }

    public void a(int i, float f, boolean z) {
        int measuredWidth;
        int i2;
        int i3;
        View c2 = this.n.c(i);
        View c3 = this.n.c(i + 1);
        if (c2 != null) {
            int measuredWidth2 = getMeasuredWidth();
            float measuredWidth3 = i == 0 ? 0.0f : (measuredWidth2 / 2.0f) - (c2.getMeasuredWidth() / 2.0f);
            float measuredWidth4 = c2.getMeasuredWidth() + measuredWidth3;
            if (c3 != null) {
                float measuredWidth5 = (measuredWidth4 - ((measuredWidth2 / 2.0f) - (c3.getMeasuredWidth() / 2.0f))) * f;
                measuredWidth = (int) (measuredWidth3 - measuredWidth5);
                if (i == 0) {
                    float measuredWidth6 = (c3.getMeasuredWidth() - c2.getMeasuredWidth()) / 2;
                    this.s = (int) (measuredWidth6 * f);
                    this.t = (int) ((c2.getMeasuredWidth() + measuredWidth6) * f);
                } else {
                    this.s = (int) (((c3.getMeasuredWidth() - c2.getMeasuredWidth()) / 2) * f);
                    this.t = (int) measuredWidth5;
                }
            } else {
                measuredWidth = (int) measuredWidth3;
                this.t = 0;
                this.s = 0;
            }
            if (z) {
                this.t = 0;
                this.s = 0;
            }
        } else {
            measuredWidth = (getMeasuredWidth() <= 0 || (i2 = this.e) <= 0 || (i3 = this.d) != i2) ? 0 : ((int) ((-i3) * f)) + ((int) ((getMeasuredWidth() - i3) / 2.0f));
            this.w = true;
        }
        a(i, f - this.u, f);
        this.r = i;
        stopScroll();
        if (i != this.A || measuredWidth != this.B) {
            this.n.b(i, measuredWidth);
        }
        if (this.m > 0) {
            invalidate();
        }
        this.A = i;
        this.B = measuredWidth;
        this.u = f;
    }

    protected void a(int i, float f, float f2) {
        if (this.q == null) {
            return;
        }
        if (f > 0.0f && f2 >= this.v - 0.001f) {
            i++;
        } else if (f >= 0.0f || f2 > (1.0f - this.v) + 0.001f) {
            i = -1;
        }
        if (i < 0 || i == this.q.g()) {
            return;
        }
        this.q.e(i);
        this.q.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        int left;
        int right;
        View c2 = this.n.c(this.r);
        if (c2 == null) {
            if (this.w) {
                this.w = false;
                return;
            }
            return;
        }
        this.w = false;
        if (isLayoutRtl()) {
            left = (c2.getLeft() - this.t) - this.s;
            right = (c2.getRight() - this.t) + this.s;
        } else {
            left = (c2.getLeft() + this.t) - this.s;
            right = c2.getRight() + this.t + this.s;
        }
        canvas.drawRect(left, getHeight() - this.m, right, getHeight(), this.a);
    }

    public boolean isLayoutRtl() {
        return hq.h(this) == 1;
    }

    /* compiled from: RecyclerTabLayout.java */
    /* loaded from: classes2.dex */
    protected static class c extends RecyclerView.m {
        protected f a;
        protected LinearLayoutManager b;
        public int c;

        public c(f fVar, LinearLayoutManager linearLayoutManager) {
            this.a = fVar;
            this.b = linearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            this.c += i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i != 0) {
                return;
            }
            if (this.c > 0) {
                a();
            } else {
                b();
            }
            this.c = 0;
        }

        protected void a() {
            int r = this.b.r();
            int width = this.a.getWidth() / 2;
            for (int p = this.b.p(); p <= r; p++) {
                View c = this.b.c(p);
                if (c.getLeft() + c.getWidth() >= width) {
                    this.a.a(p, false);
                    return;
                }
            }
        }

        protected void b() {
            int p = this.b.p();
            int width = this.a.getWidth() / 2;
            for (int r = this.b.r(); r >= p; r--) {
                if (this.b.c(r).getLeft() <= width) {
                    this.a.a(r, false);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: RecyclerTabLayout.java */
    /* loaded from: classes2.dex */
    public static class e implements ViewPager.f {
        private final f a;
        private int b;

        public e(f fVar) {
            this.a = fVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.f
        public void onPageScrolled(int i, float f, int i2) {
            this.a.a(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.f
        public void onPageScrollStateChanged(int i) {
            this.b = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.f
        public void onPageSelected(int i) {
            if (this.b != 0 || this.a.r == i) {
                return;
            }
            this.a.a(i);
        }
    }

    /* compiled from: RecyclerTabLayout.java */
    /* loaded from: classes2.dex */
    public static abstract class a<T extends RecyclerView.v> extends RecyclerView.a<T> {
        protected ViewPager a;
        protected int b;

        public a(ViewPager viewPager) {
            this.a = viewPager;
        }

        public a() {
        }

        public ViewPager f() {
            return this.a;
        }

        public void e(int i) {
            this.b = i;
        }

        public int g() {
            return this.b;
        }
    }

    /* compiled from: RecyclerTabLayout.java */
    /* loaded from: classes2.dex */
    public static class b extends a<a> {
        protected int c;
        protected int d;
        protected int e;
        protected int f;
        protected int g;
        protected boolean h;
        protected int i;
        public Context j;
        private int k;
        private int l;
        private int m;
        private int n;

        public b(ViewPager viewPager) {
            super(viewPager);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        /* renamed from: c */
        public a a(ViewGroup viewGroup, int i) {
            d dVar = new d(viewGroup.getContext());
            this.j = viewGroup.getContext();
            if (this.h) {
                dVar.setTextColor(dVar.a(dVar.getCurrentTextColor(), this.i));
            }
            hq.b(dVar, this.c, this.d, this.e, this.f);
            dVar.setTextAppearance(viewGroup.getContext(), this.g);
            dVar.setGravity(17);
            dVar.setMaxLines(2);
            dVar.setEllipsize(TextUtils.TruncateAt.END);
            if (this.n > 0) {
                int measuredWidth = viewGroup.getMeasuredWidth() / this.n;
                dVar.setMaxWidth(measuredWidth);
                dVar.setMinWidth(measuredWidth);
            } else {
                int i2 = this.k;
                if (i2 > 0) {
                    dVar.setMaxWidth(i2);
                }
                dVar.setMinWidth(this.l);
            }
            dVar.setTextAppearance(dVar.getContext(), this.g);
            if (this.h) {
                dVar.setTextColor(dVar.a(dVar.getCurrentTextColor(), this.i));
            }
            if (this.m != 0) {
                dVar.setBackgroundDrawable(aa.b(dVar.getContext(), this.m));
            }
            dVar.setLayoutParams(h());
            return new a(dVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void a(a aVar, int i) {
            if (f() != null && f().getAdapter() != null) {
                aVar.r.setText(f().getAdapter().getPageTitle(i));
            }
            aVar.r.setSelected(g() == i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int a() {
            if (f() == null || f().getAdapter() == null) {
                return 0;
            }
            return f().getAdapter().getCount();
        }

        public void a(int i, int i2, int i3, int i4) {
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        public void f(int i) {
            this.g = i;
        }

        public void a(boolean z, int i) {
            this.h = z;
            this.i = i;
        }

        public void g(int i) {
            this.k = i;
        }

        public void h(int i) {
            this.l = i;
        }

        public void i(int i) {
            this.m = i;
        }

        public void j(int i) {
            this.n = i;
        }

        protected RecyclerView.i h() {
            return new RecyclerView.i(-2, -1);
        }

        /* compiled from: RecyclerTabLayout.java */
        /* loaded from: classes2.dex */
        public class a extends RecyclerView.v {
            public d r;

            public a(View view) {
                super(view);
                this.r = (d) view;
                view.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.widget.f.b.a.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        int e = a.this.e();
                        if (e != -1) {
                            b.this.f().setCurrentItem(e, true);
                        }
                    }
                });
            }
        }
    }

    /* compiled from: RecyclerTabLayout.java */
    /* loaded from: classes2.dex */
    public static class d extends z {
        public d(Context context) {
            super(context);
        }

        public ColorStateList a(int i, int i2) {
            return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
        }
    }
}
