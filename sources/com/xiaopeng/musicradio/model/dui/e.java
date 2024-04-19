package com.xiaopeng.musicradio.model.dui;

import com.xiaopeng.musicradio.bean.blue.BtMusicBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.model.bluetooth.l;
import com.xiaopeng.musicradio.model.dui.g;
import com.xiaopeng.musicradio.utils.bh;
import com.xiaopeng.speech.protocol.query.music.bean.PlayInfo;
/* compiled from: DuiMusicMediaQueryModel.java */
/* loaded from: classes.dex */
public class e implements g.a {
    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public void a(PlayInfo playInfo) {
        int c = aei.a().c();
        if (c == 0) {
            MusicInfo u = apk.i().u();
            if (u != null) {
                playInfo.setPlayType(1);
                playInfo.setAlbum(u.getAlbumName());
                playInfo.setArtist(u.getSinger());
                playInfo.setTitle(u.getSong());
                playInfo.setPlayTime(apk.i().getPosition());
                playInfo.setRemainingTime(apk.i().getDuration() - apk.i().getPosition());
            }
        } else if (c != 2) {
        } else {
            MusicInfo u2 = apk.i().u();
            BtMusicBean d = com.xiaopeng.musicradio.model.bluetooth.a.i().d();
            if (d == null) {
                if (u2 != null) {
                    playInfo.setPlayType(1);
                    playInfo.setAlbum(u2.getAlbumName());
                    playInfo.setArtist(u2.getSinger());
                    playInfo.setTitle(u2.getSong());
                    playInfo.setPlayTime(apk.i().getPosition());
                    playInfo.setRemainingTime(apk.i().getDuration() - apk.i().getPosition());
                    return;
                }
                return;
            }
            MusicInfo a = l.c().a(d.getSong(), d.getSinger());
            if (a != null) {
                playInfo.setAlbum(a.getAlbumName());
                playInfo.setArtist(a.getSinger());
                playInfo.setTitle(a.getSong());
                playInfo.setPlayType(1);
                playInfo.setPlayTime(apk.i().getPosition());
                playInfo.setRemainingTime(apk.i().getDuration() - apk.i().getPosition());
                return;
            }
            playInfo.setAlbum("");
            playInfo.setArtist(d.getSinger());
            playInfo.setTitle(d.getSong());
            playInfo.setPlayType(1);
            playInfo.setPlayTime(apk.i().getPosition());
            playInfo.setRemainingTime(apk.i().getDuration() - apk.i().getPosition());
        }
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public String a() {
        return a(1);
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public String b() {
        return a(2);
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public String c() {
        return a(3);
    }

    private String a(int i) {
        int c = aei.a().c();
        if (c != 0) {
            if (c != 2) {
                return "";
            }
            MusicInfo u = apk.i().u();
            BtMusicBean d = com.xiaopeng.musicradio.model.bluetooth.a.i().d();
            if (d != null) {
                MusicInfo a = l.c().a(d.getSong(), d.getSinger());
                if (a != null) {
                    return a(a, i);
                }
                return a(d, i);
            }
            a(u, i);
            return "";
        }
        return a(apk.i().u(), i);
    }

    private String a(MusicInfo musicInfo, int i) {
        if (musicInfo != null) {
            if (i == 1) {
                return musicInfo.getSong();
            }
            if (i == 2) {
                return musicInfo.getSinger();
            }
            return i == 3 ? musicInfo.getAlbumName() : "";
        }
        return "";
    }

    private String a(BtMusicBean btMusicBean, int i) {
        if (btMusicBean != null) {
            if (i == 1) {
                return btMusicBean.getSong();
            }
            if (i == 2) {
                return btMusicBean.getSinger();
            }
            return i == 3 ? "" : "";
        }
        return "";
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public boolean d() {
        return anr.a().d() <= 0;
    }

    @Override // com.xiaopeng.musicradio.model.dui.g.a
    public boolean e() {
        return bh.a().size() == 0;
    }
}
