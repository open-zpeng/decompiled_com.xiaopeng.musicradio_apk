package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.v;
import java.util.List;
/* compiled from: ItemViewBinder.java */
/* renamed from: biv  reason: default package */
/* loaded from: classes3.dex */
public abstract class biv<T, VH extends RecyclerView.v> {
    bix c;

    /* JADX INFO: Access modifiers changed from: protected */
    public long a(T t) {
        return -1L;
    }

    protected abstract void a(VH vh, T t);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract VH b(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(VH vh) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c(VH vh) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(VH vh) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(VH vh) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(VH vh, T t, List<Object> list) {
        a(vh, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int a(RecyclerView.v vVar) {
        return vVar.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final bix g() {
        return this.c;
    }
}
