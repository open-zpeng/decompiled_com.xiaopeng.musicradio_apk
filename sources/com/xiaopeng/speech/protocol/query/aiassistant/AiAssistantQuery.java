package com.xiaopeng.speech.protocol.query.aiassistant;

import com.xiaopeng.speech.annotation.QueryAnnotation;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AiAssistantQuery extends bfd<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int b(String str, String str2) {
        if (str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return ((a) this.b).a(jSONObject.optString("video_name"), jSONObject.optString("video_tag"), jSONObject.optString("video_category"));
            } catch (JSONException e) {
                e.printStackTrace();
                return 0;
            }
        }
        return 0;
    }
}
