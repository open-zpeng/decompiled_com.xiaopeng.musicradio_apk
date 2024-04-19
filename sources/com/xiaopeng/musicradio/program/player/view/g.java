package com.xiaopeng.musicradio.program.player.view;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.program.b;
/* compiled from: ProgramSmallPlayer.java */
/* loaded from: classes2.dex */
public class g implements awa {
    @Override // defpackage.awa
    public boolean b() {
        return true;
    }

    @Override // defpackage.awa
    public View a(Context context) {
        return new ProgramSmallPlayerSubView(context);
    }

    @Override // defpackage.awa
    public Pair<String, String> a() {
        ProgramBean r = axn.i().r();
        if (r != null) {
            if (r.getPaymentType() == 2) {
                if (r.isAuthorized() && aqh.a().e()) {
                    return new Pair<>(String.format("<img src=\"%s\" />", Integer.valueOf(b.c.xmly_small_player_paid)) + r.getTitle(), r.getAlbumName());
                }
                return new Pair<>(String.format("<img src=\"%s\" />", Integer.valueOf(b.c.xmly_small_player_payment)) + r.getTitle(), r.getAlbumName());
            } else if (r.getPaymentType() == 1) {
                return new Pair<>(String.format("<img src=\"%s\" />", Integer.valueOf(b.c.xmly_small_player_vip)) + r.getTitle(), r.getAlbumName());
            } else {
                return new Pair<>(r.getTitle(), r.getAlbumName());
            }
        }
        return null;
    }
}
