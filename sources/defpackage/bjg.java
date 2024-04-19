package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.Queue;
import me.yokeyword.fragmentation.c;
import me.yokeyword.fragmentation.h;
/* compiled from: ActionQueue.java */
/* renamed from: bjg  reason: default package */
/* loaded from: classes3.dex */
public class bjg {
    private Queue<bjf> a = new LinkedList();
    private Handler b;

    public bjg(Handler handler) {
        this.b = handler;
    }

    public void a(final bjf bjfVar) {
        if (d(bjfVar)) {
            return;
        }
        if (bjfVar.i == 4 && this.a.isEmpty() && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            bjfVar.a();
        } else {
            this.b.post(new Runnable() { // from class: bjg.1
                @Override // java.lang.Runnable
                public void run() {
                    bjg.this.b(bjfVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(bjf bjfVar) {
        this.a.add(bjfVar);
        if (this.a.size() == 1) {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.a.isEmpty()) {
            return;
        }
        bjf peek = this.a.peek();
        peek.a();
        c(peek);
    }

    private void c(bjf bjfVar) {
        if (bjfVar.i == 1) {
            c c = h.c(bjfVar.h);
            bjfVar.j = c == null ? 300L : c.u().m();
        }
        this.b.postDelayed(new Runnable() { // from class: bjg.2
            @Override // java.lang.Runnable
            public void run() {
                bjg.this.a.poll();
                bjg.this.a();
            }
        }, bjfVar.j);
    }

    private boolean d(bjf bjfVar) {
        bjf peek;
        return bjfVar.i == 3 && (peek = this.a.peek()) != null && peek.i == 1;
    }
}
