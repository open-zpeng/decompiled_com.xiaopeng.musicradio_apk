package com.xiaopeng.musicradio.program.choice.view.guesslike;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.choice.presenter.guesslike.GuessLikeListPresenter;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Netprogram;
import java.util.List;
/* compiled from: GuessLikeListManagerViewProxy.java */
/* loaded from: classes2.dex */
public class b extends aeu<e, GuessLikeListPresenter> implements e {
    public b(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public GuessLikeListPresenter g() {
        return new GuessLikeListPresenter();
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.guesslike.e
    public void a(List<RdAlbumBean> list, int i, boolean z) {
        a(0);
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

    @Override // com.xiaopeng.musicradio.program.choice.view.guesslike.e
    public void a_(long j) {
        c_("UpdatePlayState", "");
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        Log.i("GuessLikeListManagerViewProxy_", "monoMessage" + str + "value--" + bArr);
        super.a(str, bArr);
        if ("initList".equalsIgnoreCase(str)) {
            ((GuessLikeListPresenter) this.c).c();
        } else if ("requestList".equalsIgnoreCase(str)) {
            ((GuessLikeListPresenter) this.c).c();
        } else if ("playRdAlbum".equalsIgnoreCase(str)) {
            RdAlbumBean g = bhx.g(bArr);
            if (g != null) {
                ((GuessLikeListPresenter) this.c).b(g);
            }
        } else if ("loadNextPage".equalsIgnoreCase(str)) {
            ((GuessLikeListPresenter) this.c).d();
        }
    }

    private void a(List<RdAlbumBean> list, int i) {
        Log.i("GuessLikeListManagerViewProxy_", "msgId:GuessLikeListManagerViewProxy_program_guesslike_init_datalist--" + list);
        a("GuessLikeListManagerViewProxy_program_guesslike_init_datalist", list, i);
    }

    private void b(List<RdAlbumBean> list, int i) {
        Log.i("GuessLikeListManagerViewProxy_", "msgId:GuessLikeListManagerViewProxy_program_guesslike_more_datalist--" + list);
        a("GuessLikeListManagerViewProxy_program_guesslike_more_datalist", list, i);
    }

    private void a(String str, List<RdAlbumBean> list, int i) {
        Log.i("GuessLikeListManagerViewProxy_", "msgId:" + str + "--" + list);
        Netprogram.AlbumBeanList.a a = Netprogram.AlbumBeanList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (RdAlbumBean rdAlbumBean : list) {
                a.a(bhw.a(rdAlbumBean));
            }
        }
        a(str, (AbstractMessageLite) a.build());
    }

    private void a(boolean z) {
        Log.i("GuessLikeListManagerViewProxy_", "msgId:GuessLikeListManagerViewProxy_program_guesslike_hasmore--" + z);
        a("GuessLikeListManagerViewProxy_program_guesslike_hasmore", (AbstractMessageLite) Common.BoolParam.newBuilder().a(z).build());
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
        Log.i("GuessLikeListManagerViewProxy_", "ShowLoadingTip" + i);
    }
}
