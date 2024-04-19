package defpackage;

import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: WakeupStatus.java */
/* renamed from: bgi  reason: default package */
/* loaded from: classes2.dex */
public class bgi extends bgg {
    public int a;
    public int b;
    public String c;

    public bgi(int i, int i2, String str) {
        this.a = -1;
        this.b = -1;
        this.c = null;
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.bgg
    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", this.a);
            jSONObject.put(VuiConstants.ELEMENT_TYPE, this.b);
            jSONObject.put("info", this.c);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static bgi a(String str) {
        int i;
        String str2;
        int i2 = -1;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.optInt("status");
            try {
                i2 = jSONObject.optInt(VuiConstants.ELEMENT_TYPE);
                str2 = jSONObject.optString("info");
            } catch (JSONException e) {
                e = e;
                e.printStackTrace();
                str2 = null;
                return new bgi(i, i2, str2);
            }
        } catch (JSONException e2) {
            e = e2;
            i = -1;
        }
        return new bgi(i, i2, str2);
    }
}
