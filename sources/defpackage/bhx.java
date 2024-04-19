package defpackage;

import android.util.Log;
import com.google.protobuf.InvalidProtocolBufferException;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicArtistBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.ShareProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.ShareSongBean;
import com.xiaopeng.musicradio.bean.xpbean.XmArtistBean;
import com.xiaopeng.musicradio.proto.Music;
import com.xiaopeng.musicradio.proto.Netprogram;
import com.xiaopeng.musicradio.proto.Netradio;
import com.xiaopeng.musicradio.proto.Share;
import com.xiaopeng.musicradio.utils.be;
import org.jaudiotagger.tag.id3.AbstractID3v1Tag;
/* compiled from: CommonProtoParser.java */
/* renamed from: bhx  reason: default package */
/* loaded from: classes2.dex */
public class bhx {
    public static MusicInfo a(byte[] bArr) {
        MusicInfo musicInfo;
        Music.MusicInfo parseFrom;
        try {
            parseFrom = Music.MusicInfo.parseFrom(bArr);
            musicInfo = new MusicInfo();
        } catch (Exception e) {
            e = e;
            musicInfo = null;
        }
        try {
            musicInfo.setHash(be.e(parseFrom.getHash()));
            musicInfo.setSong(be.e(parseFrom.getSong()));
            musicInfo.setSinger(be.e(parseFrom.getSinger()));
            musicInfo.setAlbumId(parseFrom.getAlbumId());
            musicInfo.setAlbumLogo(be.e(parseFrom.getAlbumLogo()));
            musicInfo.setLogo(be.e(parseFrom.getLogo()));
            musicInfo.setQuality(parseFrom.getQuality());
            musicInfo.setMusicFrom(parseFrom.getMusicFrom());
            musicInfo.setArtistId(parseFrom.getArtistId());
            musicInfo.setSongId(parseFrom.getSongId());
        } catch (Exception e2) {
            e = e2;
            LogUtils.e(AbstractID3v1Tag.TAG, "pauseMusicInfo:" + e.getLocalizedMessage());
            return musicInfo;
        }
        return musicInfo;
    }

    public static MusicSongBean b(byte[] bArr) {
        MusicSongBean musicSongBean;
        Music.MusicInfo parseFrom;
        try {
            parseFrom = Music.MusicInfo.parseFrom(bArr);
            musicSongBean = new MusicSongBean();
        } catch (Exception e) {
            e = e;
            musicSongBean = null;
        }
        try {
            MusicArtistBean musicArtistBean = new MusicArtistBean();
            musicArtistBean.setName(be.e(parseFrom.getSinger()));
            MusicAlbumBean musicAlbumBean = new MusicAlbumBean();
            musicAlbumBean.setName(be.e(parseFrom.getAlbumName()));
            musicAlbumBean.setLogo(be.e(parseFrom.getAlbumLogo()));
            musicAlbumBean.setId(parseFrom.getAlbumId());
            musicSongBean.setSongName(be.e(parseFrom.getSong()));
            musicSongBean.setHash(be.e(parseFrom.getHash()));
            musicSongBean.setHot(parseFrom.getHot());
            musicSongBean.setNeedVip(parseFrom.getNeedVip());
            musicSongBean.setSongId(parseFrom.getSongId());
            musicSongBean.setAlbum(musicAlbumBean);
            musicSongBean.setArtist(musicArtistBean);
        } catch (Exception e2) {
            e = e2;
            LogUtils.e("CommonProtoParser", "pauseMusicSongBean:" + e.getLocalizedMessage());
            return musicSongBean;
        }
        return musicSongBean;
    }

    public static MusicAlbumBean c(byte[] bArr) {
        MusicAlbumBean musicAlbumBean;
        try {
            Music.MusicAlbum parseFrom = Music.MusicAlbum.parseFrom(bArr);
            musicAlbumBean = new MusicAlbumBean();
            try {
                musicAlbumBean.setName(be.e(parseFrom.getTitle()));
                musicAlbumBean.setLogo(be.e(parseFrom.getLogoUrl()));
                musicAlbumBean.setId(parseFrom.getId());
            } catch (InvalidProtocolBufferException e) {
                e = e;
                e.printStackTrace();
                Log.e("CommonProtoParser", "pauseMusicAlbumBean: " + e.getMessage());
                return musicAlbumBean;
            }
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            musicAlbumBean = null;
        }
        return musicAlbumBean;
    }

    public static MixSearchResultBean.CollectBean d(byte[] bArr) {
        MixSearchResultBean.CollectBean collectBean;
        try {
            Music.MusicAlbum parseFrom = Music.MusicAlbum.parseFrom(bArr);
            collectBean = new MixSearchResultBean.CollectBean();
            try {
                collectBean.setName(be.e(parseFrom.getTitle()));
                collectBean.setLogo(be.e(parseFrom.getLogoUrl()));
                collectBean.setId(parseFrom.getId());
            } catch (InvalidProtocolBufferException e) {
                e = e;
                e.printStackTrace();
                Log.e("CommonProtoParser", "pauseCollectBean: " + e.getMessage());
                return collectBean;
            }
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            collectBean = null;
        }
        return collectBean;
    }

    public static MusicRadioItem e(byte[] bArr) {
        MusicRadioItem musicRadioItem;
        Music.MusicAlbum parseFrom;
        try {
            parseFrom = Music.MusicAlbum.parseFrom(bArr);
            musicRadioItem = new MusicRadioItem();
        } catch (Exception e) {
            e = e;
            musicRadioItem = null;
        }
        try {
            musicRadioItem.setId(parseFrom.getId());
            musicRadioItem.setType(be.e(parseFrom.getType()));
            musicRadioItem.setLogoUrl(be.e(parseFrom.getLogoUrl()));
            musicRadioItem.setTitle(be.e(parseFrom.getTitle()));
            musicRadioItem.setName(be.e(parseFrom.getTitle()));
            musicRadioItem.setLogo(be.e(parseFrom.getLogoUrl()));
        } catch (Exception e2) {
            e = e2;
            LogUtils.e(AbstractID3v1Tag.TAG, "pauseMusicRadioItem:" + e.getLocalizedMessage());
            return musicRadioItem;
        }
        return musicRadioItem;
    }

    public static NetRadioInfo f(byte[] bArr) {
        NetRadioInfo netRadioInfo;
        try {
            Netradio.NetRadioInfo parseFrom = Netradio.NetRadioInfo.parseFrom(bArr);
            Netradio.NetRadioProgramInfo playingInfo = parseFrom.getPlayingInfo();
            NetRadioProgramInfo netRadioProgramInfo = new NetRadioProgramInfo();
            netRadioProgramInfo.setId(playingInfo.getId());
            netRadioProgramInfo.setName(be.e(playingInfo.getName()));
            netRadioProgramInfo.setPlayUrl(be.e(playingInfo.getPlayUrl()));
            netRadioInfo = new NetRadioInfo();
            try {
                netRadioInfo.setId(parseFrom.getId());
                netRadioInfo.setName(be.e(parseFrom.getName()));
                netRadioInfo.setPicUrl(be.e(parseFrom.getPicUrl()));
                netRadioInfo.setUpdateTime(parseFrom.getUpdateTime());
                netRadioInfo.setHz(Double.parseDouble(parseFrom.getHz()));
                netRadioInfo.setAreaCode(be.e(parseFrom.getAreaCode()));
                netRadioInfo.setPlayCount(parseFrom.getPlayCount());
                netRadioInfo.setPlayUrl(be.e(parseFrom.getPlayUrl()));
                netRadioInfo.setPlayingInfo(netRadioProgramInfo);
            } catch (Exception e) {
                e = e;
                LogUtils.e(AbstractID3v1Tag.TAG, "pauseNetRadioInfo:" + e.getLocalizedMessage());
                return netRadioInfo;
            }
        } catch (Exception e2) {
            e = e2;
            netRadioInfo = null;
        }
        return netRadioInfo;
    }

    public static RdAlbumBean g(byte[] bArr) {
        RdAlbumBean rdAlbumBean;
        Netprogram.AlbumBean parseFrom;
        XmArtistBean xmArtistBean;
        try {
            parseFrom = Netprogram.AlbumBean.parseFrom(bArr);
            Netprogram.Artist artist = parseFrom.getArtist();
            xmArtistBean = new XmArtistBean();
            xmArtistBean.setId(artist.getId());
            xmArtistBean.setName(be.e(artist.getName()));
            rdAlbumBean = new RdAlbumBean();
        } catch (Exception e) {
            e = e;
            rdAlbumBean = null;
        }
        try {
            rdAlbumBean.setId(parseFrom.getId());
            rdAlbumBean.setTitle(be.e(parseFrom.getTitle()));
            rdAlbumBean.setSmallLogo(be.e(parseFrom.getSmallLogo()));
            rdAlbumBean.setMediumLogo(be.e(parseFrom.getMediumLogo()));
            rdAlbumBean.setLargeLogo(be.e(parseFrom.getLargeLogo()));
            rdAlbumBean.setUpdateTime(parseFrom.getUpdateTime());
            rdAlbumBean.setCategoryName(be.e(parseFrom.getCategoryName()));
            rdAlbumBean.setPlayCount(parseFrom.getPlayCount());
            rdAlbumBean.setPaymentType(parseFrom.getPaymentType());
            rdAlbumBean.setAuthorized(parseFrom.getAuthorized());
            rdAlbumBean.setArtist(xmArtistBean);
            rdAlbumBean.setAuthorized(parseFrom.getAuthorized());
        } catch (Exception e2) {
            e = e2;
            LogUtils.e(AbstractID3v1Tag.TAG, "pauseRdAlbumBean:" + e.getLocalizedMessage());
            return rdAlbumBean;
        }
        return rdAlbumBean;
    }

    public static ShareSongBean h(byte[] bArr) {
        ShareSongBean shareSongBean;
        Share.ShareMusicInfo parseFrom;
        try {
            parseFrom = Share.ShareMusicInfo.parseFrom(bArr);
            shareSongBean = new ShareSongBean();
        } catch (Exception e) {
            e = e;
            shareSongBean = null;
        }
        try {
            shareSongBean.setHash(be.e(parseFrom.getHash()));
            shareSongBean.setAlbumId(parseFrom.getAlbumId());
            shareSongBean.setSource(parseFrom.getSource());
            shareSongBean.setVehicleType(be.e(parseFrom.getVehicleType()));
            shareSongBean.setContent(be.e(parseFrom.getContent()));
        } catch (Exception e2) {
            e = e2;
            LogUtils.e(AbstractID3v1Tag.TAG, "pauseShareSongInfo: " + e.getLocalizedMessage());
            return shareSongBean;
        }
        return shareSongBean;
    }

    public static ShareProgramBean i(byte[] bArr) {
        ShareProgramBean shareProgramBean;
        try {
            Share.ShareProgramInfo parseFrom = Share.ShareProgramInfo.parseFrom(bArr);
            shareProgramBean = new ShareProgramBean();
            try {
                shareProgramBean.setAlbumId(parseFrom.getAlbumId());
                shareProgramBean.setVehicleType(parseFrom.getVehicleType());
                shareProgramBean.setContent(parseFrom.getContent());
            } catch (Exception e) {
                e = e;
                LogUtils.e(AbstractID3v1Tag.TAG, "pauseShareProgramInfo: " + e.getLocalizedMessage());
                return shareProgramBean;
            }
        } catch (Exception e2) {
            e = e2;
            shareProgramBean = null;
        }
        return shareProgramBean;
    }
}
