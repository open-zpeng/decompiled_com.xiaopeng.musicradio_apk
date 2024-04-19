package defpackage;

import com.lzy.okgo.adapter.Call;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.request.PostRequest;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import com.xiaopeng.musicradio.bean.xpbean.ShareContentBean;
import com.xiaopeng.musicradio.bean.xpbean.ShareProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.ShareSongBean;
import com.xiaopeng.musicradio.utils.z;
/* compiled from: ShareCommunityModel.java */
/* renamed from: avs  reason: default package */
/* loaded from: classes2.dex */
public class avs {
    public static avs a() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShareCommunityModel.java */
    /* renamed from: avs$a */
    /* loaded from: classes2.dex */
    public static class a {
        private static final avs a = new avs();
    }

    public void a(ShareSongBean shareSongBean, avc<BaseBean> avcVar) {
        HttpHeaders httpHeaders = new HttpHeaders();
        long j = adb.a(com.xiaopeng.musicradio.a.a).d;
        httpHeaders.put("XP-Media-Uid", Long.toString(j));
        LogUtils.d("ShareCommunityModel", "shareToCommunity type: Song uid: " + j);
        ((PostRequest) auu.b("https://xmart.xiaopeng.com/media/v2/users/share/shareSong2Community").headers(httpHeaders)).upJson(z.a(shareSongBean)).execute(new ava(avcVar));
    }

    public void a(ShareProgramBean shareProgramBean, avc<BaseBean> avcVar) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.put("XP-Media-Uid", Long.toString(adb.a(com.xiaopeng.musicradio.a.a).d));
        LogUtils.d("ShareCommunityModel", "shareToCommunity type: program albumId: " + shareProgramBean.getAlbumId() + " vehicleType: " + shareProgramBean.getVehicleType() + " content: " + shareProgramBean.getContent());
        ((PostRequest) auu.b("https://xmart.xiaopeng.com/media/v2/users/share/shareReading2Community").headers(httpHeaders)).upJson(z.a(shareProgramBean)).execute(new ava(avcVar));
    }

    public Call<ShareContentBean> a(avc<ShareContentBean> avcVar) {
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/users/share/listShareContents").tag("getShareContents")).a(new ava(avcVar));
    }
}
