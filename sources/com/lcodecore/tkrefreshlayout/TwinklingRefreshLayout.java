package com.lcodecore.tkrefreshlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.lcodecore.tkrefreshlayout.f;
/* loaded from: classes.dex */
public class TwinklingRefreshLayout extends RelativeLayout implements e, hb {
    private static String FOOTER_CLASS_NAME = "";
    private static String HEADER_CLASS_NAME = "";
    protected boolean autoLoadMore;
    private a cp;
    private aan decorator;
    protected boolean enableKeepIView;
    protected boolean enableLoadmore;
    protected boolean enableOverScroll;
    protected boolean enableRefresh;
    protected boolean floatRefresh;
    protected boolean isLoadingMore;
    protected boolean isLoadingVisible;
    protected boolean isOverScrollBottomShow;
    protected boolean isOverScrollTopShow;
    protected boolean isPureScrollModeOn;
    protected boolean isRefreshVisible;
    protected boolean isRefreshing;
    private d listener;
    private int mActivePointerId;
    private boolean mAlwaysInTapRegion;
    private float mBottomHeight;
    private FrameLayout mBottomLayout;
    private com.lcodecore.tkrefreshlayout.a mBottomView;
    private final he mChildHelper;
    private View mChildView;
    private MotionEvent mCurrentDownEvent;
    private float mDownFocusX;
    private float mDownFocusY;
    private int mExHeadHeight;
    private FrameLayout mExtraHeadLayout;
    protected float mHeadHeight;
    protected FrameLayout mHeadLayout;
    private b mHeadView;
    private boolean mIsBeingDragged;
    private float mLastFocusX;
    private float mLastFocusY;
    private int mLastTouchX;
    private int mLastTouchY;
    protected float mMaxBottomHeight;
    protected float mMaxHeadHeight;
    private int mMaximumFlingVelocity;
    private int mMinimumFlingVelocity;
    private final int[] mNestedOffsets;
    protected float mOverScrollHeight;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;
    private final int mTouchSlop;
    private int mTouchSlopSquare;
    private VelocityTracker mVelocityTracker;
    private e pullListener;
    private g refreshListener;
    protected boolean showLoadingWhenOverScroll;
    protected boolean showRefreshingWhenOverScroll;
    private float vx;
    private float vy;

    public TwinklingRefreshLayout(Context context) {
        this(context, null, 0);
    }

    public TwinklingRefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwinklingRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mExHeadHeight = 0;
        this.isRefreshVisible = false;
        this.isLoadingVisible = false;
        this.isRefreshing = false;
        this.isLoadingMore = false;
        this.enableLoadmore = true;
        this.enableRefresh = true;
        this.isOverScrollTopShow = true;
        this.isOverScrollBottomShow = true;
        this.isPureScrollModeOn = false;
        this.autoLoadMore = false;
        this.floatRefresh = false;
        this.enableOverScroll = true;
        this.enableKeepIView = true;
        this.showRefreshingWhenOverScroll = true;
        this.showLoadingWhenOverScroll = true;
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.pullListener = this;
        this.mMaximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
        this.mMinimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
        int i2 = this.mTouchSlop;
        this.mTouchSlopSquare = i2 * i2;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mNestedOffsets = new int[2];
        this.mActivePointerId = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.c.TwinklingRefreshLayout, i, 0);
        try {
            this.mMaxHeadHeight = obtainStyledAttributes.getDimensionPixelSize(f.c.TwinklingRefreshLayout_tr_max_head_height, aaq.a(context, 120.0f));
            this.mHeadHeight = obtainStyledAttributes.getDimensionPixelSize(f.c.TwinklingRefreshLayout_tr_head_height, aaq.a(context, 80.0f));
            this.mMaxBottomHeight = obtainStyledAttributes.getDimensionPixelSize(f.c.TwinklingRefreshLayout_tr_max_bottom_height, aaq.a(context, 120.0f));
            this.mBottomHeight = obtainStyledAttributes.getDimensionPixelSize(f.c.TwinklingRefreshLayout_tr_bottom_height, aaq.a(context, 60.0f));
            this.mOverScrollHeight = obtainStyledAttributes.getDimensionPixelSize(f.c.TwinklingRefreshLayout_tr_overscroll_height, (int) this.mHeadHeight);
            this.enableRefresh = obtainStyledAttributes.getBoolean(f.c.TwinklingRefreshLayout_tr_enable_refresh, true);
            this.enableLoadmore = obtainStyledAttributes.getBoolean(f.c.TwinklingRefreshLayout_tr_enable_loadmore, true);
            this.isPureScrollModeOn = obtainStyledAttributes.getBoolean(f.c.TwinklingRefreshLayout_tr_pureScrollMode_on, false);
            this.isOverScrollTopShow = obtainStyledAttributes.getBoolean(f.c.TwinklingRefreshLayout_tr_overscroll_top_show, true);
            this.isOverScrollBottomShow = obtainStyledAttributes.getBoolean(f.c.TwinklingRefreshLayout_tr_overscroll_bottom_show, true);
            this.enableOverScroll = obtainStyledAttributes.getBoolean(f.c.TwinklingRefreshLayout_tr_enable_overscroll, true);
            this.floatRefresh = obtainStyledAttributes.getBoolean(f.c.TwinklingRefreshLayout_tr_floatRefresh, false);
            this.autoLoadMore = obtainStyledAttributes.getBoolean(f.c.TwinklingRefreshLayout_tr_autoLoadMore, false);
            this.enableKeepIView = obtainStyledAttributes.getBoolean(f.c.TwinklingRefreshLayout_tr_enable_keepIView, true);
            this.showRefreshingWhenOverScroll = obtainStyledAttributes.getBoolean(f.c.TwinklingRefreshLayout_tr_showRefreshingWhenOverScroll, true);
            this.showLoadingWhenOverScroll = obtainStyledAttributes.getBoolean(f.c.TwinklingRefreshLayout_tr_showLoadingWhenOverScroll, true);
            obtainStyledAttributes.recycle();
            this.cp = new a();
            addHeader();
            addFooter();
            setFloatRefresh(this.floatRefresh);
            setAutoLoadMore(this.autoLoadMore);
            setEnableRefresh(this.enableRefresh);
            setEnableLoadmore(this.enableLoadmore);
            this.mChildHelper = new he(this);
            setNestedScrollingEnabled(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void addHeader() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 0);
        layoutParams.addRule(10);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(f.b.ex_header);
        addView(frameLayout2, new RelativeLayout.LayoutParams(-1, -2));
        addView(frameLayout, layoutParams);
        this.mExtraHeadLayout = frameLayout2;
        this.mHeadLayout = frameLayout;
        if (this.mHeadView == null) {
            if (!TextUtils.isEmpty(HEADER_CLASS_NAME)) {
                try {
                    setHeaderView((b) Class.forName(HEADER_CLASS_NAME).getDeclaredConstructor(Context.class).newInstance(getContext()));
                    return;
                } catch (Exception e) {
                    Log.e("TwinklingRefreshLayout:", "setDefaultHeader classname=" + e.getMessage());
                    setHeaderView(new aak(getContext()));
                    return;
                }
            }
            setHeaderView(new aak(getContext()));
        }
    }

    private void addFooter() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 0);
        layoutParams.addRule(12);
        frameLayout.setLayoutParams(layoutParams);
        this.mBottomLayout = frameLayout;
        addView(this.mBottomLayout);
        if (this.mBottomView == null) {
            if (!TextUtils.isEmpty(FOOTER_CLASS_NAME)) {
                try {
                    setBottomView((com.lcodecore.tkrefreshlayout.a) Class.forName(FOOTER_CLASS_NAME).getDeclaredConstructor(Context.class).newInstance(getContext()));
                    return;
                } catch (Exception e) {
                    Log.e("TwinklingRefreshLayout:", "setDefaultFooter classname=" + e.getMessage());
                    setBottomView(new aaj(getContext()));
                    return;
                }
            }
            setBottomView(new aaj(getContext()));
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.mChildView = getChildAt(3);
        this.cp.a();
        a aVar = this.cp;
        this.decorator = new aao(aVar, new aap(aVar));
        initGestureDetector();
    }

    private void initGestureDetector() {
        this.listener = new d() { // from class: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout.1
            @Override // com.lcodecore.tkrefreshlayout.d
            public void a(MotionEvent motionEvent) {
                TwinklingRefreshLayout.this.decorator.d(motionEvent);
            }

            @Override // com.lcodecore.tkrefreshlayout.d
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                TwinklingRefreshLayout.this.decorator.a(motionEvent, motionEvent2, f, f2, TwinklingRefreshLayout.this.vx, TwinklingRefreshLayout.this.vy);
            }

            @Override // com.lcodecore.tkrefreshlayout.d
            public void a(MotionEvent motionEvent, boolean z) {
                TwinklingRefreshLayout.this.decorator.a(motionEvent, z);
            }

            @Override // com.lcodecore.tkrefreshlayout.d
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                TwinklingRefreshLayout.this.decorator.a(motionEvent, motionEvent2, f, f2);
            }
        };
    }

    private void detectGesture(MotionEvent motionEvent, d dVar) {
        int action = motionEvent.getAction();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int i = action & 255;
        boolean z = true;
        boolean z2 = i == 6;
        int actionIndex = z2 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (actionIndex != i2) {
                f += motionEvent.getX(i2);
                f2 += motionEvent.getY(i2);
            }
        }
        float f3 = z2 ? pointerCount - 1 : pointerCount;
        float f4 = f / f3;
        float f5 = f2 / f3;
        switch (i) {
            case 0:
                this.mLastFocusX = f4;
                this.mDownFocusX = f4;
                this.mLastFocusY = f5;
                this.mDownFocusY = f5;
                MotionEvent motionEvent2 = this.mCurrentDownEvent;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.mCurrentDownEvent = MotionEvent.obtain(motionEvent);
                this.mAlwaysInTapRegion = true;
                dVar.a(motionEvent);
                return;
            case 1:
                int pointerId = motionEvent.getPointerId(0);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaximumFlingVelocity);
                this.vy = this.mVelocityTracker.getYVelocity(pointerId);
                this.vx = this.mVelocityTracker.getXVelocity(pointerId);
                if (Math.abs(this.vy) > this.mMinimumFlingVelocity || Math.abs(this.vx) > this.mMinimumFlingVelocity) {
                    dVar.b(this.mCurrentDownEvent, motionEvent, this.vx, this.vy);
                } else {
                    z = false;
                }
                dVar.a(motionEvent, z);
                VelocityTracker velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.mVelocityTracker = null;
                    return;
                }
                return;
            case 2:
                float f6 = this.mLastFocusX - f4;
                float f7 = this.mLastFocusY - f5;
                if (this.mAlwaysInTapRegion) {
                    int i3 = (int) (f4 - this.mDownFocusX);
                    int i4 = (int) (f5 - this.mDownFocusY);
                    if ((i3 * i3) + (i4 * i4) > this.mTouchSlopSquare) {
                        dVar.a(this.mCurrentDownEvent, motionEvent, f6, f7);
                        this.mLastFocusX = f4;
                        this.mLastFocusY = f5;
                        this.mAlwaysInTapRegion = false;
                        return;
                    }
                    return;
                } else if (Math.abs(f6) >= 1.0f || Math.abs(f7) >= 1.0f) {
                    dVar.a(this.mCurrentDownEvent, motionEvent, f6, f7);
                    this.mLastFocusX = f4;
                    this.mLastFocusY = f5;
                    return;
                } else {
                    return;
                }
            case 3:
                this.mAlwaysInTapRegion = false;
                VelocityTracker velocityTracker2 = this.mVelocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.mVelocityTracker = null;
                    return;
                }
                return;
            case 4:
            default:
                return;
            case 5:
                this.mLastFocusX = f4;
                this.mDownFocusX = f4;
                this.mLastFocusY = f5;
                this.mDownFocusY = f5;
                return;
            case 6:
                this.mLastFocusX = f4;
                this.mDownFocusX = f4;
                this.mLastFocusY = f5;
                this.mDownFocusY = f5;
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaximumFlingVelocity);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity = this.mVelocityTracker.getXVelocity(pointerId2);
                float yVelocity = this.mVelocityTracker.getYVelocity(pointerId2);
                for (int i5 = 0; i5 < pointerCount; i5++) {
                    if (i5 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i5);
                        if ((this.mVelocityTracker.getXVelocity(pointerId3) * xVelocity) + (this.mVelocityTracker.getYVelocity(pointerId3) * yVelocity) < 0.0f) {
                            this.mVelocityTracker.clear();
                            return;
                        }
                    }
                }
                return;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean a2 = this.decorator.a(motionEvent);
        detectGesture(motionEvent, this.listener);
        detectNestedScroll(motionEvent);
        return a2;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.decorator.b(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.decorator.c(motionEvent) || super.onTouchEvent(motionEvent);
    }

    private boolean detectNestedScroll(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int a2 = ha.a(motionEvent);
        int b = ha.b(motionEvent);
        if (a2 == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.mNestedOffsets;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (a2 != 5) {
            switch (a2) {
                case 0:
                    this.mActivePointerId = motionEvent.getPointerId(0);
                    this.mLastTouchX = (int) motionEvent.getX();
                    this.mLastTouchY = (int) motionEvent.getY();
                    startNestedScroll(2);
                    break;
                case 1:
                case 3:
                    stopNestedScroll();
                    this.mIsBeingDragged = false;
                    this.mActivePointerId = -1;
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex < 0) {
                        Log.e("TwinklingRefreshLayout", "Error processing scroll; pointer index for id " + this.mActivePointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int x = this.mLastTouchX - ((int) motionEvent.getX(findPointerIndex));
                    int i = this.mLastTouchY - y;
                    if (dispatchNestedPreScroll(x, i, this.mScrollConsumed, this.mScrollOffset)) {
                        int[] iArr3 = this.mScrollConsumed;
                        int i2 = iArr3[0];
                        i -= iArr3[1];
                        int[] iArr4 = this.mScrollOffset;
                        obtain.offsetLocation(iArr4[0], iArr4[1]);
                        int[] iArr5 = this.mNestedOffsets;
                        int i3 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i3 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                    }
                    if (!this.mIsBeingDragged && Math.abs(i) > this.mTouchSlop) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.mIsBeingDragged = true;
                        if (i > 0) {
                            i -= this.mTouchSlop;
                        } else {
                            i += this.mTouchSlop;
                        }
                    }
                    if (this.mIsBeingDragged) {
                        int[] iArr7 = this.mScrollOffset;
                        this.mLastTouchY = y - iArr7[1];
                        if (dispatchNestedScroll(0, 0, 0, i + 0, iArr7)) {
                            int i4 = this.mLastTouchX;
                            int[] iArr8 = this.mScrollOffset;
                            this.mLastTouchX = i4 - iArr8[0];
                            this.mLastTouchY -= iArr8[1];
                            obtain.offsetLocation(iArr8[0], iArr8[1]);
                            int[] iArr9 = this.mNestedOffsets;
                            int i5 = iArr9[0];
                            int[] iArr10 = this.mScrollOffset;
                            iArr9[0] = i5 + iArr10[0];
                            iArr9[1] = iArr9[1] + iArr10[1];
                            break;
                        }
                    }
                    break;
            }
        } else {
            this.mActivePointerId = motionEvent.getPointerId(b);
            this.mLastTouchX = (int) motionEvent.getX(b);
            this.mLastTouchY = (int) motionEvent.getY(b);
        }
        obtain.recycle();
        return true;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.mChildHelper.a(z);
    }

    @Override // android.view.View, defpackage.hb
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.a();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.mChildHelper.b(i);
    }

    @Override // android.view.View, defpackage.hb
    public void stopNestedScroll() {
        this.mChildHelper.c();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.mChildHelper.b();
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.mChildHelper.a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.mChildHelper.a(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mChildHelper.a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.mChildHelper.a(f, f2);
    }

    public static void setDefaultHeader(String str) {
        HEADER_CLASS_NAME = str;
    }

    public static void setDefaultFooter(String str) {
        FOOTER_CLASS_NAME = str;
    }

    public void startRefresh() {
        this.cp.u();
    }

    public void startLoadMore() {
        this.cp.v();
    }

    public void finishRefreshing() {
        this.cp.w();
    }

    public void finishLoadmore() {
        this.cp.y();
    }

    public void setTargetView(View view) {
        if (view != null) {
            this.mChildView = view;
        }
    }

    public void setDecorator(aan aanVar) {
        if (aanVar != null) {
            this.decorator = aanVar;
        }
    }

    public void setHeaderView(b bVar) {
        if (bVar != null) {
            this.mHeadLayout.removeAllViewsInLayout();
            this.mHeadLayout.addView(bVar.getView());
            this.mHeadView = bVar;
        }
    }

    @Deprecated
    public void addFixedExHeader(View view) {
        FrameLayout frameLayout;
        if (view == null || (frameLayout = this.mExtraHeadLayout) == null) {
            return;
        }
        frameLayout.addView(view);
        this.mExtraHeadLayout.bringToFront();
        if (this.floatRefresh) {
            this.mHeadLayout.bringToFront();
        }
        this.cp.t();
        this.cp.r();
    }

    public View getExtraHeaderView() {
        return this.mExtraHeadLayout;
    }

    public void setBottomView(com.lcodecore.tkrefreshlayout.a aVar) {
        if (aVar != null) {
            this.mBottomLayout.removeAllViewsInLayout();
            this.mBottomLayout.addView(aVar.getView());
            this.mBottomView = aVar;
        }
    }

    public void setFloatRefresh(boolean z) {
        this.floatRefresh = z;
        if (this.floatRefresh) {
            post(new Runnable() { // from class: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    if (TwinklingRefreshLayout.this.mHeadLayout != null) {
                        TwinklingRefreshLayout.this.mHeadLayout.bringToFront();
                    }
                }
            });
        }
    }

    public void setMaxHeadHeight(float f) {
        this.mMaxHeadHeight = aaq.a(getContext(), f);
    }

    public void setHeaderHeight(float f) {
        this.mHeadHeight = aaq.a(getContext(), f);
    }

    public void setMaxBottomHeight(float f) {
        this.mMaxBottomHeight = aaq.a(getContext(), f);
    }

    public void setBottomHeight(float f) {
        this.mBottomHeight = aaq.a(getContext(), f);
    }

    public void setEnableLoadmore(boolean z) {
        this.enableLoadmore = z;
        com.lcodecore.tkrefreshlayout.a aVar = this.mBottomView;
        if (aVar != null) {
            if (this.enableLoadmore) {
                aVar.getView().setVisibility(0);
            } else {
                aVar.getView().setVisibility(8);
            }
        }
    }

    public void setEnableRefresh(boolean z) {
        this.enableRefresh = z;
        b bVar = this.mHeadView;
        if (bVar != null) {
            if (this.enableRefresh) {
                bVar.getView().setVisibility(0);
            } else {
                bVar.getView().setVisibility(8);
            }
        }
    }

    public void setOverScrollTopShow(boolean z) {
        this.isOverScrollTopShow = z;
    }

    public void setOverScrollBottomShow(boolean z) {
        this.isOverScrollBottomShow = z;
    }

    public void setOverScrollRefreshShow(boolean z) {
        this.isOverScrollTopShow = z;
        this.isOverScrollBottomShow = z;
    }

    public void setEnableOverScroll(boolean z) {
        this.enableOverScroll = z;
    }

    public void setPureScrollModeOn() {
        this.isPureScrollModeOn = true;
        this.isOverScrollTopShow = false;
        this.isOverScrollBottomShow = false;
        setMaxHeadHeight(this.mOverScrollHeight);
        setHeaderHeight(this.mOverScrollHeight);
        setMaxBottomHeight(this.mOverScrollHeight);
        setBottomHeight(this.mOverScrollHeight);
    }

    public void setOverScrollHeight(float f) {
        this.mOverScrollHeight = aaq.a(getContext(), f);
    }

    public void setAutoLoadMore(boolean z) {
        this.autoLoadMore = z;
        if (this.autoLoadMore) {
            setEnableLoadmore(true);
        }
    }

    public void showRefreshingWhenOverScroll(boolean z) {
        this.showRefreshingWhenOverScroll = z;
    }

    public void showLoadingWhenOverScroll(boolean z) {
        this.showLoadingWhenOverScroll = z;
    }

    public void setEnableKeepIView(boolean z) {
        this.enableKeepIView = z;
    }

    public void setOnRefreshListener(g gVar) {
        if (gVar != null) {
            this.refreshListener = gVar;
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.e
    public void onPullingDown(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        g gVar;
        this.mHeadView.a(f, this.mMaxHeadHeight, this.mHeadHeight);
        if (this.enableRefresh && (gVar = this.refreshListener) != null) {
            gVar.onPullingDown(twinklingRefreshLayout, f);
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.e
    public void onPullingUp(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        g gVar;
        this.mBottomView.a(f, this.mMaxHeadHeight, this.mHeadHeight);
        if (this.enableLoadmore && (gVar = this.refreshListener) != null) {
            gVar.onPullingUp(twinklingRefreshLayout, f);
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.e
    public void onPullDownReleasing(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        g gVar;
        this.mHeadView.b(f, this.mMaxHeadHeight, this.mHeadHeight);
        if (this.enableRefresh && (gVar = this.refreshListener) != null) {
            gVar.onPullDownReleasing(twinklingRefreshLayout, f);
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.e
    public void onPullUpReleasing(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        g gVar;
        this.mBottomView.b(f, this.mMaxBottomHeight, this.mBottomHeight);
        if (this.enableLoadmore && (gVar = this.refreshListener) != null) {
            gVar.onPullUpReleasing(twinklingRefreshLayout, f);
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.e
    public void onRefresh(TwinklingRefreshLayout twinklingRefreshLayout) {
        this.mHeadView.a(this.mMaxHeadHeight, this.mHeadHeight);
        g gVar = this.refreshListener;
        if (gVar != null) {
            gVar.onRefresh(twinklingRefreshLayout);
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.e
    public void onLoadMore(TwinklingRefreshLayout twinklingRefreshLayout) {
        this.mBottomView.a(this.mMaxBottomHeight, this.mBottomHeight);
        g gVar = this.refreshListener;
        if (gVar != null) {
            gVar.onLoadMore(twinklingRefreshLayout);
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.e
    public void onFinishRefresh() {
        g gVar = this.refreshListener;
        if (gVar != null) {
            gVar.onFinishRefresh();
        }
        if (this.cp.c() || this.cp.H()) {
            this.mHeadView.a(new c() { // from class: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout.3
                @Override // com.lcodecore.tkrefreshlayout.c
                public void a() {
                    TwinklingRefreshLayout.this.cp.x();
                }
            });
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.e
    public void onFinishLoadMore() {
        g gVar = this.refreshListener;
        if (gVar != null) {
            gVar.onFinishLoadMore();
        }
        if (this.cp.c() || this.cp.I()) {
            this.mBottomView.a();
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.e
    public void onRefreshCanceled() {
        g gVar = this.refreshListener;
        if (gVar != null) {
            gVar.onRefreshCanceled();
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.e
    public void onLoadmoreCanceled() {
        g gVar = this.refreshListener;
        if (gVar != null) {
            gVar.onLoadmoreCanceled();
        }
    }

    /* loaded from: classes.dex */
    public class a {
        private int c = 0;
        private int d = 0;
        private boolean e = true;
        private boolean f = false;
        private boolean g = false;
        private aal b = new aal(this);

        public a() {
        }

        public void a() {
            if (TwinklingRefreshLayout.this.isPureScrollModeOn) {
                TwinklingRefreshLayout.this.setOverScrollTopShow(false);
                TwinklingRefreshLayout.this.setOverScrollBottomShow(false);
                if (TwinklingRefreshLayout.this.mHeadLayout != null) {
                    TwinklingRefreshLayout.this.mHeadLayout.setVisibility(8);
                }
                if (TwinklingRefreshLayout.this.mBottomLayout != null) {
                    TwinklingRefreshLayout.this.mBottomLayout.setVisibility(8);
                }
            }
        }

        public aal b() {
            return this.b;
        }

        public boolean c() {
            return TwinklingRefreshLayout.this.enableKeepIView;
        }

        public boolean d() {
            return TwinklingRefreshLayout.this.showRefreshingWhenOverScroll;
        }

        public boolean e() {
            return TwinklingRefreshLayout.this.showLoadingWhenOverScroll;
        }

        public float f() {
            return TwinklingRefreshLayout.this.mMaxHeadHeight;
        }

        public int g() {
            return (int) TwinklingRefreshLayout.this.mHeadHeight;
        }

        public int h() {
            return (int) TwinklingRefreshLayout.this.mMaxBottomHeight;
        }

        public int i() {
            return (int) TwinklingRefreshLayout.this.mBottomHeight;
        }

        public int j() {
            return (int) TwinklingRefreshLayout.this.mOverScrollHeight;
        }

        public View k() {
            return TwinklingRefreshLayout.this.mChildView;
        }

        public View l() {
            return TwinklingRefreshLayout.this.mHeadLayout;
        }

        public View m() {
            return TwinklingRefreshLayout.this.mBottomLayout;
        }

        public int n() {
            return TwinklingRefreshLayout.this.mTouchSlop;
        }

        public void o() {
            if (TwinklingRefreshLayout.this.mHeadView != null) {
                TwinklingRefreshLayout.this.mHeadView.a();
            }
        }

        public void p() {
            if (TwinklingRefreshLayout.this.mBottomView != null) {
                TwinklingRefreshLayout.this.mBottomView.b();
            }
        }

        public View q() {
            return TwinklingRefreshLayout.this.mExtraHeadLayout;
        }

        public void r() {
            this.d = 1;
        }

        public boolean s() {
            return this.e;
        }

        public void t() {
            this.e = false;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) TwinklingRefreshLayout.this.mChildView.getLayoutParams();
            layoutParams.addRule(3, TwinklingRefreshLayout.this.mExtraHeadLayout.getId());
            TwinklingRefreshLayout.this.mChildView.setLayoutParams(layoutParams);
            TwinklingRefreshLayout.this.requestLayout();
        }

        public void u() {
            TwinklingRefreshLayout.this.post(new Runnable() { // from class: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout.a.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.U();
                    if (TwinklingRefreshLayout.this.isPureScrollModeOn || TwinklingRefreshLayout.this.mChildView == null) {
                        return;
                    }
                    a.this.c(true);
                    a.this.b.c();
                }
            });
        }

        public void v() {
            TwinklingRefreshLayout.this.post(new Runnable() { // from class: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout.a.2
                @Override // java.lang.Runnable
                public void run() {
                    a.this.V();
                    if (TwinklingRefreshLayout.this.isPureScrollModeOn || TwinklingRefreshLayout.this.mChildView == null) {
                        return;
                    }
                    a.this.d(true);
                    a.this.b.d();
                }
            });
        }

        public void w() {
            Q();
        }

        public void x() {
            if (TwinklingRefreshLayout.this.mChildView != null) {
                this.b.a(true);
            }
        }

        public void y() {
            R();
            if (TwinklingRefreshLayout.this.mChildView != null) {
                this.b.b(true);
            }
        }

        public boolean z() {
            return TwinklingRefreshLayout.this.enableOverScroll;
        }

        public boolean A() {
            return TwinklingRefreshLayout.this.enableRefresh || TwinklingRefreshLayout.this.enableOverScroll;
        }

        public boolean B() {
            return TwinklingRefreshLayout.this.enableLoadmore || TwinklingRefreshLayout.this.enableOverScroll;
        }

        public boolean C() {
            return TwinklingRefreshLayout.this.enableRefresh;
        }

        public boolean D() {
            return TwinklingRefreshLayout.this.enableLoadmore;
        }

        public boolean E() {
            return (TwinklingRefreshLayout.this.isRefreshVisible || TwinklingRefreshLayout.this.isLoadingVisible) ? false : true;
        }

        public boolean F() {
            return TwinklingRefreshLayout.this.isRefreshVisible;
        }

        public boolean G() {
            return TwinklingRefreshLayout.this.isLoadingVisible;
        }

        public void a(boolean z) {
            TwinklingRefreshLayout.this.isRefreshVisible = z;
        }

        public void b(boolean z) {
            TwinklingRefreshLayout.this.isLoadingVisible = z;
        }

        public void c(boolean z) {
            TwinklingRefreshLayout.this.isRefreshing = z;
        }

        public boolean H() {
            return TwinklingRefreshLayout.this.isRefreshing;
        }

        public boolean I() {
            return TwinklingRefreshLayout.this.isLoadingMore;
        }

        public void d(boolean z) {
            TwinklingRefreshLayout.this.isLoadingMore = z;
        }

        public boolean J() {
            return TwinklingRefreshLayout.this.floatRefresh;
        }

        public boolean K() {
            return TwinklingRefreshLayout.this.autoLoadMore;
        }

        public boolean L() {
            return TwinklingRefreshLayout.this.isPureScrollModeOn;
        }

        public boolean M() {
            return TwinklingRefreshLayout.this.isOverScrollTopShow;
        }

        public boolean N() {
            return TwinklingRefreshLayout.this.isOverScrollBottomShow;
        }

        public void a(float f) {
            e eVar = TwinklingRefreshLayout.this.pullListener;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            eVar.onPullingDown(twinklingRefreshLayout, f / twinklingRefreshLayout.mHeadHeight);
        }

        public void b(float f) {
            e eVar = TwinklingRefreshLayout.this.pullListener;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            eVar.onPullingUp(twinklingRefreshLayout, f / twinklingRefreshLayout.mBottomHeight);
        }

        public void O() {
            TwinklingRefreshLayout.this.pullListener.onRefresh(TwinklingRefreshLayout.this);
        }

        public void P() {
            TwinklingRefreshLayout.this.pullListener.onLoadMore(TwinklingRefreshLayout.this);
        }

        public void Q() {
            TwinklingRefreshLayout.this.pullListener.onFinishRefresh();
        }

        public void R() {
            TwinklingRefreshLayout.this.pullListener.onFinishLoadMore();
        }

        public void c(float f) {
            e eVar = TwinklingRefreshLayout.this.pullListener;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            eVar.onPullDownReleasing(twinklingRefreshLayout, f / twinklingRefreshLayout.mHeadHeight);
        }

        public void d(float f) {
            e eVar = TwinklingRefreshLayout.this.pullListener;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            eVar.onPullUpReleasing(twinklingRefreshLayout, f / twinklingRefreshLayout.mBottomHeight);
        }

        public boolean a(MotionEvent motionEvent) {
            return TwinklingRefreshLayout.super.dispatchTouchEvent(motionEvent);
        }

        public void S() {
            TwinklingRefreshLayout.this.pullListener.onRefreshCanceled();
        }

        public void T() {
            TwinklingRefreshLayout.this.pullListener.onLoadmoreCanceled();
        }

        public void U() {
            this.c = 0;
        }

        public void V() {
            this.c = 1;
        }

        public boolean W() {
            return this.c == 0;
        }

        public boolean X() {
            return 1 == this.c;
        }

        public boolean Y() {
            return this.f;
        }

        public boolean Z() {
            return this.g;
        }

        public void e(boolean z) {
            this.f = z;
        }

        public void f(boolean z) {
            this.g = z;
        }
    }
}
