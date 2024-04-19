package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.v;
import com.xiaopeng.musicradio.search.a;
/* compiled from: BaseSearchListAdapter.java */
/* renamed from: axy  reason: default package */
/* loaded from: classes2.dex */
public abstract class axy<T, VH extends RecyclerView.v> extends aeq<T, VH> {
    protected Context f;
    protected axz g;

    protected abstract VH a(View view);

    @Override // defpackage.aep
    protected int f() {
        return 20;
    }

    public axy(Context context, int i, axz axzVar) {
        super(context, i);
        this.f = context;
        this.g = axzVar;
        c(true);
    }

    @Override // defpackage.aeq
    public VH a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeq
    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(a.e.item_foot_view, viewGroup, false);
        inflate.setVisibility(8);
        return inflate;
    }
}
