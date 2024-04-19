package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
/* compiled from: MqttConnectOptions.java */
/* renamed from: bkq  reason: default package */
/* loaded from: classes3.dex */
public class bkq {
    private String e;
    private char[] f;
    private SocketFactory g;
    private int a = 60;
    private int b = 10;
    private String c = null;
    private bkt d = null;
    private Properties h = null;
    private HostnameVerifier i = null;
    private boolean j = true;
    private int k = 30;
    private String[] l = null;
    private int m = 0;
    private boolean n = false;

    public char[] a() {
        return this.f;
    }

    public void a(char[] cArr) {
        this.f = cArr;
    }

    public String b() {
        return this.e;
    }

    public void a(String str) {
        if (str != null && str.trim().equals("")) {
            throw new IllegalArgumentException();
        }
        this.e = str;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.m;
    }

    public int e() {
        return this.b;
    }

    public void a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        this.b = i;
    }

    public int f() {
        return this.k;
    }

    public void b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        this.k = i;
    }

    public SocketFactory g() {
        return this.g;
    }

    public void a(SocketFactory socketFactory) {
        this.g = socketFactory;
    }

    public String h() {
        return this.c;
    }

    public bkt i() {
        return this.d;
    }

    public Properties j() {
        return this.h;
    }

    public HostnameVerifier k() {
        return this.i;
    }

    public boolean l() {
        return this.j;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public String[] m() {
        return this.l;
    }

    public static int b(String str) {
        try {
            URI uri = new URI(str);
            if ("ws".equals(uri.getScheme())) {
                return 3;
            }
            if ("wss".equals(uri.getScheme())) {
                return 4;
            }
            if (uri.getPath() != null && !uri.getPath().isEmpty()) {
                throw new IllegalArgumentException(str);
            }
            if ("tcp".equals(uri.getScheme())) {
                return 0;
            }
            if ("ssl".equals(uri.getScheme())) {
                return 1;
            }
            if ("local".equals(uri.getScheme())) {
                return 2;
            }
            throw new IllegalArgumentException(str);
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException(str);
        }
    }

    public void c(int i) {
        if (i != 0 && i != 3 && i != 4) {
            throw new IllegalArgumentException();
        }
        this.m = i;
    }

    public boolean n() {
        return this.n;
    }

    public void b(boolean z) {
        this.n = z;
    }

    public Properties o() {
        Properties properties = new Properties();
        properties.put("MqttVersion", new Integer(d()));
        properties.put("CleanSession", Boolean.valueOf(l()));
        properties.put("ConTimeout", new Integer(f()));
        properties.put("KeepAliveInterval", new Integer(c()));
        properties.put("UserName", b() == null ? "null" : b());
        properties.put("WillDestination", h() == null ? "null" : h());
        if (g() == null) {
            properties.put("SocketFactory", "null");
        } else {
            properties.put("SocketFactory", g());
        }
        if (j() == null) {
            properties.put("SSLProperties", "null");
        } else {
            properties.put("SSLProperties", j());
        }
        return properties;
    }

    public String toString() {
        return bng.a(o(), "Connection options");
    }
}
