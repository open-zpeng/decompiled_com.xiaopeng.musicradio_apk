package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import com.lzy.okgo.db.CacheManager;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.model.HttpParams;
import com.lzy.okgo.request.PostRequest;
import com.lzy.okgo.request.base.Request;
import com.xiaopeng.lib.framework.module.Module;
import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IHttp;
import com.xiaopeng.lib.framework.netchannelmodule.NetworkChannelsEntry;
import com.xiaopeng.lib.http.HttpsUtils;
import com.xiaopeng.lib.http.Security;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.libconfig.ipc.AccountConfig;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.bi;
import com.xiaopeng.musicradio.utils.bj;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: OKHelper.java */
/* renamed from: auu  reason: default package */
/* loaded from: classes2.dex */
public class auu {
    public static volatile boolean a = false;
    private static Object b = new Object();
    private static aus c = new aur();
    private static volatile boolean d = false;

    public static void a(final Application application) {
        Thread thread = new Thread(new Runnable() { // from class: auu.1
            @Override // java.lang.Runnable
            public void run() {
                HttpsUtils.init(application, true);
                Module.register(NetworkChannelsEntry.class, new NetworkChannelsEntry());
                ((IHttp) Module.get(NetworkChannelsEntry.class).get(IHttp.class)).config().connectTimeout(8000).readTimeout(8000).writeTimeout(8000).dnsTimeout(8000).retryCount(2).addInterceptor(new aux()).applicationContext(application).enableTrafficStats().addInterceptor(new aut()).apply();
                synchronized (auu.b) {
                    auu.a = true;
                    auu.c();
                    auu.b.notifyAll();
                }
            }
        });
        thread.setPriority(1);
        thread.start();
    }

    public static void a() {
        if (a) {
            return;
        }
        synchronized (b) {
            if (!a) {
                try {
                    b.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static <T> auz<T> a(String str) {
        a();
        return new auz<>(str);
    }

    public static <T> PostRequest<T> b(String str) {
        a();
        return new avb(str);
    }

    public static void a(Request request) {
        if (request == null) {
            return;
        }
        HttpParams params = request.getParams();
        Map<String, String> hashMap = new HashMap<>();
        if (params != null) {
            for (Map.Entry<String, List<String>> entry : params.urlParamsMap.entrySet()) {
                if (entry.getValue() != null && entry.getValue().size() > 0) {
                    hashMap.put(entry.getKey(), entry.getValue().get(0));
                }
            }
        }
        a(hashMap);
        if (params != null && params.urlParamsMap != null) {
            params.urlParamsMap.clear();
        }
        request.params(hashMap, new boolean[0]);
    }

    public static void b(Request request) {
        if (request == null) {
            return;
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.put("Client", "car.xmart.com/" + a((Context) a.a));
        httpHeaders.put("Content-Type", "application/json");
        httpHeaders.put("DeviceId", bi.a());
        httpHeaders.put("test_time", System.currentTimeMillis() + "");
        c.a(httpHeaders, request.getHeaders());
        httpHeaders.put("CarType", "d55");
        request.headers(httpHeaders);
        HashMap hashMap = new HashMap();
        hashMap.put(AccountConfig.KEY_APP_ID, "xmart:appid:002");
        request.params(hashMap, new boolean[0]);
    }

    private static void a(Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis();
        map.put("timestamp", String.valueOf(currentTimeMillis));
        map.put(AccountConfig.KEY_SIGN, Security.sign(a.a, map, currentTimeMillis));
    }

    private static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "V1.0.0";
        }
    }

    public static void b() {
        if (d || bj.b()) {
            return;
        }
        ban.g(new Runnable() { // from class: auu.2
            @Override // java.lang.Runnable
            public void run() {
                ak.b(a.a, f.h.nospace_error_tip);
            }
        });
        d = true;
    }

    public static void c() {
        int d2 = aff.d();
        if (d2 == -1 || d2 > 26) {
            return;
        }
        LogUtils.i("OKHelper", "CacheManager.getInstance().clear()");
        CacheManager.getInstance().clear();
    }
}
