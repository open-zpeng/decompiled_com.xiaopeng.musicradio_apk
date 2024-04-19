package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XTextView;
/* loaded from: classes2.dex */
public class LoadingTipsView extends XLinearLayout {
    protected int a;
    protected XImageView b;
    protected XImageView c;
    protected XLoading d;
    protected XLinearLayout e;
    protected XTextView f;
    protected boolean g;
    protected String h;
    protected String i;
    protected String j;

    public LoadingTipsView(Context context) {
        this(context, null);
    }

    public LoadingTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.b.loadingTipsStyle);
    }

    public LoadingTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
        this.g = true;
        this.h = "";
        this.i = "";
        this.j = "";
        a(attributeSet);
    }

    public int getContentViewId() {
        return f.g.layout_loading_tips_sub_view;
    }

    private void a(AttributeSet attributeSet) {
        this.e = (XLinearLayout) LayoutInflater.from(getContext()).inflate(getContentViewId(), (ViewGroup) this, false);
        this.d = (XLoading) this.e.findViewById(f.C0131f.loading_icon);
        this.c = (XImageView) this.e.findViewById(f.C0131f.no_result_icon);
        this.c.setVuiMode(bij.DISABLED);
        this.b = (XImageView) this.e.findViewById(f.C0131f.error_icon);
        this.b.setVuiMode(bij.DISABLED);
        this.d.setVisibility(0);
        this.d.setVuiMode(bij.DISABLED);
        this.f = (XTextView) this.e.findViewById(f.C0131f.tips);
        addView(this.e);
        setGravity(17);
        setVisibility(8);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.j.LoadingTipsView);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(f.j.LoadingTipsView_loadingTextSize, getResources().getDimensionPixelSize(f.d.common_tips_smaller));
            if (obtainStyledAttributes.hasValue(f.j.LoadingTipsView_errorText)) {
                this.i = String.valueOf(obtainStyledAttributes.getText(f.j.LoadingTipsView_errorText));
            } else {
                this.i = be.a(f.h.common_tips_network_error);
            }
            if (obtainStyledAttributes.hasValue(f.j.LoadingTipsView_loadingText)) {
                this.j = String.valueOf(obtainStyledAttributes.getText(f.j.LoadingTipsView_loadingText));
            } else {
                this.j = be.a(f.h.common_tips_loading);
            }
            if (obtainStyledAttributes.hasValue(f.j.LoadingTipsView_noResultText)) {
                this.h = String.valueOf(obtainStyledAttributes.getText(f.j.LoadingTipsView_noResultText));
            } else {
                this.h = be.a(f.h.common_tips_no_result);
            }
            setState(obtainStyledAttributes.getInt(f.j.LoadingTipsView_loadingState, 0));
            this.f.setTextSize(0, dimensionPixelSize);
            obtainStyledAttributes.recycle();
            VuiEngine.getInstance(getContext()).setVuiElementTag(this, "loadingTipsView");
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setLoadingTextSize(float f) {
        this.f.setTextSize(f);
    }

    protected int a(int i) {
        if (i == 1) {
            return -40;
        }
        return getResources().getDimensionPixelSize(f.d.common_tips_margin_top);
    }

    public void setState(int i) {
        this.a = i;
        int a = a(i);
        switch (i) {
            case 1:
                setVisibility(0);
                this.c.setVisibility(8);
                this.b.setVisibility(8);
                this.d.setVisibility(0);
                this.f.setText(this.j);
                this.f.setVisibility(0);
                break;
            case 2:
                setVisibility(0);
                this.c.setVisibility(8);
                this.b.setVisibility(0);
                this.d.setVisibility(8);
                this.f.setText(this.i);
                this.f.setVisibility(0);
                break;
            case 3:
                setVisibility(0);
                this.c.setVisibility(0);
                this.b.setVisibility(8);
                this.d.setVisibility(8);
                this.f.setText(this.h);
                this.f.setVisibility(0);
                break;
            default:
                setVisibility(8);
                this.d.setVisibility(8);
                this.f.setVisibility(8);
                break;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams.topMargin = a;
        this.f.setLayoutParams(layoutParams);
    }

    public int getState() {
        return this.a;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.a == 2 && this.g) {
            setState(1);
        }
        return super.performClick();
    }

    public void setAutoClickLoadingEnable(boolean z) {
        this.g = z;
    }

    public void setNoResultTextSize(float f) {
        this.f.setTextSize(f);
    }

    public String getErrorTextToast() {
        XTextView xTextView = this.f;
        if (xTextView != null) {
            return xTextView.getText().toString();
        }
        return getResources().getString(f.h.common_tips_network_error);
    }

    public void a() {
        this.f.setText(this.j);
    }

    public void setLoadingText(int i) {
        this.j = be.a(i);
    }

    public void setLoadingText(CharSequence charSequence) {
        this.j = String.valueOf(charSequence);
    }

    public void setNoResultText(int i) {
        this.h = be.a(i);
    }

    public void setNoResultText(CharSequence charSequence) {
        this.h = String.valueOf(charSequence);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        XImageView xImageView = this.b;
        if (xImageView != null) {
            xImageView.setOnClickListener(onClickListener);
        }
    }
}
