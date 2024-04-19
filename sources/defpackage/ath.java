package defpackage;

import android.util.Log;
import com.lzy.okgo.adapter.Call;
import com.lzy.okgo.cache.CacheMode;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.HotRadioResult;
import com.xiaopeng.musicradio.bean.xpbean.ListDetailBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicMatchBean;
import com.xiaopeng.musicradio.music.bean.MusicLyricBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: MusicRequestModel.java */
/* renamed from: ath  reason: default package */
/* loaded from: classes2.dex */
public class ath {

    /* compiled from: MusicRequestModel.java */
    /* renamed from: ath$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void a(List<MusicRadioItem> list);
    }

    public static ath a() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MusicRequestModel.java */
    /* renamed from: ath$a */
    /* loaded from: classes2.dex */
    public static class a {
        private static ath a = new ath();
    }

    public Call<MusicMatchBean> a(String str, avc<MusicMatchBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("hash", str);
        auz a2 = auu.a("https://xmart.xiaopeng.com/media/v3/music/songs/detail");
        return ((auz) ((auz) ((auz) ((auz) ((auz) a2.params(hashMap, new boolean[0])).cacheKey("songid_" + str)).cacheMode(CacheMode.REQUEST_FAILED_READ_CACHE)).cachePolicy(new avd(a2))).cacheTime(604800000L)).a(new ava(avcVar));
    }

    public Call<ListDetailBean> b(String str, avc<ListDetailBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("hashList", str);
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/songs/listDetail").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<MusicLyricBean> c(String str, avc<MusicLyricBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("hash", str);
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/songs/lyric").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public void a(final b bVar, final int i) {
        Log.i("MusicRequestModel", "getRadioData start");
        aqz.a().a(new avc<HotRadioResult>() { // from class: ath.1
            @Override // defpackage.avc
            public void a(HotRadioResult hotRadioResult) {
                Log.i("MusicRequestModel", "getRadioData getresult");
                if (hotRadioResult == null || hotRadioResult.getData() == null || hotRadioResult.getData().getList() == null || hotRadioResult.getData().getList().size() == 0) {
                    bVar.a();
                    return;
                }
                List<HotRadioResult.DataBean.ListBean> list = hotRadioResult.getData().getList();
                ArrayList arrayList = new ArrayList();
                for (HotRadioResult.DataBean.ListBean listBean : list) {
                    MusicRadioItem musicRadioItem = new MusicRadioItem();
                    musicRadioItem.setType(ListSignBean.LISTSIGN_TAGS);
                    musicRadioItem.setName(listBean.getRadioName());
                    musicRadioItem.setTitle(listBean.getRadioName());
                    musicRadioItem.setLogoUrl(listBean.getRadioPic());
                    musicRadioItem.setId(listBean.getRadioId());
                    arrayList.add(musicRadioItem);
                }
                if (i > 0) {
                    Log.i("MusicRequestModel", "getRadioData datas.size():" + arrayList.size());
                    int size = arrayList.size();
                    int i2 = i;
                    if (size >= i2) {
                        bVar.a(arrayList.subList(0, i2));
                        return;
                    }
                    Log.i("MusicRequestModel", "getRadioData error");
                    bVar.a();
                    return;
                }
                bVar.a(arrayList);
            }

            @Override // defpackage.avc
            public void a(int i2, String str) {
                Log.i("MusicRequestModel", "getRadioData error");
                bVar.a();
            }
        });
    }
}
