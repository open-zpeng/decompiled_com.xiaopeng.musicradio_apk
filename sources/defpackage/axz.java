package defpackage;

import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import java.util.List;
/* compiled from: ISearchAdapterCallback.java */
/* renamed from: axz  reason: default package */
/* loaded from: classes2.dex */
public interface axz {
    int a(String str, long j);

    void a(long j, String str, String str2);

    void a(NetRadioInfo netRadioInfo);

    void a(MusicSongBean musicSongBean);

    void a(MusicSongBean musicSongBean, List<MusicSongBean> list, int i);

    void a(RdAlbumBean rdAlbumBean);

    boolean a(long j);

    boolean a(long j, String str);

    void b(long j, String str);

    void b(long j, String str, String str2);

    void b(MusicSongBean musicSongBean);

    void b(RdAlbumBean rdAlbumBean);

    void c(long j, String str, String str2);

    boolean c(long j, String str);

    boolean c(MusicSongBean musicSongBean);

    boolean k_(int i);
}
