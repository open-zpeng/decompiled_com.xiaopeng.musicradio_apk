package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: DMListening.java */
/* renamed from: bgd  reason: default package */
/* loaded from: classes2.dex */
public class bgd extends bgh {
    public static final bgd a(String str) {
        bgd bgdVar = new bgd(0);
        try {
            JSONObject jSONObject = new JSONObject(str);
            bgdVar.a = jSONObject.optInt("volume");
            bgdVar.b = jSONObject.optInt("soundArea");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return bgdVar;
    }

    public bgd(int i) {
        super(i, -1);
    }
}
