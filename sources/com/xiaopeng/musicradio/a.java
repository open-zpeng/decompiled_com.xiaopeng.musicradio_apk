package com.xiaopeng.musicradio;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.xui.theme.XThemeManager;
import defpackage.afx;
/* compiled from: App.java */
/* loaded from: classes.dex */
public class a extends Application {
    public static Application a;
    public static boolean b;
    private int c;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        je.a(context);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        a = this;
        this.c = acs.b(a);
    }

    public static Application a() {
        return a;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.i("App", "onConfigurationChanged1: ============");
        if (XThemeManager.isThemeChanged(configuration)) {
            int b2 = acs.b(a);
            Log.i("App", "onConfigurationChanged: mThemeModel = " + this.c + " mode = " + b2);
            if (this.c != b2 || b2 == 0) {
                u.c(new afx.b());
            }
            this.c = b2;
        }
    }
}
