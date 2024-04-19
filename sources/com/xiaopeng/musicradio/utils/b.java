package com.xiaopeng.musicradio.utils;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.util.List;
/* compiled from: ActivityUtil.java */
/* loaded from: classes2.dex */
public class b {
    public static void a(String str, Context context) {
        PackageInfo packageInfo;
        ResolveInfo next;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(packageInfo.packageName);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (!queryIntentActivities.iterator().hasNext() || (next = queryIntentActivities.iterator().next()) == null) {
            return;
        }
        String str2 = next.activityInfo.packageName;
        String str3 = next.activityInfo.name;
        Intent intent2 = new Intent("android.intent.action.MAIN");
        intent2.addFlags(C.ENCODING_PCM_MU_LAW);
        intent2.addFlags(8388608);
        intent2.addCategory("android.intent.category.LAUNCHER");
        intent2.setComponent(new ComponentName(str2, str3));
        context.startActivity(intent2);
    }

    public static boolean a(Context context) {
        try {
            return context.getPackageName().equals(((ActivityManager) context.getSystemService("activity")).getRunningTasks(1).get(0).topActivity.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
