package com.xiaopeng.musicradio.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.xui.widget.XConstraintLayout;
/* loaded from: classes2.dex */
public class VuiRecyclerViewWithLoading extends BaseRecycleView {
    private LoadingTipsView a;
    private boolean b;

    public VuiRecyclerViewWithLoading(Context context) {
        super(context);
        this.b = false;
        b();
    }

    public VuiRecyclerViewWithLoading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        b();
    }

    public VuiRecyclerViewWithLoading(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        b();
    }

    private void b() {
        this.a = new LoadingTipsView(getContext());
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(40);
        setOverScrollMode(2);
    }

    public void setTipsState(int i) {
        if (i == 2) {
            this.b = true;
        } else {
            this.b = false;
        }
        LoadingTipsView loadingTipsView = this.a;
        if (loadingTipsView != null) {
            loadingTipsView.setState(i);
        }
    }

    public void setTipViewClickable(boolean z) {
        LoadingTipsView loadingTipsView = this.a;
        if (loadingTipsView != null) {
            loadingTipsView.setClickable(z);
        }
    }

    public void setNoResultText(String str) {
        LoadingTipsView loadingTipsView = this.a;
        if (loadingTipsView == null) {
            return;
        }
        loadingTipsView.setNoResultText(str);
    }

    public int getTipsState() {
        LoadingTipsView loadingTipsView = this.a;
        if (loadingTipsView == null) {
            return 0;
        }
        return loadingTipsView.getState();
    }

    public void setNoRecordTipText(int i) {
        this.a.setNoResultText(i);
    }

    public void setOnTipsViewClick(View.OnClickListener onClickListener) {
        LoadingTipsView loadingTipsView = this.a;
        if (loadingTipsView != null) {
            loadingTipsView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView, com.xiaopeng.xui.widget.XRecyclerView, com.xiaopeng.xui.vui.VuiRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (isAttachedToWindow()) {
            return;
        }
        super.onAttachedToWindow();
        LoadingTipsView loadingTipsView = this.a;
        if (loadingTipsView != null && loadingTipsView.getParent() == null) {
            a(this.a);
            this.a.setAutoClickLoadingEnable(false);
        }
        if (getAdapter() == null || getAdapter().a() == 0) {
            if (this.b) {
                setTipsState(2);
            } else {
                setTipsState(1);
            }
        }
    }

    private void a(View view) {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 17;
            viewGroup.addView(view, indexOfChild, layoutParams2);
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams3.gravity = 17;
            viewGroup.addView(view, indexOfChild, layoutParams3);
        } else if (viewGroup instanceof XConstraintLayout) {
            ConstraintLayout.a aVar = new ConstraintLayout.a(-1, -1);
            aVar.h = 0;
            aVar.k = 0;
            viewGroup.addView(view, indexOfChild, aVar);
        } else {
            viewGroup.addView(view, indexOfChild);
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            layoutParams4.height = -1;
            layoutParams4.width = -1;
            view.setLayoutParams(layoutParams4);
        }
    }
}
