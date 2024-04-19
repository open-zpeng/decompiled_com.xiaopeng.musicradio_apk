package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: InflateHelper.java */
/* renamed from: afc  reason: default package */
/* loaded from: classes2.dex */
public class afc {
    protected LayoutInflater a;
    private ConcurrentHashMap<Integer, View> b;
    private CopyOnWriteArrayList<Integer> c;
    private CopyOnWriteArrayList<Integer> d;
    private ExecutorService e;

    /* compiled from: InflateHelper.java */
    /* renamed from: afc$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final afc a = new afc(null);
    }

    /* synthetic */ afc(AnonymousClass1 anonymousClass1) {
        this();
    }

    private afc() {
        this.b = new ConcurrentHashMap<>();
        this.c = new CopyOnWriteArrayList<>();
        this.d = new CopyOnWriteArrayList<>();
        this.e = Executors.newCachedThreadPool();
        this.a = LayoutInflater.from(com.xiaopeng.musicradio.a.a);
    }

    public static afc a() {
        return a.a;
    }

    /* compiled from: InflateHelper.java */
    /* renamed from: afc$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ int[] a;
        final /* synthetic */ afc b;

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr;
            for (int i : this.a) {
                this.b.b.put(Integer.valueOf(i), this.b.a.inflate(i, (ViewGroup) null));
            }
            if (this.b.d.size() > 0) {
                Iterator it = this.b.d.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (((View) this.b.b.remove(num)) != null) {
                        this.b.d.remove(num);
                        Log.i("InflateHelper", "preInflate end, remove no cached layout id=" + num);
                    }
                }
            }
            Log.i("InflateHelper", "preInflate end, mInflatedViewMap size=" + this.b.b.size() + ", mNoCachedLayoutIdList size=" + this.b.d.size());
        }
    }

    public View a(Integer num) {
        if (!this.c.contains(num)) {
            throw new IllegalStateException("Expect to get cached view without preInflating.");
        }
        this.c.remove(num);
        View remove = this.b.remove(num);
        if (remove == null) {
            this.d.add(num);
            View inflate = this.a.inflate(num.intValue(), (ViewGroup) null);
            Log.i("InflateHelper", "getInflateView by creation.");
            return inflate;
        }
        Log.i("InflateHelper", "getInflateView from cache, mInflatedViewMap size=" + this.b.size());
        return remove;
    }
}
