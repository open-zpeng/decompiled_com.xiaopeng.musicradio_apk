package com.ut.mini;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.lzy.okgo.model.Progress;
import com.ut.mini.base.UTMIVariables;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class UTHybridHelper {
    private static UTHybridHelper a = new UTHybridHelper();

    public static UTHybridHelper getInstance() {
        return a;
    }

    public void setH5Url(String str) {
        if (str != null) {
            UTMIVariables.getInstance().setH5Url(str);
        }
    }

    public void h5UT(Map<String, String> map, Object obj) {
        if (map == null || map.size() == 0) {
            uw.a("h5UT", "dataMap is empty");
            return;
        }
        String str = map.get("functype");
        if (str == null) {
            uw.a("h5UT", "funcType is null");
            return;
        }
        String str2 = map.get("utjstype");
        if (str2 != null && !str2.equals("0") && !str2.equals("1")) {
            uw.a("h5UT", "utjstype should be 1 or 0 or null");
            return;
        }
        map.remove("functype");
        Date date = new Date();
        if (str.equals("2001")) {
            a(date, map, obj);
        } else if (str.equals("2101")) {
            a(date, map);
        }
    }

    private void a(Date date, Map<String, String> map, Object obj) {
        Map<String, String> c;
        if (map == null || map.size() == 0) {
            return;
        }
        String b = b(map.get("urlpagename"), map.get(Progress.URL));
        if (b == null || TextUtils.isEmpty(b)) {
            uw.a("h5Page", "pageName is null,return");
            return;
        }
        String refPage = UTMIVariables.getInstance().getRefPage();
        String str = map.get("utjstype");
        map.remove("utjstype");
        if (str == null || str.equals("0")) {
            c = c(map);
        } else {
            c = str.equals("1") ? d(map) : null;
        }
        int i = PlaybackException.ERROR_CODE_IO_NO_PERMISSION;
        if (UTPageHitHelper.getInstance().m74a(obj)) {
            i = 2001;
        }
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(b, i, refPage, null, null, c);
        if (2001 == i) {
            UTMIVariables.getInstance().setRefPage(b);
        }
        Map<String, String> c2 = UTPageHitHelper.getInstance().c();
        if (c2 != null && c2.size() > 0) {
            uTOriginalCustomHitBuilder.setProperties(c2);
        }
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        if (defaultTracker != null) {
            defaultTracker.send(uTOriginalCustomHitBuilder.build());
        } else {
            uw.a("h5Page event error", "Fatal Error,must call setRequestAuthentication method first.");
        }
        UTPageHitHelper.getInstance().m73a(obj);
    }

    private void a(Date date, Map<String, String> map) {
        Map<String, String> e;
        if (map == null || map.size() == 0) {
            return;
        }
        String b = b(map.get("urlpagename"), map.get(Progress.URL));
        if (b == null || TextUtils.isEmpty(b)) {
            uw.a("h5Ctrl", "pageName is null,return");
            return;
        }
        String str = map.get("logkey");
        if (str == null || TextUtils.isEmpty(str)) {
            uw.a("h5Ctrl", "logkey is null,return");
            return;
        }
        String str2 = map.get("utjstype");
        map.remove("utjstype");
        if (str2 == null || str2.equals("0")) {
            e = e(map);
        } else {
            e = str2.equals("1") ? f(map) : null;
        }
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(b, 2101, str, null, null, e);
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        if (defaultTracker != null) {
            defaultTracker.send(uTOriginalCustomHitBuilder.build());
        } else {
            uw.a("h5Ctrl event error", "Fatal Error,must call setRequestAuthentication method first.");
        }
    }

    private Map<String, String> c(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get(Progress.URL);
        hashMap.put("_h5url", str == null ? "" : str);
        if (str != null) {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("spm");
            if (queryParameter != null && !TextUtils.isEmpty(queryParameter)) {
                hashMap.put("spm", queryParameter);
            } else {
                hashMap.put("spm", "0.0.0.0");
            }
            String queryParameter2 = parse.getQueryParameter("scm");
            if (queryParameter2 != null && !TextUtils.isEmpty(queryParameter2)) {
                hashMap.put("scm", queryParameter2);
            }
        } else {
            hashMap.put("spm", "0.0.0.0");
        }
        String str2 = map.get("spmcnt");
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("_spmcnt", str2);
        String str3 = map.get("spmpre");
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("_spmpre", str3);
        String str4 = map.get("lzsid");
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("_lzsid", str4);
        String str5 = map.get("extendargs");
        if (str5 == null) {
            str5 = "";
        }
        hashMap.put("_h5ea", str5);
        String str6 = map.get("cna");
        if (str6 == null) {
            str6 = "";
        }
        hashMap.put("_cna", str6);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    private Map<String, String> d(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get(Progress.URL);
        if (str == null) {
            str = "";
        }
        hashMap.put("_h5url", str);
        String str2 = map.get("extendargs");
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("_h5ea", str2);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    private Map<String, String> e(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("logkeyargs");
        if (str == null) {
            str = "";
        }
        hashMap.put("_lka", str);
        String str2 = map.get("cna");
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("_cna", str2);
        String str3 = map.get("extendargs");
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("_h5ea", str3);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    private Map<String, String> f(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("extendargs");
        if (str == null) {
            str = "";
        }
        hashMap.put("_h5ea", str);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    private String b(String str, String str2) {
        if (str == null || TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            int indexOf = str2.indexOf("?");
            return indexOf == -1 ? str2 : str2.substring(0, indexOf);
        }
        return str;
    }
}
