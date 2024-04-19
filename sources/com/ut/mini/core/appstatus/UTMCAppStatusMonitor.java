package com.ut.mini.core.appstatus;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
@TargetApi(14)
/* loaded from: classes.dex */
public class UTMCAppStatusMonitor implements Application.ActivityLifecycleCallbacks {
    private static UTMCAppStatusMonitor a;
    private int K = 0;
    private boolean T = false;

    /* renamed from: a  reason: collision with other field name */
    private ScheduledFuture<?> f131a = null;
    private Object e = new Object();
    private List<UTMCAppStatusCallbacks> m = new LinkedList();
    private Object f = new Object();

    private UTMCAppStatusMonitor() {
    }

    public static synchronized UTMCAppStatusMonitor getInstance() {
        UTMCAppStatusMonitor uTMCAppStatusMonitor;
        synchronized (UTMCAppStatusMonitor.class) {
            if (a == null) {
                a = new UTMCAppStatusMonitor();
            }
            uTMCAppStatusMonitor = a;
        }
        return uTMCAppStatusMonitor;
    }

    public void registerAppStatusCallbacks(UTMCAppStatusCallbacks uTMCAppStatusCallbacks) {
        if (uTMCAppStatusCallbacks != null) {
            synchronized (this.f) {
                this.m.add(uTMCAppStatusCallbacks);
            }
        }
    }

    public void unregisterAppStatusCallbacks(UTMCAppStatusCallbacks uTMCAppStatusCallbacks) {
        if (uTMCAppStatusCallbacks != null) {
            synchronized (this.f) {
                this.m.remove(uTMCAppStatusCallbacks);
            }
        }
    }

    private void J() {
        synchronized (this.e) {
            vg.a().a(11);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        synchronized (this.f) {
            for (UTMCAppStatusCallbacks uTMCAppStatusCallbacks : this.m) {
                uTMCAppStatusCallbacks.onActivityCreated(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        synchronized (this.f) {
            for (UTMCAppStatusCallbacks uTMCAppStatusCallbacks : this.m) {
                uTMCAppStatusCallbacks.onActivityDestroyed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        synchronized (this.f) {
            for (UTMCAppStatusCallbacks uTMCAppStatusCallbacks : this.m) {
                uTMCAppStatusCallbacks.onActivityPaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        synchronized (this.f) {
            for (UTMCAppStatusCallbacks uTMCAppStatusCallbacks : this.m) {
                uTMCAppStatusCallbacks.onActivityResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        synchronized (this.f) {
            for (UTMCAppStatusCallbacks uTMCAppStatusCallbacks : this.m) {
                uTMCAppStatusCallbacks.onActivitySaveInstanceState(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        J();
        this.K++;
        if (!this.T) {
            synchronized (this.f) {
                for (UTMCAppStatusCallbacks uTMCAppStatusCallbacks : this.m) {
                    uTMCAppStatusCallbacks.onSwitchForeground();
                }
            }
        }
        this.T = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.K--;
        if (this.K == 0) {
            J();
            vg.a().a(11, new a(), 1000L);
        }
    }

    /* loaded from: classes.dex */
    private class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UTMCAppStatusMonitor.this.T = false;
            synchronized (UTMCAppStatusMonitor.this.f) {
                for (UTMCAppStatusCallbacks uTMCAppStatusCallbacks : UTMCAppStatusMonitor.this.m) {
                    uTMCAppStatusCallbacks.onSwitchBackground();
                }
            }
        }
    }
}
