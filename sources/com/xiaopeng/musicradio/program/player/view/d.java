package com.xiaopeng.musicradio.program.player.view;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumTracksBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.player.presenter.ProgramPlayListPresenter;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Player;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProgramPlayListViewProxy.java */
/* loaded from: classes2.dex */
public class d extends aeu<a, ProgramPlayListPresenter> implements a {
    private List<FMAlbumTracksBean.DataBean.ListBean> e;

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void a(int i, String str) {
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void a(long j, boolean z) {
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void a(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void al_() {
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void h() {
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void i() {
    }

    public d(Context context, String str) {
        super(context, str);
        this.e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public ProgramPlayListPresenter g() {
        return new ProgramPlayListPresenter();
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void a(String str) {
        Log.i("ProgramPlayListViewProx", "onUpdateSort: " + str);
        a("ProgramPlayListViewProxy_player_program_updatesort", (AbstractMessageLite) Player.ProgramSort.newBuilder().a(be.e(str)).build());
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void a(FMAlbumTracksBean fMAlbumTracksBean, int i, int i2) {
        Log.i("ProgramPlayListViewProx", "onUpdateTracks: " + i + " totalPage = " + i2 + " hasNext = " + ((ProgramPlayListPresenter) this.c).i());
        if (fMAlbumTracksBean.getData() == null || fMAlbumTracksBean.getData().getList() == null) {
            return;
        }
        if (i == 1) {
            this.e.clear();
        }
        this.e.addAll(fMAlbumTracksBean.getData().getList());
        Player.ProgramPlayList.a a = Player.ProgramPlayList.newBuilder().b(i2).a(i).a(((ProgramPlayListPresenter) this.c).f());
        for (FMAlbumTracksBean.DataBean.ListBean listBean : fMAlbumTracksBean.getData().getList()) {
            a.a(Player.ProgramPlayInfo.newBuilder().a(listBean.getId()).a(be.e(listBean.getTitle())).a(listBean.isAuthorized()).a(listBean.getCreateTime()).b(listBean.getOrderNum()).c(listBean.getPaymentType()).b(listBean.getUpdateTime()).build());
        }
        a("ProgramPlayListViewProxy_player_program_updatelist", (AbstractMessageLite) a.build());
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void a(FMAlbumTracksBean fMAlbumTracksBean) {
        if (fMAlbumTracksBean.getData() == null || fMAlbumTracksBean.getData().getList() == null) {
            return;
        }
        this.e.addAll(0, fMAlbumTracksBean.getData().getList());
        Player.ProgramPlayPreList.a a = Player.ProgramPlayPreList.newBuilder().a(((ProgramPlayListPresenter) this.c).l()).a(((ProgramPlayListPresenter) this.c).f());
        for (FMAlbumTracksBean.DataBean.ListBean listBean : fMAlbumTracksBean.getData().getList()) {
            a.a(Player.ProgramPlayInfo.newBuilder().a(listBean.getId()).a(be.e(listBean.getTitle())).a(listBean.isAuthorized()).a(listBean.getCreateTime()).b(listBean.getOrderNum()).c(listBean.getPaymentType()).b(listBean.getUpdateTime()).build());
        }
        a("ProgramPlayListViewProxy_player_program_updateprevlist", (AbstractMessageLite) a.build());
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void am_() {
        ProgramBean p = ((ProgramPlayListPresenter) this.c).p();
        if (p != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("playState", Integer.valueOf(axn.i().getPlayState()));
            hashMap.put("trackId", Long.valueOf(p.getTrackId()));
            c_("UpdatePlayState", z.a(hashMap));
        }
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        Log.i("ProgramPlayListViewProx", "monoMessage: " + str + " value = " + bArr);
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -2131166909:
                    if (str.equals("getCurrent")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1965085882:
                    if (str.equals("clickSort")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1802491905:
                    if (str.equals("playOrPause")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1274534046:
                    if (str.equals("prevPage")) {
                        c = 5;
                        break;
                    }
                    break;
                case -846725252:
                    if (str.equals("requestPageList")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1424273442:
                    if (str.equals("nextPage")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1984860689:
                    if (str.equals("setPage")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b(Common.StringParam.parseFrom(bArr).getParam());
                    return;
                case 1:
                    b(Common.IntParam.parseFrom(bArr).getParam());
                    return;
                case 2:
                    k();
                    return;
                case 3:
                    a(Common.IntParam.parseFrom(bArr).getParam());
                    return;
                case 4:
                    b();
                    return;
                case 5:
                    j();
                    return;
                case 6:
                    ((ProgramPlayListPresenter) this.c).c();
                    return;
                default:
                    return;
            }
        } catch (Exception e) {
            Log.e("ProgramPlayListViewProx", "monoMessage: ", e);
        }
    }

    private void b() {
        ((ProgramPlayListPresenter) this.c).c(true);
    }

    private void j() {
        ((ProgramPlayListPresenter) this.c).c(false);
    }

    private void a(int i) {
        ((ProgramPlayListPresenter) this.c).b(i + 1);
        ((ProgramPlayListPresenter) this.c).a(true);
    }

    private void k() {
        ((ProgramPlayListPresenter) this.c).h();
        Player.ProgramPageList.a a = Player.ProgramPageList.newBuilder().a(((ProgramPlayListPresenter) this.c).l() - 1);
        for (int i = 0; i < ((ProgramPlayListPresenter) this.c).g().size(); i++) {
            a.a(((ProgramPlayListPresenter) this.c).g().get(i));
        }
        a("ProgramPlayListViewProxy_player_program_updatepagelist", (AbstractMessageLite) a.build());
    }

    private void b(String str) {
        ((ProgramPlayListPresenter) this.c).a(str);
    }

    private void b(int i) {
        boolean z;
        Log.i("ProgramPlayListViewProx", "playOrPause: " + i);
        ProgramBean p = ((ProgramPlayListPresenter) this.c).p();
        int i2 = 0;
        if (p != null) {
            z = p.getTrackId() == ((long) i);
        } else {
            z = false;
        }
        if (z) {
            Log.i("ProgramPlayListViewProx", "playOrPause: same ========= ");
            if (((ProgramPlayListPresenter) this.c).m()) {
                ((ProgramPlayListPresenter) this.c).o();
                return;
            } else {
                ((ProgramPlayListPresenter) this.c).n();
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        RdAlbumBean b = aq.b(axn.i().r());
        int i3 = -1;
        if (b != null) {
            for (FMAlbumTracksBean.DataBean.ListBean listBean : this.e) {
                ProgramBean a = aq.a(listBean, b);
                if (a != null) {
                    arrayList.add(a);
                    if (a.getTrackId() == i) {
                        i3 = i2;
                    }
                    i2++;
                }
            }
        }
        Log.i("ProgramPlayListViewProx", "playOrPause: not same position ========= " + i3 + " size = " + this.e.size());
        if (i3 >= 0 || i3 < arrayList.size()) {
            ((ProgramPlayListPresenter) this.c).b(arrayList, i3);
        }
    }
}
