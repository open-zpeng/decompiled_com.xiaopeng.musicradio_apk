package com.xiaopeng.musicradio.widget.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.v;
import java.util.List;
/* compiled from: BaseItemClickAdapter.java */
/* loaded from: classes2.dex */
public abstract class c<K, T extends RecyclerView.v> extends b<K, T> {
    private int[] a;
    protected RecyclerView c;
    protected a d;
    private View.OnClickListener e = new View.OnClickListener() { // from class: com.xiaopeng.musicradio.widget.recyclerview.c.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecyclerView.v findContainingViewHolder;
            int e;
            if (c.this.c == null || (findContainingViewHolder = c.this.c.findContainingViewHolder(view)) == null || (e = findContainingViewHolder.e()) == -1) {
                return;
            }
            if (c.this.g != null) {
                c.this.g.a(findContainingViewHolder.j(), e);
            }
            if (c.this.d != null) {
                c.this.d.a(findContainingViewHolder, e, view);
            }
        }
    };

    /* compiled from: BaseItemClickAdapter.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(RecyclerView.v vVar, int i, View view);
    }

    public abstract T d(ViewGroup viewGroup, int i);

    protected int[] g() {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final T a(ViewGroup viewGroup, int i) {
        T d = d(viewGroup, i);
        d.a.setOnClickListener(this.e);
        if (this.a == null) {
            this.a = g();
        }
        int[] iArr = this.a;
        if (iArr != null) {
            for (int i2 : iArr) {
                View findViewById = d.a.findViewById(i2);
                if (findViewById != null) {
                    findViewById.setOnClickListener(this.e);
                }
            }
        }
        if (baj.a().d() && (d instanceof bal)) {
            ((bal) d).applyTheme();
        }
        return d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void a(T t, int i, List<Object> list) {
        if (t instanceof bal) {
            ((bal) t).applyTheme();
        }
        a((c<K, T>) t, i);
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.f, androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        this.c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void b(RecyclerView recyclerView) {
        super.b(recyclerView);
        this.c = null;
    }

    public void a(a aVar) {
        this.d = aVar;
    }
}
