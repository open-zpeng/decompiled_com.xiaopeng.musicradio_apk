package com.xiaopeng.speech.protocol.bean;

import android.text.TextUtils;
import org.json.JSONObject;
/* compiled from: ChangeValue.java */
/* loaded from: classes2.dex */
public class c {
    private boolean a = false;
    private boolean b = false;
    private int c;

    public static c a(String str) {
        c cVar = new c();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("target");
            String optString2 = jSONObject.optString("scale");
            int i = 0;
            if (!TextUtils.isEmpty(optString)) {
                cVar.b = false;
                i = Integer.parseInt(optString);
            } else if (!TextUtils.isEmpty(optString2)) {
                cVar.b = true;
                i = Integer.parseInt(optString2);
            }
            String optString3 = jSONObject.optString("percent");
            if (!TextUtils.isEmpty(optString3)) {
                cVar.a = true;
                i = Integer.parseInt(optString3);
            }
            cVar.c = i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cVar;
    }
}
