package defpackage;

import org.json.JSONObject;
/* compiled from: AbstractSampling.java */
/* renamed from: to  reason: default package */
/* loaded from: classes3.dex */
public abstract class to<T extends JSONObject> {
    protected int a;

    public to(int i) {
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(T t) {
        try {
            Integer valueOf = Integer.valueOf(t.getInt("sampling"));
            if (valueOf != null) {
                this.a = valueOf.intValue();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(int i) {
        return i < this.a;
    }
}
