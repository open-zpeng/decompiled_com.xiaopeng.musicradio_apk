package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: NetworkUtil.java */
/* renamed from: uz  reason: default package */
/* loaded from: classes3.dex */
public class uz {
    private static String[] a = {"Unknown", "Unknown"};
    private static b b = new b();
    private static a c = new a();

    private static String a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "Unknown";
        }
    }

    public static String a() {
        NetworkInfo activeNetworkInfo;
        Context c2 = uc.c();
        if (c2 == null) {
            return "Unknown";
        }
        try {
            return (c2.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", c2.getPackageName()) == 0 && (activeNetworkInfo = ((ConnectivityManager) c2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) ? activeNetworkInfo.getType() == 1 ? "wifi" : activeNetworkInfo.getType() == 0 ? a(activeNetworkInfo.getSubtype()) : "Unknown" : "Unknown";
        } catch (Throwable unused) {
            return "Unknown";
        }
    }

    public static boolean b() {
        Context c2 = uc.c();
        if (c2 != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) c2.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        return activeNetworkInfo.isConnected();
                    }
                    return false;
                }
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
        return true;
    }

    public static String[] a(Context context) {
        return a;
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        context.registerReceiver(b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public static void c(Context context) {
        b bVar;
        if (context == null || (bVar = b) == null) {
            return;
        }
        context.unregisterReceiver(bVar);
    }

    /* compiled from: NetworkUtil.java */
    /* renamed from: uz$b */
    /* loaded from: classes3.dex */
    private static class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            vg.a().a(uz.c.a(context));
        }
    }

    /* compiled from: NetworkUtil.java */
    /* renamed from: uz$a */
    /* loaded from: classes3.dex */
    private static class a implements Runnable {
        private Context a;

        private a() {
        }

        public a a(Context context) {
            this.a = context;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context = this.a;
            if (context == null) {
                return;
            }
            try {
                if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.a.getPackageName()) != 0) {
                    uz.a[0] = "Unknown";
                    return;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
                if (connectivityManager == null) {
                    uz.a[0] = "Unknown";
                    return;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return;
                }
                if (1 == activeNetworkInfo.getType()) {
                    uz.a[0] = "Wi-Fi";
                } else if (activeNetworkInfo.getType() == 0) {
                    uz.a[0] = "2G/3G";
                    uz.a[1] = activeNetworkInfo.getSubtypeName();
                }
            } catch (Exception unused) {
            }
        }
    }
}
