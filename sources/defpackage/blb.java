package defpackage;

import java.io.EOFException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.jaudiotagger.audio.asf.data.MetadataDescriptor;
/* compiled from: ClientState.java */
/* renamed from: blb  reason: default package */
/* loaded from: classes3.dex */
public class blb {
    private static final String a = "blb";
    private static final bna b = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", a);
    private Hashtable A;
    private Hashtable B;
    private Hashtable C;
    private bkw D;
    private Hashtable d;
    private volatile Vector e;
    private volatile Vector f;
    private blf g;
    private bla h;
    private blc i;
    private long j;
    private boolean k;
    private bkp l;
    private int n;
    private int o;
    private bmw v;
    private Hashtable z;
    private int c = 0;
    private int m = 0;
    private Object p = new Object();
    private Object q = new Object();
    private boolean r = false;
    private long s = 0;
    private long t = 0;
    private long u = 0;
    private Object w = new Object();
    private int x = 0;
    private boolean y = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public blb(bkp bkpVar, blf blfVar, blc blcVar, bla blaVar, bkw bkwVar) {
        this.h = null;
        this.i = null;
        this.n = 0;
        this.o = 0;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        b.setResourceName(blaVar.h().b());
        b.finer(a, "<Init>", "");
        this.d = new Hashtable();
        this.f = new Vector();
        this.z = new Hashtable();
        this.A = new Hashtable();
        this.B = new Hashtable();
        this.C = new Hashtable();
        this.v = new bmk();
        this.o = 0;
        this.n = 0;
        this.l = bkpVar;
        this.i = blcVar;
        this.g = blfVar;
        this.h = blaVar;
        this.D = bkwVar;
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i) {
        this.m = i;
        this.e = new Vector(this.m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(long j) {
        this.j = j * 1000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long a() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z) {
        this.k = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b() {
        return this.k;
    }

    private String e(bmw bmwVar) {
        return "s-" + bmwVar.j();
    }

    private String f(bmw bmwVar) {
        return "sc-" + bmwVar.j();
    }

    private String g(bmw bmwVar) {
        return "r-" + bmwVar.j();
    }

    private String h(bmw bmwVar) {
        return "sb-" + bmwVar.j();
    }

    protected void c() {
        b.fine(a, "clearState", ">");
        this.l.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.z.clear();
        this.A.clear();
        this.B.clear();
        this.C.clear();
        this.g.d();
    }

    private bmw a(String str, bku bkuVar) {
        bmw bmwVar;
        try {
            bmwVar = bmw.a(bkuVar);
        } catch (bks e) {
            b.fine(a, "restoreMessage", "602", new Object[]{str}, e);
            if (!(e.getCause() instanceof EOFException)) {
                throw e;
            }
            if (str != null) {
                this.l.remove(str);
            }
            bmwVar = null;
        }
        b.fine(a, "restoreMessage", "601", new Object[]{str, bmwVar});
        return bmwVar;
    }

    private void a(Vector vector, bmw bmwVar) {
        int j = bmwVar.j();
        for (int i = 0; i < vector.size(); i++) {
            if (((bmw) vector.elementAt(i)).j() > j) {
                vector.insertElementAt(bmwVar, i);
                return;
            }
        }
        vector.addElement(bmwVar);
    }

    private Vector a(Vector vector) {
        Vector vector2 = new Vector();
        if (vector.size() == 0) {
            return vector2;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < vector.size()) {
            int j = ((bmw) vector.elementAt(i)).j();
            int i5 = j - i2;
            if (i5 > i3) {
                i4 = i;
                i3 = i5;
            }
            i++;
            i2 = j;
        }
        int i6 = (MetadataDescriptor.WORD_MAXVALUE - i2) + ((bmw) vector.elementAt(0)).j() > i3 ? 0 : i4;
        for (int i7 = i6; i7 < vector.size(); i7++) {
            vector2.addElement(vector.elementAt(i7));
        }
        for (int i8 = 0; i8 < i6; i8++) {
            vector2.addElement(vector.elementAt(i8));
        }
        return vector2;
    }

    protected void d() {
        Enumeration keys = this.l.keys();
        int i = this.c;
        Vector vector = new Vector();
        b.fine(a, "restoreState", "600");
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            bmw a2 = a(str, this.l.get(str));
            if (a2 != null) {
                if (str.startsWith("r-")) {
                    b.fine(a, "restoreState", "604", new Object[]{str, a2});
                    this.C.put(new Integer(a2.j()), a2);
                } else if (str.startsWith("s-")) {
                    bmq bmqVar = (bmq) a2;
                    i = Math.max(bmqVar.j(), i);
                    if (this.l.containsKey(f(bmqVar))) {
                        bmp bmpVar = (bmp) a(str, this.l.get(f(bmqVar)));
                        if (bmpVar != null) {
                            b.fine(a, "restoreState", "605", new Object[]{str, a2});
                            this.z.put(new Integer(bmpVar.j()), bmpVar);
                        } else {
                            b.fine(a, "restoreState", "606", new Object[]{str, a2});
                        }
                    } else {
                        bmqVar.a(true);
                        if (bmqVar.h().c() == 2) {
                            b.fine(a, "restoreState", "607", new Object[]{str, a2});
                            this.z.put(new Integer(bmqVar.j()), bmqVar);
                        } else {
                            b.fine(a, "restoreState", "608", new Object[]{str, a2});
                            this.A.put(new Integer(bmqVar.j()), bmqVar);
                        }
                    }
                    this.g.a(bmqVar).a.a(this.h.h());
                    this.d.put(new Integer(bmqVar.j()), new Integer(bmqVar.j()));
                } else if (str.startsWith("sb-")) {
                    bmq bmqVar2 = (bmq) a2;
                    i = Math.max(bmqVar2.j(), i);
                    if (bmqVar2.h().c() == 2) {
                        b.fine(a, "restoreState", "607", new Object[]{str, a2});
                        this.z.put(new Integer(bmqVar2.j()), bmqVar2);
                    } else if (bmqVar2.h().c() == 1) {
                        b.fine(a, "restoreState", "608", new Object[]{str, a2});
                        this.A.put(new Integer(bmqVar2.j()), bmqVar2);
                    } else {
                        b.fine(a, "restoreState", "511", new Object[]{str, a2});
                        this.B.put(new Integer(bmqVar2.j()), bmqVar2);
                        this.l.remove(str);
                    }
                    this.g.a(bmqVar2).a.a(this.h.h());
                    this.d.put(new Integer(bmqVar2.j()), new Integer(bmqVar2.j()));
                } else if (str.startsWith("sc-") && !this.l.containsKey(e((bmp) a2))) {
                    vector.addElement(str);
                }
            }
        }
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            String str2 = (String) elements.nextElement();
            b.fine(a, "restoreState", "609", new Object[]{str2});
            this.l.remove(str2);
        }
        this.c = i;
    }

    private void l() {
        this.e = new Vector(this.m);
        this.f = new Vector();
        Enumeration keys = this.z.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            bmw bmwVar = (bmw) this.z.get(nextElement);
            if (bmwVar instanceof bmq) {
                b.fine(a, "restoreInflightMessages", "610", new Object[]{nextElement});
                bmwVar.a(true);
                a(this.e, (bmq) bmwVar);
            } else if (bmwVar instanceof bmp) {
                b.fine(a, "restoreInflightMessages", "611", new Object[]{nextElement});
                a(this.f, (bmp) bmwVar);
            }
        }
        Enumeration keys2 = this.A.keys();
        while (keys2.hasMoreElements()) {
            Object nextElement2 = keys2.nextElement();
            bmq bmqVar = (bmq) this.A.get(nextElement2);
            bmqVar.a(true);
            b.fine(a, "restoreInflightMessages", "612", new Object[]{nextElement2});
            a(this.e, bmqVar);
        }
        Enumeration keys3 = this.B.keys();
        while (keys3.hasMoreElements()) {
            Object nextElement3 = keys3.nextElement();
            b.fine(a, "restoreInflightMessages", "512", new Object[]{nextElement3});
            a(this.e, (bmq) this.B.get(nextElement3));
        }
        this.f = a(this.f);
        this.e = a(this.e);
    }

    public void a(bmw bmwVar, bky bkyVar) {
        if (bmwVar.aG_() && bmwVar.j() == 0) {
            if ((bmwVar instanceof bmq) && ((bmq) bmwVar).h().c() != 0) {
                bmwVar.a(n());
            } else if ((bmwVar instanceof bmm) || (bmwVar instanceof bmo) || (bmwVar instanceof bmp) || (bmwVar instanceof bmn) || (bmwVar instanceof bmt) || (bmwVar instanceof bms) || (bmwVar instanceof bmv) || (bmwVar instanceof bmu)) {
                bmwVar.a(n());
            }
        }
        if (bkyVar != null) {
            try {
                bkyVar.a.a(bmwVar.j());
            } catch (Exception unused) {
            }
        }
        if (bmwVar instanceof bmq) {
            synchronized (this.p) {
                if (this.n >= this.m) {
                    b.fine(a, "send", "613", new Object[]{new Integer(this.n)});
                    throw new bks(32202);
                }
                bkt h = ((bmq) bmwVar).h();
                b.fine(a, "send", "628", new Object[]{new Integer(bmwVar.j()), new Integer(h.c()), bmwVar});
                switch (h.c()) {
                    case 1:
                        this.A.put(new Integer(bmwVar.j()), bmwVar);
                        this.l.put(e(bmwVar), (bmq) bmwVar);
                        break;
                    case 2:
                        this.z.put(new Integer(bmwVar.j()), bmwVar);
                        this.l.put(e(bmwVar), (bmq) bmwVar);
                        break;
                }
                this.g.a(bkyVar, bmwVar);
                this.e.addElement(bmwVar);
                this.p.notifyAll();
            }
            return;
        }
        b.fine(a, "send", "615", new Object[]{new Integer(bmwVar.j()), bmwVar});
        if (bmwVar instanceof bmf) {
            synchronized (this.p) {
                this.g.a(bkyVar, bmwVar);
                this.f.insertElementAt(bmwVar, 0);
                this.p.notifyAll();
            }
            return;
        }
        if (bmwVar instanceof bmk) {
            this.v = bmwVar;
        } else if (bmwVar instanceof bmp) {
            this.z.put(new Integer(bmwVar.j()), bmwVar);
            this.l.put(f(bmwVar), (bmp) bmwVar);
        } else if (bmwVar instanceof bmn) {
            this.l.remove(g(bmwVar));
        }
        synchronized (this.p) {
            if (!(bmwVar instanceof bmd)) {
                this.g.a(bkyVar, bmwVar);
            }
            this.f.addElement(bmwVar);
            this.p.notifyAll();
        }
    }

    public void a(bmw bmwVar) {
        String h = h(bmwVar);
        try {
            bmwVar.a(n());
            String h2 = h(bmwVar);
            try {
                this.l.put(h2, (bmq) bmwVar);
            } catch (bkv unused) {
                b.fine(a, "persistBufferedMessage", "515");
                this.l.open(this.h.h().b(), this.h.h().c());
                this.l.put(h2, (bmq) bmwVar);
            }
            b.fine(a, "persistBufferedMessage", "513", new Object[]{h2});
        } catch (bks unused2) {
            b.warning(a, "persistBufferedMessage", "513", new Object[]{h});
        }
    }

    public void b(bmw bmwVar) {
        try {
            b.fine(a, "unPersistBufferedMessage", "517", new Object[]{bmwVar.e()});
            this.l.remove(h(bmwVar));
        } catch (bkv unused) {
            b.fine(a, "unPersistBufferedMessage", "518", new Object[]{bmwVar.e()});
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(bmq bmqVar) {
        synchronized (this.p) {
            b.fine(a, "undo", "618", new Object[]{new Integer(bmqVar.j()), new Integer(bmqVar.h().c())});
            if (bmqVar.h().c() == 1) {
                this.A.remove(new Integer(bmqVar.j()));
            } else {
                this.z.remove(new Integer(bmqVar.j()));
            }
            this.e.removeElement(bmqVar);
            this.l.remove(e(bmqVar));
            this.g.b(bmqVar);
            if (bmqVar.h().c() > 0) {
                d(bmqVar.j());
                bmqVar.a(0);
            }
            f();
        }
    }

    public bky a(bkh bkhVar) {
        long max;
        b.fine(a, "checkForActivity", "616", new Object[0]);
        synchronized (this.q) {
            bky bkyVar = null;
            if (this.r) {
                return null;
            }
            a();
            if (this.y && this.j > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (this.w) {
                    if (this.x > 0 && currentTimeMillis - this.t >= this.j + 100) {
                        b.severe(a, "checkForActivity", "619", new Object[]{new Long(this.j), new Long(this.s), new Long(this.t), new Long(currentTimeMillis), new Long(this.u)});
                        throw bli.a(32000);
                    }
                    if (this.x == 0 && currentTimeMillis - this.s >= this.j * 2) {
                        b.severe(a, "checkForActivity", "642", new Object[]{new Long(this.j), new Long(this.s), new Long(this.t), new Long(currentTimeMillis), new Long(this.u)});
                        throw bli.a(32002);
                    }
                    if ((this.x == 0 && currentTimeMillis - this.t >= this.j - 100) || currentTimeMillis - this.s >= this.j - 100) {
                        b.fine(a, "checkForActivity", "620", new Object[]{new Long(this.j), new Long(this.s), new Long(this.t)});
                        bky bkyVar2 = new bky(this.h.h().b());
                        if (bkhVar != null) {
                            bkyVar2.a(bkhVar);
                        }
                        this.g.a(bkyVar2, this.v);
                        this.f.insertElementAt(this.v, 0);
                        long a2 = a();
                        h();
                        bkyVar = bkyVar2;
                        max = a2;
                    } else {
                        b.fine(a, "checkForActivity", "634", null);
                        max = Math.max(1L, a() - (currentTimeMillis - this.s));
                    }
                }
                b.fine(a, "checkForActivity", "624", new Object[]{new Long(max)});
                this.D.a(max);
            }
            return bkyVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bmw e() {
        synchronized (this.p) {
            bmw bmwVar = null;
            while (bmwVar == null) {
                if ((this.e.isEmpty() && this.f.isEmpty()) || (this.f.isEmpty() && this.n >= this.m)) {
                    try {
                        b.fine(a, "get", "644");
                        this.p.wait();
                        b.fine(a, "get", "647");
                    } catch (InterruptedException unused) {
                    }
                }
                if (!this.y && (this.f.isEmpty() || !(((bmw) this.f.elementAt(0)) instanceof bmf))) {
                    b.fine(a, "get", "621");
                    return null;
                } else if (!this.f.isEmpty()) {
                    bmwVar = (bmw) this.f.remove(0);
                    if (bmwVar instanceof bmp) {
                        this.o++;
                        b.fine(a, "get", "617", new Object[]{new Integer(this.o)});
                    }
                    f();
                } else if (!this.e.isEmpty()) {
                    if (this.n < this.m) {
                        bmwVar = (bmw) this.e.elementAt(0);
                        this.e.removeElementAt(0);
                        this.n++;
                        b.fine(a, "get", "623", new Object[]{new Integer(this.n)});
                    } else {
                        b.fine(a, "get", "622");
                    }
                }
            }
            return bmwVar;
        }
    }

    public void b(int i) {
        if (i > 0) {
            this.s = System.currentTimeMillis();
        }
        b.fine(a, "notifySentBytes", "643", new Object[]{new Integer(i)});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(bmw bmwVar) {
        this.s = System.currentTimeMillis();
        b.fine(a, "notifySent", "625", new Object[]{bmwVar.e()});
        bky a2 = this.g.a(bmwVar);
        a2.a.i();
        if (bmwVar instanceof bmk) {
            synchronized (this.w) {
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (this.w) {
                    this.u = currentTimeMillis;
                    this.x++;
                }
                b.fine(a, "notifySent", "635", new Object[]{new Integer(this.x)});
            }
        } else if ((bmwVar instanceof bmq) && ((bmq) bmwVar).h().c() == 0) {
            a2.a.a(null, null);
            this.i.b(a2);
            m();
            d(bmwVar.j());
            this.g.b(bmwVar);
            f();
        }
    }

    private void m() {
        synchronized (this.p) {
            this.n--;
            b.fine(a, "decrementInFlight", "646", new Object[]{new Integer(this.n)});
            if (!f()) {
                this.p.notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean f() {
        int e = this.g.e();
        if (this.r && e == 0 && this.f.size() == 0 && this.i.c()) {
            b.fine(a, "checkQuiesceLock", "626", new Object[]{new Boolean(this.r), new Integer(this.n), new Integer(this.f.size()), new Integer(this.o), Boolean.valueOf(this.i.c()), new Integer(e)});
            synchronized (this.q) {
                this.q.notifyAll();
            }
            return true;
        }
        return false;
    }

    public void c(int i) {
        if (i > 0) {
            this.t = System.currentTimeMillis();
        }
        b.fine(a, "notifyReceivedBytes", "630", new Object[]{new Integer(i)});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(bmd bmdVar) {
        this.t = System.currentTimeMillis();
        b.fine(a, "notifyReceivedAck", "627", new Object[]{new Integer(bmdVar.j()), bmdVar});
        bky a2 = this.g.a(bmdVar);
        if (a2 == null) {
            b.fine(a, "notifyReceivedAck", "662", new Object[]{new Integer(bmdVar.j())});
        } else if (bmdVar instanceof bmo) {
            a(new bmp((bmo) bmdVar), a2);
        } else if ((bmdVar instanceof bmm) || (bmdVar instanceof bmn)) {
            a(bmdVar, a2, null);
        } else if (bmdVar instanceof bml) {
            synchronized (this.w) {
                this.x = Math.max(0, this.x - 1);
                a(bmdVar, a2, null);
                if (this.x == 0) {
                    this.g.b(bmdVar);
                }
            }
            b.fine(a, "notifyReceivedAck", "636", new Object[]{new Integer(this.x)});
        } else if (bmdVar instanceof bme) {
            bme bmeVar = (bme) bmdVar;
            int aB_ = bmeVar.aB_();
            if (aB_ == 0) {
                synchronized (this.p) {
                    if (this.k) {
                        c();
                        this.g.a(a2, bmdVar);
                    }
                    this.o = 0;
                    this.n = 0;
                    l();
                    g();
                }
                this.h.a(bmeVar, (bks) null);
                a(bmdVar, a2, null);
                this.g.b(bmdVar);
                synchronized (this.p) {
                    this.p.notifyAll();
                }
            } else {
                throw bli.a(aB_);
            }
        } else {
            a(bmdVar, a2, null);
            d(bmdVar.j());
            this.g.b(bmdVar);
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(bmw bmwVar) {
        this.t = System.currentTimeMillis();
        b.fine(a, "notifyReceivedMsg", "651", new Object[]{new Integer(bmwVar.j()), bmwVar});
        if (this.r) {
            return;
        }
        if (bmwVar instanceof bmq) {
            bmq bmqVar = (bmq) bmwVar;
            switch (bmqVar.h().c()) {
                case 0:
                case 1:
                    blc blcVar = this.i;
                    if (blcVar != null) {
                        blcVar.a(bmqVar);
                        return;
                    }
                    return;
                case 2:
                    this.l.put(g(bmwVar), bmqVar);
                    this.C.put(new Integer(bmqVar.j()), bmqVar);
                    a(new bmo(bmqVar), (bky) null);
                    return;
                default:
                    return;
            }
        } else if (bmwVar instanceof bmp) {
            bmq bmqVar2 = (bmq) this.C.get(new Integer(bmwVar.j()));
            if (bmqVar2 != null) {
                blc blcVar2 = this.i;
                if (blcVar2 != null) {
                    blcVar2.a(bmqVar2);
                    return;
                }
                return;
            }
            a(new bmn(bmwVar.j()), (bky) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(bky bkyVar) {
        bmw l = bkyVar.a.l();
        if (l == null || !(l instanceof bmd)) {
            return;
        }
        b.fine(a, "notifyComplete", "629", new Object[]{new Integer(l.j()), bkyVar, l});
        bmd bmdVar = (bmd) l;
        if (bmdVar instanceof bmm) {
            this.l.remove(e(l));
            this.l.remove(h(l));
            this.A.remove(new Integer(bmdVar.j()));
            m();
            d(l.j());
            this.g.b(l);
            b.fine(a, "notifyComplete", "650", new Object[]{new Integer(bmdVar.j())});
        } else if (bmdVar instanceof bmn) {
            this.l.remove(e(l));
            this.l.remove(f(l));
            this.l.remove(h(l));
            this.z.remove(new Integer(bmdVar.j()));
            this.o--;
            m();
            d(l.j());
            this.g.b(l);
            b.fine(a, "notifyComplete", "645", new Object[]{new Integer(bmdVar.j()), new Integer(this.o)});
        }
        f();
    }

    protected void a(bmw bmwVar, bky bkyVar, bks bksVar) {
        bkyVar.a.a(bmwVar, bksVar);
        bkyVar.a.g();
        if (bmwVar != null && (bmwVar instanceof bmd) && !(bmwVar instanceof bmo)) {
            b.fine(a, "notifyResult", "648", new Object[]{bkyVar.a.o(), bmwVar, bksVar});
            this.i.b(bkyVar);
        }
        if (bmwVar == null) {
            b.fine(a, "notifyResult", "649", new Object[]{bkyVar.a.o(), bksVar});
            this.i.b(bkyVar);
        }
    }

    public void g() {
        b.fine(a, "connected", "631");
        this.y = true;
        this.D.a();
    }

    public Vector a(bks bksVar) {
        b.fine(a, "resolveOldTokens", "632", new Object[]{bksVar});
        if (bksVar == null) {
            bksVar = new bks(32102);
        }
        Vector c = this.g.c();
        Enumeration elements = c.elements();
        while (elements.hasMoreElements()) {
            bky bkyVar = (bky) elements.nextElement();
            synchronized (bkyVar) {
                if (!bkyVar.h() && !bkyVar.a.e() && bkyVar.b() == null) {
                    bkyVar.a.a(bksVar);
                }
            }
            if (!(bkyVar instanceof bkr)) {
                this.g.b(bkyVar.a.o());
            }
        }
        return c;
    }

    public void b(bks bksVar) {
        b.fine(a, "disconnected", "633", new Object[]{bksVar});
        this.y = false;
        try {
            if (this.k) {
                c();
            }
            this.e.clear();
            this.f.clear();
            synchronized (this.w) {
                this.x = 0;
            }
        } catch (bks unused) {
        }
    }

    private synchronized void d(int i) {
        this.d.remove(new Integer(i));
    }

    private synchronized int n() {
        int i = this.c;
        int i2 = 0;
        do {
            this.c++;
            if (this.c > 65535) {
                this.c = 1;
            }
            if (this.c == i && (i2 = i2 + 1) == 2) {
                throw bli.a(32001);
            }
        } while (this.d.containsKey(new Integer(this.c)));
        Integer num = new Integer(this.c);
        this.d.put(num, num);
        return this.c;
    }

    public void b(long j) {
        if (j > 0) {
            b.fine(a, "quiesce", "637", new Object[]{new Long(j)});
            synchronized (this.p) {
                this.r = true;
            }
            this.i.b();
            h();
            synchronized (this.q) {
                try {
                    int e = this.g.e();
                    if (e > 0 || this.f.size() > 0 || !this.i.c()) {
                        b.fine(a, "quiesce", "639", new Object[]{new Integer(this.n), new Integer(this.f.size()), new Integer(this.o), new Integer(e)});
                        this.q.wait(j);
                    }
                } catch (InterruptedException unused) {
                }
            }
            synchronized (this.p) {
                this.e.clear();
                this.f.clear();
                this.r = false;
                this.n = 0;
            }
            b.fine(a, "quiesce", "640");
        }
    }

    public void h() {
        synchronized (this.p) {
            b.fine(a, "notifyQueueLock", "638");
            this.p.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(bmq bmqVar) {
        b.fine(a, "deliveryComplete", "641", new Object[]{new Integer(bmqVar.j())});
        this.l.remove(g(bmqVar));
        this.C.remove(new Integer(bmqVar.j()));
    }

    public int i() {
        return this.n;
    }

    public int j() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k() {
        this.d.clear();
        if (this.e != null) {
            this.e.clear();
        }
        this.f.clear();
        this.z.clear();
        this.A.clear();
        this.B.clear();
        this.C.clear();
        this.g.d();
        this.d = null;
        this.e = null;
        this.f = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.g = null;
        this.i = null;
        this.h = null;
        this.l = null;
        this.v = null;
    }
}
