package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: AsrEvent.java */
/* renamed from: bgc  reason: default package */
/* loaded from: classes2.dex */
public class bgc extends bgg {
    public int a;
    public int b;

    public bgc() {
        this.a = -1;
        this.b = -1;
    }

    public bgc(int i, int i2) {
        this.a = -1;
        this.b = -1;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.bgg
    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", this.a);
            jSONObject.put("soundArea", this.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static bgc a(String str) {
        int i;
        int i2 = -1;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.optInt("event");
            try {
                i2 = jSONObject.optInt("soundArea");
            } catch (JSONException e) {
                e = e;
                e.printStackTrace();
                return new bgc(i, i2);
            }
        } catch (JSONException e2) {
            e = e2;
            i = -1;
        }
        return new bgc(i, i2);
    }
}
