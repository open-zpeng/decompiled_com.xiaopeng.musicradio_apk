package com.xiaopeng.musicradio.widget.recyclerview;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: LinearItemDecoration.java */
/* loaded from: classes2.dex */
public class j extends RecyclerView.h {
    private int a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;

    public j(int i, int i2) {
        this.a = i;
        this.d = i2;
    }

    public j(int i, int i2, int i3) {
        this.a = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        super.a(rect, view, recyclerView, sVar);
        rect.left = 0;
        rect.right = 0;
        rect.bottom = 0;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int e = sVar.e() - 1;
        if (childAdapterPosition == 0) {
            if (this.b || this.c) {
                rect.top = this.a;
            } else {
                int i = this.e;
                if (i > 0) {
                    rect.top = i;
                }
            }
        } else if (!this.c) {
            rect.top = this.a;
        }
        if (childAdapterPosition == e && (this.b || this.c)) {
            rect.bottom = this.a;
        }
        if (childAdapterPosition == e) {
            rect.bottom += this.d;
        }
    }
}
