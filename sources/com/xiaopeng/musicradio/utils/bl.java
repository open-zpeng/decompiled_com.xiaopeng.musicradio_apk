package com.xiaopeng.musicradio.utils;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Window;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.app.XDialog;
/* compiled from: XDialogReference.java */
/* loaded from: classes2.dex */
public class bl {
    private XDialog a;

    public void a(XDialog xDialog) {
        xDialog.setVuiEngine(VuiEngine.getInstance(com.xiaopeng.musicradio.a.a()));
        Dialog dialog = xDialog.getDialog();
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xiaopeng.musicradio.utils.bl.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (bl.this.a != null) {
                    bl.this.a.setPositiveButtonEnable(true);
                    bl.this.a.setNegativeButtonEnable(true);
                }
                bl.this.a = null;
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setType(2038);
        }
        this.a = xDialog;
        xDialog.show();
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
