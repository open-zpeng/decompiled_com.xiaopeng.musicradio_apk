package defpackage;

import com.lzy.okgo.adapter.Call;
import com.xiaopeng.musicradio.bean.xpbean.NetCollectListBean;
import java.util.HashMap;
/* compiled from: BizHelper.java */
/* renamed from: ani  reason: default package */
/* loaded from: classes2.dex */
public class ani {
    public static Call<NetCollectListBean> a(int i, int i2, avc<NetCollectListBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("page", i + "");
        hashMap.put("pageSize", i2 + "");
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/reading/user/favourite/listFms").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }
}
