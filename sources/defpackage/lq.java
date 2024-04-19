package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: JsonTreeWriter.java */
/* renamed from: lq  reason: default package */
/* loaded from: classes3.dex */
public final class lq extends mk {
    private static final Writer a = new Writer() { // from class: lq.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    private static final mz b = new mz("closed");
    private final List<ne> c;
    private String d;
    private ne e;

    public lq() {
        super(a);
        this.c = new ArrayList();
        this.e = mv.a;
    }

    private void a(ne neVar) {
        if (this.d != null) {
            if (!neVar.n() || i()) {
                ((mx) j()).a(this.d, neVar);
            }
            this.d = null;
        } else if (this.c.isEmpty()) {
            this.e = neVar;
        } else {
            ne j = j();
            if (!(j instanceof mt)) {
                throw new IllegalStateException();
            }
            ((mt) j).a(neVar);
        }
    }

    private ne j() {
        List<ne> list = this.c;
        return list.get(list.size() - 1);
    }

    @Override // defpackage.mk
    public mk a(long j) {
        a(new mz(Long.valueOf(j)));
        return this;
    }

    @Override // defpackage.mk
    public mk a(Number number) {
        if (number == null) {
            return f();
        }
        if (!g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        a(new mz(number));
        return this;
    }

    @Override // defpackage.mk
    public mk a(String str) {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        if (j() instanceof mx) {
            this.d = str;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.mk
    public mk a(boolean z) {
        a(new mz(Boolean.valueOf(z)));
        return this;
    }

    public ne a() {
        if (this.c.isEmpty()) {
            return this.e;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.c);
    }

    @Override // defpackage.mk
    public mk b() {
        mt mtVar = new mt();
        a(mtVar);
        this.c.add(mtVar);
        return this;
    }

    @Override // defpackage.mk
    public mk b(String str) {
        if (str == null) {
            return f();
        }
        a(new mz(str));
        return this;
    }

    @Override // defpackage.mk
    public mk c() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        if (j() instanceof mt) {
            List<ne> list = this.c;
            list.remove(list.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.mk, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.c.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.c.add(b);
    }

    @Override // defpackage.mk
    public mk d() {
        mx mxVar = new mx();
        a(mxVar);
        this.c.add(mxVar);
        return this;
    }

    @Override // defpackage.mk
    public mk e() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        if (j() instanceof mx) {
            List<ne> list = this.c;
            list.remove(list.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.mk
    public mk f() {
        a(mv.a);
        return this;
    }

    @Override // defpackage.mk, java.io.Flushable
    public void flush() {
    }
}
