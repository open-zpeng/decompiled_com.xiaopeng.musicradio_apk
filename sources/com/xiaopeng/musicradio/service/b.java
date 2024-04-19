package com.xiaopeng.musicradio.service;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.google.gson.Gson;
import java.lang.reflect.Type;
/* compiled from: JsonServiceImpl.java */
@Route(path = "/service/json")
/* loaded from: classes2.dex */
public class b implements SerializationService {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.alibaba.android.arouter.facade.service.SerializationService
    public <T> T json2Object(String str, Class<T> cls) {
        return (T) new Gson().fromJson(str, (Class<Object>) cls);
    }

    @Override // com.alibaba.android.arouter.facade.service.SerializationService
    public String object2Json(Object obj) {
        return new Gson().toJson(obj);
    }

    @Override // com.alibaba.android.arouter.facade.service.SerializationService
    public <T> T parseObject(String str, Type type) {
        return (T) new Gson().fromJson(str, type);
    }
}
