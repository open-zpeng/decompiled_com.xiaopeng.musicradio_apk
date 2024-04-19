package com.xiaopeng.musicradio.utils;

import android.text.TextUtils;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IDataLog;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IStatEvent;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import java.util.HashMap;
/* compiled from: NetRadioMediaStatUtil.java */
/* loaded from: classes2.dex */
public class ao {
    private static int a;
    private static b b;

    /* compiled from: NetRadioMediaStatUtil.java */
    /* loaded from: classes2.dex */
    private static class a {
        static final ao a = new ao();
    }

    public static ao a() {
        return a.a;
    }

    private ao() {
        u.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NetRadioMediaStatUtil.java */
    /* loaded from: classes2.dex */
    public static class b {
        int a;
        long b;
        long c;
        long d;
        String e;
        String f;
        long g;
        String h;
        String i;

        b(int i) {
            this.a = i;
        }
    }

    private static void a(IStatEvent iStatEvent) {
        if (iStatEvent != null) {
            iStatEvent.put("openid", aqh.a().c());
        }
    }

    public static void a(NetRadioProgramInfo netRadioProgramInfo) {
        if (netRadioProgramInfo == null || netRadioProgramInfo.getParentInfo() == null) {
            return;
        }
        af.a();
        b bVar = b;
        if (bVar == null) {
            b = new b(6);
            b.b = System.currentTimeMillis();
            b.e = String.valueOf(netRadioProgramInfo.getId());
            b.f = netRadioProgramInfo.getParentInfo().getName();
            b.h = netRadioProgramInfo.getName();
            b.i = netRadioProgramInfo.getParentInfo().getName();
        } else {
            bVar.d = System.currentTimeMillis();
            b bVar2 = b;
            bVar2.c = bVar2.d - b.b;
            a(b);
            b = null;
            a(netRadioProgramInfo);
        }
        d(netRadioProgramInfo);
    }

    public static void b(NetRadioProgramInfo netRadioProgramInfo) {
        af.a();
        if (netRadioProgramInfo == null || b == null || !TextUtils.equals(String.valueOf(netRadioProgramInfo.getId()), b.e)) {
            return;
        }
        b.d = System.currentTimeMillis();
        b bVar = b;
        bVar.c = bVar.d - b.b;
        a(b);
        b = null;
    }

    private static void a(b bVar) {
        if (bVar.c < 2000) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("time_start", Long.valueOf(bVar.b));
        hashMap.put("time_end", Long.valueOf(bVar.d));
        hashMap.put("time_long", Long.valueOf(bVar.c));
        hashMap.put("voice_id", bVar.e);
        hashMap.put("album_id", bVar.f);
        hashMap.put("voice_type", Integer.valueOf(bVar.a));
        hashMap.put("time_duration", Long.valueOf(bVar.g));
        hashMap.put("page_id", "P0001");
        hashMap.put("button_id", "B0002");
        hashMap.put("music_source", w.g());
        bcl.a().a(hashMap);
        String a2 = z.a(hashMap);
        final IDataLog iDataLog = (IDataLog) h.c().get(IDataLog.class);
        final IStatEvent build = iDataLog.buildStat().setProperty("para", a2).setEventName("music_voice_playtime").build();
        a(build);
        ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ao.1
            @Override // java.lang.Runnable
            public void run() {
                IDataLog.this.sendStatData(build);
            }
        });
        LogUtils.i("NetRadioMediaStatUtil", build.toJson());
    }

    private static void d(NetRadioProgramInfo netRadioProgramInfo) {
        if (netRadioProgramInfo == null || netRadioProgramInfo.getParentInfo() == null || aps.i().getPosition() > 1) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("voice_id", netRadioProgramInfo.getName());
        hashMap.put("album_id", netRadioProgramInfo.getParentInfo().getName());
        hashMap.put("voice_type", 6);
        hashMap.put("page_id", "P0001");
        hashMap.put("button_id", "B0003");
        hashMap.put("music_source", w.g());
        bcl.a().a(hashMap);
        String a2 = z.a(hashMap);
        final IDataLog iDataLog = (IDataLog) h.c().get(IDataLog.class);
        final IStatEvent build = iDataLog.buildStat().setProperty("para", a2).setEventName("music_voice_play").build();
        a(build);
        ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ao.2
            @Override // java.lang.Runnable
            public void run() {
                IDataLog.this.sendStatData(build);
            }
        });
        LogUtils.i("NetRadioMediaStatUtil", build.toJson());
    }

    public static void c(NetRadioProgramInfo netRadioProgramInfo) {
        b(netRadioProgramInfo);
    }
}
