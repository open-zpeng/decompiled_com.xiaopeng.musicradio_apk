package com.xiaopeng.speech.protocol.node.navi.bean;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SelectRouteBean.java */
/* loaded from: classes2.dex */
public class e {
    private int a;

    public static e a(String str) {
        e eVar = new e();
        try {
            eVar.a = new JSONObject(str).optInt("num");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return eVar;
    }

    public String toString() {
        return "selectRouteBean{num=" + this.a + '}';
    }
}
