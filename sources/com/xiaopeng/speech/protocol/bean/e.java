package com.xiaopeng.speech.protocol.bean;

import org.json.JSONObject;
/* compiled from: SpeechParam.java */
/* loaded from: classes2.dex */
public class e {
    private boolean a;
    private boolean b;

    public static e a(String str) {
        e eVar = new e();
        try {
            JSONObject jSONObject = new JSONObject(str);
            eVar.a = jSONObject.optBoolean("app_tts", true);
            eVar.b = jSONObject.optBoolean("animation");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eVar;
    }
}
