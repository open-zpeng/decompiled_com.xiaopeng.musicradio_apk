package com.xiaopeng.musicradio.web;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.app.XDialogPure;
/* compiled from: WebViewLayoutDialog.java */
/* loaded from: classes2.dex */
public class b {
    private XDialogPure a;
    private String b;
    private Context c;
    private int d;
    private long e = System.currentTimeMillis();

    public b(Context context, String str, int i) {
        this.d = 0;
        this.c = context;
        this.b = str;
        this.d = i;
        c();
    }

    private void c() {
        XDialogPure.Parameters Builder = XDialogPure.Parameters.Builder();
        Builder.setLayoutParams(new ViewGroup.LayoutParams(900, 872));
        this.a = new XDialogPure(this.c, Builder);
        View inflate = LayoutInflater.from(this.c).inflate(f.g.webview_dialog_layout, (ViewGroup) null);
        this.a.setSystemDialog(2008);
        this.a.setVuiSceneId("PureDialog");
        this.a.setVuiEngine(VuiEngine.getInstance(com.xiaopeng.musicradio.a.a));
        this.a.setContentView(inflate);
        WebViewLayout webViewLayout = (WebViewLayout) inflate.findViewById(f.C0131f.webview_layout);
        webViewLayout.setData(this.b);
        webViewLayout.setCancleListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.web.b.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                b.this.a();
                b.this.d();
            }
        });
        this.a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.xiaopeng.musicradio.web.b.2
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                b.this.d();
            }
        });
    }

    public void a() {
        this.a.dismiss();
    }

    public void b() {
        this.a.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.d;
        if (i == 0) {
            bdj.b(this.e, currentTimeMillis);
        } else if (i != 9) {
            switch (i) {
                case 2:
                    bdj.c(this.e, currentTimeMillis);
                    return;
                case 3:
                    bdj.a(this.e, currentTimeMillis);
                    return;
                default:
                    return;
            }
        } else {
            bdj.d(this.e, currentTimeMillis);
        }
    }
}
