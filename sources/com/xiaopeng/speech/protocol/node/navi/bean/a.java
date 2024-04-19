package com.xiaopeng.speech.protocol.node.navi.bean;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: AddressBean.java */
/* loaded from: classes2.dex */
public class a {
    private String a;
    private String b;

    public static final a a(String str) {
        a aVar = new a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar.a = jSONObject.optString("addressType");
            aVar.b = jSONObject.optString("from");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return aVar;
    }

    public void b(String str) {
        this.a = str;
    }

    public String toString() {
        return "AddressBean{addressType='" + this.a + "', from='" + this.b + "'}";
    }
}
