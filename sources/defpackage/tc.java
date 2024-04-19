package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Event.java */
/* renamed from: tc  reason: default package */
/* loaded from: classes3.dex */
public abstract class tc implements tk {
    public String e;
    public String f;
    public String g;
    public int h;

    public JSONObject c() {
        JSONObject jSONObject = (JSONObject) tj.a().a(tn.class, new Object[0]);
        try {
            jSONObject.put("page", this.e);
            jSONObject.put("monitorPoint", this.f);
            if (this.g != null) {
                jSONObject.put("arg", this.g);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // defpackage.tk
    public void d() {
        this.h = 0;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    @Override // defpackage.tk
    public void a(Object... objArr) {
        this.h = ((Integer) objArr[0]).intValue();
        this.e = (String) objArr[1];
        this.f = (String) objArr[2];
        if (objArr.length <= 3 || objArr[3] == null) {
            return;
        }
        this.g = (String) objArr[3];
    }
}
