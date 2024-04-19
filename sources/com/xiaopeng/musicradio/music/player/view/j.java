package com.xiaopeng.musicradio.music.player.view;

import android.content.Context;
import android.text.TextUtils;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.music.player.presenter.MusicLrcPresenter;
import com.xiaopeng.musicradio.proto.Player;
import com.xiaopeng.musicradio.utils.be;
/* compiled from: MusicLrcProxy.java */
/* loaded from: classes.dex */
public class j extends aeu<e, MusicLrcPresenter> implements e {
    @Override // com.xiaopeng.musicradio.music.player.view.e
    public void a(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.music.player.view.e
    public void a_(String str, String str2) {
    }

    public j(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public MusicLrcPresenter g() {
        return new MusicLrcPresenter();
    }

    @Override // com.xiaopeng.musicradio.music.player.view.e
    public void a(int i) {
        a("MusicLrcProxy_player_music_updateindex", (AbstractMessageLite) Player.MusicLrcIndex.newBuilder().a(i).build());
    }

    @Override // com.xiaopeng.musicradio.music.player.view.e
    public void a(String str, int i) {
        a("MusicLrcProxy_player_music_updatelrc", (AbstractMessageLite) Player.MusicLrcInfo.newBuilder().a(i).a(be.e(str)).build());
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        if (TextUtils.equals("getLrc", str)) {
            ((MusicLrcPresenter) this.c).d();
            ((MusicLrcPresenter) this.c).c();
        }
    }
}
