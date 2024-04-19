package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.v;
import defpackage.aep;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RvDataBaseAdapter.java */
/* renamed from: aes  reason: default package */
/* loaded from: classes2.dex */
public abstract class aes<K, T extends RecyclerView.v> extends aep<T> {
    protected List<K> c;
    protected RecyclerView d;
    protected Context e;

    protected boolean m() {
        return true;
    }

    public aes(Context context, int i) {
        super(context, i);
        this.c = new ArrayList();
        this.e = context;
    }

    public aes(Context context, int i, int i2, aep.b bVar) {
        super(context, i, i2, bVar);
        this.c = new ArrayList();
    }

    @Override // defpackage.aep, androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        this.d = recyclerView;
    }

    public void a(List<K> list, boolean z) {
        if (list == null) {
            return;
        }
        this.c.clear();
        this.c.addAll(list);
        if (z) {
            d();
        }
    }

    public void a(List<K> list) {
        if (list == null) {
            return;
        }
        this.c.clear();
        this.c.addAll(list);
        d();
    }

    public void b(List<K> list, boolean z) {
        if (list == null) {
            return;
        }
        this.c.addAll(list);
        if (z) {
            c(this.c.size() - list.size(), list.size());
        }
    }

    public void c(List<K> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        System.currentTimeMillis();
        for (K k : list) {
            if (!this.c.contains(k)) {
                arrayList.add(k);
            }
        }
        this.c.addAll(arrayList);
        c(this.c.size() - arrayList.size(), arrayList.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int a() {
        return this.c.size();
    }

    public K g(int i) {
        if (i >= this.c.size()) {
            return null;
        }
        if (m() && i >= a() - 1) {
            i();
        }
        return this.c.get(i);
    }

    public List<K> n() {
        return this.c;
    }
}
