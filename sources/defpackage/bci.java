package defpackage;

import android.util.SparseArray;
import com.xiaopeng.speech.protocol.bean.stats.SkillStatisticsBean;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ReportClickStatUtil.java */
/* renamed from: bci  reason: default package */
/* loaded from: classes2.dex */
public class bci {
    private static final SparseArray<String> a = new SparseArray<>();

    public static void a() {
        bcm.a("P0016", "B0039", "music_play_power_on");
    }

    public static void b() {
        bcm.a("P0016", "B0040", "music_play_power_off");
    }

    public static void a(Map<String, Object> map) {
        bcm.a("P0017", "B0043", "music_audio_file_flow", map);
    }

    public static void b(Map<String, Object> map) {
        bcm.a("P00001", "B002", "speech_search", map);
    }

    public static void c(Map<String, Object> map) {
        bcm.a("P00002", "B001", "music_love", map);
    }

    public static void d(Map<String, Object> map) {
        String str = (String) map.get(VuiConstants.ELEMENT_TYPE);
        bcm.a("P00003", "B001", "music_play", map);
    }

    public static void c() {
        HashMap hashMap = new HashMap();
        hashMap.put(VuiConstants.ELEMENT_TYPE, SkillStatisticsBean.PAGE_MUSIC);
        hashMap.put("source", "click");
        d(hashMap);
    }

    static {
        a.put(0, SkillStatisticsBean.PAGE_MUSIC);
        a.put(4, "fm");
        a.put(3, "reading");
        a.put(7, "news");
    }

    public static void e(Map<String, Object> map) {
        bcm.a("P00004", "B002", "top_bar_click", map);
    }

    public static void f(Map<String, Object> map) {
        bcm.a("P00006", "B001", "music_end", map);
    }

    public static void g(Map<String, Object> map) {
        bcm.a("P00015", "B001", "reading_play_end", map);
    }

    public static void h(Map<String, Object> map) {
        bcm.a("P00017", "B001", "reading_category_click", map);
    }

    public static void i(Map<String, Object> map) {
        bcm.a("P00018", "B001", "reading_detail", map);
    }

    public static void d() {
        bcm.a("P00019", "B001", "reading_recent_click");
    }

    public static void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(VuiConstants.ELEMENT_TYPE, str);
        bcm.a("P00029", "B001", "music_song_quality_type", hashMap);
    }

    public static void e() {
        bcm.a("P00028", "B004", "music_auth_fail");
    }
}
