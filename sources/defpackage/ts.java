package defpackage;

import java.util.Map;
import org.json.JSONObject;
/* compiled from: AlarmMonitorPointSampling.java */
/* renamed from: ts  reason: default package */
/* loaded from: classes3.dex */
public class ts extends tw {
    private int c;
    private int d;

    @Override // defpackage.tw
    public /* bridge */ /* synthetic */ boolean a(int i, Map map) {
        return super.a(i, map);
    }

    public ts(String str, int i, int i2) {
        super(str, 0);
        this.c = i;
        this.d = i2;
    }

    public boolean a(int i, Boolean bool, Map<String, String> map) {
        uw.a("AlarmMonitorPointSampling", "samplingSeed:", Integer.valueOf(i), "isSuccess:", bool, "successSampling:", Integer.valueOf(this.c), "failSampling:", Integer.valueOf(this.d));
        if (this.b != null && map != null) {
            for (tq tqVar : this.b) {
                Boolean a = tqVar.a(i, map);
                if (a != null) {
                    return a.booleanValue();
                }
            }
        }
        return a(i, bool.booleanValue());
    }

    protected boolean a(int i, boolean z) {
        return z ? i < this.c : i < this.d;
    }

    @Override // defpackage.tw
    public void b(JSONObject jSONObject) {
        super.b(jSONObject);
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
            uw.a("AlarmMonitorPointSampling", "[updateSelfSampling]", jSONObject, "successSampling:", valueOf, "failSampling", valueOf2);
        } catch (Exception unused) {
        }
    }
}
