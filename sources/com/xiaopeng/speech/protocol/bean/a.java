package com.xiaopeng.speech.protocol.bean;

import android.text.TextUtils;
import org.json.JSONObject;
/* compiled from: AdjustValue.java */
/* loaded from: classes2.dex */
public class a {
    private boolean a = false;
    private int b;

    public static a a(String str) {
        a aVar = new a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = 0;
            String optString = jSONObject.optString("target");
            String optString2 = jSONObject.optString("scale");
            String optString3 = jSONObject.optString("number");
            if (!TextUtils.isEmpty(optString)) {
                i = Integer.parseInt(optString);
            } else if (!TextUtils.isEmpty(optString2)) {
                i = Integer.parseInt(optString2);
            } else if (!TextUtils.isEmpty(optString3)) {
                i = Integer.parseInt(optString3);
            }
            String optString4 = jSONObject.optString("percent");
            if (!TextUtils.isEmpty(optString4)) {
                aVar.a = true;
                i = Integer.parseInt(optString4);
            }
            aVar.b = i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aVar;
    }
}
