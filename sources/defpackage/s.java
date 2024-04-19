package defpackage;

import java.util.HashMap;
/* compiled from: NativeResourcesUtil.java */
/* renamed from: s  reason: default package */
/* loaded from: classes3.dex */
public class s {
    public static boolean a = false;
    private static HashMap<Long, a> b = new HashMap<>();
    private static HashMap<Long, a> c = new HashMap<>();
    private static HashMap<Long, String> d = new HashMap<>();

    public static void a(final long j, final String str) {
        if (a) {
            t.a(new Runnable() { // from class: s.1
                @Override // java.lang.Runnable
                public void run() {
                    s.d.put(Long.valueOf(j), str);
                }
            });
        }
    }

    public static void a(final long j, final long j2, final int i, final int i2, final int i3) {
        if (a) {
            t.a(new Runnable() { // from class: s.2
                @Override // java.lang.Runnable
                public void run() {
                    s.b.put(Long.valueOf(j2), new a(j, j2, i, i2, i3));
                }
            });
        }
    }

    public static void a(final long j) {
        if (a) {
            t.a(new Runnable() { // from class: s.3
                @Override // java.lang.Runnable
                public void run() {
                    s.b.remove(Long.valueOf(j));
                }
            });
        }
    }

    public static void a(final long j, final int i, final int i2, final int i3) {
        if (a) {
            t.a(new Runnable() { // from class: s.4
                @Override // java.lang.Runnable
                public void run() {
                    HashMap hashMap = s.c;
                    Long valueOf = Long.valueOf(j);
                    long j2 = j;
                    hashMap.put(valueOf, new a(j2, j2, i, i2, i3));
                }
            });
        }
    }

    public static void b(final long j) {
        if (a) {
            t.a(new Runnable() { // from class: s.5
                @Override // java.lang.Runnable
                public void run() {
                    s.c.remove(Long.valueOf(j));
                    s.d.remove(Long.valueOf(j));
                }
            });
        }
    }

    /* compiled from: NativeResourcesUtil.java */
    /* renamed from: s$a */
    /* loaded from: classes3.dex */
    public static class a {
        public long a;
        public long b;
        public int c;
        public int d;
        public int e;

        public a(long j, long j2, int i, int i2, int i3) {
            this.a = j;
            this.b = j2;
            this.c = i;
            this.d = i2;
            this.e = i3;
        }
    }
}
