package com.xiaopeng.musicradio.widget.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.utils.bk;
import com.xiaopeng.xui.widget.XFrameLayout;
/* compiled from: BaseFrameLayout.java */
@Deprecated
/* loaded from: classes2.dex */
public class d extends XFrameLayout implements h, i, j {
    protected Handler mHandler;
    private boolean mIsDiableTouch;
    protected l mLifecycleDelegate;

    private void init() {
    }

    protected boolean checkLayoutStatus() {
        return true;
    }

    public d(Context context) {
        super(context);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mLifecycleDelegate = new l();
        this.mIsDiableTouch = false;
        init();
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mLifecycleDelegate = new l();
        this.mIsDiableTouch = false;
        init();
    }

    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mLifecycleDelegate = new l();
        this.mIsDiableTouch = false;
        init();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.j
    public void register() {
        this.mLifecycleDelegate.register();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.j
    public void unregister() {
        this.mLifecycleDelegate.unregister();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.j
    public boolean hasRegist() {
        return this.mLifecycleDelegate.hasRegist();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.i
    public void registerSubView(h hVar) {
        this.mLifecycleDelegate.registerSubView(hVar);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.i
    public void unregisterSubView(h hVar) {
        this.mLifecycleDelegate.unregisterSubView(hVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLifecycleDelegate.a((ViewGroup) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mHandler.removeCallbacksAndMessages(null);
        this.mLifecycleDelegate.b((ViewGroup) this);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onNewIntent(Intent intent) {
        this.mLifecycleDelegate.onNewIntent(intent);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onCreate() {
        this.mLifecycleDelegate.onCreate();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onCreateView() {
        this.mLifecycleDelegate.onCreateView();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onStart() {
        this.mLifecycleDelegate.onStart();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onResume() {
        this.mLifecycleDelegate.onResume();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onPause() {
        this.mLifecycleDelegate.onPause();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onStop() {
        this.mLifecycleDelegate.onStop();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onDestroyView() {
        this.mLifecycleDelegate.onDestroyView();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onDestroy() {
        this.mLifecycleDelegate.onDestroy();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mLifecycleDelegate.onActivityResult(i, i2, intent);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onSupportVisible() {
        this.mLifecycleDelegate.onSupportVisible();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onSupportInvisible() {
        this.mLifecycleDelegate.onSupportInvisible();
    }

    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (!checkLayoutStatus() || i == visibility) {
            return;
        }
        if (i == 0 && !bk.a(this)) {
            onSupportVisible();
        } else {
            onSupportInvisible();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onParentAnimationStart() {
        this.mLifecycleDelegate.onParentAnimationStart();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onParentAnimationEnd() {
        this.mLifecycleDelegate.onParentAnimationEnd();
    }

    public void disableTouch(boolean z) {
        this.mIsDiableTouch = z;
    }

    @Override // android.view.View
    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        if (this.mIsDiableTouch) {
            return false;
        }
        return super.onFilterTouchEventForSecurity(motionEvent);
    }
}
