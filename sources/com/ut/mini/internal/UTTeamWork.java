package com.ut.mini.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.a;
import com.ut.device.UTDevice;
import com.ut.mini.base.UTMIVariables;
import java.util.Map;
/* loaded from: classes.dex */
public class UTTeamWork {
    private static UTTeamWork a;

    public void disableNetworkStatusChecker() {
    }

    public void dispatchLocalHits() {
    }

    public void initialized() {
    }

    public static synchronized UTTeamWork getInstance() {
        UTTeamWork uTTeamWork;
        synchronized (UTTeamWork.class) {
            if (a == null) {
                a = new UTTeamWork();
            }
            uTTeamWork = a;
        }
        return uTTeamWork;
    }

    public void turnOnRealTimeDebug(Map<String, String> map) {
        a.a(map);
    }

    public void turnOffRealTimeDebug() {
        a.a();
    }

    public void saveCacheDataToLocal() {
        un.a().b();
    }

    public void setToAliyunOsPlatform() {
        UTMIVariables.getInstance().setToAliyunOSPlatform();
    }

    public String getUtsid() {
        try {
            String a2 = uc.d() != null ? uc.d().a() : null;
            String utdid = UTDevice.getUtdid(ui.a().d());
            long longValue = Long.valueOf(uc.f).longValue();
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(utdid)) {
                return utdid + "_" + a2 + "_" + longValue;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void closeAuto1010Track() {
        uk.a().b();
    }

    public void enableUpload(boolean z) {
        uc.j = z;
    }

    public void setHost4Https(Context context, String str) {
        if (context == null) {
            Log.w("UTTeamWork", "context is null");
        } else if (TextUtils.isEmpty(str)) {
            Log.w("UTTeamWork", "host or port is empty");
        } else {
            ud.a(str);
            vd.a(context, "utanalytics_https_host", str);
        }
    }

    public void clearHost4Https(Context context) {
        if (context == null) {
            Log.w("UTTeamWork", "context is null");
            return;
        }
        ud.a("");
        vd.a(context, "utanalytics_https_host", null);
    }
}
