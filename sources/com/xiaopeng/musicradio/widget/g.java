package com.xiaopeng.musicradio.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.commonui.widget.NoScrollViewPager;
import com.xiaopeng.musicradio.widget.f;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XRelativeLayout;
/* compiled from: TabLayoutAdapter.java */
/* loaded from: classes2.dex */
public class g extends f.a<a> {
    protected NoScrollViewPager c;
    private int d = 0;

    public g(NoScrollViewPager noScrollViewPager) {
        this.c = noScrollViewPager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* renamed from: c */
    public a a(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(f.g.item_music_tab_layout, viewGroup, false));
    }

    public void f(int i) {
        this.d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(a aVar, final int i) {
        boolean z = i == this.d;
        aVar.r.setSelected(z);
        aVar.s.setSelected(z);
        aVar.r.setText(this.c.getAdapter().b(i));
        aVar.s.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.widget.g.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (i != g.this.d) {
                    g.this.d = i;
                    g.this.d();
                    g.this.c.setCurrentItem(i);
                }
            }
        });
        aVar.s.setVuiPosition(i);
        XRelativeLayout xRelativeLayout = aVar.s;
        xRelativeLayout.setVuiElementId(aVar.s.getId() + "_" + i);
        if (this.c.getAdapter().b(i) != null) {
            aVar.s.setVuiLabel(this.c.getAdapter().b(i).toString());
        }
        XRelativeLayout xRelativeLayout2 = aVar.s;
        xRelativeLayout2.setTag(aVar.s.getId() + "_" + i);
        aVar.s.setVuiElementType(bih.BUTTON);
        VuiEngine.getInstance(aVar.s.getContext()).setExecuteVirtualTag(aVar.s);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int a() {
        NoScrollViewPager noScrollViewPager = this.c;
        if (noScrollViewPager == null || noScrollViewPager.getAdapter() == null) {
            return 0;
        }
        return this.c.getAdapter().a();
    }

    /* compiled from: TabLayoutAdapter.java */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        TextView r;
        XRelativeLayout s;

        public a(View view) {
            super(view);
            this.r = (TextView) view.findViewById(f.C0131f.tag_name);
            this.s = (XRelativeLayout) view.findViewById(f.C0131f.tag_layout);
        }
    }
}
