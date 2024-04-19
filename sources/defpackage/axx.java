package defpackage;

import com.lzy.okgo.adapter.Call;
import com.lzy.okgo.model.Response;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
/* compiled from: RxOkAdapterObservable.java */
/* renamed from: axx  reason: default package */
/* loaded from: classes2.dex */
public abstract class axx<T extends BaseBean> extends Observable<T> {
    protected abstract a<T> a();

    protected abstract Call<T> a(avc<T> avcVar);

    @Override // io.reactivex.Observable
    protected final void subscribeActual(Observer<? super T> observer) {
        a<T> a2 = a();
        a2.a(observer);
        observer.onSubscribe(a2);
        if (a2.isDisposed()) {
            return;
        }
        a2.a(a(a2));
    }

    /* compiled from: RxOkAdapterObservable.java */
    /* renamed from: axx$a */
    /* loaded from: classes2.dex */
    public static class a<T extends BaseBean> extends avc<T> implements Disposable {
        private Call<T> a;
        boolean b = false;
        boolean c = false;
        private Observer<? super T> d;
        private volatile boolean e;

        void a(Observer<? super T> observer) {
            this.d = observer;
        }

        void a(Call<T> call) {
            this.a = call;
        }

        @Override // defpackage.avc
        public final void a(T t) {
            if (this.e) {
                return;
            }
            try {
                this.d.onNext(t);
            } catch (Throwable th) {
                if (this.b) {
                    RxJavaPlugins.onError(th);
                } else if (this.e) {
                } else {
                    try {
                        this.d.onError(th);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        RxJavaPlugins.onError(new CompositeException(th, th2));
                    }
                }
            }
        }

        @Override // defpackage.avc
        public final void a(int i, String str) {
            Call<T> call = this.a;
            if (call == null || call.isCanceled()) {
                return;
            }
            auw auwVar = new auw(i, str);
            try {
                this.c = true;
                this.d.onError(auwVar);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(new CompositeException(auwVar, th));
            }
        }

        @Override // defpackage.avc
        public final void b(T t) {
            super.b(t);
        }

        @Override // defpackage.avc
        public final void a(Response<T> response) {
            super.a(response);
        }

        @Override // defpackage.avc
        public final void a() {
            if (this.e) {
                return;
            }
            if (this.c) {
                this.c = false;
                return;
            }
            try {
                this.b = true;
                this.d.onComplete();
            } catch (Throwable th) {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.e = true;
            Call<T> call = this.a;
            if (call != null) {
                call.cancel();
                this.a = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.e;
        }
    }
}
