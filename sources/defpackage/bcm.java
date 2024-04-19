package defpackage;

import android.text.TextUtils;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IDataLog;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IStatEvent;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.utils.h;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.musicradio.utils.z;
import java.util.HashMap;
import java.util.Map;
/* compiled from: StatUtil.java */
/* renamed from: bcm  reason: default package */
/* loaded from: classes2.dex */
public class bcm {
    public static void a(String str, String str2, String str3) {
        a(str, str2, str3, null);
    }

    public static void a(final String str, final String str2, final String str3, final Map<String, Object> map) {
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        if (!str3.startsWith("music_")) {
            str3 = "music_" + str3;
        }
        ban.d(new Runnable() { // from class: bcm.1
            @Override // java.lang.Runnable
            public void run() {
                HashMap hashMap = new HashMap();
                hashMap.put("page_id", str);
                hashMap.put("button_id", str2);
                bcl.a().a(hashMap);
                Map map2 = map;
                if (map2 != null) {
                    map2.put("music_source", w.g());
                    for (Map.Entry entry : map.entrySet()) {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                String a = z.a(hashMap);
                IDataLog iDataLog = (IDataLog) h.c().get(IDataLog.class);
                IStatEvent build = iDataLog.buildStat().setProperty("para", a).setEventName(str3).build();
                bcm.b(build);
                iDataLog.sendStatData(build);
                LogUtils.i("StatUtil", build.toJson());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(IStatEvent iStatEvent) {
        if (iStatEvent != null) {
            iStatEvent.put("openid", aqi.a().b());
        }
    }
}
