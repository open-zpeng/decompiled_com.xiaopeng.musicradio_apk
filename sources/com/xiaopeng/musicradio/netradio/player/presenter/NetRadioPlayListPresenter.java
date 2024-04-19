package com.xiaopeng.musicradio.netradio.player.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class NetRadioPlayListPresenter extends BasePresenter<com.xiaopeng.musicradio.netradio.player.view.a> {
    private List<NetRadioProgramInfo> b = new ArrayList();

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
        if (iVar != null) {
            c();
        }
    }

    public void c() {
        List<NetRadioProgramInfo> l = aps.i().l();
        Log.i("NetRadioPlayListPresent", "refresh: ======" + l);
        if (l != null) {
            if (a() != null) {
                Log.i("NetRadioPlayListPresent", "refresh: =======");
                this.b.clear();
                this.b.addAll(l);
                a().a(this.b);
                e();
            }
        } else if (a() != null) {
            a().R_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRefreshList(age.d dVar) {
        if (dVar.a() == 6) {
            c();
        }
    }

    public void a(NetRadioProgramInfo netRadioProgramInfo) {
        Log.i("NetRadioPlayListPresent", "playOrPause: " + netRadioProgramInfo);
        NetRadioProgramInfo d = aps.i().d();
        if (d != null && netRadioProgramInfo.getId() == d.getId() && TextUtils.equals(netRadioProgramInfo.getStartTime(), d.getStartTime()) && TextUtils.equals(netRadioProgramInfo.getDayOfWeek(), d.getDayOfWeek())) {
            if (aps.i().getPlayState() == 1) {
                return;
            }
            if (aps.i().getPlayState() == 2) {
                aps.i().pause();
            } else if (aps.i().getPlayState() == 3) {
                aps.i().play();
            } else if (netRadioProgramInfo.getType() == 2) {
                aps.i().a(netRadioProgramInfo.getParentInfo());
            } else {
                aps.i().a(netRadioProgramInfo);
            }
        } else if (netRadioProgramInfo.getType() == 2) {
            aps.i().a(netRadioProgramInfo.getParentInfo());
        } else {
            aps.i().a(netRadioProgramInfo);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChange(age.l lVar) {
        e();
    }

    private void e() {
        if (aei.a().c() == 6) {
            NetRadioProgramInfo d = aps.i().d();
            if (this.b != null && d != null) {
                if (a() != null) {
                    a().a(d(), aps.i().getPlayState());
                }
            } else if (a() != null) {
                a().a(-1, -1);
            }
        } else if (a() != null) {
            a().a(-1, -1);
        }
    }

    public int d() {
        NetRadioProgramInfo d = aps.i().d();
        if (d != null) {
            for (int i = 0; i < this.b.size(); i++) {
                if (d.getId() == this.b.get(i).getId() && TextUtils.equals(d.getStartTime(), this.b.get(i).getStartTime()) && TextUtils.equals(d.getDayOfWeek(), this.b.get(i).getDayOfWeek())) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechShow(agg.y yVar) {
        if (a() != null) {
            a().S_();
        }
    }
}
