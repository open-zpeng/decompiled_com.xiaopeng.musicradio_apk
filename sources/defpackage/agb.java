package defpackage;

import com.xiaopeng.musicradio.PlayerComponentInit;
import com.xiaopeng.musicradio.playercomponent.big.presenter.MediaLogoBlurPresener;
import com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerBasePresenter;
import com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerCommonPresenter;
import com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerPresenter;
import com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerSharePresenter;
import com.xiaopeng.musicradio.playercomponent.big.presenter.ShareCommunityDialogPresenter;
import com.xiaopeng.musicradio.playercomponent.small.presenter.SmallPlayerBasePresenter;
import com.xiaopeng.musicradio.playercomponent.small.presenter.SmallPlayerPresenter;
import defpackage.afx;
import defpackage.agd;
import defpackage.age;
import defpackage.agg;
import defpackage.agn;
import defpackage.agq;
import defpackage.avw;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.meta.SimpleSubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;
import org.greenrobot.eventbus.meta.SubscriberMethodInfo;
/* compiled from: PlayerComponentEventBusIndexes.java */
/* renamed from: agb  reason: default package */
/* loaded from: classes2.dex */
public class agb implements SubscriberInfoIndex {
    private static final Map<Class<?>, SubscriberInfo> a = new HashMap();

    static {
        a(new SimpleSubscriberInfo(SmallPlayerBasePresenter.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onApplicationBack", afx.a.class, ThreadMode.MAIN), new SubscriberMethodInfo("onSmallPlayerVisible", agn.a.class, ThreadMode.MAIN), new SubscriberMethodInfo("onRefreshLogo", agg.w.class, ThreadMode.MAIN), new SubscriberMethodInfo("onPosChange", age.m.class, ThreadMode.MAIN), new SubscriberMethodInfo("onPlayStateChange", age.l.class, ThreadMode.MAIN), new SubscriberMethodInfo("onAudioChange", agg.g.class, ThreadMode.MAIN), new SubscriberMethodInfo("onInfoChange", age.c.class, ThreadMode.MAIN), new SubscriberMethodInfo("onIGChange", agg.s.class, ThreadMode.MAIN), new SubscriberMethodInfo("onThemeChange", afx.b.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(PlayerCommonPresenter.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onChangeAudio", agg.g.class, ThreadMode.MAIN), new SubscriberMethodInfo("dealAudioPos", age.m.class, ThreadMode.MAIN), new SubscriberMethodInfo("onRefreshLogo", agg.w.class, ThreadMode.MAIN), new SubscriberMethodInfo("onBtPhoneMusicClose", agd.d.class, ThreadMode.MAIN, 0, true), new SubscriberMethodInfo("dealAudioState", age.l.class, ThreadMode.MAIN), new SubscriberMethodInfo("onInfoChange", age.c.class, ThreadMode.MAIN), new SubscriberMethodInfo("onPlayerNav", avw.a.class, ThreadMode.MAIN, 0, true)}));
        a(new SimpleSubscriberInfo(MediaLogoBlurPresener.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onRefreshLogo", agg.w.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(PlayerSharePresenter.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onSpeechStateChange", agg.y.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(PlayerBasePresenter.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onAudioInfo", age.c.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(PlayerPresenter.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onAudioChange", agg.g.class, ThreadMode.MAIN), new SubscriberMethodInfo("onInfoChange", age.c.class, ThreadMode.MAIN), new SubscriberMethodInfo("OnPlayStateChange", age.l.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(SmallPlayerPresenter.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onReadReloadAlbum", agq.p.class, ThreadMode.MAIN), new SubscriberMethodInfo("onReadStatusUpdate", agq.q.class, ThreadMode.MAIN), new SubscriberMethodInfo("onReadingUnbinded", agq.s.class, ThreadMode.MAIN), new SubscriberMethodInfo("onReadingBinded", agq.r.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(ShareCommunityDialogPresenter.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onRefresh", agg.h.class, ThreadMode.MAIN), new SubscriberMethodInfo("onThemeChange", afx.b.class, ThreadMode.MAIN), new SubscriberMethodInfo("onBackground", afx.a.class, ThreadMode.MAIN), new SubscriberMethodInfo("onPhoneChange", agd.f.class, ThreadMode.MAIN), new SubscriberMethodInfo("onPowerChange", agg.s.class, ThreadMode.MAIN), new SubscriberMethodInfo("onSubDialogCreate", agg.aa.class, ThreadMode.MAIN)}));
        a(new SimpleSubscriberInfo(PlayerComponentInit.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onApplicationBack", afx.a.class, ThreadMode.MAIN)}));
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
