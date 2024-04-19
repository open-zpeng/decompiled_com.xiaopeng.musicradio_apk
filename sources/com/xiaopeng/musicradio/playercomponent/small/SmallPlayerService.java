package com.xiaopeng.musicradio.playercomponent.small;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.Log;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.musicradio.widget.b;
import defpackage.agn;
/* loaded from: classes2.dex */
public class SmallPlayerService extends Service {
    private static boolean b = true;
    private b a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void a() {
        Log.i("SmallPlayerService", "startService: ==========");
        if (w.i()) {
            return;
        }
        a.a.startService(new Intent(a.a, SmallPlayerService.class));
    }

    public static void b() {
        avx.a(true);
        a();
        u.c(new agn.a(true));
    }

    public static void a(boolean z) {
        b = z;
    }

    public static boolean c() {
        return b;
    }

    @Override // android.app.Service
    public void onCreate() {
        Log.i("SmallPlayerService", "onCreate: ========== " + this);
        super.onCreate();
        d();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Log.i("SmallPlayerService", "onStartCommand: ============" + this);
        return 1;
    }

    private void d() {
        e();
    }

    private void e() {
        b bVar = this.a;
        if (bVar == null || !bVar.g()) {
            this.a = f();
        }
        this.a.e();
    }

    private b f() {
        return new awc(getApplication());
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        g();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        b bVar;
        super.onConfigurationChanged(configuration);
        if (!acs.b(configuration) || (bVar = this.a) == null) {
            return;
        }
        bVar.c();
    }

    private void g() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.f();
            this.a = null;
        }
    }
}
