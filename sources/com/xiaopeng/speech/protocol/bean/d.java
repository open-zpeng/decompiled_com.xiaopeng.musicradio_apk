package com.xiaopeng.speech.protocol.bean;

import com.xiaopeng.lib.framework.aiassistantmodule.interactive.Constants;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.json.JSONObject;
/* compiled from: FeedListUIValue.java */
/* loaded from: classes2.dex */
public class d {
    public String a;
    public int b;
    public String c = null;

    public static d a(JSONObject jSONObject) {
        d dVar = new d();
        if (jSONObject != null) {
            dVar.a = jSONObject.optString("source");
            dVar.b = jSONObject.optInt(Constants.INDEX);
            if (jSONObject.has(VuiConstants.ELEMENT_TYPE)) {
                dVar.c = jSONObject.optString(VuiConstants.ELEMENT_TYPE);
            } else {
                dVar.c = null;
            }
        }
        return dVar;
    }
}
