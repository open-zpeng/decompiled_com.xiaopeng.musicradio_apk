package com.xiaopeng.speech.protocol.node.navi.bean;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PoiSearchBean.java */
/* loaded from: classes2.dex */
public class c {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public static c a(String str) {
        c cVar = new c();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("destinationPrefix");
            String optString2 = jSONObject.optString("destinationTarget");
            String optString3 = jSONObject.optString("destinationName");
            boolean a = bha.a();
            com.xiaopeng.speech.common.util.c.a("PoiSearchBean", "fromJson, isOverseasCarType: " + a);
            if (!a) {
                cVar.a = optString;
                StringBuilder sb = new StringBuilder();
                sb.append(cVar.a);
                if (TextUtils.isEmpty(optString2)) {
                    optString2 = optString3;
                }
                sb.append(optString2);
                cVar.a = sb.toString();
            } else {
                cVar.b = optString;
                if (TextUtils.isEmpty(optString2)) {
                    optString2 = optString3;
                }
                cVar.a = optString2;
            }
            cVar.c = jSONObject.optString("travelMode");
            cVar.d = jSONObject.optString("destinationType");
            cVar.e = jSONObject.optString("pref");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return cVar;
    }

    public String toString() {
        return "PoiSearchBean{destination='" + this.a + "', destinationAddr='" + this.b + "', travelMode='" + this.c + "', destinationType='" + this.d + "', pathPref='" + this.e + "'}";
    }
}
