package com.xiaopeng.musicradio.webview.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.app.XDialogPure;
import defpackage.bdm;
/* compiled from: VipBuyLayoutDialog.java */
/* loaded from: classes2.dex */
public class b {
    private XDialogPure a;
    private int b;
    private String c;
    private Context d;

    public b(Context context, int i, String str) {
        this.d = context;
        this.b = i;
        this.c = str;
        c();
    }

    private void c() {
        XDialogPure.Parameters Builder = XDialogPure.Parameters.Builder();
        Builder.setLayoutParams(new ViewGroup.LayoutParams(680, 720));
        this.a = new XDialogPure(this.d, Builder);
        View inflate = LayoutInflater.from(this.d).inflate(bdm.d.vip_buy_dialog_layout, (ViewGroup) null);
        this.a.setVuiEngine(VuiEngine.getInstance(com.xiaopeng.musicradio.a.a));
        this.a.setContentView(inflate);
        this.a.setSystemDialog(2008);
        final VipBuyLayout vipBuyLayout = (VipBuyLayout) inflate.findViewById(bdm.c.vip_buy_layout);
        vipBuyLayout.a(this.b, this.c);
        vipBuyLayout.setCancleListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.webview.view.b.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                vipBuyLayout.g();
                b.this.a();
            }
        });
    }

    public void a() {
        this.a.dismiss();
    }

    public void b() {
        this.a.show();
    }
}
