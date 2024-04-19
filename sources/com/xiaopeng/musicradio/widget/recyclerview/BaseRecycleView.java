package com.xiaopeng.musicradio.widget.recyclerview;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.xui.widget.XRecyclerView;
/* loaded from: classes2.dex */
public class BaseRecycleView extends XRecyclerView {
    private int a;
    private RequestManager b;
    private boolean c;
    private boolean d;
    private k e;
    private int f;
    RecyclerView.m z;

    public BaseRecycleView(Context context) {
        super(context);
        b();
    }

    public BaseRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public BaseRecycleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        if (a(getContext())) {
            return;
        }
        this.b = Glide.with(getContext());
    }

    public void a() {
        this.z = new RecyclerView.m() { // from class: com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView.1
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                switch (i) {
                    case 0:
                        if (BaseRecycleView.this.c) {
                            BaseRecycleView.this.c = false;
                            BaseRecycleView.this.c();
                            return;
                        }
                        return;
                    case 1:
                        if (BaseRecycleView.this.c) {
                            BaseRecycleView.this.c = false;
                            BaseRecycleView.this.c();
                            return;
                        }
                        return;
                    case 2:
                        if (BaseRecycleView.this.a >= 60 && !BaseRecycleView.this.c) {
                            BaseRecycleView.this.c = true;
                            BaseRecycleView baseRecycleView = BaseRecycleView.this;
                            if (!baseRecycleView.a(baseRecycleView.getContext()) && BaseRecycleView.this.b != null) {
                                BaseRecycleView.this.b.pauseRequests();
                            }
                        }
                        if (BaseRecycleView.this.a > 20 || !BaseRecycleView.this.c) {
                            return;
                        }
                        BaseRecycleView.this.c = false;
                        BaseRecycleView.this.c();
                        return;
                    default:
                        return;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                BaseRecycleView.this.a = Math.abs(i2);
                if (BaseRecycleView.this.a <= 20 && BaseRecycleView.this.c) {
                    BaseRecycleView.this.c = false;
                    BaseRecycleView.this.c();
                }
                if ((BaseRecycleView.b(recyclerView) || BaseRecycleView.this.a(recyclerView)) && BaseRecycleView.this.c) {
                    LogUtils.i("BaseRecycleView", "to top or bottom");
                    BaseRecycleView.this.c = false;
                    BaseRecycleView.this.c();
                }
            }
        };
        addOnScrollListener(this.z);
    }

    protected boolean a(RecyclerView recyclerView) {
        return recyclerView != null && recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange();
    }

    protected static boolean b(RecyclerView recyclerView) {
        return recyclerView != null && recyclerView.computeVerticalScrollOffset() == 0;
    }

    public void c(int i) {
        if (getLayoutManager() != null) {
            Log.i("BaseRecycleView", "smoothMoveToPosition: ===== " + i);
            if (this.e == null) {
                this.e = new k(getContext());
            }
            this.e.setTargetPosition(i);
            getLayoutManager().a(this.e);
        }
    }

    public void d(int i) {
        a(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final int i2) {
        if (i == -1 || getScrollState() != 0) {
            Log.i("BaseRecycleView", "smoothMoveToPosition: position = " + i + " state = " + getScrollState() + " tryCount = " + i2);
        } else if (getLayoutManager() != null && (getLayoutManager() instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
            if (linearLayoutManager.q() <= i && linearLayoutManager.s() >= i) {
                Log.i("BaseRecycleView", "smoothMoveToPosition: showing=========");
                if (i2 < 3) {
                    post(new Runnable() { // from class: com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView.2
                        @Override // java.lang.Runnable
                        public void run() {
                            BaseRecycleView.this.a(i, i2 + 1);
                        }
                    });
                }
            } else if (i < 0 || i >= getAdapter().a()) {
            } else {
                this.f = i;
                scrollToPosition(i);
                ((LinearLayoutManager) getLayoutManager()).b(i, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        return ((context instanceof Activity) && ((Activity) context).isDestroyed()) || context.isDeviceProtectedStorage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        RequestManager requestManager;
        if (a(getContext()) || this.d || (requestManager = this.b) == null) {
            return;
        }
        requestManager.resumeRequests();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XRecyclerView, com.xiaopeng.xui.vui.VuiRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = false;
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XRecyclerView, com.xiaopeng.xui.vui.VuiRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = true;
        removeOnScrollListener(this.z);
        this.z = null;
    }
}
