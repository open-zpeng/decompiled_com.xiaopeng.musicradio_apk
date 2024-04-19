package com.xiaopeng.musicradio.mine.playlist.customdetaillist.view;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
/* loaded from: classes.dex */
public class CustomDetailListActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) sp.a().a((Class<? extends Object>) SerializationService.class);
        CustomDetailListActivity customDetailListActivity = (CustomDetailListActivity) obj;
        customDetailListActivity.g = customDetailListActivity.getIntent().getLongExtra("album_id", customDetailListActivity.g);
        customDetailListActivity.n = customDetailListActivity.getIntent().getStringExtra("album_logo");
        customDetailListActivity.o = customDetailListActivity.getIntent().getStringExtra("album_name");
        customDetailListActivity.p = customDetailListActivity.getIntent().getStringExtra("album_description");
    }
}
