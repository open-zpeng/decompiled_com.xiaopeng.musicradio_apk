package com.xiaopeng.speech.protocol.node.navi.bean;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: NearbySearchBean.java */
/* loaded from: classes2.dex */
public class b {
    private String a;
    private String b;
    private String c;

    public static b a(String str) {
        b bVar = new b();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("destinationPrefix", jSONObject.optString("终点修饰"));
            boolean a = bha.a();
            com.xiaopeng.speech.common.util.c.a("NearbySearchBean", "fromJson, isOverseasCarType: " + a);
            if (!a) {
                bVar.a = optString + jSONObject.optString("destination", jSONObject.optString("终点目标"));
            } else {
                bVar.b = optString;
                bVar.a = jSONObject.optString("destination", jSONObject.optString("终点目标"));
            }
            bVar.c = jSONObject.optString("destinationType", jSONObject.optString("终点类型"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return bVar;
    }

    public String toString() {
        return "NearbySearchBean{destination='" + this.a + "', destinationAddr='" + this.b + "', destinationType='" + this.c + "'}";
    }
}
