package defpackage;

import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.a;
import com.alibaba.mtl.appmonitor.model.b;
import com.alibaba.mtl.appmonitor.model.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ModuleSampling.java */
/* renamed from: tv  reason: default package */
/* loaded from: classes3.dex */
class tv extends to<JSONObject> {
    protected Map<String, tw> b;
    private String c;

    public tv(String str, int i) {
        super(i);
        this.c = str;
        this.b = new HashMap();
    }

    public boolean a(int i, String str, Map<String, String> map) {
        tw twVar;
        Map<String, tw> map2 = this.b;
        if (map2 != null && (twVar = map2.get(str)) != null) {
            return twVar.a(i, map);
        }
        return a(i);
    }

    public void b(JSONObject jSONObject) {
        a((tv) jSONObject);
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("monitorPoints");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    String optString = jSONObject2.optString("monitorPoint");
                    String optString2 = jSONObject2.optString("metric_comment_detail");
                    if (ua.a(optString)) {
                        tw twVar = this.b.get(optString);
                        if (twVar == null) {
                            twVar = new tw(optString, this.a);
                            this.b.put(optString, twVar);
                        }
                        twVar.b(jSONObject2);
                        b a = c.a().a(this.c, optString);
                        if (a != null) {
                            a.a(optString2);
                        }
                        Object opt = jSONObject2.opt("measures");
                        if (opt instanceof JSONArray) {
                            JSONArray jSONArray = (JSONArray) opt;
                            MeasureSet a2 = MeasureSet.a();
                            int length = jSONArray.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                                if (jSONObject3 != null) {
                                    String optString3 = jSONObject3.optString("name");
                                    Double valueOf = Double.valueOf(jSONObject3.optDouble("min"));
                                    Double valueOf2 = Double.valueOf(jSONObject3.optDouble("max"));
                                    if (optString3 != null && valueOf != null && valueOf2 != null) {
                                        a2.a(new Measure(optString3, Double.valueOf(0.0d), valueOf, valueOf2));
                                    }
                                }
                            }
                            b a3 = c.a().a("config_prefix" + this.c, "config_prefix" + optString);
                            if (a3 != null) {
                                c.a().b(a3);
                            }
                            c.a().a(new a("config_prefix" + this.c, "config_prefix" + optString, a2));
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
