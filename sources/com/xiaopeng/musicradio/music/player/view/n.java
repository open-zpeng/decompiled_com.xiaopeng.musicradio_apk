package com.xiaopeng.musicradio.music.player.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.music.player.presenter.MusicPlayerPresenter;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Player;
import com.xiaopeng.musicradio.utils.be;
/* compiled from: MusicPlayerViewProxy.java */
/* loaded from: classes.dex */
public class n extends aeu<g, MusicPlayerPresenter> implements g {
    @Override // com.xiaopeng.musicradio.playercomponent.big.view.b
    public void F_() {
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void G_() {
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void H_() {
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void b(int i, boolean z) {
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void b_(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void h() {
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void l() {
    }

    public n(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public MusicPlayerPresenter g() {
        return new MusicPlayerPresenter();
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void a(int i, boolean z) {
        a("MusicPlayerViewProxy_player_music_updatemode", (AbstractMessageLite) Player.PlayMode.newBuilder().a(i).a(z).build());
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void a(boolean z, boolean z2) {
        a("MusicPlayerViewProxy_player_music_updatelove", (AbstractMessageLite) Player.MediaLove.newBuilder().a(z).b(z2).build());
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void b(boolean z) {
        a("MusicPlayerViewProxy_player_music_showvip", (AbstractMessageLite) Common.BoolParam.newBuilder().a(z).build());
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.b
    public void b(String str, String str2) {
        a("MusicPlayerViewProxy_player_music_updatetitle", (AbstractMessageLite) Player.TitleInfo.newBuilder().a(be.e(str)).b(be.e(str2)).build());
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("MusicPlayerViewProxy", "monoMessage: " + str + " value = " + bArr);
        if (TextUtils.equals("clickLove", str)) {
            ((MusicPlayerPresenter) this.c).i();
        } else if (TextUtils.equals("clickMode", str)) {
            ((MusicPlayerPresenter) this.c).j();
        } else if (TextUtils.equals("getMode", str)) {
            ((MusicPlayerPresenter) this.c).n();
        } else if (TextUtils.equals("getCurrent", str)) {
            ((MusicPlayerPresenter) this.c).z_();
            ((MusicPlayerPresenter) this.c).c();
        }
    }
}
