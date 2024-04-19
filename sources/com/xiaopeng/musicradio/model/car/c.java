package com.xiaopeng.musicradio.model.car;

import android.car.Car;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MusicCarManager.java */
/* loaded from: classes.dex */
public class c {
    private Car a;
    private List<a> b = new ArrayList();
    private final ServiceConnection c = new ServiceConnection() { // from class: com.xiaopeng.musicradio.model.car.c.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.i("MusicCarManager", "onServiceConnected: ");
            for (a aVar : c.this.b) {
                aVar.a(c.this.a);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.i("MusicCarManager", "onServiceDisconnected: ");
        }
    };

    /* compiled from: MusicCarManager.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(Car car);
    }

    /* compiled from: MusicCarManager.java */
    /* loaded from: classes.dex */
    private static class b {
        static final c a = new c();
    }

    public static c a() {
        return b.a;
    }

    public void b() {
        Log.i("MusicCarManager", "initCar: ");
        c();
        this.a = Car.createCar(com.xiaopeng.musicradio.a.a, this.c);
        this.a.connect();
    }

    private void c() {
        this.b.add(new MusicIcmManager());
    }
}
