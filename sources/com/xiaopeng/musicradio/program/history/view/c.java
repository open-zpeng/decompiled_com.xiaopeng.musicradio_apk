package com.xiaopeng.musicradio.program.history.view;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.program.history.presenter.ReadHistoryPresenter;
import com.xiaopeng.musicradio.proto.Netprogram;
import com.xiaopeng.musicradio.utils.be;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProgramHistoryProxy.java */
/* loaded from: classes2.dex */
public class c extends aeu<a, ReadHistoryPresenter> implements a {
    @Override // com.xiaopeng.musicradio.program.history.view.a
    public void a(int i) {
    }

    @Override // com.xiaopeng.musicradio.program.history.view.a
    public void aj_() {
    }

    @Override // com.xiaopeng.musicradio.program.history.view.a
    public void ak_() {
    }

    public c(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public ReadHistoryPresenter g() {
        Log.d("ProgramHistoryProxy_", "createPresenter: create P");
        return new ReadHistoryPresenter();
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("ProgramHistoryProxy_", "monoMessage" + str + "value--" + bArr);
        if ("requestList".equalsIgnoreCase(str)) {
            ((ReadHistoryPresenter) this.c).c();
        } else if ("clickLove".equalsIgnoreCase(str)) {
            try {
                Netprogram.HistoryInfo historyInfo = Netprogram.HistoryInfoBean.parseFrom(bArr).getHistoryInfo();
                ReadHistoryInfo readHistoryInfo = new ReadHistoryInfo();
                readHistoryInfo.setAlbumId(historyInfo.getAlbumId());
                readHistoryInfo.setAlbumName(historyInfo.getAlbumName());
                readHistoryInfo.setArtistId(historyInfo.getArtistId());
                readHistoryInfo.setLogo(historyInfo.getLogo());
                readHistoryInfo.setLargeLogo(historyInfo.getLargeLogo());
                readHistoryInfo.setMediumLogo(historyInfo.getMediumLogo());
                readHistoryInfo.setTrackTitle(historyInfo.getTrackTitle());
                readHistoryInfo.setUpdateTime(historyInfo.getUpdateTime());
                readHistoryInfo.setShortIntro(historyInfo.getShortIntro());
                readHistoryInfo.setIntro(historyInfo.getIntro());
                readHistoryInfo.setPlayCount(historyInfo.getPlayCount());
                readHistoryInfo.setCategoryName(historyInfo.getCategoryName());
                readHistoryInfo.setPaymentType(historyInfo.getPaymentType());
                readHistoryInfo.setAuthorized(historyInfo.getAuthorized());
                ((ReadHistoryPresenter) this.c).a(readHistoryInfo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if ("delectHistory".equalsIgnoreCase(str)) {
            try {
                Netprogram.HistoryInfo historyInfo2 = Netprogram.HistoryInfoBean.parseFrom(bArr).getHistoryInfo();
                ReadHistoryInfo readHistoryInfo2 = new ReadHistoryInfo();
                readHistoryInfo2.setAlbumId(historyInfo2.getAlbumId());
                ((ReadHistoryPresenter) this.c).a(readHistoryInfo2, 0);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.xiaopeng.musicradio.program.history.view.a
    public void a(List<ReadHistoryInfo> list) {
        Log.d("ProgramHistoryProxy_", "refreshList GetData: " + list.size());
        if (list.size() > 0) {
            a(new ArrayList(list), 0);
        } else {
            a((List<ReadHistoryInfo>) null, 2);
        }
    }

    private void a(List<ReadHistoryInfo> list, int i) {
        Log.i("ProgramHistoryProxy_", "msgId:ProgramHistoryProxy_program_history_datalist--" + list);
        Netprogram.HistoryInfoList.a a = Netprogram.HistoryInfoList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (ReadHistoryInfo readHistoryInfo : list) {
                a.a(Netprogram.HistoryInfoBean.newBuilder().a(Netprogram.HistoryInfo.newBuilder().a(readHistoryInfo.getAlbumId()).a(be.e(readHistoryInfo.getAlbumName())).b(readHistoryInfo.getArtistId()).b(be.e(readHistoryInfo.getArtist())).a(be.e(readHistoryInfo.getAlbumName())).c(be.e(readHistoryInfo.getLogo())).d(be.e(readHistoryInfo.getLargeLogo())).e(be.e(readHistoryInfo.getMediumLogo())).f(be.e(readHistoryInfo.getTrackTitle())).c(readHistoryInfo.getUpdateTime()).g(be.e(readHistoryInfo.getShortIntro())).h(be.e(readHistoryInfo.getIntro())).d(readHistoryInfo.getPlayCount()).i(be.e(readHistoryInfo.getCategoryName())).a(readHistoryInfo.getPaymentType()).a(readHistoryInfo.getAuthorized()).j(be.e(readHistoryInfo.getPlayingPercent())).build()).a(axj.a().c(readHistoryInfo.getAlbumId())).build());
            }
        }
        a("ProgramHistoryProxy_program_history_datalist", (AbstractMessageLite) a.build());
    }
}
