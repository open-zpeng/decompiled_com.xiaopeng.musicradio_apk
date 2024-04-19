package com.xiaopeng.musicradio.netradio.player.view;

import android.content.Context;
import android.text.TextUtils;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.netradio.player.presenter.NetRadioPlayerPresenter;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Player;
import com.xiaopeng.musicradio.utils.be;
/* compiled from: NetRadioPlayerViewProxy.java */
/* loaded from: classes2.dex */
public class g extends aeu<b, NetRadioPlayerPresenter> implements b {
    @Override // com.xiaopeng.musicradio.playercomponent.big.view.b
    public void F_() {
    }

    public g(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public NetRadioPlayerPresenter g() {
        return new NetRadioPlayerPresenter();
    }

    @Override // com.xiaopeng.musicradio.netradio.player.view.b
    public void d_(boolean z) {
        a("NetRadioPlayerViewProxy_player_netradio_refreshlive", (AbstractMessageLite) Common.BoolParam.newBuilder().a(z).build());
    }

    @Override // com.xiaopeng.musicradio.netradio.player.view.b
    public void b(boolean z) {
        a("NetRadioPlayerViewProxy_player_netradio_updatelove", (AbstractMessageLite) Player.MediaLove.newBuilder().a(z).b(true).build());
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.b
    public void b(String str, String str2) {
        a("NetRadioPlayerViewProxy_player_netradio_updatetitle", (AbstractMessageLite) Player.TitleInfo.newBuilder().a(be.e(str)).b(be.e(str2)).build());
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        if (TextUtils.equals("clickLove", str)) {
            ((NetRadioPlayerPresenter) this.c).e();
        } else if (TextUtils.equals("clickLive", str)) {
            ((NetRadioPlayerPresenter) this.c).f();
        } else if (TextUtils.equals("getCurrent", str)) {
            ((NetRadioPlayerPresenter) this.c).z_();
        }
    }
}
