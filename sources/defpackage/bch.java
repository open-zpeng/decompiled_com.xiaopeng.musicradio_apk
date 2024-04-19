package defpackage;

import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IDataLog;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IStatEvent;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.utils.h;
import com.xiaopeng.musicradio.utils.z;
import java.util.HashMap;
/* compiled from: AiSuggestStatUtil.java */
/* renamed from: bch  reason: default package */
/* loaded from: classes2.dex */
public class bch {
    public static void a(long j) {
        a("B0010", j);
    }

    public static void b(long j) {
        a("B0009", j);
    }

    public static void c(long j) {
        a("B0006", j);
    }

    public static void d(long j) {
        a("B0007", j);
    }

    public static void e(long j) {
        a("B0008", j);
    }

    private static void a(String str, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", "P0001");
        hashMap.put("button_id", str);
        hashMap.put("collectId", Long.valueOf(j));
        bcl.a().a(hashMap);
        String a = z.a(hashMap);
        final IDataLog iDataLog = (IDataLog) h.c().get(IDataLog.class);
        final IStatEvent build = iDataLog.buildStat().setProperty("para", a).setEventName("music_aisuggest").build();
        a(build);
        ban.d(new Runnable() { // from class: bch.1
            @Override // java.lang.Runnable
            public void run() {
                IDataLog.this.sendStatData(build);
            }
        });
        LogUtils.i("AiSuggestStatUtil", build.toJson());
    }

    private static void a(IStatEvent iStatEvent) {
        if (iStatEvent != null) {
            iStatEvent.put("openid", aqi.a().b());
        }
    }
}
