package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
/* compiled from: Coders.java */
/* renamed from: bjn  reason: default package */
/* loaded from: classes3.dex */
class bjn {
    private static final Map<bjt, bjm> a = new HashMap<bjt, bjm>() { // from class: bjn.1
        private static final long serialVersionUID = 1664829131806520867L;

        {
            put(bjt.COPY, new c());
            put(bjt.LZMA, new e());
            put(bjt.LZMA2, new bjq());
            put(bjt.DEFLATE, new d());
            put(bjt.BZIP2, new b());
            put(bjt.AES256SHA256, new bji());
            put(bjt.BCJ_X86_FILTER, new a(new boc()));
            put(bjt.BCJ_PPC_FILTER, new a(new bnx()));
            put(bjt.BCJ_IA64_FILTER, new a(new bnu()));
            put(bjt.BCJ_ARM_FILTER, new a(new bnm()));
            put(bjt.BCJ_ARM_THUMB_FILTER, new a(new bnn()));
            put(bjt.BCJ_SPARC_FILTER, new a(new bny()));
            put(bjt.DELTA_FILTER, new bjo());
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bjm a(bjt bjtVar) {
        return a.get(bjtVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OutputStream a(OutputStream outputStream, bjt bjtVar, Object obj) {
        bjm a2 = a(bjtVar);
        if (a2 == null) {
            throw new IOException("Unsupported compression method " + bjtVar);
        }
        return a2.a(outputStream, obj);
    }

    /* compiled from: Coders.java */
    /* renamed from: bjn$c */
    /* loaded from: classes3.dex */
    static class c extends bjm {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.bjm
        public OutputStream a(OutputStream outputStream, Object obj) {
            return outputStream;
        }

        c() {
            super(new Class[0]);
        }
    }

    /* compiled from: Coders.java */
    /* renamed from: bjn$e */
    /* loaded from: classes3.dex */
    static class e extends bjm {
        e() {
            super(new Class[0]);
        }
    }

    /* compiled from: Coders.java */
    /* renamed from: bjn$a */
    /* loaded from: classes3.dex */
    static class a extends bjm {
        private final bnr a;

        a(bnr bnrVar) {
            super(new Class[0]);
            this.a = bnrVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.bjm
        public OutputStream a(OutputStream outputStream, Object obj) {
            return new FilterOutputStream(this.a.a(new bnt(outputStream))) { // from class: bjn.a.1
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
                public void flush() {
                }
            };
        }
    }

    /* compiled from: Coders.java */
    /* renamed from: bjn$d */
    /* loaded from: classes3.dex */
    static class d extends bjm {
        d() {
            super(Number.class);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.bjm
        public OutputStream a(OutputStream outputStream, Object obj) {
            final Deflater deflater = new Deflater(a(obj, 9), true);
            final DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(outputStream, deflater);
            return new OutputStream() { // from class: bjn.d.1
                @Override // java.io.OutputStream
                public void write(int i) {
                    deflaterOutputStream.write(i);
                }

                @Override // java.io.OutputStream
                public void write(byte[] bArr) {
                    deflaterOutputStream.write(bArr);
                }

                @Override // java.io.OutputStream
                public void write(byte[] bArr, int i, int i2) {
                    deflaterOutputStream.write(bArr, i, i2);
                }

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    try {
                        deflaterOutputStream.close();
                    } finally {
                        deflater.end();
                    }
                }
            };
        }
    }

    /* compiled from: Coders.java */
    /* renamed from: bjn$b */
    /* loaded from: classes3.dex */
    static class b extends bjm {
        b() {
            super(Number.class);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.bjm
        public OutputStream a(OutputStream outputStream, Object obj) {
            return new bjy(outputStream, a(obj, 9));
        }
    }
}
