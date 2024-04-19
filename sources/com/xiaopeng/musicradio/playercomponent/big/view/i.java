package com.xiaopeng.musicradio.playercomponent.big.view;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.playercomponent.big.presenter.ShareCommunityDialogPresenter;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.ba;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import defpackage.agg;
import defpackage.avp;
/* compiled from: ShareCommunityDialog.java */
/* loaded from: classes2.dex */
public class i implements f {
    private final Context a;
    private final ShareCommunityDialogPresenter b;
    private final XDialog c;
    private View.OnClickListener d;
    private final h e;

    public i(Context context) {
        LogUtils.i("ShareCommunityDialog", "Create Share Dialog");
        this.a = context;
        this.b = new ShareCommunityDialogPresenter();
        this.b.onCreate(null);
        this.c = new XDialog(this.a, avp.e.XDialogView_PlayerShareDialog);
        this.c.setVuiSceneId("ShareCommunityDialog");
        this.c.setVuiEngine(VuiEngine.getInstance(com.xiaopeng.musicradio.a.a));
        this.c.setTitle(avp.d.share_title).setIcon((Drawable) null).setMessage((CharSequence) null).setPositiveButton(avp.d.share_immediately, new XDialogInterface.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.i.3
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog, int i) {
                ba.b(i.this.e.findFocus());
                if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
                    i.this.b.a(i.this.e.getContent());
                } else {
                    i.this.b((String) null);
                }
            }
        }).setNegativeButton(avp.d.cancel, new XDialogInterface.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.i.2
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog, int i) {
                ba.b(i.this.e.findFocus());
            }
        }).setCanceledOnTouchOutside(false).setCloseVisibility(false).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.i.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                i.this.b.onDestroy(null);
                if (i.this.d != null) {
                    i.this.d.onClick(null);
                }
            }
        });
        this.e = new h(this.a, this.c.getContentView());
        this.c.setCustomView((View) this.e, false);
        this.c.getDialog().getWindow().setType(2008);
    }

    public void a(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public void c() {
        if (this.c.isShowing()) {
            LogUtils.i("ShareCommunityDialog", "is Dialog showing");
            return;
        }
        int c = aei.a().c();
        if (this.b != null) {
            LogUtils.i("ShareCommunityDialog", "View Attaching");
            this.b.a((ShareCommunityDialogPresenter) this);
        }
        u.c(new agg.h(c));
        this.c.show();
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void a() {
        LogUtils.i("ShareCommunityDialog", "onCloseDialog");
        if (this.c.getDialog().isShowing()) {
            ba.b(this.c.getDialog().getCurrentFocus() == null ? this.e.getEditText() : this.c.getDialog().getCurrentFocus());
            this.c.dismiss();
        }
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void a(Drawable drawable) {
        this.e.setImageWithDrawable(drawable);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void b_(String str, String str2) {
        this.e.a(str, str2);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void b(String str, String str2) {
        this.e.b(str, str2);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void a(String str) {
        this.e.setContent(str);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void b() {
        ak.a(this.a, avp.d.share_succeed);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void b(String str) {
        if (str != null) {
            ak.a(this.a, str);
        } else {
            ak.a(this.a, avp.d.share_fail);
        }
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void c(String str) {
        this.e.setDefaultContent(str);
    }
}
