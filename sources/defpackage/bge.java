package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: DMRecognized.java */
/* renamed from: bge  reason: default package */
/* loaded from: classes2.dex */
public class bge extends bgg {
    public int a = 0;

    public static final bge a(String str) {
        bge bgeVar = new bge();
        try {
            bgeVar.a = new JSONObject(str).optInt("errorId");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return bgeVar;
    }

    @Override // defpackage.bgg
    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorId", this.a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
