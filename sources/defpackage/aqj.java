package defpackage;

import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
/* compiled from: UserHttpModel.java */
/* renamed from: aqj  reason: default package */
/* loaded from: classes2.dex */
public class aqj {

    /* compiled from: UserHttpModel.java */
    /* renamed from: aqj$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final aqj a = new aqj();
    }

    public static aqj a() {
        return a.a;
    }

    public void a(ReissueInfo reissueInfo, avc<BaseBean> avcVar) {
        auu.b(reissueInfo.getUrl()).upJson(reissueInfo.getValue()).execute(new ava(avcVar));
    }
}
