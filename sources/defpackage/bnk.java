package defpackage;
/* compiled from: Subscriber.java */
/* renamed from: bnk  reason: default package */
/* loaded from: classes3.dex */
public interface bnk<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(bnl bnlVar);
}
