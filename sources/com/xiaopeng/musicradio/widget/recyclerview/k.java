package com.xiaopeng.musicradio.widget.recyclerview;

import android.content.Context;
/* compiled from: TopSmoothScroller.java */
/* loaded from: classes2.dex */
public class k extends androidx.recyclerview.widget.j {
    @Override // androidx.recyclerview.widget.j
    protected int getHorizontalSnapPreference() {
        return -1;
    }

    @Override // androidx.recyclerview.widget.j
    protected int getVerticalSnapPreference() {
        return -1;
    }

    public k(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.j
    public int calculateTimeForScrolling(int i) {
        if (i > 2000) {
            i = 2000;
        }
        return super.calculateTimeForScrolling(i);
    }
}
