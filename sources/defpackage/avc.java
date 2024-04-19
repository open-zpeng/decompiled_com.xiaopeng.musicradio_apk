package defpackage;

import android.util.Log;
import com.lzy.okgo.model.Response;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import com.xiaopeng.musicradio.common.f;
/* compiled from: XPResponse.java */
/* renamed from: avc  reason: default package */
/* loaded from: classes2.dex */
public abstract class avc<T extends BaseBean> {
    public void a() {
    }

    public abstract void a(int i, String str);

    public abstract void a(T t);

    public void b(T t) {
        if (t == null) {
            if (!NetUtils.isNetworkAvailable(a.a)) {
                a(-1, a.a.getString(f.h.net_error_tip));
            } else {
                a(-1, a.a.getString(f.h.server_error_tip));
            }
        } else if (t.getCode() != 200) {
            c(t);
        } else {
            a((avc<T>) t);
        }
    }

    public void a(Response<T> response) {
        if (!NetUtils.isNetworkAvailable(a.a)) {
            a(-1, a.a.getString(f.h.net_error_tip));
        } else {
            a(-1, a.a.getString(f.h.server_error_tip));
        }
        if (response.getRawCall() != null && response.getRawCall().request() != null && response.getRawCall().request().url() != null) {
            Log.i("XPResponse", "onFailed: url = " + response.getRawCall().request().url().uri());
        }
        Log.i("XPResponse", "onFailed: code = " + response.code() + " cache = " + response.isFromCache());
        Log.e("XPResponse", "onFailed: ", response.getException());
    }

    private void c(T t) {
        if (t.getCode() == 5020005) {
            a(t.getCode(), t.getMsg());
        } else {
            a(t.getCode(), t.getMsg());
        }
    }
}
