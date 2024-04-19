package defpackage;

import android.util.Log;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioInfoMapBean;
import defpackage.apo;
/* compiled from: LiveUpdate.java */
/* renamed from: apq  reason: default package */
/* loaded from: classes2.dex */
public class apq extends apo {
    public apq(String str) {
        super(str);
    }

    @Override // defpackage.apo
    public void a(final apo.a aVar) {
        ara.a().c(this.b, new avc<NetRadioInfoMapBean>() { // from class: apq.1
            @Override // defpackage.avc
            public void a(NetRadioInfoMapBean netRadioInfoMapBean) {
                if (aVar == null || netRadioInfoMapBean.getData() == null || netRadioInfoMapBean.getData().size() <= 0) {
                    return;
                }
                aVar.a(netRadioInfoMapBean.getData().get(apq.this.b));
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                Log.e("LiveUpdate", "error: " + i + " msg = " + str);
            }
        });
    }
}
