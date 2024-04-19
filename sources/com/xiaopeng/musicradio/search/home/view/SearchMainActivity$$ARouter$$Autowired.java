package com.xiaopeng.musicradio.search.home.view;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
/* loaded from: classes2.dex */
public class SearchMainActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) sp.a().a((Class<? extends Object>) SerializationService.class);
        SearchMainActivity searchMainActivity = (SearchMainActivity) obj;
        searchMainActivity.f = searchMainActivity.getIntent().getIntExtra("search_voice_type", searchMainActivity.f);
        searchMainActivity.g = searchMainActivity.getIntent().getStringExtra("search_voice_keyword");
        searchMainActivity.h = searchMainActivity.getIntent().getStringExtra("search_voice_result");
        searchMainActivity.i = searchMainActivity.getIntent().getIntExtra("search_voice_total_page", searchMainActivity.i);
        searchMainActivity.j = searchMainActivity.getIntent().getStringExtra("voice_list_version");
    }
}
