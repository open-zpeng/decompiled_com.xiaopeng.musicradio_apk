package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
/* compiled from: JsonWriter.java */
/* renamed from: mk  reason: default package */
/* loaded from: classes3.dex */
public class mk implements Closeable, Flushable {
    private static final String[] a = new String[128];
    private static final String[] b;
    private final Writer c;
    private int[] d = new int[32];
    private int e = 0;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private boolean k;

    static {
        for (int i = 0; i <= 31; i++) {
            a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        b = (String[]) strArr.clone();
        String[] strArr2 = b;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public mk(Writer writer) {
        a(6);
        this.g = ":";
        this.k = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.c = writer;
    }

    private int a() {
        int i = this.e;
        if (i != 0) {
            return this.d[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private mk a(int i, int i2, String str) {
        int a2 = a();
        if (a2 == i2 || a2 == i) {
            if (this.j != null) {
                throw new IllegalStateException("Dangling name: " + this.j);
            }
            this.e--;
            if (a2 == i2) {
                k();
            }
            this.c.write(str);
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    private mk a(int i, String str) {
        e(true);
        a(i);
        this.c.write(str);
        return this;
    }

    private void a(int i) {
        int i2 = this.e;
        int[] iArr = this.d;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.d = iArr2;
        }
        int[] iArr3 = this.d;
        int i3 = this.e;
        this.e = i3 + 1;
        iArr3[i3] = i;
    }

    private void b(int i) {
        this.d[this.e - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7.i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.mk.b
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.mk.a
        L9:
            java.io.Writer r1 = r7.c
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r8.length()
            r2 = 0
            r3 = r2
        L16:
            if (r2 >= r1) goto L45
            char r4 = r8.charAt(r2)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 >= r5) goto L25
            r4 = r0[r4]
            if (r4 != 0) goto L32
            goto L42
        L25:
            r5 = 8232(0x2028, float:1.1535E-41)
            if (r4 != r5) goto L2c
            java.lang.String r4 = "\\u2028"
            goto L32
        L2c:
            r5 = 8233(0x2029, float:1.1537E-41)
            if (r4 != r5) goto L42
            java.lang.String r4 = "\\u2029"
        L32:
            if (r3 >= r2) goto L3b
            java.io.Writer r5 = r7.c
            int r6 = r2 - r3
            r5.write(r8, r3, r6)
        L3b:
            java.io.Writer r3 = r7.c
            r3.write(r4)
            int r3 = r2 + 1
        L42:
            int r2 = r2 + 1
            goto L16
        L45:
            if (r3 >= r1) goto L4d
            java.io.Writer r0 = r7.c
            int r1 = r1 - r3
            r0.write(r8, r3, r1)
        L4d:
            java.io.Writer r8 = r7.c
            java.lang.String r0 = "\""
            r8.write(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mk.d(java.lang.String):void");
    }

    private void e(boolean z) {
        int i;
        switch (a()) {
            case 1:
                b(2);
                k();
                return;
            case 2:
                this.c.append(',');
                k();
                return;
            case 3:
            case 5:
            default:
                throw new IllegalStateException("Nesting problem.");
            case 4:
                this.c.append((CharSequence) this.g);
                i = 5;
                b(i);
                return;
            case 6:
                if (this.h && !z) {
                    throw new IllegalStateException("JSON must start with an array or an object.");
                }
                i = 7;
                b(i);
                return;
            case 7:
                if (!this.h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                if (this.h) {
                }
                i = 7;
                b(i);
                return;
        }
    }

    private void j() {
        if (this.j != null) {
            l();
            d(this.j);
            this.j = null;
        }
    }

    private void k() {
        if (this.f == null) {
            return;
        }
        this.c.write("\n");
        int i = this.e;
        for (int i2 = 1; i2 < i; i2++) {
            this.c.write(this.f);
        }
    }

    private void l() {
        int a2 = a();
        if (a2 == 5) {
            this.c.write(44);
        } else if (a2 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        k();
        b(4);
    }

    public mk a(long j) {
        j();
        e(false);
        this.c.write(Long.toString(j));
        return this;
    }

    public mk a(Number number) {
        if (number == null) {
            return f();
        }
        j();
        String obj = number.toString();
        if (this.h || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            e(false);
            this.c.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public mk a(String str) {
        if (str != null) {
            if (this.j == null) {
                if (this.e != 0) {
                    this.j = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public mk a(boolean z) {
        j();
        e(false);
        this.c.write(z ? "true" : "false");
        return this;
    }

    public mk b() {
        j();
        return a(1, "[");
    }

    public mk b(String str) {
        if (str == null) {
            return f();
        }
        j();
        e(false);
        d(str);
        return this;
    }

    public final void b(boolean z) {
        this.h = z;
    }

    public mk c() {
        return a(1, 2, "]");
    }

    public final void c(String str) {
        String str2;
        if (str.length() == 0) {
            this.f = null;
            str2 = ":";
        } else {
            this.f = str;
            str2 = ": ";
        }
        this.g = str2;
    }

    public final void c(boolean z) {
        this.i = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
        int i = this.e;
        if (i > 1 || (i == 1 && this.d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.e = 0;
    }

    public mk d() {
        j();
        return a(3, "{");
    }

    public final void d(boolean z) {
        this.k = z;
    }

    public mk e() {
        return a(3, 5, "}");
    }

    public mk f() {
        if (this.j != null) {
            if (!this.k) {
                this.j = null;
                return this;
            }
            j();
        }
        e(false);
        this.c.write("null");
        return this;
    }

    public void flush() {
        if (this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.c.flush();
    }

    public boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.i;
    }

    public final boolean i() {
        return this.k;
    }
}
