package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;
/* compiled from: SampleRules.java */
/* renamed from: tx  reason: default package */
/* loaded from: classes3.dex */
public class tx {
    private static final String a = null;
    private static tx c;
    private Map<te, tu> b = new HashMap();
    private int d;
    private String e;

    private tx() {
        te[] values;
        for (te teVar : te.values()) {
            if (teVar == te.ALARM) {
                this.b.put(teVar, new tt(teVar, teVar.g()));
            } else {
                this.b.put(teVar, new tu(teVar, teVar.g()));
            }
        }
    }

    public static tx a() {
        if (c == null) {
            synchronized (tx.class) {
                if (c == null) {
                    c = new tx();
                }
            }
        }
        return c;
    }

    public void a(Context context) {
        b();
    }

    public static boolean a(te teVar, String str, String str2) {
        return a().b(teVar, str, str2, (Map<String, String>) null);
    }

    public static boolean a(te teVar, String str, String str2, Map<String, String> map) {
        return a().b(teVar, str, str2, map);
    }

    public static boolean a(String str, String str2, Boolean bool, Map<String, String> map) {
        return a().b(str, str2, bool, map);
    }

    public boolean b(te teVar, String str, String str2, Map<String, String> map) {
        tu tuVar = this.b.get(teVar);
        if (tuVar != null) {
            return tuVar.a(this.d, str, str2, map);
        }
        return false;
    }

    public boolean b(String str, String str2, Boolean bool, Map<String, String> map) {
        tu tuVar = this.b.get(te.ALARM);
        if (tuVar == null || !(tuVar instanceof tt)) {
            return false;
        }
        return ((tt) tuVar).a(this.d, str, str2, bool, map);
    }

    public void b() {
        this.d = new Random(System.currentTimeMillis()).nextInt(10000);
    }

    public void a(String str) {
        te[] values;
        uw.a("SampleRules", "config:", str);
        synchronized (this) {
            if (!ua.b(str) && (this.e == null || !this.e.equals(str))) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    for (te teVar : te.values()) {
                        JSONObject optJSONObject = jSONObject.optJSONObject(teVar.toString());
                        tu tuVar = this.b.get(teVar);
                        if (optJSONObject != null && tuVar != null) {
                            uw.a(a, teVar, optJSONObject);
                            tuVar.b(optJSONObject);
                        }
                    }
                    this.e = str;
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void a(te teVar, int i) {
        tu tuVar = this.b.get(teVar);
        if (tuVar != null) {
            tuVar.b(i);
        }
    }
}
