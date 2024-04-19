package defpackage;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioTagInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.SongQualityBean;
import com.xiaopeng.musicradio.bean.xpbean.XmArtistBean;
import com.xiaopeng.musicradio.proto.Music;
import com.xiaopeng.musicradio.proto.Netprogram;
import com.xiaopeng.musicradio.proto.Netradio;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.be;
/* compiled from: CommonProtoFactory.java */
/* renamed from: bhw  reason: default package */
/* loaded from: classes2.dex */
public class bhw {
    public static Music.MusicInfo a(MusicInfo musicInfo) {
        boolean z = true;
        boolean z2 = musicInfo.getMusicFrom() == 61 || (au.a() && !TextUtils.isEmpty(musicInfo.getHash()) && musicInfo.getHash().startsWith(ListSignBean.LOCAL_PREFIX));
        Music.MusicInfo.a h = Music.MusicInfo.newBuilder().a(be.e(musicInfo.getHash())).c(be.e(musicInfo.getSong())).b(be.e(musicInfo.getSinger())).a(musicInfo.getAlbumId()).d(be.e(musicInfo.getAlbumName())).e(be.e(musicInfo.getAlbumLogo())).f(be.e(musicInfo.getLogo())).b(musicInfo.getQuality()).a(musicInfo.getMusicFrom()).b(musicInfo.getArtistId()).g(be.e(musicInfo.getSongId())).a(((arf) c.a().b(arf.class)).isLove(musicInfo)).c(z2).b(musicInfo.getNeedVip()).d((musicInfo.isSupportSQ() && aqh.a().f()) ? false : false).h(be.e(musicInfo.getUnplayableMsg()));
        if (musicInfo.getFileList() != null) {
            for (int i = 0; i < musicInfo.getFileList().size(); i++) {
                SongQualityBean.DataBean.SongQuality songQuality = musicInfo.getFileList().get(i);
                h.a(Music.SongQuality.newBuilder().a(be.e(songQuality.getHash())).a(songQuality.getFileSize()).a(songQuality.isNeedVip()).b(be.e(songQuality.getPlayUrl())).b(songQuality.getPrivilege()).c(songQuality.getQuality()).build());
            }
        }
        return h.build();
    }

    public static Music.MusicInfo a(MusicSongBean musicSongBean) {
        Music.MusicInfo.a newBuilder = Music.MusicInfo.newBuilder();
        if (musicSongBean.getFileList() != null) {
            for (int i = 0; i < musicSongBean.getFileList().size(); i++) {
                SongQualityBean.DataBean.SongQuality songQuality = musicSongBean.getFileList().get(i);
                newBuilder.a(Music.SongQuality.newBuilder().a(be.e(songQuality.getHash())).a(songQuality.getFileSize()).a(songQuality.isNeedVip()).b(be.e(songQuality.getPlayUrl())).b(songQuality.getPrivilege()).c(songQuality.getQuality()).build());
            }
        }
        newBuilder.c(be.e(musicSongBean.getSongName())).a(be.e(musicSongBean.getHash())).a(musicSongBean.isHot()).b(musicSongBean.isNeedVip()).d(musicSongBean.getSupportSq().booleanValue()).g(be.e(musicSongBean.getSongId())).a(musicSongBean.getAlbum().getId()).d(be.e(musicSongBean.getAlbum().getName())).e(be.e(musicSongBean.getAlbum().getLogo())).b(be.e(musicSongBean.getArtist().getName())).h(be.e(musicSongBean.getUnplayableMsg()));
        return newBuilder.build();
    }

    public static Music.MusicAlbum a(MusicRadioItem musicRadioItem) {
        return Music.MusicAlbum.newBuilder().a(musicRadioItem.getId()).a(be.e(musicRadioItem.getType())).c(be.e(musicRadioItem.getLogoUrl())).b(be.e(musicRadioItem.getTitle())).d(be.e(musicRadioItem.getDescription())).build();
    }

    public static Netradio.NetRadioInfo a(NetRadioInfo netRadioInfo) {
        NetRadioProgramInfo playingInfo = netRadioInfo.getPlayingInfo();
        return Netradio.NetRadioInfo.newBuilder().a(netRadioInfo.getId()).a(be.e(netRadioInfo.getName())).b(be.e(netRadioInfo.getPicUrl())).a(netRadioInfo.getUpdateTime()).c(be.e(String.valueOf(netRadioInfo.getHz()))).d(be.e(netRadioInfo.getAreaCode())).b(netRadioInfo.getPlayCount()).e(be.e(netRadioInfo.getPlayUrl())).a(Netradio.NetRadioProgramInfo.newBuilder().a(playingInfo.getId()).a(be.e(playingInfo.getName())).b(be.e(playingInfo.getPlayUrl())).build()).build();
    }

    public static Netradio.NetRadioTagInfo a(NetRadioTagInfo netRadioTagInfo) {
        return Netradio.NetRadioTagInfo.newBuilder().a(netRadioTagInfo.getBizVal()).a(be.e(netRadioTagInfo.getName())).b(be.e(netRadioTagInfo.getCover())).c(be.e(netRadioTagInfo.getNightCover())).build();
    }

    public static Netprogram.AlbumBean a(RdAlbumBean rdAlbumBean) {
        XmArtistBean artist = rdAlbumBean.getArtist();
        return Netprogram.AlbumBean.newBuilder().a(rdAlbumBean.getId()).a(be.e(rdAlbumBean.getIntro())).b(be.e(rdAlbumBean.getShortIntro())).c(be.e(rdAlbumBean.getTitle())).g(be.e(rdAlbumBean.getSmallLogo())).e(be.e(rdAlbumBean.getMediumLogo())).d(be.e(rdAlbumBean.getLargeLogo())).c(rdAlbumBean.getUpdateTime()).f(be.e(rdAlbumBean.getCategoryName())).b(rdAlbumBean.getPlayCount()).a(rdAlbumBean.getPaymentType()).a(rdAlbumBean.isAuthorized()).a(Netprogram.Artist.newBuilder().a(artist.getId()).a(be.e(artist.getName())).build()).build();
    }
}
