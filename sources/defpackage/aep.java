package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.v;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.utils.aw;
import defpackage.aem;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: RVBaseAdapter.java */
/* renamed from: aep  reason: default package */
/* loaded from: classes2.dex */
public abstract class aep<T extends RecyclerView.v> extends RecyclerView.a<T> {
    protected c a;
    protected LayoutInflater b;
    private Context c;
    private CopyOnWriteArrayList<View> d;
    private SparseArray<CopyOnWriteArrayList<View>> e;
    private SparseArray<f> f;
    private int g;
    private String h;
    private boolean i;
    private d j;
    private volatile boolean k;
    private volatile boolean l;
    private int m;
    private b n;

    /* compiled from: RVBaseAdapter.java */
    /* renamed from: aep$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* compiled from: RVBaseAdapter.java */
    /* renamed from: aep$c */
    /* loaded from: classes2.dex */
    public interface c {
        void a(int i, int i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int a(int i) {
        return 0;
    }

    protected int f() {
        return 5;
    }

    public f[] g() {
        return null;
    }

    public aep(Context context, int i) {
        this(context, i, 0, null);
    }

    public aep(Context context, int i, int i2, b bVar) {
        this.h = context.getResources().getResourceEntryName(i);
        this.c = context;
        this.g = i;
        this.m = i2;
        this.n = bVar;
        this.l = i2 > 0 && bVar != null;
        this.b = LayoutInflater.from(context);
        this.d = new CopyOnWriteArrayList<>();
        f(f());
        m();
        l();
    }

    private void l() {
        Object b2 = aw.b(this, "mObservable");
        if (b2 != null) {
            this.j = new d();
            aw.a(b2, "mObservers", this.j);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        d dVar = this.j;
        if (dVar != null) {
            dVar.a(recyclerView);
        }
    }

    private void m() {
        f[] g = g();
        if (g != null) {
            this.f = new SparseArray<>();
            this.e = new SparseArray<>();
            for (f fVar : g) {
                this.f.put(fVar.a, fVar);
                CopyOnWriteArrayList<View> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.e.put(fVar.a, copyOnWriteArrayList);
                a(fVar.a, fVar.b, copyOnWriteArrayList, fVar.c);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(T t) {
        super.a((aep<T>) t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View h() {
        if (this.d.size() > 0) {
            Log.d("RVBaseAdapter", "onCreateViewHolder, getItemView from cache. resourceName = " + this.h + " this = " + this);
            return this.d.remove(0);
        }
        Log.d("RVBaseAdapter", "onCreateViewHolder, getItemView by creation. resourceName = " + this.h + " this = " + this);
        View inflate = this.b.inflate(this.g, (ViewGroup) null);
        inflate.setTag(aem.c.tag_type, 0);
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View e(int i) {
        if (i == 0) {
            return h();
        }
        f fVar = this.f.get(i);
        CopyOnWriteArrayList<View> copyOnWriteArrayList = this.e.get(i);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            Log.d("RVBaseAdapter", "onCreateViewHolder, getItemView from cache. type=" + i);
            return copyOnWriteArrayList.remove(0);
        }
        Log.d("RVBaseAdapter", "onCreateViewHolder, getItemView by creation. type=" + i);
        View inflate = this.b.inflate(fVar.b, (ViewGroup) null);
        inflate.setTag(aem.c.tag_type, Integer.valueOf(i));
        return inflate;
    }

    private void f(final int i) {
        ban.c(new Runnable() { // from class: aep.1
            @Override // java.lang.Runnable
            public void run() {
                Log.d("RVBaseAdapter", "createCachedItemView start, num2Create=" + i + " resourceName = " + aep.this.h + " hasClear = " + aep.this.i);
                if (aep.this.i) {
                    return;
                }
                boolean z = aep.this.l;
                int i2 = 0;
                while (i2 < i) {
                    final View inflate = aep.this.b.inflate(aep.this.g, (ViewGroup) null);
                    if (aep.this.k) {
                        break;
                    }
                    i2++;
                    final boolean z2 = z && i2 == aep.this.m;
                    ban.g(new Runnable() { // from class: aep.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            aep.this.d.add(inflate);
                            if (aep.this.i) {
                                aep.this.d.clear();
                            }
                            if (z2) {
                                aep.this.b(false);
                                aep.this.n.a();
                            }
                        }
                    });
                }
                if (z && aep.this.m > i) {
                    ban.g(new Runnable() { // from class: aep.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            aep.this.b(false);
                            aep.this.n.a();
                        }
                    });
                }
                Log.d("RVBaseAdapter", "createCachedItemView end, mCachedViewList.size=" + aep.this.d.size() + " resourceName = " + aep.this.h);
            }
        });
    }

    private void a(final int i, final int i2, final CopyOnWriteArrayList<View> copyOnWriteArrayList, final int i3) {
        ban.c(new Runnable() { // from class: aep.2
            @Override // java.lang.Runnable
            public void run() {
                Log.d("RVBaseAdapter", "createCachedItemView start, num2Create=" + i3 + ", type=" + i + " hasClear = " + aep.this.i);
                if (aep.this.i) {
                    return;
                }
                new ArrayList();
                for (int i4 = 0; i4 < i3; i4++) {
                    final View inflate = aep.this.b.inflate(i2, (ViewGroup) null);
                    if (aep.this.k) {
                        break;
                    }
                    ban.g(new Runnable() { // from class: aep.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            copyOnWriteArrayList.add(inflate);
                            if (aep.this.i) {
                                copyOnWriteArrayList.clear();
                            }
                        }
                    });
                }
                Log.d("RVBaseAdapter", "createCachedItemView end, mCachedViewList.size=" + copyOnWriteArrayList.size() + ", type=" + i);
            }
        });
    }

    public void i() {
        if (this.i) {
            return;
        }
        this.i = true;
        SparseArray<CopyOnWriteArrayList<View>> sparseArray = this.e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        CopyOnWriteArrayList<View> copyOnWriteArrayList = this.d;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
    }

    public void a(c cVar) {
        this.a = cVar;
    }

    /* compiled from: RVBaseAdapter.java */
    /* renamed from: aep$f */
    /* loaded from: classes2.dex */
    public static class f {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public f(int i, int i2, int i3) {
            this(i, i2, i3, 0);
        }

        public f(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    /* compiled from: RVBaseAdapter.java */
    /* renamed from: aep$e */
    /* loaded from: classes2.dex */
    public class e implements View.OnClickListener {
        private int b;
        private int c;

        public e() {
        }

        public void a(int i) {
            this.b = i;
        }

        public void b(int i) {
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!ShakeUtil.canExecute(view.getId()) || aep.this.a == null) {
                return;
            }
            aep.this.a.a(this.c, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RVBaseAdapter.java */
    /* renamed from: aep$d */
    /* loaded from: classes2.dex */
    public static class d extends ArrayList<RecyclerView.c> {
        private a mObserver = new a();

        public void a(RecyclerView recyclerView) {
            this.mObserver.a(recyclerView);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        /* renamed from: a */
        public boolean add(RecyclerView.c cVar) {
            if (size() == 0) {
                super.add(this.mObserver);
            }
            return this.mObserver.a(cVar);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        /* renamed from: a */
        public RecyclerView.c remove(int i) {
            return this.mObserver.a(i);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.mObserver.a(obj);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            return this.mObserver.b(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RVBaseAdapter.java */
    /* renamed from: aep$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.c {
        private List<RecyclerView.c> a = new ArrayList();
        private RecyclerView b;

        public void a(RecyclerView recyclerView) {
            this.b = recyclerView;
        }

        public boolean a(RecyclerView.c cVar) {
            if (this.a.contains(cVar)) {
                return false;
            }
            return this.a.add(cVar);
        }

        public RecyclerView.c a(int i) {
            if (i < this.a.size()) {
                return this.a.remove(i);
            }
            return null;
        }

        public boolean a(Object obj) {
            return this.a.contains(obj);
        }

        public int b(Object obj) {
            return this.a.indexOf(obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public void onChanged() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && recyclerView.isComputingLayout()) {
                this.b.post(new Runnable() { // from class: aep.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a();
                    }
                });
            } else {
                a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                this.a.get(size).onChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public void onItemRangeChanged(int i, int i2) {
            onItemRangeChanged(i, i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public void onItemRangeChanged(final int i, final int i2, final Object obj) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && recyclerView.isComputingLayout()) {
                this.b.post(new Runnable() { // from class: aep.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a(i, i2, obj);
                    }
                });
            } else {
                a(i, i2, obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, int i2, Object obj) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                this.a.get(size).onItemRangeChanged(i, i2, obj);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public void onItemRangeInserted(final int i, final int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && recyclerView.isComputingLayout()) {
                this.b.post(new Runnable() { // from class: aep.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a(i, i2);
                    }
                });
            } else {
                a(i, i2);
            }
        }

        public void a(int i, int i2) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                this.a.get(size).onItemRangeInserted(i, i2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public void onItemRangeRemoved(final int i, final int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && recyclerView.isComputingLayout()) {
                this.b.post(new Runnable() { // from class: aep.a.4
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.b(i, i2);
                    }
                });
            } else {
                b(i, i2);
            }
        }

        public void b(int i, int i2) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                this.a.get(size).onItemRangeRemoved(i, i2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public void onItemRangeMoved(final int i, final int i2, final int i3) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && recyclerView.isComputingLayout()) {
                this.b.post(new Runnable() { // from class: aep.a.5
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a(i, i2, i3);
                    }
                });
            } else {
                a(i, i2, i3);
            }
        }

        public void a(int i, int i2, int i3) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                this.a.get(size).onItemRangeMoved(i, i2, i3);
            }
        }
    }

    public void j() {
        this.k = true;
    }

    public void b(boolean z) {
        this.l = z;
    }

    public boolean k() {
        return this.l;
    }
}
