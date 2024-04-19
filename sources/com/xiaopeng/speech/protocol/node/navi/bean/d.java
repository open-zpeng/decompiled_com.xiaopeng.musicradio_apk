package com.xiaopeng.speech.protocol.node.navi.bean;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SelectParkingBean.java */
/* loaded from: classes2.dex */
public class d {
    private int a;

    public static d a(String str) {
        d dVar = new d();
        try {
            dVar.a = new JSONObject(str).optInt("num");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return dVar;
    }

    public String toString() {
        return "SelectParkingBean{num=" + this.a + '}';
    }
}
