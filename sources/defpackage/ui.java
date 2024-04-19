package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.ut.mini.UTAnalytics;
import com.ut.mini.core.appstatus.UTMCAppStatusRegHelper;
import com.ut.mini.core.sign.IUTRequestAuthentication;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.xiaopeng.libconfig.ipc.IpcConfig;
import java.io.UnsupportedEncodingException;
/* compiled from: UTMCStatConfig.java */
/* renamed from: ui  reason: default package */
/* loaded from: classes3.dex */
public class ui {
    private static ui a = new ui();
    private Context b = null;
    private String c = null;
    private String d = null;
    private String e = null;
    private String f = null;
    private Application g = null;
    private String h = null;
    private IUTRequestAuthentication i = null;
    private boolean j = false;
    private boolean k = false;

    private ui() {
    }

    public static ui a() {
        return a;
    }

    public void a(String str) {
        this.h = str;
    }

    public String b() {
        return this.h;
    }

    public void c() {
        uw.a(true);
    }

    private void b(String str) {
        Context context;
        this.c = str;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
        }
        if (TextUtils.isEmpty(str) || (context = this.b) == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
            edit.putString("_lun", new String(uq.c(str.getBytes("UTF-8"), 2)));
            edit.commit();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private void c(String str) {
        Context context;
        this.e = str;
        if (!TextUtils.isEmpty(str)) {
            this.f = str;
        }
        if (TextUtils.isEmpty(str) || (context = this.b) == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
            edit.putString("_luid", new String(uq.c(str.getBytes("UTF-8"), 2)));
            edit.commit();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public void a(String str, String str2) {
        b(str);
        c(str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("UT", IpcConfig.BTPhoneConfig.IPC_MSG_DIAL_NUMBER, str, str2, null, null).build());
    }

    public void a(Context context) {
        if (context != null) {
            this.b = context;
            SharedPreferences sharedPreferences = this.b.getSharedPreferences("UTCommon", 0);
            String string = sharedPreferences.getString("_lun", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.d = new String(uq.a(string.getBytes(), 2), "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            String string2 = sharedPreferences.getString("_luid", "");
            if (!TextUtils.isEmpty(string2)) {
                try {
                    this.f = new String(uq.a(string2.getBytes(), 2), "UTF-8");
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
            }
        }
        f();
    }

    public Context d() {
        return this.b;
    }

    public void a(Application application) {
        this.g = application;
        f();
    }

    private void f() {
        if (this.j || Build.VERSION.SDK_INT < 14) {
            return;
        }
        try {
            if (a().e() != null) {
                UTMCAppStatusRegHelper.registeActivityLifecycleCallbacks(a().e());
                this.j = true;
            } else {
                UTMCAppStatusRegHelper.registeActivityLifecycleCallbacks((Application) a().d().getApplicationContext());
                this.j = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("UTEngine", "You need set a application instance for UT.");
        }
    }

    public Application e() {
        return this.g;
    }
}
