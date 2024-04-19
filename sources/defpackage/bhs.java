package defpackage;

import com.xiaopeng.speech.vui.constants.VuiConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SpeechWidget.java */
/* renamed from: bhs  reason: default package */
/* loaded from: classes2.dex */
public class bhs {
    protected JSONObject a = new JSONObject();
    protected JSONObject b = new JSONObject();
    protected List<bhs> c = new ArrayList();

    public bhs() {
    }

    public bhs(String str) {
        try {
            this.a.put(VuiConstants.ELEMENT_TYPE, str);
            this.a.put("duiWidget", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public bhs b(String str) {
        return b("extraType", str);
    }

    public bhs c(String str, String str2) {
        try {
            this.a.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public bhs b(String str, String str2) {
        try {
            this.b.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public String toString() {
        if (this.b.length() > 0) {
            try {
                this.a.put("extra", this.b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        String optString = this.a.optString(VuiConstants.ELEMENT_TYPE, "");
        if ("list".equals(optString) || "media".equals(optString)) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (bhs bhsVar : this.c) {
                    jSONArray.put(new JSONObject(bhsVar.toString()));
                }
                this.a.put("count", jSONArray.length());
                this.a.put("content", jSONArray);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this.a.toString();
    }
}
