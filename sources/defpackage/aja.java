package defpackage;

import com.xiaopeng.lib.framework.netchannelmodule.common.GlobalConfig;
import java.util.HashMap;
/* compiled from: CollectStat_DataLog.java */
/* renamed from: aja  reason: default package */
/* loaded from: classes2.dex */
public final class aja {
    public static void a() {
        abl.a("MineStat", "", "music_mine_collect", "P00031", "B001", new HashMap(), new HashMap(), 0, "");
    }

    public static void b() {
        abl.a("MineStat", "", "music_mine_collect_music", "P00031", "B002", new HashMap(), new HashMap(), 0, "");
    }

    public static void c() {
        abl.a("MineStat", "", "music_mine_collect_album", "P00031", "B003", new HashMap(), new HashMap(), 0, "");
    }

    public static void d() {
        abl.a("MineStat", "", "music_mine_collect_program", "P00031", "B004", new HashMap(), new HashMap(), 0, "");
    }

    public static void e() {
        abl.a("MineStat", "", "music_mine_collect_netradio", "P00031", "B005", new HashMap(), new HashMap(), 0, "");
    }

    public static void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        abl.a("MineStat", "", "music_mine_collect_music_play", "P00031", GlobalConfig.MOLE_OSS_SUCCEED_BUTTON_ID, hashMap, new HashMap(), 0, "");
    }
}
