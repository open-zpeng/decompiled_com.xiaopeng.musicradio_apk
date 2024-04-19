package com.xiaopeng.speech.common.util;
/* compiled from: IPCRunner.java */
/* loaded from: classes2.dex */
public class b<Proxy> extends com.xiaopeng.speech.common.util.a<a> {
    private volatile Proxy c;

    /* compiled from: IPCRunner.java */
    /* loaded from: classes2.dex */
    public interface a<Proxy, R> {
        R a(Proxy proxy);
    }

    public b(String str) {
        super(str);
    }

    public synchronized void c(Proxy proxy) {
        String str = this.a;
        c.b(str, "proxy = " + proxy);
        this.c = proxy;
    }

    @Override // com.xiaopeng.speech.common.util.a
    protected synchronized boolean a() {
        return this.c != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.speech.common.util.a
    /* renamed from: a */
    public synchronized Object b(a aVar) {
        try {
        } catch (Throwable th) {
            c.a(this.a, "ipc run catch exception ", th);
            return null;
        }
        return aVar.a(this.c);
    }
}
