package com.xiaopeng.musicradio.widget.recyclerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import java.util.List;
/* compiled from: BaseMultiTypeAdapter.java */
/* loaded from: classes2.dex */
public class e extends bix {
    protected RecyclerView a;
    protected a b;

    /* compiled from: BaseMultiTypeAdapter.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i, int i2);
    }

    @Override // defpackage.bix
    public <T> void a(Class<? extends T> cls, biv<T, ?> bivVar) {
        super.a(cls, bivVar);
        if (bivVar instanceof d) {
            ((d) bivVar).a = this.a;
        }
    }

    @Override // defpackage.bix
    public void a(List<?> list) {
        f.d a2 = androidx.recyclerview.widget.f.a(new b(f(), list));
        super.a(list);
        a2.a(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        this.a = recyclerView;
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void b(RecyclerView recyclerView) {
        super.b(recyclerView);
        this.a = null;
        h();
    }

    private void h() {
        biz g = g();
        int a2 = g.a();
        for (int i = 0; i < a2; i++) {
            biv<?, ?> a3 = g.a(i);
            if (a3 instanceof d) {
                ((d) a3).a = this.a;
            }
        }
    }

    /* compiled from: BaseMultiTypeAdapter.java */
    /* loaded from: classes2.dex */
    static class b extends f.a {
        List<?> a;
        List<?> b;

        b(List<?> list, List<?> list2) {
            this.a = list;
            this.b = list2;
        }

        @Override // androidx.recyclerview.widget.f.a
        public int a() {
            List<?> list = this.a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.recyclerview.widget.f.a
        public int b() {
            List<?> list = this.b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.recyclerview.widget.f.a
        public boolean a(int i, int i2) {
            List<?> list = this.a;
            return list != null && list.get(i).getClass().equals(this.b.get(i2).getClass());
        }

        @Override // androidx.recyclerview.widget.f.a
        public boolean b(int i, int i2) {
            List<?> list = this.a;
            return list != null && list.get(i).equals(this.b.get(i2));
        }
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    /* compiled from: BaseMultiTypeAdapter.java */
    /* loaded from: classes2.dex */
    public static class c implements View.OnClickListener {
        private a a;
        private int b;
        private int c;

        public void a(a aVar) {
            this.a = aVar;
        }

        public void a(int i) {
            this.b = i;
        }

        public void b(int i) {
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar;
            if (!ShakeUtil.canExecute(view.getId()) || (aVar = this.a) == null) {
                return;
            }
            aVar.a(this.c, this.b);
        }
    }
}
