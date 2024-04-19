package com.xiaopeng.musicradio.widget.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.v;
import com.xiaopeng.lib.themeswitch.ThemeWatcher;
/* compiled from: BaseRecyclerViewAdapter.java */
/* loaded from: classes2.dex */
public abstract class f<T extends RecyclerView.v> extends RecyclerView.a<T> implements ThemeWatcher.OnThemeSwitchListener {
    protected a g;
    protected RecyclerView j;
    protected boolean i = true;
    protected int h = baj.a().c();

    /* compiled from: BaseRecyclerViewAdapter.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i, int i2);
    }

    public void onSwitchTheme(int i) {
        if (this.h != i) {
            this.h = i;
            d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        this.j = recyclerView;
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    public boolean j() {
        return a() <= 0;
    }
}
