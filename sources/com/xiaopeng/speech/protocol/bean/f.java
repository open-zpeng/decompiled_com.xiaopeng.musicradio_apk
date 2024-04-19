package com.xiaopeng.speech.protocol.bean;

import org.json.JSONObject;
/* compiled from: VolumeValue.java */
/* loaded from: classes2.dex */
public class f {
    private int a;
    private a b;

    public static f a(String str) {
        f fVar = new f();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("stream_type", "3");
            if (!bhb.a(optString)) {
                optString = "3";
            }
            fVar.a = Integer.valueOf(optString).intValue();
            fVar.b = a.a(jSONObject.optString("change_value"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fVar;
    }

    public String toString() {
        return "VolumeValue{streamType=" + this.a + ", adjustValue=" + this.b + '}';
    }
}
