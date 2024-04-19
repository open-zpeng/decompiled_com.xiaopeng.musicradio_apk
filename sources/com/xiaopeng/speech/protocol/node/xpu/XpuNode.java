package com.xiaopeng.speech.protocol.node.xpu;

import android.text.TextUtils;
import com.xiaopeng.speech.annotation.SpeechAnnotation;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class XpuNode extends bfc<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has(VuiConstants.EVENT_VALUE_DIRECTION)) {
                String optString = jSONObject.optString(VuiConstants.EVENT_VALUE_DIRECTION);
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                int parseInt = Integer.parseInt(optString);
                Object[] a = this.b.a();
                if (a != null) {
                    for (Object obj : a) {
                        ((a) obj).a(parseInt);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
