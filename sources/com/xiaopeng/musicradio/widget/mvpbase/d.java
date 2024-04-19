package com.xiaopeng.musicradio.widget.mvpbase;

import android.content.DialogInterface;
/* compiled from: WrapDialogDismissListener.java */
/* loaded from: classes2.dex */
public final class d implements DialogInterface.OnDismissListener {
    private DialogInterface.OnDismissListener a;

    public static d a(DialogInterface.OnDismissListener onDismissListener) {
        return new d(onDismissListener);
    }

    public d(DialogInterface.OnDismissListener onDismissListener) {
        this.a = onDismissListener;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = this.a;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
            this.a = null;
        }
    }
}
