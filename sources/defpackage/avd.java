package defpackage;

import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.cache.policy.RequestFailedCachePolicy;
import com.lzy.okgo.db.CacheManager;
import com.lzy.okgo.request.base.Request;
import com.lzy.okgo.utils.HeaderParser;
import com.lzy.okgo.utils.HttpUtils;
/* compiled from: XpRequestFailCachePolicy.java */
/* renamed from: avd  reason: default package */
/* loaded from: classes2.dex */
public class avd<T> extends RequestFailedCachePolicy<T> {
    public avd(Request<T, ? extends Request> request) {
        super(request);
    }

    @Override // com.lzy.okgo.cache.policy.BaseCachePolicy, com.lzy.okgo.cache.policy.CachePolicy
    public CacheEntity<T> prepareCache() {
        if (this.request.getCacheKey() == null) {
            this.request.cacheKey(HttpUtils.createUrlFromParams(this.request.getBaseUrl(), this.request.getParams().urlParamsMap));
        }
        if (this.request.getCacheMode() == null) {
            this.request.cacheMode(CacheMode.NO_CACHE);
        }
        CacheMode cacheMode = this.request.getCacheMode();
        if (cacheMode != CacheMode.NO_CACHE) {
            this.cacheEntity = (CacheEntity<T>) CacheManager.getInstance().get(this.request.getCacheKey());
            HeaderParser.addCacheHeaders(this.request, this.cacheEntity, cacheMode);
            if (this.cacheEntity != null && this.cacheEntity.checkExpire(cacheMode, this.request.getCacheTime(), System.currentTimeMillis())) {
                this.cacheEntity.setExpire(true);
                CacheManager.getInstance().remove(this.request.getCacheKey());
            }
        }
        if (this.cacheEntity == null || this.cacheEntity.isExpire() || this.cacheEntity.getData() == null || this.cacheEntity.getResponseHeaders() == null) {
            this.cacheEntity = null;
        }
        return this.cacheEntity;
    }
}
