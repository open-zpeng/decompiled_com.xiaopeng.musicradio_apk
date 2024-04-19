package com.xiaopeng.musicradio.service;

import android.content.Context;
import androidx.lifecycle.n;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.bean.db.ReadLoveInfo;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.as;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class ProgramMineService extends a implements awg {
    private static final String TAG = "ProgramMineService";

    @Override // com.xiaopeng.musicradio.service.a
    protected void a() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.awg
    public <T> T getCollectedProgramList(Object obj) {
        final e eVar = (e) obj;
        final ?? r0 = (T) new n();
        if (!aqh.a().e()) {
            r0.a(f.a(eVar, "getCollectedProgramList"));
            return r0;
        }
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.service.ProgramMineService.1
            @Override // java.lang.Runnable
            public void run() {
                List<ReadLoveInfo> a = axj.a().a(eVar.f, eVar.e);
                ArrayList arrayList = new ArrayList();
                if (a != null) {
                    for (ReadLoveInfo readLoveInfo : a) {
                        RdAlbumBean a2 = aq.a(readLoveInfo);
                        a2.setFromSource("favourite");
                        arrayList.add(a2);
                    }
                }
                boolean z = a != null && a.size() >= eVar.f;
                r0.a((n) f.a(eVar, z, z ? a.get(a.size() - 1).getTs() : 0L, arrayList, "getCollectedProgramList"));
            }
        });
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.awg
    public <T> T getHistoryProgramList(Object obj) {
        final e eVar = (e) obj;
        final ?? r0 = (T) new n();
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.service.ProgramMineService.2
            @Override // java.lang.Runnable
            public void run() {
                List<ReadHistoryInfo> a = axi.a().a(eVar.f, eVar.e);
                ArrayList arrayList = new ArrayList();
                if (a != null) {
                    for (ReadHistoryInfo readHistoryInfo : a) {
                        RdAlbumBean a2 = aq.a(readHistoryInfo);
                        a2.setFromSource("favourite");
                        arrayList.add(a2);
                    }
                }
                boolean z = a != null && a.size() >= eVar.f;
                r0.a((n) f.a(eVar, z, z ? a.get(a.size() - 1).getTs() : 0L, arrayList, "getHistoryProgramList"));
            }
        });
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.lifecycle.n] */
    @Override // defpackage.awg
    public <T> T setCollectedProgram(final Object obj, final boolean z) {
        LogUtils.i(TAG, "setCollectedNetRadio:target=" + obj + ",collect=" + z);
        final ?? r0 = (T) new n();
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.service.ProgramMineService.3
            @Override // java.lang.Runnable
            public void run() {
                if (obj instanceof RdAlbumBean) {
                    if (z) {
                        axh.a().b(aq.a((RdAlbumBean) obj, System.currentTimeMillis()), false);
                    } else {
                        axh.a().a(aq.a((RdAlbumBean) obj, System.currentTimeMillis()));
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
    @Override // defpackage.awg
    public <T> T removeHistoryProgram(final Object obj) {
        LogUtils.i(TAG, "removeHistoryProgram:target=" + obj);
        final ?? r0 = (T) new n();
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.service.ProgramMineService.4
            @Override // java.lang.Runnable
            public void run() {
                Object obj2 = obj;
                if (obj2 instanceof RdAlbumBean) {
                    axh.a().a(((RdAlbumBean) obj2).getId());
                    r0.a((n) true);
                    return;
                }
                r0.a((n) false);
            }
        });
        return r0;
    }

    @Override // defpackage.awg
    public void play(Object obj) {
        LogUtils.i(TAG, "play:target=" + obj);
        if (obj instanceof RdAlbumBean) {
            RdAlbumBean rdAlbumBean = (RdAlbumBean) obj;
            String str = "reading_album_" + rdAlbumBean.getId();
            if (rdAlbumBean != null) {
                if (rdAlbumBean.getChannelId() > 0) {
                    str = ad.a(rdAlbumBean.getChannelId()).toJson();
                }
                if (rdAlbumBean.getCardId() > 0) {
                    str = ad.b(rdAlbumBean.getCardId()).toJson();
                }
            }
            if (axn.i().c(str)) {
                axn.i().pause();
            } else if (axn.i().v()) {
                LogUtils.i(TAG, "isNotPlayable:play skipped");
            } else {
                u.c(new age.e(3, str));
                axn.i().a(rdAlbumBean);
            }
        }
    }

    @Override // defpackage.awg
    public <T> T getPlayingProgram() {
        return (T) axn.i().r();
    }

    @Override // defpackage.awg
    public int getPlayState() {
        return axn.i().getPlayState();
    }

    @Override // defpackage.awg
    public void startDetail(Context context, Object obj, String str) {
        LogUtils.i(TAG, "startDetail:target=" + obj + ",fromSource=" + str);
        if (obj instanceof RdAlbumBean) {
            as.a((RdAlbumBean) obj);
        }
    }

    @Override // defpackage.awg
    public void checkoutDataCollect() {
        if (aqh.a().e()) {
            axh.a().d();
        }
    }

    @Override // defpackage.awg
    public boolean isCollected(Object obj) {
        if (obj instanceof RdAlbumBean) {
            return axj.a().c(((RdAlbumBean) obj).getId());
        }
        if (obj instanceof Long) {
            return axj.a().c(((Long) obj).longValue());
        }
        return false;
    }
}
