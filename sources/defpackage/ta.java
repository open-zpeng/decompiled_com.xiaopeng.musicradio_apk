package defpackage;

import org.json.JSONObject;
/* compiled from: CountEvent.java */
/* renamed from: ta  reason: default package */
/* loaded from: classes3.dex */
public class ta extends tc {
    public int a;
    public double b;

    public synchronized void a(double d) {
        this.b += d;
        this.a++;
    }

    @Override // defpackage.tc
    public synchronized JSONObject c() {
        JSONObject c;
        c = super.c();
        try {
            c.put("count", this.a);
            c.put("value", this.b);
        } catch (Exception unused) {
        }
        return c;
    }

    @Override // defpackage.tc, defpackage.tk
    public synchronized void a(Object... objArr) {
        super.a(objArr);
        this.b = 0.0d;
        this.a = 0;
    }
}
