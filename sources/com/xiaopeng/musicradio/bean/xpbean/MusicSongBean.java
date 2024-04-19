package com.xiaopeng.musicradio.bean.xpbean;

import android.text.SpannableStringBuilder;
import com.google.gson.annotations.Expose;
import com.xiaopeng.musicradio.bean.xpbean.SongQualityBean;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class MusicSongBean implements Serializable {
    private static final long serialVersionUID = 51;
    private MusicAlbumBean album;
    private MusicArtistBean artist;
    private boolean canDownload;
    private boolean canPlay;
    private List<SongQualityBean.DataBean.SongQuality> fileList;
    private int from;
    private String hash;
    private boolean hot;
    private String listenFile;
    private String lyricContent;
    private String lyricFile;
    private String lyricType;
    @Expose(deserialize = false, serialize = false)
    private SpannableStringBuilder mHighlightSongName;
    @Expose(deserialize = false, serialize = false)
    private SpannableStringBuilder mHightlightSinger;
    @Expose(deserialize = false, serialize = false)
    private Boolean mSupportSq;
    private boolean needVip;
    private String path;
    private String singerIds;
    private String singers;
    private String songId;
    private String songName;
    private int songPlayTime;
    private String style;
    private TryFileInfo tryFileInfo;
    private int unplayableCode;
    private String unplayableMsg;
    private boolean tryPlayable = true;
    private boolean playable = true;

    public MusicAlbumBean getAlbum() {
        return this.album;
    }

    public void setAlbum(MusicAlbumBean musicAlbumBean) {
        this.album = musicAlbumBean;
    }

    public MusicArtistBean getArtist() {
        return this.artist;
    }

    public void setArtist(MusicArtistBean musicArtistBean) {
        this.artist = musicArtistBean;
    }

    public boolean isCanDownload() {
        return this.canDownload;
    }

    public void setCanDownload(boolean z) {
        this.canDownload = z;
    }

    public String getListenFile() {
        return this.listenFile;
    }

    public void setListenFile(String str) {
        this.listenFile = str;
    }

    public String getLyricContent() {
        return this.lyricContent;
    }

    public void setLyricContent(String str) {
        this.lyricContent = str;
    }

    public boolean isCanPlay() {
        return this.canPlay;
    }

    public void setCanPlay(boolean z) {
        this.canPlay = z;
    }

    public String getLyricFile() {
        return this.lyricFile;
    }

    public void setLyricFile(String str) {
        this.lyricFile = str;
    }

    public String getLyricType() {
        return this.lyricType;
    }

    public void setLyricType(String str) {
        this.lyricType = str;
    }

    public String getSingers() {
        return this.singers;
    }

    public void setSingers(String str) {
        this.singers = str;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String str) {
        this.hash = str;
    }

    public String getSongName() {
        return this.songName;
    }

    public void setSongName(String str) {
        this.songName = str;
    }

    private boolean supportSq(List<SongQualityBean.DataBean.SongQuality> list) {
        if (list != null) {
            for (SongQualityBean.DataBean.SongQuality songQuality : list) {
                if (songQuality.getQuality() == 3) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public Boolean getSupportSq() {
        if (this.mSupportSq == null) {
            this.mSupportSq = Boolean.valueOf(supportSq(this.fileList));
        }
        return Boolean.valueOf(this.mSupportSq.booleanValue());
    }

    public String getSongId() {
        return this.songId;
    }

    public void setSongId(String str) {
        this.songId = str;
    }

    public String getSingerIds() {
        return this.singerIds;
    }

    public void setSingerIds(String str) {
        this.singerIds = str;
    }

    public boolean isNeedVip() {
        return this.needVip;
    }

    public void setNeedVip(boolean z) {
        this.needVip = z;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String str) {
        this.style = str;
    }

    public List<SongQualityBean.DataBean.SongQuality> getFileList() {
        return this.fileList;
    }

    public void setFileList(List<SongQualityBean.DataBean.SongQuality> list) {
        this.fileList = list;
    }

    public SpannableStringBuilder getHighlightSongName() {
        return this.mHighlightSongName;
    }

    public void setHighlightSongName(SpannableStringBuilder spannableStringBuilder) {
        this.mHighlightSongName = spannableStringBuilder;
    }

    public SpannableStringBuilder getHightlightSinger() {
        return this.mHightlightSinger;
    }

    public void setHightlightSinger(SpannableStringBuilder spannableStringBuilder) {
        this.mHightlightSinger = spannableStringBuilder;
    }

    public TryFileInfo getTryFileInfo() {
        return this.tryFileInfo;
    }

    public void setTryFileInfo(TryFileInfo tryFileInfo) {
        this.tryFileInfo = tryFileInfo;
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

    public boolean equals(Object obj) {
        if (obj instanceof MusicSongBean) {
            MusicSongBean musicSongBean = (MusicSongBean) obj;
            if (musicSongBean.getHash() != null && musicSongBean.getHash().equalsIgnoreCase(getHash()) && musicSongBean.getAlbum() != null && getAlbum() != null && musicSongBean.getAlbum().getId() == getAlbum().getId()) {
                return true;
            }
        }
        return super.equals(obj);
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MusicSongBean{artist=");
        MusicArtistBean musicArtistBean = this.artist;
        sb.append(musicArtistBean != null ? musicArtistBean.getName() : "");
        sb.append(", canPlay=");
        sb.append(this.canPlay);
        sb.append(", hash=");
        sb.append(this.hash);
        sb.append(", songName='");
        sb.append(this.songName);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
