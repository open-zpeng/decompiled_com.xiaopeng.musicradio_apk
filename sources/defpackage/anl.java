package defpackage;

import com.lzy.okgo.adapter.Call;
import com.xiaopeng.musicradio.bean.xpbean.user.ReadingListAlbumsBean;
import java.util.HashMap;
/* compiled from: BizHelper.java */
/* renamed from: anl  reason: default package */
/* loaded from: classes2.dex */
public class anl {
    public static Call<ReadingListAlbumsBean> a(int i, int i2, avc<ReadingListAlbumsBean> avcVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("page", i + "");
        hashMap.put("pageSize", i2 + "");
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/reading/user/favourite/listAlbums").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }
}
