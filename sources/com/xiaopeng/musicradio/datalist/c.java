package com.xiaopeng.musicradio.datalist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.datalist.g;
import defpackage.aep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: DataListAdapter.java */
/* loaded from: classes.dex */
public abstract class c<VH extends g> extends q<VH> implements h {
    protected List c;
    protected List d;
    protected int e;
    protected int f;
    protected com.xiaopeng.musicradio.datalist.b g;
    private b i;

    /* compiled from: DataListAdapter.java */
    /* loaded from: classes.dex */
    public interface b<VDB extends ViewDataBinding, T> {
        void a(View view, VDB vdb, T t, int i);
    }

    public abstract VH a(View view, ViewGroup viewGroup, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public long b(int i) {
        return i;
    }

    protected boolean v() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaopeng.musicradio.datalist.q
    public /* synthetic */ void c(RecyclerView.v vVar, int i) {
        a((c<VH>) ((g) vVar), i);
    }

    public c(Context context, int i, int i2, aep.b bVar) {
        super(context, i, i2, bVar);
        this.f = 0;
        this.c = Collections.emptyList();
    }

    public <T> void a(boolean z, a<T> aVar) {
        if (z) {
            b((a) aVar);
        } else {
            l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void b(a<T> aVar) {
        l();
        List<o> n = n();
        for (int i = 0; i < n.size(); i++) {
            o oVar = n.get(i);
            if (oVar instanceof o) {
                o oVar2 = oVar;
                if (oVar2.a() == 0 && aVar.a(oVar2.b())) {
                    c(i);
                }
            } else if (aVar.a(oVar)) {
                c(i);
            }
        }
    }

    public void l() {
        int i = this.e;
        if (i != -1) {
            c(i);
        }
    }

    public int m() {
        return this.e;
    }

    public void f(int i) {
        a(i, true);
    }

    public void a(int i, boolean z) {
        final int i2 = this.e;
        if (z && i2 != -1 && i2 != i) {
            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.datalist.c.1
                @Override // java.lang.Runnable
                public void run() {
                    c.this.c(i2);
                }
            });
        }
        this.e = i;
    }

    public void a(List list) {
        a(list, true);
    }

    public void a(List list, boolean z) {
        this.c = list;
        if (z) {
            d();
        }
    }

    public void b(int i, Object obj) {
        List list = this.c;
        if (list != null) {
            list.add(i, obj);
            d();
        }
    }

    public List<o> n() {
        return this.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void d(RecyclerView.v vVar) {
        super.d((c<VH>) vVar);
        if (vVar instanceof g) {
            ((g) vVar).v = false;
        }
        if (vVar instanceof n) {
            ((n) vVar).a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void c(RecyclerView.v vVar) {
        super.c((c<VH>) vVar);
        if (vVar instanceof g) {
            ((g) vVar).v = true;
        }
        if (vVar instanceof n) {
            ((n) vVar).b();
        }
    }

    @Override // com.xiaopeng.musicradio.datalist.q
    /* renamed from: c */
    public VH d(ViewGroup viewGroup, int i) {
        VH a2 = a(e(i), viewGroup, i);
        if (a2 instanceof g) {
            a2.w = this;
            if (a2 instanceof h) {
                a2.setDataHolder(getDataHolder());
            }
            a2.F();
        }
        return a2;
    }

    public void a(VH vh, int i) {
        b((c<VH>) vh, i);
    }

    public void b(VH vh, int i) {
        if (vh instanceof g) {
            vh.u = i;
            vh.c(i);
        }
    }

    @Override // com.xiaopeng.musicradio.datalist.q
    public int o() {
        List list = this.c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.xiaopeng.musicradio.datalist.q
    public int g(int i) {
        Object obj = this.c.get(i);
        if (obj instanceof o) {
            return ((o) obj).a();
        }
        return 0;
    }

    public int p() {
        return this.f;
    }

    public void h(int i) {
        this.f = i;
        if (i == 0) {
            u();
        }
        d();
    }

    public boolean q() {
        return this.f == 2;
    }

    public boolean r() {
        return this.f == 1;
    }

    public boolean a(Object obj) {
        List list = this.d;
        return list != null && list.contains(obj);
    }

    public boolean s() {
        List list = this.d;
        return list == null || list.isEmpty();
    }

    public List t() {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        return this.d;
    }

    public void b(Object obj) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(obj);
    }

    public void c(Object obj) {
        List list = this.d;
        if (list != null) {
            list.remove(obj);
        }
    }

    public void u() {
        List list = this.d;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.d.clear();
    }

    public <T> T i(int i) {
        T t = (T) this.c.get(i);
        if (v() && i >= o() - 1) {
            i();
        }
        return t;
    }

    public void d(Object obj) {
        List list = this.c;
        if (list == null || !list.remove(obj)) {
            return;
        }
        d();
    }

    public void b(List list) {
        List list2 = this.c;
        if (list2 == null || !list2.removeAll(list)) {
            return;
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(View view, ViewDataBinding viewDataBinding, Object obj, int i) {
        if (this.f == 2) {
            if (a(obj)) {
                c(obj);
            } else {
                b(obj);
            }
        } else {
            u();
        }
        b bVar = this.i;
        if (bVar != null) {
            bVar.a(view, viewDataBinding, obj, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> boolean a(a<T> aVar) {
        List<o> n = n();
        boolean z = false;
        for (int i = 0; i < n.size(); i++) {
            o oVar = n.get(i);
            if (oVar instanceof o) {
                o oVar2 = oVar;
                if (oVar2.a() == 0 && aVar.a(oVar2.b())) {
                    c(i);
                    z = true;
                }
            } else if (aVar.a(oVar)) {
                c(i);
                z = true;
            }
        }
        return z;
    }

    public void a(b bVar) {
        this.i = bVar;
    }

    @Override // com.xiaopeng.musicradio.datalist.h
    public void setDataHolder(com.xiaopeng.musicradio.datalist.b bVar) {
        this.g = bVar;
    }

    @Override // com.xiaopeng.musicradio.datalist.h
    public com.xiaopeng.musicradio.datalist.b getDataHolder() {
        return this.g;
    }

    /* compiled from: DataListAdapter.java */
    /* loaded from: classes.dex */
    public static abstract class a<T> {
        public T a;

        public abstract boolean a(T t);

        public a(T t) {
            this.a = t;
        }
    }
}
