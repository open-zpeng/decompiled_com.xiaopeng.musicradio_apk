package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: UTDC.java */
/* renamed from: uc  reason: default package */
/* loaded from: classes3.dex */
public class uc {
    public static boolean a = false;
    public static int b = 10000;
    public static int c = 0;
    public static long d = -1;
    public static boolean e = false;
    public static String f = null;
    public static final AtomicInteger g;
    public static boolean h = false;
    public static vq i = null;
    public static boolean j = false;
    private static Context k = null;
    private static boolean l = false;
    private static boolean m;

    public static String g() {
        return "";
    }

    public static String h() {
        return "";
    }

    static {
        m = c <= b;
        f = String.valueOf(System.currentTimeMillis());
        g = new AtomicInteger(0);
        h = true;
        i = null;
        j = true;
    }

    public static synchronized void a(Context context) {
        synchronized (uc.class) {
            if (context == null) {
                uw.a("UTDC", "UTDC init failed ,context:" + context);
                return;
            }
            if (!l) {
                l = true;
                k = context.getApplicationContext();
                vs.a().b();
            }
        }
    }

    public static void a(vq vqVar) {
        i = vqVar;
        vq vqVar2 = i;
        if (vqVar2 != null) {
            up.b(vqVar2.a());
        }
    }

    public static void a(String str) {
        up.a(str);
    }

    public static void a() {
        uw.a("UTDC", "[onBackground]");
        a = true;
        uj.k();
    }

    public static void b() {
        uw.a("UTDC", "[onForeground]");
        a = false;
        vs.a().b();
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        if (k == null) {
            uw.a("UTDC", "please call UTDC.init(context) before commit log,and this log will be discarded");
        } else if (i == null) {
            uw.a("UTDC", "please call UTDC.setRequestAuthentication(auth) before commit log,and this log will be discarded");
        } else {
            b(str, str2, str3, str4, str5, map);
        }
    }

    private static void b(final String str, final String str2, final String str3, final String str4, final String str5, Map<String, String> map) {
        final HashMap hashMap = new HashMap(map);
        vg.a().a(new Runnable() { // from class: uc.1
            @Override // java.lang.Runnable
            public void run() {
                uw.a("UTDC", "[commit] page:", str, "eventId:", str2, "arg1:", str3, "arg2:", str4, "arg3:", str5, "args:", hashMap);
                try {
                    uj.a(str2);
                    un.a().a(new vo(str, str2, str3, str4, str5, hashMap));
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static Context c() {
        return k;
    }

    public static vq d() {
        vq vqVar = i;
        if (vqVar == null || TextUtils.isEmpty(vqVar.a())) {
            if (uw.b()) {
                throw new RuntimeException("please Set <meta-data android:value=\"YOU KEY\" android:name=\"com.alibaba.apmplus.app_key\"></meta-data> in app AndroidManifest.xml ");
            }
            Log.w("UTDC", "please Set <meta-data android:value=\"YOU KEY\" android:name=\"com.alibaba.apmplus.app_key\"></meta-data> in app AndroidManifest.xml ");
        }
        return i;
    }

    public static String e() {
        try {
            return uz.a(c())[0];
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    public static String f() {
        try {
            String[] a2 = uz.a(c());
            return a2[0].equals("2G/3G") ? a2[1] : "Unknown";
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    public static void i() {
        vs.a().b();
    }
}
