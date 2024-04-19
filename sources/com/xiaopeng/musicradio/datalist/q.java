package com.xiaopeng.musicradio.datalist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.v;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
/* compiled from: MoreAdapter.java */
/* loaded from: classes.dex */
public abstract class q<T extends RecyclerView.v> extends aep {
    private boolean c;
    public int h;

    /* compiled from: MoreAdapter.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i);
    }

    public abstract void c(T t, int i);

    public abstract T d(ViewGroup viewGroup, int i);

    public abstract int o();

    public q(Context context, int i, int i2, aep.b bVar) {
        this(context, i, i2, bVar, false);
    }

    public q(Context context, int i, int i2, aep.b bVar, boolean z) {
        super(context, i, i2, bVar);
        this.h = 0;
        this.c = z;
    }

    public void a(boolean z, int i) {
        a(z, i, true);
    }

    public void a(boolean z, int i, boolean z2) {
        this.c = z;
        this.h = i;
        if (z2) {
            d();
        }
    }

    public void j(int i) {
        int i2 = this.h;
        this.h = i;
        boolean z = i2 != i;
        if (this.c && o() > 0 && z) {
            c(o());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int a() {
        if (k()) {
            return 0;
        }
        int o = o();
        return (!this.c || o <= 0) ? o : o + 1;
    }

    @Override // defpackage.aep, androidx.recyclerview.widget.RecyclerView.a
    public final int a(int i) {
        if (this.c && a() - 1 == i) {
            return Integer.MAX_VALUE;
        }
        return g(i);
    }

    public int g(int i) {
        return super.a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.v a(ViewGroup viewGroup, int i) {
        if (this.c && i == Integer.MAX_VALUE) {
            return e(viewGroup, i);
        }
        return d(viewGroup, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void a(RecyclerView.v vVar, int i) {
        if (this.c && a(i) == Integer.MAX_VALUE) {
            d(vVar, i);
        } else {
            c((q<T>) vVar, i);
        }
    }

    public RecyclerView.v e(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(f.g.item_foot_view, viewGroup, false));
    }

    public final void d(RecyclerView.v vVar, int i) {
        if (vVar instanceof a) {
            ((a) vVar).a(this.h);
        }
    }

    /* compiled from: MoreAdapter.java */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.v implements a {
        public View r;
        public XTextView s;
        public XLoading t;

        public b(View view) {
            super(view);
            this.r = view.findViewById(f.C0131f.food_view_group);
            this.s = (XTextView) view.findViewById(f.C0131f.tv_foot);
            this.t = (XLoading) view.findViewById(f.C0131f.foot_loading);
        }

        @Override // com.xiaopeng.musicradio.datalist.q.a
        public void a(int i) {
            int i2 = 0;
            switch (i) {
                case 1:
                    this.t.setVisibility(0);
                    this.s.setText(f.h.rv_more_loading);
                    break;
                case 2:
                    this.t.setVisibility(8);
                    this.s.setText(f.h.rv_more_fail);
                    break;
                default:
                    this.t.setVisibility(8);
                    i2 = 8;
                    break;
            }
            if (this.r.getVisibility() != i2) {
                this.r.setVisibility(i2);
            }
        }
    }
}
