package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: MonitorPointSampling.java */
/* renamed from: tw  reason: default package */
/* loaded from: classes3.dex */
class tw extends to<JSONObject> {
    protected List<tq> b;
    private String c;

    public tw(String str, int i) {
        super(i);
        this.c = str;
    }

    public boolean a(int i, Map<String, String> map) {
        List<tq> list = this.b;
        if (list != null && map != null) {
            for (tq tqVar : list) {
                Boolean a = tqVar.a(i, map);
                if (a != null) {
                    return a.booleanValue();
                }
            }
        }
        return a(i);
    }

    public void b(JSONObject jSONObject) {
        a((tw) jSONObject);
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("extra");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    tq tqVar = new tq(this.a);
                    if (this.b == null) {
                        this.b = new ArrayList();
                    }
                    this.b.add(tqVar);
                    tqVar.b(jSONObject2);
                }
            }
        } catch (Exception unused) {
        }
    }
}
