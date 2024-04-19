package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: MineBottomItemDecoration.java */
/* renamed from: air  reason: default package */
/* loaded from: classes2.dex */
public class air extends RecyclerView.h {
    private int a;
    private int b;

    public air(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (childAdapterPosition == (adapter != null ? adapter.a() : 0) - 1) {
            rect.bottom = this.a;
        } else {
            rect.bottom = this.b;
        }
    }
}
