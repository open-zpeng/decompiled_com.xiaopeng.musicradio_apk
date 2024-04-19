package defpackage;

import android.util.Log;
import com.xiaopeng.lib.apirouter.server.IServicePublisher;
/* compiled from: ApiRouterOverallService.java */
/* renamed from: bfg  reason: default package */
/* loaded from: classes2.dex */
public class bfg implements IServicePublisher {
    public void a(String str, String str2) {
        Log.d("ApiRouterOverallService", "消息接收 event== " + str + ",data:" + str2);
        bff.d(str, str2);
    }

    public void a(String str, String str2, String str3) {
        Log.d("ApiRouterOverallService", "消息接收 event== " + str + ",data:" + str2);
        bff.a(str, str2, str3);
    }
}
