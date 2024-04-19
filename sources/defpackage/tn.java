package defpackage;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ReuseJSONObject.java */
/* renamed from: tn  reason: default package */
/* loaded from: classes3.dex */
public class tn extends JSONObject implements tk {
    @Override // defpackage.tk
    public void a(Object... objArr) {
    }

    @Override // defpackage.tk
    public void d() {
        Iterator<String> keys = keys();
        if (keys != null) {
            while (keys.hasNext()) {
                try {
                    Object obj = get(keys.next());
                    if (obj != null && (obj instanceof tk)) {
                        tj.a().a((tj) ((tk) obj));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
