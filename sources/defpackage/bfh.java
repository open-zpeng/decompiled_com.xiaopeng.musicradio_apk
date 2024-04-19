package defpackage;

import android.util.Log;
import com.xiaopeng.lib.apirouter.server.IServicePublisher;
/* compiled from: ApiRouterSceneService.java */
/* renamed from: bfh  reason: default package */
/* loaded from: classes2.dex */
public class bfh implements IServicePublisher {
    public void a(String str, String str2) {
        Log.i("ApiRouterSceneService", "消息接收 event== " + str + ",data:" + str2);
        bff.a(str, str2);
    }

    public String b(String str, String str2) {
        return bff.b(str, str2);
    }
}
