package com.xiaopeng.musicradio.widget.recyclerview;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: BaseViewHolder.java */
/* loaded from: classes2.dex */
public class g extends RecyclerView.v implements bal {
    private Context r;
    private Resources s;
    private int t;

    protected void D() {
    }

    public g(View view) {
        super(view);
        this.t = 1;
        this.r = view.getContext();
        this.s = view.getResources();
    }

    public <T extends View> T c(int i) {
        return (T) this.a.findViewById(i);
    }

    @Override // defpackage.bal
    public final void applyTheme() {
        int c = baj.a().c();
        if (this.t != c) {
            this.t = c;
            D();
        }
    }
}
