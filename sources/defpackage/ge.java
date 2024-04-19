package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Locale;
/* compiled from: BidiFormatter.java */
/* renamed from: ge  reason: default package */
/* loaded from: classes3.dex */
public final class ge {
    private final boolean f;
    private final int g;
    private final gh h;
    static final gh a = gi.c;
    private static final String d = Character.toString(8206);
    private static final String e = Character.toString(8207);
    static final ge b = new ge(false, 2, a);
    static final ge c = new ge(true, 2, a);

    /* compiled from: BidiFormatter.java */
    /* renamed from: ge$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private boolean a;
        private int b;
        private gh c;

        public a() {
            a(ge.a(Locale.getDefault()));
        }

        private void a(boolean z) {
            this.a = z;
            this.c = ge.a;
            this.b = 2;
        }

        private static ge b(boolean z) {
            return z ? ge.c : ge.b;
        }

        public ge a() {
            if (this.b == 2 && this.c == ge.a) {
                return b(this.a);
            }
            return new ge(this.a, this.b, this.c);
        }
    }

    public static ge a() {
        return new a().a();
    }

    ge(boolean z, int i, gh ghVar) {
        this.f = z;
        this.g = i;
        this.h = ghVar;
    }

    public boolean b() {
        return (this.g & 2) != 0;
    }

    private String a(CharSequence charSequence, gh ghVar) {
        boolean a2 = ghVar.a(charSequence, 0, charSequence.length());
        if (this.f || !(a2 || b(charSequence) == 1)) {
            return this.f ? (!a2 || b(charSequence) == -1) ? e : "" : "";
        }
        return d;
    }

    private String b(CharSequence charSequence, gh ghVar) {
        boolean a2 = ghVar.a(charSequence, 0, charSequence.length());
        if (this.f || !(a2 || c(charSequence) == 1)) {
            return this.f ? (!a2 || c(charSequence) == -1) ? e : "" : "";
        }
        return d;
    }

    public String a(String str, gh ghVar, boolean z) {
        if (str == null) {
            return null;
        }
        return a((CharSequence) str, ghVar, z).toString();
    }

    public CharSequence a(CharSequence charSequence, gh ghVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a2 = ghVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (b() && z) {
            spannableStringBuilder.append((CharSequence) b(charSequence, a2 ? gi.b : gi.a));
        }
        if (a2 != this.f) {
            spannableStringBuilder.append(a2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) a(charSequence, a2 ? gi.b : gi.a));
        }
        return spannableStringBuilder;
    }

    public String a(String str) {
        return a(str, this.h, true);
    }

    public CharSequence a(CharSequence charSequence) {
        return a(charSequence, this.h, true);
    }

    static boolean a(Locale locale) {
        return gj.a(locale) == 1;
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).b();
    }

    private static int c(CharSequence charSequence) {
        return new b(charSequence, false).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BidiFormatter.java */
    /* renamed from: ge$b */
    /* loaded from: classes3.dex */
    public static class b {
        private static final byte[] a = new byte[1792];
        private final CharSequence b;
        private final boolean c;
        private final int d;
        private int e;
        private char f;

        static {
            for (int i = 0; i < 1792; i++) {
                a[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.b = charSequence;
            this.c = z;
            this.d = charSequence.length();
        }

        int a() {
            this.e = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.e < this.d && i == 0) {
                byte c = c();
                if (c != 9) {
                    switch (c) {
                        case 0:
                            if (i3 == 0) {
                                return -1;
                            }
                            i = i3;
                            break;
                        case 1:
                        case 2:
                            if (i3 == 0) {
                                return 1;
                            }
                            i = i3;
                            break;
                        default:
                            switch (c) {
                                case 14:
                                case 15:
                                    i3++;
                                    i2 = -1;
                                    break;
                                case 16:
                                case 17:
                                    i3++;
                                    i2 = 1;
                                    break;
                                case 18:
                                    i3--;
                                    i2 = 0;
                                    break;
                                default:
                                    i = i3;
                                    break;
                            }
                    }
                }
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.e > 0) {
                switch (d()) {
                    case 14:
                    case 15:
                        if (i != i3) {
                            i3--;
                            break;
                        } else {
                            return -1;
                        }
                    case 16:
                    case 17:
                        if (i != i3) {
                            i3--;
                            break;
                        } else {
                            return 1;
                        }
                    case 18:
                        i3++;
                        break;
                }
            }
            return 0;
        }

        int b() {
            this.e = this.d;
            int i = 0;
            int i2 = 0;
            while (this.e > 0) {
                byte d = d();
                if (d != 9) {
                    switch (d) {
                        case 0:
                            if (i2 != 0) {
                                if (i != 0) {
                                    break;
                                } else {
                                    i = i2;
                                    break;
                                }
                            } else {
                                return -1;
                            }
                        case 1:
                        case 2:
                            if (i2 != 0) {
                                if (i != 0) {
                                    break;
                                } else {
                                    i = i2;
                                    break;
                                }
                            } else {
                                return 1;
                            }
                        default:
                            switch (d) {
                                case 14:
                                case 15:
                                    if (i != i2) {
                                        i2--;
                                        break;
                                    } else {
                                        return -1;
                                    }
                                case 16:
                                case 17:
                                    if (i != i2) {
                                        i2--;
                                        break;
                                    } else {
                                        return 1;
                                    }
                                case 18:
                                    i2++;
                                    break;
                                default:
                                    if (i != 0) {
                                        break;
                                    } else {
                                        i = i2;
                                        break;
                                    }
                            }
                    }
                }
            }
            return 0;
        }

        private static byte a(char c) {
            return c < 1792 ? a[c] : Character.getDirectionality(c);
        }

        byte c() {
            this.f = this.b.charAt(this.e);
            if (Character.isHighSurrogate(this.f)) {
                int codePointAt = Character.codePointAt(this.b, this.e);
                this.e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.e++;
            byte a2 = a(this.f);
            if (this.c) {
                char c = this.f;
                if (c == '<') {
                    return e();
                }
                return c == '&' ? g() : a2;
            }
            return a2;
        }

        byte d() {
            this.f = this.b.charAt(this.e - 1);
            if (Character.isLowSurrogate(this.f)) {
                int codePointBefore = Character.codePointBefore(this.b, this.e);
                this.e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.e--;
            byte a2 = a(this.f);
            if (this.c) {
                char c = this.f;
                if (c == '>') {
                    return f();
                }
                return c == ';' ? h() : a2;
            }
            return a2;
        }

        private byte e() {
            char charAt;
            int i = this.e;
            while (true) {
                int i2 = this.e;
                if (i2 < this.d) {
                    CharSequence charSequence = this.b;
                    this.e = i2 + 1;
                    this.f = charSequence.charAt(i2);
                    char c = this.f;
                    if (c == '>') {
                        return (byte) 12;
                    }
                    if (c == '\"' || c == '\'') {
                        char c2 = this.f;
                        do {
                            int i3 = this.e;
                            if (i3 < this.d) {
                                CharSequence charSequence2 = this.b;
                                this.e = i3 + 1;
                                charAt = charSequence2.charAt(i3);
                                this.f = charAt;
                            }
                        } while (charAt != c2);
                    }
                } else {
                    this.e = i;
                    this.f = '<';
                    return (byte) 13;
                }
            }
        }

        private byte f() {
            char charAt;
            int i = this.e;
            while (true) {
                int i2 = this.e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.b;
                int i3 = i2 - 1;
                this.e = i3;
                this.f = charSequence.charAt(i3);
                char c = this.f;
                if (c == '<') {
                    return (byte) 12;
                }
                if (c == '>') {
                    break;
                } else if (c == '\"' || c == '\'') {
                    char c2 = this.f;
                    do {
                        int i4 = this.e;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.b;
                            int i5 = i4 - 1;
                            this.e = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f = charAt;
                        }
                    } while (charAt != c2);
                }
            }
            this.e = i;
            this.f = '>';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i = this.e;
                if (i >= this.d) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.b;
                this.e = i + 1;
                charAt = charSequence.charAt(i);
                this.f = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char c;
            int i = this.e;
            do {
                int i2 = this.e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.b;
                int i3 = i2 - 1;
                this.e = i3;
                this.f = charSequence.charAt(i3);
                c = this.f;
                if (c == '&') {
                    return (byte) 12;
                }
            } while (c != ';');
            this.e = i;
            this.f = ';';
            return (byte) 13;
        }
    }
}
