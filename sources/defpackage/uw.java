package defpackage;

import android.os.Process;
import android.util.Log;
import com.xiaopeng.musicradio.bean.ListSignBean;
/* compiled from: Logger.java */
/* renamed from: uw  reason: default package */
/* loaded from: classes3.dex */
public class uw {
    private static String a = "UTAnalytics:";
    private static boolean b = false;
    private static boolean c = false;

    public static boolean a() {
        return b;
    }

    public static boolean b() {
        return c;
    }

    public static void a(boolean z) {
        c = z;
    }

    public static void a(String str, Object... objArr) {
        if (c) {
            String str2 = a + str;
            StringBuilder sb = new StringBuilder();
            sb.append("pid:");
            sb.append(Process.myPid());
            sb.append(" ");
            if (objArr != null) {
                for (int i = 0; i < objArr.length; i++) {
                    if (objArr[i] != null) {
                        String obj = objArr[i].toString();
                        if (obj.endsWith(":") || obj.endsWith(": ")) {
                            sb.append(obj);
                        } else {
                            sb.append(obj);
                            sb.append(ListSignBean.COLLECTID_SUFFIX);
                        }
                    }
                }
            }
            Log.d(str2, sb.toString());
        }
    }

    public static void a(String str, Object obj, Throwable th) {
        if (b() || a()) {
            Log.w(str + a, obj + "", th);
        }
    }

    public static void a(String str, Object obj) {
        if (b() || a()) {
            Log.w(str + a, obj + "");
        }
    }

    public static void a(String str, String... strArr) {
        if (c) {
            String str2 = a + str;
            StringBuilder sb = new StringBuilder();
            sb.append("pid:");
            sb.append(Process.myPid());
            sb.append(" ");
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i++) {
                    if (strArr[i] != null) {
                        String str3 = strArr[i];
                        if (str3.endsWith(":") || str3.endsWith(": ")) {
                            sb.append(str3);
                        } else {
                            sb.append(str3);
                            sb.append(ListSignBean.COLLECTID_SUFFIX);
                        }
                    }
                }
            }
            Log.i(str2, sb.toString());
        }
    }
}
