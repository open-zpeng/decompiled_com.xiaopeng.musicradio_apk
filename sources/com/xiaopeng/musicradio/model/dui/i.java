package com.xiaopeng.musicradio.model.dui;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.utils.am;
import defpackage.apx;
/* compiled from: DuiUtils.java */
/* loaded from: classes.dex */
public class i {
    public static boolean a(final Runnable runnable, String str) {
        if (apx.a().d()) {
            return true;
        }
        try {
            if (!aqi.a().g() && !com.xiaopeng.musicradio.utils.b.a(com.xiaopeng.musicradio.a.a)) {
                am.a();
            }
            if (runnable == null) {
                apx.a().b(null);
                return false;
            }
            apx.a().b(new apx.b() { // from class: com.xiaopeng.musicradio.model.dui.i.1
                @Override // defpackage.apx.b
                public void a() {
                }

                @Override // defpackage.apx.b
                public boolean a(boolean z) {
                    runnable.run();
                    return false;
                }
            });
            return false;
        } catch (Throwable th) {
            LogUtils.e("DuiUtils", str, th);
            return false;
        }
    }
}
