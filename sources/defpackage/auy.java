package defpackage;

import android.util.Log;
import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.cache.policy.FirstCacheRequestPolicy;
import com.lzy.okgo.callback.Callback;
import com.lzy.okgo.model.HttpParams;
import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import com.xiaopeng.musicradio.utils.z;
import okhttp3.Call;
import okhttp3.ResponseBody;
/* compiled from: XPFirstCacheRequestPolicy.java */
/* renamed from: auy  reason: default package */
/* loaded from: classes2.dex */
public class auy<T> extends FirstCacheRequestPolicy<T> {
    public auy(Request<T, ? extends Request> request) {
        super(request);
    }

    @Override // com.lzy.okgo.cache.policy.FirstCacheRequestPolicy, com.lzy.okgo.cache.policy.CachePolicy
    public void onError(final Response<T> response) {
        runOnUiThread(new Runnable() { // from class: auy.1
            @Override // java.lang.Runnable
            public void run() {
                if (auy.this.cacheEntity == null) {
                    auy.this.mCallback.onError(response);
                }
                auy.this.mCallback.onFinish();
            }
        });
    }

    @Override // com.lzy.okgo.cache.policy.BaseCachePolicy, com.lzy.okgo.cache.policy.CachePolicy
    public boolean onAnalysisResponse(Call call, okhttp3.Response response) {
        BaseBean baseBean;
        String str = "";
        if (response != null && response.body() != null && response.body().contentType() != null) {
            str = response.body().contentType().toString();
        }
        if (response.code() == 200 && HttpParams.MEDIA_TYPE_JSON.toString().equalsIgnoreCase(str)) {
            try {
                ResponseBody peekBody = response.peekBody(response.body().contentLength());
                if (peekBody != null && (baseBean = (BaseBean) z.a(peekBody.string(), (Class<Object>) BaseBean.class)) != null && baseBean.getCode() != 200) {
                    Log.i("XPFirstCacheRequestPoli", "onAnalysisResponse: " + baseBean.getCode());
                    onSuccess(Response.success(false, this.request.getConverter().convertResponse(response), call, response));
                    return true;
                }
            } catch (Exception e) {
                Log.e("XPFirstCacheRequestPoli", "onAnalysisResponse: ", e);
            }
        }
        return false;
    }

    /* compiled from: XPFirstCacheRequestPolicy.java */
    /* renamed from: auy$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass2 implements Runnable {
        final /* synthetic */ CacheEntity a;

        AnonymousClass2(CacheEntity cacheEntity) {
            this.a = cacheEntity;
        }

        @Override // java.lang.Runnable
        public void run() {
            auy.this.mCallback.onStart(auy.this.request);
            try {
                auy.this.prepareRawCall();
                ban.b(new Runnable() { // from class: auy.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AnonymousClass2.this.a != null) {
                            Response<T> success = Response.success(true, AnonymousClass2.this.a.getData(), auy.this.rawCall, null);
                            if (success.body() != null && (success.body() instanceof BaseBean)) {
                                BaseBean baseBean = (BaseBean) success.body();
                                baseBean.setFromCache(true);
                                if (baseBean.getCode() == 200) {
                                    auy.this.mCallback.onCacheSuccess(success);
                                }
                            }
                        }
                        auv.a(new Runnable() { // from class: auy.2.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                auy.this.requestNetworkAsync();
                            }
                        });
                    }
                }, 300L);
            } catch (Throwable th) {
                auy.this.mCallback.onError(Response.error(false, auy.this.rawCall, null, th));
            }
        }
    }

    @Override // com.lzy.okgo.cache.policy.FirstCacheRequestPolicy, com.lzy.okgo.cache.policy.CachePolicy
    public void requestAsync(CacheEntity<T> cacheEntity, Callback<T> callback) {
        this.mCallback = callback;
        runOnUiThread(new AnonymousClass2(cacheEntity));
    }
}
