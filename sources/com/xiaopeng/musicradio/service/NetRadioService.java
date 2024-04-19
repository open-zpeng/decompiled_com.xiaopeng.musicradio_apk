package com.xiaopeng.musicradio.service;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.utils.w;
/* loaded from: classes2.dex */
public class NetRadioService extends a implements aub {
    private static final String TAG = "NetRadioService";

    @Override // com.xiaopeng.musicradio.service.a
    protected void a() {
    }

    @Override // defpackage.aub
    public auc getPlayingNetRadioInfo() {
        NetRadioProgramInfo d = aps.i().d();
        if (d != null) {
            auc aucVar = new auc();
            String name = d.getParentInfo() == null ? "" : d.getParentInfo().getName();
            if (TextUtils.isEmpty(name)) {
                aucVar.b(false);
            } else {
                aucVar.b(true);
            }
            String picUrl = d.getParentInfo() == null ? "" : d.getParentInfo().getPicUrl();
            boolean a = apt.a().a(d.getParentInfo());
            long id = d.getParentInfo() == null ? 0L : d.getParentInfo().getId();
            aucVar.b(name);
            aucVar.a(d.getName());
            aucVar.a(a);
            aucVar.c(picUrl);
            aucVar.a(id);
            return aucVar;
        }
        return null;
    }

    public int getNetRadioProviderType() {
        return aps.i().m();
    }

    @Override // defpackage.aub
    public boolean favMusicOrNot(boolean z) {
        NetRadioProgramInfo d = aps.i().d();
        if (d == null || d.getParentInfo() == null) {
            return false;
        }
        boolean a = apt.a().a(d.getParentInfo());
        if (z) {
            if (a) {
                return false;
            }
            ane.a().b(d.getParentInfo());
            return false;
        } else if (a) {
            ane.a().c(d.getParentInfo());
            return false;
        } else {
            return false;
        }
    }

    @Override // defpackage.aub
    public boolean isCanCollected() {
        if (aps.i().d() != null) {
            if (2 == w.f()) {
                return aqh.a().e();
            }
            return true;
        }
        return false;
    }
}
