package com.xiaopeng.musicradio.widget;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
/* loaded from: classes2.dex */
public class BaseSubActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) sp.a().a((Class<? extends Object>) SerializationService.class);
        c cVar = (c) obj;
        cVar.k = cVar.getIntent().getStringExtra("fragment_uri");
    }
}
