package defpackage;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import java.util.List;
/* compiled from: CoreStatics.java */
/* renamed from: uj  reason: default package */
/* loaded from: classes3.dex */
public class uj {
    private static volatile long a;
    private static long b;
    private static long c;
    private static int d;
    private static long e;
    private static long f;
    private static long g;
    private static long h;
    private static long i;
    private static long j;
    private static int k;
    private static int l;
    private static long m;
    private static long n;
    private static long o;
    private static long p;
    private static long q;
    private static long r;
    private static long s;
    private static long t;
    private static long u;
    private static long v;
    private static long w;
    private static long x;
    private static StringBuilder y = new StringBuilder();

    public static synchronized void a(String str) {
        synchronized (uj.class) {
            if (c(str)) {
                return;
            }
            if ("65501".equalsIgnoreCase(str)) {
                x++;
            } else if ("65133".equalsIgnoreCase(str)) {
                v++;
            } else if ("65502".equalsIgnoreCase(str)) {
                w++;
            } else if ("65503".equalsIgnoreCase(str)) {
                u++;
            }
            a++;
        }
    }

    public static synchronized void b(String str) {
        synchronized (uj.class) {
            if (c(str)) {
                return;
            }
            b++;
        }
    }

    public static synchronized void a(List<vo> list, int i2) {
        synchronized (uj.class) {
            if (list == null) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                vo voVar = list.get(i4);
                if (voVar != null) {
                    if (!"6005".equalsIgnoreCase(voVar.b)) {
                        i3++;
                    }
                    y.append(voVar.e);
                    if (i4 != list.size() - 1) {
                        y.append(ListSignBean.COLLECTID_SUFFIX);
                    }
                }
            }
            uw.a("CoreStatics", "[uploadInc]:", Long.valueOf(c), "count:", Integer.valueOf(i2));
            c += i2;
            uw.a("CoreStatics", "[uploadInc]:", Long.valueOf(c));
            if (i3 != i2) {
                uw.a("CoreStatics", "Mutil Process Upload Error");
            }
        }
    }

    public static synchronized void a(int i2) {
        synchronized (uj.class) {
            d += i2;
        }
    }

    public static synchronized void a() {
        synchronized (uj.class) {
            e++;
        }
    }

    public static synchronized void b() {
        synchronized (uj.class) {
            f++;
        }
    }

    public static synchronized void c() {
        synchronized (uj.class) {
            m++;
        }
    }

    public static synchronized void d() {
        synchronized (uj.class) {
            n++;
        }
    }

    public static synchronized void e() {
        synchronized (uj.class) {
            o++;
        }
    }

    public static synchronized void f() {
        synchronized (uj.class) {
            p++;
        }
    }

    public static synchronized void g() {
        synchronized (uj.class) {
            q++;
        }
    }

    public static synchronized void h() {
        synchronized (uj.class) {
            r++;
        }
    }

    public static synchronized void i() {
        synchronized (uj.class) {
            s++;
        }
    }

    public static synchronized void j() {
        synchronized (uj.class) {
            t++;
        }
    }

    @Deprecated
    public static synchronized void a(boolean z) {
        synchronized (uj.class) {
        }
    }

    public static synchronized void k() {
        synchronized (uj.class) {
            l++;
            if (a == 0 && c == 0) {
                return;
            }
            if (uc.a || l >= 6) {
                a(true);
            }
        }
    }

    private static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "6005".equalsIgnoreCase(str.trim());
    }
}
