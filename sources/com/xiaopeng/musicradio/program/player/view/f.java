package com.xiaopeng.musicradio.program.player.view;

import android.content.Context;
import android.text.TextUtils;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.program.player.presenter.ProgramPlayerPresenter;
import com.xiaopeng.musicradio.proto.Player;
import com.xiaopeng.musicradio.utils.be;
/* compiled from: ProgramPlayerViewProxy.java */
/* loaded from: classes2.dex */
public class f extends aeu<b, ProgramPlayerPresenter> implements b {
    @Override // com.xiaopeng.musicradio.program.player.view.b
    public void a() {
    }

    public f(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: b */
    public ProgramPlayerPresenter g() {
        return new ProgramPlayerPresenter();
    }

    @Override // com.xiaopeng.musicradio.program.player.view.b
    public void a(float f) {
        a("ProgramPlayerViewProxy_player_program_updatespeed", (AbstractMessageLite) Player.ProgramSpeed.newBuilder().a(f).build());
    }

    @Override // com.xiaopeng.musicradio.program.player.view.b
    public void f_(boolean z) {
        a("ProgramPlayerViewProxy_player_program_updatelove", (AbstractMessageLite) Player.MediaLove.newBuilder().a(z).b(true).build());
    }

    @Override // com.xiaopeng.musicradio.program.player.view.b
    public void a(int i, boolean z) {
        b("ProgramPlayerViewProxy_player_program_updatevipstate", Player.ProgramVipType.newBuilder().a(i).a(z).build());
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.b
    public void b(String str, String str2) {
        b("ProgramPlayerViewProxy_player_program_updatetitle", Player.TitleInfo.newBuilder().a(be.e(str)).b(be.e(str2)).build());
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.b
    public void F_() {
        c_("SetDefault", "");
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        if (TextUtils.equals("clickLove", str)) {
            ((ProgramPlayerPresenter) this.c).i();
        } else if (TextUtils.equals("clickSpeed", str)) {
            ((ProgramPlayerPresenter) this.c).j();
        } else if (TextUtils.equals("getSpeed", str)) {
            ((ProgramPlayerPresenter) this.c).h();
        } else if (TextUtils.equals("getLove", str)) {
            ((ProgramPlayerPresenter) this.c).e();
        } else if (TextUtils.equals("getCurrent", str)) {
            ((ProgramPlayerPresenter) this.c).z_();
        }
    }
}
