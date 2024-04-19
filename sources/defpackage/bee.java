package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.xiaopeng.musicradio.utils.aw;
/* compiled from: FontScaleActivityLifecycle.java */
/* renamed from: bee  reason: default package */
/* loaded from: classes2.dex */
public class bee implements Application.ActivityLifecycleCallbacks {
    private static volatile bee a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public static bee a(Application application) {
        if (a == null) {
            synchronized (bee.class) {
                a = new bee(application);
            }
        }
        return a;
    }

    private bee(Application application) {
        application.registerActivityLifecycleCallbacks(this);
        a((Context) application);
    }

    private void a(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        aw.a((Object) from, "mFactorySet", (Object) false);
        gw.a(from, bef.a(context));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity);
    }
}
