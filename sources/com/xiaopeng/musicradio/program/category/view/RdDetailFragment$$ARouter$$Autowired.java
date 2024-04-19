package com.xiaopeng.musicradio.program.category.view;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
/* loaded from: classes2.dex */
public class RdDetailFragment$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) sp.a().a((Class<? extends Object>) SerializationService.class);
        g gVar = (g) obj;
        gVar.h = gVar.getArguments().getString("auto_play");
        gVar.i = gVar.getArguments().getString("track_id");
        gVar.j = gVar.getArguments().getString("album_id");
        gVar.k = gVar.getArguments().getString("album_bean_gson");
    }
}
