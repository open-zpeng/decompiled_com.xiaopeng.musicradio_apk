package com.xiaopeng.speech.protocol.query.speech.combo;

import android.text.TextUtils;
import com.xiaopeng.speech.annotation.QueryAnnotation;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ComboQuery extends bfd<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public String b(String str, String str2) {
        return ((a) this.b).a(a(str2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public String c(String str, String str2) {
        return ((a) this.b).b(a(str2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public String d(String str, String str2) {
        return ((a) this.b).c(a(str2));
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("mode") ? jSONObject.optString("mode") : "";
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public String e(String str, String str2) {
        return ((a) this.b).a();
    }
}
