package defpackage;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.n;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCollect;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.aj;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.ap;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.speech.protocol.bean.recommend.RecommendBean;
import com.xiaopeng.speech.protocol.bean.stats.SkillStatisticsBean;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import defpackage.agq;
import defpackage.apx;
import defpackage.ark;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: MusicCollectManager.java */
/* renamed from: anc  reason: default package */
/* loaded from: classes2.dex */
public class anc implements aqb {
    private ConcurrentHashMap<String, Integer> a = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MusicCollectManager.java */
    /* renamed from: anc$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final anc a = new anc();
    }

    public static anc a() {
        return a.a;
    }

    public anc() {
        aqe.b().a(this);
        aqg.c().a("https://xmart.xiaopeng.com/media/v3/music/user/favourite/addSongs", new anp());
        aqg.c().a("https://xmart.xiaopeng.com/media/v3/music/user/favourite/deleteSongs", new anq());
        and.b();
        anb.a();
    }

    public String b() {
        return ((aqs) apx.a().b()).a();
    }

    @Override // defpackage.aqb
    public void c() {
        Log.i("MusicCollectManager", "clearUserData: ==========");
        and.b().e();
        anv.a().c();
        ant.a().c();
        anr.a().c();
        afi.d().e();
        aob.a().b();
        anx.a().c();
        anw.a().c();
        if (!ad.b(apk.i().x())) {
            apk.i().k();
            ay.e("music_user_song_id");
            ay.e("music_song_id");
            ay.e("music_user_play_mode");
        }
        anb.a().d();
    }

    @Override // defpackage.aqb
    public void d() {
        and.b().a(1, "downloadUserData");
        anb.a().a(0, true);
    }

    public void a(MusicAlbumCollect musicAlbumCollect) {
        a(musicAlbumCollect, (n<Boolean>) null);
    }

    public void a(final MusicAlbumCollect musicAlbumCollect, final n<Boolean> nVar) {
        LogUtils.i("MusicCollectManager", "musicAlbumCancelLove: " + musicAlbumCollect);
        apx.a().a(new apx.b() { // from class: anc.1
            @Override // defpackage.apx.b
            public boolean a(boolean z) {
                LogUtils.i("MusicCollectManager", "musicAlbumCancelLove onLogin: ");
                anc.this.d(musicAlbumCollect, nVar);
                return true;
            }

            @Override // defpackage.apx.b
            public void a() {
                LogUtils.i("MusicCollectManager", "musicAlbumCancelLove onLoginFail: ");
                u.c(new agq.f(musicAlbumCollect.getId(), false, true, "onLoginFail"));
                n nVar2 = nVar;
                if (nVar2 != null) {
                    nVar2.a((n) false);
                }
            }
        });
    }

    public void b(MusicAlbumCollect musicAlbumCollect) {
        b(musicAlbumCollect, (n<Boolean>) null);
    }

    public void b(final MusicAlbumCollect musicAlbumCollect, final n<Boolean> nVar) {
        LogUtils.i("MusicCollectManager", "musicAlbumLove: " + musicAlbumCollect);
        apx.a().a(new apx.b() { // from class: anc.2
            @Override // defpackage.apx.b
            public boolean a(boolean z) {
                LogUtils.i("MusicCollectManager", "musicAlbumLove onLogin: ");
                final String b = anc.this.b();
                final long currentTimeMillis = System.currentTimeMillis();
                ban.e(new Runnable() { // from class: anc.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ant.a().b() >= 1000) {
                            u.c(new agq.f(musicAlbumCollect.getId(), false));
                            ak.a(com.xiaopeng.musicradio.a.a, b.f.album_collect_count_max);
                            if (nVar != null) {
                                nVar.a((n) false);
                                return;
                            }
                            return;
                        }
                        musicAlbumCollect.setUid(b);
                        musicAlbumCollect.setCreateTime(currentTimeMillis);
                        musicAlbumCollect.setCacheTime(currentTimeMillis);
                        musicAlbumCollect.setAppend(true);
                        anc.this.c(musicAlbumCollect, nVar);
                    }
                });
                return true;
            }

            @Override // defpackage.apx.b
            public void a() {
                LogUtils.i("MusicCollectManager", "musicAlbumLove onLoginFail: ");
                u.c(new agq.f(musicAlbumCollect.getId(), true, true, "onLoginFail"));
                n nVar2 = nVar;
                if (nVar2 != null) {
                    nVar2.a((n) false);
                }
            }
        });
    }

    public void a(MusicInfo musicInfo) {
        if (anv.a().e(musicInfo)) {
            d(musicInfo);
        } else {
            c(musicInfo);
        }
    }

    public void b(MusicInfo musicInfo) {
        if (apb.a().c(musicInfo)) {
            d(musicInfo);
        } else {
            c(musicInfo);
        }
    }

    public void c(MusicAlbumCollect musicAlbumCollect, n<Boolean> nVar) {
        ant.a().a(musicAlbumCollect, nVar);
        afi.d().a(anh.a(musicAlbumCollect));
        aqg.c().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MusicAlbumCollect musicAlbumCollect, n<Boolean> nVar) {
        ant.a().b(musicAlbumCollect, nVar);
        afi.d().a(anh.b(musicAlbumCollect));
        aqg.c().a();
    }

    public void a(int i) {
        boolean d = apx.a().d();
        Log.i("MusicCollectManager", "retryFetchMusicLove: ==========" + d);
        if (d) {
            and.b().a(i, "retryFetchMusicLove");
        }
    }

    public void c(final MusicInfo musicInfo) {
        if (musicInfo == null) {
            return;
        }
        LogUtils.i("MusicCollectManager", "musicLove: " + musicInfo);
        apx.a().a(new apx.b() { // from class: anc.3
            @Override // defpackage.apx.b
            public void a() {
            }

            @Override // defpackage.apx.b
            public boolean a(boolean z) {
                final String b = aqh.a().b();
                ban.e(new Runnable() { // from class: anc.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int a2 = anc.this.a(b);
                        if (a2 < anv.a().f()) {
                            b();
                            anc.this.a(b, Math.min(a2 + 1, anv.a().f()));
                            return;
                        }
                        LogUtils.i("MusicCollectManager", "musicLove max count");
                        u.c(new ark.g(musicInfo));
                        ban.g(new Runnable() { // from class: anc.3.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                aj.a();
                            }
                        });
                    }
                });
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void b() {
                musicInfo.setHot(true);
                MusicInfo a2 = anv.a().a(musicInfo.getHash());
                if (a2 != null) {
                    a2.setHot(true);
                    if (a2.getMusicFrom() == 50) {
                        return;
                    }
                    if (musicInfo.getMusicFrom() == 10) {
                        if (musicInfo.getOldMusicFrom() == 0) {
                            a2.setOldMusicFrom(musicInfo.getMusicFrom());
                            a2.setOldMusicFromTitle(musicInfo.getMusicFromTitle());
                        } else {
                            a2.setOldMusicFrom(musicInfo.getOldMusicFrom());
                            a2.setOldMusicFromTitle(musicInfo.getOldMusicFromTitle());
                        }
                    } else {
                        a2.setOldMusicFrom(musicInfo.getMusicFrom());
                        a2.setOldMusicFromTitle(musicInfo.getMusicFromTitle());
                    }
                    a2.setOldCreateTime(musicInfo.getCreatime());
                    a2.setInfoType(2);
                    a2.setMusicFrom(50);
                    a2.setCreatime(System.currentTimeMillis());
                    a2.setMusicFromTitle(com.xiaopeng.musicradio.a.a.getString(f.h.player_music_love));
                    a2.setPlayTime(musicInfo.getCreatime());
                    a2.setParentInfo(null);
                    a2.setCanUp(true);
                    a2.setAppend(true);
                    anc.this.e(a2);
                    apb.a().b(a2, false);
                } else {
                    musicInfo.setCreatime(System.currentTimeMillis());
                    musicInfo.setInfoType(2);
                    musicInfo.setMusicFrom(50);
                    anc.this.e(musicInfo);
                    apb.a().b(musicInfo, false);
                }
                anc.this.a(true, musicInfo);
                u.c(new agq.l(musicInfo.getHash(), musicInfo.getAlbumId(), true, musicInfo));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, MusicInfo musicInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put(RecommendBean.SHOW_TIME_RESULT, z ? "add" : "cancel");
        hashMap.put(VuiConstants.ELEMENT_TYPE, SkillStatisticsBean.PAGE_MUSIC);
        hashMap.put("voiceid", musicInfo.getHash());
        hashMap.put("voice", musicInfo.getSong());
        hashMap.put("person", musicInfo.getSinger());
        bci.c(hashMap);
    }

    public void d(final MusicInfo musicInfo) {
        LogUtils.i("MusicCollectManager", "musicCancelLove: " + musicInfo);
        apx.a().a(new apx.b() { // from class: anc.4
            @Override // defpackage.apx.b
            public void a() {
            }

            @Override // defpackage.apx.b
            public boolean a(boolean z) {
                Log.i("MusicCollectManager", "onMusicAuth: ============= ");
                anc.this.a(musicInfo, true);
                return true;
            }
        });
    }

    public void a(final List<MusicInfo> list) {
        LogUtils.i("MusicCollectManager", "musicCancelLove: " + list.size());
        apx.a().a(new apx.b() { // from class: anc.5
            @Override // defpackage.apx.b
            public void a() {
            }

            @Override // defpackage.apx.b
            public boolean a(boolean z) {
                Log.i("MusicCollectManager", "onMusicAuth: ============= ");
                if (list.size() == 1) {
                    anc.this.a((MusicInfo) list.get(0), true);
                } else {
                    for (MusicInfo musicInfo : list) {
                        anc.this.a(musicInfo, false);
                    }
                    afi.d().a(anh.a(list));
                }
                return true;
            }
        });
    }

    public void a(MusicInfo musicInfo, boolean z) {
        final String b = aqh.a().b();
        MusicInfo a2 = anv.a().a(musicInfo.getHash());
        MusicInfo clone = a2 == null ? musicInfo.clone() : a2;
        try {
            clone.setMusicFrom(0);
            clone.setInfoType(1);
            clone.setHot(false);
            clone.setCanUp(false);
            clone.setAppend(true);
            e(clone);
            if (z) {
                afi.d().a(anh.b(musicInfo));
            }
            a(false, clone);
            ban.e(new Runnable() { // from class: anc.6
                @Override // java.lang.Runnable
                public void run() {
                    anc.this.a(b, Math.max(anc.this.a(b) - 1, 0));
                }
            });
        } catch (Exception e) {
            LogUtils.e("MusicCollectManager", e);
        }
        musicInfo.setHot(false);
        musicInfo.setMusicFrom(0);
        apb.a().b(clone, false);
        u.c(new agq.l(clone.getHash(), clone.getAlbumId(), false, clone));
    }

    public void e(MusicInfo musicInfo) {
        if (musicInfo == null || TextUtils.isEmpty(musicInfo.getHash())) {
            return;
        }
        MusicInfo clone = musicInfo.clone();
        if (clone.getInfoType() != 0) {
            LogUtils.d("MusicCollectManager", "try2SaveUser: upgrade user data hash = %s, from = %d", musicInfo.getHash(), Integer.valueOf(musicInfo.getMusicFrom()));
            anv.a().b(clone);
            if (clone.getInfoType() == 2) {
                Log.i("MusicCollectManager", "try2SaveUser: report ===== ");
                f(clone);
            }
        }
    }

    public void f(MusicInfo musicInfo) {
        LogUtils.i("MusicCollectManager", "reissueAddUserList: " + musicInfo);
        if (!musicInfo.isCanUp()) {
            LogUtils.i("MusicCollectManager", "reissueAddUserList: can not up");
            return;
        }
        if (musicInfo.getMusicFrom() == 50) {
            afi.d().a(anh.a(musicInfo));
        }
        aqg.c().a();
    }

    public void a(String str, int i) {
        String str2 = "love_music_total_" + str;
        afk.a().a(str2, String.valueOf(i));
        this.a.put(str2, Integer.valueOf(i));
        u.c(new agq.e(str, i));
    }

    public int a(String str) {
        String str2 = "love_music_total_" + str;
        Integer num = this.a.get(str2);
        if (num != null) {
            return num.intValue();
        }
        int a2 = ap.a(afk.a().a(str2), 1);
        this.a.put(str2, Integer.valueOf(a2));
        return a2;
    }

    public void b(String str, int i) {
        String str2 = "love_music_total_page_" + str;
        afk.a().a(str2, String.valueOf(i));
        this.a.put(str2, Integer.valueOf(i));
    }

    public int b(String str) {
        String str2 = "love_music_total_page_" + str;
        Integer num = this.a.get(str2);
        if (num != null) {
            return num.intValue();
        }
        int a2 = ap.a(afk.a().a(str2), 1);
        this.a.put(str2, Integer.valueOf(a2));
        return a2;
    }
}
