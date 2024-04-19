package com.xiaopeng.musicradio.service;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.asm.Opcodes;
/* loaded from: classes2.dex */
public class WebViewService extends a implements bdn {
    @Override // com.xiaopeng.musicradio.service.a
    protected void a() {
    }

    @Override // defpackage.bdn
    public void start(String str, String str2) {
        Activity c = com.xiaopeng.musicradio.utils.a.a().c();
        if (c != null) {
            sp.a().a("/webview/webview").withString("dayUrl", str).withString("nightUrl", str2).withBoolean("titleEnable", true).navigation(c, Opcodes.IF_ICMPGT);
        } else {
            sp.a().a("/webview/webview").withString("dayUrl", str).withString("nightUrl", str2).withBoolean("titleEnable", true).navigation();
        }
    }

    @Override // defpackage.bdn
    public void startVipBuy(int i) {
        Context c = com.xiaopeng.musicradio.utils.a.a().c();
        if (c == null) {
            c = com.xiaopeng.musicradio.a.a;
        }
        new com.xiaopeng.musicradio.webview.view.b(c, i, "").b();
    }

    public void startByUrl(int i, String str) {
        Context c = com.xiaopeng.musicradio.utils.a.a().c();
        if (c == null) {
            c = com.xiaopeng.musicradio.a.a;
        }
        new com.xiaopeng.musicradio.webview.view.b(c, i, str).b();
    }
}
