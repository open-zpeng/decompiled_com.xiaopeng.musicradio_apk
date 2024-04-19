package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.ut.device.UTDevice;
import com.xiaopeng.speech.protocol.bean.stats.SkillStatisticsBean;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: DeviceUtil.java */
/* renamed from: ur  reason: default package */
/* loaded from: classes3.dex */
public class ur {
    private static Map<String, String> a;

    public static synchronized Map<String, String> a(Context context) {
        synchronized (ur.class) {
            if (a != null) {
                a.put(vn.CHANNEL.toString(), up.c());
                a.put(vn.APPKEY.toString(), up.f());
                a(a, context);
                return a;
            } else if (context != null) {
                a = new HashMap();
                try {
                    String a2 = va.a(context);
                    String b = va.b(context);
                    if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(b)) {
                        a2 = "";
                        b = "";
                    }
                    a.put(vn.IMEI.toString(), a2);
                    a.put(vn.IMSI.toString(), b);
                    a.put(vn.BRAND.toString(), Build.BRAND);
                    a.put(vn.DEVICE_MODEL.toString(), Build.MODEL);
                    a.put(vn.RESOLUTION.toString(), d(context));
                    a.put(vn.CHANNEL.toString(), up.c());
                    a.put(vn.APPKEY.toString(), up.f());
                    a.put(vn.APPVERSION.toString(), b(context));
                    a.put(vn.LANGUAGE.toString(), c(context));
                    a.put(vn.OS.toString(), d());
                    a.put(vn.OSVERSION.toString(), c());
                    a.put(vn.SDKVERSION.toString(), "2.6.4.10_for_bc");
                    a.put(vn.SDKTYPE.toString(), "mini");
                    try {
                        a.put(vn.UTDID.toString(), UTDevice.getUtdid(context));
                    } catch (Throwable th) {
                        Log.e("DeviceUtil", "utdid4all jar doesn't exist, please copy the libs folder.");
                        th.printStackTrace();
                    }
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(SkillStatisticsBean.PAGE_PHONE);
                        String str = "";
                        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
                            str = telephonyManager.getNetworkOperatorName();
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = "Unknown";
                        }
                        a.put(vn.CARRIER.toString(), str);
                    } catch (Exception unused) {
                    }
                    a(a, context);
                    return a;
                } catch (Exception unused2) {
                    return null;
                }
            } else {
                return null;
            }
        }
    }

    private static String c() {
        String str = Build.VERSION.RELEASE;
        if (a()) {
            String property = System.getProperty("ro.yunos.version");
            if (!TextUtils.isEmpty(property)) {
                return property;
            }
            str = g();
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return str;
    }

    private static String d() {
        return (!a() || e()) ? "a" : "y";
    }

    private static void a(Map<String, String> map, Context context) {
        try {
            String[] a2 = uz.a(context);
            map.put(vn.ACCESS.toString(), a2[0]);
            if (a2[0].equals("2G/3G")) {
                map.put(vn.ACCESS_SUBTYPE.toString(), a2[1]);
            } else {
                map.put(vn.ACCESS_SUBTYPE.toString(), "Unknown");
            }
        } catch (Exception unused) {
            map.put(vn.ACCESS.toString(), "Unknown");
            map.put(vn.ACCESS_SUBTYPE.toString(), "Unknown");
        }
    }

    private static String c(Context context) {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Throwable unused) {
            return "Unknown";
        }
    }

    private static String d(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (i > i2) {
                int i3 = i ^ i2;
                i2 ^= i3;
                i = i3 ^ i2;
            }
            return i2 + "*" + i;
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    public static String b(Context context) {
        String b = ui.a().b();
        if (TextUtils.isEmpty(b)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    a.put(vn.APPVERSION.toString(), packageInfo.versionName);
                    return packageInfo.versionName;
                }
                return "Unknown";
            } catch (Throwable unused) {
                return "Unknown";
            }
        }
        return b;
    }

    public static boolean a() {
        try {
            if ((System.getProperty("java.vm.name") == null || !System.getProperty("java.vm.name").toLowerCase().contains("lemur")) && System.getProperty("ro.yunos.version") == null && TextUtils.isEmpty(vf.a("ro.yunos.build.version"))) {
                return e();
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean e() {
        return (TextUtils.isEmpty(vf.a("ro.yunos.product.chip")) && TextUtils.isEmpty(vf.a("ro.yunos.hardware"))) ? false : true;
    }

    public static String b() {
        String a2 = vf.a("ro.aliyun.clouduuid", "false");
        if ("false".equals(a2)) {
            a2 = vf.a("ro.sys.aliyun.clouduuid", "false");
        }
        return TextUtils.isEmpty(a2) ? f() : a2;
    }

    private static String f() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String g() {
        try {
            Field declaredField = Build.class.getDeclaredField("YUNOS_BUILD_VERSION");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return (String) declaredField.get(new String());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
