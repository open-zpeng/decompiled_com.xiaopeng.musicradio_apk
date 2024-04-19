package defpackage;

import com.lzy.okgo.adapter.Call;
import com.xiaopeng.musicradio.bean.xpbean.HotRadioResult;
import com.xiaopeng.musicradio.bean.xpbean.MainHotSingerResultBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.RankMusicResult;
import com.xiaopeng.musicradio.bean.xpbean.RecommentMusicResult;
import com.xiaopeng.musicradio.bean.xpbean.XpPlayMusicResult;
import defpackage.axx;
import io.reactivex.Observable;
/* compiled from: RxMusicModel.java */
/* renamed from: aqx  reason: default package */
/* loaded from: classes2.dex */
public class aqx {
    public static Observable<RecommentMusicResult> a(final String str, final int i, final int i2, final int i3) {
        return new axx<RecommentMusicResult>() { // from class: aqx.1
            @Override // defpackage.axx
            protected axx.a<RecommentMusicResult> a() {
                return new axx.a<RecommentMusicResult>() { // from class: aqx.1.1
                };
            }

            @Override // defpackage.axx
            protected Call<RecommentMusicResult> a(avc<RecommentMusicResult> avcVar) {
                return aqz.a().a(str, i, i2, i3, avcVar);
            }
        };
    }

    public static Observable<RankMusicResult> a() {
        return new axx<RankMusicResult>() { // from class: aqx.5
            @Override // defpackage.axx
            protected axx.a<RankMusicResult> a() {
                return new axx.a<RankMusicResult>() { // from class: aqx.5.1
                };
            }

            @Override // defpackage.axx
            protected Call<RankMusicResult> a(avc<RankMusicResult> avcVar) {
                return aqz.a().g(avcVar);
            }
        };
    }

    public static Observable<XpPlayMusicResult> b() {
        return new axx<XpPlayMusicResult>() { // from class: aqx.6
            @Override // defpackage.axx
            protected axx.a<XpPlayMusicResult> a() {
                return new axx.a<XpPlayMusicResult>() { // from class: aqx.6.1
                };
            }

            @Override // defpackage.axx
            protected Call<XpPlayMusicResult> a(avc<XpPlayMusicResult> avcVar) {
                return aqz.a().h(avcVar);
            }
        };
    }

    public static Observable<MainHotSingerResultBean> c() {
        return new axx<MainHotSingerResultBean>() { // from class: aqx.7
            @Override // defpackage.axx
            protected axx.a<MainHotSingerResultBean> a() {
                return new axx.a<MainHotSingerResultBean>() { // from class: aqx.7.1
                };
            }

            @Override // defpackage.axx
            protected Call<MainHotSingerResultBean> a(avc<MainHotSingerResultBean> avcVar) {
                return aqz.a().f(avcVar);
            }
        };
    }

    public static Observable<HotRadioResult> d() {
        return new axx<HotRadioResult>() { // from class: aqx.8
            @Override // defpackage.axx
            protected axx.a<HotRadioResult> a() {
                return new axx.a<HotRadioResult>() { // from class: aqx.8.1
                };
            }

            @Override // defpackage.axx
            protected Call<HotRadioResult> a(avc<HotRadioResult> avcVar) {
                return aqz.a().a(avcVar);
            }
        };
    }

    public static Observable<MusicCollectSongListBean> a(final long j, final int i, final int i2, final int i3) {
        return new axx<MusicCollectSongListBean>() { // from class: aqx.9
            @Override // defpackage.axx
            protected axx.a<MusicCollectSongListBean> a() {
                return new axx.a<MusicCollectSongListBean>() { // from class: aqx.9.1
                };
            }

            @Override // defpackage.axx
            protected Call<MusicCollectSongListBean> a(avc<MusicCollectSongListBean> avcVar) {
                return aqz.a().a(j, i, i2, i3, avcVar);
            }
        };
    }

    public static Observable<MusicCollectSongListBean> a(final long j, final int i, final int i2) {
        return new axx<MusicCollectSongListBean>() { // from class: aqx.2
            @Override // defpackage.axx
            protected axx.a<MusicCollectSongListBean> a() {
                return new axx.a<MusicCollectSongListBean>() { // from class: aqx.2.1
                };
            }

            @Override // defpackage.axx
            protected Call<MusicCollectSongListBean> a(avc<MusicCollectSongListBean> avcVar) {
                return aqz.a().a(j, i, i2, avcVar);
            }
        };
    }

    public static Observable<MusicCollectSongListBean> b(final long j, final int i, final int i2, final int i3) {
        return new axx<MusicCollectSongListBean>() { // from class: aqx.3
            @Override // defpackage.axx
            protected axx.a<MusicCollectSongListBean> a() {
                return new axx.a<MusicCollectSongListBean>() { // from class: aqx.3.1
                };
            }

            @Override // defpackage.axx
            protected Call<MusicCollectSongListBean> a(avc<MusicCollectSongListBean> avcVar) {
                return aqz.a().d(j, i, i2, i3, avcVar);
            }
        };
    }

    public static Observable<MusicCollectSongListBean> a(final long j, final int i) {
        return new axx<MusicCollectSongListBean>() { // from class: aqx.4
            @Override // defpackage.axx
            protected axx.a<MusicCollectSongListBean> a() {
                return new axx.a<MusicCollectSongListBean>() { // from class: aqx.4.1
                };
            }

            @Override // defpackage.axx
            protected Call<MusicCollectSongListBean> a(avc<MusicCollectSongListBean> avcVar) {
                return aqz.a().b(j, i, avcVar);
            }
        };
    }
}
