package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.rank.presenter.RankListPresenter;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Netprogram;
import java.util.List;
/* compiled from: RankListManagerViewProxy.java */
/* renamed from: axs  reason: default package */
/* loaded from: classes2.dex */
public class axs extends aeu<axq, RankListPresenter> implements axq {
    public axs(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public RankListPresenter g() {
        return new RankListPresenter();
    }

    @Override // defpackage.axq
    public void a(List<RdAlbumBean> list, int i, boolean z) {
        if (i == 1) {
            a(list, 0);
        } else if (z) {
        } else {
            b(list, 0);
        }
    }

    @Override // com.xiaopeng.musicradio.program.common.view.b
    public void a(boolean z, int i, int i2) {
        if (i >= 1 && i2 >= 1 && i < i2) {
            a(true);
        } else {
            a(false);
        }
    }

    @Override // defpackage.axq
    public void a_(long j) {
        c_("UpdatePlayState", "");
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        Log.i("RankListManagerViewProxy_", "monoMessage" + str + "value--" + bArr);
        super.a(str, bArr);
        if ("initList".equalsIgnoreCase(str)) {
            try {
                ((RankListPresenter) this.c).b(Common.IntParam.parseFrom(bArr).getParam());
                ((RankListPresenter) this.c).c();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if ("requestList".equalsIgnoreCase(str)) {
            try {
                ((RankListPresenter) this.c).b(Common.IntParam.parseFrom(bArr).getParam());
                ((RankListPresenter) this.c).c();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if ("playRdAlbum".equalsIgnoreCase(str)) {
            RdAlbumBean g = bhx.g(bArr);
            if (g != null) {
                ((RankListPresenter) this.c).b(g);
            }
        } else if ("loadNextPage".equalsIgnoreCase(str)) {
            ((RankListPresenter) this.c).d();
        }
    }

    private void a(List<RdAlbumBean> list, int i) {
        Log.i("RankListManagerViewProxy_", "msgId:RankListManagerViewProxy_program_ranklist_init_datalist--" + list);
        a("RankListManagerViewProxy_program_ranklist_init_datalist", list, i);
    }

    private void b(List<RdAlbumBean> list, int i) {
        Log.i("RankListManagerViewProxy_", "msgId:RankListManagerViewProxy_program_ranklist_more_datalist--" + list);
        a("RankListManagerViewProxy_program_ranklist_more_datalist", list, i);
    }

    private void a(String str, List<RdAlbumBean> list, int i) {
        Log.i("RankListManagerViewProxy_", "msgId:" + str + "--" + list);
        Netprogram.AlbumBeanList.a a = Netprogram.AlbumBeanList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (RdAlbumBean rdAlbumBean : list) {
                a.a(bhw.a(rdAlbumBean));
            }
        }
        a(str, (AbstractMessageLite) a.build());
    }

    private void a(boolean z) {
        Log.i("RankListManagerViewProxy_", "msgId:RankListManagerViewProxy_program_ranklist_hasmore--" + z);
        a("RankListManagerViewProxy_program_ranklist_hasmore", (AbstractMessageLite) Common.BoolParam.newBuilder().a(z).build());
    }

    @Override // com.xiaopeng.musicradio.program.common.view.b
    public void X_() {
        a(3);
        a((List<RdAlbumBean>) null, 2);
    }

    @Override // com.xiaopeng.musicradio.program.common.view.b
    public void a(String str, int i) {
        if (i == 1) {
            a(2);
            a((List<RdAlbumBean>) null, 1);
            return;
        }
        a(0);
        b((List<RdAlbumBean>) null, 1);
    }

    private void a(int i) {
        Log.i("RankListManagerViewProxy_", "ShowLoadingTip" + i);
    }
}
