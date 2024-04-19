package defpackage;

import com.lzy.okgo.adapter.Call;
import com.lzy.okgo.cache.CacheMode;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioInfoBean;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioInfoListBean;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioInfoListV2Bean;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioInfoMapBean;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioTagListBean;
import com.xiaopeng.musicradio.bean.xpbean.NetScheduleListBean;
import java.util.HashMap;
/* compiled from: XpNetRadioModel.java */
/* renamed from: ara  reason: default package */
/* loaded from: classes2.dex */
public class ara {
    public static ara a() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: XpNetRadioModel.java */
    /* renamed from: ara$a */
    /* loaded from: classes2.dex */
    public static class a {
        private static ara a = new ara();
    }

    public Call<NetRadioTagListBean> a(avc<NetRadioTagListBean> avcVar) {
        return auu.a("https://xmart.xiaopeng.com/media/fm/categories").a(new ava(avcVar));
    }

    public Call<NetRadioInfoListBean> a(int i, int i2, int i3, avc<NetRadioInfoListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(i));
        hashMap.put("page", String.valueOf(i2));
        hashMap.put("pageSize", String.valueOf(i3));
        return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/fm/categories/radioList").params(hashMap, new boolean[0])).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getCategoryNetRadioList" + i + i2 + i3)).a(new ava(avcVar));
    }

    public Call<NetRadioInfoListBean> b(int i, int i2, int i3, avc<NetRadioInfoListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", String.valueOf(i));
        hashMap.put("page", String.valueOf(i2));
        hashMap.put("pageSize", String.valueOf(i3));
        return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/fm/areas/radioList").params(hashMap, new boolean[0])).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getAreasNetRadioList" + i + i2 + i3)).a(new ava(avcVar));
    }

    public Call<NetRadioInfoListBean> a(String str, avc<NetRadioInfoListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("areaCode", str);
        hashMap.put("page", "1");
        hashMap.put("pageSize", "200");
        return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/fm/areas/localRadioList").params(hashMap, new boolean[0])).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getLocalNetRadioList" + str)).a(new ava(avcVar));
    }

    public Call<NetRadioInfoListV2Bean> b(String str, avc<NetRadioInfoListV2Bean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("areaCode", str);
        return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/fm/areas/localRadioList").params(hashMap, new boolean[0])).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("getLocalNetRadioListV2" + str)).a(new ava(avcVar));
    }

    public Call<NetRadioInfoMapBean> c(String str, avc<NetRadioInfoMapBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("ids", str);
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/fm/radios/info").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<NetRadioInfoBean> a(String str, String str2, avc<NetRadioInfoBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("hz", str);
        hashMap.put("areaCode", str2);
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/fm/radios/infoByHz").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public Call<NetScheduleListBean> b(String str, String str2, avc<NetScheduleListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", str);
        hashMap.put("dayOfWeek", str2);
        return ((auz) ((auz) ((auz) auu.a("https://xmart.xiaopeng.com/media/fm/radios/scheduleList").params(hashMap, new boolean[0])).cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)).cacheKey("radiosScheduleList" + str + str2)).a(new ava(avcVar));
    }
}
