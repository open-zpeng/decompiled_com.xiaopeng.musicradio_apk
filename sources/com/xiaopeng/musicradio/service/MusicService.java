package com.xiaopeng.musicradio.service;

import android.text.TextUtils;
import android.util.Log;
import com.google.gson.reflect.TypeToken;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.blue.BtMusicBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.model.bluetooth.l;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.zone.detail.view.d;
import com.xiaopeng.musicradio.music.concentration.zone.detail.view.e;
import com.xiaopeng.musicradio.utils.ab;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.bg;
import com.xiaopeng.musicradio.utils.z;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class MusicService extends a implements arf {
    private static final String TAG = "MusicService";

    @Override // com.xiaopeng.musicradio.service.a
    protected void a() {
    }

    public void playUsbMusic() {
    }

    @Override // defpackage.arf
    public boolean isInCall() {
        return com.xiaopeng.musicradio.model.bluetooth.a.i().q();
    }

    @Override // defpackage.arf
    public boolean isInCall(boolean z) {
        return com.xiaopeng.musicradio.model.bluetooth.a.i().b(z);
    }

    @Override // defpackage.arf
    public boolean isBtConnect() {
        return com.xiaopeng.musicradio.model.bluetooth.a.i().n();
    }

    public void mute() {
        com.xiaopeng.musicradio.model.bluetooth.a.i().l();
    }

    public void unmute() {
        com.xiaopeng.musicradio.model.bluetooth.a.i().m();
    }

    public void initUserData() {
        apk.i().j();
    }

    @Override // defpackage.arf
    public arh getPlayingInfo() {
        MusicInfo d = apk.i().d();
        if (d != null) {
            arh arhVar = new arh();
            arhVar.d(d.getLogo());
            arhVar.a(anv.a().e(d));
            arhVar.c(d.getSinger());
            arhVar.b(d.getSong());
            arhVar.a(d.getHash());
            arhVar.f(d.getSongId());
            arhVar.a(d.getAlbumId());
            arhVar.e(d.getStyle());
            arhVar.a(d.getQuality());
            arhVar.b(d.getMusicFrom());
            arhVar.b((!d.getIsShortListen().booleanValue() || ((bcu) c.a().b(bcu.class)).isXpVip() || ((bcu) c.a().b(bcu.class)).isMusicVip()) ? false : true);
            return arhVar;
        }
        return null;
    }

    @Override // defpackage.arf
    public arg getPlayingBtInfo() {
        return amt.a().b();
    }

    @Override // defpackage.arf
    public void querySearchHotSongs(arj arjVar) {
        apv.a().a(arjVar);
    }

    public void searchMusicKeyword(String str, arj arjVar) {
        apv.a().a(str, arjVar);
    }

    public void playMusic(String str, long j, String str2, boolean z) {
        apv.a().a(str, j, str2, z);
    }

    @Override // defpackage.arf
    public void playHotMusic(String str) {
        apv.a().a(str);
    }

    @Override // defpackage.arf
    public boolean favMusicOrNot(Object obj) {
        if (obj instanceof MusicSongBean) {
            MusicSongBean musicSongBean = (MusicSongBean) obj;
            MusicInfo a = ab.a(musicSongBean, 40, "搜索");
            if (anv.a().a(musicSongBean)) {
                musicSongBean.setHot(false);
                anc.a().d(a);
            } else {
                musicSongBean.setHot(true);
                anc.a().c(a);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.arf
    public boolean favMusicOrNot(boolean z) {
        MusicInfo a;
        BtMusicBean d;
        if (aei.a().c() == 0) {
            a = apk.i().d();
        } else {
            a = (aei.a().c() != 2 || (d = com.xiaopeng.musicradio.model.bluetooth.a.i().d()) == null) ? null : l.c().a(d.getSong(), d.getSinger());
        }
        boolean c = apb.a().c(a);
        Log.i(TAG, "favMusicOrNot: " + a + " value = " + z + " love=" + c);
        if (a != null) {
            if (z) {
                if (c) {
                    return true;
                }
                anc.a().c(a);
                return true;
            } else if (c) {
                anc.a().d(a);
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.arf
    public void play() {
        apk.i().play();
    }

    @Override // defpackage.arf
    public void pause() {
        apk.i().pause();
    }

    @Override // defpackage.arf
    public void playDailyMusic() {
        c();
    }

    @Override // defpackage.arf
    public String getListSign() {
        String x = apk.i().x();
        return TextUtils.isEmpty(x) ? "" : x;
    }

    private void c() {
        Log.i(TAG, "playDailyMusic");
        if (apx.a().d()) {
            aqz.a().c(new avc<MusicCollectSongListBean>() { // from class: com.xiaopeng.musicradio.service.MusicService.1
                @Override // defpackage.avc
                public void a(int i, String str) {
                }

                @Override // defpackage.avc
                public void a(MusicCollectSongListBean musicCollectSongListBean) {
                    List<MusicSongBean> list = musicCollectSongListBean.getData().getList();
                    if (list == null || list.size() < 1) {
                        return;
                    }
                    MusicRadioItem musicRadioItem = new MusicRadioItem();
                    MusicSongBean musicSongBean = list.get(0);
                    musicRadioItem.setTitle(be.a(b.f.daily_title));
                    musicRadioItem.setName(be.a(b.f.daily_title));
                    musicRadioItem.setLogo(musicSongBean.getAlbum().getLogo());
                    musicRadioItem.setLogoUrl(musicSongBean.getAlbum().getLogo());
                    musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
                    musicRadioItem.setId(-1000L);
                    if (!musicCollectSongListBean.isFromCache()) {
                        ams.a().a(musicRadioItem.getLogoUrl(), musicRadioItem.getId());
                    }
                    ams.a().a(musicRadioItem);
                    MusicService.this.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
        listSignBean.setCollectId(-1000L);
        listSignBean.setExtra(ListSignBean.MUSIC_RADIO_SING_EXTRA);
        listSignBean.setTag(be.a(b.f.daily_title) + bg.h(System.currentTimeMillis()));
        apk.i().a(new amq(listSignBean.toJson(), 50) { // from class: com.xiaopeng.musicradio.service.MusicService.2
            @Override // defpackage.ahp
            public boolean n() {
                return true;
            }

            @Override // defpackage.ahp
            public void a(boolean z, int i, String str) {
                super.a(z, i, str);
            }
        });
    }

    public Class getVipMusicCollectItemClass() {
        return d.class;
    }

    public Class getVipMusicListItemClass() {
        return e.class;
    }

    public Object getMusicListItem() {
        return new e();
    }

    public Object getMusicCollectItem() {
        return new d();
    }

    public int getSongQuality() {
        return amu.a().b();
    }

    public void changeSongQuality(int i) {
        amu.a().a(i);
    }

    @Override // defpackage.arf
    public void resetUserData() {
        apk.i().k();
    }

    @Override // defpackage.arf
    public void resetPlayList() {
        apk.i().n().b(true);
    }

    @Override // defpackage.arf
    public void clearUserData() {
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.service.MusicService.3
            @Override // java.lang.Runnable
            public void run() {
                anc.a().c();
            }
        });
    }

    @Override // defpackage.arf
    public boolean isCanCollected() {
        int c = aei.a().c();
        boolean z = false;
        if (c == 2) {
            BtMusicBean d = com.xiaopeng.musicradio.model.bluetooth.a.i().d();
            if (l.c().a(d.getSong(), d.getSinger()) == null) {
                return false;
            }
        } else if (c == 0) {
            MusicInfo d2 = apk.i().d();
            if (d2 != null) {
                if (d2.getMusicFrom() == 61 || d2.getMusicFrom() == 60 || d2.getOldMusicFrom() == 61 || d2.getOldMusicFrom() == 60 || au.a()) {
                    z = true;
                }
                return !z;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.arf
    public void playMusicByListSign(String str) {
        atf.a().a(str);
    }

    @Override // defpackage.arf
    public void recordMusicCollect(long j, String str, String str2) {
        MusicRadioItem musicRadioItem = new MusicRadioItem();
        musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
        musicRadioItem.setTitle(str);
        musicRadioItem.setLogoUrl(str2);
        musicRadioItem.setId(j);
        ams.a().a(musicRadioItem);
    }

    @Override // defpackage.arf
    public void playMusic(String str) {
        apk.i().b(ab.a((MusicSongBean) z.a(str, (Class<Object>) MusicSongBean.class), 40, "搜索"));
    }

    @Override // defpackage.arf
    public void playMusic(String str, String str2, String str3) {
        MusicInfo a = ab.a((MusicSongBean) z.a(str, (Class<Object>) MusicSongBean.class), 40, "");
        ArrayList arrayList = new ArrayList();
        for (MusicSongBean musicSongBean : (List) z.a(str2, new TypeToken<List<MusicSongBean>>() { // from class: com.xiaopeng.musicradio.service.MusicService.4
        }.getType())) {
            arrayList.add(ab.a(musicSongBean, 40, ""));
        }
        apk.i().a(arrayList, a, str3);
    }

    @Override // defpackage.arf
    public boolean isLove(Object obj) {
        if (obj instanceof MusicSongBean) {
            return anv.a().a((MusicSongBean) obj);
        } else if (obj instanceof MusicInfo) {
            return anv.a().d((MusicInfo) obj);
        } else {
            return false;
        }
    }

    @Override // defpackage.arf
    public boolean isQualityPageOpend() {
        if (aei.a().c() != 0) {
            return false;
        }
        MusicInfo u = apk.i().u();
        boolean z = (u == null || com.xiaopeng.musicradio.utils.e.a()) ? false : true;
        if (z) {
            switch (u.getQuality() != 0 ? u.getQuality() : 1) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // defpackage.arf
    public void startCollectDetail(long j, String str, String str2, String str3) {
        atz.a(j, str, str2, str3);
    }
}
