package com.xiaopeng.musicradio.service;

import androidx.lifecycle.n;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.datalist.f;
import java.util.List;
/* loaded from: classes2.dex */
public class NetRadioMineService extends a implements aua {
    private static final String TAG = "NetRadioMineService";

    @Override // com.xiaopeng.musicradio.service.a
    protected void a() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.aua
    public <T> T getCollectedNetRadioList(Object obj) {
        final e eVar = (e) obj;
        final ?? r0 = (T) new n();
        if (!aqh.a().e()) {
            r0.a(f.a(eVar, "getCollectedNetRadioList"));
            return r0;
        }
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.service.NetRadioMineService.1
            @Override // java.lang.Runnable
            public void run() {
                List<NetRadioInfo> a = apt.a().a(eVar.f, eVar.e);
                boolean z = a.size() >= eVar.f;
                r0.a((n) f.a(eVar, z, z ? a.get(a.size() - 1).getCacheTime() : 0L, a, "getCollectedNetRadioList"));
            }
        });
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.aua
    public <T> T getHistoryNetRadioList(Object obj) {
        final e eVar = (e) obj;
        final ?? r0 = (T) new n();
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.service.NetRadioMineService.2
            @Override // java.lang.Runnable
            public void run() {
                List<NetRadioInfo> a = apr.a().a(eVar.f, eVar.e);
                boolean z = a.size() >= eVar.f;
                r0.a((n) f.a(eVar, z, z ? a.get(a.size() - 1).getCacheTime() : 0L, a, "getHistoryNetRadioList"));
            }
        });
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.aua
    public <T> T setCollectedNetRadio(final Object obj, final boolean z) {
        LogUtils.i(TAG, "setCollectedNetRadio:target=" + obj + ",collect=" + z);
        final ?? r0 = (T) new n();
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.service.NetRadioMineService.3
            @Override // java.lang.Runnable
            public void run() {
                if (obj instanceof NetRadioInfo) {
                    if (z) {
                        ane.a().b((NetRadioInfo) obj);
                    } else {
                        ane.a().c((NetRadioInfo) obj);
                    }
                    r0.a((n) true);
                    return;
                }
                r0.a((n) false);
            }
        });
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.aua
    public <T> T removeHistoryNetRadio(final Object obj) {
        LogUtils.i(TAG, "setCollectedNetRadio:target=" + obj);
        final ?? r0 = (T) new n();
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.service.NetRadioMineService.4
            @Override // java.lang.Runnable
            public void run() {
                if (obj instanceof NetRadioInfo) {
                    apr.a().b((NetRadioInfo) obj);
                    r0.a((n) true);
                    return;
                }
                r0.a((n) false);
            }
        });
        return r0;
    }

    @Override // defpackage.aua
    public void play(Object obj) {
        LogUtils.i(TAG, "play:target=" + obj);
        if (obj instanceof NetRadioInfo) {
            NetRadioInfo netRadioInfo = (NetRadioInfo) obj;
            NetRadioProgramInfo d = aps.i().d();
            NetRadioInfo parentInfo = d != null ? d.getParentInfo() : null;
            if (parentInfo != null && parentInfo.getId() == netRadioInfo.getId()) {
                if (aps.i().getPlayState() == 1) {
                    return;
                }
                if (aps.i().getPlayState() == 2) {
                    aps.i().pause();
                    return;
                } else if (aps.i().getPlayState() == 3) {
                    aps.i().play();
                    return;
                } else {
                    aps.i().a(netRadioInfo);
                    return;
                }
            }
            aps.i().a(netRadioInfo);
        }
    }

    @Override // defpackage.aua
    public <T> T getPlayingInfo() {
        return (T) aps.i().d();
    }

    @Override // defpackage.aua
    public int getPlayState() {
        return aps.i().getPlayState();
    }

    @Override // defpackage.aua
    public void checkoutDataCollect() {
        if (aqh.a().e()) {
            ane.a().f();
        }
    }

    @Override // defpackage.aua
    public boolean isCollected(Object obj) {
        if (obj instanceof NetRadioInfo) {
            return apt.a().a(((NetRadioInfo) obj).getId());
        }
        if (obj instanceof Long) {
            return apt.a().a(((Long) obj).longValue());
        }
        return false;
    }
}
