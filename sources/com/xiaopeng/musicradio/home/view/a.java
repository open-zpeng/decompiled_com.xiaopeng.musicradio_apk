package com.xiaopeng.musicradio.home.view;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.main.presenter.MainPresenter;
import com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.utils.ak;
/* compiled from: MainViewProxy.java */
/* loaded from: classes.dex */
public class a extends aeu<com.xiaopeng.musicradio.main.view.a, MainPresenter> implements com.xiaopeng.musicradio.main.view.a {
    @Override // com.xiaopeng.musicradio.main.view.a
    public void a(boolean z, int i) {
    }

    public a(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public MainPresenter g() {
        Log.d("MainViewProxy_", "createPresenter: create P");
        return new MainPresenter();
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("MainViewProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if ("moveToBack".equals(str)) {
            b();
        } else if ("openDsp".equals(str)) {
            h();
        } else if ("openBt".equals(str)) {
            j();
        } else if ("loginOutBt".equals(str)) {
            i();
        }
    }

    public void b() {
        Log.i("MainViewProxy_", "moveToBack: ");
        ((MainPresenter) this.c).a(com.xiaopeng.musicradio.utils.a.a().c());
    }

    private void h() {
        ((MainPresenter) this.c).d();
    }

    private void i() {
        a(4);
        aei.a().b();
    }

    private void j() {
        bai.b();
        if (com.xiaopeng.musicradio.model.bluetooth.a.i().n()) {
            if (aei.a().c() == 2 && com.xiaopeng.musicradio.model.bluetooth.a.i().o() && MediaCenterModel.getInstance().isXpMusicShowingInInfoflow()) {
                a(3);
                return;
            } else if (amw.a().d() || !com.xiaopeng.musicradio.model.bluetooth.a.i().q()) {
                ((MainPresenter) this.c).c();
                com.xiaopeng.musicradio.model.bluetooth.a.i().r();
                com.xiaopeng.musicradio.model.bluetooth.a.i().play();
                a(1);
                return;
            } else {
                ak.b(com.xiaopeng.musicradio.a.a, b.f.tips_can_not_play_bt_music);
                a(2);
                return;
            }
        }
        a(0);
    }

    private void a(int i) {
        Log.i("MainViewProxy_", "msgId:MainViewProxy_bluetooth_main_getstatus--" + i);
        a("MainViewProxy_bluetooth_main_getstatus", (AbstractMessageLite) Common.IntParam.newBuilder().a(i).build());
    }
}
