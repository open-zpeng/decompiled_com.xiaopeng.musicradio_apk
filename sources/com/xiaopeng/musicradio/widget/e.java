package com.xiaopeng.musicradio.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.v;
import com.xiaopeng.lib.themeswitch.ThemeWatcher;
import java.util.Collections;
import java.util.List;
/* compiled from: HFRecyclerViewAdapter.java */
/* loaded from: classes2.dex */
public abstract class e<T, VH extends RecyclerView.v> extends com.xiaopeng.musicradio.widget.recyclerview.f implements ThemeWatcher.OnThemeSwitchListener {
    private boolean a;
    private boolean b;
    private View c;
    private View d;
    protected List<T> e;
    protected int f = baj.a().c();

    private boolean e(int i) {
        return i == 0;
    }

    protected abstract View b(LayoutInflater layoutInflater, ViewGroup viewGroup);

    protected abstract View c(LayoutInflater layoutInflater, ViewGroup viewGroup);

    protected abstract VH d(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public e(List<T> list, boolean z, boolean z2) {
        this.e = list;
        this.a = z;
        this.b = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.v a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return d(from, viewGroup);
        }
        if (i == 0) {
            this.c = b(from, viewGroup);
            return new b(this.c);
        } else if (i == 2) {
            this.d = c(from, viewGroup);
            return new a(this.d);
        } else {
            throw new RuntimeException("there is no type that matches the type " + i + " + make sure your using types correctly");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int a() {
        int size = this.e.size();
        if (this.a) {
            size++;
        }
        return this.b ? size + 1 : size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int a(int i) {
        if (this.a && e(i)) {
            return 0;
        }
        return (this.b && g(i)) ? 2 : 1;
    }

    private boolean g(int i) {
        return i == a() - 1;
    }

    public T f(int i) {
        List<T> list;
        if (this.a) {
            list = this.e;
            i--;
        } else {
            list = this.e;
        }
        return list.get(i);
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.f, com.xiaopeng.lib.themeswitch.ThemeWatcher.OnThemeSwitchListener
    public void onSwitchTheme(int i) {
        this.f = i;
        if (j()) {
            return;
        }
        d();
    }

    /* compiled from: HFRecyclerViewAdapter.java */
    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.v {
        public b(View view) {
            super(view);
        }
    }

    /* compiled from: HFRecyclerViewAdapter.java */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        public a(View view) {
            super(view);
        }
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.f
    public boolean j() {
        if (this.a && this.b) {
            if (a() == 2) {
                return true;
            }
        } else if ((this.a || this.b) && a() == 1) {
            return true;
        }
        return super.j();
    }

    public void a_(List<T> list) {
        if (list == null) {
            return;
        }
        this.e.clear();
        this.e.addAll(list);
        d();
    }

    public List<T> k() {
        List<T> list = this.e;
        return list == null ? Collections.emptyList() : list;
    }
}
