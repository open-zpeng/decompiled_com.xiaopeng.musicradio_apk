package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.v;
import androidx.recyclerview.widget.f;
import com.xiaopeng.musicradio.utils.j;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RvDataAdapter.java */
/* renamed from: aer  reason: default package */
/* loaded from: classes2.dex */
public abstract class aer<K, T extends RecyclerView.v> extends aes<K, T> {
    private final ArrayDeque<List<K>> f;
    private Runnable g;

    protected abstract boolean a(K k, K k2, int i, int i2);

    protected abstract boolean b(K k, K k2, int i, int i2);

    protected Object c(K k, K k2, int i, int i2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l() {
    }

    public aer(Context context, int i) {
        super(context, i);
        this.f = new ArrayDeque<>();
        this.g = new Runnable() { // from class: aer.2
            @Override // java.lang.Runnable
            public void run() {
                if (!aer.this.d.isComputingLayout()) {
                    aer.this.o();
                } else {
                    aer.this.d.post(aer.this.g);
                }
            }
        };
    }

    @Override // defpackage.aes
    public void a(List<K> list) {
        if (list == null) {
            return;
        }
        this.f.add(list);
        if (this.f.size() == 1) {
            d(list);
        }
    }

    private void d(List<K> list) {
        if (list.size() == 0) {
            this.c.clear();
            d();
            o();
        } else if (this.c.size() == 0) {
            this.c.addAll(b(list));
            d();
            Log.i("DiffBaseAdapter", "update1: size = " + this.c.size());
            o();
        } else {
            final ArrayList arrayList = new ArrayList(list);
            ban.a(new Runnable() { // from class: aer.1
                @Override // java.lang.Runnable
                public void run() {
                    if (aer.this.c.size() == 0) {
                        aer.this.c.addAll(aer.this.b(arrayList));
                        ban.g(new Runnable() { // from class: aer.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                aer.this.d();
                                aer.this.o();
                            }
                        });
                        return;
                    }
                    final f.d a2 = f.a(new a(new ArrayList(aer.this.c), arrayList), false);
                    final List<K> b = aer.this.b(arrayList);
                    ban.g(new Runnable() { // from class: aer.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            aer.this.c.clear();
                            aer.this.c.addAll(b);
                            RecyclerView.LayoutManager layoutManager = aer.this.d.getLayoutManager();
                            Parcelable f = layoutManager != null ? layoutManager.f() : null;
                            a2.a(aer.this);
                            if (layoutManager != null && f != null) {
                                layoutManager.a(f);
                            }
                            aer.this.l();
                            aer.this.o();
                        }
                    });
                }
            });
        }
    }

    protected List<K> b(List<K> list) {
        return j.a(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.f.remove();
        if (this.f.isEmpty()) {
            return;
        }
        if (this.f.size() > 1) {
            this.f.clear();
            this.f.add(this.f.peekLast());
        }
        d(this.f.peek());
    }

    /* compiled from: RvDataAdapter.java */
    /* renamed from: aer$a */
    /* loaded from: classes2.dex */
    private class a extends f.a {
        private List<K> b;
        private List<K> c;

        public a(List<K> list, List<K> list2) {
            this.b = list;
            this.c = list2;
        }

        @Override // androidx.recyclerview.widget.f.a
        public int a() {
            List<K> list = this.b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.recyclerview.widget.f.a
        public int b() {
            List<K> list = this.c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.recyclerview.widget.f.a
        public boolean a(int i, int i2) {
            K k = this.b.get(i);
            K k2 = this.c.get(i2);
            if (k == null || k2 == null) {
                return false;
            }
            return aer.this.a(k, k2, i, i2);
        }

        @Override // androidx.recyclerview.widget.f.a
        public boolean b(int i, int i2) {
            K k = this.b.get(i);
            K k2 = this.c.get(i2);
            if (k == null || k2 == null) {
                return false;
            }
            return aer.this.b(k, k2, i, i2);
        }

        @Override // androidx.recyclerview.widget.f.a
        public Object c(int i, int i2) {
            K k = this.b.get(i);
            K k2 = this.c.get(i2);
            if (k == null || k2 == null) {
                return null;
            }
            return aer.this.c(k, k2, i, i2);
        }
    }
}
