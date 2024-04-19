package com.xiaopeng.musicradio.widget.recyclerview;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: GridSpacingItemDecoration.java */
/* loaded from: classes2.dex */
public class h extends RecyclerView.h {
    protected int a;
    protected int b;
    protected int c;
    protected boolean d;
    protected int e;
    protected int f;
    protected int g;

    public h(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.d = z;
    }

    public void a(int i) {
        this.c = i;
    }

    public void b(int i) {
        this.e = i;
    }

    public void c(int i) {
        this.g = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int a = a(sVar.e() - 1, recyclerView.getLayoutManager()) / this.a;
        int a2 = a(childAdapterPosition, recyclerView.getLayoutManager());
        int i = this.a;
        int i2 = a2 % i;
        int i3 = a2 / i;
        int b = b(childAdapterPosition, recyclerView.getLayoutManager());
        int i4 = this.a;
        int i5 = b % i4;
        if (this.d) {
            int i6 = this.b;
            rect.left = i6 - ((i2 * i6) / i4);
            rect.right = ((i5 + 1) * i6) / i4;
        } else {
            int i7 = this.b;
            rect.left = (i2 * i7) / i4;
            rect.right = i7 - (((i5 + 1) * i7) / i4);
        }
        if (i3 == 0) {
            rect.top += this.e;
        } else if (i3 > 0) {
            rect.top = this.c;
        }
        rect.bottom = this.f;
        if (i3 == a) {
            rect.bottom += this.g;
        }
    }

    protected int a(int i, RecyclerView.LayoutManager layoutManager) {
        GridLayoutManager.c b;
        if (!(layoutManager instanceof GridLayoutManager) || (b = ((GridLayoutManager) layoutManager).b()) == null) {
            return i;
        }
        int i2 = -1;
        int i3 = 0;
        while (i3 <= i) {
            i2 = (i3 != i || b.a(i3) <= 1) ? i2 + b.a(i3) : i2 + 1;
            i3++;
        }
        return i2;
    }

    protected int b(int i, RecyclerView.LayoutManager layoutManager) {
        GridLayoutManager.c b;
        if (!(layoutManager instanceof GridLayoutManager) || (b = ((GridLayoutManager) layoutManager).b()) == null) {
            return i;
        }
        int i2 = -1;
        for (int i3 = 0; i3 <= i; i3++) {
            i2 += b.a(i3);
        }
        return i2;
    }
}
