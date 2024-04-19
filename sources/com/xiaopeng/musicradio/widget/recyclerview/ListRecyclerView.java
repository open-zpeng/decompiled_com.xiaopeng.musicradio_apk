package com.xiaopeng.musicradio.widget.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.widget.recyclerview.i;
/* loaded from: classes2.dex */
public class ListRecyclerView extends BaseRecycleView implements i {
    private RecyclerView.m a;
    private i.a b;
    private GridLayoutManager c;
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public ListRecyclerView(Context context) {
        this(context, null);
    }

    public ListRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int integer;
        int integer2;
        this.d = 0;
        this.g = 3;
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
        androidx.recyclerview.widget.e eVar = new androidx.recyclerview.widget.e();
        eVar.a(false);
        setItemAnimator(eVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            this.c = (GridLayoutManager) layoutManager;
        }
        super.setLayoutManager(layoutManager);
    }

    public int getSpanCount() {
        return this.c.c();
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.i
    public void setOnLoadMoreListener(i.a aVar) {
        this.b = aVar;
    }

    public void setVisibleThreshold(int i) {
        this.g = i;
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.i
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
            post(new Runnable() { // from class: com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView.1
                @Override // java.lang.Runnable
                public void run() {
                    ListRecyclerView.this.b.o();
                }
            });
            this.e = true;
        }
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.i
    public boolean l() {
        return this.e;
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.i
    public void setLoadMoreMode(int i) {
        this.d = i;
    }

    public int getLoadMoreMode() {
        return this.d;
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.i
    public void k() {
        this.e = false;
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
            int s = ListRecyclerView.this.c.s();
            if (ListRecyclerView.this.e || a > s + (ListRecyclerView.this.g * ListRecyclerView.this.getSpanCount())) {
                return;
            }
            ListRecyclerView.this.b();
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
            int s = ListRecyclerView.this.c.s();
            if (ListRecyclerView.this.e || a > s + (ListRecyclerView.this.g * ListRecyclerView.this.getSpanCount())) {
                return;
            }
            ListRecyclerView.this.b();
        }
    }
}
