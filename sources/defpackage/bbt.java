package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: RetrieverPool.java */
/* renamed from: bbt  reason: default package */
/* loaded from: classes2.dex */
public class bbt {
    private Queue<bbr> a;
    private Runnable c = new Runnable() { // from class: bbt.1
        @Override // java.lang.Runnable
        public void run() {
            while (!bbt.this.a.isEmpty()) {
                bbr bbrVar = (bbr) bbt.this.a.poll();
                if (bbrVar != null) {
                    bbrVar.b();
                }
            }
        }
    };
    private Handler b = new Handler(Looper.getMainLooper());

    public bbt(int i) {
        this.a = new ArrayDeque(i);
    }

    public void a(bbr bbrVar) {
        bbrVar.a();
        this.a.add(bbrVar);
        b();
    }

    public bbr a() {
        bbr poll = this.a.poll();
        if (poll != null) {
            return poll;
        }
        b();
        return new bbr();
    }

    private void b() {
        this.b.removeCallbacks(this.c);
        this.b.postDelayed(this.c, 300000L);
    }
}
