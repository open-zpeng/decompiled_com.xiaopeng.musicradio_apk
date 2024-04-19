package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.model.bluetooth.b;
import com.xiaopeng.musicradio.model.bluetooth.d;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: BluetoothJobs.java */
/* renamed from: amy  reason: default package */
/* loaded from: classes2.dex */
public class amy {
    private Disposable a;
    private Disposable b;
    private d e;
    private Object f = new Object();
    private final int g = 10;
    private final int h = 13;
    private PriorityBlockingQueue<b> c = new PriorityBlockingQueue<>(20, new Comparator<b>() { // from class: amy.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return (int) (bVar.a() - bVar2.a());
        }
    });
    private PriorityBlockingQueue<b> d = new PriorityBlockingQueue<>(20, new Comparator<b>() { // from class: amy.2
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return (int) (bVar.a() - bVar2.a());
        }
    });

    public amy(d dVar) {
        this.e = dVar;
        b();
    }

    private void b() {
        Disposable disposable = this.a;
        if (disposable == null || disposable.isDisposed()) {
            this.a = a(250, 13);
        }
        Disposable disposable2 = this.b;
        if (disposable2 == null || disposable2.isDisposed()) {
            this.b = a(750, 10);
        }
    }

    private Disposable a(int i, final int i2) {
        return Observable.interval(i, TimeUnit.MILLISECONDS).observeOn(Schedulers.io()).subscribe(new Consumer<Long>() { // from class: amy.3
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Long l) {
                int i3 = i2;
                PriorityBlockingQueue priorityBlockingQueue = i3 == 10 ? amy.this.d : i3 == 13 ? amy.this.c : null;
                if (priorityBlockingQueue != null) {
                    b bVar = (b) priorityBlockingQueue.poll();
                    if (amy.this.e == null || bVar == null || amy.this.e.a(bVar.b(), bVar.c())) {
                        return;
                    }
                    if (amy.this.e.k()) {
                        if (bVar.d() < 10) {
                            b bVar2 = new b(bVar.b());
                            bVar2.a(bVar.d() + 1);
                            priorityBlockingQueue.add(bVar2);
                            return;
                        }
                        u.c(new age.j());
                        ban.g(new Runnable() { // from class: amy.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (aei.a().c() == 2) {
                                    aej c = aeh.a().c();
                                    if (c == null || c.e()) {
                                        ak.b(a.a, f.h.bt_op_fail_hint);
                                    }
                                }
                            }
                        });
                        return;
                    }
                    u.c(new age.j());
                }
            }
        });
    }

    public void a(b bVar) {
        synchronized (this.f) {
            if (bVar == null) {
                return;
            }
            PriorityBlockingQueue<b> priorityBlockingQueue = null;
            if (b(bVar.b())) {
                priorityBlockingQueue = this.d;
            } else if (c(bVar.b())) {
                priorityBlockingQueue = this.c;
            }
            if (priorityBlockingQueue == null) {
                LogUtils.e("BluetoothJobs", "opcode " + bVar + " exception in addBtJob!");
                return;
            }
            if (!priorityBlockingQueue.contains(bVar) && this.e.k()) {
                LogUtils.i("BluetoothJobs", "add job to queue :" + bVar.toString());
                priorityBlockingQueue.add(bVar);
                b();
            } else {
                LogUtils.i("BluetoothJobs", "dispose job to queue :" + bVar.toString());
            }
        }
    }

    public void a(String str) {
        synchronized (this.f) {
            ArrayList<b> arrayList = new ArrayList();
            PriorityBlockingQueue<b> priorityBlockingQueue = null;
            if (b(str)) {
                priorityBlockingQueue = this.d;
            } else if (c(str)) {
                priorityBlockingQueue = this.c;
            }
            if (priorityBlockingQueue == null) {
                LogUtils.e("BluetoothJobs", "opcode " + str + " exception in removeInstruction!");
                return;
            }
            priorityBlockingQueue.drainTo(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (b bVar : arrayList) {
                if (str != null && str.equalsIgnoreCase(bVar.b())) {
                    LogUtils.i("BluetoothJobs", "removeInstruction :" + str + " for time:" + bVar.a());
                }
                arrayList2.add(bVar);
            }
            priorityBlockingQueue.addAll(arrayList2);
        }
    }

    private boolean b(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == 193141440) {
            if (str.equals("bt_next")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 193207041) {
            if (str.equals("bt_play")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 193212928) {
            if (hashCode == 1694142409 && str.equals("bt_pause")) {
                c = 3;
            }
            c = 65535;
        } else {
            if (str.equals("bt_prev")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    private boolean c(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1700128249) {
            if (str.equals("bt_get_play_status")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -82800961) {
            if (hashCode == 738674331 && str.equals("bt_get_meta")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("bt_get_position")) {
                c = 2;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public void a() {
        this.c.clear();
        this.d.clear();
    }
}
