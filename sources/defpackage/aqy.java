package defpackage;

import com.lzy.okgo.adapter.Call;
import com.xiaopeng.musicradio.bean.xpbean.NetScheduleListBean;
import defpackage.axx;
import io.reactivex.Observable;
/* compiled from: RxNetRadioModel.java */
/* renamed from: aqy  reason: default package */
/* loaded from: classes2.dex */
public class aqy {
    public static Observable<NetScheduleListBean> a(final String str, final String str2) {
        return new axx<NetScheduleListBean>() { // from class: aqy.1
            @Override // defpackage.axx
            protected axx.a<NetScheduleListBean> a() {
                return new axx.a<NetScheduleListBean>() { // from class: aqy.1.1
                };
            }

            @Override // defpackage.axx
            protected Call<NetScheduleListBean> a(avc<NetScheduleListBean> avcVar) {
                return ara.a().b(str, str2, avcVar);
            }
        };
    }
}
