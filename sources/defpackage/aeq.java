package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.v;
/* compiled from: RVBaseFooterDataBaseAdapter.java */
/* renamed from: aeq  reason: default package */
/* loaded from: classes2.dex */
public abstract class aeq<T, VH extends RecyclerView.v> extends aes<T, RecyclerView.v> {
    private View f;
    private boolean g;

    protected abstract VH a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    protected abstract View b(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public aeq(Context context, int i) {
        super(context, i);
    }

    public void c(boolean z) {
        this.g = z;
    }

    public View l() {
        return this.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.v a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return a(from, viewGroup);
        }
        if (i == 2) {
            this.f = b(from, viewGroup);
            return new a(this.f);
        }
        throw new RuntimeException("there is no type that matches the type " + i + " + make sure your using types correctly");
    }

    @Override // defpackage.aes, androidx.recyclerview.widget.RecyclerView.a
    public int a() {
        int a2 = super.a();
        return this.g ? a2 + 1 : a2;
    }

    @Override // defpackage.aep, androidx.recyclerview.widget.RecyclerView.a
    public int a(int i) {
        return (this.g && f(i)) ? 2 : 1;
    }

    public boolean f(int i) {
        return i == a() - 1;
    }

    /* compiled from: RVBaseFooterDataBaseAdapter.java */
    /* renamed from: aeq$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        public a(View view) {
            super(view);
        }
    }
}
