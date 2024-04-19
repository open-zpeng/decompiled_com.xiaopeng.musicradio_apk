package com.xiaopeng.musicradio.utils;

import android.text.TextUtils;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IDataLog;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IStatEvent;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import defpackage.age;
import defpackage.agg;
import java.util.HashMap;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: MediaStatUtil.java */
/* loaded from: classes2.dex */
public class ah {
    private static int a;
    private static c b;
    private static c c;
    private static a d;

    /* compiled from: MediaStatUtil.java */
    /* loaded from: classes2.dex */
    private static class b {
        static final ah a = new ah();
    }

    public static ah a() {
        return b.a;
    }

    private ah() {
        u.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaStatUtil.java */
    /* loaded from: classes2.dex */
    public static class c {
        int a;
        long b;
        long c;
        long d;
        String e;
        long f;
        long g;
        String h;
        String i;
        String j;
        int k;

        c(int i) {
            this.a = i;
        }
    }

    public static void a(final int i) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ah.1
            @Override // java.lang.Runnable
            public void run() {
                int unused = ah.a = i;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(IStatEvent iStatEvent) {
        if (iStatEvent != null) {
            iStatEvent.put("openid", aqh.a().b());
        }
    }

    public static void a(MusicInfo musicInfo) {
        if (musicInfo == null) {
            return;
        }
        af.a();
        c cVar = b;
        if (cVar == null) {
            b = new c(musicInfo.getMusicFrom() == 61 ? 1 : 0);
            b.b = System.currentTimeMillis();
            b.e = musicInfo.getHash();
            b.f = musicInfo.getAlbumId();
            b.g = musicInfo.getDuration();
            b.i = musicInfo.getSong();
            b.j = musicInfo.getSinger();
            b.k = musicInfo.getMusicFrom();
        } else {
            cVar.d = System.currentTimeMillis();
            c cVar2 = b;
            cVar2.c = cVar2.d - b.b;
            b.h = bcj.a().h();
            a(b);
            b = null;
            a(musicInfo);
        }
        f(musicInfo);
    }

    public static void b(MusicInfo musicInfo) {
        af.a();
        if (musicInfo == null || b == null || !TextUtils.equals(musicInfo.getHash(), b.e)) {
            return;
        }
        b.d = System.currentTimeMillis();
        c cVar = b;
        cVar.c = cVar.d - b.b;
        b.h = bcj.a().h();
        a(b);
        b = null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioTypeChangeEvent(agg.g gVar) {
        if (gVar.a() == 2) {
            if (com.xiaopeng.musicradio.model.bluetooth.a.i().getPlayState() == 2) {
                b();
            }
        } else if (gVar.b() == 2) {
            c();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioEvent(age.l lVar) {
        if (lVar.b() == 2) {
            if (lVar.a() == 2) {
                b();
            } else if (lVar.a() == 3) {
                c();
            }
        }
    }

    public static void b() {
        c cVar = c;
        if (cVar == null) {
            c = new c(2);
            c.b = System.currentTimeMillis();
            c cVar2 = c;
            cVar2.e = "0";
            cVar2.f = 0L;
            return;
        }
        cVar.d = System.currentTimeMillis();
        c cVar3 = c;
        cVar3.c = cVar3.d - c.b;
        a(c);
        c = null;
        b();
    }

    public static void c() {
        c cVar = c;
        if (cVar != null) {
            cVar.d = System.currentTimeMillis();
            c cVar2 = c;
            cVar2.c = cVar2.d - c.b;
            a(c);
            c = null;
        }
    }

    public static void c(MusicInfo musicInfo) {
        b(musicInfo);
    }

    private static void a(c cVar) {
        if (cVar.c < 2000) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("time_start", Long.valueOf(cVar.b));
        hashMap.put("time_end", Long.valueOf(cVar.d));
        hashMap.put("time_long", Long.valueOf(cVar.c));
        hashMap.put("voice_id", cVar.e);
        hashMap.put("album_id", Long.valueOf(cVar.f));
        hashMap.put("voice_type", Integer.valueOf(cVar.a));
        hashMap.put("time_duration", Long.valueOf(cVar.g));
        hashMap.put("page_id", "P0001");
        hashMap.put("button_id", "B0002");
        hashMap.put("music_source", w.g());
        if (!be.a((CharSequence) cVar.h)) {
            hashMap.put("play_from", cVar.h);
        }
        bcl.a().a(hashMap);
        ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ah.2
            @Override // java.lang.Runnable
            public void run() {
                String a2 = z.a(hashMap);
                IDataLog iDataLog = (IDataLog) h.c().get(IDataLog.class);
                IStatEvent build = iDataLog.buildStat().setProperty("para", a2).setEventName("music_voice_playtime").build();
                ah.b(build);
                iDataLog.sendStatData(build);
                LogUtils.i("MediaStatUtil", build.toJson());
            }
        });
        if (cVar.a == 0) {
            b(cVar);
        }
    }

    private static void f(MusicInfo musicInfo) {
        if (musicInfo != null && apk.i().getPosition() <= 1) {
            final HashMap hashMap = new HashMap();
            if (musicInfo.getPlayBy() != 0) {
                hashMap.put("play_type", Integer.valueOf(musicInfo.getPlayBy()));
            } else {
                hashMap.put("play_type", Integer.valueOf(a));
            }
            hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
            hashMap.put("voice_id", musicInfo.getHash());
            hashMap.put("album_id", Long.valueOf(musicInfo.getAlbumId()));
            if (musicInfo.getMusicFrom() == 61) {
                hashMap.put("voice_type", 1);
            } else {
                hashMap.put("voice_type", 0);
            }
            hashMap.put("page_id", "P0001");
            hashMap.put("button_id", "B0003");
            hashMap.put("music_source", w.g());
            bcl.a().a(hashMap);
            ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ah.3
                @Override // java.lang.Runnable
                public void run() {
                    String a2 = z.a(hashMap);
                    IDataLog iDataLog = (IDataLog) h.c().get(IDataLog.class);
                    IStatEvent build = iDataLog.buildStat().setProperty("para", a2).setEventName("music_voice_play").build();
                    ah.b(build);
                    iDataLog.sendStatData(build);
                    LogUtils.i("MediaStatUtil", build.toJson());
                }
            });
        }
    }

    private static void b(c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("playtime", Long.valueOf(cVar.c));
        hashMap.put("songtime", Long.valueOf(cVar.g * 1000));
        hashMap.put(VuiConstants.ELEMENT_TYPE, cVar.c < cVar.g * 1000 ? "incomplete" : "complete");
        hashMap.put("hash", cVar.e);
        hashMap.put("song", cVar.i);
        hashMap.put("singer", cVar.j);
        hashMap.put("source", Integer.valueOf(cVar.k));
        bci.f(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaStatUtil.java */
    /* loaded from: classes2.dex */
    public static class a {
        long a;
        String b;
        String c;
        int d;
        int e;
        String f;

        private a() {
        }
    }

    public static void d(MusicInfo musicInfo) {
        if (musicInfo == null) {
            return;
        }
        if (d == null) {
            if (musicInfo.getMusicFrom() == 61) {
                return;
            }
            d = new a();
            d.a = System.currentTimeMillis();
            d.b = musicInfo.getSongId();
            d.c = musicInfo.getHash();
            d.d = musicInfo.getQuality();
            d.e = musicInfo.getFrom();
            d.f = musicInfo.getPath();
            return;
        }
        d();
        d = null;
        if (musicInfo.getMusicFrom() != 61) {
            d(musicInfo);
        }
    }

    public static void e(MusicInfo musicInfo) {
        if (musicInfo == null || d == null || !TextUtils.equals(musicInfo.getSongId(), d.b)) {
            return;
        }
        d();
        d = null;
    }

    private static void d() {
        int i;
        a aVar = d;
        if (aVar == null) {
            return;
        }
        int i2 = 2;
        if (aVar.d == 1) {
            i2 = 0;
        } else if (d.d == 2) {
            i = 1;
            aqz.a().a(d.b, d.c, (int) ((System.currentTimeMillis() - d.a) / 1000), i, d.e, d.f);
        }
        i = i2;
        aqz.a().a(d.b, d.c, (int) ((System.currentTimeMillis() - d.a) / 1000), i, d.e, d.f);
    }
}
