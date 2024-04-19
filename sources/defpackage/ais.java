package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: MineGridItemDecoration.java */
/* renamed from: ais  reason: default package */
/* loaded from: classes2.dex */
public class ais extends RecyclerView.h {
    private int a;
    private int b;
    private int c;

    public ais(int i, int i2, int i3) {
        this.a = i;
        this.c = i3;
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.b;
        int i2 = this.a;
        rect.left = (int) (((recyclerView.getMeasuredWidth() - (i * i2)) / ((i2 - 1) * i2)) * (childAdapterPosition % i2));
        if (childAdapterPosition / i2 != 0) {
            rect.top = this.c;
        } else {
            rect.top = 0;
        }
    }
}
