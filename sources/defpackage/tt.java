package defpackage;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: AlarmSampling.java */
/* renamed from: tt  reason: default package */
/* loaded from: classes3.dex */
public class tt extends tu {
    String b;
    private int e;
    private int f;

    @Override // defpackage.tu
    public /* bridge */ /* synthetic */ boolean a(int i, String str, String str2, Map map) {
        return super.a(i, str, str2, map);
    }

    public tt(te teVar, int i) {
        super(teVar, i);
        this.b = "AlarmSampling";
        this.e = 0;
        this.f = 0;
        this.e = i;
        this.f = i;
    }

    public boolean a(int i, String str, String str2, Boolean bool, Map<String, String> map) {
        tv tvVar;
        String str3 = this.b;
        uw.a(str3, "samplingSeed:", Integer.valueOf(i), "isSuccess:", bool, "successSampling:", Integer.valueOf(this.e), "failSampling:" + this.f);
        if (this.c == null || (tvVar = this.c.get(str)) == null || !(tvVar instanceof tr)) {
            return bool.booleanValue() ? i < this.e : i < this.f;
        }
        return ((tr) tvVar).a(i, str2, bool, map);
    }

    @Override // defpackage.tu
    public void b(JSONObject jSONObject) {
        a(jSONObject);
        c(jSONObject);
        this.c.clear();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("metrics");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString("module");
                    if (ua.a(string)) {
                        tv tvVar = this.c.get(string);
                        if (tvVar == null) {
                            tvVar = new tr(string, this.e, this.f);
                            this.c.put(string, tvVar);
                        }
                        tvVar.b(jSONObject2);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.to
    public void a(JSONObject jSONObject) {
        super.a((tt) jSONObject);
        this.e = this.a;
        this.f = this.a;
        try {
            Integer valueOf = Integer.valueOf(jSONObject.getInt("successSampling"));
            if (valueOf != null) {
                this.e = valueOf.intValue();
            }
            Integer valueOf2 = Integer.valueOf(jSONObject.getInt("failSampling"));
            if (valueOf2 != null) {
                this.f = valueOf2.intValue();
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.tu
    public void b(int i) {
        super.b(i);
        this.e = i;
        this.f = i;
    }
}
