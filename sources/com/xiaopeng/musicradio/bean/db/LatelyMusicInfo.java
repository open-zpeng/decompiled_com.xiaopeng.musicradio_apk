package com.xiaopeng.musicradio.bean.db;

import com.xiaopeng.musicradio.bean.xpbean.SongQualityBean;
import com.xiaopeng.musicradio.bean.xpbean.TryFileInfo;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class LatelyMusicInfo extends BaseUserMusicInfo implements Serializable {
    private static final long serialVersionUID = 0;
    private long albumId;
    private long artistId;
    private Long cacheId;
    private boolean canPlay;
    private String data;
    private List<SongQualityBean.DataBean.SongQuality> fileList;
    private String hash;
    private int infoNeed;
    private boolean isLove;
    private long listenUrlRefreshTime;
    private String logo;
    private String lrcData;
    private int musicFrom;
    private String musicFromTitle;
    private boolean needVip;
    private int oldMusicFrom;
    private String oldMusicFromTitle;
    private int playState;
    private long playTime;
    private String singer;
    private String singerIds;
    private String song;
    private String songId;
    private TryFileInfo tryFileInfo;
    private long ts;
    private String uid;

    public LatelyMusicInfo() {
        this.hash = "";
        this.singerIds = "";
        this.uid = "";
        this.musicFrom = 0;
        this.oldMusicFrom = 0;
        this.musicFromTitle = "";
        this.oldMusicFromTitle = "";
        this.ts = 0L;
        this.infoNeed = 0;
        this.playState = -1;
        this.albumId = 0L;
    }

    public LatelyMusicInfo(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, String str8, String str9, long j, String str10, String str11, boolean z, long j2, int i3, boolean z2, long j3, long j4, long j5, List<SongQualityBean.DataBean.SongQuality> list, TryFileInfo tryFileInfo) {
        this.hash = "";
        this.singerIds = "";
        this.uid = "";
        this.musicFrom = 0;
        this.oldMusicFrom = 0;
        this.musicFromTitle = "";
        this.oldMusicFromTitle = "";
        this.ts = 0L;
        this.infoNeed = 0;
        this.playState = -1;
        this.albumId = 0L;
        this.cacheId = l;
        this.hash = str;
        this.songId = str2;
        this.song = str3;
        this.singer = str4;
        this.singerIds = str5;
        this.logo = str6;
        this.uid = str7;
        this.musicFrom = i;
        this.oldMusicFrom = i2;
        this.musicFromTitle = str8;
        this.oldMusicFromTitle = str9;
        this.ts = j;
        this.data = str10;
        this.lrcData = str11;
        this.canPlay = z;
        this.artistId = j2;
        this.infoNeed = i3;
        this.needVip = z2;
        this.playTime = j3;
        this.albumId = j4;
        this.listenUrlRefreshTime = j5;
        this.fileList = list;
        this.tryFileInfo = tryFileInfo;
    }

    public Long getCacheId() {
        return this.cacheId;
    }

    public void setCacheId(Long l) {
        this.cacheId = l;
    }

    public String getLrcData() {
        return this.lrcData;
    }

    public void setLrcData(String str) {
        this.lrcData = str;
    }

    public boolean getCanPlay() {
        return this.canPlay;
    }

    public void setCanPlay(boolean z) {
        this.canPlay = z;
    }

    public long getArtistId() {
        return this.artistId;
    }

    public void setArtistId(long j) {
        this.artistId = j;
    }

    public int getInfoNeed() {
        return this.infoNeed;
    }

    public void setInfoNeed(int i) {
        this.infoNeed = i;
    }

    public void setData(String str) {
        this.data = str;
    }

    public String getData() {
        return this.data;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public String getHash() {
        return this.hash;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setHash(String str) {
        this.hash = str;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public String getSong() {
        return this.song;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setSong(String str) {
        this.song = str;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public String getSinger() {
        return this.singer;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setSinger(String str) {
        this.singer = str;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public String getLogo() {
        return this.logo;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setLogo(String str) {
        this.logo = str;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public String getUid() {
        return this.uid;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setUid(String str) {
        this.uid = str;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public int getMusicFrom() {
        return this.musicFrom;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setMusicFrom(int i) {
        this.musicFrom = i;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public long getTs() {
        return this.ts;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setTs(long j) {
        this.ts = j;
    }

    public List<SongQualityBean.DataBean.SongQuality> getFileList() {
        return this.fileList;
    }

    public void setFileList(List<SongQualityBean.DataBean.SongQuality> list) {
        this.fileList = list;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public int getPlayState() {
        return this.playState;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public int setPlayState(int i) {
        this.playState = i;
        return i;
    }

    public boolean isLove() {
        return this.isLove;
    }

    public void setLove(boolean z) {
        this.isLove = z;
    }

    public boolean isNeedVip() {
        return this.needVip;
    }

    public void setNeedVip(boolean z) {
        this.needVip = z;
    }

    public String getSingerIds() {
        return this.singerIds;
    }

    public void setSingerIds(String str) {
        this.singerIds = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.hash.equals(((LatelyMusicInfo) obj).hash);
    }

    public int hashCode() {
        return this.hash.hashCode();
    }

    public String toString() {
        return "LatelyMusicInfo{hash=" + this.hash + ", song='" + this.song + "', singer='" + this.singer + "'}";
    }

    public long getPlayTime() {
        return this.playTime;
    }

    public void setPlayTime(long j) {
        this.playTime = j;
    }

    public String getMusicFromTitle() {
        return this.musicFromTitle;
    }

    public void setMusicFromTitle(String str) {
        this.musicFromTitle = str;
    }

    public int getOldMusicFrom() {
        return this.oldMusicFrom;
    }

    public void setOldMusicFrom(int i) {
        this.oldMusicFrom = i;
    }

    public String getOldMusicFromTitle() {
        return this.oldMusicFromTitle;
    }

    public void setOldMusicFromTitle(String str) {
        this.oldMusicFromTitle = str;
    }

    public long getAlbumId() {
        return this.albumId;
    }

    public void setAlbumId(long j) {
        this.albumId = j;
    }

    public boolean getNeedVip() {
        return this.needVip;
    }

    public TryFileInfo getTryFileInfo() {
        return this.tryFileInfo;
    }

    public void setTryFileInfo(TryFileInfo tryFileInfo) {
        this.tryFileInfo = tryFileInfo;
        this.listenUrlRefreshTime = System.currentTimeMillis();
    }

    public void setListenUrlRefreshTime(long j) {
        this.listenUrlRefreshTime = j;
    }

    public long getListenUrlRefreshTime() {
        return this.listenUrlRefreshTime;
    }

    public String getSongId() {
        return this.songId;
    }

    public void setSongId(String str) {
        this.songId = str;
    }
}
