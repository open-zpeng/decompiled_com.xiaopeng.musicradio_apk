package com.to.aboomy.banner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class BannerViewPager extends ViewPager {
    private List<Integer> childCenterXAbs;
    private SparseIntArray childIndex;
    private boolean isFirstLayoutToField;
    private float lastX;
    private float lastY;
    private boolean overlapStyle;
    private int scaledTouchSlop;
    private boolean scrollable;
    private ViewPagerScroller scroller;
    private float startX;
    private float startY;

    public BannerViewPager(Context context) {
        this(context, null);
    }

    public BannerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollable = true;
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() >> 1;
        this.scroller = new ViewPagerScroller(getContext());
        initViewPagerScroll();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.scrollable) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                float rawX = motionEvent.getRawX();
                this.lastX = rawX;
                this.startX = rawX;
                float rawY = motionEvent.getRawY();
                this.lastY = rawY;
                this.startY = rawY;
            } else {
                boolean z = true;
                if (action == 2) {
                    this.lastX = motionEvent.getRawX();
                    this.lastY = motionEvent.getRawY();
                    if (this.scrollable) {
                        float abs = Math.abs(this.lastX - this.startX);
                        float abs2 = Math.abs(this.lastY - this.startY);
                        ViewParent parent = getParent();
                        if (abs <= this.scaledTouchSlop || abs <= abs2) {
                            z = false;
                        }
                        parent.requestDisallowInterceptTouchEvent(z);
                    }
                } else {
                    if (action != 3) {
                        if (action == 1) {
                        }
                    }
                    if (Math.abs(this.lastX - this.startX) <= this.scaledTouchSlop) {
                        if (Math.abs(this.lastY - this.startY) <= this.scaledTouchSlop) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            if (this.scrollable) {
                return super.onInterceptTouchEvent(motionEvent);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void setScrollable(boolean z) {
        this.scrollable = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.overlapStyle) {
            if (i2 == 0 || this.childIndex.size() != i) {
                this.childCenterXAbs.clear();
                this.childIndex.clear();
                int viewCenterX = getViewCenterX(this);
                for (int i3 = 0; i3 < i; i3++) {
                    int abs = Math.abs(viewCenterX - getViewCenterX(getChildAt(i3)));
                    if (this.childIndex.indexOfKey(abs) >= 0) {
                        abs++;
                    }
                    this.childCenterXAbs.add(Integer.valueOf(abs));
                    this.childIndex.append(abs, i3);
                }
                Collections.sort(this.childCenterXAbs);
            }
            return this.childIndex.get(this.childCenterXAbs.get((i - 1) - i2).intValue());
        }
        return super.getChildDrawingOrder(i, i2);
    }

    public void setOverlapStyle(boolean z) {
        this.overlapStyle = z;
        if (z) {
            this.childCenterXAbs = new ArrayList();
            this.childIndex = new SparseIntArray();
            return;
        }
        this.childCenterXAbs = null;
        this.childIndex = null;
    }

    private int getViewCenterX(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[0] + (view.getWidth() / 2);
    }

    private void initViewPagerScroll() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, this.scroller);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e = e2;
            e.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e = e3;
            e.printStackTrace();
        }
    }

    public void setPagerScrollDuration(int i) {
        this.scroller.setScrollDuration(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isFirstLayoutToField) {
            onAttachedToRestFirstLayout();
        } else {
            this.isFirstLayoutToField = true;
        }
    }

    public void setFirstLayoutToField(boolean z) {
        this.isFirstLayoutToField = z;
    }

    private void onAttachedToRestFirstLayout() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
            declaredField.setAccessible(true);
            declaredField.set(this, false);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }
}
