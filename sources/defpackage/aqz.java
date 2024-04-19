package defpackage;

import android.util.Log;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.adapter.Call;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.request.PostRequest;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.VipMusicMainZoneResult;
import com.xiaopeng.musicradio.bean.VipMusicMoreDetails;
import com.xiaopeng.musicradio.bean.VipMusicMoreInfo;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import com.xiaopeng.musicradio.bean.xpbean.HotRadioResult;
import com.xiaopeng.musicradio.bean.xpbean.MainHotSingerResultBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumResult;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectDetailResult;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicMatchBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.RankMusicResult;
import com.xiaopeng.musicradio.bean.xpbean.ReCollectLabelsResult;
import com.xiaopeng.musicradio.bean.xpbean.RecommentMusicResult;
import com.xiaopeng.musicradio.bean.xpbean.SingerIndexResult;
import com.xiaopeng.musicradio.bean.xpbean.SingerResultBean;
import com.xiaopeng.musicradio.bean.xpbean.SongSingerListResultBean;
import com.xiaopeng.musicradio.bean.xpbean.XpPlayMusicResult;
import com.xiaopeng.musicradio.utils.bj;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import java.util.HashMap;
/* compiled from: XpMusciModel.java */
/* renamed from: aqz  reason: default package */
/* loaded from: classes2.dex */
public class aqz {
    public static aqz a() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: XpMusciModel.java */
    /* renamed from: aqz$a */
    /* loaded from: classes2.dex */
    public static class a {
        private static final aqz a = new aqz();
    }

    public Call<MusicCollectDetailResult> a(long j, avc<MusicCollectDetailResult> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(j));
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/music/collects/detail").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<MusicMatchBean> a(String str, String str2, avc<MusicMatchBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("artistName", str);
        hashMap.put("songName", str2);
        LogUtils.i("XpMusciModel", "matchNetMusic singer:" + str + ", song:" + str2);
        return ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/songs/get").cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<MusicAlbumSongListBean> b(long j, avc<MusicAlbumSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("albumId", String.valueOf(j));
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/music/albums/songList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> a(long j, int i, int i2, int i3, avc<MusicCollectSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(j));
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(i2));
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/collects/songList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> b(long j, int i, int i2, int i3, avc<MusicCollectSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(j));
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(i2));
        if (i == 1) {
            return ((auz) ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/collects/songList").params(hashMap, new boolean[0])).cacheKey("getMusicCollectSongListForDialog" + j + i)).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheTime(604800000L)).a(new ava(avcVar));
        }
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/collects/songList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<MusicAlbumResult> c(long j, avc<MusicAlbumResult> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(j));
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/music/albums/detail").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> c(long j, int i, int i2, int i3, avc<MusicCollectSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        String str = "https://xmart.xiaopeng.com/media/v2/music/radios/recommendRadio/songList";
        if (w.f() == 1) {
            if (i3 == 0) {
                str = "https://xmart.xiaopeng.com/media/v2/music/radios/musicRadio/songList";
            } else {
                hashMap.put(VuiConstants.ELEMENT_TYPE, String.valueOf(i3));
            }
            hashMap.put("id", String.valueOf(j));
        } else {
            str = "https://xmart.xiaopeng.com/media/v3/music/radio/radioSongList";
            hashMap.put("radioId", String.valueOf(j));
        }
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(i2));
        return ((auz) auu.a(str).params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> a(long j, int i, int i2, avc<MusicCollectSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        if (w.f() == 1) {
            hashMap.put("artistId", String.valueOf(j));
            hashMap.put("isRadio", String.valueOf(false));
        } else {
            hashMap.put("singerId", String.valueOf(j));
        }
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(i2));
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/singer/songList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> b(long j, int i, int i2, avc<MusicCollectSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        if (w.f() == 1) {
            hashMap.put("artistId", String.valueOf(j));
            hashMap.put("isRadio", String.valueOf(false));
        } else {
            hashMap.put("singerId", String.valueOf(j));
        }
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(i2));
        if (i == 1) {
            return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/singer/songList").params(hashMap, new boolean[0])).cacheKey("getArtistSongList" + j + i)).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
        }
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/singer/songList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<HotRadioResult> a(avc<HotRadioResult> avcVar) {
        return ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/radio/selectedRadioList").cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getHotRadio")).a(new ava(avcVar));
    }

    public Call<MusicAlbumSongListBean> a(long j, int i, avc<MusicAlbumSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(j));
        hashMap.put(VuiConstants.ELEMENT_TYPE, String.valueOf(i));
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/users/favourites/collects/songList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> a(long j, int i, String str, avc<MusicCollectSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(j));
        hashMap.put(VuiConstants.ELEMENT_TYPE, String.valueOf(i));
        return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/users/favourites/collects/songList").params(hashMap, new boolean[0])).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getUserFavouritesCollectsSonglistV2" + j + str)).a(new ava(avcVar));
    }

    public Call<MusicSongListBean> b(avc<MusicSongListBean> avcVar) {
        return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/music/songs/hot").cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).tag("okgo_hotword")).cacheKey("XP_MUSIC_HOT_SONGLIST")).a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> c(avc<MusicCollectSongListBean> avcVar) {
        return ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/songs/dailyRecommend").cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getDailyRecommend")).a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> d(avc<MusicCollectSongListBean> avcVar) {
        return auu.a("https://xmart.xiaopeng.com/media/v3/music/radio/customRadioSongList").a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> e(avc<MusicCollectSongListBean> avcVar) {
        return auu.a("https://xmart.xiaopeng.com/media/v3/music/songs/dailyRecommend").a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> d(long j, int i, int i2, int i3, avc<MusicCollectSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("rankId", String.valueOf(j));
        hashMap.put("page", String.valueOf(i2));
        hashMap.put("pageSize", String.valueOf(i3));
        hashMap.put("rankType", String.valueOf(i));
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/rank/songList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> e(long j, int i, int i2, int i3, avc<MusicCollectSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("rankId", String.valueOf(j));
        hashMap.put("page", String.valueOf(i2));
        hashMap.put("pageSize", String.valueOf(i3));
        if (w.f() == 1) {
            hashMap.put("rankType", String.valueOf(i));
        }
        if (i2 == 1) {
            return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/rank/songList").params(hashMap, new boolean[0])).cacheKey("getRankMusicSongList" + j + i2)).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
        }
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/rank/songList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<SingerResultBean> a(int i, int i2, avc<SingerResultBean> avcVar) {
        OkGo.getInstance().cancelTag("CALL_SINGER_TAG");
        HashMap hashMap = new HashMap();
        OkGo.getInstance().cancelTag("getArtistsList");
        hashMap.put(VuiConstants.ELEMENT_TYPE, String.valueOf(i));
        hashMap.put("sexType", String.valueOf(i2));
        hashMap.put("showType", String.valueOf(2));
        return ((auz) ((auz) ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/music/artists/list").tag("getArtistsList")).params(hashMap, new boolean[0])).cacheKey("getArtistsList" + i + i2)).tag("CALL_SINGER_TAG")).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
    }

    public Call<SingerResultBean> a(int i, avc<SingerResultBean> avcVar) {
        OkGo.getInstance().cancelTag("CALL_SINGER_TAG");
        HashMap hashMap = new HashMap();
        hashMap.put(VuiConstants.ELEMENT_TYPE, String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(100));
        return ((auz) ((auz) ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/music/artists/list").tag("getHotArtistsList")).params(hashMap, new boolean[0])).cacheKey("getHotArtistsList" + i)).tag("CALL_SINGER_TAG")).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
    }

    public Call<MainHotSingerResultBean> f(avc<MainHotSingerResultBean> avcVar) {
        return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/singer/hotSingerList").tag("getHotSingerList")).cacheKey("getHotSingerList")).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> b(long j, int i, avc<MusicCollectSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("albumId", String.valueOf(j));
        hashMap.put("page", String.valueOf(i));
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/album/songList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> c(long j, int i, avc<MusicCollectSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("albumId", String.valueOf(j));
        if (i > 0) {
            hashMap.put("page", String.valueOf(i));
        }
        return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/album/songList").params(hashMap, new boolean[0])).cacheKey("getAlbumsSongList" + j)).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
    }

    public Call<RankMusicResult> g(avc<RankMusicResult> avcVar) {
        return ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/rank/rankList").cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getRandMusic")).a(new ava(avcVar));
    }

    public Call<XpPlayMusicResult> h(avc<XpPlayMusicResult> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("pageSize", String.valueOf(50));
        return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/collects/listenWithXp").params(hashMap, new boolean[0])).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getXpPlayMusic")).a(new ava(avcVar));
    }

    public Call<SingerIndexResult> i(avc<SingerIndexResult> avcVar) {
        return ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/singer/singerIndex").cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getSingerIndex")).a(new ava(avcVar));
    }

    public Call<MainHotSingerResultBean> b(String str, String str2, avc<MainHotSingerResultBean> avcVar) {
        OkGo.getInstance().cancelTag("https://xmart.xiaopeng.com/media/v3/music/singer/singerList");
        HashMap hashMap = new HashMap();
        hashMap.put("areaCode", str);
        hashMap.put("typeCode", str2);
        return ((auz) ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/singer/singerList").params(hashMap, new boolean[0])).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getSingerList" + str + str2)).tag("https://xmart.xiaopeng.com/media/v3/music/singer/singerList")).a(new ava(avcVar));
    }

    public Call<SongSingerListResultBean> a(String str, avc<SongSingerListResultBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("singerIds", str);
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/singer/songSingerList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<MusicCollectSongListBean> b(int i, int i2, avc<MusicCollectSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(i2));
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/music/vip/songList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<VipMusicMainZoneResult> j(avc<VipMusicMainZoneResult> avcVar) {
        return ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/music/zones/list").cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getZonesRecommendmodule")).a(new ava(avcVar));
    }

    public Call<VipMusicMoreInfo> b(final String str, avc<VipMusicMoreInfo> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", str);
        return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/music/zones/info").params(new HashMap<String, String>() { // from class: aqz.1
            {
                put("id", str);
            }
        }, new boolean[0])).cacheKey(bj.a("getMusicZonesInfo", hashMap))).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
    }

    public Call<VipMusicMoreDetails> a(final String str, final int i, avc<VipMusicMoreDetails> avcVar) {
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/music/zones/moduleCollectList").params(new HashMap<String, String>() { // from class: aqz.2
            {
                put("moduleId", str);
                put("page", String.valueOf(i));
                put("pageSize", String.valueOf(30));
            }
        }, new boolean[0])).a(new ava(avcVar));
    }

    public void b(int i, avc<BaseBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("configTypes", "3");
        hashMap.put("songQuality", String.valueOf(i));
        ((PostRequest) auu.b("https://xmart.xiaopeng.com/media/v2/users/info/saveConfig").params(hashMap, new boolean[0])).execute(new ava(avcVar));
    }

    public Call<ReCollectLabelsResult> k(avc<ReCollectLabelsResult> avcVar) {
        return ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/collects/collectLabels").cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getwellChosenCollectLabel")).a(new ava(avcVar));
    }

    public Call<RecommentMusicResult> a(String str, int i, int i2, int i3, avc<RecommentMusicResult> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("categoryId", str);
        hashMap.put("page", String.valueOf(i3));
        hashMap.put("pageSize", String.valueOf(50));
        if (w.f() == 1) {
            hashMap.put(VuiConstants.ELEMENT_TYPE, String.valueOf(i));
            hashMap.put("sort", String.valueOf(i2));
        }
        if (i3 == 1) {
            return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/collects/categoryCollect").params(hashMap, new boolean[0])).cacheKey("getCategoryCollect" + str + i3)).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
        }
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/collects/categoryCollect").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<RecommentMusicResult> b(String str, int i, avc<RecommentMusicResult> avcVar) {
        HashMap hashMap = new HashMap();
        if (w.f() == 1) {
            hashMap.put("artistId", str);
        } else {
            hashMap.put("singerId", str);
        }
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(50));
        if (i == 1) {
            return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/singer/albumList").params(hashMap, new boolean[0])).cacheKey("getAlbumList" + str + i)).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
        }
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/singer/albumList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<RecommentMusicResult> b(String str, int i, int i2, int i3, avc<RecommentMusicResult> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("keyword", str);
        hashMap.put(VuiConstants.ELEMENT_TYPE, String.valueOf(i));
        hashMap.put("page", String.valueOf(i3));
        hashMap.put("sort", String.valueOf(i2));
        hashMap.put("pageSize", String.valueOf(50));
        if (i3 == 1) {
            return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/music/collects/searchCollect").params(hashMap, new boolean[0])).cacheKey("getSearchCollect" + str + i3)).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).a(new ava(avcVar));
        }
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/music/collects/searchCollect").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<RecommentMusicResult> l(avc<RecommentMusicResult> avcVar) {
        return ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/music/collects/highQualityCollect").cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("gethighQualityCollect")).a(new ava(avcVar));
    }

    public void a(String str, String str2, int i, int i2, int i3, String str3) {
        PostRequest postRequest = (PostRequest) ((PostRequest) ((PostRequest) ((PostRequest) ((PostRequest) ((PostRequest) ((PostRequest) ((PostRequest) auu.b("https://xmart.xiaopeng.com/media/v3/music/report/songListen").params("mediaType", 1, new boolean[0])).params("songId", str, new boolean[0])).params("hash", str2, new boolean[0])).params("playTime", i, new boolean[0])).params("playQuality", i2, new boolean[0])).params("from", i3, new boolean[0])).params("path", str3, new boolean[0])).cacheMode(CacheMode.NO_CACHE);
        Log.i("XpMusciModel", "reportMusicFlow: " + postRequest.getParams());
        postRequest.execute(new ava());
    }
}
