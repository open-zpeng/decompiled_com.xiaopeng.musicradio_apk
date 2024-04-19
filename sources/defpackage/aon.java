package defpackage;

import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PreloadPageHandler.java */
/* renamed from: aon  reason: default package */
/* loaded from: classes2.dex */
public class aon<T> {
    private boolean a;
    private boolean b;
    private Disposable c;

    /* compiled from: PreloadPageHandler.java */
    /* renamed from: aon$a */
    /* loaded from: classes2.dex */
    public interface a<T> {
        int a(T t);

        Observable<T> a(int i, int i2);

        void a();

        void a(ListSignBean listSignBean, T t, int i);

        void a(List<T> list);
    }

    public void a(final ListSignBean listSignBean, final int i, final int i2, int i3, int i4, boolean z, final a<T> aVar) {
        Observable<Integer> a2;
        if (aVar == null) {
            return;
        }
        a();
        final int i5 = z ? i3 : 1;
        LogUtils.i("PreloadPageHandler", "startPage = %d, preloadPage = %d, totalPage = %d", Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(i4));
        if (i == 1) {
            Log.i("PreloadPageHandler", "preloadPageReq:pageSize = " + i2);
            a2 = aVar.a(1, i2).onErrorReturn(new Function<Throwable, T>() { // from class: aon.2
                @Override // io.reactivex.functions.Function
                /* renamed from: a */
                public T apply(@NonNull Throwable th) {
                    aVar.a();
                    return null;
                }
            }).flatMap((Function<T, ObservableSource<Integer>>) new Function<T, ObservableSource<Integer>>() { // from class: aon.1
                @Override // io.reactivex.functions.Function
                /* renamed from: a */
                public Observable<Integer> apply(@NonNull T t) {
                    int a3 = aVar.a((a) t);
                    Log.i("PreloadPageHandler", "preloadPageReq:retTotalPage = " + a3);
                    int max = Math.max(1, a3);
                    aVar.a(listSignBean, t, max);
                    if (max == 1) {
                        aon.this.b = true;
                    }
                    return aon.this.a(i + 1, i5 - 1, max);
                }
            });
        } else if (i4 <= 1) {
            a2 = aVar.a(1, 1).onErrorReturn(new Function<Throwable, T>() { // from class: aon.4
                @Override // io.reactivex.functions.Function
                /* renamed from: a */
                public T apply(@NonNull Throwable th) {
                    aVar.a();
                    return null;
                }
            }).flatMap((Function<T, ObservableSource<Integer>>) new Function<T, ObservableSource<Integer>>() { // from class: aon.3
                @Override // io.reactivex.functions.Function
                /* renamed from: a */
                public Observable<Integer> apply(@NonNull T t) {
                    return aon.this.a(i, i5, Math.max(1, (int) Math.ceil(aVar.a((a) t) / (i2 + 0.0f))));
                }
            });
        } else {
            a2 = a(i, i5, i4);
        }
        this.c = a2.flatMap(new Function<Integer, ObservableSource<T>>() { // from class: aon.9
            @Override // io.reactivex.functions.Function
            /* renamed from: a */
            public Observable<T> apply(Integer num) {
                Log.i("PreloadPageHandler", "flat apply: page = " + num);
                return aVar.a(num.intValue(), i2).onErrorResumeNext(Observable.empty());
            }
        }).collect(new Callable<List<T>>() { // from class: aon.7
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<T> call() {
                return new ArrayList();
            }
        }, new BiConsumer<List<T>, T>() { // from class: aon.8
            @Override // io.reactivex.functions.BiConsumer
            /* renamed from: a */
            public void accept(List<T> list, T t) {
                list.add(t);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<List<T>>() { // from class: aon.5
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(List<T> list) {
                if (aon.this.b) {
                    return;
                }
                if (aon.this.a && list.isEmpty()) {
                    aVar.a();
                } else {
                    aVar.a((List) list);
                }
            }
        }, new Consumer<Throwable>() { // from class: aon.6
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Throwable th) {
                aon.this.a = true;
                Log.e("PreloadPageHandler", "accept: ", th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable<Integer> a(int i, int i2, int i3) {
        int min = Math.min(i3 + 1, i + i2);
        LogUtils.i("PreloadPageHandler", "startPage = %d, pageNum = %d, totalPage = %d, targetPage = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(min));
        ArrayList arrayList = new ArrayList();
        while (i < min) {
            arrayList.add(Integer.valueOf(i));
            i++;
        }
        return Observable.fromIterable(arrayList);
    }

    public void a() {
        Disposable disposable = this.c;
        if (disposable != null) {
            disposable.dispose();
        }
        this.a = false;
        this.b = false;
    }
}
