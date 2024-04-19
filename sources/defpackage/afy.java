package defpackage;

import com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICarControllerService;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IIcmController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IInputController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IMcuController;
import com.xiaopeng.lib.framework.moduleinterface.configurationmodule.ConfigurationChangeEvent;
import com.xiaopeng.lib.framework.moduleinterface.ipcmodule.IIpcService;
import com.xiaopeng.lib.framework.moduleinterface.locationmodule.ILocationEvent;
import com.xiaopeng.lib.framework.moduleinterface.locationmodule.IStateEvent;
import com.xiaopeng.musicradio.model.bluetooth.a;
import com.xiaopeng.musicradio.model.car.b;
import com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel;
import com.xiaopeng.musicradio.utils.h;
import com.xiaopeng.musicradio.utils.x;
import com.xiaopeng.musicradio.vip.presenter.VipSaleBannerPresenter;
import com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter;
import defpackage.afx;
import defpackage.agd;
import defpackage.age;
import defpackage.agf;
import defpackage.agg;
import defpackage.agq;
import defpackage.awn;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.meta.SimpleSubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;
import org.greenrobot.eventbus.meta.SubscriberMethodInfo;
/* compiled from: CommonEventBusIndexes.java */
/* renamed from: afy  reason: default package */
/* loaded from: classes2.dex */
public class afy implements SubscriberInfoIndex {
    private static final Map<Class<?>, SubscriberInfo> a = new HashMap();

    static {
        a(new SimpleSubscriberInfo(BaseDealNetValidPresenter.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("dealNetValid", agg.p.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(apw.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onPowerStateChange", agg.s.class, ThreadMode.BACKGROUND), new SubscriberMethodInfo("onEvent", agg.p.class, ThreadMode.BACKGROUND)}));
        a(new SimpleSubscriberInfo(amp.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onPowerStateChange", agg.s.class, ThreadMode.MAIN), new SubscriberMethodInfo("onNetWorkValid", agg.p.class, ThreadMode.MAIN), new SubscriberMethodInfo("onNetWorkInvalid", agg.o.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(aou.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onReceiveKeyEvent", IInputController.InputAudioSwitchEventMsg.class, ThreadMode.BACKGROUND), new SubscriberMethodInfo("onReceiveD21KeyEvent", IInputController.InputAudioSwitchEventMsgV2.class, ThreadMode.BACKGROUND), new SubscriberMethodInfo("onReveiveIcmConnected", IIcmController.IcmConnectEventMsg.class, ThreadMode.BACKGROUND), new SubscriberMethodInfo("onIcmConnect", b.a.class, ThreadMode.MAIN), new SubscriberMethodInfo("onIGChange", agg.s.class, ThreadMode.MAIN), new SubscriberMethodInfo("onAudioTypeChange", agg.g.class, ThreadMode.MAIN), new SubscriberMethodInfo("onReveiveIcmConnected", IIcmController.IcmConnectEventMsgV2.class, ThreadMode.BACKGROUND), new SubscriberMethodInfo("onCarApiConnect", agf.a.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(ags.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onLogout", agq.v.class, ThreadMode.MAIN), new SubscriberMethodInfo("onCallStateChanged", agd.f.class, ThreadMode.MAIN), new SubscriberMethodInfo("onVolumeChanged", agg.d.class, ThreadMode.MAIN), new SubscriberMethodInfo("onDriverJoyModeUpdate", agg.i.class, ThreadMode.MAIN), new SubscriberMethodInfo("onIGChange", agg.s.class, ThreadMode.MAIN), new SubscriberMethodInfo("onPlayStateChanged", age.l.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(amx.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("dealAudioInfo", agg.g.class, ThreadMode.MAIN), new SubscriberMethodInfo("onLogoEvent", age.o.class, ThreadMode.MAIN), new SubscriberMethodInfo("dealAudioInfo", age.c.class, ThreadMode.MAIN), new SubscriberMethodInfo("onLogoEvent", age.i.class, ThreadMode.MAIN), new SubscriberMethodInfo("onThemeChange", afx.b.class, ThreadMode.MAIN), new SubscriberMethodInfo("onIGChange", agg.s.class, ThreadMode.MAIN), new SubscriberMethodInfo("onLogout", agq.v.class, ThreadMode.MAIN), new SubscriberMethodInfo("onBtPhoneMusicClose", agd.d.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(MediaCenterModel.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("dealAudioTypeChangeEvent", agg.g.class, ThreadMode.MAIN), new SubscriberMethodInfo("dealPlayState", age.l.class, ThreadMode.MAIN), new SubscriberMethodInfo("dealAudioPos", age.m.class, ThreadMode.MAIN), new SubscriberMethodInfo("onLogout", agq.v.class, ThreadMode.MAIN), new SubscriberMethodInfo("onLogin", agq.u.class, ThreadMode.MAIN), new SubscriberMethodInfo("onBindSuccess", agq.h.class, ThreadMode.MAIN), new SubscriberMethodInfo("onDownloadProgram", awn.a.class, ThreadMode.MAIN), new SubscriberMethodInfo("onRefreshLogo", agg.w.class, ThreadMode.MAIN), new SubscriberMethodInfo("dealLoveEvent", agq.l.class, ThreadMode.MAIN), new SubscriberMethodInfo("dealReadLoveEvent", agq.o.class, ThreadMode.MAIN), new SubscriberMethodInfo("dealNetRadioLove", agg.k.class, ThreadMode.MAIN), new SubscriberMethodInfo("dealTryListen", age.r.class, ThreadMode.MAIN), new SubscriberMethodInfo("dealAudioInfo", age.c.class, ThreadMode.MAIN), new SubscriberMethodInfo("updateBtInfo", agq.a.class, ThreadMode.MAIN), new SubscriberMethodInfo("dealMusicLogoInfo", age.i.class, ThreadMode.MAIN), new SubscriberMethodInfo("onPowerChange", agg.s.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(a.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onPowerStateChange", agg.s.class, ThreadMode.MAIN_ORDERED), new SubscriberMethodInfo("dealAudioPos", age.m.class, ThreadMode.MAIN), new SubscriberMethodInfo("onMediaCenterBtStatusChanged", agd.e.class, ThreadMode.MAIN), new SubscriberMethodInfo("onUserLogout", agq.v.class, ThreadMode.MAIN_ORDERED), new SubscriberMethodInfo("onConfigEvent", ConfigurationChangeEvent.class, ThreadMode.BACKGROUND)}));
        a(new SimpleSubscriberInfo(VipSaleBannerPresenter.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("vipSaleEven", agg.al.class, ThreadMode.MAIN), new SubscriberMethodInfo("vipSaleEvenV2", agg.am.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(aov.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onCarApiConnect", agf.a.class, ThreadMode.MAIN), new SubscriberMethodInfo("dealBtConnectState", agd.b.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(apd.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onMessageEventPosting", IStateEvent.class, ThreadMode.BACKGROUND), new SubscriberMethodInfo("onMessageEventPosting", ILocationEvent.class)}));
        a(new SimpleSubscriberInfo(aqe.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("receiveLogout", agq.m.class, ThreadMode.BACKGROUND), new SubscriberMethodInfo("receiveMusicBinded", agq.g.class, ThreadMode.BACKGROUND), new SubscriberMethodInfo("onPowerStateChange", agg.s.class, ThreadMode.MAIN_ORDERED)}));
        a(new SimpleSubscriberInfo(bdv.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onPowerChange", agg.s.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(ael.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onIGChange", agg.s.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(aqq.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onEvent", agg.p.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(adq.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onPowerChange", agg.s.class, ThreadMode.MAIN), new SubscriberMethodInfo("onPhoneChange", agd.f.class, ThreadMode.MAIN), new SubscriberMethodInfo("onBackground", afx.a.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(h.a.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onCarServicesEventMsg", ICarControllerService.ConnectCarEventMsg.class, ThreadMode.BACKGROUND)}));
        a(new SimpleSubscriberInfo(x.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onIGChange", agg.s.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(aql.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("receiveLogout", agq.s.class, ThreadMode.BACKGROUND), new SubscriberMethodInfo("receiveReadingBinded", agq.r.class, ThreadMode.BACKGROUND), new SubscriberMethodInfo("onPowerStateChange", agg.s.class, ThreadMode.MAIN_ORDERED)}));
        a(new SimpleSubscriberInfo(com.xiaopeng.musicradio.model.car.a.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onCarApiConnected", agf.a.class, ThreadMode.MAIN), new SubscriberMethodInfo("onIGStateChange", IMcuController.McuIgStatusEventMsg.class, ThreadMode.MAIN), new SubscriberMethodInfo("dealPlayState", age.l.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(adh.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onPowerChange", agg.s.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(adw.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onPowerChange", agg.s.class, ThreadMode.MAIN), new SubscriberMethodInfo("onPhoneChange", agd.f.class, ThreadMode.MAIN), new SubscriberMethodInfo("onBackground", afx.a.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(com.xiaopeng.musicradio.web.a.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onFocusPlay", agg.j.class), new SubscriberMethodInfo("onPlayStateChanged", age.l.class)}));
        a(new SimpleSubscriberInfo(apa.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onEvent", IIpcService.IpcMessageEvent.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(aqk.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("receiveLogout", agq.v.class, ThreadMode.BACKGROUND), new SubscriberMethodInfo("netValid", agg.p.class, ThreadMode.BACKGROUND), new SubscriberMethodInfo("onPowerStateChange", agg.s.class, ThreadMode.MAIN_ORDERED)}));
        a(new SimpleSubscriberInfo(aqn.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onEvent", agg.p.class, ThreadMode.MAIN)}));
    }

    private static void a(SubscriberInfo subscriberInfo) {
        a.put(subscriberInfo.getSubscriberClass(), subscriberInfo);
    }

    @Override // org.greenrobot.eventbus.meta.SubscriberInfoIndex
    public SubscriberInfo getSubscriberInfo(Class<?> cls) {
        SubscriberInfo subscriberInfo = a.get(cls);
        if (subscriberInfo != null) {
            return subscriberInfo;
        }
        return null;
    }
}
