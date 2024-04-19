package com.xiaopeng.musicradio.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.util.Log;
import com.xiaopeng.musicradio.utils.bd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ExternalStorageMgr.java */
/* loaded from: classes.dex */
public class d {
    private static volatile d a;
    private List<a> b;
    private Context c;

    /* compiled from: ExternalStorageMgr.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(String str);

        void a(boolean z);

        void b();

        void b(String str);
    }

    public static d a() {
        if (a == null) {
            synchronized (d.class) {
                if (a == null) {
                    a = new d();
                }
            }
        }
        return a;
    }

    private d() {
        b();
    }

    private void b() {
        Log.i("ExternalStorageMonitor", "init: ");
        this.c = com.xiaopeng.musicradio.a.a;
        this.b = new ArrayList();
        c();
        d();
    }

    public void a(a aVar) {
        for (a aVar2 : this.b) {
            if (aVar == aVar2) {
                return;
            }
        }
        this.b.add(aVar);
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        intentFilter.addAction("android.os.storage.action.VOLUME_STATE_CHANGED");
        this.c.registerReceiver(new b(), intentFilter);
    }

    private void d() {
        UsbManager usbManager = (UsbManager) this.c.getSystemService("usb");
        if (usbManager != null) {
            HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
            if (deviceList.isEmpty()) {
                return;
            }
            for (UsbDevice usbDevice : deviceList.values()) {
                Log.d("ExternalStorageMonitor", "device name: " + usbDevice.getDeviceName() + "\nvendor id:" + usbDevice.getVendorId());
                a(false);
                if (bd.a() == 2) {
                    b((String) null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        for (a aVar : this.b) {
            aVar.a(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        for (a aVar : this.b) {
            aVar.b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        for (a aVar : this.b) {
            aVar.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        for (a aVar : this.b) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        for (a aVar : this.b) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExternalStorageMgr.java */
    /* loaded from: classes.dex */
    public class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            char c;
            Log.d("ExternalStorageMonitor", "onReceive: " + intent.getData());
            String action = intent.getAction();
            int hashCode = action.hashCode();
            if (hashCode == -2114103349) {
                if (action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != -1608292967) {
                if (hashCode == -1410684549 && action.equals("android.os.storage.action.VOLUME_STATE_CHANGED")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (action.equals("android.hardware.usb.action.USB_DEVICE_DETACHED")) {
                    c = 1;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    Log.d("ExternalStorageMonitor", "U盘插入 ");
                    if ((intent.getFlags() & 1) == 0) {
                        d.this.a(false);
                        return;
                    } else {
                        d.this.a(true);
                        return;
                    }
                case 1:
                    Log.d("ExternalStorageMonitor", "U盘拔出");
                    d.this.e();
                    return;
                case 2:
                    int intExtra = intent.getIntExtra("android.os.storage.extra.VOLUME_STATE", 0);
                    String stringExtra = intent.getStringExtra("android.os.storage.extra.FS_UUID");
                    Log.i("ExternalStorageMonitor", "onReceive: " + intExtra);
                    if (intExtra == 2) {
                        d.this.b(stringExtra);
                    }
                    if (intExtra == 5) {
                        d.this.a(stringExtra);
                        return;
                    } else if (intExtra == 6) {
                        d.this.f();
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }
}
