package defpackage;

import com.google.android.exoplayer2.DefaultRenderersFactory;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: LogStoreMgr.java */
/* renamed from: un  reason: default package */
/* loaded from: classes3.dex */
public class un {
    private static un a;
    private static int d;
    private static final Object e = new Object();
    private List<vo> c = new CopyOnWriteArrayList();
    private Runnable f = new Runnable() { // from class: un.1
        @Override // java.lang.Runnable
        public void run() {
            un.this.b();
        }
    };
    private ul b = new um(uc.c());

    private un() {
        vs.a().b();
        vg.a().a(new a());
    }

    public static synchronized un a() {
        un unVar;
        synchronized (un.class) {
            if (a == null) {
                a = new un();
            }
            unVar = a;
        }
        return unVar;
    }

    public void a(vo voVar) {
        uw.a("LogStoreMgr", "[add] :", voVar.e);
        uj.b(voVar.b);
        this.c.add(voVar);
        if (this.c.size() >= 100) {
            vg.a().a(1);
            vg.a().a(1, this.f, 0L);
        } else if (!vg.a().b(1)) {
            vg.a().a(1, this.f, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        }
        synchronized (e) {
            d++;
            if (d > 5000) {
                d = 0;
                vg.a().a(new b());
            }
        }
    }

    public int a(List<vo> list) {
        uw.a("LogStoreMgr", list);
        return this.b.b(list);
    }

    public List<vo> a(String str, int i) {
        List<vo> a2 = this.b.a(str, i);
        uw.a("LogStoreMgr", "[get]", a2);
        return a2;
    }

    public synchronized void b() {
        uw.a("LogStoreMgr", "[store]");
        ArrayList arrayList = null;
        try {
            synchronized (this.c) {
                if (this.c.size() > 0) {
                    arrayList = new ArrayList(this.c);
                    this.c.clear();
                }
            }
            if (arrayList != null && arrayList.size() > 0) {
                this.b.a(arrayList);
            }
        } catch (Throwable unused) {
        }
    }

    public void c() {
        uw.a("LogStoreMgr", "[clear]");
        this.b.b();
        this.c.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -3);
        this.b.a("time", String.valueOf(calendar.getTimeInMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i > 9000) {
            this.b.a((i - 9000) + 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LogStoreMgr.java */
    /* renamed from: un$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            uw.a("LogStoreMgr", "CleanLogTask");
            int a = un.this.b.a();
            if (a > 9000) {
                un.this.a(a);
            }
        }
    }

    /* compiled from: LogStoreMgr.java */
    /* renamed from: un$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            un.this.d();
            int a = un.this.b.a();
            if (a > 9000) {
                un.this.a(a);
            }
        }
    }
}
