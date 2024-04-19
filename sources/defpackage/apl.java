package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.gson.reflect.TypeToken;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.XpCacheInfo;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ab;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.af;
import com.xiaopeng.musicradio.utils.ah;
import com.xiaopeng.musicradio.utils.al;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.speech.protocol.bean.stats.SkillStatisticsBean;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import defpackage.age;
import defpackage.agg;
import defpackage.agu;
import defpackage.ahq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: NormalDataProvider.java */
/* renamed from: apl  reason: default package */
/* loaded from: classes2.dex */
public class apl extends ape implements apj {
    ahp<MusicInfo> f;
    ahq.a<MusicInfo> g = new ahq.a<MusicInfo>() { // from class: apl.1
        @Override // defpackage.ahq.a
        public void b(int i, String str) {
        }

        @Override // defpackage.ahq.a
        public void b(List<MusicInfo> list) {
        }

        @Override // defpackage.ahq.a
        public void a(List<MusicInfo> list) {
            Log.i("NormalDataProvider", "onList: ");
            bcj.a().f();
            if (aei.a().c() != 0) {
                Log.i("NormalDataProvider", "onList: is not music type");
                return;
            }
            if (!apl.this.f.w() && apl.this.f.x()) {
                bci.a();
            }
            if (apl.this.f.g() != 1 && !apl.this.e().isEmpty()) {
                apl.this.a(list);
                return;
            }
            ah.a(0);
            apl aplVar = apl.this;
            aplVar.a(list, aplVar.o());
            apl.this.f.f();
            apk.i().a(!ags.a().c());
            if (ags.a().c()) {
                ags.a().a(true);
            }
        }

        @Override // defpackage.ahq.a
        public void a(int i, String str) {
            apl aplVar = apl.this;
            aplVar.b(aplVar.o());
            if (apl.this.f.m() || apl.this.e().isEmpty()) {
                apk.i().d(-1);
                apl.this.t();
                u.c(new age.g(0));
                u.f(new agg.ab(a.a.getString(agu.b.server_error_tip)));
            }
        }
    };
    private int h;

    @Override // defpackage.ape
    public void d(MusicInfo musicInfo) {
    }

    @Override // defpackage.ape
    public void n() {
    }

    @Override // defpackage.ape
    public int p() {
        return 2;
    }

    @Override // defpackage.ape
    public void q() {
    }

    public apl() {
        b(ay.b("music_user_play_mode", 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        LogUtils.i("NormalDataProvider", "cancelMediaSource: ");
        ahp<MusicInfo> ahpVar = this.f;
        if (ahpVar != null) {
            ahpVar.a();
            if (this.f.g() == -1) {
                this.f = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<MusicInfo> list) {
        LogUtils.i("NormalDataProvider", "insertNextPage: ");
        if (!list.isEmpty()) {
            List<MusicInfo> a = ab.a(list);
            af.a();
            for (MusicInfo musicInfo : a) {
                if (this.a.contains(musicInfo)) {
                    Log.i("NormalDataProvider", "insertNextPage: same music = " + musicInfo);
                } else {
                    this.a.add(musicInfo);
                }
            }
            if (this.c == 4) {
                b(a);
            } else {
                b();
            }
            s();
        }
        u.c(new age.d(0, o(), 2, true));
    }

    private void b(List<MusicInfo> list) {
        LogUtils.i("NormalDataProvider", "updateIndexLisRandom: ");
        af.a();
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int size = this.b.size(); size < list.size(); size++) {
            arrayList.add(Integer.valueOf(size));
        }
        Collections.shuffle(arrayList);
        this.b.addAll(arrayList);
        u.c(new age.b(0));
    }

    public void a(ahp<MusicInfo> ahpVar) {
        ahp<MusicInfo> ahpVar2;
        LogUtils.i("NormalDataProvider", "play: ");
        t();
        this.f = ahpVar;
        this.f.a(this.g);
        if (this.f.c()) {
            b(true);
            if (!ahpVar.w() && ahpVar.x()) {
                bci.a();
                HashMap hashMap = new HashMap();
                hashMap.put(VuiConstants.ELEMENT_TYPE, SkillStatisticsBean.PAGE_MUSIC);
                hashMap.put("source", "continue");
                bci.d(hashMap);
            }
            ahpVar.d(false);
            bcj.a().f();
            ah.a(0);
            List<MusicInfo> d = this.f.d();
            a(d, this.f.b());
            this.f.f();
            apk.i().a(d.get(this.f.e()), "", !ahpVar.w());
            this.f.l();
        } else {
            a(this.f.b());
            this.f.k();
        }
        int g = g();
        if (g == -1 || g != i().size() - 1 || (ahpVar2 = this.f) == null) {
            return;
        }
        ahpVar2.s();
    }

    protected void a(List<MusicInfo> list, String str) {
        Log.i("NormalDataProvider", "updateList: ");
        MusicInfo f = f();
        this.d = -1;
        this.a.clear();
        this.a.addAll(list);
        this.e = str;
        b();
        u.c(new age.d(0, str, 2));
        u.c(new age.e(0, str));
        s();
        b(str);
        if (f != null) {
            this.d = a(f);
        }
    }

    void s() {
        LogUtils.i("NormalDataProvider", "savePlayList: ");
        final ArrayList arrayList = new ArrayList(e());
        this.h = arrayList.size();
        ban.a(new Runnable() { // from class: apl.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Log.i("NormalDataProvider", "savePlayList run: " + arrayList.size() + " currentSize = " + apl.this.h);
                    if (apl.this.h == arrayList.size()) {
                        String a = afk.a().a(XpCacheInfo.KEY_MUSIC_PLAY_LIST_COUNT);
                        int i = 0;
                        if (!TextUtils.isEmpty(a)) {
                            int parseInt = Integer.parseInt(a);
                            Log.i("NormalDataProvider", "savePlayList run: ========== lastCount = " + parseInt);
                            for (int i2 = 0; i2 < parseInt; i2++) {
                                if (i2 == 0) {
                                    afk.a().b(XpCacheInfo.KEY_MUSIC_PLAY_LIST);
                                } else {
                                    afk a2 = afk.a();
                                    a2.b(XpCacheInfo.KEY_MUSIC_PLAY_LIST + i2);
                                }
                            }
                        }
                        String a3 = z.a(arrayList);
                        int length = a3.getBytes().length;
                        int max = (Math.max(0, length - 1) / 524288) + 1;
                        Log.i("NormalDataProvider", "savePlayList run: byteCount = " + length + " count = " + max);
                        if (max > 1) {
                            afk.a().a(XpCacheInfo.KEY_MUSIC_PLAY_LIST_COUNT, String.valueOf(max));
                            int size = arrayList.size() / max;
                            while (i < max) {
                                int i3 = i + 1;
                                String a4 = z.a(arrayList.subList(size * i, Math.min(arrayList.size(), size * i3)));
                                if (i == 0) {
                                    afk.a().a(XpCacheInfo.KEY_MUSIC_PLAY_LIST, a4);
                                } else {
                                    afk a5 = afk.a();
                                    a5.a(XpCacheInfo.KEY_MUSIC_PLAY_LIST + i, a4);
                                }
                                i = i3;
                            }
                            return;
                        }
                        afk.a().a(XpCacheInfo.KEY_MUSIC_PLAY_LIST, a3);
                        afk.a().a(XpCacheInfo.KEY_MUSIC_PLAY_LIST_COUNT, "1");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    void a(String str) {
        LogUtils.i("NormalDataProvider", "bufferList: " + str);
        af.a();
        b(false);
        this.e = str;
        u.c(new age.c(0));
    }

    @Override // defpackage.ape
    public void b(boolean z) {
        LogUtils.i("NormalDataProvider", "resetPlayList: ");
        Log.e("NormalDataProvider", "resetPlayList: ", new Throwable("asd"));
        af.a();
        ah.b(f());
        this.a.clear();
        this.d = -1;
        this.e = "";
        b();
        s();
        if (z) {
            u.c(new age.c(0));
        }
    }

    @Override // defpackage.ape
    public void r() {
        super.r();
        b(true);
        this.c = 2;
    }

    @Override // defpackage.apj
    public ahp<MusicInfo> o_() {
        return this.f;
    }

    @Override // defpackage.ape
    public void c(MusicInfo musicInfo) {
        ahp<MusicInfo> ahpVar;
        LogUtils.i("NormalDataProvider", "play: " + musicInfo);
        int a = a(musicInfo);
        if (a != -1) {
            this.d = a;
            if (a == i().size() - 1 && (ahpVar = this.f) != null && !ahpVar.z()) {
                this.f.y();
                this.f.s();
            }
        } else {
            this.d = Math.max(0, this.d);
            this.a.add((this.d == -1 || this.b.size() <= this.d) ? 0 : this.b.get(this.d).intValue() + 1, musicInfo);
            b();
            s();
            this.d = a(musicInfo);
            u.c(new age.d(0, this.e, 2));
        }
        u.c(new age.c(0));
    }

    @Override // defpackage.ape
    public void l() {
        ahp<MusicInfo> ahpVar;
        LogUtils.i("NormalDataProvider", "next: ");
        if (g() != -1 && g() == i().size() - 2 && (ahpVar = this.f) != null && !ahpVar.z()) {
            this.f.y();
            this.f.s();
        }
        this.d = c();
        u.c(new age.c(0));
    }

    @Override // defpackage.ape
    public void m() {
        LogUtils.i("NormalDataProvider", "prev: ");
        this.d = d();
        u.c(new age.c(0));
    }

    @Override // defpackage.ape
    public void c(int i) {
        ay.a("music_user_play_mode", i);
    }

    public void f(MusicInfo musicInfo) {
        if (musicInfo != null) {
            ay.a("music_song_id", musicInfo.getHash());
        }
    }

    public void b(String str) {
        ay.a("music_play_list_sign", str);
    }

    @Override // defpackage.ape
    public void a(final boolean z) {
        LogUtils.i("NormalDataProvider", "rebootPlay: ");
        ban.a(new Runnable() { // from class: apl.3
            @Override // java.lang.Runnable
            public void run() {
                int i;
                String a;
                final ArrayList arrayList = new ArrayList();
                String a2 = afk.a().a(XpCacheInfo.KEY_MUSIC_PLAY_LIST_COUNT);
                Log.i("NormalDataProvider", "rebootPlay run: countVal = " + a2);
                if (!TextUtils.isEmpty(a2)) {
                    int parseInt = Integer.parseInt(a2);
                    ArrayList<String> arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < parseInt; i2++) {
                        if (i2 == 0) {
                            a = afk.a().a(XpCacheInfo.KEY_MUSIC_PLAY_LIST);
                        } else {
                            a = afk.a().a(XpCacheInfo.KEY_MUSIC_PLAY_LIST + i2);
                        }
                        if (!TextUtils.isEmpty(a)) {
                            arrayList2.add(a);
                        }
                    }
                    for (String str : arrayList2) {
                        List list = (List) z.a(str, new TypeToken<List<MusicInfo>>() { // from class: apl.3.1
                        }.getType());
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                    }
                    Log.i("NormalDataProvider", "run: reboot listsize = " + arrayList.size());
                } else {
                    List list2 = (List) z.a(afk.a().a(XpCacheInfo.KEY_MUSIC_PLAY_LIST), new TypeToken<List<MusicInfo>>() { // from class: apl.3.2
                    }.getType());
                    if (list2 != null) {
                        arrayList.addAll(list2);
                    }
                }
                String a3 = ay.a("music_play_list_sign");
                String a4 = ay.a("music_song_id");
                int b = ay.b("music_play_state");
                boolean z2 = z || b == 2 || ags.a().i();
                Log.i("NormalDataProvider", "run: songId = " + a4 + " playState = " + b + " listSign = " + a3 + " shouldPlay = " + z);
                final amq amqVar = null;
                if (arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        MusicInfo musicInfo = (MusicInfo) it.next();
                        if (TextUtils.equals(musicInfo.getHash(), a4)) {
                            i = arrayList.indexOf(musicInfo);
                            break;
                        }
                    }
                    amq amqVar2 = new amq(a3, 1, 50, arrayList, i) { // from class: apl.3.3
                        @Override // defpackage.ahp
                        public boolean n() {
                            return true;
                        }
                    };
                    amqVar2.c(!z2);
                    amqVar2.d(true);
                    Log.i("NormalDataProvider", "run: rebootIndex = " + i);
                    if (i > -1 && ad.b(a3)) {
                        ((bas) c.a().b(bas.class)).addRebootPlayTask();
                    }
                    amqVar = amqVar2;
                }
                u.c(new agg.v());
                ban.g(new Runnable() { // from class: apl.3.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (arrayList == null || amqVar == null) {
                            return;
                        }
                        bcj.a().b();
                        Log.i("NormalDataProvider", "run: =======play ======= ");
                        apk.i().a(amqVar);
                    }
                });
            }
        });
    }

    @Override // defpackage.ape
    public String o() {
        return this.e;
    }

    @Override // defpackage.ape
    public void d(int i) {
        LogUtils.i("NormalDataProvider", "dealPlayState: " + i);
        MusicInfo f = f();
        if (f != null) {
            f(f);
        }
        if (2 == i && al.a(f)) {
            b(f);
        }
        if (i == 2) {
            aos.a().a(f);
        }
        if (i == 1) {
            k();
        }
    }

    @Override // defpackage.ape
    protected void e(MusicInfo musicInfo) {
        apk.i().a(musicInfo, "");
    }
}
