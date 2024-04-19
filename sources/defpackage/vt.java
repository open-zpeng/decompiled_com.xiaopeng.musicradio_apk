package defpackage;

import defpackage.uo;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: UploadTask.java */
/* renamed from: vt  reason: default package */
/* loaded from: classes3.dex */
public abstract class vt implements Runnable {
    private static volatile boolean a = false;
    static int c = 0;
    private static boolean f = false;
    int b = -1;
    float d = 200.0f;
    int e = 0;

    public abstract void a();

    public abstract void b();

    @Override // java.lang.Runnable
    public void run() {
        try {
            d();
            a();
        } catch (Throwable unused) {
        }
    }

    public static boolean c() {
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f8, code lost:
        defpackage.vt.a = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fb, code lost:
        defpackage.vt.a = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d() {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt.d():void");
    }

    private int a(List<vo> list) {
        if (list == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2).b;
            if (str != null && "6005".equalsIgnoreCase(str.toString())) {
                i++;
            }
        }
        return i;
    }

    private int e() {
        if (this.b == -1) {
            String a2 = uz.a();
            if ("wifi".equalsIgnoreCase(a2)) {
                this.b = 20;
            } else if ("4G".equalsIgnoreCase(a2)) {
                this.b = 16;
            } else if ("3G".equalsIgnoreCase(a2)) {
                this.b = 12;
            } else {
                this.b = 8;
            }
        }
        return this.b;
    }

    private uo.a a(String str, Map<String, Object> map) {
        if (str != null) {
            byte[] bArr = us.a(2, str, map, false).b;
            uw.a("UploadTask", "url:", str);
            if (bArr != null) {
                String str2 = null;
                try {
                    str2 = new String(bArr, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                if (str2 != null) {
                    uw.a("UploadTask", "result:", str2);
                    return uo.a(str2);
                }
            }
        }
        return uo.a.c;
    }

    private int a(Boolean bool, long j) {
        if (j < 0) {
            return this.b;
        }
        float f2 = this.e / ((float) j);
        if (!bool.booleanValue()) {
            this.b /= 2;
            c++;
        } else if (j > 45000) {
            return this.b;
        } else {
            this.b = (int) (((f2 * 45000.0f) / this.d) - c);
        }
        int i = this.b;
        if (i < 1) {
            this.b = 1;
            c = 0;
        } else if (i > 350) {
            this.b = 350;
        }
        uw.a("UploadTask", "winsize:", Integer.valueOf(this.b));
        return this.b;
    }

    private Map<String, Object> b(List<vo> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            List<String> a2 = a(list.get(i));
            if (a2 != null) {
                for (int i2 = 0; i2 < a2.size(); i2++) {
                    StringBuilder sb = (StringBuilder) hashMap.get(a2.get(i2));
                    if (sb == null) {
                        sb = new StringBuilder();
                        hashMap.put(a2.get(i2), sb);
                    } else {
                        sb.append("\n");
                    }
                    sb.append(list.get(i).a());
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        this.e = 0;
        for (String str : hashMap.keySet()) {
            byte[] a3 = a(((StringBuilder) hashMap.get(str)).toString());
            hashMap2.put(str, a3);
            this.e += a3.length;
        }
        this.d = this.e / list.size();
        uw.a("UploadTask", "averagePackageSize:", Float.valueOf(this.d));
        return hashMap2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|2|3|4|(3:6|7|8)|9|11|12|13|14|15|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] a(java.lang.String r4) {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            java.lang.String r1 = "UTF-8"
            byte[] r4 = r4.getBytes(r1)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r2.write(r4)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r2.flush()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r2.close()     // Catch: java.lang.Exception -> L2c
            goto L2c
        L1b:
            r4 = move-exception
            goto L3a
        L1d:
            r4 = move-exception
            r1 = r2
            goto L24
        L20:
            r4 = move-exception
            r2 = r1
            goto L3a
        L23:
            r4 = move-exception
        L24:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            r1.close()     // Catch: java.lang.Exception -> L2c
        L2c:
            byte[] r4 = r0.toByteArray()
            java.lang.String r1 = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK"
            byte[] r4 = defpackage.vb.a(r4, r1)
            r0.close()     // Catch: java.lang.Exception -> L39
        L39:
            return r4
        L3a:
            if (r2 == 0) goto L3f
            r2.close()     // Catch: java.lang.Exception -> L3f
        L3f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt.a(java.lang.String):byte[]");
    }

    private List<String> a(vo voVar) {
        return ud.b(voVar.b);
    }
}
