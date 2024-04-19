package defpackage;

import com.lzy.okgo.callback.AbsCallback;
import com.lzy.okgo.model.Response;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import com.xiaopeng.musicradio.utils.z;
import java.lang.reflect.ParameterizedType;
import okhttp3.ResponseBody;
/* compiled from: XPOkCallback.java */
/* renamed from: ava  reason: default package */
/* loaded from: classes2.dex */
public class ava<T extends BaseBean> extends AbsCallback<T> {
    private final avc<T> a;

    public ava(avc<T> avcVar) {
        this.a = avcVar;
    }

    public ava() {
        this.a = null;
    }

    @Override // com.lzy.okgo.callback.Callback
    public void onSuccess(Response<T> response) {
        avc<T> avcVar = this.a;
        if (avcVar != null) {
            avcVar.b(response.body());
        }
    }

    @Override // com.lzy.okgo.callback.AbsCallback, com.lzy.okgo.callback.Callback
    public void onError(Response<T> response) {
        avc<T> avcVar = this.a;
        if (avcVar != null) {
            avcVar.a(response);
        }
    }

    @Override // com.lzy.okgo.callback.AbsCallback, com.lzy.okgo.callback.Callback
    public void onFinish() {
        avc<T> avcVar = this.a;
        if (avcVar != null) {
            avcVar.a();
        }
    }

    @Override // com.lzy.okgo.convert.Converter
    /* renamed from: a */
    public T convertResponse(okhttp3.Response response) {
        Class<?> cls;
        ResponseBody body = response.body();
        if (body == null) {
            return null;
        }
        avc<T> avcVar = this.a;
        if (avcVar == null) {
            cls = getClass();
        } else {
            cls = avcVar.getClass();
        }
        return (T) z.a(body.string(), (Class<Object>) ((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[0]);
    }

    @Override // com.lzy.okgo.callback.AbsCallback, com.lzy.okgo.callback.Callback
    public void onCacheSuccess(Response<T> response) {
        if (response.body() == null || !(response.body() instanceof BaseBean)) {
            return;
        }
        T body = response.body();
        body.setFromCache(true);
        if (body.getCode() == 200) {
            onSuccess(response);
        } else {
            onError(response);
        }
    }
}
