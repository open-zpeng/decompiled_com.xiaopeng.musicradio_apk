package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: AlarmEvent.java */
/* renamed from: sz  reason: default package */
/* loaded from: classes3.dex */
public class sz extends tc {
    public int a = 0;
    public int b = 0;
    public Map<String, String> c;
    public Map<String, Integer> d;

    public synchronized void a() {
        this.a++;
    }

    public synchronized void b() {
        this.b++;
    }

    public synchronized void a(String str, String str2) {
        if (ua.b(str)) {
            return;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        if (ua.a(str2)) {
            int i = 100;
            if (str2.length() <= 100) {
                i = str2.length();
            }
            this.c.put(str, str2.substring(0, i));
        }
        if (!this.d.containsKey(str)) {
            this.d.put(str, 1);
        } else {
            this.d.put(str, Integer.valueOf(this.d.get(str).intValue() + 1));
        }
    }

    @Override // defpackage.tc
    public synchronized JSONObject c() {
        JSONObject c;
        c = super.c();
        try {
            c.put("successCount", this.a);
            c.put("failCount", this.b);
            if (this.d != null) {
                JSONArray jSONArray = (JSONArray) tj.a().a(tm.class, new Object[0]);
                for (Map.Entry<String, Integer> entry : this.d.entrySet()) {
                    JSONObject jSONObject = (JSONObject) tj.a().a(tn.class, new Object[0]);
                    String key = entry.getKey();
                    jSONObject.put("errorCode", key);
                    jSONObject.put("errorCount", entry.getValue());
                    if (this.c.containsKey(key)) {
                        jSONObject.put("errorMsg", this.c.get(key));
                    }
                    jSONArray.put(jSONObject);
                }
                c.put("errors", jSONArray);
            }
        } catch (Exception unused) {
        }
        return c;
    }

    @Override // defpackage.tc, defpackage.tk
    public synchronized void d() {
        super.d();
        this.a = 0;
        this.b = 0;
        if (this.c != null) {
            this.c.clear();
        }
        if (this.d != null) {
            this.d.clear();
        }
    }
}
