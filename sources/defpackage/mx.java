package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: JsonObject.java */
/* renamed from: mx  reason: default package */
/* loaded from: classes3.dex */
public final class mx extends ne {
    private final me<String, ne> a = new me<>();

    public void a(String str, ne neVar) {
        if (neVar == null) {
            neVar = mv.a;
        }
        this.a.put(str, neVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof mx) && ((mx) obj).a.equals(this.a));
    }

    public Set<Map.Entry<String, ne>> g() {
        return this.a.entrySet();
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
