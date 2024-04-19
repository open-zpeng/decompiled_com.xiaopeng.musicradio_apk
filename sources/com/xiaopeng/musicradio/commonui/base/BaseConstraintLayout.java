package com.xiaopeng.musicradio.commonui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.xui.widget.XConstraintLayout;
/* loaded from: classes.dex */
public abstract class BaseConstraintLayout<UIInterface, Presenter extends BasePresenter<UIInterface>> extends XConstraintLayout implements com.xiaopeng.musicradio.commonui.lifecycle.a {
    protected Presenter a;
    private boolean b;

    protected abstract Presenter a();

    protected abstract void b();

    protected abstract void c();

    protected abstract void d();

    public abstract int getContentViewId();

    public BaseConstraintLayout(Context context) {
        super(context);
        this.b = false;
        e();
    }

    public BaseConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        e();
    }

    public BaseConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        e();
    }

    private final void e() {
        this.a = a();
        Presenter presenter = this.a;
        if (presenter != null) {
            presenter.a(this);
        }
        a(LayoutInflater.from(getContext()));
    }

    protected void a(LayoutInflater layoutInflater) {
        layoutInflater.inflate(getContentViewId(), this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    private void f() {
        if (this.b) {
            return;
        }
        b();
        c();
        d();
        this.b = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XConstraintLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XConstraintLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f.b(this);
    }

    @p(a = f.a.ON_CREATE)
    public void onCreate(i iVar) {
        f();
        this.a.onCreate(iVar);
    }

    @p(a = f.a.ON_START)
    public void onStart(i iVar) {
        this.a.onStart(iVar);
    }

    @p(a = f.a.ON_RESUME)
    public void onResume(i iVar) {
        this.a.onResume(iVar);
    }

    @p(a = f.a.ON_PAUSE)
    public void onPause(i iVar) {
        this.a.onPause(iVar);
    }

    @p(a = f.a.ON_STOP)
    public void onStop(i iVar) {
        this.a.onStop(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.a
    @p(a = f.a.ON_DESTROY)
    public void onDestroy(i iVar) {
        this.a.onDestroy(iVar);
    }

    public androidx.fragment.app.d getActivity() {
        return (androidx.fragment.app.d) getContext();
    }
}
