package defpackage;

import com.lzy.okgo.adapter.Call;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.request.PostRequest;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import com.xiaopeng.musicradio.bean.xpbean.CategoryAlbumListBean;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumDetailBean;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumSearchBean;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumTracksBean;
import com.xiaopeng.musicradio.bean.xpbean.GuessLikeListBean;
import com.xiaopeng.musicradio.bean.xpbean.HotRankListBean;
import com.xiaopeng.musicradio.bean.xpbean.PlayInfoBean;
import com.xiaopeng.musicradio.bean.xpbean.PlayTrackInfoBean;
import com.xiaopeng.musicradio.bean.xpbean.ReadingCategoryListBeanV3;
import com.xiaopeng.musicradio.bean.xpbean.ReadingHotRankListBean;
import com.xiaopeng.musicradio.bean.xpbean.ReadingTrackListBean;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsCardBean;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsChannelBean;
import com.xiaopeng.musicradio.common.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: XpFMModel.java */
/* renamed from: axp  reason: default package */
/* loaded from: classes2.dex */
public class axp {
    public static axp a() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: XpFMModel.java */
    /* renamed from: axp$a */
    /* loaded from: classes2.dex */
    public static class a {
        private static final axp a = new axp();
    }

    public Call<FMAlbumDetailBean> a(long j, avc<FMAlbumDetailBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(j));
        return ((auz) ((auz) ((auz) auu.a(b.b).params(hashMap, new boolean[0])).cacheKey("getFmAlbumDetails:" + j)).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
    }

    public Call<FMAlbumTracksBean> a(long j, int i, int i2, String str, avc<FMAlbumTracksBean> avcVar, String str2) {
        String str3 = "getFmAlbumTracks" + j;
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(j));
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(i2));
        hashMap.put("sort", str);
        if (str2 == null) {
            str2 = b.c;
        }
        return ((auz) ((auz) auu.a(str2).params(hashMap, new boolean[0])).tag(str3)).a(new ava(avcVar));
    }

    public Call<FMAlbumTracksBean> b(long j, avc<FMAlbumTracksBean> avcVar) {
        String str = "getFmCardIdTracks" + j;
        HashMap hashMap = new HashMap();
        hashMap.put("cardId", String.valueOf(j));
        return ((auz) ((auz) auu.a(b.d).params(hashMap, new boolean[0])).tag(str)).a(new ava(avcVar));
    }

    public Call<FMAlbumTracksBean> a(long j, long j2, int i, String str, avc<FMAlbumTracksBean> avcVar, String str2) {
        String str3 = "getFmAlbumSpecTracks" + j + j2;
        HashMap hashMap = new HashMap();
        hashMap.put("albumId", String.valueOf(j));
        if (str2 != null) {
            hashMap.put("id", String.valueOf(j));
        }
        hashMap.put("trackId", j2 + "");
        hashMap.put("pageSize", String.valueOf(i));
        hashMap.put("sort", str);
        if (str2 == null) {
            str2 = b.e;
        }
        return ((auz) ((auz) auu.a(str2).params(hashMap, new boolean[0])).tag(str3)).a(new ava(avcVar));
    }

    public Call<FMAlbumTracksBean> b(long j, long j2, int i, String str, avc<FMAlbumTracksBean> avcVar, String str2) {
        String str3 = "getFmAlbumSpecTracks" + j + j2;
        HashMap hashMap = new HashMap();
        hashMap.put("albumId", String.valueOf(j));
        if (str2 != null) {
            hashMap.put("id", String.valueOf(j));
        }
        hashMap.put("trackId", j2 + "");
        hashMap.put("pageSize", String.valueOf(i));
        hashMap.put("sort", str);
        if (str2 == null) {
            str2 = b.e;
        }
        return ((auz) ((auz) ((auz) ((auz) auu.a(str2).params(hashMap, new boolean[0])).tag(str3)).cacheKey("getFmAlbumSpecTracksFirst" + j + ":" + j2 + ":" + str + ":" + i)).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
    }

    public Call<FMAlbumSearchBean> a(String str, int i, int i2, avc<FMAlbumSearchBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("keyword", str);
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(i2));
        return ((auz) auu.a(b.f).params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<PlayInfoBean> a(long j, long j2, avc<PlayInfoBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(j));
        hashMap.put("albumId", String.valueOf(j2));
        return ((auz) auu.a(b.x).params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<PlayTrackInfoBean> b(long j, long j2, avc<PlayTrackInfoBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(j));
        hashMap.put("albumId", String.valueOf(j2));
        return ((auz) auu.a(b.y).params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<CategoryAlbumListBean> a(long j, boolean z, int i, int i2, avc<CategoryAlbumListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("categoryId", String.valueOf(j));
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(i2));
        if (z) {
            hashMap.put("random", "true");
        }
        auz auzVar = (auz) auu.a(b.i).params(hashMap, new boolean[0]);
        if (z) {
            ((auz) auzVar.cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey(String.format(Locale.getDefault(), "getCategoryAlbumList_%d", Long.valueOf(j)));
        }
        return auzVar.a(new ava(avcVar));
    }

    public Call<FMAlbumTracksBean> a(long j, long j2, int i, int i2, avc<FMAlbumTracksBean> avcVar) {
        LogUtils.i("XpFMModel", "getHeadSpeachTracklist albumId=%d, tid=%d, page=%d", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(i2));
        if (j != -1 && j2 != -1) {
            hashMap.put("trackId", String.valueOf(j2));
            hashMap.put("albumId", String.valueOf(j));
        }
        return ((auz) auu.a(b.l).params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<ReadingCategoryListBeanV3> a(boolean z, avc<ReadingCategoryListBeanV3> avcVar) {
        auz a2 = auu.a(b.q);
        if (z) {
            ((auz) a2.cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getReadingCategoryV3");
        }
        return a2.a(new ava(avcVar));
    }

    public void a(List<Long> list, avc<ReadingTrackListBean> avcVar) {
        ArrayList arrayList = new ArrayList();
        for (Long l : list) {
            arrayList.add(String.valueOf(l));
        }
        ((PostRequest) auu.b(b.m).addUrlParams("ids", arrayList)).execute(new ava(avcVar));
    }

    public Call<TodayNewsChannelBean> a(avc<TodayNewsChannelBean> avcVar) {
        return ((auz) ((auz) auu.a(b.r).cacheKey("todayNewsChannels")).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
    }

    public Call<TodayNewsCardBean> b(avc<TodayNewsCardBean> avcVar) {
        return auu.a(b.s).a(new ava(avcVar));
    }

    public void a(int i, avc<GuessLikeListBean> avcVar) {
        HashMap hashMap = new HashMap();
        String b = apd.a().b();
        hashMap.put("cityCode", b + "");
        hashMap.put("page", i + "");
        hashMap.put("pageSize", "20");
        ((auz) ((auz) ((auz) ((auz) auu.a(b.t).params(hashMap, new boolean[0])).tag("getGuessLike")).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("cityCode:" + b + ",page:" + i + ", pageSize:20")).a(new ava(avcVar));
    }

    public void c(avc<HotRankListBean> avcVar) {
        ((auz) ((auz) auu.a(b.u).cacheKey("hotrank")).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
    }

    public void a(int i, int i2, int i3, avc<ReadingHotRankListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("rankId", String.valueOf(i));
        hashMap.put("page", String.valueOf(i2));
        hashMap.put("pageSize", String.valueOf(i3));
        auz a2 = auu.a(b.v);
        ((auz) ((auz) a2.cacheKey("ranklist:page:" + i2 + ":pagesize:" + i3 + ":rankId:" + i)).params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public void a(Map<String, String> map, avc<BaseBean> avcVar) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            LogUtils.d("XpFMModel", "submitPlayRecord key:" + entry.getKey() + ", value:" + entry.getValue());
        }
        ((PostRequest) auu.b(b.w).params(map, new boolean[0])).execute(new ava(avcVar));
    }
}
