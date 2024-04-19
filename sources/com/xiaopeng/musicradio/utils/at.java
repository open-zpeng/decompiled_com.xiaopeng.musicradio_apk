package com.xiaopeng.musicradio.utils;

import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import defpackage.agg;
import java.util.List;
/* compiled from: ProgramPlayUtil.java */
/* loaded from: classes2.dex */
public class at {
    public static void a(ahp<ProgramBean> ahpVar) {
        int c = aei.a().c();
        axn.i().a(ahpVar);
        if (c == 3 || c == -1) {
            u.f(new agg.r(3));
        }
    }

    public static void a() {
        int c = aei.a().c();
        axn.i().play();
        if (c == 3 || c == -1) {
            u.f(new agg.r(3));
        }
    }

    public static void a(String str, int i, int i2, int i3, String str2, RdAlbumBean rdAlbumBean, List<ProgramBean> list, int i4) {
        axm axmVar = new axm(str, i, i2, i3, str2, rdAlbumBean, false, list, i4);
        if (rdAlbumBean.getCardId() > 0) {
            axmVar.c(rdAlbumBean.getCardId());
        }
        a(axmVar);
    }

    public static void b(String str, int i, int i2, int i3, String str2, RdAlbumBean rdAlbumBean, List<ProgramBean> list, int i4) {
        a(new axm(str, i, i2, i3, str2, rdAlbumBean, true, list, i4));
    }

    public static void a(String str, int i, int i2, int i3, String str2, RdAlbumBean rdAlbumBean, List<ProgramBean> list) {
        boolean z;
        int i4;
        ReadHistoryInfo a = rdAlbumBean != null ? axi.a().a(rdAlbumBean.getId()) : null;
        int i5 = 0;
        if (a != null) {
            while (true) {
                if (i5 >= list.size()) {
                    i5 = -1;
                    break;
                }
                ProgramBean programBean = list.get(i5);
                if (a.getTrackId() == programBean.getTrackId() && a.getAlbumId() == programBean.getAlbumId()) {
                    break;
                }
                i5++;
            }
            z = true;
            i4 = i5;
        } else {
            z = false;
            i4 = -1;
        }
        axm axmVar = new axm(str, i, i2, i3, str2, rdAlbumBean, z, list, i4);
        if (rdAlbumBean.getCardId() > 0) {
            axmVar.c(rdAlbumBean.getCardId());
        }
        a(axmVar);
    }
}
