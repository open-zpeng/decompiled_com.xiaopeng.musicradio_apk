package com.xiaopeng.musicradio.utils;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Window;
/* compiled from: DialogReference.java */
/* loaded from: classes2.dex */
public class p {
    private Dialog a;

    public void a(Dialog dialog) {
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xiaopeng.musicradio.utils.p.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                p.this.a = null;
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setType(2038);
        }
        this.a = dialog;
        dialog.show();
    }

    public boolean a() {
        return this.a != null;
    }

    public void b() {
        try {
            if (this.a != null) {
                this.a.dismiss();
                this.a = null;
            }
        } catch (Exception unused) {
        }
    }
}
