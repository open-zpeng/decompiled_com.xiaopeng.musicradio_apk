package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaopeng.lib.framework.module.Module;
import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.Callback;
import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IBizHelper;
import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IHttp;
import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.IResponse;
import com.xiaopeng.lib.framework.netchannelmodule.NetworkChannelsEntry;
import com.xiaopeng.lib.utils.LogUtils;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
/* compiled from: BizHelper.java */
/* renamed from: adc  reason: default package */
/* loaded from: classes2.dex */
public class adc {
    private static Gson a = new GsonBuilder().disableHtmlEscaping().create();
    private static String b;

    static {
        LogUtils.i("BizHelper", "secret=kMnH679fdCSPPQsa");
        b = "kMnH679fdCSPPQsa";
    }

    public static void a(a<adj<adk>> aVar) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("targetAppId", "xp_car_music");
        a("https://xmart.xiaopeng.com/open/oauth2/v3/getQrcode", hashMap, aVar);
    }

    public static void a(String str, a<adj<adi>> aVar) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("xpCode", str);
        a("https://xmart.xiaopeng.com/open/oauth2/v3/getAuthCode", hashMap, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BizHelper.java */
    /* renamed from: adc$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static class AnonymousClass1 implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Map b;
        final /* synthetic */ a c;

        AnonymousClass1(String str, Map map, a aVar) {
            this.a = str;
            this.b = map;
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            adc.b(this.a, this.b).buildWithSecretKey(adc.b).execute(new Callback() { // from class: adc.1.1
                @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.Callback
                public void onSuccess(final IResponse iResponse) {
                    final String body = iResponse.body();
                    boolean isEmpty = TextUtils.isEmpty(body);
                    LogUtils.i("BizHelper", "onSuccess:" + iResponse.code() + ",bodyEmpty=" + isEmpty + ",url=" + AnonymousClass1.this.a);
                    if (!isEmpty) {
                        ban.a(new Runnable() { // from class: adc.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                adc.b(AnonymousClass1.this.a, iResponse, AnonymousClass1.this.c, body);
                            }
                        });
                    } else {
                        AnonymousClass1.this.c.a(iResponse.code(), iResponse.message(), false);
                    }
                }

                @Override // com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.http.Callback
                public void onFailure(IResponse iResponse) {
                    LogUtils.e("BizHelper", "onFailure:code=" + iResponse.code() + ",body = " + iResponse.body() + ",url=" + AnonymousClass1.this.a);
                    AnonymousClass1.this.c.a(iResponse.code(), iResponse.message(), false);
                }
            });
        }
    }

    private static <T> void a(String str, Map<String, Object> map, a<adj<T>> aVar) {
        ban.a(new AnonymousClass1(str, map, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void b(String str, final IResponse iResponse, final a<adj<T>> aVar, String str2) {
        boolean z = false;
        try {
            final adj adjVar = (adj) a.fromJson(str2, aVar.a());
            if (adjVar != null) {
                if (adjVar.a != 200 && adjVar.a != 0) {
                    ban.g(new Runnable() { // from class: adc.3
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.a(adjVar.a, adjVar.c, true);
                        }
                    });
                    z = true;
                }
                ban.g(new Runnable() { // from class: adc.2
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a(adjVar);
                    }
                });
                z = true;
            }
        } catch (Throwable unused) {
            LogUtils.e("BizHelper", "数据data为空或Json解析出错:body=" + str2 + ",url=" + str);
        }
        if (z) {
            return;
        }
        ban.g(new Runnable() { // from class: adc.4
            @Override // java.lang.Runnable
            public void run() {
                a.this.a(iResponse.code(), iResponse.message(), false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IBizHelper b(String str, Map<String, Object> map) {
        auu.a();
        String json = map != null ? a.toJson(map) : null;
        if (json == null) {
            json = "{}";
        }
        IBizHelper uid = ((IHttp) Module.get(NetworkChannelsEntry.class).get(IHttp.class)).bizHelper().post(str, json).appId("xp_car_music").uid("-1");
        uid.needAuthorizationInfo().enableSecurityEncoding();
        return uid;
    }

    /* compiled from: BizHelper.java */
    /* renamed from: adc$a */
    /* loaded from: classes2.dex */
    public static abstract class a<T> {
        private Type a;

        public abstract void a(int i, String str, boolean z);

        public abstract void a(T t);

        public a(Type type) {
            this.a = type;
        }

        Type a() {
            return this.a;
        }
    }
}
