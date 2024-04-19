package defpackage;

import java.io.Writer;
/* compiled from: Streams.java */
/* renamed from: mg  reason: default package */
/* loaded from: classes3.dex */
public final class mg {

    /* compiled from: Streams.java */
    /* renamed from: mg$a */
    /* loaded from: classes3.dex */
    private static final class a extends Writer {
        private final Appendable a;
        private final C0194a b;

        /* compiled from: Streams.java */
        /* renamed from: mg$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static class C0194a implements CharSequence {
            char[] a;

            C0194a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.a[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.a, i, i2 - i);
            }
        }

        private a(Appendable appendable) {
            this.b = new C0194a();
            this.a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i) {
            this.a.append((char) i);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            C0194a c0194a = this.b;
            c0194a.a = cArr;
            this.a.append(c0194a, i, i2 + i);
        }
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    public static void a(ne neVar, mk mkVar) {
        lx.P.a(mkVar, neVar);
    }
}
