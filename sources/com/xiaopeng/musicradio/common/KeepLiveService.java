package com.xiaopeng.musicradio.common;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.core.app.i;
/* loaded from: classes.dex */
public class KeepLiveService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void a(Context context) {
        Log.i("KeepLiveService", "startSerivce: ======");
        context.startForegroundService(new Intent(context, KeepLiveService.class));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
        Log.i("KeepLiveService", "onCreate: =======");
    }

    private void a() {
        ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("my_channel_01", "channel music service", 3));
        startForeground(10240, new i.c(this, "my_channel_01").a((CharSequence) "").b("").b());
        Log.i("KeepLiveService", "startForgroundInner: startforground");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        Log.i("KeepLiveService", "onStartCommand =======");
        a();
        return 1;
    }
}
