package defpackage;

import org.json.JSONArray;
/* compiled from: ReuseJSONArray.java */
/* renamed from: tm  reason: default package */
/* loaded from: classes3.dex */
public class tm extends JSONArray implements tk {
    @Override // defpackage.tk
    public void a(Object... objArr) {
    }

    @Override // defpackage.tk
    public void d() {
        for (int i = 0; i < length(); i++) {
            Object opt = opt(i);
            if (opt != null && (opt instanceof tk)) {
                tj.a().a((tj) ((tk) opt));
            }
        }
    }
}
