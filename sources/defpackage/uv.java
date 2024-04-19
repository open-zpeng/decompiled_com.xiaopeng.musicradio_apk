package defpackage;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import java.util.HashMap;
import java.util.Map;
/* compiled from: LogAssemble.java */
/* renamed from: uv  reason: default package */
/* loaded from: classes3.dex */
public class uv {
    public static String a(Map<String, String> map) {
        boolean z;
        vn vnVar;
        StringBuilder sb = new StringBuilder();
        vn[] values = vn.values();
        int length = values.length;
        int i = 0;
        while (true) {
            String str = null;
            if (i >= length || (vnVar = values[i]) == vn.ARGS) {
                break;
            }
            if (map.containsKey(vnVar.toString())) {
                str = map.get(vnVar.toString()) + "";
                map.remove(vnVar.toString());
            }
            sb.append(a(str));
            sb.append("||");
            i++;
        }
        if (map.containsKey(vn.ARGS.toString())) {
            sb.append(a(map.get(vn.ARGS.toString()) + ""));
            map.remove(vn.ARGS.toString());
            z = false;
        } else {
            z = true;
        }
        for (String str2 : map.keySet()) {
            String str3 = map.containsKey(str2) ? map.get(str2) + "" : null;
            if (z) {
                if ("StackTrace".equals(str2)) {
                    sb.append("StackTrace=====>");
                    sb.append(str3);
                } else {
                    sb.append(a(str2));
                    sb.append("=");
                    sb.append(str3);
                }
                z = false;
            } else if ("StackTrace".equals(str2)) {
                sb.append(ListSignBean.COLLECTID_SUFFIX);
                sb.append("StackTrace=====>");
                sb.append(str3);
            } else {
                sb.append(ListSignBean.COLLECTID_SUFFIX);
                sb.append(a(str2));
                sb.append("=");
                sb.append(str3);
            }
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2) || !sb2.endsWith("||")) {
            return sb2;
        }
        return sb2 + "-";
    }

    public static String b(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        c(map);
        return a(map);
    }

    public static Map<String, String> c(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        try {
            String d = up.d();
            if (!TextUtils.isEmpty(d) && !map.containsKey(vn.USERNICK.toString())) {
                map.put(vn.USERNICK.toString(), d);
            }
            String a = up.a();
            if (!TextUtils.isEmpty(a) && !map.containsKey(vn.LL_USERNICK.toString())) {
                map.put(vn.LL_USERNICK.toString(), a);
            }
            String e = up.e();
            if (!TextUtils.isEmpty(e) && !map.containsKey(vn.USERID.toString())) {
                map.put(vn.USERID.toString(), e);
            }
            String b = up.b();
            if (!TextUtils.isEmpty(b) && !map.containsKey(vn.LL_USERID.toString())) {
                map.put(vn.LL_USERID.toString(), b);
            }
            String valueOf = String.valueOf(System.currentTimeMillis());
            if (!map.containsKey(vn.RECORD_TIMESTAMP.toString())) {
                map.put(vn.RECORD_TIMESTAMP.toString(), valueOf);
            }
            if (!map.containsKey(vn.START_SESSION_TIMESTAMP.toString())) {
                map.put(vn.START_SESSION_TIMESTAMP.toString(), String.valueOf(uc.f));
            }
            Map<String, String> a2 = ur.a(uc.c());
            if (a2 != null) {
                for (String str : a2.keySet()) {
                    String str2 = a2.get(str);
                    if (!TextUtils.isEmpty(str2) && !map.containsKey(str) && !map.containsKey(str)) {
                        map.put(str, str2);
                    }
                }
            }
            String d2 = d(map);
            if (!TextUtils.isEmpty(d2) && !map.containsKey(vn.RESERVES.toString())) {
                map.put(vn.RESERVES.toString(), d2);
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    private static String d(Map<String, String> map) {
        String str = "_ap=1";
        if ("y".equalsIgnoreCase(map.get(vn.OS.toString()))) {
            String b = ur.b();
            if (!TextUtils.isEmpty(b)) {
                str = "_ap=1,_did=" + b;
            }
        }
        String str2 = map.get(vn.APPKEY.toString());
        if (TextUtils.isEmpty(up.f()) || TextUtils.isEmpty(str2) || up.f().equalsIgnoreCase(str2)) {
            return str;
        }
        return str + ",_mak=" + up.f();
    }

    private static String a(String str) {
        return TextUtils.isEmpty(str) ? "-" : str;
    }

    public static String a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(vn.PAGE.toString(), str);
        }
        hashMap.put(vn.EVENTID.toString(), str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(vn.ARG1.toString(), str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(vn.ARG2.toString(), str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put(vn.ARG3.toString(), str5);
        }
        if (!TextUtils.isEmpty(str7)) {
            hashMap.put(vn.RECORD_TIMESTAMP.toString(), str7);
        }
        if (!TextUtils.isEmpty(str6)) {
            hashMap.put(vn.RESERVE3.toString(), str6);
        }
        return b(hashMap);
    }
}
