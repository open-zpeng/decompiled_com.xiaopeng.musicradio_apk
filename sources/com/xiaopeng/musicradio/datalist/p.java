package com.xiaopeng.musicradio.datalist;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListViewUtils.java */
/* loaded from: classes.dex */
public class p {
    public static boolean a(b bVar, int i) {
        com.xiaopeng.musicradio.widget.recyclerview.i c = bVar.c();
        return (c instanceof ListRecyclerView) && i <= a((ListRecyclerView) c);
    }

    public static int a(ListRecyclerView listRecyclerView) {
        RecyclerView.LayoutManager layoutManager = listRecyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).r();
        }
        return 0;
    }
}
