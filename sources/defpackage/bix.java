package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
/* compiled from: MultiTypeAdapter.java */
/* renamed from: bix  reason: default package */
/* loaded from: classes3.dex */
public class bix extends RecyclerView.a<RecyclerView.v> {
    private List<?> a;
    private biz b;

    public bix() {
        this(Collections.emptyList());
    }

    public bix(List<?> list) {
        this(list, new biy());
    }

    public bix(List<?> list, biz bizVar) {
        this.a = list;
        this.b = bizVar;
    }

    public <T> void a(Class<? extends T> cls, biv<T, ?> bivVar) {
        a((Class<?>) cls);
        this.b.a(cls, bivVar, new biu());
    }

    public void a(List<?> list) {
        this.a = list;
    }

    public List<?> f() {
        return this.a;
    }

    public biz g() {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int a(int i) {
        return a(this.a.get(i));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.recyclerview.widget.RecyclerView$v] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.v a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        biv<?, ?> a = this.b.a(i);
        a.c = this;
        return a.b(from, viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    @Deprecated
    public final void a(RecyclerView.v vVar, int i) {
        throw new IllegalAccessError("You should not call this method. Call RecyclerView.Adapter#onBindViewHolder(holder, position, payloads) instead.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void a(RecyclerView.v vVar, int i, List<Object> list) {
        this.b.a(vVar.j()).a(vVar, this.a.get(i), list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int a() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long b(int i) {
        return this.b.a(a(i)).a((biv<?, ?>) this.a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void a(RecyclerView.v vVar) {
        e(vVar).b(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final boolean b(RecyclerView.v vVar) {
        return e(vVar).c(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void c(RecyclerView.v vVar) {
        e(vVar).d(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void d(RecyclerView.v vVar) {
        e(vVar).e(vVar);
    }

    private biv e(RecyclerView.v vVar) {
        return this.b.a(vVar.j());
    }

    int a(Object obj) {
        int b = this.b.b(obj.getClass());
        if (b != -1) {
            return b + this.b.b(b).a(obj);
        }
        throw new bit(obj.getClass());
    }

    private void a(Class<?> cls) {
        if (this.b.a(cls)) {
            Log.w("MultiTypeAdapter", "You have registered the " + cls.getSimpleName() + " type. It will override the original binder(s).");
        }
    }
}
