package defpackage;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: AlarmModuleSampling.java */
/* renamed from: tr  reason: default package */
/* loaded from: classes3.dex */
public class tr extends tv {
    private int c;
    private int d;

    @Override // defpackage.tv
    public /* bridge */ /* synthetic */ boolean a(int i, String str, Map map) {
        return super.a(i, str, map);
    }

    public tr(String str, int i, int i2) {
        super(str, 0);
        this.c = this.a;
        this.d = this.a;
    }

    public boolean a(int i, String str, Boolean bool, Map<String, String> map) {
        tw twVar;
        uw.a("AlarmModuleSampling", "samplingSeed:", Integer.valueOf(i), "isSuccess:", bool, "successSampling:", Integer.valueOf(this.c), "failSampling:", Integer.valueOf(this.d));
        if (this.b != null && (twVar = this.b.get(str)) != null && (twVar instanceof ts)) {
            return ((ts) twVar).a(i, bool, map);
        }
        return a(i, bool.booleanValue());
    }

    @Override // defpackage.tv
    public void b(JSONObject jSONObject) {
        a(jSONObject);
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("monitorPoints");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString("monitorPoint");
                    if (ua.a(string)) {
                        tw twVar = this.b.get(string);
                        if (twVar == null) {
                            twVar = new ts(string, this.c, this.d);
                            this.b.put(string, twVar);
                        }
                        twVar.b(jSONObject2);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    protected boolean a(int i, boolean z) {
        return z ? i < this.c : i < this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.to
    public void a(JSONObject jSONObject) {
        super.a((tr) jSONObject);
        this.c = this.a;
        this.d = this.a;
        try {
            Integer valueOf = Integer.valueOf(jSONObject.getInt("successSampling"));
            if (valueOf != null) {
                this.c = valueOf.intValue();
            }
            Integer valueOf2 = Integer.valueOf(jSONObject.getInt("failSampling"));
            if (valueOf2 != null) {
                this.d = valueOf2.intValue();
            }
            uw.a("AlarmModuleSampling", "[updateSelfSampling]", jSONObject, "successSampling:", valueOf, "failSampling");
        } catch (Exception unused) {
        }
    }
}
