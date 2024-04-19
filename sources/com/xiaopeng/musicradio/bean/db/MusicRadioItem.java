package com.xiaopeng.musicradio.bean.db;

import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class MusicRadioItem implements Serializable {
    private static final long serialVersionUID = 42;
    private String albumDesc;
    private long artistId;
    private Long cacheId;
    private long cacheTime;
    private long categoryId;
    private String clickType;
    private String coverUrl;
    private boolean deleted;
    private String description;
    private MusicSongBean firstSongInfoBo;
    private transient String group;
    private transient int groupIndex;
    private String iconUrl;
    private long id;
    private String imgUrl;
    private boolean isFavourite;
    private boolean isShowLoading;
    private String logo;
    private String logoUrl;
    private String name;
    private boolean needVip;
    private String nightIconUrl;
    private String nowLogoUrl;
    private long nowTime;
    private int playState;
    private String preLogoUrl;
    private long preTime;
    private long rankId;
    private String rankName;
    private int rankType;
    private String sheetName;
    private String sheetType;
    private long showTime;
    private String singer;
    private List<SongInfo> songInfos;
    private String songName;
    private long sysUid;
    private String tag;
    private String title;
    private String type;
    private String uid;

    public MusicRadioItem() {
        this.uid = "";
        this.groupIndex = -1;
        this.singer = "";
        this.songName = "";
        this.coverUrl = "";
        this.playState = -1;
        this.isShowLoading = false;
        this.deleted = false;
        this.description = "";
        this.albumDesc = "";
    }

    public MusicRadioItem(Long l, long j, String str, long j2, long j3, String str2, String str3, String str4, String str5, long j4, long j5, String str6, String str7, String str8, String str9, String str10, MusicSongBean musicSongBean, String str11, String str12, long j6, String str13, String str14, int i, List<SongInfo> list, boolean z, String str15, String str16, String str17, long j7, long j8, String str18, String str19, int i2) {
        this.uid = "";
        this.groupIndex = -1;
        this.singer = "";
        this.songName = "";
        this.coverUrl = "";
        this.playState = -1;
        this.isShowLoading = false;
        this.deleted = false;
        this.description = "";
        this.albumDesc = "";
        this.cacheId = l;
        this.sysUid = j;
        this.uid = str;
        this.cacheTime = j2;
        this.id = j3;
        this.logoUrl = str2;
        this.iconUrl = str3;
        this.nightIconUrl = str4;
        this.tag = str5;
        this.categoryId = j4;
        this.artistId = j5;
        this.title = str6;
        this.type = str7;
        this.singer = str8;
        this.songName = str9;
        this.coverUrl = str10;
        this.firstSongInfoBo = musicSongBean;
        this.logo = str11;
        this.name = str12;
        this.rankId = j6;
        this.rankName = str13;
        this.imgUrl = str14;
        this.rankType = i;
        this.songInfos = list;
        this.needVip = z;
        this.clickType = str15;
        this.sheetType = str16;
        this.sheetName = str17;
        this.preTime = j7;
        this.nowTime = j8;
        this.preLogoUrl = str18;
        this.nowLogoUrl = str19;
        this.playState = i2;
    }

    public Long getCacheId() {
        return this.cacheId;
    }

    public void setCacheId(Long l) {
        this.cacheId = l;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public void setLogoUrl(String str) {
        this.logoUrl = str;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public int getGroupIndex() {
        return this.groupIndex;
    }

    public void setGroupIndex(int i) {
        this.groupIndex = i;
    }

    public long getArtistId() {
        return this.artistId;
    }

    public void setArtistId(long j) {
        this.artistId = j;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(long j) {
        this.categoryId = j;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        this.id = j;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getSinger() {
        return this.singer;
    }

    public void setSinger(String str) {
        this.singer = str;
    }

    public String getSongName() {
        return this.songName;
    }

    public void setSongName(String str) {
        this.songName = str;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public String getNightIconUrl() {
        return this.nightIconUrl;
    }

    public void setNightIconUrl(String str) {
        this.nightIconUrl = str;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public MusicSongBean getFirstSongInfoBo() {
        return this.firstSongInfoBo;
    }

    public void setFirstSongInfoBo(MusicSongBean musicSongBean) {
        this.firstSongInfoBo = musicSongBean;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public long getRankId() {
        return this.rankId;
    }

    public void setRankId(long j) {
        this.rankId = j;
    }

    public String getRankName() {
        return this.rankName;
    }

    public void setRankName(String str) {
        this.rankName = str;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String str) {
        this.imgUrl = str;
    }

    public int getRankType() {
        return this.rankType;
    }

    public void setRankType(int i) {
        this.rankType = i;
    }

    public List<SongInfo> getSongInfos() {
        return this.songInfos;
    }

    public void setSongInfos(ArrayList<SongInfo> arrayList) {
        this.songInfos = arrayList;
    }

    public String getClickType() {
        return this.clickType;
    }

    public void setClickType(String str) {
        this.clickType = str;
    }

    public String getSheetType() {
        return this.sheetType;
    }

    public void setSheetType(String str) {
        this.sheetType = str;
    }

    public String getSheetName() {
        return this.sheetName;
    }

    public void setSheetName(String str) {
        this.sheetName = str;
    }

    public boolean isNeedVip() {
        return this.needVip;
    }

    public void setNeedVip(boolean z) {
        this.needVip = z;
    }

    public boolean isFavourite() {
        return this.isFavourite;
    }

    public void setFavourite(boolean z) {
        this.isFavourite = z;
    }

    public long getPreTime() {
        return this.preTime;
    }

    public void setPreTime(long j) {
        this.preTime = j;
    }

    public long getNowTime() {
        return this.nowTime;
    }

    public void setNowTime(long j) {
        this.nowTime = j;
    }

    public String getPreLogoUrl() {
        return this.preLogoUrl;
    }

    public void setPreLogoUrl(String str) {
        this.preLogoUrl = str;
    }

    public String getNowLogoUrl() {
        return this.nowLogoUrl;
    }

    public void setNowLogoUrl(String str) {
        this.nowLogoUrl = str;
    }

    public int getPlayState() {
        return this.playState;
    }

    public void setPlayState(int i) {
        this.playState = i;
    }

    public boolean equals(Object obj) {
        MusicRadioItem musicRadioItem = (MusicRadioItem) obj;
        if (musicRadioItem.id == this.id && musicRadioItem.type.equals(this.type)) {
            return true;
        }
        return super.equals(obj);
    }

    public String toString() {
        return "MusicRadioItem{logoUrl='" + this.logoUrl + "', iconUrl='" + this.iconUrl + "', nightIconUrl='" + this.nightIconUrl + "', tag='" + this.tag + "', categoryId=" + this.categoryId + ", group='" + this.group + "', groupIndex=" + this.groupIndex + ", artistId=" + this.artistId + ", title='" + this.title + "', id=" + this.id + ", type='" + this.type + "', singer='" + this.singer + "', songName='" + this.songName + "', coverUrl='" + this.coverUrl + "', firstSongInfoBo=" + this.firstSongInfoBo + ", logo='" + this.logo + "', name='" + this.name + "', rankId=" + this.rankId + ", rankName='" + this.rankName + "', imgUrl='" + this.imgUrl + "', rankType=" + this.rankType + ", songInfos=" + this.songInfos + ", needVip=" + this.needVip + ", clickType='" + this.clickType + "', sheetType='" + this.sheetType + "', sheetName='" + this.sheetName + "', isFavourite=" + this.isFavourite + ", preTime=" + this.preTime + ", nowTime=" + this.nowTime + ", preLogoUrl='" + this.preLogoUrl + "', nowLogoUrl='" + this.nowLogoUrl + "', playState=" + this.playState + '}';
    }

    /* loaded from: classes.dex */
    public static class SongInfo implements Serializable {
        private static final long serialVersionUID = 43;
        private String songName;

        public String getSongName() {
            return this.songName;
        }

        public void setSongName(String str) {
            this.songName = str;
        }
    }

    public boolean isShowLoading() {
        return this.isShowLoading;
    }

    public void setShowLoading(boolean z) {
        this.isShowLoading = z;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean z) {
        this.deleted = z;
    }

    public boolean getNeedVip() {
        return this.needVip;
    }

    public void setSongInfos(List<SongInfo> list) {
        this.songInfos = list;
    }

    public long getSysUid() {
        return this.sysUid;
    }

    public void setSysUid(long j) {
        this.sysUid = j;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public long getCacheTime() {
        return this.cacheTime;
    }

    public void setCacheTime(long j) {
        this.cacheTime = j;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public long getShowTime() {
        return this.showTime;
    }

    public void setShowTime(long j) {
        this.showTime = j;
    }

    public String getAlbumDesc() {
        return this.albumDesc;
    }

    public void setAlbumDesc(String str) {
        this.albumDesc = str;
    }
}
