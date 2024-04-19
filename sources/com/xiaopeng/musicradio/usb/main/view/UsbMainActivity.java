package com.xiaopeng.musicradio.usb.main.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.exoplayer2.ext.cornet.Log;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.usb.main.presenter.UsbMainPresenter;
import com.xiaopeng.musicradio.widget.DialogTopLayout;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Route(path = "/usbview/usbmainview")
/* loaded from: classes2.dex */
public class UsbMainActivity extends com.xiaopeng.musicradio.commonui.vui.a<a, UsbMainPresenter> implements a {
    private static final Map<String, Integer> j = new HashMap();
    public DialogTopLayout f;
    public LoadingTipsView g;
    private RelativeLayout h;
    private UsbMainContent i;
    private int k = 0;

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MusicUsbMain";
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public boolean o() {
        return false;
    }

    static {
        j.put("song", 0);
        j.put("singer", 1);
        j.put("album", 2);
        j.put("file", 3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: q */
    public UsbMainPresenter e() {
        return new UsbMainPresenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return a.c.layout_usb_main;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(getIntent());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.h = (RelativeLayout) findViewById(a.b.tips_layout);
        this.f = (DialogTopLayout) findViewById(a.b.ms_top_layout);
        this.g = (LoadingTipsView) findViewById(a.b.loadingview);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        this.f.setTitle(ListSignBean.USB_MUSIC_TITLE);
        this.h.setVisibility(8);
        this.f.a(false);
        a(1);
        findViewById(a.b.btn_test).setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.usb.main.view.UsbMainActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                bbh.a().c();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        this.f.setCloseListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.usb.main.view.UsbMainActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UsbMainActivity.this.finish();
            }
        });
    }

    public void a(int i) {
        this.g.setState(i);
    }

    @Override // com.xiaopeng.musicradio.usb.main.view.a
    public void a() {
        a(1);
        UsbMainContent usbMainContent = this.i;
        if (usbMainContent != null) {
            usbMainContent.setVisibility(8);
        }
        this.h.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.usb.main.view.a
    public void b() {
        a(0);
        UsbMainContent usbMainContent = this.i;
        if (usbMainContent != null) {
            usbMainContent.setVisibility(8);
        }
        this.h.setVisibility(0);
    }

    @Override // com.xiaopeng.musicradio.usb.main.view.a
    public void au_() {
        if (this.i == null) {
            ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.usb.main.view.UsbMainActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    ViewStub viewStub = (ViewStub) UsbMainActivity.this.findViewById(a.b.usb_main_content);
                    if (viewStub != null) {
                        UsbMainActivity.this.i = (UsbMainContent) viewStub.inflate();
                        UsbMainActivity.this.i.setVisibility(0);
                        UsbMainActivity.this.i.a(UsbMainActivity.this.k);
                    }
                    UsbMainActivity.this.a(0);
                    UsbMainActivity.this.onBuildScene();
                }
            }, 50L);
        } else {
            a(0);
            this.i.setVisibility(0);
            this.i.a(this.k);
            onBuildScene();
        }
        this.h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent);
    }

    private void a(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        String queryParameter = data.getQueryParameter("tab");
        Log.i("UsbMainActivity", "selectTab: " + queryParameter);
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        this.k = j.get(queryParameter).intValue();
        UsbMainContent usbMainContent = this.i;
        if (usbMainContent == null || usbMainContent.getVisibility() != 0) {
            return;
        }
        this.i.a(this.k);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public List<View> p() {
        UsbMainContent usbMainContent = this.i;
        if (usbMainContent != null) {
            return usbMainContent.getBuildViewList();
        }
        return new ArrayList();
    }
}
