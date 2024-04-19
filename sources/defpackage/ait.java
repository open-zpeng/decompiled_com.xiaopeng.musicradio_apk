package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: MineLeftItemDecoration.java */
/* renamed from: ait  reason: default package */
/* loaded from: classes2.dex */
public class ait extends RecyclerView.h {
    private int a;

    public ait(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            rect.left = this.a;
        } else {
            rect.left = 0;
        }
    }
}
