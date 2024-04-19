package defpackage;

import com.lzy.okgo.adapter.Call;
import com.lzy.okgo.cache.CacheMode;
import com.xiaopeng.musicradio.bean.xpbean.CollectListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.SongListBean;
import defpackage.axx;
import io.reactivex.Observable;
import java.util.HashMap;
/* compiled from: BizHelper.java */
/* renamed from: anf  reason: default package */
/* loaded from: classes2.dex */
public class anf {
    public static Call<SongListBean> a(int i, int i2, avc<SongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(i2));
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/user/favourite/songList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public static Observable<SongListBean> a(final int i, final int i2) {
        return new axx<SongListBean>() { // from class: anf.1
            @Override // defpackage.axx
            protected axx.a<SongListBean> a() {
                return new axx.a<SongListBean>() { // from class: anf.1.1
                };
            }

            @Override // defpackage.axx
            protected Call<SongListBean> a(avc<SongListBean> avcVar) {
                return anf.a(i, i2, avcVar);
            }
        };
    }

    public static void a(avc<CollectListBean> avcVar) {
        auu.a("https://xmart.xiaopeng.com/media/v3/music/user/favourite/collectList").a(new ava(avcVar));
    }

    public static Call<MusicCollectSongListBean> a(long j, int i, int i2, avc<MusicCollectSongListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(j));
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageSize", String.valueOf(i2));
        if (i == 1) {
            return ((auz) ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/collects/songList").params(hashMap, new boolean[0])).cacheKey("getCustomCollectSongList" + j + "_" + i)).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheTime(604800000L)).a(new ava(avcVar));
        }
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/collects/songList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }
}
