package com.xiaopeng.musicradio.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
/* compiled from: NetChangeObserver.java */
/* loaded from: classes.dex */
public class e {
    private volatile boolean a = false;
    private int b = 0;
    private BroadcastReceiver c = new BroadcastReceiver() { // from class: com.xiaopeng.musicradio.common.e.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                new Handler().postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.common.e.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean isNetworkAvailable = NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a);
                        LogUtils.i("NetChangeObserver", "onReceive: CONNECTIVITY_ACTION=" + isNetworkAvailable);
                        if (isNetworkAvailable && e.this.b < 3) {
                            u.c(new agg.p());
                            e.b(e.this);
                            return;
                        }
                        u.c(new agg.o());
                        e.this.b = 0;
                    }
                }, 2000L);
            }
        }
    };

    /* compiled from: NetChangeObserver.java */
    /* loaded from: classes.dex */
    private static class a {
        static final e a = new e();
    }

    static /* synthetic */ int b(e eVar) {
        int i = eVar.b;
        eVar.b = i + 1;
        return i;
    }

    public void a() {
        synchronized (this) {
            if (!this.a) {
                com.xiaopeng.musicradio.a.a.registerReceiver(this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.a = true;
            }
        }
    }

    public static e b() {
        return a.a;
    }
}
