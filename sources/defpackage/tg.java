package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: UTEvent.java */
/* renamed from: tg  reason: default package */
/* loaded from: classes3.dex */
public class tg implements tk {
    public String a;
    public int b;
    public String c;
    public String d;
    public String e;
    public Map<String, String> f;

    @Override // defpackage.tk
    public void d() {
        this.a = null;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = null;
        Map<String, String> map = this.f;
        if (map != null) {
            map.clear();
        }
    }

    @Override // defpackage.tk
    public void a(Object... objArr) {
        if (this.f == null) {
            this.f = new HashMap();
        }
    }
}
