package com.xiaopeng.speech.protocol.node.navi.bean;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: WaypointSearchBean.java */
/* loaded from: classes2.dex */
public class f {
    private String a;
    private String b;
    private boolean c;

    public static f a(String str) {
        f fVar = new f();
        try {
            JSONObject jSONObject = new JSONObject(str);
            fVar.a = jSONObject.optString("destinationName");
            fVar.b = jSONObject.optString("destinationType");
            int optInt = jSONObject.optInt("isSetAsDestination", 0);
            boolean z = true;
            if (optInt != 1) {
                z = false;
            }
            fVar.c = z;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return fVar;
    }

    public String toString() {
        return "WaypointSearchBean{destinationName='" + this.a + "', destinationType='" + this.b + "', isSetAsDestination=" + this.c + '}';
    }
}
