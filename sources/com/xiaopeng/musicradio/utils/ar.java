package com.xiaopeng.musicradio.utils;

import android.text.TextUtils;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IDataLog;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IStatEvent;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import defpackage.age;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: ProgramMediaStatUtil.java */
/* loaded from: classes2.dex */
public class ar {
    private static int a;
    private static b b;
    private static awm c = new awm();
    private static List<awj> d = new ArrayList();
    private static long e;
    private static long f;
    private static long g;
    private static long h;
    private static long i;
    private static boolean j;

    /* compiled from: ProgramMediaStatUtil.java */
    /* loaded from: classes2.dex */
    private static class a {
        static final ar a = new ar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProgramMediaStatUtil.java */
    /* loaded from: classes2.dex */
    public static class b {
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

        b(int i) {
            this.a = i;
        }
    }

    public static ar a() {
        return a.a;
    }

    private ar() {
        u.a(this);
    }

    public static void a(ProgramBean programBean) {
        c(programBean);
    }

    public static void b(ProgramBean programBean) {
        if (programBean == null) {
            return;
        }
        b bVar = b;
        if (bVar == null) {
            b = new b(TextUtils.equals(axn.i().s(), "headspeech") ? 7 : 3);
            b.b = System.currentTimeMillis();
            b bVar2 = b;
            bVar2.e = programBean.getTrackId() + "";
            b.f = programBean.getAlbumId();
            b.g = (long) programBean.getDuration();
        } else {
            bVar.d = System.currentTimeMillis();
            b bVar3 = b;
            bVar3.c = bVar3.d - b.b;
            b.h = bcj.a().i();
            a(b);
            b = null;
            b(programBean);
        }
        d(programBean);
    }

    public static void c(ProgramBean programBean) {
        if (programBean == null || b == null) {
            return;
        }
        if (TextUtils.equals(programBean.getTrackId() + "", b.e)) {
            b.d = System.currentTimeMillis();
            b bVar = b;
            bVar.c = bVar.d - b.b;
            b.h = bcj.a().i();
            a(b);
            b = null;
        }
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
        hashMap.put("album_id", Long.valueOf(bVar.f));
        hashMap.put("voice_type", Integer.valueOf(bVar.a));
        hashMap.put("time_duration", Long.valueOf(bVar.g));
        hashMap.put("page_id", "P0001");
        hashMap.put("button_id", "B0002");
        hashMap.put("music_source", w.g());
        if (!be.a((CharSequence) bVar.h)) {
            hashMap.put("play_from", bVar.h);
        }
        bcl.a().a(hashMap);
        String a2 = z.a(hashMap);
        final IDataLog iDataLog = (IDataLog) h.c().get(IDataLog.class);
        final IStatEvent build = iDataLog.buildStat().setProperty("para", a2).setEventName("music_voice_playtime").build();
        a(build);
        ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ar.1
            @Override // java.lang.Runnable
            public void run() {
                IDataLog.this.sendStatData(build);
            }
        });
        if (bVar.a == 0) {
            b(bVar);
        }
        LogUtils.i("ProgramMediaStatUtil", build.toJson());
    }

    private static void d(ProgramBean programBean) {
        if (programBean != null && axn.i().getPosition() <= 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("play_type", Integer.valueOf(a));
            hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
            hashMap.put("voice_id", Long.valueOf(programBean.getTrackId()));
            hashMap.put("album_id", Long.valueOf(programBean.getAlbumId()));
            if (TextUtils.equals(axn.i().s(), "headspeech")) {
                hashMap.put("voice_type", 7);
            } else {
                hashMap.put("voice_type", 3);
            }
            hashMap.put("page_id", "P0001");
            hashMap.put("button_id", "B0003");
            hashMap.put("music_source", w.g());
            bcl.a().a(hashMap);
            String a2 = z.a(hashMap);
            final IDataLog iDataLog = (IDataLog) h.c().get(IDataLog.class);
            final IStatEvent build = iDataLog.buildStat().setProperty("para", a2).setEventName("music_voice_play").build();
            a(build);
            ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ar.2
                @Override // java.lang.Runnable
                public void run() {
                    IDataLog.this.sendStatData(build);
                }
            });
            LogUtils.i("ProgramMediaStatUtil", build.toJson());
        }
    }

    private static void a(IStatEvent iStatEvent) {
        if (iStatEvent != null) {
            iStatEvent.put("openid", aqh.a().c());
        }
    }

    private static void b(b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("playtime", Long.valueOf(bVar.c));
        hashMap.put("songtime", Long.valueOf(bVar.g * 1000));
        hashMap.put(VuiConstants.ELEMENT_TYPE, bVar.c < bVar.g * 1000 ? "incomplete" : "complete");
        hashMap.put("hash", bVar.e);
        hashMap.put("song", bVar.i);
        hashMap.put("singer", bVar.j);
        hashMap.put("source", Integer.valueOf(bVar.k));
        bci.f(hashMap);
    }

    public static void a(RdAlbumBean rdAlbumBean) {
        if (rdAlbumBean == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("album_id", Long.valueOf(rdAlbumBean.getId()));
        hashMap.put("page_id", "P0001");
        hashMap.put("voice_type", 3);
        hashMap.put("button_id", "B0001");
        bcl.a().a(hashMap);
        String a2 = z.a(hashMap);
        final IDataLog iDataLog = (IDataLog) h.c().get(IDataLog.class);
        final IStatEvent build = iDataLog.buildStat().setProperty("para", a2).setEventName("music_album_view").build();
        a(build);
        ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ar.3
            @Override // java.lang.Runnable
            public void run() {
                IDataLog.this.sendStatData(build);
            }
        });
        LogUtils.i("ProgramMediaStatUtil", build.toJson());
    }

    public static void a(awj awjVar) {
        c.b().add(awjVar);
        LogUtils.d("ProgramMediaStatUtil", "addPlayTrackRecord:" + awjVar.a());
        if (c.b().size() >= 1) {
            b();
        }
    }

    public static void b() {
        HashMap hashMap = new HashMap();
        hashMap.put("liveRecords", z.a(c.a()));
        hashMap.put("trackRecords", z.a(c.b()));
        hashMap.put("radioRecords", z.a(c.c()));
        d.addAll(c.b());
        c.d();
        axp.a().a(hashMap, new avc<BaseBean>() { // from class: com.xiaopeng.musicradio.utils.ar.4
            @Override // defpackage.avc
            public void a(BaseBean baseBean) {
                ar.d.clear();
                LogUtils.d("ProgramMediaStatUtil", "upload record done");
            }

            @Override // defpackage.avc
            public void a(int i2, String str) {
                LogUtils.d("ProgramMediaStatUtil", "readd stat record:" + ar.d.size());
                ar.c.b().addAll(ar.d);
                ar.d.clear();
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        LogUtils.d("ProgramMediaStatUtil", "dealAudioInfo.. type: " + cVar.a());
        if (cVar.a() == 3) {
            ProgramBean r = axn.i().r();
            if (r != null && r.getTrackId() == e) {
                LogUtils.d("ProgramMediaStatUtil", "dealAudioInfo.. trackid: " + r.getTrackId() + " return");
                return;
            }
            e();
            if (r != null) {
                e = r.getTrackId();
                f = System.currentTimeMillis();
                j = axn.i().o();
                return;
            }
            return;
        }
        cVar.a();
    }

    private void e() {
        if (e != 0) {
            g = System.currentTimeMillis();
            i = axn.i().p();
            awj awjVar = new awj();
            awjVar.d(f);
            awjVar.e(g);
            awjVar.c(i);
            awjVar.b(Math.abs(g - f) / 1000);
            awjVar.a(e);
            awjVar.a(!j ? 1 : 0);
            a(awjVar);
            LogUtils.d("ProgramMediaStatUtil", "fillinPlayRecord trackId:" + e);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealPlayState(age.l lVar) {
        LogUtils.d("ProgramMediaStatUtil", "dealPlayState.. type: " + lVar.b());
        if (lVar.b() == 3) {
            if (lVar.a() == 3 || lVar.a() == 5) {
                h = axn.i().getPosition();
            }
        }
    }
}
