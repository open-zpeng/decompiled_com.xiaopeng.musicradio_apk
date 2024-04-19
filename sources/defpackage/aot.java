package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.bf;
import com.xiaopeng.musicradio.utils.w;
/* compiled from: IcmControlModel.java */
/* renamed from: aot  reason: default package */
/* loaded from: classes2.dex */
public class aot {
    private boolean a = true;

    /* compiled from: IcmControlModel.java */
    /* renamed from: aot$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final aot a = new aot();
    }

    private boolean c(int i) {
        if (i == 0 || i == 6) {
            return true;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
                return true;
            default:
                return false;
        }
    }

    public static aot a() {
        return a.a;
    }

    public void a(KeyEvent keyEvent) {
        LogUtils.i("IcmControlModel", "dealIcmKeyEvent: " + keyEvent);
        if (!this.a) {
            LogUtils.i("IcmControlModel", "dealIcmKeyEvent: disable keyevent");
            return;
        }
        int flags = keyEvent.getFlags() & 128;
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 527) {
            switch (keyCode) {
                case IInputController.KEYCODE_KNOB_FM /* 507 */:
                case IInputController.KEYCODE_KNOB_BT /* 508 */:
                case IInputController.KEYCODE_KNOB_WEB_RADIO /* 509 */:
                case IInputController.KEYCODE_KNOB_MUSIC /* 510 */:
                    break;
                default:
                    switch (keyCode) {
                        case 513:
                            ban.g(new Runnable() { // from class: aot.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ags.a().b();
                                }
                            });
                            LogUtils.d("IcmControlModel", "don't handlerIcmPre");
                            return;
                        case 514:
                            ban.g(new Runnable() { // from class: aot.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    ags.a().b();
                                }
                            });
                            LogUtils.d("IcmControlModel", "don't handlerIcmNext");
                            return;
                        default:
                            return;
                    }
            }
        }
        ban.g(new Runnable() { // from class: aot.1
            @Override // java.lang.Runnable
            public void run() {
                ags.a().b();
            }
        });
        a(keyEvent.getKeyCode());
    }

    public void a(final int i) {
        LogUtils.i("IcmControlModel", "switchAudio: " + i);
        ban.g(new Runnable() { // from class: aot.4
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                if (i2 == 527) {
                    aot.this.b(3);
                    return;
                }
                switch (i2) {
                    case IInputController.KEYCODE_KNOB_FM /* 507 */:
                        if (w.c()) {
                            aot.this.b(4);
                            return;
                        }
                        return;
                    case IInputController.KEYCODE_KNOB_BT /* 508 */:
                        aot.this.b(2);
                        return;
                    case IInputController.KEYCODE_KNOB_WEB_RADIO /* 509 */:
                        aot.this.b(6);
                        return;
                    case IInputController.KEYCODE_KNOB_MUSIC /* 510 */:
                        aot.this.b(0);
                        return;
                    default:
                        return;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        arf arfVar;
        aek e;
        if (c(i)) {
            if (i == aei.a().c() && (e = aei.a().e()) != null && (e.getPlayState() == 1 || e.getPlayState() == 2)) {
                Log.i("IcmControlModel", "switch2AudioTypeInternal: " + i);
            } else if (i == 0) {
                if (!apx.a().d() && (arfVar = (arf) c.a().b(arf.class)) != null) {
                    String listSign = arfVar.getListSign();
                    boolean a2 = ad.a(listSign);
                    boolean b = ad.b(listSign);
                    if (!a2 && !b) {
                        apx.a().e();
                    }
                }
                aei.a().c(i).play();
            } else {
                aei.a().c(i).play();
            }
        }
    }

    public void b() {
        LogUtils.i("IcmControlModel", "switchNextAudio: ");
        if (bf.a() && this.a) {
            ban.g(new Runnable() { // from class: aot.5
                @Override // java.lang.Runnable
                public void run() {
                    ags.a().b();
                    int c = aei.a().c();
                    if (c == 0) {
                        aot.this.b(3);
                        return;
                    }
                    if (c != 6) {
                        switch (c) {
                            case 2:
                                aot.this.b(0);
                                return;
                            case 3:
                                if (!w.c()) {
                                    aot.this.b(6);
                                    return;
                                } else {
                                    aot.this.b(4);
                                    return;
                                }
                            case 4:
                                if (w.c()) {
                                    arf arfVar = (arf) c.a().b(arf.class);
                                    if (arfVar != null ? arfVar.isBtConnect() : false) {
                                        aot.this.b(2);
                                        return;
                                    } else {
                                        aot.this.b(0);
                                        return;
                                    }
                                }
                                break;
                            default:
                                aot.this.b(0);
                                return;
                        }
                    }
                    arf arfVar2 = (arf) c.a().b(arf.class);
                    if (arfVar2 != null ? arfVar2.isBtConnect() : false) {
                        aot.this.b(2);
                    } else {
                        aot.this.b(0);
                    }
                }
            });
        }
    }
}
