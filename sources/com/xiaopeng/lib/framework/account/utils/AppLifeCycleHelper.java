package com.xiaopeng.lib.framework.account.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes.dex */
public class AppLifeCycleHelper implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "AppLifeCycleHelper";
    private OnAppCycleListener mAppCycleListener;
    private OnAppTopListener mAppTopListener;
    private CycleStatus mStatus;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum CycleStatus {
        CREATED,
        STARTED,
        RESUMED,
        PAUSED,
        STOPPED,
        DESTROYED,
        TOP
    }

    /* loaded from: classes.dex */
    public interface OnAppCycleListener {
        void onAppCycleChanged(CycleStatus cycleStatus);
    }

    /* loaded from: classes.dex */
    public interface OnAppTopListener {
        void onAppTop();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public AppLifeCycleHelper(Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    public void setOnAppCycleListener(OnAppCycleListener onAppCycleListener) {
        this.mAppCycleListener = onAppCycleListener;
    }

    public void setOnAppTopListener(OnAppTopListener onAppTopListener) {
        this.mAppTopListener = onAppTopListener;
    }

    public void unregisterCallbacks(Application application) {
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        L.v(TAG, "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        L.v(TAG, "onActivityStarted");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        L.v(TAG, "onActivityResumed");
        if (this.mStatus == CycleStatus.PAUSED || this.mStatus == CycleStatus.STOPPED) {
            L.v(TAG, "onAppTop.");
            this.mStatus = CycleStatus.TOP;
            OnAppTopListener onAppTopListener = this.mAppTopListener;
            if (onAppTopListener != null) {
                onAppTopListener.onAppTop();
            }
        } else {
            this.mStatus = CycleStatus.RESUMED;
        }
        onAppCycleChanged();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        L.v(TAG, "onActivityPaused");
        this.mStatus = CycleStatus.PAUSED;
        onAppCycleChanged();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        L.v(TAG, "onActivityStopped");
        this.mStatus = CycleStatus.STOPPED;
        onAppCycleChanged();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.mStatus = CycleStatus.DESTROYED;
        onAppCycleChanged();
    }

    public boolean isAppCallbackTop() {
        return this.mStatus == CycleStatus.TOP;
    }

    public void onAppCycleChanged() {
        OnAppCycleListener onAppCycleListener = this.mAppCycleListener;
        if (onAppCycleListener != null) {
            onAppCycleListener.onAppCycleChanged(this.mStatus);
        }
    }
}
