package com.xiaopeng.musicradio.webview.view;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
/* loaded from: classes2.dex */
public class WebViewActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) sp.a().a((Class<? extends Object>) SerializationService.class);
        WebViewActivity webViewActivity = (WebViewActivity) obj;
        webViewActivity.g = webViewActivity.getIntent().getStringExtra("dayUrl");
        webViewActivity.h = webViewActivity.getIntent().getStringExtra("nightUrl");
        webViewActivity.i = webViewActivity.getIntent().getBooleanExtra("titleEnable", webViewActivity.i);
    }
}
