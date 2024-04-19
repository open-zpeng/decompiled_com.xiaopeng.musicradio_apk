package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* compiled from: UsbRequestQueue.java */
/* renamed from: bbo  reason: default package */
/* loaded from: classes2.dex */
public class bbo<T> {
    private int b;
    private long c;
    private long d;
    private a f;
    private List<T> a = new ArrayList();
    private Runnable g = new Runnable() { // from class: bbo.1
        @Override // java.lang.Runnable
        public void run() {
            bbo.this.c();
            if (bbo.this.a.size() > 0) {
                bbo.this.e.postDelayed(bbo.this.g, bbo.this.c);
            }
        }
    };
    private Handler e = new Handler(Looper.getMainLooper());

    /* compiled from: UsbRequestQueue.java */
    /* renamed from: bbo$a */
    /* loaded from: classes2.dex */
    public interface a<T> {
        void d(List<T> list);
    }

    public bbo(int i, long j) {
        this.b = i;
        this.c = j;
    }

    public void a(List<T> list) {
        this.a.addAll(list);
        a();
    }

    public void a(T t) {
        this.a.add(t);
        a();
    }

    private void a() {
        b();
        if (System.currentTimeMillis() - this.d >= this.c) {
            c();
        }
    }

    private void b() {
        this.e.removeCallbacks(this.g);
        this.e.postDelayed(this.g, this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.d = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        int size = this.a.size();
        int i = this.b;
        if (size > i) {
            arrayList.addAll(this.a.subList(0, i));
            List<T> list = this.a;
            this.a = list.subList(this.b, list.size());
            Log.i("UsbRequestQueue", "onSlide1: ==== " + arrayList);
        } else {
            arrayList.addAll(this.a);
            this.a.clear();
            Log.i("UsbRequestQueue", "onSlide2: ==== " + arrayList);
        }
        a aVar = this.f;
        if (aVar != null) {
            aVar.d(arrayList);
        }
    }

    public void a(a<T> aVar) {
        this.f = aVar;
    }
}
