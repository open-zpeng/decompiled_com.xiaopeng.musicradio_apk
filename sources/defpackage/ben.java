package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: VuiRecyclerViewScrollListener.java */
/* renamed from: ben  reason: default package */
/* loaded from: classes2.dex */
public class ben extends RecyclerView.m {
    private bel a;

    public ben(bel belVar) {
        this.a = null;
        this.a = belVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        bel belVar;
        super.onScrollStateChanged(recyclerView, i);
        if (i != 0 || (belVar = this.a) == null) {
            return;
        }
        belVar.b();
    }
}
