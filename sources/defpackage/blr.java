package defpackage;
/* compiled from: Token.java */
/* renamed from: blr  reason: default package */
/* loaded from: classes3.dex */
public class blr {
    private static final String b = "blr";
    private static final bna c = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", b);
    private String l;
    private volatile boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private Object g = new Object();
    private Object h = new Object();
    protected bkt a = null;
    private bmw i = null;
    private bks j = null;
    private String[] k = null;
    private bki m = null;
    private bkh n = null;
    private Object o = null;
    private int p = 0;
    private boolean q = false;

    public blr(String str) {
        c.setResourceName(str);
    }

    public int a() {
        return this.p;
    }

    public void a(int i) {
        this.p = i;
    }

    public boolean b() {
        if (c() == null) {
            return true;
        }
        throw c();
    }

    public bks c() {
        return this.j;
    }

    public boolean d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e() {
        return this.e;
    }

    public void a(bkh bkhVar) {
        this.n = bkhVar;
    }

    public bkh f() {
        return this.n;
    }

    public void a(long j) {
        c.fine(b, "waitForCompletion", "407", new Object[]{o(), new Long(j), this});
        if (b(j) == null && !this.d) {
            c.fine(b, "waitForCompletion", "406", new Object[]{o(), this});
            this.j = new bks(32000);
            throw this.j;
        }
        b();
    }

    protected bmw b(long j) {
        synchronized (this.g) {
            bna bnaVar = c;
            String str = b;
            Object[] objArr = new Object[7];
            objArr[0] = o();
            objArr[1] = new Long(j);
            objArr[2] = new Boolean(this.f);
            objArr[3] = new Boolean(this.d);
            objArr[4] = this.j == null ? "false" : "true";
            objArr[5] = this.i;
            objArr[6] = this;
            bnaVar.fine(str, "waitForResponse", "400", objArr, this.j);
            while (!this.d) {
                if (this.j == null) {
                    try {
                        c.fine(b, "waitForResponse", "408", new Object[]{o(), new Long(j)});
                        if (j <= 0) {
                            this.g.wait();
                        } else {
                            this.g.wait(j);
                        }
                    } catch (InterruptedException e) {
                        this.j = new bks(e);
                    }
                }
                if (!this.d) {
                    if (this.j != null) {
                        c.fine(b, "waitForResponse", "401", null, this.j);
                        throw this.j;
                    } else if (j > 0) {
                        break;
                    }
                }
            }
        }
        c.fine(b, "waitForResponse", "402", new Object[]{o(), this.i});
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(bmw bmwVar, bks bksVar) {
        c.fine(b, "markComplete", "404", new Object[]{o(), bmwVar, bksVar});
        synchronized (this.g) {
            if (bmwVar instanceof bmd) {
                this.a = null;
            }
            this.e = true;
            this.i = bmwVar;
            this.j = bksVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        c.fine(b, "notifyComplete", "404", new Object[]{o(), this.i, this.j});
        synchronized (this.g) {
            if (this.j == null && this.e) {
                this.d = true;
                this.e = false;
            } else {
                this.e = false;
            }
            this.g.notifyAll();
        }
        synchronized (this.h) {
            this.f = true;
            this.h.notifyAll();
        }
    }

    public void h() {
        synchronized (this.h) {
            synchronized (this.g) {
                if (this.j != null) {
                    throw this.j;
                }
            }
            while (!this.f) {
                try {
                    c.fine(b, "waitUntilSent", "409", new Object[]{o()});
                    this.h.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (!this.f) {
                if (this.j == null) {
                    throw bli.a(6);
                }
                throw this.j;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i() {
        c.fine(b, "notifySent", "403", new Object[]{o()});
        synchronized (this.g) {
            this.i = null;
            this.d = false;
        }
        synchronized (this.h) {
            this.f = true;
            this.h.notifyAll();
        }
    }

    public bki j() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(bki bkiVar) {
        this.m = bkiVar;
    }

    public bkt k() {
        return this.a;
    }

    public bmw l() {
        return this.i;
    }

    public void a(bkt bktVar) {
        this.a = bktVar;
    }

    public String[] m() {
        return this.k;
    }

    public void a(String[] strArr) {
        this.k = strArr;
    }

    public Object n() {
        return this.o;
    }

    public void a(Object obj) {
        this.o = obj;
    }

    public void a(String str) {
        this.l = str;
    }

    public String o() {
        return this.l;
    }

    public void a(bks bksVar) {
        synchronized (this.g) {
            this.j = bksVar;
        }
    }

    public boolean p() {
        return this.q;
    }

    public void a(boolean z) {
        this.q = z;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(o());
        stringBuffer.append(" ,topics=");
        if (m() != null) {
            for (int i = 0; i < m().length; i++) {
                stringBuffer.append(m()[i]);
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(" ,usercontext=");
        stringBuffer.append(n());
        stringBuffer.append(" ,isComplete=");
        stringBuffer.append(d());
        stringBuffer.append(" ,isNotified=");
        stringBuffer.append(p());
        stringBuffer.append(" ,exception=");
        stringBuffer.append(c());
        stringBuffer.append(" ,actioncallback=");
        stringBuffer.append(f());
        return stringBuffer.toString();
    }

    public bmw q() {
        return this.i;
    }
}
