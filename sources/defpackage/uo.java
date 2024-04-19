package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ApiResponseParse.java */
/* renamed from: uo  reason: default package */
/* loaded from: classes3.dex */
public class uo {
    public static a a(String str) {
        a aVar = new a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("success")) {
                String string = jSONObject.getString("success");
                if (!TextUtils.isEmpty(string) && string.equals("success")) {
                    aVar.a = true;
                }
            }
            if (jSONObject.has("ret")) {
                aVar.b = jSONObject.getString("ret");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return aVar;
    }

    /* compiled from: ApiResponseParse.java */
    /* renamed from: uo$a */
    /* loaded from: classes3.dex */
    public static class a {
        public static a c = new a();
        public boolean a = false;
        public String b = null;

        public boolean a() {
            return "E0102".equalsIgnoreCase(this.b);
        }

        public boolean b() {
            return "E0111".equalsIgnoreCase(this.b) || "E0112".equalsIgnoreCase(this.b);
        }
    }
}
