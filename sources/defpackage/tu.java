package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: EventTypeSampling.java */
/* renamed from: tu  reason: default package */
/* loaded from: classes3.dex */
class tu extends to<JSONObject> {
    private te b;
    protected Map<String, tv> c;
    protected int d;

    public tu(te teVar, int i) {
        super(i);
        this.d = -1;
        this.b = teVar;
        this.c = Collections.synchronizedMap(new HashMap());
    }

    public boolean a(int i, String str, String str2, Map<String, String> map) {
        tv tvVar;
        Map<String, tv> map2 = this.c;
        if (map2 == null || (tvVar = map2.get(str)) == null) {
            return i < this.a;
        }
        return tvVar.a(i, str2, map);
    }

    public void b(JSONObject jSONObject) {
        a((tu) jSONObject);
        c(jSONObject);
        this.c.clear();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("metrics");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    String optString = jSONObject2.optString("module");
                    if (ua.a(optString)) {
                        tv tvVar = this.c.get(optString);
                        if (tvVar == null) {
                            tvVar = new tv(optString, this.a);
                            this.c.put(optString, tvVar);
                        }
                        tvVar.b(jSONObject2);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(JSONObject jSONObject) {
        uw.a("EventTypeSampling", "[updateEventTypeTriggerCount]", this, jSONObject);
        if (jSONObject == null) {
            return;
        }
        try {
            int optInt = jSONObject.optInt("cacheCount");
            if (optInt <= 0 || this.b == null) {
                return;
            }
            this.b.a(optInt);
        } catch (Throwable th) {
            uw.a("EventTypeSampling", "updateTriggerCount", th);
        }
    }

    public void b(int i) {
        this.a = i;
    }
}
