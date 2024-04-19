package com.xiaopeng.musicradio.model.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.utils.ay;
/* loaded from: classes.dex */
public class LocationReceiver extends BroadcastReceiver {
    private static final String a = "LocationReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : "";
        String str = a;
        LogUtils.i(str, "receiver--》" + action);
        if ("com.xiaopeng.broadcast.LOCATION_PROVINCE".equals(action)) {
            Bundle extras = intent.getExtras();
            String string = extras.getString("province", "广东省");
            String string2 = extras.getString("city", "广东");
            String str2 = a;
            LogUtils.i(str2, "province=" + string + " city=" + string2);
            String string3 = extras.getString("citycode", "");
            String string4 = extras.getString("adcode", "");
            String str3 = a;
            LogUtils.i(str3, "adCode=" + string4 + " cityCode=" + string3);
            if (!TextUtils.isEmpty(string)) {
                a("province", string);
            }
            if (!TextUtils.isEmpty(string4)) {
                a("adcode", string4);
            }
            if (!TextUtils.isEmpty(string3)) {
                a("citycode", string3);
            }
            a("city", string2);
        }
    }

    private void a(String str, String str2) {
        ay.a(str, str2);
    }
}
