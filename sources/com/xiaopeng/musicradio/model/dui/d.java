package com.xiaopeng.musicradio.model.dui;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.gson.reflect.TypeToken;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.blue.BtMusicBean;
import com.xiaopeng.musicradio.bean.db.LatelyMusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.dui.DuiMusicBean;
import com.xiaopeng.musicradio.bean.dui.DuiMusicParams;
import com.xiaopeng.musicradio.bean.search.DuiSearchResultBean;
import com.xiaopeng.musicradio.bean.search.DuiSemanticBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.model.bluetooth.l;
import com.xiaopeng.musicradio.model.dui.f;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.ab;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.ah;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.am;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.bg;
import com.xiaopeng.musicradio.utils.bh;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.speech.protocol.bean.stats.SkillStatisticsBean;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import defpackage.apx;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: DuiMusicMediaModel.java */
/* loaded from: classes.dex */
public class d implements f.a {
    private static final String a;

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void a(float f) {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void a(String str, CompositeDisposable compositeDisposable) {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void g() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void h() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void i() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void j() {
    }

    static {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setTag("DuiMusicMediaModel");
        a = z.a(listSignBean);
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void a() {
        if (apx.a().d()) {
            amw.a().c();
            MusicInfo d = apk.i().d();
            if (apk.i().v() != -1 && d != null) {
                apk.i().play();
                return;
            }
            List<MusicInfo> q = apk.i().q();
            if (q.size() > 0) {
                apk.i().a(q.get(0));
            } else {
                l();
            }
        }
    }

    private void l() {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
        listSignBean.setCollectId(-1000L);
        listSignBean.setExtra(ListSignBean.MUSIC_RADIO_SING_EXTRA);
        listSignBean.setTag(be.a(b.f.daily_title) + bg.h(System.currentTimeMillis()));
        String json = listSignBean.toJson();
        amw.a().c();
        com.xiaopeng.musicradio.utils.e.a(new amq(json, 50, 1) { // from class: com.xiaopeng.musicradio.model.dui.d.1
            @Override // defpackage.ahp
            public boolean n() {
                return true;
            }

            @Override // defpackage.ahp
            public void a(boolean z, int i, String str) {
                super.a(z, i, str);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void b() {
        if (apx.a().d()) {
            m();
        }
    }

    private void m() {
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.d.6
            @Override // java.lang.Runnable
            public void run() {
                List<LatelyMusicInfo> b = anr.a().b();
                final ArrayList arrayList = new ArrayList();
                for (LatelyMusicInfo latelyMusicInfo : b) {
                    arrayList.add(ab.a(ab.a(latelyMusicInfo)));
                }
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.d.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        amw.a().c();
                        if (!arrayList.isEmpty()) {
                            apk.i().a(arrayList, "");
                        } else {
                            d.this.a();
                        }
                    }
                });
            }
        });
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void c() {
        if (apx.a().d()) {
            Log.i("DuiMusicMediaModel", "onPlayCollect: ========== ");
            ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.d.7
                @Override // java.lang.Runnable
                public void run() {
                    final List<MusicInfo> a2 = bh.a();
                    ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.d.7.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Log.i("DuiMusicMediaModel", "run: size ==== " + a2.size());
                            if (a2.size() == 0) {
                                return;
                            }
                            amw.a().c();
                            apk.i().e(50);
                        }
                    });
                }
            });
        }
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void b(String str, CompositeDisposable compositeDisposable) {
        final MusicListBean musicListBean = (MusicListBean) z.a(str, (Class<Object>) MusicListBean.class);
        if (apx.a().d()) {
            HashMap hashMap = new HashMap();
            if (TextUtils.equals("", musicListBean.getSource())) {
                hashMap.put("search", "speech");
            } else {
                hashMap.put("search", musicListBean.getSource());
                hashMap.put("search", "click");
            }
            hashMap.put("voice", SkillStatisticsBean.PAGE_MUSIC);
            hashMap.put("keyword", Integer.valueOf(musicListBean.getSearchType()));
            hashMap.put("name", musicListBean.getKeyWord());
            bci.b(hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(VuiConstants.ELEMENT_TYPE, SkillStatisticsBean.PAGE_MUSIC);
            hashMap2.put("source", "speech");
            bci.d(hashMap2);
            LogUtils.i("DuiMusicMediaModel", "onMusicListPlay() called with: data = [" + musicListBean + "]");
            if (musicListBean == null) {
                Log.w("DuiMusicMediaModel", "onMusicListPlay: data is null");
            } else if (musicListBean.getListed() == 1) {
                List<MusicSongBean> tracks = musicListBean.getTracks();
                if (tracks != null && tracks.size() > 0) {
                    apv.a().a(musicListBean.getKeyWord(), tracks, musicListBean.getExtData());
                }
                String str2 = "?voice_search_type=1";
                String a2 = z.a(musicListBean.getTracks());
                try {
                    str2 = "?voice_search_type=1&voice_list=" + URLEncoder.encode(a2, "UTF-8");
                } catch (Exception unused) {
                }
                if (musicListBean.getTracks() != null && musicListBean.getTracks().size() > 0) {
                    a(musicListBean.getQuery(), musicListBean.getSemantic(), musicListBean.getTracks().get(0));
                }
                sp.a().a("/search/activity/main").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withString("fragment_uri", "/search/fragment/home/search_result" + str2).withString("search_voice_result", a2).withString("search_voice_keyword", musicListBean.getKeyWord()).withInt("search_voice_type", 1).navigation(com.xiaopeng.musicradio.utils.a.a().f() ? null : com.xiaopeng.musicradio.utils.a.a().c());
            } else {
                compositeDisposable.clear();
                compositeDisposable.add(Observable.just(musicListBean).flatMap(new Function<MusicListBean, ObservableSource<DuiMusicBean>>() { // from class: com.xiaopeng.musicradio.model.dui.d.10
                    @Override // io.reactivex.functions.Function
                    /* renamed from: a */
                    public ObservableSource<DuiMusicBean> apply(MusicListBean musicListBean2) {
                        return d.this.a(musicListBean2);
                    }
                }).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<DuiMusicBean>() { // from class: com.xiaopeng.musicradio.model.dui.d.8
                    @Override // io.reactivex.functions.Consumer
                    /* renamed from: a */
                    public void accept(DuiMusicBean duiMusicBean) {
                        DuiMusicParams params = duiMusicBean.getParams();
                        if (params != null && "循环".equals(params.getMode())) {
                            if (musicListBean.getSearchType() == 3 || musicListBean.getSearchType() == 1) {
                                apk.i().a(3);
                            } else {
                                apk.i().a(2);
                            }
                        }
                        anx.a().a(duiMusicBean.getTracks(), musicListBean.getKeyWord(), musicListBean.getSearchType());
                        if (duiMusicBean.getTracks() != null && duiMusicBean.getTracks().size() > 0) {
                            amw.a().c();
                            d.this.a(musicListBean.getQuery(), musicListBean.getSemantic(), duiMusicBean.getTracks().get(0));
                            if (duiMusicBean.getTracks().size() == 1) {
                                apk.i().b(duiMusicBean.getTracks().get(0));
                            } else {
                                apk.i().a(duiMusicBean.getTracks(), "");
                            }
                        }
                        if (TextUtils.equals("", musicListBean.getSource())) {
                            ah.a(2);
                        } else {
                            ah.a(3);
                        }
                    }
                }, new Consumer<Throwable>() { // from class: com.xiaopeng.musicradio.model.dui.d.9
                    @Override // io.reactivex.functions.Consumer
                    /* renamed from: a */
                    public void accept(Throwable th) {
                        Log.w("DuiMusicMediaModel", "onMusicListPlay#onError() called with: throwable = [" + th + "]");
                    }
                }));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, DuiSemanticBean duiSemanticBean, MusicInfo musicInfo) {
        if (duiSemanticBean == null || musicInfo == null || duiSemanticBean.getIntents() == null || duiSemanticBean.getIntents().getMusicSearchPlay() == null) {
            return;
        }
        bck.a(musicInfo.getHash(), musicInfo.getAlbumId(), str, duiSemanticBean.getIntents().getMusicSearchPlay().getIntentName(), z.a(duiSemanticBean.getIntents().getMusicSearchPlay().getSlots()));
    }

    private void a(String str, DuiSemanticBean duiSemanticBean, MusicSongBean musicSongBean) {
        if (duiSemanticBean == null || musicSongBean == null || duiSemanticBean.getIntents() == null || duiSemanticBean.getIntents().getMusicSearchPlay() == null) {
            return;
        }
        bck.a(musicSongBean.getHash(), musicSongBean.getAlbum() != null ? musicSongBean.getAlbum().getId() : 0L, str, duiSemanticBean.getIntents().getMusicSearchPlay().getIntentName(), z.a(duiSemanticBean.getIntents().getMusicSearchPlay().getSlots()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable<DuiMusicBean> a(MusicListBean musicListBean) {
        String a2 = z.a(musicListBean.getTracks());
        DuiMusicBean duiMusicBean = new DuiMusicBean();
        duiMusicBean.setParams(musicListBean.getParams());
        if (musicListBean.getParams() != null) {
            duiMusicBean.setListSign(a(musicListBean.getParams()));
        }
        if (TextUtils.isEmpty(duiMusicBean.getListSign())) {
            duiMusicBean.setListSign(a);
        }
        if (!TextUtils.isEmpty(a2)) {
            List<MusicSongBean> list = (List) z.a(a2, new TypeToken<List<MusicSongBean>>() { // from class: com.xiaopeng.musicradio.model.dui.d.11
            }.getType());
            List<MusicInfo> emptyList = Collections.emptyList();
            if (list != null) {
                emptyList = new ArrayList<>(list.size());
                for (MusicSongBean musicSongBean : list) {
                    if (musicSongBean.isCanPlay()) {
                        emptyList.add(ab.a(musicSongBean, musicListBean.getKeyWord()));
                    }
                }
            }
            duiMusicBean.setTracks(emptyList);
        }
        duiMusicBean.setPage(musicListBean.getPage());
        return Observable.just(duiMusicBean);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private String a(DuiMusicParams duiMusicParams) {
        char c;
        switch (duiMusicParams.getCategory()) {
            case 1:
                String keyword = duiMusicParams.getKeyword();
                switch (keyword.hashCode()) {
                    case 21250752:
                        if (keyword.equals("原创榜")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 25895296:
                        if (keyword.equals("新歌榜")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 28660093:
                        if (keyword.equals("热歌榜")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 515448456:
                        if (keyword.equals("每日三十首")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 626686536:
                        if (keyword.equals("今日头条")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        return "find_music_dayli";
                    case 1:
                        return "headspeech";
                    case 2:
                        return ad.a(102L, -1);
                    case 3:
                        return ad.a(104L, -1);
                    case 4:
                        return ad.a(103L, -1);
                    default:
                        return "DuiMusicMediaModel";
                }
            case 2:
                return ad.a(-1, duiMusicParams.getId(), duiMusicParams.getType());
            case 3:
                return ad.a(duiMusicParams.getId());
            default:
                return "DuiMusicMediaModel";
        }
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void d() {
        if (com.xiaopeng.musicradio.model.bluetooth.a.i().n()) {
            LogUtils.i("DuiMusicMediaModel", "bt_isconnect");
            amw.a().c();
            com.xiaopeng.musicradio.model.bluetooth.a.i().r();
            com.xiaopeng.musicradio.model.bluetooth.a.i().play();
            return;
        }
        LogUtils.i("DuiMusicMediaModel", "open_bt");
        am.a();
        bcp.a();
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void f() {
        BtMusicBean d;
        MusicInfo a2;
        if (aei.a().c() == 0) {
            MusicInfo u = apk.i().u();
            if (u != null) {
                anc.a().d(u);
            }
        } else if (aei.a().c() != 2 || (d = com.xiaopeng.musicradio.model.bluetooth.a.i().d()) == null || (a2 = l.c().a(d.getSong(), d.getSinger())) == null) {
        } else {
            anc.a().d(a2);
        }
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void e() {
        BtMusicBean d;
        MusicInfo a2;
        if (aei.a().c() == 0) {
            MusicInfo u = apk.i().u();
            if (u != null) {
                anc.a().c(u);
            }
        } else if (aei.a().c() != 2 || (d = com.xiaopeng.musicradio.model.bluetooth.a.i().d()) == null || (a2 = l.c().a(d.getSong(), d.getSinger())) == null) {
        } else {
            anc.a().c(a2);
        }
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void k() {
        if (apx.a().d()) {
            Log.i("DuiMusicMediaModel", "onPlayDailySong: ==========");
            apk.i().a(new amq(au.b(-1000L, be.a(b.f.daily_title) + bg.h(System.currentTimeMillis())).toJson(), 50) { // from class: com.xiaopeng.musicradio.model.dui.d.12
                @Override // defpackage.ahp
                public boolean n() {
                    return true;
                }

                @Override // defpackage.ahp
                public void a(boolean z, int i, String str) {
                    super.a(z, i, str);
                    ak.a(com.xiaopeng.musicradio.a.a, str);
                }
            });
        }
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void c(String str, final CompositeDisposable compositeDisposable) {
        LogUtils.i("DuiMusicMediaModel", "onSearchListPlay, result=" + str);
        if (str.contains("listed")) {
            LogUtils.i("DuiMusicMediaModel", "onSearchListPlay, listed exist");
        } else if (!str.contains("listed")) {
            LogUtils.i("DuiMusicMediaModel", "onSearchListPlay, listed = null");
        }
        final DuiSearchResultBean duiSearchResultBean = (DuiSearchResultBean) z.a(str, (Class<Object>) DuiSearchResultBean.class);
        if (duiSearchResultBean.getSemantic() != null) {
            LogUtils.i("DuiMusicMediaModel", "onMusicListPlay() called with: getSemantic = [" + duiSearchResultBean.getSemantic() + "]");
            LogUtils.i("DuiMusicMediaModel", "onMusicListPlay() called with: getQuery = [" + duiSearchResultBean.getQuery() + "]");
        }
        if (duiSearchResultBean == null) {
            LogUtils.i("DuiMusicMediaModel", "onSearchListPlay, duiSearchResultBean=null");
        } else if (duiSearchResultBean.getSearchType() == 1 || duiSearchResultBean.getSearchType() == 3 || duiSearchResultBean.getSearchType() == 2) {
            apx.a().a(new apx.b() { // from class: com.xiaopeng.musicradio.model.dui.d.13
                @Override // defpackage.apx.b
                public boolean a(boolean z) {
                    LogUtils.i("DuiMusicMediaModel", "onSearchListPlay:" + z + ",listed: " + duiSearchResultBean.getListed());
                    if (duiSearchResultBean.getListed() == 1) {
                        d.this.a(duiSearchResultBean);
                        return false;
                    }
                    d.this.a(duiSearchResultBean, compositeDisposable);
                    return false;
                }

                @Override // defpackage.apx.b
                public void a() {
                    LogUtils.i("DuiMusicMediaModel", "onSearchListPlay:onMusicAuthFail");
                }
            });
        } else if (duiSearchResultBean.getListed() == 1) {
            a(duiSearchResultBean);
        } else {
            a(duiSearchResultBean, compositeDisposable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DuiSearchResultBean duiSearchResultBean, CompositeDisposable compositeDisposable) {
        if (duiSearchResultBean.getQQListResult() != null) {
            compositeDisposable.clear();
            compositeDisposable.add(Observable.just(duiSearchResultBean).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(new AnonymousClass2(), new Consumer<Throwable>() { // from class: com.xiaopeng.musicradio.model.dui.d.3
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(Throwable th) {
                    Log.w("DuiMusicMediaModel", "onPlayListOnly#onError() called with: throwable = [" + th + "]");
                }
            }));
        } else if (duiSearchResultBean.getSongList() != null) {
            compositeDisposable.clear();
            compositeDisposable.add(Observable.just(duiSearchResultBean).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(new AnonymousClass4(), new Consumer<Throwable>() { // from class: com.xiaopeng.musicradio.model.dui.d.5
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(Throwable th) {
                    Log.w("DuiMusicMediaModel", "onPlayListOnly#onError() called with: throwable = [" + th + "]");
                }
            }));
        } else {
            LogUtils.w("DuiMusicMediaModel", "no onPlayListOnly for qq");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DuiMusicMediaModel.java */
    /* renamed from: com.xiaopeng.musicradio.model.dui.d$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Consumer<DuiSearchResultBean> {
        AnonymousClass2() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(final DuiSearchResultBean duiSearchResultBean) {
            aua auaVar;
            DuiMusicParams params = duiSearchResultBean.getParams();
            if (params != null && "循环".equals(params.getMode())) {
                if (duiSearchResultBean.getSearchType() == 3 || duiSearchResultBean.getSearchType() == 1) {
                    apk.i().a(3);
                } else {
                    apk.i().a(2);
                }
            }
            if (duiSearchResultBean.getQQListResult().getSongList() != null && duiSearchResultBean.getQQListResult().getSongList().size() > 0) {
                ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.d.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (duiSearchResultBean.getQQListResult().getSongList().size() == 1) {
                            final MusicInfo a = ab.a(duiSearchResultBean.getQQListResult().getSongList().get(0), 40, "搜索");
                            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.d.2.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    d.this.a(duiSearchResultBean.getQuery(), duiSearchResultBean.getSemantic(), a);
                                    apk.i().b(a);
                                }
                            });
                            return;
                        }
                        final ArrayList arrayList = new ArrayList();
                        for (MusicSongBean musicSongBean : duiSearchResultBean.getQQListResult().getSongList()) {
                            arrayList.add(ab.a(musicSongBean, 40, ""));
                        }
                        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.d.2.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                if (arrayList.size() > 0) {
                                    d.this.a(duiSearchResultBean.getQuery(), duiSearchResultBean.getSemantic(), (MusicInfo) arrayList.get(0));
                                }
                                apk.i().a(arrayList, "");
                            }
                        });
                    }
                });
            } else if (duiSearchResultBean.getQQListResult().getAlbumList() != null && duiSearchResultBean.getQQListResult().getAlbumList().size() > 0) {
                String name = duiSearchResultBean.getQQListResult().getAlbumList().get(0).getName();
                long id = duiSearchResultBean.getQQListResult().getAlbumList().get(0).getId();
                ListSignBean listSignBean = new ListSignBean();
                listSignBean.setPrefix("listsign_singer_single_music");
                listSignBean.setTag(name);
                listSignBean.setCollectId(id);
                listSignBean.setExtra(ListSignBean.MUSIC_SINGER_EXTRA);
                String json = listSignBean.toJson();
                atf.a().a(json, true);
                if (duiSearchResultBean.getSemantic() != null && duiSearchResultBean.getSemantic().getIntents() != null && duiSearchResultBean.getSemantic().getIntents().getMusicSearchPlay() != null) {
                    bck.a(json, "", duiSearchResultBean.getSemantic().getIntents().getMusicSearchPlay().getIntentName(), z.a(duiSearchResultBean.getSemantic().getIntents().getMusicSearchPlay().getSlots()));
                }
            } else if (duiSearchResultBean.getQQListResult().getCollectList() != null && duiSearchResultBean.getQQListResult().getCollectList().size() > 0) {
                String name2 = duiSearchResultBean.getQQListResult().getCollectList().get(0).getName();
                long id2 = duiSearchResultBean.getQQListResult().getCollectList().get(0).getId();
                ListSignBean listSignBean2 = new ListSignBean();
                listSignBean2.setPrefix(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
                listSignBean2.setTag(name2);
                listSignBean2.setCollectId(id2);
                listSignBean2.setExtra(ListSignBean.MUSIC_RADIO_SING_EXTRA);
                String json2 = listSignBean2.toJson();
                atf.a().a(json2, true);
                if (duiSearchResultBean.getSemantic() != null && duiSearchResultBean.getSemantic().getIntents() != null && duiSearchResultBean.getSemantic().getIntents().getMusicSearchPlay() != null) {
                    bck.a(json2, "", duiSearchResultBean.getSemantic().getIntents().getMusicSearchPlay().getIntentName(), z.a(duiSearchResultBean.getSemantic().getIntents().getMusicSearchPlay().getSlots()));
                }
            } else if (duiSearchResultBean.getQQListResult().getRadioList() != null && duiSearchResultBean.getQQListResult().getRadioList().size() > 0 && (auaVar = (aua) com.xiaopeng.musicradio.service.c.a().b(aua.class)) != null) {
                auaVar.play(duiSearchResultBean.getQQListResult().getRadioList().get(0));
            }
            ah.a(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DuiMusicMediaModel.java */
    /* renamed from: com.xiaopeng.musicradio.model.dui.d$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements Consumer<DuiSearchResultBean> {
        AnonymousClass4() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(final DuiSearchResultBean duiSearchResultBean) {
            DuiMusicParams params = duiSearchResultBean.getParams();
            if (params != null && "循环".equals(params.getMode())) {
                if (duiSearchResultBean.getSearchType() == 3 || duiSearchResultBean.getSearchType() == 1) {
                    apk.i().a(3);
                } else {
                    apk.i().a(2);
                }
            }
            if (duiSearchResultBean.getSongList().size() > 0) {
                ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.d.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        final MusicInfo a = ab.a(duiSearchResultBean.getSongList().get(0), 40, "搜索");
                        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.d.4.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                d.this.a(duiSearchResultBean.getQuery(), duiSearchResultBean.getSemantic(), a);
                                apk.i().b(a);
                            }
                        });
                    }
                });
            }
            ah.a(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DuiSearchResultBean duiSearchResultBean) {
        String str = "";
        Log.i("DuiMusicMediaModel", "on_SearchListPlay listed: " + duiSearchResultBean.getListed());
        Log.i("DuiMusicMediaModel", "on_SearchListPlay type: " + duiSearchResultBean.getSearchType() + ",version," + duiSearchResultBean.getVersion() + ",keyword: " + duiSearchResultBean.getKeyword());
        if (duiSearchResultBean.getSearchType() == 1) {
            if (duiSearchResultBean.getSongList() != null && duiSearchResultBean.getSongList().size() > 0) {
                str = z.a(duiSearchResultBean.getSongList());
                a(duiSearchResultBean.getQuery(), duiSearchResultBean.getSemantic(), duiSearchResultBean.getSongList().get(0));
            } else if (duiSearchResultBean.getQQListResult().getSongList() != null && duiSearchResultBean.getQQListResult().getSongList().size() > 0) {
                str = z.a(duiSearchResultBean.getQQListResult().getSongList());
                Log.i("DuiMusicMediaModel", "on_SearchListPlay qqsize: " + duiSearchResultBean.getQQListResult().getSongList().size());
                a(duiSearchResultBean.getQuery(), duiSearchResultBean.getSemantic(), duiSearchResultBean.getQQListResult().getSongList().get(0));
            }
        } else if (duiSearchResultBean.getSearchType() == 2) {
            if (duiSearchResultBean.getAlbumList() != null && duiSearchResultBean.getAlbumList().size() > 0) {
                str = z.a(duiSearchResultBean.getAlbumList());
                bck.a("", duiSearchResultBean.getAlbumList().get(0).getId(), "", duiSearchResultBean.getSemantic().getIntents().getMusicSearchPlay().getIntentName(), z.a(duiSearchResultBean.getSemantic().getIntents().getMusicSearchPlay().getSlots()));
            } else if (duiSearchResultBean.getQQListResult().getAlbumList() != null && duiSearchResultBean.getQQListResult().getAlbumList().size() > 0) {
                str = z.a(duiSearchResultBean.getQQListResult().getAlbumList());
            }
        } else if (duiSearchResultBean.getSearchType() == 3) {
            if (duiSearchResultBean.getCollectList() != null && duiSearchResultBean.getCollectList().size() > 0) {
                str = z.a(duiSearchResultBean.getCollectList());
                bck.a("", duiSearchResultBean.getCollectList().get(0).getId(), "", duiSearchResultBean.getSemantic().getIntents().getMusicSearchPlay().getIntentName(), z.a(duiSearchResultBean.getSemantic().getIntents().getMusicSearchPlay().getSlots()));
            } else if (duiSearchResultBean.getQQListResult().getCollectList() != null && duiSearchResultBean.getQQListResult().getCollectList().size() > 0) {
                str = z.a(duiSearchResultBean.getQQListResult().getCollectList());
            }
        } else if (duiSearchResultBean.getSearchType() == 6) {
            if (duiSearchResultBean.getRadioList() != null && duiSearchResultBean.getRadioList().size() > 0) {
                str = z.a(duiSearchResultBean.getRadioList());
            } else if (duiSearchResultBean.getQQListResult().getRadioList() != null && duiSearchResultBean.getQQListResult().getRadioList().size() > 0) {
                str = z.a(duiSearchResultBean.getQQListResult().getRadioList());
            }
        } else if (duiSearchResultBean.getSearchType() == 5) {
            if (duiSearchResultBean.getReadingAlbumList() != null && duiSearchResultBean.getReadingAlbumList().size() > 0) {
                str = z.a(duiSearchResultBean.getReadingAlbumList());
                bck.a(duiSearchResultBean.getReadingAlbumList().get(0).getId(), duiSearchResultBean.getReadingAlbumList().get(0).getChannelId(), "", duiSearchResultBean.getQuery(), duiSearchResultBean.getSemantic().getIntents().getMusicSearchPlay().getIntentName(), z.a(duiSearchResultBean.getSemantic().getIntents().getMusicSearchPlay().getSlots()));
            } else if (duiSearchResultBean.getQQListResult().getReadingAlbumList() != null && duiSearchResultBean.getQQListResult().getReadingAlbumList().size() > 0) {
                str = z.a(duiSearchResultBean.getQQListResult().getReadingAlbumList());
            }
        }
        String str2 = "?voice_search_type=" + duiSearchResultBean.getSearchType();
        String version = be.a((CharSequence) duiSearchResultBean.getVersion()) ? "" : duiSearchResultBean.getVersion();
        if (TextUtils.isEmpty(version) && duiSearchResultBean.getQQListResult() != null) {
            version = "qqversion";
        }
        String str3 = str2 + "&voice_list_version=" + version;
        try {
            str3 = str3 + "&voice_list=" + URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
        }
        sp.a().a("/search/activity/main").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withString("fragment_uri", "/search/fragment/home/search_result" + str3).withString("search_voice_result", str).withString("voice_list_version", duiSearchResultBean.getVersion()).withString("search_voice_keyword", duiSearchResultBean.getKeyword()).withInt("search_voice_total_page", duiSearchResultBean.getPage() != null ? duiSearchResultBean.getPage().getTotalPage() : 1).withInt("search_voice_type", duiSearchResultBean.getSearchType()).withBoolean("voice_search_new_ver", true).navigation(com.xiaopeng.musicradio.utils.a.a().f() ? null : com.xiaopeng.musicradio.utils.a.a().c());
    }
}
