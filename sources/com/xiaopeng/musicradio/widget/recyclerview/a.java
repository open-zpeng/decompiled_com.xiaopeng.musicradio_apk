package com.xiaopeng.musicradio.widget.recyclerview;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: AverageGridDecoration.java */
/* loaded from: classes2.dex */
public class a extends RecyclerView.h {
    protected int a;
    protected boolean b;
    private int c;

    public a(int i, boolean z, int i2) {
        this.a = i;
        this.b = z;
        this.c = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int e = sVar.e() - 1;
        GridLayoutManager.b bVar = (GridLayoutManager.b) view.getLayoutParams();
        int a = bVar.a();
        int b = bVar.b();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = this.a / b;
        int i2 = a / b;
        int measuredWidth = i > 1 ? (recyclerView.getMeasuredWidth() - (layoutParams.width * i)) / (i - 1) : 0;
        if (this.b) {
            rect.left = measuredWidth - ((i2 * measuredWidth) / i);
            rect.right = ((i2 + 1) * measuredWidth) / i;
        } else {
            rect.left = (i2 * measuredWidth) / i;
            rect.right = measuredWidth - (((i2 + 1) * measuredWidth) / i);
        }
        if (childAdapterPosition == e) {
            rect.bottom += this.c;
        }
    }
}
