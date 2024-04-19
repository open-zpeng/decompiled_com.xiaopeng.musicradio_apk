package defpackage;

import com.xiaopeng.lib.framework.netchannelmodule.common.GlobalConfig;
import java.util.HashMap;
/* compiled from: HistoryStat_DataLog.java */
/* renamed from: ajc  reason: default package */
/* loaded from: classes2.dex */
public final class ajc {
    public static void a() {
        abl.a("MineStat", "", "music_mine_history", "P00032", "B001", new HashMap(), new HashMap(), 0, "");
    }

    public static void b() {
        abl.a("MineStat", "", "music_mine_history_music", "P00032", "B002", new HashMap(), new HashMap(), 0, "");
    }

    public static void c() {
        abl.a("MineStat", "", "music_mine_history_album", "P00032", "B003", new HashMap(), new HashMap(), 0, "");
    }

    public static void d() {
        abl.a("MineStat", "", "music_mine_history_program", "P00032", "B004", new HashMap(), new HashMap(), 0, "");
    }

    public static void e() {
        abl.a("MineStat", "", "music_mine_history_netradio", "P00032", "B005", new HashMap(), new HashMap(), 0, "");
    }

    public static void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        abl.a("MineStat", "", "music_mine_history_music_play", "P00032", GlobalConfig.MOLE_OSS_SUCCEED_BUTTON_ID, hashMap, new HashMap(), 0, "");
    }
}
