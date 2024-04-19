package com.xiaopeng.musicradio.service;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.n;
import com.google.android.exoplayer2.C;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.MusicListPlayReq;
import com.xiaopeng.musicradio.bean.common.PageBean;
import com.xiaopeng.musicradio.bean.dao.MusicAlbumCollectDao;
import com.xiaopeng.musicradio.bean.db.LatelyMusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCollect;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCustom;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.MinePlayListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumType;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.SongListBean;
import com.xiaopeng.musicradio.datalist.d;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.model.bluetooth.l;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.ab;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.ae;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.bb;
import com.xiaopeng.musicradio.utils.be;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class MusicMineService extends a implements ard {
    private static final String TAG = "MusicMineService";

    @Override // com.xiaopeng.musicradio.service.a
    protected void a() {
    }

    public <T> T addDetailPlayList(long j, Object obj) {
        return null;
    }

    public <T> T addPlayList(String str) {
        return null;
    }

    public void checkoutDataBlue() {
    }

    public void checkoutDataCollect() {
    }

    public <T> T deleteDetailPlayList(Object obj) {
        return null;
    }

    public <T> T deletePlayList(long j, int i) {
        return null;
    }

    public <T> T editPlayList(long j, String str) {
        return null;
    }

    public <T> T getAlbumMusicHashList(long j) {
        return null;
    }

    @Override // defpackage.ard
    public <T> T removeBlueMusic(Object obj) {
        return null;
    }

    @Override // defpackage.ard
    public <T> T getCollectedMusicList(Object obj) {
        return (T) getCollectedMusicList(obj, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, androidx.lifecycle.n] */
    public <T> T getCollectedMusicList(Object obj, final boolean z) {
        final e eVar = (e) obj;
        final ?? r0 = (T) new n();
        if (!apx.a().d()) {
            r0.a(f.a(eVar, "getCollectedMusicList"));
            return r0;
        }
        if (eVar.d == 1) {
            ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.service.MusicMineService.1
                @Override // java.lang.Runnable
                public void run() {
                    int b = anc.a().b(aqh.a().b());
                    r0.a((n) f.a(eVar, eVar.d < b, eVar.d + 1, b, ae.a(anv.a().a(50, true), eVar.f), "getCollectedMusicList"));
                }
            });
        } else if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a())) {
            LogUtils.e(TAG, "getCollectedMusicList:Network");
            r0.a(d.a(eVar, 0, "", "getCollectedMusicList"));
        } else {
            anf.a(eVar.d, eVar.f, new avc<SongListBean>() { // from class: com.xiaopeng.musicradio.service.MusicMineService.6
                @Override // defpackage.avc
                public void a(SongListBean songListBean) {
                    SongListBean.DataBean data = songListBean != null ? songListBean.getData() : null;
                    SongListBean.DataBean.PageBean page = data != null ? data.getPage() : null;
                    if (data == null || page == null) {
                        a(0, "");
                        return;
                    }
                    List<MusicSongBean> list = data.getList();
                    int totalPage = page.getTotalPage();
                    boolean z2 = eVar.d < totalPage;
                    int i = eVar.d + 1;
                    ArrayList arrayList = new ArrayList();
                    if (list != null) {
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            MusicInfo b = ab.b(list.get(i2));
                            if (b != null) {
                                b.setCreatime(and.a(eVar.d, i2));
                                b.setCanUp(false);
                                arrayList.add(b);
                            }
                        }
                    }
                    anv.a().a((List<MusicInfo>) arrayList, false);
                    f a = f.a(eVar, z2, i, totalPage, arrayList, "getCollectedMusicList");
                    apb.a().a((List<MusicInfo>) arrayList, true);
                    r0.a((n) a);
                    if (z || !z2) {
                        return;
                    }
                    MusicMineService.this.getCollectedMusicList(new e(0, 0, true, eVar.d + 1, 0L, eVar.f), true);
                }

                @Override // defpackage.avc
                public void a(int i, String str) {
                    LogUtils.e(MusicMineService.TAG, "getCollectedMusicList:" + i + ListSignBean.COLLECTID_SUFFIX + str);
                    r0.a((n) d.a(eVar, i, str, "getCollectedMusicList"));
                }
            });
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.ard
    public <T> T getCollectedAlbumList(Object obj) {
        final e eVar = (e) obj;
        final ?? r0 = (T) new n();
        if (!apx.a().d()) {
            r0.a(f.a(eVar, "getCollectedAlbumList"));
            return r0;
        }
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.service.MusicMineService.7
            @Override // java.lang.Runnable
            public void run() {
                List<MusicAlbumCollect> a = ant.a().a(eVar.f, eVar.e, MusicAlbumCollectDao.Properties.CacheTime);
                ArrayList arrayList = new ArrayList();
                for (MusicAlbumCollect musicAlbumCollect : a) {
                    arrayList.add(ab.a(musicAlbumCollect, ListSignBean.LISTSIGN_RECOMMEN_MUSIC));
                }
                boolean z = a != null && a.size() >= eVar.f;
                r0.a((n) f.a(eVar, z, z ? a.get(a.size() - 1).getCacheTime() : 0L, arrayList, "getCollectedAlbumList"));
            }
        });
        return r0;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.ard
    public <T> T getHistoryMusicList(int i) {
        final ?? r2 = (T) new n();
        if (!apx.a().d()) {
            r2.a(new ArrayList());
            return r2;
        }
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.service.MusicMineService.8
            @Override // java.lang.Runnable
            public void run() {
                List<LatelyMusicInfo> b = anr.a().b();
                ArrayList arrayList = new ArrayList();
                for (LatelyMusicInfo latelyMusicInfo : b) {
                    arrayList.add(ab.a(latelyMusicInfo));
                }
                r2.a((n) arrayList);
            }
        });
        return r2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.ard
    public <T> T getHistoryAlbumList(Object obj) {
        final e eVar = (e) obj;
        final ?? r0 = (T) new n();
        if (!apx.a().d()) {
            r0.a(f.a(eVar, "getHistoryAlbumList"));
            return r0;
        }
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.service.MusicMineService.9
            @Override // java.lang.Runnable
            public void run() {
                List<MusicRadioItem> a = ams.a().a(eVar.f, eVar.e);
                boolean z = a.size() >= eVar.f;
                r0.a((n) f.a(eVar, z, z ? a.get(a.size() - 1).getCacheTime() : 0L, a, "getHistoryAlbumList"));
            }
        });
        return r0;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.ard
    public <T> T getMobileAlbumList(int i) {
        ?? r2 = (T) new n();
        r2.a(new ArrayList());
        return r2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.ard
    public <T> T getUserAlbumList(Object obj) {
        final e eVar = (e) obj;
        final ?? r0 = (T) new n();
        if (!apx.a().d()) {
            r0.a(f.a(eVar, "getUserAlbumList"));
            return r0;
        }
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.service.MusicMineService.10
            @Override // java.lang.Runnable
            public void run() {
                List<MusicAlbumCustom> a = anu.a().a(eVar.f, eVar.e);
                ArrayList arrayList = new ArrayList();
                if (a != null && !a.isEmpty()) {
                    for (int i = 0; i < a.size(); i++) {
                        arrayList.add(ab.a(a.get(i)));
                    }
                }
                boolean z = arrayList.size() >= eVar.f;
                r0.a((n) f.a(eVar, z, z ? ((MusicRadioItem) arrayList.get(arrayList.size() - 1)).getCacheTime() : 0L, arrayList, "getUserAlbumList"));
            }
        });
        return r0;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.ard
    public <T> T getBlueMusicList(int i) {
        ?? r2 = (T) new n();
        r2.a(new ArrayList());
        return r2;
    }

    @Override // defpackage.ard
    public boolean isCollectedMusic(Object obj) {
        if (obj instanceof MusicInfo) {
            return anv.a().e((MusicInfo) obj);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.ard
    public <T> T setCollectedMusic(final Object obj, final boolean z) {
        LogUtils.i(TAG, "setCollectedMusic:target=" + obj + ",collect=" + z);
        final ?? r0 = (T) new n();
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.service.MusicMineService.11
            @Override // java.lang.Runnable
            public void run() {
                Object obj2 = obj;
                if (obj2 instanceof List) {
                    if (!z) {
                        anc.a().a((List) obj);
                    }
                    r0.a((n) true);
                } else if (obj2 instanceof MusicInfo) {
                    if (z) {
                        anc.a().c((MusicInfo) obj);
                    } else {
                        anc.a().d((MusicInfo) obj);
                    }
                    r0.a((n) true);
                } else {
                    r0.a((n) false);
                }
            }
        });
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.ard
    public <T> T setCollectedAlbum(final Object obj, final boolean z) {
        LogUtils.i(TAG, "removeCollectedAlbum:target=" + obj + ",collect=" + z);
        final ?? r0 = (T) new n();
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.service.MusicMineService.12
            @Override // java.lang.Runnable
            public void run() {
                if (obj instanceof MusicRadioItem) {
                    if (z) {
                        anc.a().b(ab.a((MusicRadioItem) obj), r0);
                        return;
                    } else {
                        anc.a().a(ab.a((MusicRadioItem) obj), r0);
                        return;
                    }
                }
                r0.a((n) false);
            }
        });
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.ard
    public <T> T removeHistoryMusic(final Object obj) {
        LogUtils.i(TAG, "removeHistoryMusic:target=" + obj);
        final ?? r0 = (T) new n();
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.service.MusicMineService.13
            @Override // java.lang.Runnable
            public void run() {
                Object obj2 = obj;
                if (obj2 instanceof List) {
                    List<MusicInfo> list = (List) obj2;
                    for (MusicInfo musicInfo : list) {
                        aos.a().a(list);
                    }
                    r0.a((n) true);
                    return;
                }
                r0.a((n) false);
            }
        });
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.ard
    public <T> T removeHistoryAlbum(final Object obj) {
        LogUtils.i(TAG, "removeHistoryAlbum:target=" + obj);
        final ?? r0 = (T) new n();
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.service.MusicMineService.2
            @Override // java.lang.Runnable
            public void run() {
                if (obj instanceof MusicRadioItem) {
                    ams.a().b((MusicRadioItem) obj);
                    r0.a((n) true);
                    return;
                }
                r0.a((n) false);
            }
        });
        return r0;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, androidx.lifecycle.n] */
    public <T> T removeImportAlbum(Object obj) {
        LogUtils.i(TAG, "removeImportAlbum:target=" + obj);
        ?? r4 = (T) new n();
        r4.a(false);
        return r4;
    }

    public void play() {
        apk.i().play();
    }

    public void pause() {
        apk.i().pause();
    }

    public void play(List list, String str) {
        apk.i().a(list, str);
    }

    @Override // defpackage.ard
    public void play(List list, Object obj, String str) {
        LogUtils.i(TAG, "play(targetList):target=" + obj + ",listSign=" + str);
        if (apk.i().y()) {
            LogUtils.i(TAG, "play:play skipped");
        } else {
            playCurrentInternal(list, (MusicInfo) obj, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r0 == 3) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void playCurrentInternal(java.util.List<com.xiaopeng.musicradio.bean.db.MusicInfo> r6, com.xiaopeng.musicradio.bean.db.MusicInfo r7, java.lang.String r8) {
        /*
            r5 = this;
            apk r0 = defpackage.apk.i()
            com.xiaopeng.musicradio.bean.db.MusicInfo r0 = r0.u()
            r1 = 1
            if (r0 == 0) goto L49
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L49
            apk r0 = defpackage.apk.i()
            int r0 = r0.getPlayState()
            java.lang.String r2 = "MusicMineService"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "playCurrent:playing:target="
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = ",playState="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.xiaopeng.lib.utils.LogUtils.i(r2, r3)
            if (r0 == r1) goto L41
            r2 = 2
            if (r0 != r2) goto L3d
            goto L41
        L3d:
            r2 = 3
            if (r0 != r2) goto L49
            goto L4a
        L41:
            apk r6 = defpackage.apk.i()
            r6.pause()
            return
        L49:
            r1 = 0
        L4a:
            boolean r0 = r5.isListSignPlayed(r8)
            if (r0 == 0) goto L5a
            if (r1 == 0) goto L5a
            apk r6 = defpackage.apk.i()
            r6.play()
            goto L61
        L5a:
            apk r0 = defpackage.apk.i()
            r0.a(r6, r7, r8)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.service.MusicMineService.playCurrentInternal(java.util.List, com.xiaopeng.musicradio.bean.db.MusicInfo, java.lang.String):void");
    }

    @Override // defpackage.ard
    public void playMusicInfo(Object obj, String str) {
        LogUtils.i(TAG, "play:target=" + obj);
        if (obj == null || apk.i().y()) {
            LogUtils.i(TAG, "play:play skipped");
            return;
        }
        int playState = apk.i().getPlayState();
        if (playState == 1 || playState == 2) {
            if (isListSignPlayed(str)) {
                apk.i().pause();
            } else {
                apk.i().a((List) obj, str);
            }
        } else if (playState == 3) {
            if (isListSignPlayed(str)) {
                apk.i().play();
            } else {
                apk.i().a((List) obj, str);
            }
        } else {
            apk.i().a((List) obj, str);
        }
    }

    public boolean isListSignPlayed(String str) {
        String x = apk.i().x();
        return !TextUtils.isEmpty(x) && x.equals(str);
    }

    @Override // defpackage.ard
    public void play(Object obj, ari ariVar) {
        LogUtils.i(TAG, "play(callback):target=" + obj);
        if (apk.i().y()) {
            LogUtils.i(TAG, "play(callback):play skipped");
        } else if (obj instanceof MusicRadioItem) {
            MusicRadioItem musicRadioItem = (MusicRadioItem) obj;
            if (TextUtils.equals(musicRadioItem.getType(), ListSignBean.LISTSIGN_LOCAL_RM_MUSIC)) {
                ArrayList<MusicInfo> b = amr.a().b();
                atf.a().a(au.d(2000L, be.a(b.f.dudition_title)).toJson(), b);
            } else {
                a(null, null, 0, 1, au.a(musicRadioItem).toJson(), 50, ariVar);
            }
            ams.a().a(musicRadioItem);
        } else if (obj instanceof MusicAlbumCollect) {
            MusicAlbumCollect musicAlbumCollect = (MusicAlbumCollect) obj;
            a(musicAlbumCollect.getId(), MusicAlbumType.revertType(musicAlbumCollect.getType()), musicAlbumCollect.getName(), musicAlbumCollect.getLogo(), ariVar);
        } else if (obj instanceof MusicListPlayReq) {
            MusicListPlayReq musicListPlayReq = (MusicListPlayReq) obj;
            a(musicListPlayReq.targetList, musicListPlayReq.target, musicListPlayReq.page, musicListPlayReq.totalPage, musicListPlayReq.listSign, 50, ariVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.List<com.xiaopeng.musicradio.bean.db.MusicInfo> r15, com.xiaopeng.musicradio.bean.db.MusicInfo r16, int r17, int r18, java.lang.String r19, int r20, final defpackage.ari r21) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.service.MusicMineService.a(java.util.List, com.xiaopeng.musicradio.bean.db.MusicInfo, int, int, java.lang.String, int, ari):void");
    }

    private void a(long j, int i, String str, String str2, ari ariVar) {
        atf.a().a(au.c(j, str, i).toJson());
    }

    @Override // defpackage.ard
    public String getListSign(Object obj) {
        if (obj instanceof MusicRadioItem) {
            return au.a((MusicRadioItem) obj).toJson();
        }
        if (obj instanceof MinePlayListBean.DataBean.ListBean) {
            MinePlayListBean.DataBean.ListBean listBean = (MinePlayListBean.DataBean.ListBean) obj;
            return au.e(listBean.getId(), listBean.getName()).toJson();
        } else if (obj instanceof MusicAlbumCollect) {
            MusicAlbumCollect musicAlbumCollect = (MusicAlbumCollect) obj;
            return au.c(musicAlbumCollect.getId(), musicAlbumCollect.getName(), MusicAlbumType.revertType(musicAlbumCollect.getType())).toJson();
        } else if (obj instanceof Integer) {
            return ad.b(((Integer) obj).intValue());
        } else {
            return null;
        }
    }

    @Override // defpackage.ard
    public <T> T getPlayingMusic() {
        return (T) apk.i().u();
    }

    @Override // defpackage.ard
    public int getPlayState() {
        return apk.i().getPlayState();
    }

    @Override // defpackage.ard
    public void startDetail(Context context, Object obj, String str) {
        LogUtils.i(TAG, "startDetail:target=" + obj + ",fromSource=" + str);
        if (obj instanceof MusicRadioItem) {
            MusicRadioItem musicRadioItem = (MusicRadioItem) obj;
            if (ListSignBean.LISTSIGN_RANK_MUSIC.equals(musicRadioItem.getType())) {
                sp.a().a("/music/activity/fav_rank_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("detail_id", musicRadioItem.getId()).withString("detail_LOGO", musicRadioItem.getImgUrl()).withString("detail_title", musicRadioItem.getRankName()).withInt("detail_type", musicRadioItem.getRankType()).withLong("detail_showTime", musicRadioItem.getShowTime()).navigation();
            } else if (ListSignBean.LISTSIGN_RECOMMEN_MUSIC.equals(musicRadioItem.getType())) {
                if (musicRadioItem.getId() == -1000) {
                    sp.a().a("/music/activity/fav_daily_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).navigation();
                } else {
                    atz.a(musicRadioItem.getId(), musicRadioItem.getLogoUrl(), musicRadioItem.getName(), musicRadioItem.getDescription());
                }
            }
        }
    }

    @Override // defpackage.ard
    public void fetchCollectedAlbum() {
        anb.a().c();
    }

    @Override // defpackage.ard
    public void fetchCollectedAlbum(int i) {
        anb.a().a(i, false);
    }

    public void fetchCustomAlbum() {
        anb.a().a(2, false);
    }

    @Override // defpackage.ard
    public void fetchCustomAlbumIfRequire() {
        fetchCustomAlbum();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.ard
    public <T> T getDetailPlayList(long j, Object obj) {
        final e eVar = (e) obj;
        final ?? r0 = (T) new n();
        if (!apx.a().d()) {
            r0.a(f.a(eVar, "getCollectedMusicList"));
            return r0;
        }
        anf.a(j, eVar.d, eVar.f, new avc<MusicCollectSongListBean>() { // from class: com.xiaopeng.musicradio.service.MusicMineService.5
            @Override // defpackage.avc
            public void a(MusicCollectSongListBean musicCollectSongListBean) {
                MusicCollectSongListBean.DataBean data = musicCollectSongListBean != null ? musicCollectSongListBean.getData() : null;
                PageBean page = data != null ? data.getPage() : null;
                if (data == null || page == null) {
                    a(0, "");
                    return;
                }
                List<MusicSongBean> list = data.getList();
                int totalPage = page.getTotalPage();
                boolean z = eVar.d < totalPage;
                int i = eVar.d + 1;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        MusicInfo a = ab.a(list.get(i2), musicCollectSongListBean.isFromCache());
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                }
                f a2 = f.a(eVar, z, i, totalPage, page.getTotal(), arrayList, "getDetailPlayList");
                if (!musicCollectSongListBean.isFromCache()) {
                    bb.a(list);
                }
                r0.a((n) a2);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                LogUtils.e(MusicMineService.TAG, "getDetailPlayList:" + i + ListSignBean.COLLECTID_SUFFIX + str);
                r0.a((n) d.a(eVar, i, str, "getDetailPlayList"));
            }
        });
        return r0;
    }

    @Override // defpackage.ard
    public boolean isNewMatchedBlue(Object obj) {
        if (obj instanceof MusicInfo) {
            MusicInfo musicInfo = (MusicInfo) obj;
            boolean z = musicInfo.getMusicFrom() == 20;
            String hash = musicInfo.getHash();
            boolean contains = l.c().d().contains(hash);
            if (z && contains) {
                l.c().a(hash);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ard
    public boolean isCollectedAlbum(Object obj) {
        if (obj instanceof MusicRadioItem) {
            return ant.a().a(((MusicRadioItem) obj).getId());
        }
        if (obj instanceof Long) {
            return ant.a().a(((Long) obj).longValue());
        }
        return false;
    }
}
