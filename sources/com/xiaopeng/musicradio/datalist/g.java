package com.xiaopeng.musicradio.datalist;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.lib.utils.LogUtils;
/* compiled from: DataListViewHolder.java */
/* loaded from: classes.dex */
public abstract class g<VDB extends ViewDataBinding> extends RecyclerView.v implements View.OnClickListener, h {
    public Context r;
    public Resources s;
    public VDB t;
    public int u;
    public boolean v;
    public c w;
    public b x;

    public void F() {
    }

    public g(VDB vdb, boolean z) {
        super(vdb.f());
        this.t = vdb;
        if (z) {
            this.a.setOnClickListener(this);
        }
        this.r = vdb.f().getContext();
        this.s = this.r.getResources();
    }

    public <T> T D() {
        T t = (T) this.w.i(this.u);
        return t instanceof o ? (T) ((o) t).b() : t;
    }

    public <T> T E() {
        return (T) this.w.i(this.u);
    }

    public void c(int i) {
        this.u = i;
    }

    public void onClick(View view) {
        this.w.a(view, this.t, E(), this.u);
    }

    @Override // com.xiaopeng.musicradio.datalist.h
    public void setDataHolder(b bVar) {
        this.x = bVar;
    }

    @Override // com.xiaopeng.musicradio.datalist.h
    public b getDataHolder() {
        return this.x;
    }

    public <T> T a(String str) {
        b bVar = this.x;
        if (bVar == null) {
            LogUtils.e(getClass().getSimpleName(), "getProperty dataHolder is null");
            return null;
        }
        return (T) bVar.a(str);
    }

    public int a(String str, int i) {
        Integer num;
        b bVar = this.x;
        return (bVar == null || (num = (Integer) bVar.a(str)) == null) ? i : num.intValue();
    }

    public boolean a(String str, boolean z) {
        Boolean bool;
        b bVar = this.x;
        return (bVar == null || (bool = (Boolean) bVar.a(str)) == null) ? z : bool.booleanValue();
    }
}
