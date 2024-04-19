package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: MineTopItemDecoration.java */
/* renamed from: aiu  reason: default package */
/* loaded from: classes2.dex */
public class aiu extends RecyclerView.h {
    private int a;

    public aiu(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            rect.top = this.a;
        } else {
            rect.top = 0;
        }
    }
}
