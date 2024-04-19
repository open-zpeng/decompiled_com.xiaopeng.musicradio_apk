package com.xiaopeng.musicradio.widget.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.common.f;
/* loaded from: classes2.dex */
public class ListVuiRecyclerView extends VuiRecyclerViewWithLoading {
    private RecyclerView.m a;
    private c b;
    private GridLayoutManager c;
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    /* loaded from: classes2.dex */
    public interface c {
        void a();

        void a(boolean z);
    }

    public ListVuiRecyclerView(Context context) {
        super(context);
        this.d = 0;
        this.g = 3;
    }

    public ListVuiRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.g = 3;
        a(context, attributeSet, 0);
    }

    public ListVuiRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        this.g = 3;
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        int integer;
        int integer2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.RecyclerView, i, 0);
        if (obtainStyledAttributes != null) {
            try {
                integer = obtainStyledAttributes.getInteger(f.j.RecyclerView_android_orientation, 1);
                integer2 = obtainStyledAttributes.getInteger(f.j.RecyclerView_spanCount, 1);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            integer = 1;
            integer2 = 1;
        }
        this.c = new GridLayoutManager(getContext(), integer2, integer, false);
        setHasFixedSize(true);
        setLayoutManager(this.c);
        setItemAnimator(null);
    }

    public void setGridLayoutManager(GridLayoutManager gridLayoutManager) {
        this.c = gridLayoutManager;
        setLayoutManager(this.c);
    }

    public int getSpanCount() {
        return this.c.c();
    }

    public void setOnLoadMoreListener(c cVar) {
        this.b = cVar;
    }

    public void setVisibleThreshold(int i) {
        this.g = i;
    }

    public void setLoadMoreEnable(boolean z) {
        setLoadMoreEnableAdvance(z);
        this.f = z;
    }

    private void setLoadMoreEnableAdvance(boolean z) {
        if (z) {
            if (this.a == null) {
                if (this.d == 0) {
                    this.a = new a();
                } else {
                    this.a = new b();
                }
                addOnScrollListener(this.a);
                return;
            }
            return;
        }
        removeOnScrollListener(this.a);
        this.a = null;
    }

    public void b() {
        if (this.b == null) {
            this.e = false;
        } else if (this.e) {
        } else {
            post(new Runnable() { // from class: com.xiaopeng.musicradio.widget.recyclerview.ListVuiRecyclerView.1
                @Override // java.lang.Runnable
                public void run() {
                    ListVuiRecyclerView.this.b.a();
                }
            });
            this.e = true;
            this.b.a(this.e);
        }
    }

    public void setLoadMoreMode(int i) {
        this.d = i;
    }

    public int getLoadMoreMode() {
        return this.d;
    }

    public void c() {
        this.e = false;
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(this.e);
        }
        RecyclerView.a adapter = getAdapter();
        if (adapter != null) {
            adapter.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.m {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (recyclerView.getAdapter() == null || recyclerView.getAdapter().a() == 0) {
                return;
            }
            int a = recyclerView.getAdapter().a();
            int s = ListVuiRecyclerView.this.c.s();
            if (ListVuiRecyclerView.this.e || a > s + ListVuiRecyclerView.this.g) {
                return;
            }
            ListVuiRecyclerView.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.m {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (recyclerView.getAdapter() == null || recyclerView.getAdapter().a() == 0 || i != 0) {
                return;
            }
            int a = recyclerView.getAdapter().a();
            int s = ListVuiRecyclerView.this.c.s();
            if (ListVuiRecyclerView.this.e || a > s + ListVuiRecyclerView.this.g) {
                return;
            }
            ListVuiRecyclerView.this.b();
        }
    }
}
