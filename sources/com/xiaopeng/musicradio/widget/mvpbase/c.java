package com.xiaopeng.musicradio.widget.mvpbase;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.xiaopeng.lib.themeswitch.ThemeWatcher;
import com.xiaopeng.musicradio.widget.lifecycle.e;
/* compiled from: MVPBaseFrameLayout.java */
/* loaded from: classes2.dex */
public abstract class c<UIInterface, Presenter extends e<UIInterface>> extends com.xiaopeng.musicradio.widget.lifecycle.d implements bal, ThemeWatcher.OnThemeSwitchListener {
    private boolean isInit;
    protected Bundle mBundle;
    protected boolean mHasDestroyView;
    protected Presenter mPresenter;
    protected int mTheme;

    protected abstract Presenter createPresenter();

    protected abstract void findView();

    public abstract int getContentViewId();

    protected abstract void setListener();

    protected abstract void setView();

    public c(Context context) {
        super(context);
        this.isInit = false;
        this.mTheme = 0;
        init();
    }

    public c(Context context, Bundle bundle) {
        super(context);
        this.isInit = false;
        this.mTheme = 0;
        this.mBundle = bundle;
        init();
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isInit = false;
        this.mTheme = 0;
        init();
    }

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isInit = false;
        this.mTheme = 0;
        init();
    }

    private final void init() {
        this.mPresenter = createPresenter();
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.a(this);
        }
        LayoutInflater.from(getContext()).inflate(getContentViewId(), this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        initView();
    }

    private void initView() {
        if (this.isInit) {
            return;
        }
        findView();
        setView();
        setListener();
        this.isInit = true;
        applyTheme();
    }

    @Override // com.xiaopeng.lib.themeswitch.ThemeWatcher.OnThemeSwitchListener
    public void onSwitchTheme(int i) {
        if (this.isInit) {
            applyTheme();
        }
    }

    public void applyTheme() {
        this.mTheme = baj.a().c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        baj.a().a((ThemeWatcher.OnThemeSwitchListener) this);
        if (baj.a().c() != this.mTheme) {
            applyTheme();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        baj.a().b((ThemeWatcher.OnThemeSwitchListener) this);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onCreate() {
        super.onCreate();
        Presenter presenter = this.mPresenter;
        if (presenter != null && presenter.j() == null) {
            this.mPresenter.a(this);
        }
        initView();
        Presenter presenter2 = this.mPresenter;
        if (presenter2 != null) {
            presenter2.f_();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onCreateView() {
        super.onCreateView();
        this.mHasDestroyView = false;
        initView();
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.B_();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onStart() {
        super.onStart();
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.k();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onResume() {
        super.onResume();
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.l();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onPause() {
        super.onPause();
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.m();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onStop() {
        super.onStart();
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.n();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onDestroyView() {
        super.onDestroyView();
        this.mHasDestroyView = true;
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.g();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onDestroy() {
        super.onDestroy();
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.g_();
            this.mPresenter.a();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onSupportVisible() {
        super.onSupportVisible();
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.y_();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onSupportInvisible() {
        super.onSupportInvisible();
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.e();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.d
    protected boolean checkLayoutStatus() {
        return this.isInit;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
