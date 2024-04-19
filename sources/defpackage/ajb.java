package defpackage;

import com.xiaopeng.lib.framework.netchannelmodule.common.GlobalConfig;
import java.util.HashMap;
/* compiled from: CustomStat_DataLog.java */
/* renamed from: ajb  reason: default package */
/* loaded from: classes2.dex */
public final class ajb {
    public static void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        abl.a("MineStat", "", "music_mine_custom_music_play", "P00038", GlobalConfig.MOLE_OSS_SUCCEED_BUTTON_ID, hashMap, new HashMap(), 0, "");
    }

    public static void a() {
        abl.a("MineStat", "", "music_mine_custom_album_import", "P00038", "B010", new HashMap(), new HashMap(), 0, "");
    }
}
