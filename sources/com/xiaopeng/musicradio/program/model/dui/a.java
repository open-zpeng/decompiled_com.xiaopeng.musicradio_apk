package com.xiaopeng.musicradio.program.model.dui;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.gson.reflect.TypeToken;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.bean.db.ReadLoveInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumTracksBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsCardBean;
import com.xiaopeng.musicradio.bean.xpbean.XmArtistBean;
import com.xiaopeng.musicradio.model.dui.f;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.at;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import defpackage.agg;
import defpackage.axm;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: DuiProgramMediaModel.java */
/* loaded from: classes2.dex */
public class a implements f.a {
    private static final FMAlbumTracksBean.DataBean.ListBean.ArtistBean b = new FMAlbumTracksBean.DataBean.ListBean.ArtistBean();
    private int a = 812;

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void a() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void b(String str, CompositeDisposable compositeDisposable) {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void c(String str, CompositeDisposable compositeDisposable) {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void d() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void g() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void k() {
    }

    static {
        b.setId(-1L);
        b.setLogo("");
        b.setName("Unknown");
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void b() {
        ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.program.model.dui.a.1
            @Override // java.lang.Runnable
            public void run() {
                final List<ReadHistoryInfo> d = axi.a().d();
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.program.model.dui.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (d.size() == 0) {
                            return;
                        }
                        int i = 0;
                        if (d.size() > 1 && aei.a().c() == 3) {
                            i = 1;
                        }
                        amw.a().c();
                        RdAlbumBean rdAlbumBean = new RdAlbumBean();
                        rdAlbumBean.setId(((ReadHistoryInfo) d.get(i)).getAlbumId());
                        rdAlbumBean.setTitle(((ReadHistoryInfo) d.get(i)).getAlbumName());
                        axn.i().a((ahp<ProgramBean>) new axm.a().a("reading_album_" + ((ReadHistoryInfo) d.get(i)).getAlbumId()).a(true).b(10).a(rdAlbumBean).b(20).a());
                        u.f(new agg.r(3));
                    }
                });
            }
        });
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void c() {
        ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.program.model.dui.a.2
            @Override // java.lang.Runnable
            public void run() {
                final List<ReadLoveInfo> c = axj.a().c();
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.program.model.dui.a.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (c.size() == 0) {
                            return;
                        }
                        RdAlbumBean rdAlbumBean = new RdAlbumBean();
                        rdAlbumBean.setId(((ReadLoveInfo) c.get(0)).getAlbumId());
                        rdAlbumBean.setTitle(((ReadLoveInfo) c.get(0)).getAlbumName());
                        axm a = new axm.a().a("reading_album_" + ((ReadLoveInfo) c.get(0)).getAlbumId()).a(true).b(10).a(rdAlbumBean).b(20).a();
                        amw.a().c();
                        axn.i().a((ahp<ProgramBean>) a);
                        u.f(new agg.r(3));
                    }
                });
            }
        });
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void a(String str, CompositeDisposable compositeDisposable) {
        final ProgramListBean fromJson = ProgramListBean.fromJson(str);
        if (w.f() == 2) {
            fromJson.setListed(0);
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.equals("", fromJson.getSource())) {
            hashMap.put("search", "speech");
        } else {
            hashMap.put("search", fromJson.getSource());
        }
        hashMap.put("voice", "reading");
        hashMap.put("keyword", Integer.valueOf(fromJson.getSearchType()));
        hashMap.put("name", fromJson.getKeyWord());
        bci.b(hashMap);
        LogUtils.i("DuiProgramMediaModel", "onAudioBookPlay() called with: data = [" + fromJson + "]");
        if (fromJson.getListed() == 1) {
            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.program.model.dui.a.3
                @Override // java.lang.Runnable
                public void run() {
                    String metaDataList = fromJson.getMetaDataList();
                    if (TextUtils.isEmpty(metaDataList)) {
                        return;
                    }
                    List<RdAlbumBean> list = (List) z.a(metaDataList, new TypeToken<List<RdAlbumBean>>() { // from class: com.xiaopeng.musicradio.program.model.dui.a.3.1
                    }.getType());
                    axn.i().a(fromJson.getKeyWord(), list);
                    String str2 = "?voice_search_type=2";
                    try {
                        str2 = "?voice_search_type=2&voice_list=" + URLEncoder.encode(metaDataList, "UTF-8");
                    } catch (Exception unused) {
                    }
                    if (list.size() > 0 && fromJson.getSemantic() != null && fromJson.getSemantic().getIntents() != null && fromJson.getSemantic().getIntents().getMusicSearchPlay() != null) {
                        bck.a(list.get(0).getId(), list.get(0).getChannelId(), "", fromJson.getQuery(), fromJson.getSemantic().getIntents().getMusicSearchPlay().getIntentName(), z.a(fromJson.getSemantic().getIntents().getMusicSearchPlay().getSlots()));
                    }
                    sp.a().a("/search/activity/main").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withString("fragment_uri", "/search/fragment/home/search_result" + str2).withString("search_voice_result", metaDataList).withString("search_voice_keyword", fromJson.getKeyWord()).withInt("search_voice_type", 2).navigation(com.xiaopeng.musicradio.utils.a.a().f() ? null : com.xiaopeng.musicradio.utils.a.a().c());
                }
            });
            return;
        }
        compositeDisposable.clear();
        compositeDisposable.add(Observable.just(fromJson).flatMap(new Function<ProgramListBean, ObservableSource<Pair<RdAlbumBean, List<ProgramBean>>>>() { // from class: com.xiaopeng.musicradio.program.model.dui.a.6
            @Override // io.reactivex.functions.Function
            /* renamed from: a */
            public ObservableSource<Pair<RdAlbumBean, List<ProgramBean>>> apply(ProgramListBean programListBean) {
                List<FMAlbumTracksBean.DataBean.ListBean> list;
                RdAlbumBean rdAlbumBean;
                String metadata = programListBean.getMetadata();
                String tracks = programListBean.getTracks();
                XmArtistBean xmArtistBean = null;
                if (TextUtils.isEmpty(metadata) || TextUtils.isEmpty(tracks)) {
                    list = null;
                    rdAlbumBean = null;
                } else {
                    rdAlbumBean = (RdAlbumBean) z.a(metadata, (Class<Object>) RdAlbumBean.class);
                    list = (List) z.a(tracks, new TypeToken<List<FMAlbumTracksBean.DataBean.ListBean>>() { // from class: com.xiaopeng.musicradio.program.model.dui.a.6.1
                    }.getType());
                }
                if (list == null || list.isEmpty()) {
                    return Observable.empty();
                }
                String str2 = "";
                if (rdAlbumBean != null) {
                    xmArtistBean = rdAlbumBean.getArtist();
                    str2 = rdAlbumBean.getTitle();
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = "头条新闻";
                }
                ArrayList arrayList = new ArrayList();
                for (FMAlbumTracksBean.DataBean.ListBean listBean : list) {
                    if (listBean.getArtist() == null) {
                        if (xmArtistBean == null) {
                            listBean.setArtist(a.b);
                        } else {
                            listBean.setArtist(new FMAlbumTracksBean.DataBean.ListBean.ArtistBean());
                            listBean.getArtist().setId(xmArtistBean.getId());
                            listBean.getArtist().setName(xmArtistBean.getName());
                            listBean.getArtist().setLogo(xmArtistBean.getLogo());
                        }
                    }
                    ProgramBean a = aq.a(listBean, str2, rdAlbumBean);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                return Observable.just(new Pair(rdAlbumBean, arrayList));
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Pair<RdAlbumBean, List<ProgramBean>>>() { // from class: com.xiaopeng.musicradio.program.model.dui.a.4
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Pair<RdAlbumBean, List<ProgramBean>> pair) {
                RdAlbumBean rdAlbumBean = (RdAlbumBean) pair.first;
                List<ProgramBean> list = (List) pair.second;
                amw.a().c();
                if (rdAlbumBean == null || rdAlbumBean.getId() <= 0) {
                    if (fromJson.getSemantic() != null && fromJson.getSemantic().getIntents() != null && fromJson.getSemantic().getIntents().getMusicSearchPlay() != null) {
                        bck.a(0L, 0L, "headspeech", fromJson.getQuery(), fromJson.getSemantic().getIntents().getMusicSearchPlay().getIntentName(), z.a(fromJson.getSemantic().getIntents().getMusicSearchPlay().getSlots()));
                    }
                    axn.i().a((ahp<ProgramBean>) new axm.a().a("headspeech").b(10).a(list).a());
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(VuiConstants.ELEMENT_TYPE, "news");
                    hashMap2.put("source", "speech");
                    bci.d(hashMap2);
                    return;
                }
                if (fromJson.getSemantic() != null && fromJson.getSemantic().getIntents() != null && fromJson.getSemantic().getIntents().getMusicSearchPlay() != null) {
                    bck.a(rdAlbumBean.getId(), rdAlbumBean.getChannelId(), "", fromJson.getQuery(), fromJson.getSemantic().getIntents().getMusicSearchPlay().getIntentName(), z.a(fromJson.getSemantic().getIntents().getMusicSearchPlay().getSlots()));
                }
                rdAlbumBean.setFromSource("speech");
                if (list != null && list.size() > 0) {
                    at.b("reading_album_" + rdAlbumBean.getId(), 1, -1, 50, rdAlbumBean.getSort() == 0 ? "timeAsc" : "timeDesc", rdAlbumBean, list, 0);
                } else {
                    axn.i().a(rdAlbumBean);
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put(VuiConstants.ELEMENT_TYPE, "reading");
                hashMap3.put("source", "speech");
                bci.d(hashMap3);
            }
        }, new Consumer<Throwable>() { // from class: com.xiaopeng.musicradio.program.model.dui.a.5
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Throwable th) {
                Log.w("DuiProgramMediaModel", "onAudioBookPlay#onError() called with: throwable = [" + th + "]");
            }
        }));
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void f() {
        ProgramBean r = axn.i().r();
        if (r != null) {
            axh.a().a(aq.a(r));
        }
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void e() {
        ProgramBean r = axn.i().r();
        if (r != null) {
            axh.a().b(aq.a(r), r.getCardId() > 0);
        }
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void h() {
        float e = axl.a().e();
        if (e == 1.0f) {
            axn.i().a(1.25f);
        } else if (e == 1.25f) {
            axn.i().a(1.5f);
        } else if (e == 1.5f) {
            axn.i().a(2.0f);
        }
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void i() {
        float e = axl.a().e();
        if (e == 1.25f) {
            axn.i().a(1.0f);
        } else if (e == 1.5f) {
            axn.i().a(1.25f);
        } else if (e == 2.0f) {
            axn.i().a(1.5f);
        }
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void a(float f) {
        if (f == 1.0f || f == 1.25f || f == 1.5f || f == 2.0f) {
            axn.i().a(f);
        }
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void j() {
        List<TodayNewsCardBean.DataBean.ListBean> d = axe.c().d();
        Log.i("DuiProgramMediaModel", "onPlayNews: ==========");
        if (d == null || d.size() == 0) {
            at.a(new axm.a().a(ad.b(this.a).toJson()).a(1).b(10).c(0).e(this.a).a());
            return;
        }
        Log.i("DuiProgramMediaModel", "onPlayNews2: ============ ");
        TodayNewsCardBean.DataBean.ListBean listBean = d.get(0);
        ArrayList arrayList = new ArrayList();
        if (listBean.getTrackInfoBos() != null && listBean.getTrackInfoBos().size() > 0) {
            for (TodayNewsCardBean.DataBean.ListBean.TrackInfoBosBean trackInfoBosBean : listBean.getTrackInfoBos()) {
                arrayList.add(aq.a(trackInfoBosBean, listBean));
            }
        }
        long j = 0;
        try {
            j = Long.parseLong("0");
        } catch (Exception unused) {
        }
        at.a(new axm.a().a(ad.a(listBean.getCardId()).toJson()).a(new ArrayList(arrayList)).b(true).a(1).b(10).c(0).a(listBean.getCardId()).b(j).a());
    }
}
