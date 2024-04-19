package com.xiaopeng.musicradio.model.bluetooth;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
/* compiled from: PositionManager.java */
/* loaded from: classes.dex */
public class k {
    private long a = 0;
    private long b = 0;
    private long c = 0;
    private long d = 0;
    private Disposable e;
    private a f;

    /* compiled from: PositionManager.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(long j);
    }

    public void a(long j, int i, long j2) {
        if (i == 2) {
            if (this.b == j && j2 > 0) {
                if (this.d == 0) {
                    this.d = System.currentTimeMillis();
                }
                if (Math.abs(System.currentTimeMillis() - this.d) > 8000) {
                    c();
                }
            } else {
                u.c(new age.j());
                this.d = 0L;
            }
        }
        this.b = j;
        this.a = j;
        this.c = j2;
        e();
        b();
    }

    public void a() {
        d();
    }

    public void b() {
        Disposable disposable = this.e;
        if (disposable != null) {
            disposable.dispose();
        }
        LogUtils.d("PositionManager", "cancel called");
    }

    private void d() {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.bluetooth.k.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtils.d("PositionManager", "updatePositionByInterval");
                k.this.b();
                k.this.e = Observable.interval(1L, TimeUnit.SECONDS).observeOn(Schedulers.io()).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: com.xiaopeng.musicradio.model.bluetooth.k.1.1
                    @Override // io.reactivex.functions.Consumer
                    /* renamed from: a */
                    public void accept(Long l) {
                        k.this.a += TimeUnit.SECONDS.toMillis(1L);
                        k.this.e();
                    }
                }, Functions.emptyConsumer());
            }
        });
    }

    public void a(a aVar) {
        this.f = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(this.a);
        }
    }

    public void c() {
        b();
        u.c(new age.k());
    }
}
