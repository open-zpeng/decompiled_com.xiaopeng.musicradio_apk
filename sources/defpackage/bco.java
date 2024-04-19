package defpackage;

import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.LatelyMusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCustom;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
/* compiled from: InfoTransferImpl.java */
/* renamed from: bco  reason: default package */
/* loaded from: classes2.dex */
public class bco implements bcn {
    @Override // defpackage.bcn
    public LatelyMusicInfo a(MusicInfo musicInfo) {
        LatelyMusicInfo latelyMusicInfo = new LatelyMusicInfo();
        latelyMusicInfo.setHash(musicInfo.getHash());
        latelyMusicInfo.setSongId(musicInfo.getSongId());
        latelyMusicInfo.setSong(musicInfo.getSong());
        latelyMusicInfo.setSinger(musicInfo.getSinger());
        latelyMusicInfo.setSingerIds(musicInfo.getSingerIds());
        latelyMusicInfo.setMusicFrom(10);
        latelyMusicInfo.setMusicFromTitle(MusicInfo.TAG_MUSIC.get(10));
        latelyMusicInfo.setData(musicInfo.getData());
        latelyMusicInfo.setInfoNeed(musicInfo.getInfoNeed());
        latelyMusicInfo.setArtistId(musicInfo.getArtistId());
        latelyMusicInfo.setTs(System.currentTimeMillis());
        latelyMusicInfo.setLogo(musicInfo.getLogo());
        latelyMusicInfo.setLrcData(musicInfo.getLrcData());
        latelyMusicInfo.setUid(aqh.a().b());
        latelyMusicInfo.setCanPlay(musicInfo.isCanPlay());
        latelyMusicInfo.setPlayTime(musicInfo.getPlayTime());
        latelyMusicInfo.setAlbumId(musicInfo.getAlbumId());
        latelyMusicInfo.setNeedVip(musicInfo.isNeedVip());
        latelyMusicInfo.setFileList(musicInfo.getFileList());
        latelyMusicInfo.setTryFileInfo(musicInfo.getTryFileInfo());
        latelyMusicInfo.setListenUrlRefreshTime(musicInfo.getListenUrlRefreshTime());
        return latelyMusicInfo;
    }

    @Override // defpackage.bcn
    public MusicInfo a(LatelyMusicInfo latelyMusicInfo) {
        MusicInfo musicInfo = new MusicInfo();
        musicInfo.setHash(latelyMusicInfo.getHash());
        musicInfo.setSongId(latelyMusicInfo.getSongId());
        musicInfo.setSong(latelyMusicInfo.getSong());
        musicInfo.setInfoNeed(latelyMusicInfo.getInfoNeed());
        musicInfo.setMusicFrom(latelyMusicInfo.getMusicFrom());
        musicInfo.setMusicFromTitle(latelyMusicInfo.getMusicFromTitle());
        musicInfo.setOldMusicFrom(latelyMusicInfo.getOldMusicFrom());
        musicInfo.setOldMusicFromTitle(latelyMusicInfo.getOldMusicFromTitle());
        musicInfo.setSinger(latelyMusicInfo.getSinger());
        musicInfo.setArtistId(latelyMusicInfo.getArtistId());
        musicInfo.setSingerIds(latelyMusicInfo.getSingerIds());
        musicInfo.setLogo(latelyMusicInfo.getLogo());
        musicInfo.setLrcData(latelyMusicInfo.getLrcData());
        musicInfo.setData(latelyMusicInfo.getData());
        musicInfo.setUid(latelyMusicInfo.getUid());
        musicInfo.setCanPlay(latelyMusicInfo.getCanPlay());
        musicInfo.setAlbumId(latelyMusicInfo.getAlbumId());
        musicInfo.setNeedVip(latelyMusicInfo.isNeedVip());
        musicInfo.setFileList(latelyMusicInfo.getFileList());
        musicInfo.setTryFileInfo(latelyMusicInfo.getTryFileInfo());
        musicInfo.setListenUrlRefreshTime(0L);
        return musicInfo;
    }

    @Override // defpackage.bcn
    public MusicRadioItem a(MusicAlbumCustom musicAlbumCustom) {
        MusicRadioItem musicRadioItem = new MusicRadioItem();
        musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
        musicRadioItem.setTitle(musicAlbumCustom.getName());
        musicRadioItem.setName(musicAlbumCustom.getName());
        musicRadioItem.setId(musicAlbumCustom.getId());
        musicRadioItem.setLogo(musicAlbumCustom.getLogo());
        musicRadioItem.setLogoUrl(musicAlbumCustom.getLogo());
        musicRadioItem.setCacheTime(musicAlbumCustom.getCacheTime());
        return musicRadioItem;
    }
}
