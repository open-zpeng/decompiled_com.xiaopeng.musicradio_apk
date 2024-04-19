package com.xiaopeng.musicradio.program.category.view;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumTracksBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.XmArtistBean;
import com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Netprogram;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.bg;
import com.xiaopeng.musicradio.utils.z;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RdDetailManagerViewProxy.java */
/* loaded from: classes2.dex */
public class h extends aeu<d, RdDetailPresenter> implements d {
    List<FMAlbumTracksBean.DataBean.ListBean> e;

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void Y_() {
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void a() {
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void a(long j) {
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void a(long j, boolean z) {
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void aa_() {
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void ab_() {
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void ac_() {
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void h_(int i) {
    }

    public h(Context context, String str) {
        super(context, str);
        this.e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: h */
    public RdDetailPresenter g() {
        Log.d("RdDetailManagerViewProxy_", "createPresenter: create P");
        return new RdDetailPresenter();
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void a(FMAlbumTracksBean fMAlbumTracksBean) {
        if (fMAlbumTracksBean != null && fMAlbumTracksBean.getData() != null && fMAlbumTracksBean.getData().getList() != null && fMAlbumTracksBean.getData().getList().size() > 0) {
            Log.d("RdDetailManagerViewProxy_", "onUpdateTracks: GetData " + fMAlbumTracksBean.getData().getList().size());
            a(fMAlbumTracksBean, 0);
        } else {
            Log.d("RdDetailManagerViewProxy_", "onUpdateTracks: GetData ====== U3D_NO_RESULT-2");
            a((FMAlbumTracksBean) null, 2);
        }
        n();
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void b(FMAlbumTracksBean fMAlbumTracksBean) {
        if (fMAlbumTracksBean != null && fMAlbumTracksBean.getData() != null && fMAlbumTracksBean.getData().getList() != null && fMAlbumTracksBean.getData().getList().size() > 0) {
            Log.d("RdDetailManagerViewProxy_", "onUpdateSpecialTracks : GetData " + fMAlbumTracksBean.getData().getList().size());
            a(fMAlbumTracksBean, 0);
        } else {
            Log.d("RdDetailManagerViewProxy_", "onUpdateSpecialTracks: GetData ====== U3D_NO_RESULT-2");
            a((FMAlbumTracksBean) null, 2);
        }
        n();
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void a(int i, String str) {
        Log.d("RdDetailManagerViewProxy_", "onUpdateTracksError: GetData ====== U3D_ERROR-1");
        a((FMAlbumTracksBean) null, 1);
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void c(FMAlbumTracksBean fMAlbumTracksBean) {
        if (fMAlbumTracksBean != null && fMAlbumTracksBean.getData() != null && fMAlbumTracksBean.getData().getList() != null && fMAlbumTracksBean.getData().getList().size() > 0) {
            Log.d("RdDetailManagerViewProxy_", "onUpdateTracksPre : GetData " + fMAlbumTracksBean.getData().getList());
            b(fMAlbumTracksBean, 0);
        } else {
            Log.d("RdDetailManagerViewProxy_", "onUpdateTracksPre: GetData ====== U3D_NO_RESULT-2");
            b((FMAlbumTracksBean) null, 2);
        }
        n();
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void e_(boolean z) {
        b(z);
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void a(String str) {
        Log.d("RdDetailManagerViewProxy_", "onUpdateSort: GetData sort ======" + str);
        b(str);
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void Z_() {
        ArrayList arrayList = new ArrayList();
        for (FMAlbumTracksBean.DataBean.ListBean listBean : this.e) {
            ProgramBean a = aq.a(listBean, ((RdDetailPresenter) this.c).e());
            if (a != null) {
                arrayList.add(a);
            }
        }
        ((RdDetailPresenter) this.c).a((List<ProgramBean>) arrayList);
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("RdDetailManagerViewProxy_", " --monoMessage-- " + str + " --value-- " + bArr);
        if ("getAlbumTracks".equalsIgnoreCase(str)) {
            this.e.clear();
            try {
                Netprogram.AlbumBean parseFrom = Netprogram.AlbumBean.parseFrom(bArr);
                Log.i("RdDetailManagerViewProxy_", "byte monoMessage info-- " + parseFrom);
                Netprogram.Artist artist = parseFrom.getArtist();
                XmArtistBean xmArtistBean = new XmArtistBean();
                xmArtistBean.setId(artist.getId());
                xmArtistBean.setName(be.e(artist.getName()));
                RdAlbumBean rdAlbumBean = new RdAlbumBean();
                rdAlbumBean.setId(parseFrom.getId());
                rdAlbumBean.setIntro(be.e(parseFrom.getIntro()));
                rdAlbumBean.setShortIntro(be.e(parseFrom.getShortIntro()));
                rdAlbumBean.setTitle(be.e(parseFrom.getTitle()));
                rdAlbumBean.setLargeLogo(be.e(parseFrom.getLargeLogo()));
                rdAlbumBean.setMediumLogo(be.e(parseFrom.getMediumLogo()));
                rdAlbumBean.setCategoryName(be.e(parseFrom.getCategoryName()));
                rdAlbumBean.setPaymentType(parseFrom.getPaymentType());
                rdAlbumBean.setPlayCount(parseFrom.getPlayCount());
                rdAlbumBean.setSmallLogo(be.e(parseFrom.getSmallLogo()));
                rdAlbumBean.setUpdateTime(parseFrom.getUpdateTime());
                rdAlbumBean.setArtist(xmArtistBean);
                rdAlbumBean.setAuthorized(parseFrom.getAuthorized());
                Bundle bundle = new Bundle();
                bundle.putString("album_id", String.valueOf(rdAlbumBean.getId()));
                bundle.putString("album_bean_gson", z.a(rdAlbumBean));
                ((RdDetailPresenter) this.c).a(1);
                ((RdDetailPresenter) this.c).g();
                ((RdDetailPresenter) this.c).a(true);
                ((RdDetailPresenter) this.c).a(bundle);
                ((RdDetailPresenter) this.c).n();
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        } else if ("getNextPageTracks".equalsIgnoreCase(str)) {
            if (this.e.size() > 0) {
                ((RdDetailPresenter) this.c).b(this.e.get(this.e.size() - 1).getOrderNum());
            }
            Log.i("RdDetailManagerViewProxy_", "NextPageTracks isHasMore -- " + ((RdDetailPresenter) this.c).o());
            if (((RdDetailPresenter) this.c).o()) {
                ((RdDetailPresenter) this.c).c(true);
            } else {
                i();
            }
        } else if ("getPrevPageTracks".equalsIgnoreCase(str)) {
            if (this.e.size() > 0) {
                ((RdDetailPresenter) this.c).b(this.e.get(0).getOrderNum());
            }
            Log.i("RdDetailManagerViewProxy_", "PrevPageTracks isHasPre -- " + ((RdDetailPresenter) this.c).p());
            if (((RdDetailPresenter) this.c).p()) {
                ((RdDetailPresenter) this.c).c(false);
            } else {
                l();
            }
        } else if ("playAll".equalsIgnoreCase(str)) {
            if (((RdDetailPresenter) this.c).w()) {
                m();
            } else {
                Z_();
            }
        } else if ("playByIndex".equalsIgnoreCase(str)) {
            try {
                b(Common.IntParam.parseFrom(bArr).getParam());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if ("setSort".equalsIgnoreCase(str)) {
            this.e.clear();
            try {
                String param = Common.StringParam.parseFrom(bArr).getParam();
                Log.d("RdDetailManagerViewProxy_", "byte monoMessage setSort =======: " + param);
                ((RdDetailPresenter) this.c).a(param);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        } else if ("setPage".equalsIgnoreCase(str)) {
            this.e.clear();
            try {
                ((RdDetailPresenter) this.c).a(Common.IntParam.parseFrom(bArr).getParam());
                ((RdDetailPresenter) this.c).n();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    private void b(int i) {
        ProgramBean r = axn.i().r();
        FMAlbumTracksBean.DataBean.ListBean listBean = this.e.get(i);
        if (r != null && r.getTrackId() == listBean.getId()) {
            if (axn.i().getPlayState() == 2 || axn.i().getPlayState() == 1) {
                axn.i().pause();
                return;
            } else {
                axn.i().play();
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (FMAlbumTracksBean.DataBean.ListBean listBean2 : this.e) {
            ProgramBean a = aq.a(listBean2, ((RdDetailPresenter) this.c).e());
            if (a != null) {
                arrayList.add(a);
            }
        }
        Log.d("RdDetailManagerViewProxy_", "monoMessage Getdata ======: " + arrayList.size());
        ((RdDetailPresenter) this.c).d(arrayList, i);
    }

    private void m() {
        axn.i().pause();
    }

    private void a(FMAlbumTracksBean fMAlbumTracksBean, int i) {
        Log.i("RdDetailManagerViewProxy_", "msgId:RdDetailManagerViewProxy_program_detail_datalist--code--" + i + "--bean--" + fMAlbumTracksBean);
        if (fMAlbumTracksBean != null && fMAlbumTracksBean.getData() != null && fMAlbumTracksBean.getData().getList() != null) {
            this.e.addAll(fMAlbumTracksBean.getData().getList());
        }
        Netprogram.RdTrackBeanList.a a = Netprogram.RdTrackBeanList.newBuilder().a(i);
        if (fMAlbumTracksBean != null && fMAlbumTracksBean.getData() != null && fMAlbumTracksBean.getData().getList() != null && fMAlbumTracksBean != null && fMAlbumTracksBean.getData() != null && fMAlbumTracksBean.getData().getList().size() > 0) {
            for (FMAlbumTracksBean.DataBean.ListBean listBean : fMAlbumTracksBean.getData().getList()) {
                a.a(a(listBean));
            }
        }
        Log.i("RdDetailManagerViewProxy_", "program_detail_datalist listBuilder:" + a.a());
        a("RdDetailManagerViewProxy_program_detail_datalist", (AbstractMessageLite) a.build());
    }

    private void b(FMAlbumTracksBean fMAlbumTracksBean, int i) {
        Log.i("RdDetailManagerViewProxy_", "msgId:RdDetailManagerViewProxy_program_detail_prev_datalist--code--" + i + "--bean--" + fMAlbumTracksBean);
        if (fMAlbumTracksBean != null && fMAlbumTracksBean.getData() != null && fMAlbumTracksBean.getData().getList() != null) {
            this.e.addAll(0, fMAlbumTracksBean.getData().getList());
        }
        Netprogram.RdTrackBeanList.a a = Netprogram.RdTrackBeanList.newBuilder().a(i);
        if (fMAlbumTracksBean != null && fMAlbumTracksBean.getData() != null && fMAlbumTracksBean.getData().getList() != null) {
            for (FMAlbumTracksBean.DataBean.ListBean listBean : fMAlbumTracksBean.getData().getList()) {
                a.a(a(listBean));
            }
        }
        Log.i("RdDetailManagerViewProxy_", "program_detail_prev_datalist listBuilder:" + a.a());
        a("RdDetailManagerViewProxy_program_detail_prev_datalist", (AbstractMessageLite) a.build());
    }

    private void n() {
        List<String> j = ((RdDetailPresenter) this.c).j();
        int d = ((RdDetailPresenter) this.c).d();
        int i = j.size() > 0 ? 0 : 2;
        Log.i("RdDetailManagerViewProxy_", "msgId:RdDetailManagerViewProxy_program_detail_page_datalist--" + i + "--" + j.size());
        Netprogram.PageList.a a = Netprogram.PageList.newBuilder().a(i);
        if (j != null && j.size() > 0) {
            for (String str : j) {
                a.a(Netprogram.Page.newBuilder().a(be.e(str)).a(d).build());
            }
        }
        a("RdDetailManagerViewProxy_program_detail_page_datalist", (AbstractMessageLite) a.build());
    }

    public void i() {
        Log.i("RdDetailManagerViewProxy_", "RdDetailManagerViewProxy_read_detail_load_end 关闭手指上滑 加载更多动画");
        a("RdDetailManagerViewProxy_read_detail_load_end", (AbstractMessageLite) Common.StringParam.newBuilder().a("").build());
    }

    public void l() {
        Log.i("RdDetailManagerViewProxy_", "RdDetailManagerViewProxy_read_detail_load_preend 关闭手指下滑 加载更多动画");
        a("RdDetailManagerViewProxy_read_detail_load_preend", (AbstractMessageLite) Common.StringParam.newBuilder().a("").build());
    }

    private void b(String str) {
        Log.i("RdDetailManagerViewProxy_", "msgId:RdDetailManagerViewProxy_program_detail_sort--" + str);
        a("RdDetailManagerViewProxy_program_detail_sort", (AbstractMessageLite) Common.StringParam.newBuilder().a(be.e(str)).build());
    }

    private void b(boolean z) {
        Log.i("RdDetailManagerViewProxy_", "msgId:RdDetailManagerViewProxy_program_detail_love--" + z);
        a("RdDetailManagerViewProxy_program_detail_love", (AbstractMessageLite) Common.BoolParam.newBuilder().a(z).build());
    }

    public Netprogram.RdTrackBean a(FMAlbumTracksBean.DataBean.ListBean listBean) {
        return Netprogram.RdTrackBean.newBuilder().a(listBean.getId()).a(listBean.getCreateTime()).b(listBean.getOrderNum()).a(be.e(listBean.getTitle())).b(listBean.getUpdateTime()).c(listBean.getPaymentType()).a(listBean.isAuthorized()).b(bg.i(listBean.getCreateTime() > 0 ? listBean.getCreateTime() : listBean.getUpdateTime())).build();
    }
}
