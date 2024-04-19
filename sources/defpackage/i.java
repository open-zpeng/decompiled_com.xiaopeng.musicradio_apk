package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.util.Map;
/* compiled from: RequestUrl.java */
/* renamed from: i  reason: default package */
/* loaded from: classes3.dex */
public class i {
    private final URL a;
    private final e b;
    private final String c;
    private String d;
    private URL e;

    public i(String str) {
        this(str, e.b);
    }

    public i(String str, e eVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: " + str);
        } else if (eVar == null) {
            throw new IllegalArgumentException("Headers must not be null");
        } else {
            this.c = str;
            this.a = null;
            this.b = eVar;
        }
    }

    public URL a() {
        return d();
    }

    private URL d() {
        if (this.e == null) {
            this.e = new URL(e());
        }
        return this.e;
    }

    private String e() {
        if (TextUtils.isEmpty(this.d)) {
            String str = this.c;
            if (TextUtils.isEmpty(str)) {
                str = this.a.toString();
            }
            this.d = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
        }
        return this.d;
    }

    public Map<String, String> b() {
        return this.b.a();
    }

    public String c() {
        String str = this.c;
        return str != null ? str : this.a.toString();
    }

    public String toString() {
        return c() + '\n' + this.b.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            return c().equals(iVar.c()) && this.b.equals(iVar.b);
        }
        return false;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.b.hashCode();
    }
}
