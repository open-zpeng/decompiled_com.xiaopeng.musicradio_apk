package com.xiaopeng.musicradio.widget.recyclerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.widget.recyclerview.g;
/* compiled from: BaseItemViewBinder.java */
/* loaded from: classes2.dex */
public abstract class d<T, VH extends g> extends biv<T, VH> {
    RecyclerView a;
    protected a<T> b;
    private final View.OnClickListener d = new View.OnClickListener() { // from class: com.xiaopeng.musicradio.widget.recyclerview.d.1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecyclerView.v findContainingViewHolder;
            int e;
            if (d.this.a == null || (findContainingViewHolder = d.this.a.findContainingViewHolder(view)) == null || (e = findContainingViewHolder.e()) == -1) {
                return;
            }
            Object obj = d.this.g().f().get(e);
            if (d.this.b != null) {
                d.this.b.a(findContainingViewHolder, obj, view);
            }
        }
    };

    /* compiled from: BaseItemViewBinder.java */
    /* loaded from: classes2.dex */
    public interface a<T> {
        void a(RecyclerView.v vVar, T t, View view);
    }
}
