package defpackage;

import android.text.TextUtils;
import com.lzy.okgo.model.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: LazyHeaders.java */
/* renamed from: h  reason: default package */
/* loaded from: classes3.dex */
public final class h implements e {
    private final Map<String, List<g>> c;
    private volatile Map<String, String> d;

    h(Map<String, List<g>> map) {
        this.c = Collections.unmodifiableMap(map);
    }

    @Override // defpackage.e
    public Map<String, String> a() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.d;
    }

    private Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<g>> entry : this.c.entrySet()) {
            StringBuilder sb = new StringBuilder();
            List<g> value = entry.getValue();
            for (int i = 0; i < value.size(); i++) {
                sb.append(value.get(i).a());
                if (i != value.size() - 1) {
                    sb.append(',');
                }
            }
            hashMap.put(entry.getKey(), sb.toString());
        }
        return hashMap;
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.c + '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.c.equals(((h) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    /* compiled from: LazyHeaders.java */
    /* renamed from: h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private static final String a = System.getProperty("http.agent");
        private static final Map<String, List<g>> b;
        private boolean c = true;
        private Map<String, List<g>> d = b;
        private boolean e = true;
        private boolean f = true;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(a)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(a)));
            }
            hashMap.put(HttpHeaders.HEAD_KEY_ACCEPT_ENCODING, Collections.singletonList(new b("identity")));
            b = Collections.unmodifiableMap(hashMap);
        }

        public h a() {
            this.c = true;
            return new h(this.d);
        }
    }

    /* compiled from: LazyHeaders.java */
    /* renamed from: h$b */
    /* loaded from: classes3.dex */
    static final class b implements g {
        private final String a;

        b(String str) {
            this.a = str;
        }

        @Override // defpackage.g
        public String a() {
            return this.a;
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.a + "'}";
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }
}
