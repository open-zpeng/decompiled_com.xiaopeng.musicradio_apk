package com.xiaopeng.musicradio.widget.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.v;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BaseAdapter.java */
/* loaded from: classes2.dex */
public abstract class b<K, T extends RecyclerView.v> extends f<T> {
    protected List<K> b = new ArrayList();

    public void a(List<K> list) {
        if (list == null) {
            return;
        }
        this.b.clear();
        this.b.addAll(list);
        d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int a() {
        return this.b.size();
    }

    public K e(int i) {
        if (i >= this.b.size()) {
            return null;
        }
        return this.b.get(i);
    }

    public List<K> f() {
        return this.b;
    }
}
