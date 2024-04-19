package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: AccurateSampling.java */
/* renamed from: tq  reason: default package */
/* loaded from: classes3.dex */
public class tq extends to<JSONObject> {
    private Map<String, tp> b;

    public tq(int i) {
        super(i);
        this.b = new HashMap();
    }

    public void b(JSONObject jSONObject) {
        a((tq) jSONObject);
    }

    public Boolean a(int i, Map<String, String> map) {
        Map<String, tp> map2;
        if (map == null || (map2 = this.b) == null) {
            return null;
        }
        for (String str : map2.keySet()) {
            if (!this.b.get(str).a(map.get(str))) {
                return null;
            }
        }
        return Boolean.valueOf(a(i));
    }
}
