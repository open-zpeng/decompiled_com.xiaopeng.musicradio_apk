package com.xiaopeng.musicradio.bean.xpbean;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/* loaded from: classes.dex */
public class SongBean {
    @SerializedName("album")
    private MusicAlbumBean mAlbum;
    @SerializedName("artist")
    private ArtistBean mArtist;
    @SerializedName("canPlay")
    private boolean mCanPlay;
    @SerializedName("fileList")
    private List<FileInfoBean> mFileList;
    @SerializedName("hash")
    private String mHash;
    @SerializedName("listenFile")
    private String mListenFile;
    @SerializedName("lyricContent")
    private String mLyricContent;
    @SerializedName("needVip")
    private boolean mNeedVip;
    @SerializedName("singers")
    private String mSingers;
    @SerializedName("songName")
    private String mSongName;
    @SerializedName(TtmlNode.TAG_STYLE)
    private String mStyle;

    public String getSongName() {
        return this.mSongName;
    }

    public String getSingers() {
        return this.mSingers;
    }

    public String getListenFile() {
        return this.mListenFile;
    }

    public boolean isNeedVip() {
        return this.mNeedVip;
    }

    public ArtistBean getArtist() {
        return this.mArtist;
    }

    public MusicAlbumBean getAlbum() {
        return this.mAlbum;
    }

    public boolean isCanPlay() {
        return this.mCanPlay;
    }

    public String getStyle() {
        return this.mStyle;
    }

    public String getLyricContent() {
        return this.mLyricContent;
    }

    public String getHash() {
        return this.mHash;
    }

    public List<FileInfoBean> getFileList() {
        return this.mFileList;
    }

    /* loaded from: classes.dex */
    public class ArtistBean {
        @SerializedName("id")
        private int mId;
        @SerializedName("logo")
        private String mLogo;
        @SerializedName("name")
        private String mName;

        public ArtistBean() {
        }

        public String getName() {
            return this.mName;
        }

        public String getLogo() {
            return this.mLogo;
        }

        public int getId() {
            return this.mId;
        }
    }

    /* loaded from: classes.dex */
    public class FileInfoBean {
        @SerializedName("fileSize")
        private int mFileSize;
        @SerializedName("hash")
        private String mHash;
        @SerializedName("needVip")
        private boolean mNeedVip;
        @SerializedName("privilege")
        private int mPrivilege;
        @SerializedName("quality")
        private int mQuality;

        public FileInfoBean() {
        }

        public String getHash() {
            return this.mHash;
        }

        public int getFileSize() {
            return this.mFileSize;
        }

        public int getPrivilege() {
            return this.mPrivilege;
        }

        public int getQuality() {
            return this.mQuality;
        }

        public boolean isNeedVip() {
            return this.mNeedVip;
        }
    }
}
