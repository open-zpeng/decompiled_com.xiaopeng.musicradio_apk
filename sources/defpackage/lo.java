package defpackage;

import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: JsonTreeReader.java */
/* renamed from: lo  reason: default package */
/* loaded from: classes3.dex */
public final class lo extends mj {
    private static final Reader a = new Reader() { // from class: lo.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    private static final Object b = new Object();
    private final List<Object> c;

    private void a(ml mlVar) {
        if (f() == mlVar) {
            return;
        }
        throw new IllegalStateException("Expected " + mlVar + " but was " + f());
    }

    private Object q() {
        List<Object> list = this.c;
        return list.get(list.size() - 1);
    }

    private Object r() {
        List<Object> list = this.c;
        return list.remove(list.size() - 1);
    }

    @Override // defpackage.mj
    public void a() {
        a(ml.BEGIN_ARRAY);
        this.c.add(((mt) q()).iterator());
    }

    @Override // defpackage.mj
    public void b() {
        a(ml.END_ARRAY);
        r();
        r();
    }

    @Override // defpackage.mj
    public void c() {
        a(ml.BEGIN_OBJECT);
        this.c.add(((mx) q()).g().iterator());
    }

    @Override // defpackage.mj, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.clear();
        this.c.add(b);
    }

    @Override // defpackage.mj
    public void d() {
        a(ml.END_OBJECT);
        r();
        r();
    }

    @Override // defpackage.mj
    public boolean e() {
        ml f = f();
        return (f == ml.END_OBJECT || f == ml.END_ARRAY) ? false : true;
    }

    @Override // defpackage.mj
    public ml f() {
        if (this.c.isEmpty()) {
            return ml.END_DOCUMENT;
        }
        Object q = q();
        if (q instanceof Iterator) {
            List<Object> list = this.c;
            boolean z = list.get(list.size() - 2) instanceof mx;
            Iterator it = (Iterator) q;
            if (!it.hasNext()) {
                return z ? ml.END_OBJECT : ml.END_ARRAY;
            } else if (z) {
                return ml.NAME;
            } else {
                this.c.add(it.next());
                return f();
            }
        } else if (q instanceof mx) {
            return ml.BEGIN_OBJECT;
        } else {
            if (q instanceof mt) {
                return ml.BEGIN_ARRAY;
            }
            if (!(q instanceof mz)) {
                if (q instanceof mv) {
                    return ml.NULL;
                }
                if (q == b) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
            mz mzVar = (mz) q;
            if (mzVar.j()) {
                return ml.STRING;
            }
            if (mzVar.g()) {
                return ml.BOOLEAN;
            }
            if (mzVar.i()) {
                return ml.NUMBER;
            }
            throw new AssertionError();
        }
    }

    @Override // defpackage.mj
    public String g() {
        a(ml.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) q()).next();
        this.c.add(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // defpackage.mj
    public String h() {
        ml f = f();
        if (f == ml.STRING || f == ml.NUMBER) {
            return ((mz) r()).b();
        }
        throw new IllegalStateException("Expected " + ml.STRING + " but was " + f);
    }

    @Override // defpackage.mj
    public boolean i() {
        a(ml.BOOLEAN);
        return ((mz) r()).f();
    }

    @Override // defpackage.mj
    public void j() {
        a(ml.NULL);
        r();
    }

    @Override // defpackage.mj
    public double k() {
        ml f = f();
        if (f != ml.NUMBER && f != ml.STRING) {
            throw new IllegalStateException("Expected " + ml.NUMBER + " but was " + f);
        }
        double c = ((mz) q()).c();
        if (p() || !(Double.isNaN(c) || Double.isInfinite(c))) {
            r();
            return c;
        }
        throw new NumberFormatException("JSON forbids NaN and infinities: " + c);
    }

    @Override // defpackage.mj
    public long l() {
        ml f = f();
        if (f == ml.NUMBER || f == ml.STRING) {
            long d = ((mz) q()).d();
            r();
            return d;
        }
        throw new IllegalStateException("Expected " + ml.NUMBER + " but was " + f);
    }

    @Override // defpackage.mj
    public int m() {
        ml f = f();
        if (f == ml.NUMBER || f == ml.STRING) {
            int e = ((mz) q()).e();
            r();
            return e;
        }
        throw new IllegalStateException("Expected " + ml.NUMBER + " but was " + f);
    }

    @Override // defpackage.mj
    public void n() {
        if (f() == ml.NAME) {
            g();
        } else {
            r();
        }
    }

    public void o() {
        a(ml.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) q()).next();
        this.c.add(entry.getValue());
        this.c.add(new mz((String) entry.getKey()));
    }

    @Override // defpackage.mj
    public String toString() {
        return getClass().getSimpleName();
    }
}
