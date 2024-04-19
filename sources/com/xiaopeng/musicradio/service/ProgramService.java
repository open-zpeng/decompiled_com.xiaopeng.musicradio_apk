package com.xiaopeng.musicradio.service;

import android.net.Uri;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumSearchBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.search.api.bean.SearchResultServiceBean;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.ar;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.ago;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class ProgramService extends a implements awh {
    private static final String TAG = "ProgramService";

    @Override // defpackage.awh
    public awk getPlayingInfo() {
        awk c = aq.c(axn.i().r());
        if (c != null) {
            c.a(axj.a().c(c.d()));
        }
        return c;
    }

    public void searchReadingKeyword(final String str, final arj arjVar) {
        axp.a().a(str, 1, 50, new avc<FMAlbumSearchBean>() { // from class: com.xiaopeng.musicradio.service.ProgramService.1
            @Override // defpackage.avc
            public void a(FMAlbumSearchBean fMAlbumSearchBean) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (RdAlbumBean rdAlbumBean : fMAlbumSearchBean.getData().getList()) {
                    SearchResultServiceBean searchResultServiceBean = new SearchResultServiceBean();
                    searchResultServiceBean.b((int) rdAlbumBean.getPlayCount());
                    searchResultServiceBean.c(rdAlbumBean.getTitle());
                    searchResultServiceBean.a(rdAlbumBean.getId());
                    searchResultServiceBean.d(rdAlbumBean.getIntro());
                    searchResultServiceBean.b(rdAlbumBean.getMediumLogo());
                    if (axn.i().r() != null && axn.i().r().getAlbumId() == rdAlbumBean.getId()) {
                        searchResultServiceBean.a(axn.i().getPlayState());
                    } else {
                        searchResultServiceBean.a(-1);
                    }
                    arrayList.add(searchResultServiceBean);
                    arrayList2.add(rdAlbumBean);
                }
                arj arjVar2 = arjVar;
                if (arjVar2 != null) {
                    arjVar2.a(arrayList, 2, str);
                }
                axn.i().a(str, arrayList2);
            }

            @Override // defpackage.avc
            public void a(int i, String str2) {
                arj arjVar2 = arjVar;
                if (arjVar2 != null) {
                    arjVar2.a(null, 2, str);
                }
            }
        });
    }

    public void playReading(long j, String str, boolean z) {
        List<RdAlbumBean> a = axn.i().a(str);
        if (a != null) {
            for (RdAlbumBean rdAlbumBean : a) {
                if (rdAlbumBean.getId() == j) {
                    if (z) {
                        ago.f fVar = new ago.f(rdAlbumBean);
                        fVar.b(false);
                        u.c(fVar);
                    } else {
                        axn.i().a(rdAlbumBean);
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("search", "keyboard");
                    hashMap.put("voice", "reading");
                    hashMap.put("keyword", str);
                    hashMap.put("name", "common");
                    bci.b(hashMap);
                    return;
                }
            }
        }
    }

    @Override // defpackage.awh
    public void playReading(RdAlbumBean rdAlbumBean) {
        axn.i().a(rdAlbumBean);
    }

    public void play() {
        axn.i().play();
    }

    @Override // defpackage.awh
    public void pause() {
        axn.i().pause();
    }

    @Override // defpackage.awh
    public String getListSign() {
        return axn.i().s();
    }

    public void addPlayRecord(int i, String str) {
        switch (i) {
            case 1:
                ar.a((awj) z.a(str, (Class<Object>) awj.class));
                return;
            case 2:
                awl awlVar = (awl) z.a(str, (Class<Object>) awl.class);
                return;
            case 3:
                awi awiVar = (awi) z.a(str, (Class<Object>) awi.class);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.awh
    public String getLogo4TodayNews(long j) {
        return axk.a().c(j) ? axk.a().b(j) : "";
    }

    @Override // defpackage.awh
    public boolean isCanCollected() {
        return (axn.i().r() == null || getListSign().contains("headspeech")) ? false : true;
    }

    @Override // com.xiaopeng.musicradio.service.a
    protected void a() {
        axe.c();
    }

    @Override // defpackage.awh
    public void openGuessLike() {
        sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/guess_you_like?category_name=" + Uri.encode(com.xiaopeng.musicradio.a.a.getResources().getString(b.f.guess_like_title_2))).navigation();
    }

    @Override // defpackage.awh
    public void openProgramHistory() {
        sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/history").navigation();
    }

    @Override // defpackage.awh
    public boolean favMusicOrNot(boolean z) {
        ProgramBean r = axn.i().r();
        if (r != null) {
            boolean c = axj.a().c(r.getAlbumId());
            if (z) {
                if (!c) {
                    axh.a().b(aq.a(r), r.getCardId() > 0);
                }
            } else if (c) {
                axh.a().a(aq.a(r));
            }
        }
        return false;
    }

    @Override // defpackage.awh
    public void updateAlbumInfo4TodayNews(long j) {
        axk.a().a(j, new Runnable() { // from class: com.xiaopeng.musicradio.service.ProgramService.2
            @Override // java.lang.Runnable
            public void run() {
            }
        }, new Runnable() { // from class: com.xiaopeng.musicradio.service.ProgramService.3
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }
}
