package com.xiaopeng.musicradio.utils;

import android.util.Log;
import com.xiaopeng.lib.framework.carcontrollermodule.CarControllerModuleEntry;
import com.xiaopeng.lib.framework.module.IModuleEntry;
import com.xiaopeng.lib.framework.module.Module;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICarControllerService;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IMcuController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IVcuController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IInputController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IMcuController;
import defpackage.agf;
import java.util.ArrayList;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: CarUtil.java */
/* loaded from: classes2.dex */
public class h {
    private static IIcmController a;
    private static boolean b;

    public static void a() {
        EventBus.getDefault().register(a.CALLBACK);
        Module.register(CarControllerModuleEntry.class, new CarControllerModuleEntry(com.xiaopeng.musicradio.a.a));
        Module.register(abh.class, new abh(com.xiaopeng.musicradio.a.a));
        Module.get(CarControllerModuleEntry.class).get(IMcuController.class);
        CarControllerModuleEntry.setPrintLog(true);
    }

    public static IModuleEntry b() {
        return Module.get(CarControllerModuleEntry.class);
    }

    public static IModuleEntry c() {
        return Module.get(abh.class);
    }

    public static IMcuController d() {
        return (IMcuController) b().get(IMcuController.class);
    }

    public static IIcmController e() {
        return a;
    }

    public static IBcmController f() {
        return (IBcmController) b().get(IBcmController.class);
    }

    public static IInputController g() {
        return (IInputController) b().get(IInputController.class);
    }

    public static IVcuController h() {
        return (IVcuController) b().get(IVcuController.class);
    }

    public static boolean i() {
        return b;
    }

    /* compiled from: CarUtil.java */
    /* loaded from: classes2.dex */
    public enum a {
        CALLBACK;

        @Subscribe(threadMode = ThreadMode.BACKGROUND)
        public void onCarServicesEventMsg(ICarControllerService.ConnectCarEventMsg connectCarEventMsg) {
            if (connectCarEventMsg.getData().booleanValue()) {
                Log.i("MusicCarUtil", "car service connected!");
                boolean unused = h.b = true;
                IIcmController unused2 = h.a = (IIcmController) h.b().get(IIcmController.class);
                h.g();
                h.f();
                h.h();
                aow.a();
                ArrayList arrayList = new ArrayList();
                arrayList.add(IInputController.InputAudioSwitchEventMsgV2.class);
                h.g().registerCanEventMsg(arrayList);
                arrayList.clear();
                arrayList.add(IIcmController.IcmConnectEventMsg.class);
                h.e().registerCanEventMsg(arrayList);
                arrayList.clear();
                arrayList.add(IMcuController.McuIgStatusEventMsg.class);
                h.d().registerCanEventMsg(arrayList);
                u.f(new agf.a());
                return;
            }
            Log.i("MusicCarUtil", "car service disConnected!");
        }
    }
}
