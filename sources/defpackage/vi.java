package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;
/* compiled from: UrlWrapper.java */
/* renamed from: vi  reason: default package */
/* loaded from: classes3.dex */
public class vi {
    private static final String a = "vi";

    public static String a(String str, Map<String, Object> map, Map<String, Object> map2) {
        String a2;
        String str2;
        String str3 = "";
        if (map2 != null && map2.size() > 0) {
            Set<String> keySet = map2.keySet();
            String[] strArr = new String[keySet.size()];
            keySet.toArray(strArr);
            for (String str4 : uu.a().a(strArr, true)) {
                str3 = str3 + str4 + ux.b((byte[]) map2.get(str4));
            }
        }
        try {
            a2 = a(str, null, null, str3);
        } catch (Throwable unused) {
            a2 = a(ud.a(), null, null, str3);
        }
        if (TextUtils.isEmpty(ud.b)) {
            return a2;
        }
        return a2 + "&dk=" + URLEncoder.encode(str2, "UTF-8");
    }

    private static String a(String str, String str2, String str3, String str4) {
        Context c = uc.c();
        String f = up.f();
        String c2 = up.c();
        if (c2 == null) {
            c2 = "";
        }
        String str5 = ur.a(c).get(vn.APPVERSION.toString());
        String str6 = ur.a(c).get(vn.OS.toString());
        String str7 = ur.a(c).get(vn.UTDID.toString());
        String valueOf = String.valueOf(System.currentTimeMillis());
        vq d = uc.d();
        String str8 = "0";
        String str9 = "0";
        if (d instanceof vr) {
            str9 = "1";
        } else if (d instanceof vp) {
            str8 = ((vp) d).b() ? "1" : "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(c2);
        sb.append(str5);
        sb.append(str6);
        sb.append("2.6.4.10_for_bc");
        sb.append(str7);
        sb.append(valueOf);
        sb.append("3.0");
        sb.append(str9);
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        if (str4 == null) {
            str4 = "";
        }
        sb.append(str4);
        String a2 = d.a(ux.b(sb.toString().getBytes()));
        String str10 = "";
        if (!TextUtils.isEmpty(str2)) {
            str10 = str2 + "&";
        }
        return String.format("%s?%sak=%s&av=%s&c=%s&v=%s&s=%s&d=%s&sv=%s&p=%s&t=%s&u=%s&is=%s&k=%s", str, str10, a(f), a(str5), a(c2), a("3.0"), a(a2), a(str7), "2.6.4.10_for_bc", str6, valueOf, "", str9, str8);
    }

    private static String a(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str;
        }
    }
}
