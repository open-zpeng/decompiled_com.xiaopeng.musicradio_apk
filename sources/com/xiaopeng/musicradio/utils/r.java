package com.xiaopeng.musicradio.utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import defpackage.agg;
/* compiled from: DialogUtil.java */
/* loaded from: classes2.dex */
public class r {
    private static XDialog a;

    public static XDialog.Parameters a() {
        return XDialog.Parameters.Builder().setFullScreen(true).setTheme(f.i.XDialogFullScreen);
    }

    public static void b() {
        XDialog xDialog = a;
        if (xDialog == null || !xDialog.isShowing()) {
            return;
        }
        a.dismiss();
    }

    public static void a(String str, String str2, apz apzVar) {
        if (aqf.a().e()) {
            if (apzVar != null) {
                apzVar.a(false);
            }
        } else if (w.i()) {
            Log.d("MusicCommonProxy", "showXPLoginDialogWithCheck: " + str2);
            u.f(new agg.an(str2));
        } else {
            b(str, str2, apzVar);
        }
    }

    public static void b(String str, String str2, final apz apzVar) {
        axu.b();
        Context c = a.a().c();
        if (c == null) {
            c = com.xiaopeng.musicradio.a.a;
        }
        XDialog xDialog = a;
        if (xDialog != null && xDialog.isShowing()) {
            a.dismiss();
        }
        a = new XDialog(c, 0, a());
        a.setVuiSceneId("ProgramLoginDialog");
        a.setSystemDialog(2008);
        a.setTitle(str).setMessage(str2).setPositiveButton(c.getString(f.h.program_login_ok), new XDialogInterface.OnClickListener() { // from class: com.xiaopeng.musicradio.utils.r.2
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog2, int i) {
                r.a.setPositiveButtonEnable(false);
                aqf.a().a(apz.this);
            }
        }).setNegativeButton(c.getString(f.h.program_login_cancle), new XDialogInterface.OnClickListener() { // from class: com.xiaopeng.musicradio.utils.r.1
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog2, int i) {
                xDialog2.setNegativeButtonEnable(false);
            }
        });
        a.initVuiScene("ProgramLoginDialog", VuiEngine.getInstance(c));
        q.a(c, a);
    }

    public static void c() {
        ban.j(new Runnable() { // from class: com.xiaopeng.musicradio.utils.r.3
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.setAction("action_exit_dialog");
                jd.a(com.xiaopeng.musicradio.a.a()).a(intent);
            }
        });
    }
}
