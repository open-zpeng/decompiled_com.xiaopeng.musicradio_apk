package defpackage;

import com.xiaopeng.lib.framework.netchannelmodule.common.GlobalConfig;
import java.util.HashMap;
/* compiled from: BannerStat_DataLog.java */
/* renamed from: bdj  reason: default package */
/* loaded from: classes2.dex */
public final class bdj {
    public static void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        abl.a("BannerStat", "", "mine_banner_click", "P10359", "B003", hashMap, new HashMap(), 1, "");
    }

    public static void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        abl.a("BannerStat", "", "music_banner_click", "P10356", "B016", hashMap, new HashMap(), 1, "");
    }

    public static void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        abl.a("BannerStat", "", "read_banner_click", "P10385", "B005", hashMap, new HashMap(), 1, "");
    }

    public static void d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        abl.a("BannerStat", "", "radio_banner_click", "P10384", "B003", hashMap, new HashMap(), 1, "");
    }

    public static void a(long j, long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put("start_time", Long.valueOf(j));
        hashMap.put("end_time", Long.valueOf(j2));
        abl.a("BannerStat", "", "mine_banner_stay", "P10359", "B004", hashMap, new HashMap(), 1, "");
    }

    public static void b(long j, long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put("start_time", Long.valueOf(j));
        hashMap.put("end_time", Long.valueOf(j2));
        abl.a("BannerStat", "", "music_banner_stay", "P10356", "B017", hashMap, new HashMap(), 1, "");
    }

    public static void c(long j, long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put("start_time", Long.valueOf(j));
        hashMap.put("end_time", Long.valueOf(j2));
        abl.a("BannerStat", "", "read_banner_stay", "P10385", GlobalConfig.MOLE_OSS_SUCCEED_BUTTON_ID, hashMap, new HashMap(), 1, "");
    }

    public static void d(long j, long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put("start_time", Long.valueOf(j));
        hashMap.put("end_time", Long.valueOf(j2));
        abl.a("BannerStat", "", "radio_banner_stay", "P10384", "B004", hashMap, new HashMap(), 1, "");
    }
}
