package com.xiaopeng.lib.framework.netchannelmodule.http.okgoadapter;

import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.request.PostRequest;
import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.Callback;
import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest;
import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IResponse;
import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.xmart.IServerCallback;
import com.xiaopeng.lib.framework.netchannelmodule.common.GlobalConfig;
import com.xiaopeng.lib.framework.netchannelmodule.common.TrafficStatsEntry;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class BasePostRequestAdapter<T> implements IRequest {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private PostRequest<T> mInternalRequest;

    public BasePostRequestAdapter(String str) {
        this.mInternalRequest = new PostRequest<>(str);
        if (GlobalConfig.getApplicationContext() != null) {
            headers(GlobalConfig.PACKAGE_IDENTIFIER, GlobalConfig.getApplicationName());
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest uploadJson(String str) {
        this.mInternalRequest.upJson(str);
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest uploadFile(String str) {
        File file = new File(str);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        this.mInternalRequest.upFile(file);
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IResponse execute() {
        TrafficStatsEntry.setTraficInfo();
        return new ResponseAdapter(this.mInternalRequest.execute());
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public void execute(Callback callback) {
        throw new RuntimeException("Not supported!!!");
    }

    public void execute(com.lzy.okgo.callback.Callback callback) {
        this.mInternalRequest.execute(callback);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public void execute(IServerCallback iServerCallback) {
        throw new RuntimeException("Not supported!!!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public String getUrl() {
        return this.mInternalRequest.getUrl();
    }

    public HttpHeaders getHeaders() {
        return this.mInternalRequest.getHeaders();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest headers(String str, String str2) {
        this.mInternalRequest.headers(str, str2);
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest isMultipart(boolean z) {
        this.mInternalRequest.isMultipart(z);
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest removeHeader(String str) {
        this.mInternalRequest.removeHeader(str);
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest removeAllHeaders() {
        this.mInternalRequest.removeAllHeaders();
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest tag(Object obj) {
        this.mInternalRequest.tag(obj);
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest params(Map<String, String> map, boolean... zArr) {
        this.mInternalRequest.params(map, zArr);
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest params(String str, String str2) {
        this.mInternalRequest.params(str, str2, new boolean[0]);
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest params(String str, int i) {
        this.mInternalRequest.params(str, i, new boolean[0]);
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest params(String str, float f) {
        this.mInternalRequest.params(str, f, new boolean[0]);
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest params(String str, boolean z) {
        this.mInternalRequest.params(str, z, new boolean[0]);
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest params(String str, File file) {
        this.mInternalRequest.params(str, file);
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest removeParam(String str) {
        this.mInternalRequest.removeParam(str);
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public IRequest removeAllParams() {
        this.mInternalRequest.removeAllParams();
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public String header(String str) {
        return this.mInternalRequest.getHeaders().get(str);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IRequest
    public Map<String, List<String>> headers() {
        if (this.mInternalRequest.getRequest() == null || this.mInternalRequest.getRequest().headers() == null) {
            return null;
        }
        return this.mInternalRequest.getRequest().headers().toMultimap();
    }
}
