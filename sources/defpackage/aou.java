package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.util.Log;
import android.view.KeyEvent;
import com.google.android.exoplayer2.util.MimeTypes;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IIcmController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IInputController;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.model.car.b;
import com.xiaopeng.musicradio.utils.h;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agf;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: IcmReceiverModel.java */
/* renamed from: aou  reason: default package */
/* loaded from: classes2.dex */
public class aou {
    private a a;

    /* compiled from: IcmReceiverModel.java */
    /* renamed from: aou$b */
    /* loaded from: classes2.dex */
    private static class b {
        static final aou a = new aou();
    }

    public static aou a() {
        return b.a;
    }

    private aou() {
        this.a = new a();
    }

    public void b() {
        u.a(this);
        this.a.a(com.xiaopeng.musicradio.a.a);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onReceiveKeyEvent(IInputController.InputAudioSwitchEventMsg inputAudioSwitchEventMsg) {
        LogUtils.i("IcmReceiverModel", "onReceiveKeyEvent InputAudioSwitchEventMsg : = " + inputAudioSwitchEventMsg.getData().getKeyCode());
        KeyEvent data = inputAudioSwitchEventMsg.getData();
        if (data.getAction() != 0) {
            return;
        }
        aot.a().a(data);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onReceiveD21KeyEvent(IInputController.InputAudioSwitchEventMsgV2 inputAudioSwitchEventMsgV2) {
        LogUtils.i("IcmReceiverModel", "onReceiveKeyEvent : InputAudioSwitchEventMsgV2 = " + inputAudioSwitchEventMsgV2.getData().getValue());
        IInputController.InputKeyEvent data = inputAudioSwitchEventMsgV2.getData();
        int intValue = ((Integer) data.getValue()).intValue();
        KeyEvent keyEvent = new KeyEvent(0L, 0L, 0, data.getCode(), 1, 0, 0, 0, intValue);
        if (intValue == 0) {
            return;
        }
        aot.a().a(keyEvent);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onReveiveIcmConnected(IIcmController.IcmConnectEventMsg icmConnectEventMsg) {
        try {
            Boolean data = icmConnectEventMsg.getData();
            Log.i("IcmReceiverModel", "onReveiveIcmConnected1: ======= " + data);
            if (data.booleanValue()) {
                ban.g(new Runnable() { // from class: aou.1
                    @Override // java.lang.Runnable
                    public void run() {
                        aov.a().c();
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onIcmConnect(b.a aVar) {
        Log.i("IcmReceiverModel", "onIcmConnect: =====");
        aov.a().c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onIGChange(agg.s sVar) {
        if (sVar.a()) {
            aov.a().c();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAudioTypeChange(agg.g gVar) {
        aov.a().c();
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onReveiveIcmConnected(IIcmController.IcmConnectEventMsgV2 icmConnectEventMsgV2) {
        try {
            Integer data = icmConnectEventMsgV2.getData();
            Log.i("IcmReceiverModel", "onReveiveIcmConnected2: ==========" + data);
            if (data.intValue() == 1) {
                ban.g(new Runnable() { // from class: aou.2
                    @Override // java.lang.Runnable
                    public void run() {
                        aov.a().c();
                    }
                });
                LogUtils.i("IcmReceiverModel", "onReveiveIcmConnected");
                a(3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(int i) {
        try {
            com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController e = h.e();
            if (e != null) {
                e.setRadioType(i);
            }
            LogUtils.i("IcmReceiverModel", "sendIcmRadioType type = " + i);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onCarApiConnect(agf.a aVar) {
        a(3);
    }

    /* compiled from: IcmReceiverModel.java */
    /* renamed from: aou$a */
    /* loaded from: classes2.dex */
    private class a extends BroadcastReceiver {
        boolean a;

        private a() {
            this.a = false;
        }

        void a(Context context) {
            if (this.a) {
                return;
            }
            this.a = true;
            context.registerReceiver(this, new IntentFilter("com.xiaopeng.musicradio.action.MOCK_KEY_EVENT"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            LogUtils.i("IcmReceiverModel", "onReceive action = " + action);
            if ("com.xiaopeng.musicradio.action.MOCK_KEY_EVENT".equals(action)) {
                int i = 0;
                int intExtra = intent.getIntExtra("keycode", 0);
                LogUtils.i("IcmReceiverModel", "onReceive kecode = " + intExtra);
                KeyEvent keyEvent = new KeyEvent(1, intExtra);
                AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                if (intExtra == 164) {
                    if (audioManager.getRingerMode() == 0) {
                        audioManager.setRingerMode(2);
                    } else {
                        audioManager.setRingerMode(0);
                    }
                } else if (intExtra < 1000) {
                    aot.a().a(keyEvent);
                } else {
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (intExtra == 1000) {
                        streamVolume += 2;
                    } else if (intExtra == 1001) {
                        streamVolume -= 2;
                    }
                    if (streamVolume >= 0) {
                        i = streamVolume > audioManager.getStreamMaxVolume(3) ? audioManager.getStreamMaxVolume(3) : streamVolume;
                    }
                    audioManager.setStreamVolume(3, i, 16);
                }
            }
        }
    }
}
