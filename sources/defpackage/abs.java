package defpackage;

import android.text.TextUtils;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ApiMatcher.java */
/* renamed from: abs  reason: default package */
/* loaded from: classes2.dex */
class abs {
    private ConcurrentHashMap<String, abw> a = new ConcurrentHashMap<>();

    public synchronized void a(abx abxVar, abw abwVar) {
        abw a;
        String str = abxVar.c;
        abw a2 = a(str, abwVar.a(), abwVar);
        if (a2 != null) {
            a2.a("getAuthority");
        }
        if (!abwVar.a().equals(abwVar.b()) && (a = a(str, abwVar.b(), abwVar)) != null) {
            a.a("getDescription");
        }
        abwVar.d();
    }

    public synchronized void a(abx abxVar) {
        abw c = c(abxVar);
        if (c != null) {
            String str = abxVar.c;
            a(str, c.a());
            if (!c.a().equals(c.b())) {
                a(str, c.b());
            }
            c.a("unpublishUri");
        }
    }

    public synchronized abw b(abx abxVar) {
        return c(abxVar);
    }

    private abw a(String str, String str2, abw abwVar) {
        if (!TextUtils.isEmpty(str)) {
            str2 = str + "@" + str2;
        }
        return this.a.put(str2, abwVar);
    }

    private void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            str2 = str + "@" + str2;
        }
        this.a.remove(str2);
    }

    private abw c(abx abxVar) {
        Set<Map.Entry<String, abw>> entrySet = this.a.entrySet();
        String str = abxVar.c;
        String str2 = !TextUtils.isEmpty(str) ? str + "@" + abxVar.a + "." : abxVar.a + ".";
        String str3 = "." + abxVar.b;
        for (Map.Entry<String, abw> entry : entrySet) {
            String key = entry.getKey();
            if (key.startsWith(str2) && key.endsWith(str3)) {
                return entry.getValue();
            }
        }
        return null;
    }
}
