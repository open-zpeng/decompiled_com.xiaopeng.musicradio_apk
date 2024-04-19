package defpackage;

import android.content.Context;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.h;
import com.xiaopeng.musicradio.datalist.m;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.recyclerview.i;
import java.util.HashMap;
/* compiled from: BaseProgramViewProxy.java */
/* renamed from: aip  reason: default package */
/* loaded from: classes2.dex */
public abstract class aip<UIInterface, Presenter extends DataListPresenter<UIInterface>> extends aiq<UIInterface, Presenter> implements h, m, i {
    public aip(Context context, String str) {
        super(context, str);
    }

    public void i() {
        int i;
        int c = aei.a().c();
        long j = 0;
        if (c == 3) {
            i = amn.b();
            ProgramBean a = amn.a();
            if (a != null) {
                j = a.getAlbumId();
            }
        } else {
            i = -1;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioType", Integer.valueOf(c));
        hashMap.put("playState", Integer.valueOf(i));
        hashMap.put("albumId", Long.valueOf(j));
        c_("UpdatePlayingStatus", z.a(hashMap));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RdAlbumBean a(long j) {
        for (RdAlbumBean rdAlbumBean : ((DataListPresenter) this.c).g()) {
            if (rdAlbumBean.getId() == j) {
                return rdAlbumBean;
            }
        }
        return null;
    }

    @Override // defpackage.aiq, defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        if ("play".equals(str)) {
            a(amc.d(bArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aiq
    public void a(boolean z) {
        super.a(z);
        if (z) {
            return;
        }
        amn.e();
    }

    protected void a(RdAlbumBean rdAlbumBean) {
        if (rdAlbumBean != null) {
            amn.a(rdAlbumBean);
        }
    }
}
