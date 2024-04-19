package com.xiaopeng.musicradio.utils;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.db.LatelyMusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCollect;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCustom;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.db.MusicUrlInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicArtistBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.music.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: InfoTransferUtil.java */
/* loaded from: classes2.dex */
public class ab {
    private static bcn a = new bco();

    public static MusicInfo a(MusicSongBean musicSongBean) {
        return a(musicSongBean, false);
    }

    public static MusicInfo a(MusicSongBean musicSongBean, boolean z) {
        MusicInfo musicInfo = new MusicInfo();
        musicInfo.setSong(musicSongBean.getSongName());
        musicInfo.setSinger(musicSongBean.getSingers());
        musicInfo.setHash(musicSongBean.getHash());
        musicInfo.setSongId(musicSongBean.getSongId());
        musicInfo.setLrcData(musicSongBean.getLyricFile());
        a(musicInfo, musicSongBean);
        musicInfo.setNeedVip(musicSongBean.isNeedVip());
        musicInfo.setFileList(musicSongBean.getFileList());
        musicInfo.setUid(aqh.a().b());
        musicInfo.setCanPlay(musicSongBean.isCanPlay());
        musicInfo.setNeedVip(musicSongBean.isNeedVip());
        musicInfo.setFileList(musicSongBean.getFileList());
        musicInfo.setStyle(musicSongBean.getStyle());
        musicInfo.setTryFileInfo(musicSongBean.getTryFileInfo());
        musicInfo.setTryPlayable(musicSongBean.isTryPlayable());
        musicInfo.setPlayable(musicSongBean.isPlayable());
        musicInfo.setUnplayableCode(musicSongBean.getUnplayableCode());
        musicInfo.setUnplayableMsg(musicSongBean.getUnplayableMsg());
        musicInfo.setHot(musicSongBean.isHot());
        musicInfo.setSongPlayTime(musicSongBean.getSongPlayTime());
        musicInfo.setHttpCache(z);
        musicInfo.setSingerIds(musicSongBean.getSingerIds());
        musicInfo.setPath(musicSongBean.getPath());
        musicInfo.setFrom(musicSongBean.getFrom());
        return musicInfo;
    }

    public static MusicInfo b(MusicSongBean musicSongBean) {
        if (musicSongBean == null) {
            return null;
        }
        MusicInfo musicInfo = new MusicInfo();
        musicInfo.setHash(musicSongBean.getHash());
        musicInfo.setSongId(musicSongBean.getSongId());
        musicInfo.setSong(musicSongBean.getSongName());
        musicInfo.setSinger(musicSongBean.getSingers());
        a(musicInfo, musicSongBean);
        musicInfo.setLrcData(musicSongBean.getLyricFile());
        musicInfo.setUid(aqh.a().b());
        musicInfo.setCanPlay(musicSongBean.isCanPlay());
        musicInfo.setCreatime(System.currentTimeMillis());
        musicInfo.setPlayTime(musicInfo.getCreatime());
        musicInfo.setMusicFrom(50);
        musicInfo.setInfoType(2);
        musicInfo.setMusicFromTitle(com.xiaopeng.musicradio.a.a.getString(b.f.player_music_love));
        musicInfo.setNeedVip(musicSongBean.isNeedVip());
        musicInfo.setFileList(musicSongBean.getFileList());
        musicInfo.setStyle(musicSongBean.getStyle());
        musicInfo.setTryFileInfo(musicSongBean.getTryFileInfo());
        musicInfo.setTryPlayable(musicSongBean.isTryPlayable());
        musicInfo.setPlayable(musicSongBean.isPlayable());
        musicInfo.setUnplayableCode(musicSongBean.getUnplayableCode());
        musicInfo.setUnplayableMsg(musicSongBean.getUnplayableMsg());
        musicInfo.setHot(musicSongBean.isHot());
        musicInfo.setSongPlayTime(musicSongBean.getSongPlayTime());
        musicInfo.setSingerIds(musicSongBean.getSingerIds());
        musicInfo.setPath(musicSongBean.getPath());
        musicInfo.setFrom(musicSongBean.getFrom());
        return musicInfo;
    }

    public static MusicInfo a(MusicSongBean musicSongBean, int i, String str) {
        MusicInfo b = b(musicSongBean, i, str);
        if (b != null) {
            b.setInfoType(0);
        }
        return b;
    }

    public static MusicInfo b(MusicSongBean musicSongBean, int i, String str) {
        return a(new MusicInfo(), musicSongBean, i, str);
    }

    public static MusicInfo a(MusicInfo musicInfo, MusicSongBean musicSongBean, int i, String str) {
        if (musicSongBean == null) {
            return null;
        }
        musicInfo.setHash(musicSongBean.getHash());
        musicInfo.setSongId(musicSongBean.getSongId());
        musicInfo.setSong(musicSongBean.getSongName());
        if (!TextUtils.isEmpty(musicSongBean.getSingers())) {
            musicInfo.setSinger(musicSongBean.getSingers());
        } else {
            musicInfo.setSinger(musicSongBean.getArtist().getName());
        }
        a(musicInfo, musicSongBean);
        musicInfo.setLrcData(musicSongBean.getLyricFile());
        musicInfo.setUid(aqh.a().b());
        musicInfo.setCanPlay(musicSongBean.isCanPlay());
        musicInfo.setCreatime(System.currentTimeMillis());
        musicInfo.setPlayTime(musicInfo.getCreatime());
        musicInfo.setMusicFrom(i);
        musicInfo.setNeedVip(musicSongBean.isNeedVip());
        musicInfo.setFileList(musicSongBean.getFileList());
        if (i == 50 || i == 20) {
            musicInfo.setInfoType(2);
        } else {
            musicInfo.setInfoType(0);
        }
        musicInfo.setMusicFromTitle(str);
        musicInfo.setNeedVip(musicSongBean.isNeedVip());
        musicInfo.setFileList(musicSongBean.getFileList());
        musicInfo.setStyle(musicSongBean.getStyle());
        musicInfo.setTryFileInfo(musicSongBean.getTryFileInfo());
        musicInfo.setTryPlayable(musicSongBean.isTryPlayable());
        musicInfo.setPlayable(musicSongBean.isPlayable());
        musicInfo.setUnplayableCode(musicSongBean.getUnplayableCode());
        musicInfo.setUnplayableMsg(musicSongBean.getUnplayableMsg());
        musicInfo.setHot(musicSongBean.isHot());
        musicInfo.setSongPlayTime(musicSongBean.getSongPlayTime());
        musicInfo.setSingerIds(musicSongBean.getSingerIds());
        musicInfo.setPath(musicSongBean.getPath());
        musicInfo.setFrom(musicSongBean.getFrom());
        return musicInfo;
    }

    private static void a(MusicInfo musicInfo, MusicSongBean musicSongBean) {
        MusicArtistBean artist = musicSongBean.getArtist();
        if (artist != null) {
            musicInfo.setArtistId(artist.getId());
        }
        MusicAlbumBean album = musicSongBean.getAlbum();
        if (album != null) {
            musicInfo.setAlbumName(album.getName());
            musicInfo.setAlbumId(album.getId());
            if (!TextUtils.isEmpty(album.getLogo())) {
                musicInfo.setLogo(album.getLogo());
            }
        }
        if (artist != null && TextUtils.isEmpty(musicInfo.getLogo()) && !TextUtils.isEmpty(artist.getLogo())) {
            musicInfo.setLogo(artist.getLogo());
        }
        if (artist == null || TextUtils.isEmpty(artist.getLogo())) {
            return;
        }
        musicInfo.setArtistLogo(artist.getLogo());
    }

    public static MusicInfo a(MusicSongBean musicSongBean, String str) {
        MusicInfo musicInfo = new MusicInfo();
        musicInfo.setHash(musicSongBean.getHash());
        musicInfo.setSongId(musicSongBean.getSongId());
        musicInfo.setSong(musicSongBean.getSongName());
        musicInfo.setSinger(musicSongBean.getSingers());
        a(musicInfo, musicSongBean);
        musicInfo.setLrcData(musicSongBean.getLyricFile());
        musicInfo.setUid(aqh.a().b());
        musicInfo.setCanPlay(musicSongBean.isCanPlay());
        musicInfo.setCreatime(System.currentTimeMillis());
        musicInfo.setPlayTime(musicInfo.getCreatime());
        musicInfo.setInfoType(0);
        musicInfo.setMusicFrom(40);
        musicInfo.setMusicFromTitle(str);
        musicInfo.setCanFold(true);
        musicInfo.setNeedVip(musicSongBean.isNeedVip());
        musicInfo.setFileList(musicSongBean.getFileList());
        musicInfo.setStyle(musicSongBean.getStyle());
        musicInfo.setTryFileInfo(musicSongBean.getTryFileInfo());
        musicInfo.setTryPlayable(musicSongBean.isTryPlayable());
        musicInfo.setPlayable(musicSongBean.isPlayable());
        musicInfo.setUnplayableCode(musicSongBean.getUnplayableCode());
        musicInfo.setUnplayableMsg(musicSongBean.getUnplayableMsg());
        musicInfo.setHot(musicSongBean.isHot());
        musicInfo.setSongPlayTime(musicSongBean.getSongPlayTime());
        musicInfo.setSingerIds(musicSongBean.getSingerIds());
        musicInfo.setPath(musicSongBean.getPath());
        musicInfo.setFrom(musicSongBean.getFrom());
        return musicInfo;
    }

    public static MusicInfo c(MusicSongBean musicSongBean) {
        MusicInfo musicInfo = new MusicInfo();
        musicInfo.setHash(musicSongBean.getHash());
        musicInfo.setSongId(musicSongBean.getSongId());
        musicInfo.setSong(musicSongBean.getSongName());
        musicInfo.setSinger(musicSongBean.getSingers());
        a(musicInfo, musicSongBean);
        musicInfo.setLrcData(musicSongBean.getLyricContent());
        musicInfo.setUid(aqh.a().b());
        musicInfo.setCanPlay(musicSongBean.isCanPlay());
        musicInfo.setCreatime(System.currentTimeMillis());
        musicInfo.setPlayTime(musicInfo.getCreatime());
        musicInfo.setMusicFrom(20);
        musicInfo.setInfoType(2);
        musicInfo.setMusicFromTitle(com.xiaopeng.musicradio.a.a.getString(b.f.player_music_bt));
        musicInfo.setNeedVip(musicSongBean.isNeedVip());
        musicInfo.setFileList(musicSongBean.getFileList());
        musicInfo.setStyle(musicSongBean.getStyle());
        musicInfo.setTryFileInfo(musicSongBean.getTryFileInfo());
        musicInfo.setTryPlayable(musicSongBean.isTryPlayable());
        musicInfo.setPlayable(musicSongBean.isPlayable());
        musicInfo.setUnplayableCode(musicSongBean.getUnplayableCode());
        musicInfo.setUnplayableMsg(musicSongBean.getUnplayableMsg());
        musicInfo.setHot(musicSongBean.isHot());
        musicInfo.setSongPlayTime(musicSongBean.getSongPlayTime());
        musicInfo.setSingerIds(musicSongBean.getSingerIds());
        musicInfo.setPath(musicSongBean.getPath());
        musicInfo.setFrom(musicSongBean.getFrom());
        return musicInfo;
    }

    public static MusicInfo a(MusicInfo musicInfo) {
        MusicInfo clone = musicInfo.clone();
        clone.setInfoType(0);
        clone.setCanFold(true);
        return clone;
    }

    public static MusicInfo a(LatelyMusicInfo latelyMusicInfo) {
        return a.a(latelyMusicInfo);
    }

    public static LatelyMusicInfo b(MusicInfo musicInfo) {
        return a.a(musicInfo);
    }

    public static MusicUrlInfo c(MusicInfo musicInfo) {
        MusicUrlInfo musicUrlInfo = new MusicUrlInfo();
        musicUrlInfo.setHash(musicInfo.getHash());
        musicUrlInfo.setUrl(musicInfo.getTempNetUrl());
        musicUrlInfo.setUpdateTime(System.currentTimeMillis());
        musicUrlInfo.setSong(musicInfo.getSong());
        return musicUrlInfo;
    }

    public static List<MusicInfo> a(List<MusicInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (MusicInfo musicInfo : list) {
            if (!TextUtils.isEmpty(musicInfo.getHash())) {
                arrayList.add(musicInfo);
            }
        }
        return arrayList;
    }

    public static MusicRadioItem a(MusicAlbumCollect musicAlbumCollect, String str) {
        MusicRadioItem musicRadioItem = new MusicRadioItem();
        musicRadioItem.setType(str);
        musicRadioItem.setTitle(musicAlbumCollect.getName());
        musicRadioItem.setName(musicAlbumCollect.getName());
        musicRadioItem.setLogoUrl(musicAlbumCollect.getLogo());
        musicRadioItem.setLogo(musicAlbumCollect.getLogo());
        musicRadioItem.setId(musicAlbumCollect.getId());
        musicRadioItem.setCacheTime(musicAlbumCollect.getCreateTime());
        musicRadioItem.setDeleted(musicAlbumCollect.getCreateTime() == 0);
        return musicRadioItem;
    }

    public static MusicAlbumCollect a(MusicRadioItem musicRadioItem) {
        MusicAlbumCollect musicAlbumCollect = new MusicAlbumCollect();
        musicAlbumCollect.setCreateTime(System.currentTimeMillis());
        musicAlbumCollect.setType(4);
        musicAlbumCollect.setName(musicRadioItem.getName());
        musicAlbumCollect.setLogo(musicRadioItem.getLogo());
        musicAlbumCollect.setId(musicRadioItem.getId());
        return musicAlbumCollect;
    }

    public static MusicRadioItem a(MusicAlbumCustom musicAlbumCustom) {
        return a.a(musicAlbumCustom);
    }
}
