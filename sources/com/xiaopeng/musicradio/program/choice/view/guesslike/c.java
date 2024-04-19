package com.xiaopeng.musicradio.program.choice.view.guesslike;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.choice.presenter.guesslike.GuessLikePresenter;
import com.xiaopeng.musicradio.proto.Netprogram;
import java.util.List;
/* compiled from: GuessLikeManagerViewProxy.java */
/* loaded from: classes2.dex */
public class c extends aeu<d, GuessLikePresenter> implements d {
    @Override // com.xiaopeng.musicradio.program.choice.view.guesslike.d
    public void a(long j, int i) {
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.guesslike.d
    public void ah_() {
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.guesslike.d
    public boolean ai_() {
        return false;
    }

    public c(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public GuessLikePresenter g() {
        return new GuessLikePresenter();
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.guesslike.d
    public void a(List<RdAlbumBean> list) {
        a(list, 0);
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.guesslike.d
    public void a(boolean z, boolean z2) {
        if (z) {
            a(1);
        } else if (!z2) {
            a((List<RdAlbumBean>) null, 1);
            a(2);
        } else {
            a((List<RdAlbumBean>) null, 2);
            a(0);
        }
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        RdAlbumBean g;
        Log.i("GuessLikeManagerViewProxy_", "byte monoMessage--" + str + "--value--" + bArr);
        super.a(str, bArr);
        if ("refreshGuessItem".equalsIgnoreCase(str)) {
            axe.c().a(true);
        } else if (!"playGuessLike".equalsIgnoreCase(str) || (g = bhx.g(bArr)) == null) {
        } else {
            ((GuessLikePresenter) this.c).b(g);
        }
    }

    private void a(List<RdAlbumBean> list, int i) {
        Log.i("GuessLikeManagerViewProxy_", "msgId:GuessLikeManagerViewProxy_program_guesslike_datalist--code--" + i + "--list--" + list);
        Netprogram.AlbumBeanList.a a = Netprogram.AlbumBeanList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (RdAlbumBean rdAlbumBean : list) {
                a.a(bhw.a(rdAlbumBean));
            }
        }
        a("GuessLikeManagerViewProxy_program_guesslike_datalist", (AbstractMessageLite) a.build());
    }

    private void a(int i) {
        Log.i("GuessLikeManagerViewProxy_", "ShowLoadingTip--" + i);
    }
}
