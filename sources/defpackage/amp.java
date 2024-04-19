package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: DataFetchManager.java */
/* renamed from: amp  reason: default package */
/* loaded from: classes2.dex */
public class amp {
    public CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    public ConcurrentHashMap<Class, Boolean> b = new ConcurrentHashMap<>();
    private boolean c;
    private boolean d;
    private long e;

    /* compiled from: DataFetchManager.java */
    /* renamed from: amp$a */
    /* loaded from: classes2.dex */
    public interface a {
        void p_();
    }

    /* compiled from: DataFetchManager.java */
    /* renamed from: amp$b */
    /* loaded from: classes2.dex */
    public interface b {
        void q_();
    }

    /* compiled from: DataFetchManager.java */
    /* renamed from: amp$c */
    /* loaded from: classes2.dex */
    private static class c {
        static final amp a = new amp();
    }

    public static amp a() {
        return c.a;
    }

    public amp() {
        u.a(this);
        this.c = NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a());
        this.e = System.currentTimeMillis();
    }

    public void a(a aVar, boolean z) {
        if (aVar == null) {
            return;
        }
        Class<?> cls = aVar.getClass();
        if (z && this.a.contains(aVar)) {
            this.b.put(cls, true);
        } else {
            this.b.remove(cls);
        }
    }

    public void a(a aVar) {
        if (aVar == null || this.a.contains(aVar)) {
            return;
        }
        this.a.add(aVar);
    }

    public void b(a aVar) {
        if (aVar != null) {
            this.a.remove(aVar);
            this.b.remove(aVar.getClass());
        }
    }

    private boolean c() {
        boolean isNetworkAvailable = NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a());
        this.c = isNetworkAvailable;
        return isNetworkAvailable;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPowerStateChange(agg.s sVar) {
        if (sVar.a()) {
            this.e = System.currentTimeMillis();
            this.d = true;
            if (c()) {
                b("onPowerStateChange");
                return;
            } else {
                LogUtils.i("DataFetchManager", "onPowerStateChange:Invalid");
                return;
            }
        }
        LogUtils.i("DataFetchManager", "onPowerStateChange:off");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNetWorkValid(agg.p pVar) {
        this.c = true;
        if (this.d) {
            b("onNetWorkValid");
            return;
        }
        LogUtils.i("DataFetchManager", "onNetWorkValid:ignore");
        a("onNetWorkValid");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNetWorkInvalid(agg.o oVar) {
        LogUtils.i("DataFetchManager", "onNetWorkInvalid:mDataFetch=" + this.d);
        this.c = false;
    }

    private void a(String str) {
        boolean f = com.xiaopeng.musicradio.model.car.a.a().f();
        LogUtils.i("DataFetchManager", "performErrorRetry:from" + str + ",igOn=" + f + ",mDataFetch=" + this.d + ",mNetValid=" + this.c);
        if (f) {
            Iterator<a> it = this.a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                Boolean bool = next instanceof b ? this.b.get(next.getClass()) : null;
                if (bool != null && bool.booleanValue()) {
                    try {
                        ((b) next).q_();
                    } catch (Exception e) {
                        LogUtils.e("DataFetchManager", "performErrorRetry", e);
                    }
                }
            }
        }
    }

    private void b(String str) {
        boolean f = com.xiaopeng.musicradio.model.car.a.a().f();
        LogUtils.i("DataFetchManager", "performDataFetch:from" + str + ",igOn=" + f + ",mDataFetch=" + this.d + ",mNetValid=" + this.c);
        if (f && this.d) {
            this.d = false;
            Iterator<a> it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    it.next().p_();
                } catch (Exception e) {
                    LogUtils.e("DataFetchManager", "performDataFetch", e);
                }
            }
        }
    }

    public long b() {
        return this.e;
    }
}
