package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import java.util.HashMap;
import java.util.Map;
/* compiled from: SpeechSearchStatUtil.java */
/* renamed from: bck  reason: default package */
/* loaded from: classes2.dex */
public class bck {
    private static a a;
    private static boolean b;
    private static b c;
    private static long d;
    private static boolean e;
    private static long f;
    private static long g;
    private static long h;

    /* compiled from: SpeechSearchStatUtil.java */
    /* renamed from: bck$a */
    /* loaded from: classes2.dex */
    public static class a {
        String a;
        String b;
        String c;
        long d;
        String e;
        String f;
    }

    /* compiled from: SpeechSearchStatUtil.java */
    /* renamed from: bck$b */
    /* loaded from: classes2.dex */
    public static class b {
        String a;
        String b;
        String c;
        long d;
        long e;
        String f;
    }

    /* compiled from: SpeechSearchStatUtil.java */
    /* renamed from: bck$c */
    /* loaded from: classes2.dex */
    public interface c {
        boolean a();
    }

    public static void a(String str, long j, String str2, String str3, String str4) {
        a = new a();
        a aVar = a;
        aVar.d = j;
        aVar.e = str;
        aVar.a = str2;
        aVar.b = str3;
        aVar.c = str4;
    }

    public static void a(String str, String str2, String str3, String str4) {
        a = new a();
        a aVar = a;
        aVar.f = str;
        aVar.a = str2;
        aVar.b = str3;
        aVar.c = str4;
    }

    public static void a(long j, long j2, String str, String str2, String str3, String str4) {
        Log.i("SpeechSearchStatUtil", "setReportProgramInfo query = " + str2);
        c = new b();
        b bVar = c;
        bVar.e = j2;
        bVar.d = j;
        bVar.f = str;
        bVar.a = str2;
        bVar.b = str3;
        bVar.c = str4;
    }

    private static void a(Map<String, Object> map) {
        b = true;
        a = null;
        g = System.currentTimeMillis();
        long j = d + 1;
        d = j;
        map.put("id", Long.valueOf(j));
        map.put("source", w.g());
        map.put("forground", Boolean.valueOf(com.xiaopeng.musicradio.utils.b.a(com.xiaopeng.musicradio.a.a)));
        bcm.a("P10240", "B001", "speech_music_play", map);
    }

    public static void a(MusicInfo musicInfo, String str, c cVar) {
        a aVar = a;
        if (aVar == null || musicInfo == null) {
            return;
        }
        if (((aVar.e == null || TextUtils.equals(musicInfo.getHash(), a.e)) && musicInfo.getAlbumId() == a.d) || (str != null && TextUtils.equals(a.f, str))) {
            HashMap hashMap = new HashMap();
            hashMap.put("query", a.a);
            hashMap.put("intent", a.b);
            hashMap.put("slot", a.c);
            hashMap.put("name", musicInfo.getSong());
            hashMap.put("albumName", musicInfo.getAlbumName());
            hashMap.put("artist", musicInfo.getSinger());
            if (cVar != null) {
                hashMap.put("collect", Boolean.valueOf(cVar.a()));
            }
            a(hashMap);
        }
        a = null;
    }

    public static void a(MusicInfo musicInfo, c cVar) {
        b(musicInfo, "change", cVar);
    }

    public static void b(MusicInfo musicInfo, c cVar) {
        b(musicInfo, "pause", cVar);
    }

    private static void b(MusicInfo musicInfo, String str, c cVar) {
        if (musicInfo == null || System.currentTimeMillis() - g > 15000 || !b) {
            return;
        }
        b = false;
        g = 0L;
        HashMap hashMap = new HashMap();
        hashMap.put("name", musicInfo.getSong());
        hashMap.put("albumName", musicInfo.getAlbumName());
        hashMap.put("artist", musicInfo.getSinger());
        if (cVar != null) {
            hashMap.put("collect", Boolean.valueOf(cVar.a()));
        }
        hashMap.put(VuiConstants.ELEMENT_TYPE, str);
        hashMap.put("source", w.g());
        hashMap.put("forground", Boolean.valueOf(com.xiaopeng.musicradio.utils.b.a(com.xiaopeng.musicradio.a.a)));
        hashMap.put("lastId", Long.valueOf(d));
        bcm.a("P10241", "B001", "speech_music_change", hashMap);
    }

    public static void a(ProgramBean programBean, String str, long j, c cVar) {
        if (c == null || programBean == null) {
            return;
        }
        if (programBean.getAlbumId() == c.d || programBean.getChannelId() == c.e || (str != null && TextUtils.equals(str, c.f))) {
            HashMap hashMap = new HashMap();
            hashMap.put("query", c.a);
            hashMap.put("intent", c.b);
            hashMap.put("slot", c.c);
            hashMap.put("name", programBean.getCategoryName());
            hashMap.put("albumName", programBean.getAlbumName());
            hashMap.put("artist", programBean.getArtistName());
            hashMap.put("position", Long.valueOf(j));
            hashMap.put("chapter", Integer.valueOf(programBean.getOrderNum()));
            long j2 = f + 1;
            f = j2;
            hashMap.put("id", Long.valueOf(j2));
            if (cVar != null) {
                hashMap.put("collect", Boolean.valueOf(cVar.a()));
            }
            hashMap.put("forground", Boolean.valueOf(com.xiaopeng.musicradio.utils.b.a(com.xiaopeng.musicradio.a.a)));
            bcm.a("P10242", "B001", "speech_program_play", hashMap);
        }
        e = true;
        h = System.currentTimeMillis();
        c = null;
    }

    public static void a(ProgramBean programBean, c cVar) {
        a(programBean, "change", cVar);
    }

    public static void b(ProgramBean programBean, c cVar) {
        a(programBean, "pause", cVar);
    }

    private static void a(ProgramBean programBean, String str, c cVar) {
        if (System.currentTimeMillis() - h > 15000 || !e) {
            return;
        }
        h = 0L;
        e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("name", programBean.getCategoryName());
        hashMap.put("albumName", programBean.getAlbumName());
        hashMap.put("artist", programBean.getArtistName());
        if (cVar != null) {
            hashMap.put("collect", Boolean.valueOf(cVar.a()));
        }
        hashMap.put("chapter", Integer.valueOf(programBean.getOrderNum()));
        hashMap.put("lastId", Long.valueOf(f));
        hashMap.put(VuiConstants.ELEMENT_TYPE, str);
        hashMap.put("source", w.g());
        hashMap.put("forground", Boolean.valueOf(com.xiaopeng.musicradio.utils.b.a(com.xiaopeng.musicradio.a.a)));
        bcm.a("P10243", "B001", "speech_program_change", hashMap);
    }
}
