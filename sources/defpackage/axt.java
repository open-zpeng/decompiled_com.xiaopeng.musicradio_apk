package defpackage;

import com.xiaopeng.lib.framework.netchannelmodule.common.GlobalConfig;
import java.util.HashMap;
/* compiled from: ProgramStat_DataLog.java */
/* renamed from: axt  reason: default package */
/* loaded from: classes2.dex */
public final class axt {
    public static void a() {
        abl.a("ProgramStat", "", "program_today_news", "P00040", "B001", new HashMap(), new HashMap(), 0, "");
    }

    public static void b() {
        abl.a("ProgramStat", "", "program_history", "P00040", "B002", new HashMap(), new HashMap(), 0, "");
    }

    public static void c() {
        abl.a("ProgramStat", "", "program_enter_guesslike_list", "P00040", "B003", new HashMap(), new HashMap(), 0, "");
    }

    public static void d() {
        abl.a("ProgramStat", "", "program_switch_guesslike", "P00040", "B004", new HashMap(), new HashMap(), 0, "");
    }

    public static void e() {
        abl.a("ProgramStat", "", "program_play_guesslike", "P00040", "B005", new HashMap(), new HashMap(), 0, "");
    }

    public static void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        abl.a("ProgramStat", "", "program_enter_hotrank", "P00040", GlobalConfig.MOLE_OSS_SUCCEED_BUTTON_ID, hashMap, new HashMap(), 0, "");
    }

    public static void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        abl.a("ProgramStat", "", "program_play_hotrank", "P00040", GlobalConfig.MOLE_OSS_FAILED_BUTTON_ID, hashMap, new HashMap(), 0, "");
    }

    public static void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        abl.a("ProgramStat", "", "program_enter_category", "P00040", "B008", hashMap, new HashMap(), 0, "");
    }

    public static void d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        abl.a("ProgramStat", "", "program_play_category", "P00040", "B009", hashMap, new HashMap(), 0, "");
    }
}
