package com.xiaopeng.musicradio.mine.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.xui.widget.XRelativeLayout;
import java.util.List;
/* compiled from: PageFragmentTabAdapter.java */
/* loaded from: classes.dex */
public class f extends aep<c> {
    private a c;
    private List<b> d;
    private int e;

    /* compiled from: PageFragmentTabAdapter.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(View view, int i);
    }

    public f(Context context, List<b> list) {
        super(context, f.g.item_music_tab_layout);
        this.e = 0;
        this.d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* renamed from: c */
    public c a(ViewGroup viewGroup, int i) {
        return new c(h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(c cVar, final int i) {
        b bVar = this.d.get(i);
        boolean z = i == this.e;
        cVar.r.setSelected(z);
        cVar.s.setSelected(z);
        cVar.r.setText(bVar.b());
        cVar.s.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.widget.f.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (i != f.this.e) {
                    f.this.e = i;
                    f.this.d();
                    if (f.this.c != null) {
                        f.this.c.a(view, i);
                    }
                }
            }
        });
        amk.a(cVar.s, bVar.b(), bVar.c());
        amk.a(cVar.s, bik.LEVEL2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int a() {
        return this.d.size();
    }

    public int l() {
        return this.e;
    }

    public void f(int i) {
        a(i, true);
    }

    public void a(int i, boolean z) {
        this.e = i;
        if (z) {
            d();
        }
    }

    /* compiled from: PageFragmentTabAdapter.java */
    /* loaded from: classes.dex */
    public static class b {
        private final String a;
        private String b;
        private String c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }
    }

    /* compiled from: PageFragmentTabAdapter.java */
    /* loaded from: classes.dex */
    public static class c extends RecyclerView.v {
        TextView r;
        XRelativeLayout s;

        public c(View view) {
            super(view);
            this.r = (TextView) view.findViewById(f.C0131f.tag_name);
            this.s = (XRelativeLayout) view.findViewById(f.C0131f.tag_layout);
        }
    }

    public void a(a aVar) {
        this.c = aVar;
    }
}
