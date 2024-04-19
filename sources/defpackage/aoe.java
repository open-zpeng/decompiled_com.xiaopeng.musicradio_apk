package defpackage;

import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.utils.w;
import io.reactivex.Observable;
/* compiled from: AlbumHandlerV2.java */
/* renamed from: aoe  reason: default package */
/* loaded from: classes2.dex */
public class aoe extends aok {
    public aoe(amq amqVar) {
        super(amqVar);
    }

    @Override // defpackage.aok
    protected Observable<MusicCollectSongListBean> a(ListSignBean listSignBean, boolean z, int i, int i2) {
        return aqx.a(listSignBean.getCollectId(), i);
    }

    @Override // defpackage.aok
    protected int b() {
        if (w.f() == 1) {
            return 1;
        }
        return super.b();
    }
}
