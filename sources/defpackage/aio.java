package defpackage;

import android.content.Context;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.h;
import com.xiaopeng.musicradio.datalist.m;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.recyclerview.i;
import java.util.HashMap;
/* compiled from: BaseNetRadioViewProxy.java */
/* renamed from: aio  reason: default package */
/* loaded from: classes2.dex */
public abstract class aio<UIInterface, Presenter extends DataListPresenter<UIInterface>> extends aiq<UIInterface, Presenter> implements h, m, i {
    public aio(Context context, String str) {
        super(context, str);
    }

    public void i() {
        int i;
        int c = aei.a().c();
        int i2 = 0;
        if (c == 6) {
            NetRadioInfo a = amm.a();
            i = amm.b();
            if (a != null) {
                i2 = a.getId();
            }
        } else {
            i = -1;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioType", Integer.valueOf(c));
        hashMap.put("playState", Integer.valueOf(i));
        hashMap.put("id", Integer.valueOf(i2));
        c_("UpdatePlayingStatus", z.a(hashMap));
    }

    public void b(final int i) {
        ban.g(new Runnable() { // from class: aio.1
            @Override // java.lang.Runnable
            public void run() {
                amm.a(aio.this.c(i));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NetRadioInfo c(int i) {
        for (NetRadioInfo netRadioInfo : ((DataListPresenter) this.c).g()) {
            if (i == netRadioInfo.getId()) {
                return netRadioInfo;
            }
        }
        return null;
    }

    @Override // defpackage.aiq, defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        if ("play".equals(str)) {
            a(amc.c(bArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aiq
    public void a(boolean z) {
        super.a(z);
        if (z) {
            return;
        }
        amm.d();
    }

    protected void a(NetRadioInfo netRadioInfo) {
        if (netRadioInfo != null) {
            b(netRadioInfo.getId());
        }
    }
}
