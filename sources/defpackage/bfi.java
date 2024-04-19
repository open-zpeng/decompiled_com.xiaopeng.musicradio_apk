package defpackage;

import android.util.Log;
import com.xiaopeng.lib.apirouter.server.IServicePublisher;
/* compiled from: ApiRouterUnitySceneService.java */
/* renamed from: bfi  reason: default package */
/* loaded from: classes2.dex */
public class bfi implements IServicePublisher {
    public void a(String str, String str2) {
        Log.i("ApiRouterUnityService", "消息接收 event== " + str + ",data:" + str2);
        bfe.a(str, str2);
    }

    public String b(String str, String str2) {
        return bfe.b(str, str2);
    }

    public void c(String str, String str2) {
        Log.i("ApiRouterUnityService", "消息接收 event== " + str + ",data:" + str2);
        bfe.c(str, str2);
    }
}
