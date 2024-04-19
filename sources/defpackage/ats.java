package defpackage;

import com.xiaopeng.musicradio.bean.xpbean.SongSingerListResultBean;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: SeleteSingerPresenter.java */
/* renamed from: ats  reason: default package */
/* loaded from: classes2.dex */
public class ats extends e<att> {
    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void f_() {
        super.f_();
        u.a(this);
    }

    public void a(String str) {
        if (j() != null) {
            j().a();
        }
        aqz.a().a(str, new avc<SongSingerListResultBean>() { // from class: ats.1
            @Override // defpackage.avc
            public void a(SongSingerListResultBean songSingerListResultBean) {
                if (ats.this.j() != null && songSingerListResultBean.getData() != null && songSingerListResultBean.getData() != null && songSingerListResultBean.getData().size() >= 0) {
                    ats.this.j().a(songSingerListResultBean.getData());
                } else if (ats.this.j() != null) {
                    ats.this.j().a("");
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str2) {
                if (ats.this.j() != null) {
                    ats.this.j().a("");
                }
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPowerChange(agg.s sVar) {
        if (sVar == null || sVar.a() || j() == null) {
            return;
        }
        j().g();
    }
}
