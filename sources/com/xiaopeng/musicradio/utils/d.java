package com.xiaopeng.musicradio.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.xiaopeng.lib.utils.LogUtils;
import java.util.ArrayList;
/* compiled from: ApplicationLifecycle.java */
/* loaded from: classes2.dex */
public class d {
    private ViewGroup a;
    private ArrayList<View> b;

    public void a(Application application) {
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.xiaopeng.musicradio.utils.d.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                a.a().a(activity);
                LogUtils.i("ApplicationLifecycle", "created: %s", activity.getLocalClassName());
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                a.a().d();
                LogUtils.i("ApplicationLifecycle", "onActivityStarted: %s", activity.getLocalClassName());
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                LogUtils.i("ApplicationLifecycle", "resumed: %s", activity.getLocalClassName());
                a.a().c(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                LogUtils.i("ApplicationLifecycle", "paused: %s", activity.getLocalClassName());
                a.a().d(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                a.a().e();
                LogUtils.i("ApplicationLifecycle", "onActivityStopped: %s", activity.getLocalClassName());
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                LogUtils.i("ApplicationLifecycle", "onActivitySaveInstanceState: %s", activity.getLocalClassName());
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                a.a().b(activity);
                d.this.a();
                LogUtils.i("ApplicationLifecycle", "destroyed: %s", activity.getLocalClassName());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (Build.VERSION.SDK_INT != 28) {
            return;
        }
        if (this.a == null) {
            this.a = new FrameLayout(com.xiaopeng.musicradio.a.a);
            for (int i = 0; i < 32; i++) {
                this.a.addView(new View(com.xiaopeng.musicradio.a.a));
            }
            this.b = new ArrayList<>();
            this.b.add(this.a.getChildAt(0));
        }
        Log.i("ApplicationLifecycle", "fixViewHolderLocationLeak: ==============");
        this.a.addChildrenForAccessibility(this.b);
    }
}
