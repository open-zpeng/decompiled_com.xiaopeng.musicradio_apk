package defpackage;

import com.xiaopeng.speech.protocol.bean.recommend.RecommendBean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SpeechResult.java */
/* renamed from: bgl  reason: default package */
/* loaded from: classes2.dex */
public class bgl {
    private String a;
    private Object b;
    private int c = 0;

    public bgl(String str, Object obj) {
        this.a = str;
        this.b = a(obj);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", this.a);
            jSONObject.put(RecommendBean.SHOW_TIME_RESULT, this.b);
            if (this.c > 0) {
                jSONObject.put("classType", this.c);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    private Object a(Object obj) {
        if (obj == null) {
            return obj;
        }
        try {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (obj instanceof int[]) {
            this.c = 1;
            return new JSONArray(obj);
        }
        if (obj instanceof float[]) {
            this.c = 2;
            return new JSONArray(obj);
        }
        return obj;
    }
}
