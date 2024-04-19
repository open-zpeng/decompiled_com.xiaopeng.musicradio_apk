package defpackage;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.adapter.Call;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.Callback;
import com.lzy.okgo.model.HttpMethod;
import com.lzy.okgo.request.base.NoBodyRequest;
import com.lzy.okgo.utils.HttpUtils;
import com.xiaopeng.musicradio.a;
import okhttp3.Request;
import okhttp3.RequestBody;
/* compiled from: XPGetRequest.java */
/* renamed from: auz  reason: default package */
/* loaded from: classes2.dex */
public class auz<T> extends NoBodyRequest<T, auz<T>> {
    private static final String TAG = "XPGetRequest";

    public auz(String str) {
        super(str);
    }

    @Override // com.lzy.okgo.request.base.Request
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override // com.lzy.okgo.request.base.Request
    public Request generateRequest(RequestBody requestBody) {
        return generateRequestBuilder(requestBody).get().url(this.url).tag(this.tag).build();
    }

    public Call<T> a(final Callback<T> callback) {
        HttpUtils.checkNotNull(callback, "callback == null");
        if (getCacheMode() == CacheMode.FIRST_CACHE_THEN_REQUEST && getCachePolicy() == null) {
            cachePolicy(new auy(this));
        }
        this.callback = callback;
        final Call<T> adapt = adapt();
        ban.a(new Runnable() { // from class: auz.1
            @Override // java.lang.Runnable
            public void run() {
                OkGo.getInstance().init(a.a);
                auu.b();
                auu.b(auz.this);
                auu.a(auz.this);
                adapt.execute(callback);
            }
        });
        return adapt;
    }
}
