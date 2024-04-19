package com.xiaopeng.musicradio.music.player.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.music.player.presenter.MusicPlayListPresenter;
import com.xiaopeng.musicradio.music.player.view.k;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Player;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.w;
import java.util.List;
/* compiled from: MusicPlayListViewProxy.java */
/* loaded from: classes.dex */
public class l extends aeu<f, MusicPlayListPresenter> implements f {
    @Override // com.xiaopeng.musicradio.music.player.view.f
    public void C_() {
    }

    @Override // com.xiaopeng.musicradio.music.player.view.f
    public void D_() {
    }

    @Override // com.xiaopeng.musicradio.music.player.view.f
    public void a(int i, boolean z) {
    }

    public l(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public MusicPlayListPresenter g() {
        return new MusicPlayListPresenter();
    }

    @Override // com.xiaopeng.musicradio.music.player.view.f
    public void a(List<k.d> list, boolean z) {
        if (list == null) {
            return;
        }
        Player.MusicPlayList.a newBuilder = Player.MusicPlayList.newBuilder();
        for (k.d dVar : list) {
            Player.MusicPlayInfo.a a = Player.MusicPlayInfo.newBuilder().a(be.e(dVar.a)).b(dVar.e).a(dVar.d).a(dVar.b);
            if (dVar.c != null) {
                boolean z2 = false;
                if (dVar.c.isSupportSQ() && (w.f() == 1 || aqh.a().f())) {
                    z2 = true;
                }
                String e = be.e(TextUtils.isEmpty(dVar.c.getLogo()) ? dVar.c.getAlbumLogo() : dVar.c.getLogo());
                if (dVar.c.getMusicFrom() == 61) {
                    e = dVar.c.getAlbumLogo();
                }
                a.b(be.e(dVar.c.getSong())).a(dVar.c.getAlbumId()).c(be.e(dVar.c.getSinger())).c(dVar.c.isNeedVip()).d(z2).d(e);
            }
            newBuilder.a(a.build());
        }
        a("MusicPlayListViewProxy_player_music_updatelist", (AbstractMessageLite) newBuilder.build());
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("MusicPlayListViewProxy", "monoMessage: " + str + " value" + bArr);
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -2131166909) {
                if (hashCode != -1965294310) {
                    if (hashCode == 3443508 && str.equals("play")) {
                        c = 1;
                    }
                } else if (str.equals("clickLove")) {
                    c = 0;
                }
            } else if (str.equals("getCurrent")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    a(Common.StringParam.parseFrom(bArr).getParam());
                    return;
                case 1:
                    b(Common.StringParam.parseFrom(bArr).getParam());
                    return;
                case 2:
                    ((MusicPlayListPresenter) this.c).a(false);
                    return;
                default:
                    return;
            }
        } catch (Exception e) {
            Log.e("MusicPlayListViewProxy", "monoMessage: ", e);
        }
    }

    private void a(String str) {
        ((MusicPlayListPresenter) this.c).a(str);
    }

    private void b(String str) {
        ((MusicPlayListPresenter) this.c).b(str);
    }
}
