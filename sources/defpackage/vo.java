package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Map;
/* compiled from: Log.java */
/* renamed from: vo  reason: default package */
/* loaded from: classes3.dex */
public class vo {
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private Map<String, String> k;

    public vo() {
        this.c = "3";
        this.d = null;
        this.e = "";
    }

    public vo(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        this.c = "3";
        this.d = null;
        this.e = "";
        this.b = str2;
        this.g = str;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = map;
        this.d = String.valueOf(System.currentTimeMillis());
        c();
    }

    public String a() {
        try {
            byte[] a = uq.a(this.f.getBytes("UTF-8"), 2);
            if (a != null) {
                return new String(vb.a(a, "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK"));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public String b() {
        return this.f;
    }

    public void a(String str) {
        if (str != null) {
            try {
                this.f = new String(uq.c(vb.a(str.getBytes(), "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK"), 2), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    public void b(String str) {
        this.f = str;
    }

    public String toString() {
        return "Log [id=" + this.a + ", eventId=" + this.b + ", index=" + this.e + "]";
    }

    public void c() {
        if (TextUtils.isEmpty(this.d)) {
            this.d = String.valueOf(System.currentTimeMillis());
        }
        String a = uv.a(this.g, this.b, this.h, this.i, this.j, this.k, this.e, this.d);
        uw.a("UTLog", this, a);
        a(a);
    }
}
