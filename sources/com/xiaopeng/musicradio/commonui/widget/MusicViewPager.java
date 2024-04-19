package com.xiaopeng.musicradio.commonui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class MusicViewPager extends ViewGroup {
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private float G;
    private float H;
    private float I;

    /* renamed from: J  reason: collision with root package name */
    private float f155J;
    private int K;
    private VelocityTracker L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private androidx.core.widget.d R;
    private androidx.core.widget.d S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private List<f> aa;
    private f ab;
    private f ac;
    private List<e> ad;
    private g ae;
    private int af;
    private Method ag;
    private int ah;
    private ArrayList<View> ai;
    private final Runnable ak;
    private int al;
    com.xiaopeng.musicradio.commonui.widget.c b;
    int c;
    private int d;
    private final ArrayList<b> g;
    private final b h;
    private final Rect i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private boolean n;
    private h o;
    private int p;
    private Drawable q;
    private int r;
    private int s;
    private float t;
    private float u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;
    static final int[] a = {16842931};
    private static final Comparator<b> e = new Comparator<b>() { // from class: com.xiaopeng.musicradio.commonui.widget.MusicViewPager.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar.b - bVar2.b;
        }
    };
    private static final Interpolator f = new Interpolator() { // from class: com.xiaopeng.musicradio.commonui.widget.MusicViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    private static final i aj = new i();

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(MusicViewPager musicViewPager, com.xiaopeng.musicradio.commonui.widget.c cVar, com.xiaopeng.musicradio.commonui.widget.c cVar2);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(int i);

        void a(int i, float f, int i2);

        void b(int i);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(View view, float f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        Object a;
        int b;
        boolean c;
        float d;
        float e;

        b() {
        }
    }

    public MusicViewPager(Context context) {
        super(context);
        this.g = new ArrayList<>();
        this.h = new b();
        this.i = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.A = 1;
        this.K = -1;
        this.T = true;
        this.U = false;
        this.ak = new Runnable() { // from class: com.xiaopeng.musicradio.commonui.widget.MusicViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                MusicViewPager.this.setScrollState(0);
                MusicViewPager.this.c();
            }
        };
        this.al = 0;
        a();
    }

    public MusicViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new ArrayList<>();
        this.h = new b();
        this.i = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.A = 1;
        this.K = -1;
        this.T = true;
        this.U = false;
        this.ak = new Runnable() { // from class: com.xiaopeng.musicradio.commonui.widget.MusicViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                MusicViewPager.this.setScrollState(0);
                MusicViewPager.this.c();
            }
        };
        this.al = 0;
        a();
    }

    void a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.m = new Scroller(context, f);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.F = viewConfiguration.getScaledPagingTouchSlop();
        this.M = (int) (400.0f * f2);
        this.N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.R = new androidx.core.widget.d(context);
        this.S = new androidx.core.widget.d(context);
        this.O = (int) (25.0f * f2);
        this.P = (int) (2.0f * f2);
        this.D = (int) (f2 * 16.0f);
        hq.a(this, new d());
        if (hq.f(this) == 0) {
            hq.d((View) this, 1);
        }
        hq.a(this, new hj() { // from class: com.xiaopeng.musicradio.commonui.widget.MusicViewPager.4
            private final Rect b = new Rect();

            @Override // defpackage.hj
            public hy a(View view, hy hyVar) {
                hy a2 = hq.a(view, hyVar);
                if (a2.e()) {
                    return a2;
                }
                Rect rect = this.b;
                rect.left = a2.a();
                rect.top = a2.b();
                rect.right = a2.c();
                rect.bottom = a2.d();
                int childCount = MusicViewPager.this.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    hy b2 = hq.b(MusicViewPager.this.getChildAt(i2), a2);
                    rect.left = Math.min(b2.a(), rect.left);
                    rect.top = Math.min(b2.b(), rect.top);
                    rect.right = Math.min(b2.c(), rect.right);
                    rect.bottom = Math.min(b2.d(), rect.bottom);
                }
                return a2.a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.ak);
        Scroller scroller = this.m;
        if (scroller != null && !scroller.isFinished()) {
            this.m.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    void setScrollState(int i2) {
        if (this.al == i2) {
            return;
        }
        this.al = i2;
        if (this.ae != null) {
            b(i2 != 0);
        }
        f(i2);
    }

    public void setAdapter(com.xiaopeng.musicradio.commonui.widget.c cVar) {
        com.xiaopeng.musicradio.commonui.widget.c cVar2 = this.b;
        if (cVar2 != null) {
            cVar2.a((DataSetObserver) null);
            this.b.a((ViewGroup) this);
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                b bVar = this.g.get(i2);
                this.b.a((ViewGroup) this, bVar.b, bVar.a);
            }
            this.b.b((ViewGroup) this);
            this.g.clear();
            f();
            this.c = 0;
            scrollTo(0, 0);
        }
        com.xiaopeng.musicradio.commonui.widget.c cVar3 = this.b;
        this.b = cVar;
        this.d = 0;
        if (this.b != null) {
            if (this.o == null) {
                this.o = new h();
            }
            this.b.a((DataSetObserver) this.o);
            this.z = false;
            boolean z = this.T;
            this.T = true;
            this.d = this.b.a();
            if (this.j >= 0) {
                this.b.a(this.k, this.l);
                a(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (!z) {
                c();
            } else {
                requestLayout();
            }
        }
        List<e> list = this.ad;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.ad.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.ad.get(i3).a(this, cVar3, cVar);
        }
    }

    private void f() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((c) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    public com.xiaopeng.musicradio.commonui.widget.c getAdapter() {
        return this.b;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i2) {
        this.z = false;
        a(i2, !this.T, false);
    }

    public void a(int i2, boolean z) {
        this.z = false;
        a(i2, z, false);
    }

    public int getCurrentItem() {
        return this.c;
    }

    public void a(int i2, boolean z, boolean z2) {
        a(i2, z, z2, 0);
    }

    void a(int i2, boolean z, boolean z2, int i3) {
        com.xiaopeng.musicradio.commonui.widget.c cVar = this.b;
        if (cVar == null || cVar.a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (!z2 && this.c == i2 && this.g.size() != 0) {
            setScrollingCacheEnabled(false);
        } else {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.b.a()) {
                i2 = this.b.a() - 1;
            }
            int i4 = this.A;
            int i5 = this.c;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.g.size(); i6++) {
                    this.g.get(i6).c = true;
                }
            }
            boolean z3 = this.c != i2;
            if (this.T) {
                this.c = i2;
                if (z3) {
                    e(i2);
                }
                requestLayout();
                return;
            }
            a(i2);
            a(i2, z, i3, z3);
        }
    }

    private void a(int i2, boolean z, int i3, boolean z2) {
        b b2 = b(i2);
        int clientWidth = b2 != null ? (int) (getClientWidth() * Math.max(this.t, Math.min(b2.e, this.u))) : 0;
        if (z) {
            a(clientWidth, 0, i3);
            if (z2) {
                e(i2);
                return;
            }
            return;
        }
        if (z2) {
            e(i2);
        }
        a(false);
        scrollTo(clientWidth, 0);
        d(clientWidth);
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.ab = fVar;
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.ag == null) {
                try {
                    this.ag = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e2) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e2);
                }
            }
            try {
                this.ag.invoke(this, Boolean.valueOf(z));
            } catch (Exception e3) {
                Log.e("ViewPager", "Error changing children drawing order", e3);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.ah == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((c) this.ai.get(i3).getLayoutParams()).f;
    }

    public int getOffscreenPageLimit() {
        return this.A;
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 != this.A) {
            this.A = i2;
            c();
        }
    }

    public void setPageMargin(int i2) {
        int i3 = this.p;
        this.p = i2;
        int width = getWidth();
        a(width, width, i2, i3);
        requestLayout();
    }

    public int getPageMargin() {
        return this.p;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.q = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(es.a(getContext(), i2));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    float a(float f2) {
        return (float) Math.sin((float) ((f2 - 0.5f) * 0.4712389167638204d));
    }

    void a(int i2, int i3, int i4) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.m;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            int currX = this.n ? this.m.getCurrX() : this.m.getStartX();
            this.m.abortAnimation();
            setScrollingCacheEnabled(false);
            scrollX = currX;
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i5 = i2 - scrollX;
        int i6 = i3 - scrollY;
        if (i5 == 0 && i6 == 0) {
            a(false);
            c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i7;
        float a2 = f3 + (a(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f2)) * f3);
        int abs2 = Math.abs(i4);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(a2 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i5) / ((f2 * this.b.d(this.c)) + this.p)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.n = false;
        this.m.startScroll(scrollX, scrollY, i5, i6, min);
        hq.e(this);
    }

    b a(int i2, int i3) {
        b bVar = new b();
        bVar.b = i2;
        bVar.a = this.b.a((ViewGroup) this, i2);
        bVar.d = this.b.d(i2);
        if (i3 < 0 || i3 >= this.g.size()) {
            this.g.add(bVar);
        } else {
            this.g.add(i3, bVar);
        }
        return bVar;
    }

    void b() {
        int a2 = this.b.a();
        this.d = a2;
        boolean z = this.g.size() < (this.A * 2) + 1 && this.g.size() < a2;
        int i2 = this.c;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < this.g.size()) {
            b bVar = this.g.get(i3);
            int a3 = this.b.a(bVar.a);
            if (a3 != -1) {
                if (a3 == -2) {
                    this.g.remove(i3);
                    i3--;
                    if (!z2) {
                        this.b.a((ViewGroup) this);
                        z2 = true;
                    }
                    this.b.a((ViewGroup) this, bVar.b, bVar.a);
                    if (this.c == bVar.b) {
                        i2 = Math.max(0, Math.min(this.c, a2 - 1));
                        z = true;
                    } else {
                        z = true;
                    }
                } else if (bVar.b != a3) {
                    if (bVar.b == this.c) {
                        i2 = a3;
                    }
                    bVar.b = a3;
                    z = true;
                }
            }
            i3++;
        }
        if (z2) {
            this.b.b((ViewGroup) this);
        }
        Collections.sort(this.g, e);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                c cVar = (c) getChildAt(i4).getLayoutParams();
                if (!cVar.a) {
                    cVar.c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    void c() {
        a(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r8.b == r17.c) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(int r18) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.commonui.widget.MusicViewPager.a(int):void");
    }

    private void g() {
        if (this.ah != 0) {
            ArrayList<View> arrayList = this.ai;
            if (arrayList == null) {
                this.ai = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.ai.add(getChildAt(i2));
            }
            Collections.sort(this.ai, aj);
        }
    }

    private void a(b bVar, int i2, b bVar2) {
        b bVar3;
        b bVar4;
        int a2 = this.b.a();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.p / clientWidth : 0.0f;
        if (bVar2 != null) {
            int i3 = bVar2.b;
            if (i3 < bVar.b) {
                float f3 = bVar2.e + bVar2.d + f2;
                int i4 = i3 + 1;
                int i5 = 0;
                while (i4 <= bVar.b && i5 < this.g.size()) {
                    b bVar5 = this.g.get(i5);
                    while (true) {
                        bVar4 = bVar5;
                        if (i4 <= bVar4.b || i5 >= this.g.size() - 1) {
                            break;
                        }
                        i5++;
                        bVar5 = this.g.get(i5);
                    }
                    while (i4 < bVar4.b) {
                        f3 += this.b.d(i4) + f2;
                        i4++;
                    }
                    bVar4.e = f3;
                    f3 += bVar4.d + f2;
                    i4++;
                }
            } else if (i3 > bVar.b) {
                int size = this.g.size() - 1;
                float f4 = bVar2.e;
                while (true) {
                    i3--;
                    if (i3 < bVar.b || size < 0) {
                        break;
                    }
                    b bVar6 = this.g.get(size);
                    while (true) {
                        bVar3 = bVar6;
                        if (i3 >= bVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        bVar6 = this.g.get(size);
                    }
                    while (i3 > bVar3.b) {
                        f4 -= this.b.d(i3) + f2;
                        i3--;
                    }
                    f4 -= bVar3.d + f2;
                    bVar3.e = f4;
                }
            }
        }
        int size2 = this.g.size();
        float f5 = bVar.e;
        int i6 = bVar.b - 1;
        this.t = bVar.b == 0 ? bVar.e : -3.4028235E38f;
        int i7 = a2 - 1;
        this.u = bVar.b == i7 ? (bVar.e + bVar.d) - 1.0f : Float.MAX_VALUE;
        int i8 = i2 - 1;
        while (i8 >= 0) {
            b bVar7 = this.g.get(i8);
            while (i6 > bVar7.b) {
                f5 -= this.b.d(i6) + f2;
                i6--;
            }
            f5 -= bVar7.d + f2;
            bVar7.e = f5;
            if (bVar7.b == 0) {
                this.t = f5;
            }
            i8--;
            i6--;
        }
        float f6 = bVar.e + bVar.d + f2;
        int i9 = bVar.b + 1;
        int i10 = i2 + 1;
        while (i10 < size2) {
            b bVar8 = this.g.get(i10);
            while (i9 < bVar8.b) {
                f6 += this.b.d(i9) + f2;
                i9++;
            }
            if (bVar8.b == i7) {
                this.u = (bVar8.d + f6) - 1.0f;
            }
            bVar8.e = f6;
            f6 += bVar8.d + f2;
            i10++;
            i9++;
        }
        this.U = false;
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = fu.a(new fv<SavedState>() { // from class: com.xiaopeng.musicradio.commonui.widget.MusicViewPager.SavedState.1
            @Override // defpackage.fv
            /* renamed from: b */
            public SavedState a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // defpackage.fv
            /* renamed from: b */
            public SavedState[] a(int i) {
                return new SavedState[i];
            }
        });
        int a;
        Parcelable b;
        ClassLoader c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.c = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.c;
        com.xiaopeng.musicradio.commonui.widget.c cVar = this.b;
        if (cVar != null) {
            savedState.b = cVar.b();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        com.xiaopeng.musicradio.commonui.widget.c cVar = this.b;
        if (cVar != null) {
            cVar.a(savedState.b, savedState.c);
            a(savedState.a, false, true);
            return;
        }
        this.j = savedState.a;
        this.k = savedState.b;
        this.l = savedState.c;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        c cVar = (c) layoutParams;
        cVar.a |= c(view);
        if (this.x) {
            if (cVar != null && cVar.a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            cVar.d = true;
            addViewInLayout(view, i2, layoutParams);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    private static boolean c(View view) {
        return view.getClass().getAnnotation(a.class) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    b a(View view) {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = this.g.get(i2);
            if (this.b.a(view, bVar.a)) {
                return bVar;
            }
        }
        return null;
    }

    b b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return a(view);
            }
        }
    }

    b b(int i2) {
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            b bVar = this.g.get(i3);
            if (bVar.b == i2) {
                return bVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        c cVar;
        c cVar2;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i2), getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.E = Math.min(measuredWidth / 10, this.D);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = measuredHeight;
        int i8 = paddingLeft;
        int i9 = 0;
        while (true) {
            boolean z2 = true;
            int i10 = 1073741824;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8 && (cVar2 = (c) childAt.getLayoutParams()) != null && cVar2.a) {
                int i11 = cVar2.b & 7;
                int i12 = cVar2.b & 112;
                boolean z3 = (i12 == 48 || i12 == 80) ? true : z;
                if (i11 != 3 && i11 != 5) {
                    z2 = z;
                }
                int i13 = Integer.MIN_VALUE;
                if (z3) {
                    i4 = Integer.MIN_VALUE;
                    i13 = 1073741824;
                } else {
                    i4 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (cVar2.width == -2) {
                    i5 = i8;
                } else if (cVar2.width != -1) {
                    i5 = cVar2.width;
                    i13 = 1073741824;
                } else {
                    i5 = i8;
                    i13 = 1073741824;
                }
                if (cVar2.height != -2) {
                    i6 = cVar2.height != -1 ? cVar2.height : i7;
                } else {
                    i6 = i7;
                    i10 = i4;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, i13), View.MeasureSpec.makeMeasureSpec(i6, i10));
                if (z3) {
                    i7 -= childAt.getMeasuredHeight();
                } else if (z2) {
                    i8 -= childAt.getMeasuredWidth();
                }
            }
            i9++;
            z = false;
        }
        this.v = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        this.w = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        this.x = true;
        c();
        this.x = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8 && ((cVar = (c) childAt2.getLayoutParams()) == null || !cVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (i8 * cVar.c), 1073741824), this.w);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.p;
            a(i2, i4, i6, i6);
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.g.isEmpty()) {
            if (!this.m.isFinished()) {
                this.m.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        b b2 = b(this.c);
        int min = (int) ((b2 != null ? Math.min(b2.e, this.u) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            a(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        b a2;
        int max;
        int max2;
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = paddingBottom;
        int i9 = 0;
        int i10 = paddingTop;
        int i11 = paddingLeft;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int i13 = cVar.b & 7;
                    int i14 = cVar.b & 112;
                    if (i13 == 1) {
                        max = Math.max((i6 - childAt.getMeasuredWidth()) / 2, i11);
                    } else if (i13 == 3) {
                        max = i11;
                        i11 = childAt.getMeasuredWidth() + i11;
                    } else if (i13 != 5) {
                        max = i11;
                    } else {
                        max = (i6 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i14 == 16) {
                        max2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, i10);
                    } else if (i14 == 48) {
                        max2 = i10;
                        i10 = childAt.getMeasuredHeight() + i10;
                    } else if (i14 != 80) {
                        max2 = i10;
                    } else {
                        max2 = (i7 - i8) - childAt.getMeasuredHeight();
                        i8 += childAt.getMeasuredHeight();
                    }
                    int i15 = max + scrollX;
                    childAt.layout(i15, max2, childAt.getMeasuredWidth() + i15, max2 + childAt.getMeasuredHeight());
                    i9++;
                }
            }
        }
        int i16 = (i6 - i11) - paddingRight;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                c cVar2 = (c) childAt2.getLayoutParams();
                if (!cVar2.a && (a2 = a(childAt2)) != null) {
                    float f2 = i16;
                    int i18 = ((int) (a2.e * f2)) + i11;
                    if (cVar2.d) {
                        cVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * cVar2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - i10) - i8, 1073741824));
                    }
                    childAt2.layout(i18, i10, childAt2.getMeasuredWidth() + i18, childAt2.getMeasuredHeight() + i10);
                }
            }
        }
        this.r = i10;
        this.s = i7 - i8;
        this.W = i9;
        if (this.T) {
            z2 = false;
            a(this.c, false, 0, false);
        } else {
            z2 = false;
        }
        this.T = z2;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.n = true;
        if (!this.m.isFinished() && this.m.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.m.getCurrX();
            int currY = this.m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!d(currX)) {
                    this.m.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            hq.e(this);
            return;
        }
        a(true);
    }

    private boolean d(int i2) {
        if (this.g.size() == 0) {
            if (this.T) {
                return false;
            }
            this.V = false;
            a(0, 0.0f, 0);
            if (this.V) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        b i3 = i();
        int clientWidth = getClientWidth();
        int i4 = this.p;
        int i5 = clientWidth + i4;
        float f2 = clientWidth;
        int i6 = i3.b;
        float f3 = ((i2 / f2) - i3.e) / (i3.d + (i4 / f2));
        this.V = false;
        a(i6, f3, (int) (i5 * f3));
        if (this.V) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    protected void a(int i2, float f2, int i3) {
        int i4;
        if (this.W > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i5 = paddingRight;
            int i6 = paddingLeft;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int i8 = cVar.b & 7;
                    if (i8 == 1) {
                        i4 = i6;
                        i6 = Math.max((width - childAt.getMeasuredWidth()) / 2, i6);
                    } else if (i8 == 3) {
                        i4 = childAt.getWidth() + i6;
                    } else if (i8 != 5) {
                        i4 = i6;
                    } else {
                        int measuredWidth = (width - i5) - childAt.getMeasuredWidth();
                        i5 += childAt.getMeasuredWidth();
                        i4 = i6;
                        i6 = measuredWidth;
                    }
                    int left = (i6 + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    i6 = i4;
                }
            }
        }
        b(i2, f2, i3);
        if (this.ae != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i9 = 0; i9 < childCount2; i9++) {
                View childAt2 = getChildAt(i9);
                if (!((c) childAt2.getLayoutParams()).a) {
                    this.ae.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.V = true;
    }

    private void b(int i2, float f2, int i3) {
        f fVar = this.ab;
        if (fVar != null) {
            fVar.a(i2, f2, i3);
        }
        List<f> list = this.aa;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                f fVar2 = this.aa.get(i4);
                if (fVar2 != null) {
                    fVar2.a(i2, f2, i3);
                }
            }
        }
        f fVar3 = this.ac;
        if (fVar3 != null) {
            fVar3.a(i2, f2, i3);
        }
    }

    private void e(int i2) {
        f fVar = this.ab;
        if (fVar != null) {
            fVar.a(i2);
        }
        List<f> list = this.aa;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                f fVar2 = this.aa.get(i3);
                if (fVar2 != null) {
                    fVar2.a(i2);
                }
            }
        }
        f fVar3 = this.ac;
        if (fVar3 != null) {
            fVar3.a(i2);
        }
    }

    private void f(int i2) {
        f fVar = this.ab;
        if (fVar != null) {
            fVar.b(i2);
        }
        List<f> list = this.aa;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                f fVar2 = this.aa.get(i3);
                if (fVar2 != null) {
                    fVar2.b(i2);
                }
            }
        }
        f fVar3 = this.ac;
        if (fVar3 != null) {
            fVar3.b(i2);
        }
    }

    private void a(boolean z) {
        boolean z2 = this.al == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.m.isFinished()) {
                this.m.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.m.getCurrX();
                int currY = this.m.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        d(currX);
                    }
                }
            }
        }
        this.z = false;
        boolean z3 = z2;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = this.g.get(i2);
            if (bVar.c) {
                bVar.c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                hq.a(this, this.ak);
            } else {
                this.ak.run();
            }
        }
    }

    private boolean a(float f2, float f3) {
        return (f2 < ((float) this.E) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.E)) && f3 < 0.0f);
    }

    private void b(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            hq.a(getChildAt(i2), z ? this.af : 0, (Paint) null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            h();
            return false;
        }
        if (action != 0) {
            if (this.B) {
                return true;
            }
            if (this.C) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.I = x;
            this.G = x;
            float y = motionEvent.getY();
            this.f155J = y;
            this.H = y;
            this.K = motionEvent.getPointerId(0);
            this.C = false;
            this.n = true;
            this.m.computeScrollOffset();
            if (this.al == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.P) {
                this.m.abortAnimation();
                this.z = false;
                c();
                this.B = true;
                c(true);
                setScrollState(1);
            } else {
                a(false);
                this.B = false;
            }
        } else if (action == 2) {
            int i2 = this.K;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.G;
                float abs = Math.abs(f2);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f155J);
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i3 != 0 && !a(this.G, f2) && a(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.G = x2;
                    this.H = y2;
                    this.C = true;
                    return false;
                }
                if (abs > this.F && abs * 0.5f > abs2) {
                    this.B = true;
                    c(true);
                    setScrollState(1);
                    this.G = i3 > 0 ? this.I + this.F : this.I - this.F;
                    this.H = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > this.F) {
                    this.C = true;
                }
                if (this.B && b(x2)) {
                    hq.e(this);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        return this.B;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.xiaopeng.musicradio.commonui.widget.c cVar;
        if (this.Q) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (cVar = this.b) == null || cVar.a() == 0) {
            return false;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.m.abortAnimation();
                this.z = false;
                c();
                float x = motionEvent.getX();
                this.I = x;
                this.G = x;
                float y = motionEvent.getY();
                this.f155J = y;
                this.H = y;
                this.K = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.B) {
                    VelocityTracker velocityTracker = this.L;
                    velocityTracker.computeCurrentVelocity(1000, this.N);
                    int a2 = (int) hp.a(velocityTracker, this.K);
                    this.z = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    b i2 = i();
                    float f2 = clientWidth;
                    a(a(i2.b, ((scrollX / f2) - i2.e) / (i2.d + (this.p / f2)), a2, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.K)) - this.I)), true, true, a2);
                    z = h();
                    break;
                }
                break;
            case 2:
                if (!this.B) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.K);
                    if (findPointerIndex == -1) {
                        z = h();
                        break;
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.G);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.H);
                        if (abs > this.F && abs > abs2) {
                            this.B = true;
                            c(true);
                            float f3 = this.I;
                            this.G = x2 - f3 > 0.0f ? f3 + this.F : f3 - this.F;
                            this.H = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.B) {
                    z = false | b(motionEvent.getX(motionEvent.findPointerIndex(this.K)));
                    break;
                }
                break;
            case 3:
                if (this.B) {
                    a(this.c, true, 0, false);
                    z = h();
                    break;
                }
                break;
            case 5:
                int b2 = ha.b(motionEvent);
                this.G = motionEvent.getX(b2);
                this.K = motionEvent.getPointerId(b2);
                break;
            case 6:
                a(motionEvent);
                this.G = motionEvent.getX(motionEvent.findPointerIndex(this.K));
                break;
        }
        if (z) {
            hq.e(this);
        }
        return true;
    }

    private boolean h() {
        this.K = -1;
        j();
        return this.R.c() | this.S.c();
    }

    private void c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean b(float f2) {
        boolean z;
        float f3 = this.G - f2;
        this.G = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.t * clientWidth;
        float f5 = this.u * clientWidth;
        b bVar = this.g.get(0);
        ArrayList<b> arrayList = this.g;
        boolean z2 = true;
        b bVar2 = arrayList.get(arrayList.size() - 1);
        if (bVar.b != 0) {
            f4 = bVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.b != this.b.a() - 1) {
            f5 = bVar2.e * clientWidth;
            z2 = false;
        }
        if (scrollX < f4) {
            r4 = z ? this.R.a(Math.abs(f4 - scrollX) / clientWidth) : false;
            scrollX = f4;
        } else if (scrollX > f5) {
            r4 = z2 ? this.S.a(Math.abs(scrollX - f5) / clientWidth) : false;
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.G += scrollX - i2;
        scrollTo(i2, getScrollY());
        d(i2);
        return r4;
    }

    private b i() {
        int i2;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.p / clientWidth : 0.0f;
        b bVar = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = 0;
        int i4 = -1;
        boolean z = true;
        while (i3 < this.g.size()) {
            b bVar2 = this.g.get(i3);
            if (!z && bVar2.b != (i2 = i4 + 1)) {
                bVar2 = this.h;
                bVar2.e = f3 + f4 + f2;
                bVar2.b = i2;
                bVar2.d = this.b.d(bVar2.b);
                i3--;
            }
            f3 = bVar2.e;
            float f5 = bVar2.d + f3 + f2;
            if (!z && scrollX < f3) {
                return bVar;
            }
            if (scrollX < f5 || i3 == this.g.size() - 1) {
                return bVar2;
            }
            i4 = bVar2.b;
            f4 = bVar2.d;
            i3++;
            z = false;
            bVar = bVar2;
        }
        return bVar;
    }

    private int a(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.O || Math.abs(i3) <= this.M) {
            i2 += (int) (f2 + (i2 >= this.c ? 0.7f : 0.3f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.g.size() > 0) {
            ArrayList<b> arrayList = this.g;
            return Math.max(this.g.get(0).b, Math.min(i2, arrayList.get(arrayList.size() - 1).b));
        }
        return i2;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.xiaopeng.musicradio.commonui.widget.c cVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (cVar = this.b) != null && cVar.a() > 1)) {
            if (!this.R.a()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.t * width);
                this.R.a(height, width);
                z = false | this.R.a(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.S.a()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.u + 1.0f)) * width2);
                this.S.a(height2, width2);
                z |= this.S.a(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.R.b();
            this.S.b();
        }
        if (z) {
            hq.e(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        float f2;
        float f3;
        float f4;
        super.onDraw(canvas);
        if (this.p <= 0 || this.q == null || this.g.size() <= 0 || this.b == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f5 = this.p / width2;
        int i2 = 0;
        b bVar = this.g.get(0);
        float f6 = bVar.e;
        int size = this.g.size();
        int i3 = bVar.b;
        int i4 = this.g.get(size - 1).b;
        while (i3 < i4) {
            while (i3 > bVar.b && i2 < size) {
                i2++;
                bVar = this.g.get(i2);
            }
            if (i3 == bVar.b) {
                f3 = (bVar.e + bVar.d) * width2;
                f2 = bVar.e + bVar.d + f5;
            } else {
                float d2 = this.b.d(i3);
                f2 = f6 + d2 + f5;
                f3 = (f6 + d2) * width2;
            }
            if (this.p + f3 > scrollX) {
                f4 = f5;
                this.q.setBounds(Math.round(f3), this.r, Math.round(this.p + f3), this.s);
                this.q.draw(canvas);
            } else {
                f4 = f5;
            }
            if (f3 > scrollX + width) {
                return;
            }
            i3++;
            f6 = f2;
            f5 = f4;
        }
    }

    private void a(MotionEvent motionEvent) {
        int b2 = ha.b(motionEvent);
        if (motionEvent.getPointerId(b2) == this.K) {
            int i2 = b2 == 0 ? 1 : 0;
            this.G = motionEvent.getX(i2);
            this.K = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void j() {
        this.B = false;
        this.C = false;
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.L = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.y != z) {
            this.y = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.b == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.t)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.u));
    }

    protected boolean a(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && a(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && hq.a(view, -i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                switch (keyCode) {
                    case 21:
                        return c(17);
                    case 22:
                        return c(66);
                }
            } else if (Build.VERSION.SDK_INT >= 11) {
                if (keyEvent.hasNoModifiers()) {
                    return c(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return c(1);
                }
            }
        }
        return false;
    }

    public boolean c(int i2) {
        boolean z;
        View findFocus = findFocus();
        boolean z2 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (findNextFocus == null || findNextFocus == view) {
            if (i2 == 17 || i2 == 1) {
                z2 = d();
            } else if (i2 == 66 || i2 == 2) {
                z2 = e();
            }
        } else if (i2 == 17) {
            int i3 = a(this.i, findNextFocus).left;
            int i4 = a(this.i, view).left;
            if (view != null && i3 >= i4) {
                z2 = d();
            } else {
                z2 = findNextFocus.requestFocus();
            }
        } else if (i2 == 66) {
            int i5 = a(this.i, findNextFocus).left;
            int i6 = a(this.i, view).left;
            if (view != null && i5 <= i6) {
                z2 = e();
            } else {
                z2 = findNextFocus.requestFocus();
            }
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return z2;
    }

    private Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    boolean d() {
        int i2 = this.c;
        if (i2 > 0) {
            a(i2 - 1, true);
            return true;
        }
        return false;
    }

    boolean e() {
        com.xiaopeng.musicradio.commonui.widget.c cVar = this.b;
        if (cVar == null || this.c >= cVar.a() - 1) {
            return false;
        }
        a(this.c + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        b a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.c) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        b a2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        b a2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.c && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        b a2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends gq {
        d() {
        }

        @Override // defpackage.gq
        public void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(MusicViewPager.class.getName());
            id a = ia.a(accessibilityEvent);
            a.a(b());
            if (accessibilityEvent.getEventType() != 4096 || MusicViewPager.this.b == null) {
                return;
            }
            a.a(MusicViewPager.this.b.a());
            a.b(MusicViewPager.this.c);
            a.c(MusicViewPager.this.c);
        }

        @Override // defpackage.gq
        public void a(View view, ib ibVar) {
            super.a(view, ibVar);
            ibVar.b((CharSequence) MusicViewPager.class.getName());
            ibVar.i(b());
            if (MusicViewPager.this.canScrollHorizontally(1)) {
                ibVar.a(4096);
            }
            if (MusicViewPager.this.canScrollHorizontally(-1)) {
                ibVar.a(8192);
            }
        }

        @Override // defpackage.gq
        public boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (MusicViewPager.this.canScrollHorizontally(1)) {
                    MusicViewPager musicViewPager = MusicViewPager.this;
                    musicViewPager.setCurrentItem(musicViewPager.c + 1);
                    return true;
                }
                return false;
            } else if (i == 8192 && MusicViewPager.this.canScrollHorizontally(-1)) {
                MusicViewPager musicViewPager2 = MusicViewPager.this;
                musicViewPager2.setCurrentItem(musicViewPager2.c - 1);
                return true;
            } else {
                return false;
            }
        }

        private boolean b() {
            return MusicViewPager.this.b != null && MusicViewPager.this.b.a() > 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h extends DataSetObserver {
        h() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            MusicViewPager.this.b();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            MusicViewPager.this.b();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
        int f;

        public c() {
            super(-1, -1);
            this.c = 0.0f;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MusicViewPager.a);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i implements Comparator<View> {
        i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            c cVar = (c) view.getLayoutParams();
            c cVar2 = (c) view2.getLayoutParams();
            if (cVar.a != cVar2.a) {
                return cVar.a ? 1 : -1;
            }
            return cVar.e - cVar2.e;
        }
    }
}
