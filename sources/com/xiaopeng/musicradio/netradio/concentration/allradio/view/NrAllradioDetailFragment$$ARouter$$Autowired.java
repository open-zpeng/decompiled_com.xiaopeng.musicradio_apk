package com.xiaopeng.musicradio.netradio.concentration.allradio.view;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
/* loaded from: classes.dex */
public class NrAllradioDetailFragment$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) sp.a().a((Class<? extends Object>) SerializationService.class);
        c cVar = (c) obj;
        cVar.d = cVar.getArguments().getInt("radio_id");
    }
}
