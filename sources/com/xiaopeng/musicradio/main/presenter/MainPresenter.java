package com.xiaopeng.musicradio.main.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.i;
import com.google.android.exoplayer2.C;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.main.view.a;
import com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.r;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.xui.app.ActivityUtils;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import defpackage.agd;
import defpackage.age;
import defpackage.agg;
import defpackage.aho;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MainPresenter extends BasePresenter<a> {
    private XDialog b;

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
        f();
        e();
    }

    private void e() {
        LogUtils.d("MainPresenter", "refreshUsbIconState");
        if (a() != null && aei.a().c() == 0 && ad.b(apk.i().x())) {
            a().a(apk.i().getPlayState() == 2, 0);
        }
    }

    private void f() {
        LogUtils.d("MainPresenter", "refreshBtIconState");
        if (a() == null || !com.xiaopeng.musicradio.model.bluetooth.a.i().n()) {
            return;
        }
        if (aei.a().c() == 2) {
            if (!com.xiaopeng.musicradio.model.bluetooth.a.i().p() || a() == null) {
                return;
            }
            a().a(true, 2);
        } else if (a() != null) {
            a().a(false, 2);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPhoneCallChange(agd.f fVar) {
        XDialog xDialog;
        if (fVar.a() && (xDialog = this.b) != null && xDialog.isShowing()) {
            this.b.dismiss();
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onStart(i iVar) {
        super.onStart(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onPause(i iVar) {
        super.onPause(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onStop(i iVar) {
        super.onStop(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeAudioType(agg.g gVar) {
        f();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChanged(age.l lVar) {
        if (lVar.a() == 2) {
            if (a() != null) {
                a().a(true, lVar.b());
            }
        } else if (a() != null) {
            a().a(false, lVar.b());
        }
    }

    public void c() {
        boolean z = false;
        if (aei.a().e() != null && (aei.a().e().getPlayState() == 2 || aei.a().e().getPlayState() == 1)) {
            z = true;
        }
        LogUtils.i("MainPresenter", "saveEndBtState isPlaying:" + z);
        ay.a("last_bt_restore_play", z);
    }

    public void a(Activity activity) {
        ActivityUtils.moveTaskToBack(activity, true);
    }

    public void d() {
        if (ShakeUtil.canExecuteLong(133200)) {
            Intent intent = new Intent();
            intent.setAction("com.xiaopeng.intent.action.POPUP_SOUND_EFFECT");
            intent.setFlags(C.DEFAULT_MUXED_BUFFER_SIZE);
            com.xiaopeng.musicradio.a.a.sendBroadcast(intent);
            bai.a();
        }
    }

    public void a(Context context) {
        bai.b();
        if (com.xiaopeng.musicradio.model.bluetooth.a.i().n()) {
            if (aei.a().c() == 2 && com.xiaopeng.musicradio.model.bluetooth.a.i().o() && MediaCenterModel.getInstance().isXpMusicShowingInInfoflow()) {
                XDialog xDialog = this.b;
                if (xDialog != null && xDialog.isShowing()) {
                    this.b.dismiss();
                }
                if (this.b == null) {
                    this.b = new XDialog(context, 0, r.a());
                    this.b.setMessage(aho.e.confirm_restore_bt_music);
                    this.b.setNegativeButtonInterceptDismiss(true).setNegativeButton(context.getResources().getString(aho.e.bt_dialog_cancel), new XDialogInterface.OnClickListener() { // from class: com.xiaopeng.musicradio.main.presenter.MainPresenter.2
                        @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
                        public void onClick(XDialog xDialog2, int i) {
                            xDialog2.dismiss();
                        }
                    }).setPositiveButtonInterceptDismiss(false).setPositiveButton(context.getResources().getString(aho.e.bt_dialog_ok), new XDialogInterface.OnClickListener() { // from class: com.xiaopeng.musicradio.main.presenter.MainPresenter.1
                        @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
                        public void onClick(XDialog xDialog2, int i) {
                            aei.a().b();
                            ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.main.presenter.MainPresenter.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                }
                            }, 200L);
                        }
                    });
                    this.b.setSystemDialog(2008);
                }
                this.b.show();
                return;
            } else if (amw.a().d() || !com.xiaopeng.musicradio.model.bluetooth.a.i().q()) {
                c();
                com.xiaopeng.musicradio.model.bluetooth.a.i().r();
                com.xiaopeng.musicradio.model.bluetooth.a.i().play();
                return;
            } else {
                ak.b(com.xiaopeng.musicradio.a.a, b.f.tips_can_not_play_bt_music);
                return;
            }
        }
        bcp.a();
    }

    public void a(View view) {
        if (ShakeUtil.canExecuteLong(view.getId())) {
            if (apx.a().d()) {
                azy.a(view.getContext());
                return;
            }
            azx.a(view.getContext(), ((com.xiaopeng.musicradio.commonui.base.a) view.getContext()).j());
        }
    }
}
