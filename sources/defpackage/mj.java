package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
/* compiled from: JsonReader.java */
/* renamed from: mj  reason: default package */
/* loaded from: classes3.dex */
public class mj implements Closeable {
    private static final char[] a = ")]}'\n".toCharArray();
    private final Reader b;
    private long j;
    private int k;
    private String l;
    private int n;
    private boolean c = false;
    private final char[] d = new char[1024];
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private int[] m = new int[32];

    static {
        mb.a = new mb() { // from class: mj.1
            @Override // defpackage.mb
            public void a(mj mjVar) {
                int i;
                if (mjVar instanceof lo) {
                    ((lo) mjVar).o();
                    return;
                }
                int i2 = mjVar.i;
                if (i2 == 0) {
                    i2 = mjVar.o();
                }
                if (i2 == 13) {
                    i = 9;
                } else if (i2 == 12) {
                    i = 8;
                } else if (i2 != 14) {
                    throw new IllegalStateException("Expected a name but was " + mjVar.f() + "  at line " + mjVar.u() + " column " + mjVar.v());
                } else {
                    i = 10;
                }
                mjVar.i = i;
            }
        };
    }

    public mj(Reader reader) {
        this.n = 0;
        int[] iArr = this.m;
        int i = this.n;
        this.n = i + 1;
        iArr[i] = 6;
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.b = reader;
    }

    private void a(int i) {
        int i2 = this.n;
        int[] iArr = this.m;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.m = iArr2;
        }
        int[] iArr3 = this.m;
        int i3 = this.n;
        this.n = i3 + 1;
        iArr3[i3] = i;
    }

    private boolean a(char c) {
        switch (c) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case '{':
            case '}':
                return false;
            case '#':
            case '/':
            case ';':
            case '=':
            case '\\':
                w();
                return false;
            default:
                return true;
        }
    }

    private boolean a(String str) {
        while (true) {
            if (this.e + str.length() > this.f && !b(str.length())) {
                return false;
            }
            char[] cArr = this.d;
            int i = this.e;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    if (this.d[this.e + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.g++;
            this.h = i + 1;
            this.e++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r1 != '/') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        r7.e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (r4 != r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
        r7.e--;
        r2 = b(2);
        r7.e++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r2 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        w();
        r2 = r7.e;
        r3 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r3 == '*') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
        if (r3 == '/') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
        r7.e = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
        r7.e = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
        if (a("*\/") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
        throw b("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
        if (r1 != '#') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00aa, code lost:
        r7.e = r4;
        w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
        r7.e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int b(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.d
        L2:
            int r1 = r7.e
        L4:
            int r2 = r7.f
        L6:
            r3 = 1
            if (r1 != r2) goto L40
            r7.e = r1
            boolean r1 = r7.b(r3)
            if (r1 != 0) goto L3c
            if (r8 != 0) goto L15
            r8 = -1
            return r8
        L15:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input at line "
            r0.append(r1)
            int r1 = r7.u()
            r0.append(r1)
            java.lang.String r1 = " column "
            r0.append(r1)
            int r1 = r7.v()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L3c:
            int r1 = r7.e
            int r2 = r7.f
        L40:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L50
            int r1 = r7.g
            int r1 = r1 + r3
            r7.g = r1
            r7.h = r4
            goto Lb3
        L50:
            r5 = 32
            if (r1 == r5) goto Lb3
            r5 = 13
            if (r1 == r5) goto Lb3
            r5 = 9
            if (r1 != r5) goto L5d
            goto Lb3
        L5d:
            r5 = 47
            if (r1 != r5) goto La6
            r7.e = r4
            r6 = 2
            if (r4 != r2) goto L77
            int r2 = r7.e
            int r2 = r2 - r3
            r7.e = r2
            boolean r2 = r7.b(r6)
            int r4 = r7.e
            int r4 = r4 + r3
            r7.e = r4
            if (r2 != 0) goto L77
            return r1
        L77:
            r7.w()
            int r2 = r7.e
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L8e
            if (r3 == r5) goto L85
            return r1
        L85:
            int r2 = r2 + 1
            r7.e = r2
        L89:
            r7.x()
            goto L2
        L8e:
            int r2 = r2 + 1
            r7.e = r2
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r7.a(r1)
            if (r1 == 0) goto L9f
            int r1 = r7.e
            int r1 = r1 + r6
            goto L4
        L9f:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.b(r8)
            throw r8
        La6:
            r2 = 35
            if (r1 != r2) goto Lb0
            r7.e = r4
            r7.w()
            goto L89
        Lb0:
            r7.e = r4
            return r1
        Lb3:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj.b(boolean):int");
    }

    private IOException b(String str) {
        throw new mm(str + " at line " + u() + " column " + v());
    }

    private String b(char c) {
        char[] cArr = this.d;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = this.e;
            int i2 = this.f;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.e = i3;
                        sb.append(cArr, i, (i3 - i) - 1);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.e = i3;
                        sb.append(cArr, i, (i3 - i) - 1);
                        sb.append(y());
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.g++;
                            this.h = i3;
                        }
                        i = i3;
                    }
                } else {
                    sb.append(cArr, i, i - i);
                    this.e = i;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    private boolean b(int i) {
        int i2;
        char[] cArr = this.d;
        int i3 = this.h;
        int i4 = this.e;
        this.h = i3 - i4;
        int i5 = this.f;
        if (i5 != i4) {
            this.f = i5 - i4;
            System.arraycopy(cArr, i4, cArr, 0, this.f);
        } else {
            this.f = 0;
        }
        this.e = 0;
        do {
            Reader reader = this.b;
            int i6 = this.f;
            int read = reader.read(cArr, i6, cArr.length - i6);
            if (read == -1) {
                return false;
            }
            this.f += read;
            if (this.g == 0 && (i2 = this.h) == 0 && this.f > 0 && cArr[0] == 65279) {
                this.e++;
                this.h = i2 + 1;
                i++;
            }
        } while (this.f < i);
        return true;
    }

    private void c(char c) {
        char[] cArr = this.d;
        while (true) {
            int i = this.e;
            int i2 = this.f;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.e = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.e = i3;
                        y();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.g++;
                            this.h = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.e = i;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int o() {
        int i;
        int b;
        int[] iArr = this.m;
        int i2 = this.n;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 != 2) {
            if (i3 == 3 || i3 == 5) {
                this.m[this.n - 1] = 4;
                if (i3 == 5 && (b = b(true)) != 44) {
                    if (b != 59) {
                        if (b == 125) {
                            this.i = 2;
                            return 2;
                        }
                        throw b("Unterminated object");
                    }
                    w();
                }
                int b2 = b(true);
                if (b2 == 34) {
                    i = 13;
                } else if (b2 == 39) {
                    w();
                    i = 12;
                } else if (b2 == 125) {
                    if (i3 != 5) {
                        this.i = 2;
                        return 2;
                    }
                    throw b("Expected name");
                } else {
                    w();
                    this.e--;
                    if (!a((char) b2)) {
                        throw b("Expected name");
                    }
                    i = 14;
                }
            } else if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int b3 = b(true);
                if (b3 != 58) {
                    if (b3 != 61) {
                        throw b("Expected ':'");
                    }
                    w();
                    if (this.e < this.f || b(1)) {
                        char[] cArr = this.d;
                        int i4 = this.e;
                        if (cArr[i4] == '>') {
                            this.e = i4 + 1;
                        }
                    }
                }
            } else if (i3 == 6) {
                if (this.c) {
                    z();
                }
                this.m[this.n - 1] = 7;
            } else if (i3 == 7) {
                if (b(false) == -1) {
                    i = 17;
                } else {
                    w();
                    this.e--;
                }
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
            this.i = i;
            return i;
        } else {
            int b4 = b(true);
            if (b4 != 44) {
                if (b4 != 59) {
                    if (b4 == 93) {
                        this.i = 4;
                        return 4;
                    }
                    throw b("Unterminated array");
                }
                w();
            }
        }
        int b5 = b(true);
        if (b5 != 34) {
            if (b5 == 39) {
                w();
                this.i = 8;
                return 8;
            }
            if (b5 != 44 && b5 != 59) {
                if (b5 == 91) {
                    this.i = 3;
                    return 3;
                } else if (b5 != 93) {
                    if (b5 == 123) {
                        this.i = 1;
                        return 1;
                    }
                    this.e--;
                    if (this.n == 1) {
                        w();
                    }
                    int q = q();
                    if (q != 0) {
                        return q;
                    }
                    int r = r();
                    if (r != 0) {
                        return r;
                    }
                    if (!a(this.d[this.e])) {
                        throw b("Expected value");
                    }
                    w();
                    i = 10;
                } else if (i3 == 1) {
                    this.i = 4;
                    return 4;
                }
            }
            if (i3 == 1 || i3 == 2) {
                w();
                this.e--;
                this.i = 7;
                return 7;
            }
            throw b("Unexpected value");
        }
        if (this.n == 1) {
            w();
        }
        i = 9;
        this.i = i;
        return i;
    }

    private int q() {
        String str;
        String str2;
        int i;
        char c = this.d[this.e];
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.e + i2 >= this.f && !b(i2 + 1)) {
                return 0;
            }
            char c2 = this.d[this.e + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.e + length < this.f || b(length + 1)) && a(this.d[this.e + length])) {
            return 0;
        }
        this.e += length;
        this.i = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0093, code lost:
        if (a(r14) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0095, code lost:
        if (r9 != 2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0097, code lost:
        if (r10 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009d, code lost:
        if (r11 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009f, code lost:
        if (r13 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a1, code lost:
        if (r13 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a4, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a5, code lost:
        r18.j = r11;
        r18.e += r3;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
        r18.i = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b1, code lost:
        if (r9 == 2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b4, code lost:
        if (r9 == 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b7, code lost:
        if (r9 != 7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ba, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bc, code lost:
        r18.k = r3;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c1, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int r() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj.r():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String s() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = r1
        L3:
            r1 = r0
        L4:
            int r3 = r6.e
            int r4 = r3 + r1
            int r5 = r6.f
            if (r4 >= r5) goto L1b
            char[] r4 = r6.d
            int r3 = r3 + r1
            char r3 = r4[r3]
            switch(r3) {
                case 9: goto L29;
                case 10: goto L29;
                case 12: goto L29;
                case 13: goto L29;
                case 32: goto L29;
                case 35: goto L17;
                case 44: goto L29;
                case 47: goto L17;
                case 58: goto L29;
                case 59: goto L17;
                case 61: goto L17;
                case 91: goto L29;
                case 92: goto L17;
                case 93: goto L29;
                case 123: goto L29;
                case 125: goto L29;
                default: goto L14;
            }
        L14:
            int r1 = r1 + 1
            goto L4
        L17:
            r6.w()
            goto L29
        L1b:
            char[] r3 = r6.d
            int r3 = r3.length
            if (r1 >= r3) goto L2b
            int r3 = r1 + 1
            boolean r3 = r6.b(r3)
            if (r3 == 0) goto L29
            goto L4
        L29:
            r0 = r1
            goto L45
        L2b:
            if (r2 != 0) goto L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L32:
            char[] r3 = r6.d
            int r4 = r6.e
            r2.append(r3, r4, r1)
            int r3 = r6.e
            int r3 = r3 + r1
            r6.e = r3
            r1 = 1
            boolean r1 = r6.b(r1)
            if (r1 != 0) goto L3
        L45:
            if (r2 != 0) goto L51
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.d
            int r3 = r6.e
            r1.<init>(r2, r3, r0)
            goto L5c
        L51:
            char[] r1 = r6.d
            int r3 = r6.e
            r2.append(r1, r3, r0)
            java.lang.String r1 = r2.toString()
        L5c:
            int r2 = r6.e
            int r2 = r2 + r0
            r6.e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj.s():java.lang.String");
    }

    private void t() {
        do {
            int i = 0;
            while (true) {
                int i2 = this.e;
                if (i2 + i < this.f) {
                    switch (this.d[i2 + i]) {
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                        case ' ':
                        case ',':
                        case ':':
                        case '[':
                        case ']':
                        case '{':
                        case '}':
                            break;
                        case '#':
                        case '/':
                        case ';':
                        case '=':
                        case '\\':
                            w();
                            break;
                        default:
                            i++;
                    }
                } else {
                    this.e = i2 + i;
                }
            }
            this.e += i;
            return;
        } while (b(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u() {
        return this.g + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v() {
        return (this.e - this.h) + 1;
    }

    private void w() {
        if (!this.c) {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void x() {
        char c;
        do {
            if (this.e >= this.f && !b(1)) {
                return;
            }
            char[] cArr = this.d;
            int i = this.e;
            this.e = i + 1;
            c = cArr[i];
            if (c == '\n') {
                this.g++;
                this.h = this.e;
                return;
            }
        } while (c != '\r');
    }

    private char y() {
        int i;
        int i2;
        if (this.e != this.f || b(1)) {
            char[] cArr = this.d;
            int i3 = this.e;
            this.e = i3 + 1;
            char c = cArr[i3];
            if (c != '\n') {
                if (c != 'b') {
                    if (c != 'f') {
                        if (c != 'n') {
                            if (c != 'r') {
                                switch (c) {
                                    case 't':
                                        return '\t';
                                    case 'u':
                                        if (this.e + 4 <= this.f || b(4)) {
                                            char c2 = 0;
                                            int i4 = this.e;
                                            int i5 = i4 + 4;
                                            while (i4 < i5) {
                                                char c3 = this.d[i4];
                                                char c4 = (char) (c2 << 4);
                                                if (c3 < '0' || c3 > '9') {
                                                    if (c3 >= 'a' && c3 <= 'f') {
                                                        i = c3 - 'a';
                                                    } else if (c3 < 'A' || c3 > 'F') {
                                                        throw new NumberFormatException("\\u" + new String(this.d, this.e, 4));
                                                    } else {
                                                        i = c3 - 'A';
                                                    }
                                                    i2 = i + 10;
                                                } else {
                                                    i2 = c3 - '0';
                                                }
                                                c2 = (char) (c4 + i2);
                                                i4++;
                                            }
                                            this.e += 4;
                                            return c2;
                                        }
                                        throw b("Unterminated escape sequence");
                                }
                            }
                            return '\r';
                        }
                        return '\n';
                    }
                    return '\f';
                }
                return '\b';
            }
            this.g++;
            this.h = this.e;
            return c;
        }
        throw b("Unterminated escape sequence");
    }

    private void z() {
        b(true);
        this.e--;
        int i = this.e;
        char[] cArr = a;
        if (i + cArr.length > this.f && !b(cArr.length)) {
            return;
        }
        int i2 = 0;
        while (true) {
            char[] cArr2 = a;
            if (i2 >= cArr2.length) {
                this.e += cArr2.length;
                return;
            } else if (this.d[this.e + i2] != cArr2[i2]) {
                return;
            } else {
                i2++;
            }
        }
    }

    public void a() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 3) {
            a(1);
            this.i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + f() + " at line " + u() + " column " + v());
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public void b() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 4) {
            this.n--;
            this.i = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + f() + " at line " + u() + " column " + v());
    }

    public void c() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 1) {
            a(3);
            this.i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + f() + " at line " + u() + " column " + v());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.i = 0;
        this.m[0] = 8;
        this.n = 1;
        this.b.close();
    }

    public void d() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 2) {
            this.n--;
            this.i = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + f() + " at line " + u() + " column " + v());
    }

    public boolean e() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public ml f() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        switch (i) {
            case 1:
                return ml.BEGIN_OBJECT;
            case 2:
                return ml.END_OBJECT;
            case 3:
                return ml.BEGIN_ARRAY;
            case 4:
                return ml.END_ARRAY;
            case 5:
            case 6:
                return ml.BOOLEAN;
            case 7:
                return ml.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return ml.STRING;
            case 12:
            case 13:
            case 14:
                return ml.NAME;
            case 15:
            case 16:
                return ml.NUMBER;
            case 17:
                return ml.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String g() {
        char c;
        String b;
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 14) {
            b = s();
        } else {
            if (i == 12) {
                c = '\'';
            } else if (i != 13) {
                throw new IllegalStateException("Expected a name but was " + f() + " at line " + u() + " column " + v());
            } else {
                c = '\"';
            }
            b = b(c);
        }
        this.i = 0;
        return b;
    }

    public String h() {
        String str;
        char c;
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 10) {
            str = s();
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                str = this.l;
                this.l = null;
            } else if (i == 15) {
                str = Long.toString(this.j);
            } else if (i != 16) {
                throw new IllegalStateException("Expected a string but was " + f() + " at line " + u() + " column " + v());
            } else {
                str = new String(this.d, this.e, this.k);
                this.e += this.k;
            }
            str = b(c);
        }
        this.i = 0;
        return str;
    }

    public boolean i() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 5) {
            this.i = 0;
            return true;
        } else if (i == 6) {
            this.i = 0;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + f() + " at line " + u() + " column " + v());
        }
    }

    public void j() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 7) {
            this.i = 0;
            return;
        }
        throw new IllegalStateException("Expected null but was " + f() + " at line " + u() + " column " + v());
    }

    public double k() {
        String b;
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 15) {
            this.i = 0;
            return this.j;
        }
        if (i == 16) {
            this.l = new String(this.d, this.e, this.k);
            this.e += this.k;
        } else {
            if (i == 8 || i == 9) {
                b = b(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                b = s();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + f() + " at line " + u() + " column " + v());
            }
            this.l = b;
        }
        this.i = 11;
        double parseDouble = Double.parseDouble(this.l);
        if (this.c || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            this.l = null;
            this.i = 0;
            return parseDouble;
        }
        throw new mm("JSON forbids NaN and infinities: " + parseDouble + " at line " + u() + " column " + v());
    }

    public long l() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 15) {
            this.i = 0;
            return this.j;
        }
        if (i == 16) {
            this.l = new String(this.d, this.e, this.k);
            this.e += this.k;
        } else if (i != 8 && i != 9) {
            throw new IllegalStateException("Expected a long but was " + f() + " at line " + u() + " column " + v());
        } else {
            this.l = b(i == 8 ? '\'' : '\"');
            try {
                long parseLong = Long.parseLong(this.l);
                this.i = 0;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double parseDouble = Double.parseDouble(this.l);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.l = null;
            this.i = 0;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.l + " at line " + u() + " column " + v());
    }

    public int m() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 15) {
            long j = this.j;
            int i2 = (int) j;
            if (j == i2) {
                this.i = 0;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.j + " at line " + u() + " column " + v());
        }
        if (i == 16) {
            this.l = new String(this.d, this.e, this.k);
            this.e += this.k;
        } else if (i != 8 && i != 9) {
            throw new IllegalStateException("Expected an int but was " + f() + " at line " + u() + " column " + v());
        } else {
            this.l = b(i == 8 ? '\'' : '\"');
            try {
                int parseInt = Integer.parseInt(this.l);
                this.i = 0;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double parseDouble = Double.parseDouble(this.l);
        int i3 = (int) parseDouble;
        if (i3 == parseDouble) {
            this.l = null;
            this.i = 0;
            return i3;
        }
        throw new NumberFormatException("Expected an int but was " + this.l + " at line " + u() + " column " + v());
    }

    public void n() {
        char c;
        int i = 0;
        do {
            int i2 = this.i;
            if (i2 == 0) {
                i2 = o();
            }
            if (i2 == 3) {
                a(1);
            } else if (i2 == 1) {
                a(3);
            } else {
                if (i2 == 4 || i2 == 2) {
                    this.n--;
                    i--;
                } else if (i2 == 14 || i2 == 10) {
                    t();
                } else {
                    if (i2 == 8 || i2 == 12) {
                        c = '\'';
                    } else if (i2 == 9 || i2 == 13) {
                        c = '\"';
                    } else if (i2 == 16) {
                        this.e += this.k;
                    }
                    c(c);
                }
                this.i = 0;
            }
            i++;
            this.i = 0;
        } while (i != 0);
    }

    public final boolean p() {
        return this.c;
    }

    public String toString() {
        return getClass().getSimpleName() + " at line " + u() + " column " + v();
    }
}
