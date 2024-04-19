package defpackage;

import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import io.reactivex.Observable;
/* compiled from: ArtistHandler.java */
/* renamed from: aof  reason: default package */
/* loaded from: classes2.dex */
public class aof extends aok {
    public aof(amq amqVar) {
        super(amqVar);
    }

    @Override // defpackage.aok
    protected Observable<MusicCollectSongListBean> a(ListSignBean listSignBean, boolean z, int i, int i2) {
        return aqx.a(listSignBean.getCollectId(), i, i2);
    }
}
