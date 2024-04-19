package com.xiaopeng.musicradio.netradio.category.category.view;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
/* loaded from: classes.dex */
public class NrCategoryDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) sp.a().a((Class<? extends Object>) SerializationService.class);
        NrCategoryDetailActivity nrCategoryDetailActivity = (NrCategoryDetailActivity) obj;
        nrCategoryDetailActivity.f = nrCategoryDetailActivity.getIntent().getIntExtra("radio_id", nrCategoryDetailActivity.f);
        nrCategoryDetailActivity.g = nrCategoryDetailActivity.getIntent().getStringExtra("radio_title");
    }
}
