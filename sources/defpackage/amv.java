package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: TimerManager.java */
/* renamed from: amv  reason: default package */
/* loaded from: classes2.dex */
public class amv {
    private c a;
    private List<b> b = new CopyOnWriteArrayList();

    /* compiled from: TimerManager.java */
    /* renamed from: amv$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final amv a = new amv();
    }

    public static amv a() {
        return a.a;
    }

    public amv() {
        b();
    }

    private void b() {
        c();
    }

    private void c() {
        this.a = new c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        com.xiaopeng.musicradio.a.a.registerReceiver(this.a, intentFilter);
    }

    public void a(Runnable runnable, long j) {
        if (j < 0) {
            return;
        }
        if (j < 60000) {
            ban.b(runnable, j);
            return;
        }
        b bVar = new b();
        bVar.a = runnable;
        bVar.b = System.currentTimeMillis() + j;
        this.b.add(bVar);
    }

    public void a(Runnable runnable) {
        ArrayList<b> arrayList = new ArrayList();
        for (b bVar : this.b) {
            if (bVar.a == runnable) {
                arrayList.add(bVar);
            }
        }
        for (b bVar2 : arrayList) {
            this.b.remove(bVar2);
        }
        ban.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<b> arrayList = new ArrayList();
        for (b bVar : this.b) {
            if (currentTimeMillis >= bVar.b) {
                bVar.a.run();
                arrayList.add(bVar);
            } else if (60000 + currentTimeMillis >= bVar.b) {
                arrayList.add(bVar);
                ban.b(bVar.a, bVar.b - currentTimeMillis);
            }
        }
        for (b bVar2 : arrayList) {
            this.b.remove(bVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TimerManager.java */
    /* renamed from: amv$b */
    /* loaded from: classes2.dex */
    public class b {
        Runnable a;
        long b;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TimerManager.java */
    /* renamed from: amv$c */
    /* loaded from: classes2.dex */
    public class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.TIME_TICK")) {
                amv.this.d();
            }
        }
    }
}
