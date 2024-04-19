package com.xiaopeng.musicradio.utils;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.xiaopeng.lib.utils.NetUtils;
import defpackage.agu;
import java.nio.charset.Charset;
import java.util.Map;
/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public class bj {
    private static long a;

    public static String a(int i, String str) {
        if (NetUtils.isTrafficRunOut() && System.currentTimeMillis() - a > 60000 && b.a(com.xiaopeng.musicradio.a.a)) {
            a = System.currentTimeMillis();
            return com.xiaopeng.musicradio.a.a.getString(agu.b.err_tip_no_flow);
        }
        return b(i, str);
    }

    public static String a() {
        return a(-1, (String) null);
    }

    public static String b(int i, String str) {
        if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
            return ((i == 5020005 || i == 5000009 || i == 5020001 || i == 5020003 || i == 9005006) && !TextUtils.isEmpty(str)) ? str : com.xiaopeng.musicradio.a.a.getString(agu.b.server_error_tip);
        }
        return com.xiaopeng.musicradio.a.a.getString(agu.b.net_error_tip);
    }

    public static String a(String str) {
        if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
            return TextUtils.isEmpty(str) ? com.xiaopeng.musicradio.a.a.getString(agu.b.server_error_tip) : str;
        }
        return com.xiaopeng.musicradio.a.a.getString(agu.b.net_error_tip);
    }

    public static boolean b() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024 > 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("-");
                sb.append(entry.getValue());
            }
        }
        return sb.toString();
    }

    public static boolean b(String str) {
        try {
            return !Charset.forName("GBK").newEncoder().canEncode(str);
        } catch (Exception unused) {
            return false;
        }
    }
}
