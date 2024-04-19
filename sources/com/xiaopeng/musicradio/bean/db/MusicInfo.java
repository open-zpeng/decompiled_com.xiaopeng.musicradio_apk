package com.xiaopeng.musicradio.bean.db;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.annotations.Expose;
import com.xiaopeng.musicradio.bean.xpbean.SongQualityBean;
import com.xiaopeng.musicradio.bean.xpbean.TryFileInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class MusicInfo extends BaseUserMusicInfo implements Serializable, Cloneable {
    public static final String FAKE_BT_HASH = "fake_bt_hash_";
    public static final int INFO_TYPE_STORAGE_FOREVER = 2;
    public static final int INFO_TYPE_STORAGE_TEMP = 1;
    public static final int INFO_TYPE_TEMP = 0;
    public static final int MUISC_FROM_SURPRISE_ST = 5;
    public static final int MUSIC_FROM_ALBUM_LOVE = 30;
    public static final int MUSIC_FROM_BLUE = 20;
    public static final int MUSIC_FROM_FRIEND = 2;
    public static final int MUSIC_FROM_HISTORY = 10;
    public static final int MUSIC_FROM_IMPORT_ALBUM = 35;
    public static final int MUSIC_FROM_LOCAL = 60;
    public static final int MUSIC_FROM_LOVE = 50;
    public static final int MUSIC_FROM_NONE = 0;
    public static final int MUSIC_FROM_SEARCH_ONE = 40;
    public static final int MUSIC_FROM_USB = 61;
    public static final int MUSIC_FROM_USER_ALBUM = 36;
    public static final SparseArray<String> TAG_MUSIC = new SparseArray<>();
    private static final long serialVersionUID = 0;
    private long albumId;
    private String albumLogo;
    private String albumName;
    private boolean append;
    private long artistId;
    private String artistLogo;
    private boolean btFake;
    private boolean canFold;
    private boolean canPlay;
    private boolean canUp;
    private String collectSongId;
    private long creatime;
    private String data;
    private long duration;
    private long endTime;
    private List<SongQualityBean.DataBean.SongQuality> fileList;
    private int from;
    private Boolean hasCopyright;
    private boolean hasParse;
    private String hash;
    private boolean hot;
    @Expose(deserialize = false, serialize = false)
    private boolean httpCache;
    @Deprecated
    private int infoNeed;
    private int infoType;
    private boolean isCustomAdded;
    private boolean isDir;
    private Boolean isShortListen;
    private long listenUrlRefreshTime;
    private String logo;
    private String lrcData;
    private transient List<Integer> mIndexList;
    private transient int mPlayMode;
    private boolean mPlayOnlyFold;
    private int musicFrom;
    private String musicFromTitle;
    private String musicSource;
    private boolean needVip;
    private long oldCreateTime;
    private int oldMusicFrom;
    private String oldMusicFromTitle;
    private transient MusicInfo parentInfo;
    private String path;
    private int playBy;
    private int playCount;
    private int playIndex;
    private long playTime;
    private boolean playable;
    private int quality;
    private String searchSongText;
    private Integer shortDurationS;
    private String singer;
    private String singerIds;
    private int size;
    private String song;
    private String songId;
    private int songPlayTime;
    private String style;
    private transient List<MusicInfo> subList;
    private String tempNetUrl;
    private TryFileInfo tryFileInfo;
    private boolean tryPlayable;
    @Deprecated
    private long ts;
    private String uid;
    private int unplayableCode;
    private String unplayableMsg;

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public int getPlayState() {
        return -1;
    }

    public void setCanFold(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public int setPlayState(int i) {
        return -1;
    }

    static {
        TAG_MUSIC.put(0, "");
        TAG_MUSIC.put(20, "蓝牙音乐");
        TAG_MUSIC.put(40, "搜索歌单");
        TAG_MUSIC.put(50, "我喜欢");
        TAG_MUSIC.put(5, "惊喜");
        TAG_MUSIC.put(35, "手机歌单");
        TAG_MUSIC.put(10, "最近播放");
    }

    public String getTempNetUrl() {
        return this.tempNetUrl;
    }

    public void setTempNetUrl(String str) {
        this.tempNetUrl = str;
    }

    public String getSearchSongText() {
        return this.searchSongText;
    }

    public void setSearchSongText(String str) {
        this.searchSongText = str;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public String getHash() {
        return this.hash;
    }

    public long getAlbumId() {
        return this.albumId;
    }

    public long getDuration() {
        return this.duration;
    }

    public void setDuration(int i) {
        this.duration = i;
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

    public String getSingerIds() {
        return this.singerIds;
    }

    public void setSingerIds(String str) {
        this.singerIds = str;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public int getMusicFrom() {
        return this.musicFrom;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setMusicFrom(int i) {
        this.musicFrom = i;
    }

    public int getOldMusicFrom() {
        return this.oldMusicFrom;
    }

    public void setOldMusicFrom(int i) {
        this.oldMusicFrom = i;
    }

    public long getOldCreateTime() {
        return this.oldCreateTime;
    }

    public void setOldCreateTime(long j) {
        this.oldCreateTime = j;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int i) {
        this.size = i;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setHash(String str) {
        this.hash = str;
    }

    public void setAlbumId(long j) {
        this.albumId = j;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public String getLrcData() {
        return this.lrcData;
    }

    public void setLrcData(String str) {
        this.lrcData = str;
    }

    public long getArtistId() {
        return this.artistId;
    }

    public void setArtistId(long j) {
        this.artistId = j;
    }

    @Deprecated
    public int getInfoNeed() {
        return this.infoNeed;
    }

    @Deprecated
    public void setInfoNeed(int i) {
        this.infoNeed = i;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public String getLogo() {
        return this.logo;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setLogo(String str) {
        this.logo = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public String getData() {
        return this.data;
    }

    public boolean isEnableLove() {
        return !TextUtils.isEmpty(this.hash);
    }

    public int getPlayBy() {
        return this.playBy;
    }

    public void setPlayBy(int i) {
        this.playBy = i;
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
    @Deprecated
    public long getTs() {
        return getCreatime();
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    @Deprecated
    public void setTs(long j) {
        setCreatime(j);
    }

    public boolean isCanPlay() {
        return this.canPlay;
    }

    public void setCanPlay(boolean z) {
        this.canPlay = z;
    }

    public String getAlbumName() {
        return this.albumName;
    }

    public void setAlbumName(String str) {
        this.albumName = str;
    }

    public boolean isBtFake() {
        return this.btFake;
    }

    public void setBtFake(boolean z) {
        this.btFake = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MusicInfo musicInfo = (MusicInfo) obj;
        return TextUtils.equals(this.hash, musicInfo.hash) && this.albumId == musicInfo.getAlbumId();
    }

    public int hashCode() {
        return Objects.hash(this.hash, Long.valueOf(this.albumId));
    }

    public boolean getCanPlay() {
        return this.canPlay;
    }

    public long getPlayTime() {
        return this.playTime;
    }

    public void setPlayTime(long j) {
        this.playTime = j;
    }

    public long getCreatime() {
        return this.creatime;
    }

    public void setCreatime(long j) {
        this.creatime = j;
    }

    public String getMusicFromTitle() {
        return this.musicFromTitle;
    }

    public void setMusicFromTitle(String str) {
        this.musicFromTitle = str;
    }

    public String getOldMusicFromTitle() {
        return this.oldMusicFromTitle;
    }

    public void setOldMusicFromTitle(String str) {
        this.oldMusicFromTitle = str;
    }

    public int getQuality() {
        return this.quality;
    }

    public void setQuality(int i) {
        this.quality = i;
    }

    public int getPlayCount() {
        return this.playCount;
    }

    public void setPlayCount(int i) {
        this.playCount = i;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public int getInfoType() {
        return this.infoType;
    }

    public void setInfoType(int i) {
        this.infoType = i;
    }

    public boolean getCanFold() {
        return this.canFold;
    }

    public boolean isCanUp() {
        return this.canUp;
    }

    public void setCanUp(boolean z) {
        this.canUp = z;
    }

    public Boolean getIsShortListen() {
        return Boolean.valueOf(this.isShortListen.booleanValue() || (!this.playable && this.tryPlayable));
    }

    public void setIsShortListen(Boolean bool) {
        this.isShortListen = bool;
    }

    public void setShortDurationS(Integer num) {
        this.shortDurationS = num;
    }

    public Integer getShortDurationS() {
        TryFileInfo tryFileInfo;
        if (this.shortDurationS.intValue() < 0 && getIsShortListen().booleanValue() && (tryFileInfo = this.tryFileInfo) != null) {
            return Integer.valueOf((tryFileInfo.getTryEnd() - this.tryFileInfo.getTryBegin()) / 1000);
        }
        return this.shortDurationS;
    }

    public Boolean getHasCopyright() {
        return this.hasCopyright;
    }

    public void setHasCopyright(Boolean bool) {
        this.hasCopyright = bool;
    }

    public String getArtistLogo() {
        return this.artistLogo;
    }

    public void setArtistLogo(String str) {
        this.artistLogo = str;
    }

    public String toString() {
        return "MusicInfo{hash=" + this.hash + ",albumId=" + this.albumId + ", song='" + this.song + "', logo='" + this.logo + "', singer='" + this.singer + "', singerIds='" + this.singerIds + "', musicFrom=" + this.musicFrom + ", infoType=" + this.infoType + ", listenUrlRefreshTime=" + this.listenUrlRefreshTime + '}';
    }

    @Override // com.xiaopeng.musicradio.bean.BaseInfo
    public MusicInfo clone() {
        try {
            return (MusicInfo) super.clone();
        } catch (CloneNotSupportedException unused) {
            MusicInfo musicInfo = new MusicInfo();
            musicInfo.setHash(getHash());
            musicInfo.setSongId(getSongId());
            musicInfo.setAlbumId(getAlbumId());
            musicInfo.setAlbumLogo(getAlbumLogo());
            musicInfo.setAlbumName(getAlbumName());
            musicInfo.setMusicFrom(getMusicFrom());
            musicInfo.setBtFake(isBtFake());
            musicInfo.setOldMusicFrom(getOldMusicFrom());
            musicInfo.setSong(getSong());
            musicInfo.setInfoNeed(getInfoNeed());
            musicInfo.setSinger(getSinger());
            musicInfo.setSingerIds(getSingerIds());
            musicInfo.setArtistId(getArtistId());
            musicInfo.setLogo(getLogo());
            musicInfo.setLrcData(getLrcData());
            musicInfo.setData(getData());
            musicInfo.setUid(getUid());
            musicInfo.setCanPlay(getCanPlay());
            musicInfo.setCanFold(getCanFold());
            musicInfo.setCanUp(isCanUp());
            musicInfo.setTs(getTs());
            musicInfo.setCreatime(getCreatime());
            musicInfo.setPlayTime(getPlayTime());
            musicInfo.setInfoType(getInfoType());
            musicInfo.setMusicFromTitle(getMusicFromTitle());
            musicInfo.setOldMusicFrom(getOldMusicFrom());
            musicInfo.setNeedVip(isNeedVip());
            musicInfo.setFileList(getFileList());
            musicInfo.setDir(isDir());
            musicInfo.setSongId(getSongId());
            musicInfo.setHasCopyright(getHasCopyright());
            musicInfo.setStyle(getStyle());
            musicInfo.setFileList(getFileList());
            musicInfo.setTempNetUrl(getTempNetUrl());
            musicInfo.setSearchSongText(getSearchSongText());
            musicInfo.setShortDurationS(getShortDurationS());
            return musicInfo;
        }
    }

    public String getAlbumLogo() {
        return this.albumLogo;
    }

    public void setAlbumLogo(String str) {
        this.albumLogo = str;
    }

    public String getSongId() {
        return this.songId;
    }

    public void setSongId(String str) {
        this.songId = str;
    }

    public MusicInfo(String str, long j, long j2, String str2, String str3, String str4, long j3, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, long j4, int i3, int i4, int i5, String str11, long j5, boolean z, String str12, long j6, long j7, long j8, String str13, String str14, int i6, int i7, boolean z2, String str15, String str16, Boolean bool, Integer num, boolean z3, String str17, TryFileInfo tryFileInfo, long j9, boolean z4, boolean z5, boolean z6, String str18, int i8, List<SongQualityBean.DataBean.SongQuality> list) {
        this.hash = "";
        this.albumId = 0L;
        this.duration = 0L;
        this.artistId = 0L;
        this.singer = "";
        this.singerIds = "";
        this.musicFrom = 0;
        this.oldMusicFrom = 0;
        this.oldCreateTime = 0L;
        this.size = 0;
        this.infoNeed = 0;
        this.uid = "";
        this.playBy = 0;
        this.canPlay = true;
        this.playTime = 0L;
        this.creatime = 0L;
        this.endTime = 0L;
        this.musicFromTitle = "";
        this.oldMusicFromTitle = "";
        this.playCount = 0;
        this.infoType = 0;
        this.canFold = false;
        this.isShortListen = false;
        this.shortDurationS = -1;
        this.tryPlayable = true;
        this.playable = true;
        this.hasCopyright = true;
        this.canUp = true;
        this.btFake = false;
        this.subList = new ArrayList();
        this.playIndex = -1;
        this.mPlayMode = 2;
        this.mIndexList = new ArrayList();
        this.mPlayOnlyFold = false;
        this.hash = str;
        this.albumId = j;
        this.duration = j2;
        this.song = str2;
        this.albumName = str3;
        this.albumLogo = str4;
        this.artistId = j3;
        this.data = str5;
        this.singer = str6;
        this.singerIds = str7;
        this.logo = str8;
        this.artistLogo = str9;
        this.lrcData = str10;
        this.musicFrom = i;
        this.oldMusicFrom = i2;
        this.oldCreateTime = j4;
        this.size = i3;
        this.infoNeed = i4;
        this.quality = i5;
        this.uid = str11;
        this.ts = j5;
        this.canPlay = z;
        this.style = str12;
        this.playTime = j6;
        this.creatime = j7;
        this.endTime = j8;
        this.musicFromTitle = str13;
        this.oldMusicFromTitle = str14;
        this.playCount = i6;
        this.infoType = i7;
        this.canFold = z2;
        this.songId = str15;
        this.searchSongText = str16;
        this.isShortListen = bool;
        this.shortDurationS = num;
        this.needVip = z3;
        this.musicSource = str17;
        this.tryFileInfo = tryFileInfo;
        this.listenUrlRefreshTime = j9;
        this.append = z4;
        this.tryPlayable = z5;
        this.playable = z6;
        this.path = str18;
        this.from = i8;
        this.fileList = list;
    }

    public MusicInfo() {
        this.hash = "";
        this.albumId = 0L;
        this.duration = 0L;
        this.artistId = 0L;
        this.singer = "";
        this.singerIds = "";
        this.musicFrom = 0;
        this.oldMusicFrom = 0;
        this.oldCreateTime = 0L;
        this.size = 0;
        this.infoNeed = 0;
        this.uid = "";
        this.playBy = 0;
        this.canPlay = true;
        this.playTime = 0L;
        this.creatime = 0L;
        this.endTime = 0L;
        this.musicFromTitle = "";
        this.oldMusicFromTitle = "";
        this.playCount = 0;
        this.infoType = 0;
        this.canFold = false;
        this.isShortListen = false;
        this.shortDurationS = -1;
        this.tryPlayable = true;
        this.playable = true;
        this.hasCopyright = true;
        this.canUp = true;
        this.btFake = false;
        this.subList = new ArrayList();
        this.playIndex = -1;
        this.mPlayMode = 2;
        this.mIndexList = new ArrayList();
        this.mPlayOnlyFold = false;
    }

    public String getCollectSongId() {
        return this.collectSongId;
    }

    public void setCollectSongId(String str) {
        this.collectSongId = str;
    }

    public boolean isDir() {
        List<MusicInfo> list;
        return this.isDir && (list = this.subList) != null && list.size() > 0;
    }

    public void setDir(boolean z) {
        this.isDir = z;
    }

    public void updateIndexLis() {
        this.mIndexList.clear();
        for (int i = 0; i < this.subList.size(); i++) {
            this.mIndexList.add(Integer.valueOf(i));
        }
        if (this.mPlayMode == 4) {
            Collections.shuffle(this.mIndexList);
        } else {
            Collections.sort(this.mIndexList);
        }
    }

    public void setSubList(List<MusicInfo> list) {
        this.subList.clear();
        this.subList.addAll(list);
        setDir(true);
        for (MusicInfo musicInfo : list) {
            musicInfo.setParentInfo(this);
        }
        updateIndexLis();
    }

    public int getPlayIndex() {
        return this.playIndex;
    }

    public void setPlayIndex(int i) {
        this.playIndex = i;
    }

    public int next() {
        this.playIndex++;
        if (this.playIndex < this.subList.size()) {
            return this.playIndex;
        }
        if (this.mPlayOnlyFold && this.playIndex >= this.subList.size()) {
            this.playIndex = 0;
            return this.playIndex;
        }
        this.playIndex = -1;
        return this.playIndex;
    }

    public int prev() {
        this.playIndex--;
        int i = this.playIndex;
        if (i >= 0) {
            return i;
        }
        if (!this.mPlayOnlyFold || i >= 0) {
            return -1;
        }
        return this.subList.size() - 1;
    }

    public MusicInfo getPlayingInfo() {
        int i = this.playIndex;
        if (i < 0 || i >= this.mIndexList.size()) {
            return null;
        }
        return this.subList.get(this.mIndexList.get(this.playIndex).intValue());
    }

    public MusicInfo getParentInfo() {
        return this.parentInfo;
    }

    public void setParentInfo(MusicInfo musicInfo) {
        this.parentInfo = musicInfo;
    }

    public boolean isNeedVip() {
        return this.needVip;
    }

    public void setNeedVip(boolean z) {
        this.needVip = z;
    }

    public boolean getNeedVip() {
        return this.needVip;
    }

    public List<SongQualityBean.DataBean.SongQuality> getFileList() {
        return this.fileList;
    }

    public String getMusicSource() {
        return this.musicSource;
    }

    public void setMusicSource(String str) {
        this.musicSource = str;
    }

    public void setFileList(List<SongQualityBean.DataBean.SongQuality> list) {
        this.fileList = list;
    }

    public boolean isSupportSQ() {
        List<SongQualityBean.DataBean.SongQuality> list = this.fileList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.fileList.size(); i++) {
                if (this.fileList.get(i).getQuality() == 3 && !TextUtils.isEmpty(this.fileList.get(i).getPlayUrl())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean supportQuality(int i) {
        if (this.fileList != null) {
            for (int i2 = 0; i2 < this.fileList.size(); i2++) {
                if (this.fileList.get(i2).getQuality() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getQualitySize(int i) {
        if (this.fileList != null) {
            for (int i2 = 0; i2 < this.fileList.size(); i2++) {
                if (this.fileList.get(i2).getQuality() == i) {
                    return this.fileList.get(i2).getFileSize();
                }
            }
        }
        return 0;
    }

    public boolean canPlayHighQualityWithoutVip() {
        List<SongQualityBean.DataBean.SongQuality> list = this.fileList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.fileList.size(); i++) {
                if (this.fileList.get(i).getQuality() == 2) {
                    return !this.fileList.get(i).isNeedVip();
                }
            }
        }
        return false;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String str) {
        this.style = str;
    }

    public boolean isCustomAdded() {
        return this.isCustomAdded;
    }

    public void setCustomAdded(boolean z) {
        this.isCustomAdded = z;
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

    public boolean isTryPlayable() {
        return this.tryPlayable;
    }

    public void setTryPlayable(boolean z) {
        this.tryPlayable = z;
    }

    public boolean isPlayable() {
        return this.playable;
    }

    public void setPlayable(boolean z) {
        this.playable = z;
    }

    public int getUnplayableCode() {
        return this.unplayableCode;
    }

    public void setUnplayableCode(int i) {
        this.unplayableCode = i;
    }

    public String getUnplayableMsg() {
        return this.unplayableMsg;
    }

    public void setUnplayableMsg(String str) {
        this.unplayableMsg = str;
    }

    public boolean isHot() {
        return this.hot;
    }

    public void setHot(boolean z) {
        this.hot = z;
    }

    public int getSongPlayTime() {
        return this.songPlayTime;
    }

    public void setSongPlayTime(int i) {
        this.songPlayTime = i;
    }

    public boolean isAppend() {
        return this.append;
    }

    public void setAppend(boolean z) {
        this.append = z;
    }

    public boolean getAppend() {
        return this.append;
    }

    public boolean isHttpCache() {
        return this.httpCache;
    }

    public void setHttpCache(boolean z) {
        this.httpCache = z;
    }

    public boolean getTryPlayable() {
        return this.tryPlayable;
    }

    public boolean getPlayable() {
        return this.playable;
    }

    public boolean isHasParse() {
        return this.hasParse;
    }

    public void setHasParse(boolean z) {
        this.hasParse = z;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public int getFrom() {
        return this.from;
    }

    public void setFrom(int i) {
        this.from = i;
    }
}
