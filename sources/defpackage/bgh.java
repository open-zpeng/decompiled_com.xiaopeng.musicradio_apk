package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Volume.java */
/* renamed from: bgh  reason: default package */
/* loaded from: classes2.dex */
public abstract class bgh extends bgg {
    public int a;
    public int b;

    public bgh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.bgg
    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("volume", this.a);
            jSONObject.put("soundArea", this.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
