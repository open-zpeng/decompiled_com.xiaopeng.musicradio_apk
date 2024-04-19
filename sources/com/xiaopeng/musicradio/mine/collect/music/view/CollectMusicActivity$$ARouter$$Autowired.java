package com.xiaopeng.musicradio.mine.collect.music.view;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
/* loaded from: classes.dex */
public class CollectMusicActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) sp.a().a((Class<? extends Object>) SerializationService.class);
        CollectMusicActivity collectMusicActivity = (CollectMusicActivity) obj;
        collectMusicActivity.g = collectMusicActivity.getIntent().getStringExtra("mode");
    }
}
