package defpackage;

import android.util.Log;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.HotRadioResult;
import com.xiaopeng.musicradio.bean.xpbean.MainHotSingerResultBean;
import com.xiaopeng.musicradio.bean.xpbean.RankMusicResult;
import com.xiaopeng.musicradio.bean.xpbean.RecommentMusicResult;
import com.xiaopeng.musicradio.bean.xpbean.XpPlayInfo;
import com.xiaopeng.musicradio.bean.xpbean.XpPlayMusicResult;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function5;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RxConcentrationModel.java */
/* renamed from: aqw  reason: default package */
/* loaded from: classes2.dex */
public class aqw {
    public static aqw a() {
        return b.a;
    }

    /* compiled from: RxConcentrationModel.java */
    /* renamed from: aqw$b */
    /* loaded from: classes2.dex */
    private static class b {
        private static final aqw a = new aqw();
    }

    public void a(final aqv aqvVar, String str, int i, int i2, int i3) {
        Log.i("RxConcentrationModel", "getConcentrationData start");
        Observable.zip(aqx.a(str, i, i2, i3), aqx.a(), aqx.b(), aqx.c(), aqx.d(), new Function5<RecommentMusicResult, RankMusicResult, XpPlayMusicResult, MainHotSingerResultBean, HotRadioResult, a>() { // from class: aqw.3
            @Override // io.reactivex.functions.Function5
            /* renamed from: a */
            public a apply(RecommentMusicResult recommentMusicResult, RankMusicResult rankMusicResult, XpPlayMusicResult xpPlayMusicResult, MainHotSingerResultBean mainHotSingerResultBean, HotRadioResult hotRadioResult) {
                Log.i("RxConcentrationModel", "getConcentrationData hasresult");
                a aVar = new a();
                aqw.this.a(aVar, recommentMusicResult, rankMusicResult, xpPlayMusicResult, mainHotSingerResultBean, hotRadioResult);
                return aVar;
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<a>() { // from class: aqw.1
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(a aVar) {
                if (aVar != null) {
                    Log.i("RxConcentrationModel", "setQQConcentration success");
                    aqvVar.a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e);
                    return;
                }
                aqvVar.a();
            }
        }, new Consumer<Throwable>() { // from class: aqw.2
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Throwable th) {
                aqvVar.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxConcentrationModel.java */
    /* renamed from: aqw$a */
    /* loaded from: classes2.dex */
    public class a {
        List<MusicRadioItem> a;
        List<MusicRadioItem> b;
        XpPlayInfo c;
        List<MainHotSingerResultBean.DataBean.ArtistGroupsBean.ListBean> d;
        List<MusicRadioItem> e;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a a(a aVar, RecommentMusicResult recommentMusicResult, RankMusicResult rankMusicResult, XpPlayMusicResult xpPlayMusicResult, MainHotSingerResultBean mainHotSingerResultBean, HotRadioResult hotRadioResult) {
        if (recommentMusicResult == null || recommentMusicResult.getData() == null || recommentMusicResult.getData().getList() == null || recommentMusicResult.getData().getList().size() < 12) {
            Log.i("RxConcentrationModel", "recommentMusicResult error");
            return null;
        }
        List<MusicRadioItem> list = recommentMusicResult.getData().getList();
        for (MusicRadioItem musicRadioItem : list) {
            musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
            musicRadioItem.setTitle(musicRadioItem.getName());
            musicRadioItem.setName(musicRadioItem.getName());
            musicRadioItem.setLogoUrl(musicRadioItem.getLogo());
        }
        Log.i("RxConcentrationModel", "recommentMusicResult success");
        aVar.a = list.subList(0, 12);
        if (rankMusicResult == null || rankMusicResult.getData() == null || rankMusicResult.getData().getList() == null || rankMusicResult.getData().getList().size() < 4) {
            Log.i("RxConcentrationModel", "rankMusicResult error");
            return null;
        }
        List<MusicRadioItem> list2 = rankMusicResult.getData().getList();
        for (MusicRadioItem musicRadioItem2 : list2) {
            musicRadioItem2.setType(ListSignBean.LISTSIGN_RANK_MUSIC);
            musicRadioItem2.setTitle(musicRadioItem2.getRankName());
            musicRadioItem2.setName(musicRadioItem2.getRankName());
            musicRadioItem2.setId(musicRadioItem2.getRankId());
            musicRadioItem2.setLogoUrl(musicRadioItem2.getImgUrl());
            atj.a().a(musicRadioItem2.getRankId(), musicRadioItem2.getImgUrl());
        }
        Log.i("RxConcentrationModel", "rankMusicResult error");
        aVar.b = list2.subList(0, 4);
        if (xpPlayMusicResult == null || xpPlayMusicResult.getData() == null || xpPlayMusicResult.getData().getCollectList() == null || xpPlayMusicResult.getData().getCollectList().size() < 4) {
            Log.i("RxConcentrationModel", "xpPlayMusicResult error");
            return null;
        }
        List<MusicRadioItem> collectList = xpPlayMusicResult.getData().getCollectList();
        for (MusicRadioItem musicRadioItem3 : collectList) {
            musicRadioItem3.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
            musicRadioItem3.setTitle(musicRadioItem3.getName());
            musicRadioItem3.setName(musicRadioItem3.getName());
            musicRadioItem3.setLogoUrl(musicRadioItem3.getLogo());
        }
        XpPlayInfo xpPlayInfo = new XpPlayInfo();
        xpPlayInfo.setName(xpPlayMusicResult.getData().getName());
        xpPlayInfo.setCategoryId(xpPlayMusicResult.getData().getCategoryId());
        xpPlayInfo.setCollectList(collectList.subList(0, 4));
        Log.i("RxConcentrationModel", "xpPlayMusicResult success");
        aVar.c = xpPlayInfo;
        if (mainHotSingerResultBean == null || mainHotSingerResultBean.getData() == null || mainHotSingerResultBean.getData() == null || mainHotSingerResultBean.getData().size() < 8) {
            Log.i("RxConcentrationModel", "mainHotSingerResultBean error");
            return null;
        }
        List<MainHotSingerResultBean.DataBean.ArtistGroupsBean.ListBean> data = mainHotSingerResultBean.getData();
        Log.i("RxConcentrationModel", "mainHotSingerResultBean success");
        aVar.d = data.subList(0, 8);
        if (hotRadioResult == null || hotRadioResult.getData() == null || hotRadioResult.getData().getList() == null || hotRadioResult.getData().getList().size() < 12) {
            Log.i("RxConcentrationModel", "hotRadioResult error");
            return null;
        }
        List<HotRadioResult.DataBean.ListBean> list3 = hotRadioResult.getData().getList();
        ArrayList arrayList = new ArrayList();
        for (HotRadioResult.DataBean.ListBean listBean : list3) {
            MusicRadioItem musicRadioItem4 = new MusicRadioItem();
            musicRadioItem4.setType(ListSignBean.LISTSIGN_TAGS);
            musicRadioItem4.setName(listBean.getRadioName());
            musicRadioItem4.setTitle(listBean.getRadioName());
            musicRadioItem4.setLogoUrl(listBean.getRadioPic());
            musicRadioItem4.setId(listBean.getRadioId());
            arrayList.add(musicRadioItem4);
        }
        Log.i("RxConcentrationModel", "hotRadioResult success");
        aVar.e = arrayList.subList(0, 12);
        return aVar;
    }
}
