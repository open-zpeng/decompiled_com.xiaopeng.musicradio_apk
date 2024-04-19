package com.xiaopeng.musicradio.widget.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.lib.libview.observablescrollview.ObservableRecyclerView;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
/* loaded from: classes2.dex */
public class EmptyRecyclerView extends bel {
    private boolean c;
    private LoadingTipsView d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private boolean i;
    private final RecyclerView.c j;
    private int k;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof AbsSavedState) {
            a(parcelable);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
        if (aw.b(this, "mChildrenHeights") == null) {
            aw.a(this, "mChildrenHeights", new SparseIntArray());
        }
    }

    private void a(Parcelable parcelable) {
        Class<?>[] declaredClasses;
        Class<?> cls = null;
        for (Class<?> cls2 : ObservableRecyclerView.class.getDeclaredClasses()) {
            if (Parcelable.class.isAssignableFrom(cls2) && Modifier.toString(cls2.getModifiers()).contains("static")) {
                LogUtils.i("EmptyRecyclerView", "dstClass find!");
                cls = cls2;
            }
        }
        if (cls != null) {
            try {
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                Parcelable parcelable2 = (Parcelable) declaredConstructor.newInstance(new Object[0]);
                aw.a(parcelable2, "superState", parcelable);
                super.onRestoreInstanceState(parcelable2);
                return;
            } catch (Exception unused) {
                LogUtils.i("EmptyRecyclerView", "new instance failed!");
                return;
            }
        }
        LogUtils.i("EmptyRecyclerView", "dstClass not found!!");
    }

    public EmptyRecyclerView(Context context) {
        super(context);
        this.c = true;
        this.e = false;
        this.f = true;
        this.i = false;
        this.j = new RecyclerView.c() { // from class: com.xiaopeng.musicradio.widget.recyclerview.EmptyRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onChanged() {
                EmptyRecyclerView.this.a();
                EmptyRecyclerView.this.e = true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeInserted(int i, int i2) {
                EmptyRecyclerView.this.a();
                EmptyRecyclerView.this.e = true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeRemoved(int i, int i2) {
                EmptyRecyclerView.this.a();
                EmptyRecyclerView.this.e = true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeMoved(int i, int i2, int i3) {
                EmptyRecyclerView.this.a();
                EmptyRecyclerView.this.e = true;
            }
        };
        a((AttributeSet) null);
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = true;
        this.e = false;
        this.f = true;
        this.i = false;
        this.j = new RecyclerView.c() { // from class: com.xiaopeng.musicradio.widget.recyclerview.EmptyRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onChanged() {
                EmptyRecyclerView.this.a();
                EmptyRecyclerView.this.e = true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeInserted(int i, int i2) {
                EmptyRecyclerView.this.a();
                EmptyRecyclerView.this.e = true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeRemoved(int i, int i2) {
                EmptyRecyclerView.this.a();
                EmptyRecyclerView.this.e = true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeMoved(int i, int i2, int i3) {
                EmptyRecyclerView.this.a();
                EmptyRecyclerView.this.e = true;
            }
        };
        a(attributeSet);
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        this.e = false;
        this.f = true;
        this.i = false;
        this.j = new RecyclerView.c() { // from class: com.xiaopeng.musicradio.widget.recyclerview.EmptyRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onChanged() {
                EmptyRecyclerView.this.a();
                EmptyRecyclerView.this.e = true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeInserted(int i2, int i22) {
                EmptyRecyclerView.this.a();
                EmptyRecyclerView.this.e = true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeRemoved(int i2, int i22) {
                EmptyRecyclerView.this.a();
                EmptyRecyclerView.this.e = true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeMoved(int i2, int i22, int i3) {
                EmptyRecyclerView.this.a();
                EmptyRecyclerView.this.e = true;
            }
        };
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{f.b.defaultLoadingTips});
        try {
            String string = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, f.j.EmptyRecyclerView, f.b.defaultLoadingTips, 0);
            try {
                this.g = obtainStyledAttributes2.getDimensionPixelOffset(f.j.EmptyRecyclerView_tip_margin_bottom, 0);
                this.h = obtainStyledAttributes2.getDimensionPixelOffset(f.j.EmptyRecyclerView_tip_margin_top, 0);
                if (obtainStyledAttributes2.hasValue(f.j.EmptyRecyclerView_tip_view_class)) {
                    string = obtainStyledAttributes2.getString(f.j.EmptyRecyclerView_tip_view_class);
                }
                obtainStyledAttributes2.recycle();
                if (!TextUtils.isEmpty(string)) {
                    try {
                        Class<?> cls = Class.forName(string);
                        if (LoadingTipsView.class == cls) {
                            this.d = (LoadingTipsView) cls.getConstructor(Context.class, AttributeSet.class).newInstance(getContext(), attributeSet);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                setItemAnimator(null);
                setVerticalFadingEdgeEnabled(true);
                setFadingEdgeLength(40);
                setVuiLayoutLoadable(true);
                setVuiMode(bij.NORMAL);
            } catch (Throwable th) {
                obtainStyledAttributes2.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void a() {
        if (getAdapter() != null) {
            if (!this.e && !this.f) {
                setTipsState(d() ? 1 : 0);
            } else if (this.i) {
                if (this.e) {
                    ak.a(getContext(), getResources().getString(f.h.common_tips_network_error));
                } else {
                    setTipsState(2);
                }
            } else {
                setTipsState(d() ? 3 : 0);
            }
            this.f = false;
        }
    }

    public void setNoResultText(String str) {
        LoadingTipsView loadingTipsView = this.d;
        if (loadingTipsView == null) {
            return;
        }
        loadingTipsView.setNoResultText(str);
    }

    public void setTipsState(int i) {
        if (i == 2) {
            this.i = true;
        } else {
            this.i = false;
        }
        LoadingTipsView loadingTipsView = this.d;
        if (loadingTipsView != null) {
            loadingTipsView.setState(i);
        }
    }

    public int getTipsState() {
        LoadingTipsView loadingTipsView = this.d;
        if (loadingTipsView == null) {
            return 0;
        }
        return loadingTipsView.getState();
    }

    @Override // defpackage.bel, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.a aVar) {
        RecyclerView.a adapter = getAdapter();
        if (adapter != null) {
            adapter.b(this.j);
        }
        super.setAdapter(aVar);
        if (aVar != null) {
            aVar.a(this.j);
        }
        c();
    }

    public void setOnTipsViewClick(View.OnClickListener onClickListener) {
        LoadingTipsView loadingTipsView = this.d;
        if (loadingTipsView != null) {
            loadingTipsView.setOnClickListener(onClickListener);
        }
    }

    public void setTipViewClickable(boolean z) {
        LoadingTipsView loadingTipsView = this.d;
        if (loadingTipsView != null) {
            loadingTipsView.setClickable(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bel, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (isAttachedToWindow()) {
            return;
        }
        super.onAttachedToWindow();
        LoadingTipsView loadingTipsView = this.d;
        if (loadingTipsView != null && loadingTipsView.getParent() == null) {
            a(this.d);
        }
        c();
    }

    private void c() {
        if (getAdapter() != null) {
            if (!d()) {
                setTipsState(0);
                return;
            } else if (this.e) {
                setTipsState(3);
                return;
            } else {
                setTipsState(1);
                return;
            }
        }
        setTipsState(1);
    }

    private boolean d() {
        if (getAdapter() == null) {
            return false;
        }
        if (getAdapter() instanceof f) {
            return ((f) getAdapter()).j();
        }
        return getAdapter().a() == 0;
    }

    private void a(View view) {
        ViewGroup viewGroup = (ViewGroup) getParent();
        viewGroup.indexOfChild(this);
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            layoutParams.bottomMargin = this.g;
            layoutParams.topMargin = this.h;
            viewGroup.addView(view, layoutParams);
        } else if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 17;
            layoutParams2.bottomMargin = this.g;
            layoutParams2.topMargin = this.h;
            viewGroup.addView(view, layoutParams2);
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams3.gravity = 17;
            layoutParams3.bottomMargin = this.g;
            layoutParams3.topMargin = this.h;
            viewGroup.addView(view, layoutParams3);
        } else {
            viewGroup.addView(view);
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            layoutParams4.height = -1;
            layoutParams4.width = -1;
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams.bottomMargin = this.g;
                marginLayoutParams.topMargin = this.h;
            }
            view.setLayoutParams(layoutParams4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = getScrollState() == 2;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 0 && z) {
            getParent().requestDisallowInterceptTouchEvent(false);
            if (!canScrollVertically(-1) || !canScrollVertically(1)) {
                stopScroll();
                return false;
            }
        }
        return onInterceptTouchEvent;
    }

    public void setAutoClickLoadingEnable(boolean z) {
        this.d.setAutoClickLoadingEnable(z);
    }

    public void a(int i) {
        a(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final int i2) {
        if (i == -1 || getScrollState() != 0) {
            Log.i("EmptyRecyclerView", "smoothMoveToPosition: position = " + i + " state = " + getScrollState() + " tryCount = " + i2);
        } else if (getLayoutManager() != null && (getLayoutManager() instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
            if (linearLayoutManager.q() <= i && linearLayoutManager.s() >= i) {
                Log.i("EmptyRecyclerView", "smoothMoveToPosition: showing=========");
                if (i2 < 3) {
                    post(new Runnable() { // from class: com.xiaopeng.musicradio.widget.recyclerview.EmptyRecyclerView.2
                        @Override // java.lang.Runnable
                        public void run() {
                            EmptyRecyclerView.this.a(i, i2 + 1);
                        }
                    });
                }
            } else if (i < 0 || i >= getAdapter().a()) {
            } else {
                this.k = i;
                scrollToPosition(i);
                ((LinearLayoutManager) getLayoutManager()).b(i, 0);
            }
        }
    }
}
