package com.xiaopeng.musicradio.datalist;

import android.app.Activity;
import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.datalist.a;
import com.xiaopeng.musicradio.widget.recyclerview.i;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class DataListPresenter<UIInterface> extends BasePresenter<UIInterface> implements a.InterfaceC0133a, k, i.a {
    protected int b;
    protected int c;
    protected f d;
    protected List e;
    protected String f;
    protected boolean g;
    protected final int h;
    protected final int i;
    protected final long j;
    protected final int k;
    protected com.xiaopeng.musicradio.datalist.a l;
    protected boolean m;
    protected long n;
    protected Runnable o;

    public void a(e eVar) {
    }

    public void b(f fVar) {
    }

    protected int j() {
        return 1;
    }

    protected long k() {
        return Long.MAX_VALUE;
    }

    protected int m() {
        return 1;
    }

    public long s() {
        return 300L;
    }

    public abstract String t();

    public DataListPresenter() {
        this(50);
    }

    public DataListPresenter(int i) {
        this.e = new ArrayList();
        this.i = 1;
        this.j = Long.MAX_VALUE;
        this.k = 1;
        this.m = true;
        this.h = i <= 0 ? 50 : i;
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(androidx.lifecycle.i iVar) {
        super.onCreate(iVar);
        c();
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(androidx.lifecycle.i iVar) {
        super.onDestroy(iVar);
        d();
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(androidx.lifecycle.i iVar) {
        super.onResume(iVar);
        e();
    }

    protected void c() {
        if (q() != null) {
            this.l.a(this);
        }
    }

    protected void d() {
        if (q() != null) {
            this.l.b(this);
            this.l.b();
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        if (f() || (q() != null && q().a())) {
            h();
        }
    }

    public boolean f() {
        String t = t();
        boolean isEmpty = TextUtils.isEmpty(this.f);
        boolean z = (isEmpty && !TextUtils.isEmpty(t)) || !(isEmpty || this.f.equals(t));
        this.f = t;
        this.g = z;
        return z;
    }

    public boolean a(boolean z) {
        boolean z2 = this.g;
        if (z) {
            this.g = false;
        }
        return z2;
    }

    public List g() {
        return this.e;
    }

    public final void h() {
        b(false);
    }

    private void u() {
        if (a() instanceof i) {
            ((i) a()).h_();
        }
    }

    public void b(final boolean z) {
        if (!z) {
            u();
        }
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.datalist.DataListPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                DataListPresenter.this.c(z);
                if (DataListPresenter.this.q() != null) {
                    DataListPresenter.this.l.a(false, new Object[0]);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean i() {
        return a() instanceof Activity;
    }

    public void a(int i) {
        UIInterface a2 = a();
        if (a2 instanceof l) {
            if (this.b == 2 && i == 0) {
                i = 1;
            }
            ((l) a2).a(i);
        }
        this.b = i;
    }

    protected int l() {
        return this.h;
    }

    public b n() {
        UIInterface a2 = a();
        if (a2 instanceof h) {
            return ((h) a2).getDataHolder();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final f fVar) {
        if (this.m && System.currentTimeMillis() - this.n < s()) {
            LogUtils.i("DataListPresenter", "onDataLoaded(Delay):resp=" + fVar);
            this.o = new Runnable() { // from class: com.xiaopeng.musicradio.datalist.DataListPresenter.2
                @Override // java.lang.Runnable
                public void run() {
                    DataListPresenter.this.c(fVar);
                }
            };
            return;
        }
        c(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(f fVar) {
        b n = n();
        if (n == null) {
            q().a(true, false, new Object[0]);
            LogUtils.i("DataListPresenter", "onDataLoaded(skip):dataHolder=null");
        } else if (fVar.k != this.c) {
            LogUtils.i("DataListPresenter", "onDataLoaded(skip):" + fVar + ListSignBean.COLLECTID_SUFFIX + getClass().getSimpleName());
        } else {
            this.d = fVar;
            com.xiaopeng.musicradio.widget.recyclerview.i c = n.c();
            c d = n.d();
            if (fVar.l) {
                c.k();
            } else {
                this.e.clear();
            }
            UIInterface a2 = a();
            j jVar = a2 instanceof j ? (j) a2 : null;
            if (fVar instanceof d) {
                if (jVar != null) {
                    jVar.b(fVar);
                }
                a(fVar.l, (Throwable) null);
                return;
            }
            if (fVar.o != null && !fVar.o.isEmpty()) {
                this.e.addAll(fVar.o);
            }
            if (n.a()) {
                n.a(fVar.n);
                c.setLoadMoreEnable(fVar.n);
                if (d != null && n.b() && !fVar.n) {
                    d.j(0);
                }
            }
            try {
                a(fVar, n);
                if (jVar != null) {
                    jVar.a(fVar);
                }
                b(fVar);
            } catch (Throwable th) {
                if (jVar != null) {
                    jVar.b(fVar);
                }
                a(fVar.l, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z, Throwable th) {
        c d;
        LogUtils.e("DataListPresenter", "onDataError:more=" + z + ListSignBean.COLLECTID_SUFFIX + getClass().getSimpleName() + ListSignBean.COLLECTID_SUFFIX + th);
        b n = n();
        if (n == null) {
            LogUtils.i("DataListPresenter", "onDataError(skip):dataHolder=null");
        } else if (n == null || !n.b() || !z || (d = n.d()) == null) {
        } else {
            d.j(2);
        }
    }

    public void c(boolean z) {
        int i;
        long j;
        c d;
        f fVar;
        b n = n();
        if (!z || (fVar = this.d) == null) {
            this.c = a.a();
            int j2 = j();
            long k = k();
            com.xiaopeng.musicradio.widget.recyclerview.i c = n != null ? n.c() : null;
            if (c != null && c.l()) {
                c.k();
            }
            i = j2;
            j = k;
        } else {
            i = fVar.d;
            j = this.d.h;
        }
        if (n != null && n.b() && (d = n.d()) != null) {
            if (z) {
                d.a(true, 1);
            } else {
                d.a(false, -1, false);
            }
        }
        e eVar = new e(m(), this.c, z, i, j, l());
        if (this.m && this.n == 0) {
            this.n = System.currentTimeMillis();
            ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.datalist.DataListPresenter.3
                @Override // java.lang.Runnable
                public void run() {
                    DataListPresenter dataListPresenter = DataListPresenter.this;
                    dataListPresenter.m = false;
                    dataListPresenter.v();
                }
            }, s());
        }
        a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (this.o != null) {
            LogUtils.i("DataListPresenter", "runFirstDelayRunnable");
            this.o.run();
            this.o = null;
        }
    }

    protected void a(f fVar, b bVar) {
        c d;
        if ((fVar.l && (fVar.o == null || fVar.o.isEmpty())) || (d = bVar.d()) == null) {
            return;
        }
        d.a(a(this.e), fVar.l ? p.a(bVar, d.a()) : true);
    }

    public List a(List list) {
        return list != null ? list : new ArrayList();
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.i.a
    public void o() {
        b(true);
    }

    @Override // com.xiaopeng.musicradio.datalist.a.InterfaceC0133a
    public void a(Object... objArr) {
        if (p()) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p() {
        if (a() instanceof m) {
            return ((m) a()).i_();
        }
        return a() != null;
    }

    public final com.xiaopeng.musicradio.datalist.a q() {
        if (this.l == null) {
            this.l = r();
        }
        return this.l;
    }

    public com.xiaopeng.musicradio.datalist.a r() {
        return new com.xiaopeng.musicradio.datalist.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        private static int a;

        public static int a() {
            int i = a;
            a = i + 1;
            return i;
        }
    }
}
