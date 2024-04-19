package defpackage;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: LoggingInterceptor.java */
/* renamed from: aut  reason: default package */
/* loaded from: classes2.dex */
public class aut implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        System.nanoTime();
        Response proceed = chain.proceed(request);
        System.nanoTime();
        proceed.peekBody(1048576L);
        return proceed;
    }
}
