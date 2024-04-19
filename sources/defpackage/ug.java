package defpackage;

import com.lzy.okgo.cookie.SerializableCookie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: HostConfigMgr.java */
/* renamed from: ug  reason: default package */
/* loaded from: classes3.dex */
public class ug {
    private static ug a = new ug();
    private Map<String, uf> b = Collections.synchronizedMap(new HashMap());
    private String c;

    public static ug a() {
        return a;
    }

    public void a(String str) {
        JSONObject jSONObject;
        uw.a("HostConfigMgr", "host config:" + str);
        if (str != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("content");
                if (jSONObject3 != null && (jSONObject = jSONObject3.getJSONObject("hosts")) != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (next != null) {
                            uf ufVar = new uf();
                            JSONObject jSONObject4 = jSONObject.getJSONObject(next);
                            if (jSONObject4 != null) {
                                ufVar.c = next.substring(1);
                                ufVar.a = jSONObject4.getString(SerializableCookie.HOST);
                                JSONArray jSONArray = jSONObject4.getJSONArray("eids");
                                if (jSONArray != null) {
                                    ufVar.b = new ArrayList<>();
                                    for (int i = 0; i < jSONArray.length(); i++) {
                                        ufVar.b.add(jSONArray.getString(i));
                                    }
                                }
                            }
                            this.b.put(ufVar.c + "", ufVar);
                        }
                    }
                }
                this.c = jSONObject2.getString("timestamp");
            } catch (Throwable unused) {
            }
        }
    }

    public Map<String, uf> b() {
        return this.b;
    }
}
