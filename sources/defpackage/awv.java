package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.reading.RankBean;
import com.xiaopeng.musicradio.bean.xpbean.HotRankListBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.choice.presenter.ProgramChoicePresenter;
import com.xiaopeng.musicradio.proto.Netprogram;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.z;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProgramChoiceMgrViewProxy.java */
/* renamed from: awv  reason: default package */
/* loaded from: classes2.dex */
public class awv extends aeu<awt, ProgramChoicePresenter> implements awt {
    @Override // defpackage.awt
    public void ad_() {
    }

    @Override // defpackage.awt
    public void ae_() {
    }

    @Override // defpackage.awt
    public void i_(int i) {
    }

    public awv(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: h */
    public ProgramChoicePresenter g() {
        return new ProgramChoicePresenter();
    }

    @Override // defpackage.awt
    public void a(List<HotRankListBean.DataBean.RankBean> list) {
        LogUtils.d("liangyc", "update rank list");
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (HotRankListBean.DataBean.RankBean rankBean : list) {
                RankBean rankBean2 = new RankBean();
                rankBean2.setmAlbumInfos(rankBean.getAlbumInfos());
                rankBean2.setmAlbumInfosString(z.a(rankBean2.getmAlbumInfos()));
                Log.i("ProgramChoiceMgrViewProxy_", "bean.getmAlbumInfosString() " + rankBean2.getmAlbumInfosString());
                rankBean2.setmContentType(rankBean.getContentType());
                rankBean2.setmCoverPath(rankBean.getCoverPath());
                rankBean2.setmRankId(rankBean.getRankId());
                rankBean2.setmRankName(rankBean.getRankName());
                arrayList.add(rankBean2);
            }
            a(arrayList, 0);
            return;
        }
        a((List<RankBean>) null, 2);
    }

    @Override // defpackage.awt
    public void a() {
        a((List<RankBean>) null, 1);
    }

    @Override // defpackage.awt
    public void af_() {
        c_("UpdatePlayState", "");
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        RdAlbumBean g;
        super.a(str, bArr);
        if ("initData".equals(str)) {
            ((ProgramChoicePresenter) this.c).c();
        }
        if (!"playRdAlbum".equals(str) || bArr == null || (g = bhx.g(bArr)) == null) {
            return;
        }
        ((ProgramChoicePresenter) this.c).b(g);
    }

    private void a(List<RankBean> list, int i) {
        Log.i("ProgramChoiceMgrViewProxy_", "msgId:ProgramChoiceMgrViewProxy_program_choice_datalist--" + list);
        Netprogram.RankBeanList.a a = Netprogram.RankBeanList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (RankBean rankBean : list) {
                Netprogram.RankBean.a a2 = Netprogram.RankBean.newBuilder().a(rankBean.getmRankId()).a(be.e(rankBean.getmRankName()));
                for (RdAlbumBean rdAlbumBean : rankBean.getmAlbumInfos()) {
                    a2.a(bhw.a(rdAlbumBean));
                }
                a.a(a2.build());
            }
        }
        a("ProgramChoiceMgrViewProxy_program_choice_datalist", (AbstractMessageLite) a.build());
    }
}
