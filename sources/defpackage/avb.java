package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.Callback;
import com.lzy.okgo.request.PostRequest;
import com.xiaopeng.musicradio.utils.z;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: XPPostRequest.java */
/* renamed from: avb  reason: default package */
/* loaded from: classes2.dex */
public class avb<T> extends PostRequest<T> {
    private String preJson;

    public avb(String str) {
        super(str);
    }

    @Override // com.lzy.okgo.request.base.Request
    public void execute(final Callback<T> callback) {
        if (getCacheMode() == CacheMode.FIRST_CACHE_THEN_REQUEST && getCachePolicy() == null) {
            cachePolicy(new auy(this));
        }
        ban.a(new Runnable() { // from class: avb.1
            @Override // java.lang.Runnable
            public void run() {
                auu.b();
                auu.b(avb.this);
                JsonObject jsonObject = new JsonObject();
                if (!TextUtils.isEmpty(avb.this.preJson)) {
                    avb.this.params((Map) z.a(avb.this.preJson, new TypeToken<Map<String, String>>() { // from class: avb.1.1
                    }.getType()), new boolean[0]);
                }
                auu.a(avb.this);
                if (avb.this.params != null) {
                    for (Map.Entry<String, List<String>> entry : avb.this.params.urlParamsMap.entrySet()) {
                        if (entry.getValue() != null && entry.getValue().size() > 0) {
                            jsonObject.addProperty(entry.getKey(), entry.getValue().get(0));
                        }
                    }
                }
                avb.this.upJson(new Gson().toJson((JsonElement) jsonObject));
                avb.super.execute(callback);
            }
        });
    }

    @Override // com.lzy.okgo.request.base.BodyRequest, com.lzy.okgo.request.base.HasBody
    /* renamed from: a */
    public PostRequest<T> upJson(String str) {
        this.preJson = str;
        return (PostRequest) super.upJson(str);
    }

    @Override // com.lzy.okgo.request.base.BodyRequest, com.lzy.okgo.request.base.HasBody
    /* renamed from: a */
    public PostRequest<T> upJson(JSONArray jSONArray) {
        this.preJson = jSONArray.toString();
        return (PostRequest) super.upJson(jSONArray);
    }

    @Override // com.lzy.okgo.request.base.BodyRequest, com.lzy.okgo.request.base.HasBody
    /* renamed from: a */
    public PostRequest<T> upJson(JSONObject jSONObject) {
        this.preJson = jSONObject.toString();
        return (PostRequest) super.upJson(jSONObject);
    }
}
