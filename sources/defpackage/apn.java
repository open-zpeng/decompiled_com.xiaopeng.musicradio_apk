package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.utils.af;
import com.xiaopeng.musicradio.utils.al;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.speech.protocol.bean.stats.SkillStatisticsBean;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import defpackage.age;
import defpackage.agg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: UserDataProvider.java */
/* renamed from: apn  reason: default package */
/* loaded from: classes2.dex */
public class apn extends ape {
    private volatile Boolean f = false;
    private Object g = new Object();
    private AtomicBoolean h = new AtomicBoolean(false);

    @Override // defpackage.ape
    public void n() {
    }

    @Override // defpackage.ape
    public int p() {
        return 1;
    }

    @Override // defpackage.ape
    public void q() {
    }

    public apn() {
        b(ay.b("music_user_play_mode", 2));
    }

    @Override // defpackage.ape
    protected List<MusicInfo> a() {
        return new apm();
    }

    public void s() {
        this.f = false;
        this.h.set(false);
        this.a.clear();
        this.d = -1;
        this.b.clear();
        a("");
        this.c = 2;
        u.c(new age.c(0));
        u.c(new age.d(0, this.e, 1));
    }

    public void a(List<MusicInfo> list, String str) {
        LogUtils.i("UserDataProvider", "play: " + str + " " + list);
        a(str);
        this.a.clear();
        this.a.addAll(list);
        b(this.a);
        b();
        this.d = 0;
        u.c(new age.d(0, this.e, 1));
        u.c(new age.c(0));
    }

    public void a(List<MusicInfo> list, MusicInfo musicInfo, String str) {
        LogUtils.i("UserDataProvider", "play: " + str + " " + musicInfo + " " + list);
        a(str);
        this.a.clear();
        this.a.addAll(list);
        b(this.a);
        b();
        this.d = a(musicInfo);
        u.c(new age.d(0, this.e, 1));
        u.c(new age.c(0));
    }

    public void t() {
        LogUtils.i("UserDataProvider", "initList: ");
        ban.a(new Runnable() { // from class: apn.1
            @Override // java.lang.Runnable
            public void run() {
                if (apn.this.h.getAndSet(true)) {
                    return;
                }
                String c = ay.c("music_user_song_id", "");
                final List a = apn.this.a(aob.a().a(131400));
                Log.i("UserDataProvider", "run: " + c + " size = " + a.size());
                ban.g(new Runnable() { // from class: apn.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Log.i("UserDataProvider", "init insert list size = " + a.size());
                        if (a.size() > 0) {
                            MusicInfo f = apn.this.f();
                            apn.this.a.addAll(a);
                            apn.this.b(apn.this.a);
                            apn.this.b();
                            apn.this.d = apn.this.a(f);
                            u.c(new age.c(0));
                        }
                        u.c(new age.d(0, apn.this.e, 1));
                        synchronized (apn.this.g) {
                            apn.this.f = true;
                            try {
                                apn.this.g.notifyAll();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<MusicInfo> a(List<MusicInfo> list) {
        String[] a;
        ArrayList arrayList = new ArrayList();
        for (String str : apm.a()) {
            Iterator<MusicInfo> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MusicInfo next = it.next();
                if (next != null && be.a(str, next.getHash())) {
                    arrayList.add(next);
                    break;
                }
            }
        }
        for (MusicInfo musicInfo : list) {
            if (!arrayList.contains(musicInfo)) {
                arrayList.add(musicInfo);
            }
        }
        return arrayList;
    }

    public List<MusicInfo> e(int i) {
        if (i == -1) {
            return new ArrayList(this.a);
        }
        return anv.a().a(i, true);
    }

    @Override // defpackage.ape
    public void c(MusicInfo musicInfo) {
        LogUtils.i("UserDataProvider", "play: " + musicInfo);
        int a = a(musicInfo);
        if (a == -1) {
            f(musicInfo);
            this.d = a(musicInfo);
        } else {
            this.d = a;
        }
        u.c(new age.c(0));
    }

    public void f(MusicInfo musicInfo) {
        if (this.d == -1) {
            a(musicInfo, 0);
        } else {
            a(musicInfo, this.b.get(this.d).intValue() + 1);
        }
    }

    public void a(MusicInfo musicInfo, int i) {
        LogUtils.i("UserDataProvider", "insertInfo: " + i);
        MusicInfo f = f();
        b(musicInfo, i);
        b();
        this.d = a(f);
        g(musicInfo);
    }

    private void b(MusicInfo musicInfo, int i) {
        if (this.a.contains(musicInfo)) {
            return;
        }
        this.a.add(i, musicInfo);
        i(musicInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<MusicInfo> list) {
        aob.a().c(131400);
        aob.a().b(list, 131400);
    }

    private void i(MusicInfo musicInfo) {
        aob.a().a(musicInfo, 131400);
    }

    public void g(MusicInfo musicInfo) {
        u.f(new age.d(0, this.e, 1, musicInfo));
    }

    @Override // defpackage.ape
    public void l() {
        LogUtils.i("UserDataProvider", "next: ");
        this.d = c();
        u.c(new age.c(0));
    }

    @Override // defpackage.ape
    public void m() {
        LogUtils.i("UserDataProvider", "prev: ");
        this.d = d();
        u.c(new age.c(0));
    }

    @Override // defpackage.ape
    public void d(MusicInfo musicInfo) {
        LogUtils.i("UserDataProvider", "prepare: " + musicInfo);
        if (musicInfo.isDir()) {
            return;
        }
        musicInfo.setPlayTime(System.currentTimeMillis());
        musicInfo.setPlayCount(musicInfo.getPlayCount() + 1);
        i(musicInfo);
    }

    @Override // defpackage.ape
    public void c(int i) {
        ay.a("music_user_play_mode", i);
    }

    public void h(MusicInfo musicInfo) {
        if (musicInfo == null) {
            return;
        }
        ay.a("music_user_song_id", musicInfo.getHash());
        MusicInfo u = u();
        if (u != null) {
            Log.i("UserDataProvider", "saveInfo: " + musicInfo.getHash());
            ay.a("music_user_next_song_id", u.getHash());
        }
    }

    private MusicInfo u() {
        af.a();
        MusicInfo musicInfo = null;
        if (this.a.size() == 0) {
            return null;
        }
        int i = this.d == -1 ? 0 : this.d;
        int i2 = i;
        while (true) {
            if (i2 >= this.b.size()) {
                break;
            }
            MusicInfo musicInfo2 = this.a.get(this.b.get(i2).intValue());
            if (musicInfo2.getInfoType() == 2) {
                musicInfo = musicInfo2;
                break;
            }
            i2++;
        }
        if (musicInfo == null) {
            for (int i3 = 0; i3 < i; i3++) {
                MusicInfo musicInfo3 = this.a.get(this.b.get(i3).intValue());
                if (musicInfo3.getInfoType() == 2) {
                    return musicInfo3;
                }
            }
            return musicInfo;
        }
        return musicInfo;
    }

    public void a(String str) {
        this.e = str;
        ay.a("music_user_play_list_sign", str);
    }

    @Override // defpackage.ape
    public void a(final boolean z) {
        LogUtils.i("UserDataProvider", "rebootPlay: ");
        t();
        ban.a(new Runnable() { // from class: apn.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (apn.this.g) {
                    while (!apn.this.f.booleanValue()) {
                        try {
                            LogUtils.d("UserDataProvider", "rebootPlay: wait");
                            apn.this.g.wait(300L);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                ban.g(new Runnable() { // from class: apn.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        apn.this.e = ay.a("music_user_play_list_sign");
                        String a = ay.a("music_user_song_id");
                        int b = ay.b("music_play_state");
                        Log.i("UserDataProvider", "run: " + a + " playState = " + b);
                        boolean z2 = z || b == 2 || ags.a().i();
                        if (apn.this.a == null || apn.this.a.size() <= 0) {
                            return;
                        }
                        MusicInfo musicInfo = null;
                        Iterator<MusicInfo> it = apn.this.a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            MusicInfo next = it.next();
                            if (TextUtils.equals(next.getHash(), a)) {
                                musicInfo = next;
                                break;
                            }
                        }
                        if (musicInfo == null) {
                            String a2 = ay.a("music_user_next_song_id");
                            Iterator<MusicInfo> it2 = apn.this.a.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                MusicInfo next2 = it2.next();
                                if (TextUtils.equals(next2.getHash(), a2)) {
                                    musicInfo = next2;
                                    break;
                                }
                            }
                        }
                        if (musicInfo == null) {
                            musicInfo = apn.this.a.get(0);
                        }
                        apk.i().a(musicInfo, z2);
                        if (z2) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(VuiConstants.ELEMENT_TYPE, SkillStatisticsBean.PAGE_MUSIC);
                            hashMap.put("source", "continue");
                            bci.d(hashMap);
                        }
                        u.c(new agg.v());
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
        LogUtils.i("UserDataProvider", "dealPlayState: " + i);
        MusicInfo f = f();
        if (f != null) {
            h(f);
        }
        if (i == 2 && al.a(f)) {
            b(f);
        }
        if (i == 2) {
            aos.a().a(f());
        }
        if (i == 1) {
            k();
        }
    }

    @Override // defpackage.ape
    protected void e(MusicInfo musicInfo) {
        apk.i().a(musicInfo);
    }

    @Override // defpackage.ape
    public void b(boolean z) {
        s();
    }
}
