package com.xiaopeng.musicradio.datalist;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
import java.util.HashMap;
/* compiled from: DataHolder.java */
/* loaded from: classes.dex */
public class b {
    private boolean a;
    private int b;
    private boolean c;
    private boolean d;
    private HashMap<String, Object> e;
    private com.xiaopeng.musicradio.widget.recyclerview.i f;
    private c g;
    private DataListPresenter h;
    private h i;

    private b() {
        this.e = new HashMap<>();
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.c;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public com.xiaopeng.musicradio.widget.recyclerview.i c() {
        return this.f;
    }

    public c d() {
        return this.g;
    }

    public void a(String str, Object obj) {
        synchronized (this.e) {
            this.e.put(str, obj);
        }
    }

    public <T> T a(String str) {
        T t;
        synchronized (this.e) {
            t = (T) this.e.get(str);
        }
        return t;
    }

    /* compiled from: DataHolder.java */
    /* loaded from: classes.dex */
    public static class a {
        private boolean a;
        private int b = 0;
        private boolean c;
        private com.xiaopeng.musicradio.widget.recyclerview.i d;
        private c e;
        private DataListPresenter f;
        private h g;

        public a(Context context) {
        }

        public a a(boolean z) {
            this.a = z;
            return this;
        }

        public a b(boolean z) {
            this.c = z;
            return this;
        }

        public a a(com.xiaopeng.musicradio.widget.recyclerview.i iVar) {
            this.d = iVar;
            return this;
        }

        public a a(c cVar) {
            this.e = cVar;
            return this;
        }

        public a a(DataListPresenter dataListPresenter) {
            this.f = dataListPresenter;
            return this;
        }

        public a a(h hVar) {
            this.g = hVar;
            return this;
        }

        public b a() {
            b bVar = new b();
            bVar.g = this.e;
            bVar.f = this.d;
            bVar.h = this.f;
            bVar.b = this.b;
            bVar.a = this.a;
            bVar.c = this.c;
            bVar.i = this.g;
            h hVar = this.g;
            if (hVar != null) {
                hVar.setDataHolder(bVar);
            }
            c cVar = this.e;
            if (cVar instanceof h) {
                cVar.setDataHolder(bVar);
            }
            com.xiaopeng.musicradio.widget.recyclerview.i iVar = this.d;
            if (iVar instanceof ListRecyclerView) {
                ListRecyclerView listRecyclerView = (ListRecyclerView) iVar;
                RecyclerView.a adapter = listRecyclerView.getAdapter();
                c cVar2 = this.e;
                if (adapter != cVar2) {
                    listRecyclerView.setAdapter(cVar2);
                }
            }
            this.d.setOnLoadMoreListener(this.f);
            this.d.setLoadMoreMode(this.b);
            return bVar;
        }
    }
}
