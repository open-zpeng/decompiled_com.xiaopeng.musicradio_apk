package com.xiaopeng.musicradio.search.result.mix.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.XmArtistBean;
import com.xiaopeng.musicradio.proto.Music;
import com.xiaopeng.musicradio.proto.Netprogram;
import com.xiaopeng.musicradio.proto.Netradio;
import com.xiaopeng.musicradio.proto.Netsearch;
import com.xiaopeng.musicradio.search.result.mix.presenter.SearchResultMixPresenter;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agq;
import defpackage.ayg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: SearchResultMixViewProxy.java */
/* loaded from: classes2.dex */
public class c extends aeu<a, SearchResultMixPresenter> implements a {
    private List<MusicSongBean> e;

    @Override // defpackage.azq
    public void a(agq.l lVar) {
    }

    @Override // defpackage.azp
    public void a(boolean z, int i, int i2) {
    }

    @Override // defpackage.azo
    public boolean u() {
        return false;
    }

    @Override // defpackage.azo
    public void v() {
    }

    public c(Context context, String str) {
        super(context, str);
        this.e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public SearchResultMixPresenter g() {
        Log.d("SearchResultMixViewProxy_", "createPresenter: create P");
        return new SearchResultMixPresenter();
    }

    @Override // defpackage.azo
    public void a(MixSearchResultBean.DataBean dataBean, int i, int i2) {
        List<MusicSongBean> songList = dataBean.getSongList();
        List<MusicAlbumBean> albumList = dataBean.getAlbumList();
        List<MixSearchResultBean.CollectBean> collectList = dataBean.getCollectList();
        List<RdAlbumBean> readingAlbumList = dataBean.getReadingAlbumList();
        List<NetRadioInfo> radioList = dataBean.getRadioList();
        Log.d("SearchResultMixViewProxy_", "updateData: mix result：song " + songList.size() + ",,album,," + albumList.size() + ",,collect,," + collectList.size() + ",,program,," + readingAlbumList.size() + ",,radio,," + radioList.size());
        if (songList.size() == 0 && albumList.size() == 0 && collectList.size() == 0 && readingAlbumList.size() == 0 && radioList.size() == 0) {
            i();
        }
        if (songList != null && songList.size() > 0) {
            ArrayList arrayList = new ArrayList();
            if (songList.size() > 6) {
                for (int i3 = 0; i3 < 6; i3++) {
                    arrayList.add(songList.get(i3));
                }
                this.e.clear();
                this.e.addAll(arrayList);
                a(arrayList, 0);
                Log.d("SearchResultMixViewProxy_", "updateData result is song: " + arrayList.size());
            } else {
                this.e.clear();
                this.e.addAll(arrayList);
                a(songList, 0);
                Log.d("SearchResultMixViewProxy_", "updateData result is song: " + songList.size());
            }
        } else {
            a((List<MusicSongBean>) null, 2);
        }
        if (albumList != null && albumList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            if (albumList.size() > 6) {
                for (int i4 = 0; i4 < 6; i4++) {
                    arrayList2.add(albumList.get(i4));
                }
                b(arrayList2, 0);
                Log.d("SearchResultMixViewProxy_", "updateData result is album: " + arrayList2.size());
            } else {
                b(albumList, 0);
                Log.d("SearchResultMixViewProxy_", "updateData result is album: " + albumList.size());
            }
        } else {
            b((List<MusicAlbumBean>) null, 2);
        }
        if (collectList != null && collectList.size() > 0) {
            ArrayList arrayList3 = new ArrayList();
            if (collectList.size() > 6) {
                for (int i5 = 0; i5 < 6; i5++) {
                    arrayList3.add(collectList.get(i5));
                }
                c(arrayList3, 0);
                Log.d("SearchResultMixViewProxy_", "updateData result is collect: " + arrayList3.size());
            } else {
                c(collectList, 0);
                Log.d("SearchResultMixViewProxy_", "updateData result is collect: " + collectList.size());
            }
        } else {
            c(null, 2);
        }
        if (readingAlbumList != null && readingAlbumList.size() > 0) {
            ArrayList arrayList4 = new ArrayList();
            if (readingAlbumList.size() > 6) {
                for (int i6 = 0; i6 < 6; i6++) {
                    arrayList4.add(readingAlbumList.get(i6));
                }
                d(arrayList4, 0);
                Log.d("SearchResultMixViewProxy_", "updateData result is program: " + arrayList4.size());
            } else {
                d(readingAlbumList, 0);
                Log.d("SearchResultMixViewProxy_", "updateData result is program: " + readingAlbumList.size());
            }
        } else {
            d(null, 2);
        }
        if (radioList != null && radioList.size() > 0) {
            ArrayList arrayList5 = new ArrayList();
            if (radioList.size() > 6) {
                for (int i7 = 0; i7 < 6; i7++) {
                    arrayList5.add(radioList.get(i7));
                }
                e(arrayList5, 0);
                Log.d("SearchResultMixViewProxy_", "updateData result is radio: " + arrayList5.size());
                return;
            }
            e(radioList, 0);
            Log.d("SearchResultMixViewProxy_", "updateData result is radio: " + radioList.size());
            return;
        }
        e(null, 2);
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("SearchResultMixViewProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if (TextUtils.equals(str, "playSearchSong")) {
            b(bArr);
        } else if (TextUtils.equals(str, "playSearchAlbum")) {
            c(bArr);
        } else if (TextUtils.equals(str, "playSearchCollect")) {
            d(bArr);
        } else if (TextUtils.equals(str, "playSearchProgram")) {
            e(bArr);
        } else if (TextUtils.equals(str, "playSearchRadio")) {
            f(bArr);
        } else if (TextUtils.equals(str, "playAllMusic")) {
            h();
        } else if (TextUtils.equals(str, "favOrNot")) {
            a(bArr);
        } else if (TextUtils.equals(str, "requestMixResultList")) {
            g(bArr);
            ((SearchResultMixPresenter) this.c).e();
        }
    }

    private void g(byte[] bArr) {
        try {
            String keyword = Netsearch.Keyword.parseFrom(bArr).getKeyword();
            Log.i("SearchResultMixViewProxy_", "byte monoMessage key: " + keyword);
            ayi.a().a(keyword);
            u.c(new ayg.b(keyword, true));
            u.c(new ayg.a());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
            Log.e("SearchResultMixViewProxy_", "byte monoMessage key: " + e.getMessage());
        }
    }

    public void a(final byte[] bArr) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.mix.view.c.1
            @Override // java.lang.Runnable
            public void run() {
                MusicSongBean h = c.this.h(bArr);
                Log.d("SearchResultMixViewProxy_", "byte favOrNot : " + h);
                if (h != null) {
                    ((SearchResultMixPresenter) c.this.c).b(h);
                    boolean c = ((SearchResultMixPresenter) c.this.c).c(h);
                    Log.d("SearchResultMixViewProxy_", "is_Love : " + c);
                    new HashMap().put("isLove", Boolean.valueOf(c));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MusicSongBean h(byte[] bArr) {
        return bhx.b(bArr);
    }

    public void b(final byte[] bArr) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.mix.view.c.2
            @Override // java.lang.Runnable
            public void run() {
                MusicSongBean h = c.this.h(bArr);
                Log.d("SearchResultMixViewProxy_", "byte playSearchSong : " + h);
                if (h != null) {
                    ((SearchResultMixPresenter) c.this.c).a(h);
                }
            }
        });
    }

    public void c(final byte[] bArr) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.mix.view.c.3
            @Override // java.lang.Runnable
            public void run() {
                MusicAlbumBean c = bhx.c(bArr);
                if (c != null) {
                    ((SearchResultMixPresenter) c.this.c).d(c.getId(), c.getName());
                }
            }
        });
    }

    public void d(final byte[] bArr) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.mix.view.c.4
            @Override // java.lang.Runnable
            public void run() {
                MixSearchResultBean.CollectBean d = bhx.d(bArr);
                if (d != null) {
                    ((SearchResultMixPresenter) c.this.c).c(d.getId(), d.getName());
                }
            }
        });
    }

    public void e(final byte[] bArr) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.mix.view.c.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Netprogram.AlbumBean parseFrom = Netprogram.AlbumBean.parseFrom(bArr);
                    Log.d("SearchResultMixViewProxy_", "byte playSearchProgram : " + parseFrom);
                    Netprogram.Artist artist = parseFrom.getArtist();
                    RdAlbumBean rdAlbumBean = new RdAlbumBean();
                    XmArtistBean xmArtistBean = new XmArtistBean();
                    xmArtistBean.setName(be.e(artist.getName()));
                    xmArtistBean.setId(artist.getId());
                    rdAlbumBean.setId(parseFrom.getId());
                    rdAlbumBean.setIntro(be.e(parseFrom.getIntro()));
                    rdAlbumBean.setShortIntro(be.e(parseFrom.getShortIntro()));
                    rdAlbumBean.setTitle(be.e(parseFrom.getTitle()));
                    rdAlbumBean.setLargeLogo(be.e(parseFrom.getLargeLogo()));
                    rdAlbumBean.setMediumLogo(be.e(parseFrom.getMediumLogo()));
                    rdAlbumBean.setCategoryName(be.e(parseFrom.getCategoryName()));
                    rdAlbumBean.setPaymentType(parseFrom.getPaymentType());
                    rdAlbumBean.setPlayCount(parseFrom.getPlayCount());
                    rdAlbumBean.setSmallLogo(be.e(parseFrom.getSmallLogo()));
                    rdAlbumBean.setUpdateTime(parseFrom.getUpdateTime());
                    rdAlbumBean.setArtist(xmArtistBean);
                    rdAlbumBean.setAuthorized(parseFrom.getAuthorized());
                    Log.d("SearchResultMixViewProxy_", "byte rdAlbumBean : " + rdAlbumBean);
                    ((SearchResultMixPresenter) c.this.c).a(rdAlbumBean);
                } catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                    Log.e("SearchResultMixViewProxy_", "playSearchProgram: " + e.getMessage());
                }
            }
        });
    }

    public void f(final byte[] bArr) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.mix.view.c.6
            @Override // java.lang.Runnable
            public void run() {
                new ArrayList();
                try {
                    Netradio.NetRadioInfo parseFrom = Netradio.NetRadioInfo.parseFrom(bArr);
                    Netradio.NetRadioProgramInfo playingInfo = parseFrom.getPlayingInfo();
                    NetRadioProgramInfo netRadioProgramInfo = new NetRadioProgramInfo();
                    netRadioProgramInfo.setId(playingInfo.getId());
                    netRadioProgramInfo.setName(be.e(playingInfo.getName()));
                    netRadioProgramInfo.setPlayUrl(playingInfo.getPlayUrl() == null ? "" : playingInfo.getPlayUrl());
                    Log.i("SearchResultMixViewProxy_", "byte monoMessage info: " + parseFrom + ",,,," + playingInfo);
                    NetRadioInfo netRadioInfo = new NetRadioInfo();
                    netRadioInfo.setId(parseFrom.getId());
                    netRadioInfo.setName(be.e(parseFrom.getName()));
                    netRadioInfo.setPicUrl(be.e(parseFrom.getPicUrl()));
                    netRadioInfo.setUpdateTime(parseFrom.getUpdateTime());
                    netRadioInfo.setHz(Double.parseDouble(parseFrom.getHz()));
                    netRadioInfo.setAreaCode(be.e(parseFrom.getAreaCode()));
                    netRadioInfo.setPlayCount(parseFrom.getPlayCount());
                    netRadioInfo.setPlayUrl(be.e(parseFrom.getPlayUrl()));
                    netRadioInfo.setPlayingInfo(netRadioProgramInfo);
                    ((SearchResultMixPresenter) c.this.c).a(netRadioInfo);
                } catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                    Log.e("SearchResultMixViewProxy_", "byte playSearchRadio: " + e.getMessage());
                }
            }
        });
    }

    public void h() {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.mix.view.c.7
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.e.size() > 0) {
                    ((SearchResultMixPresenter) c.this.c).a((MusicSongBean) c.this.e.get(0), c.this.e, 0);
                }
            }
        });
    }

    @Override // defpackage.azo
    public void as_() {
        c_("UpdatePlayState", "");
    }

    public void i() {
        Log.d("SearchResultMixViewProxy_", "showNoData: no result");
        a((List<MusicSongBean>) null, 2);
        b((List<MusicAlbumBean>) null, 2);
        c(null, 2);
        d(null, 2);
        e(null, 2);
    }

    @Override // defpackage.azp
    public void a(String str, int i) {
        a((List<MusicSongBean>) null, 1);
        b((List<MusicAlbumBean>) null, 1);
        c(null, 1);
        d(null, 1);
        e(null, 1);
    }

    public void a(List<MusicSongBean> list, int i) {
        Log.i("SearchResultMixViewProxy_", "msgId:SearchResultMixViewProxy_search_mixsong_getdatalist" + list);
        Netsearch.SongList.a a = Netsearch.SongList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (MusicSongBean musicSongBean : list) {
                a.a(bhw.a(musicSongBean));
            }
        }
        Log.i("SearchResultMixViewProxy_", "msgId listBuilder:" + a.a());
        a("SearchResultMixViewProxy_search_mixsong_getdatalist", (AbstractMessageLite) a.build());
    }

    public void b(List<MusicAlbumBean> list, int i) {
        Log.i("SearchResultMixViewProxy_", "msgId:SearchResultMixViewProxy_search_mixalbum_getdatalist" + list);
        Netsearch.AlbumList.a a = Netsearch.AlbumList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (MusicAlbumBean musicAlbumBean : list) {
                a.a(Music.MusicAlbum.newBuilder().a(musicAlbumBean.getId()).b(be.e(musicAlbumBean.getName())).c(be.e(musicAlbumBean.getLogo())).build());
            }
        }
        Log.i("SearchResultMixViewProxy_", "msgId listBuilder:" + a.a());
        a("SearchResultMixViewProxy_search_mixalbum_getdatalist", (AbstractMessageLite) a.build());
    }

    public void c(List<MixSearchResultBean.CollectBean> list, int i) {
        Log.i("SearchResultMixViewProxy_", "msgId:SearchResultMixViewProxy_search_mixcollect_getdatalist" + list);
        Netsearch.CollectList.a a = Netsearch.CollectList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (MixSearchResultBean.CollectBean collectBean : list) {
                a.a(Music.MusicAlbum.newBuilder().a(collectBean.getId()).b(be.e(collectBean.getName())).c(be.e(collectBean.getLogo())).build());
            }
        }
        Log.i("SearchResultMixViewProxy_", "msgId listBuilder:" + a.a());
        a("SearchResultMixViewProxy_search_mixcollect_getdatalist", (AbstractMessageLite) a.build());
    }

    public void d(List<RdAlbumBean> list, int i) {
        Log.i("SearchResultMixViewProxy_", "msgId:SearchResultMixViewProxy_search_mixprogram_getdatalist" + list);
        Netsearch.ProgramList.a a = Netsearch.ProgramList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (RdAlbumBean rdAlbumBean : list) {
                a.a(Netprogram.AlbumBean.newBuilder().a(rdAlbumBean.getId()).a(be.e(rdAlbumBean.getIntro())).b(be.e(rdAlbumBean.getShortIntro())).c(be.e(rdAlbumBean.getTitle())).d(be.e(rdAlbumBean.getLargeLogo())).e(be.e(rdAlbumBean.getMediumLogo())).f(be.e(rdAlbumBean.getCategoryName())).a(rdAlbumBean.getPaymentType()).b(rdAlbumBean.getPlayCount()).g(be.e(rdAlbumBean.getSmallLogo())).c(rdAlbumBean.getUpdateTime()).a(Netprogram.Artist.newBuilder().a(rdAlbumBean.getArtist().getId()).a(be.e(rdAlbumBean.getArtist().getName())).build()).a(rdAlbumBean.isAuthorized()).build());
            }
        }
        Log.i("SearchResultMixViewProxy_", "msgId listBuilder:" + a.a());
        a("SearchResultMixViewProxy_search_mixprogram_getdatalist", (AbstractMessageLite) a.build());
    }

    public void e(List<NetRadioInfo> list, int i) {
        Log.i("SearchResultMixViewProxy_", "msgId:SearchResultMixViewProxy_search_mixradio_getdatalist" + list);
        Netradio.RadioInfoList.a a = Netradio.RadioInfoList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (NetRadioInfo netRadioInfo : list) {
                NetRadioProgramInfo playingInfo = netRadioInfo.getPlayingInfo();
                a.a(Netradio.NetRadioInfo.newBuilder().a(netRadioInfo.getId()).a(be.e(netRadioInfo.getName())).b(be.e(netRadioInfo.getPicUrl())).a(netRadioInfo.getUpdateTime()).c(be.e(String.valueOf(netRadioInfo.getHz()))).d(be.e(netRadioInfo.getAreaCode())).b(netRadioInfo.getPlayCount()).e(be.e(netRadioInfo.getPlayUrl())).a(Netradio.NetRadioProgramInfo.newBuilder().a(playingInfo.getId()).a(be.e(playingInfo.getName())).b(be.e(playingInfo.getPlayUrl())).build()).build());
            }
        }
        Log.i("SearchResultMixViewProxy_", "msgId listBuilder:" + a.a());
        a("SearchResultMixViewProxy_search_mixradio_getdatalist", (AbstractMessageLite) a.build());
    }
}
