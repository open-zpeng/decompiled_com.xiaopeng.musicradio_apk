package com.xiaopeng.musicradio.utils;

import android.app.Dialog;
import android.content.Context;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.xui.app.XDialog;
/* compiled from: DialogReferenceUtils.java */
/* loaded from: classes2.dex */
public class q {
    public static boolean a(Context context) {
        if (context == null || !(context instanceof com.xiaopeng.musicradio.commonui.base.a)) {
            return false;
        }
        return ((com.xiaopeng.musicradio.commonui.base.a) context).l();
    }

    public static void a(Context context, Dialog dialog) {
        if (context != null && (context instanceof com.xiaopeng.musicradio.commonui.base.a)) {
            ((com.xiaopeng.musicradio.commonui.base.a) context).k().a(dialog);
            return;
        }
        LogUtils.e("DialogReferenceUtils", "context需要BaseActivity", new RuntimeException());
        dialog.show();
    }

    public static void a(Context context, XDialog xDialog) {
        if (context != null && (context instanceof com.xiaopeng.musicradio.commonui.base.a)) {
            ((com.xiaopeng.musicradio.commonui.base.a) context).j().a(xDialog);
            return;
        }
        LogUtils.e("DialogReferenceUtils", "context需要BaseActivity", new RuntimeException());
        xDialog.show();
    }
}
