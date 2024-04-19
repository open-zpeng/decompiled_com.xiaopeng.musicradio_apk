package defpackage;

import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.proto.Mine;
import com.xiaopeng.musicradio.proto.Music;
import com.xiaopeng.musicradio.proto.Netprogram;
import com.xiaopeng.musicradio.proto.Netradio;
import java.util.List;
/* compiled from: MineProtoFactory.java */
/* renamed from: amb  reason: default package */
/* loaded from: classes2.dex */
public class amb {
    private static Music.MusicInfo a(MusicInfo musicInfo) {
        return bhw.a(musicInfo);
    }

    private static Music.MusicAlbum a(MusicRadioItem musicRadioItem) {
        return bhw.a(musicRadioItem);
    }

    private static Netradio.NetRadioInfo a(NetRadioInfo netRadioInfo) {
        return bhw.a(netRadioInfo);
    }

    public static Netprogram.AlbumBean a(RdAlbumBean rdAlbumBean) {
        return bhw.a(rdAlbumBean);
    }

    public static AbstractMessageLite a(String str, boolean z, boolean z2, boolean z3, List list, int i) {
        if (str.contains("MusicActivity")) {
            return a(z, z2, z3, list, i);
        }
        if (str.contains("AlbumActivity") || str.contains("PlaylistView")) {
            return d(z, z2, z3, list);
        }
        if (str.contains("ProgramActivity")) {
            return c(z, z2, z3, list);
        }
        if (str.contains("NetRadioActivity")) {
            return b(z, z2, z3, list);
        }
        return null;
    }

    public static AbstractMessageLite a(boolean z, boolean z2, boolean z3, List<MusicInfo> list) {
        Mine.MineMusicResp.a c = Mine.MineMusicResp.newBuilder().a(z).b(z2).c(z3);
        for (MusicInfo musicInfo : list) {
            c.a(a(musicInfo));
        }
        return c.build();
    }

    public static AbstractMessageLite a(boolean z, boolean z2, boolean z3, List<MusicInfo> list, int i) {
        Mine.MineMusicResp.a a = Mine.MineMusicResp.newBuilder().a(z).b(z2).c(z3).a(i);
        for (MusicInfo musicInfo : list) {
            a.a(a(musicInfo));
        }
        return a.build();
    }

    public static AbstractMessageLite b(boolean z, boolean z2, boolean z3, List<NetRadioInfo> list) {
        Mine.MineNetRadioResp.a c = Mine.MineNetRadioResp.newBuilder().a(z).b(z2).c(z3);
        for (NetRadioInfo netRadioInfo : list) {
            c.a(a(netRadioInfo));
        }
        return c.build();
    }

    public static AbstractMessageLite c(boolean z, boolean z2, boolean z3, List<RdAlbumBean> list) {
        Mine.MineProgramResp.a c = Mine.MineProgramResp.newBuilder().a(z).b(z2).c(z3);
        for (RdAlbumBean rdAlbumBean : list) {
            c.a(a(rdAlbumBean));
        }
        return c.build();
    }

    public static AbstractMessageLite d(boolean z, boolean z2, boolean z3, List<MusicRadioItem> list) {
        Mine.MineAlbumResp.a c = Mine.MineAlbumResp.newBuilder().a(z).b(z2).c(z3);
        for (MusicRadioItem musicRadioItem : list) {
            c.a(a(musicRadioItem));
        }
        return c.build();
    }

    public static AbstractMessageLite a(MusicInfo musicInfo, boolean z) {
        return Mine.MineMusicLoveResp.newBuilder().a(a(musicInfo)).a(z).build();
    }

    public static AbstractMessageLite a(MusicRadioItem musicRadioItem, boolean z) {
        return Mine.MineAlbumLoveResp.newBuilder().a(a(musicRadioItem)).a(z).build();
    }

    public static AbstractMessageLite a(RdAlbumBean rdAlbumBean, boolean z) {
        return Mine.MineProgramLoveResp.newBuilder().a(a(rdAlbumBean)).a(z).build();
    }

    public static AbstractMessageLite a(NetRadioInfo netRadioInfo, boolean z) {
        return Mine.MineNetRadioLoveResp.newBuilder().a(a(netRadioInfo)).a(z).build();
    }

    public static AbstractMessageLite a(boolean z) {
        return Mine.MineLoginEvent.newBuilder().a(z).build();
    }

    public static AbstractMessageLite a(String str, long j, boolean z) {
        return Mine.MineMusicLoveEvent.newBuilder().a(str).a(j).a(z).build();
    }

    public static AbstractMessageLite a(long j, boolean z) {
        return Mine.MineAlbumLoveEvent.newBuilder().a(j).a(z).build();
    }

    public static AbstractMessageLite b(long j, boolean z) {
        return Mine.MineReadLoveEvent.newBuilder().a(j).a(z).build();
    }

    public static AbstractMessageLite c(long j, boolean z) {
        return Mine.MineNetRadioLoveEvent.newBuilder().a(j).a(z).build();
    }
}
