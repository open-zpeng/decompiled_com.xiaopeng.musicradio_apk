package com.xiaopeng.musicradio.model.mediacenter;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.BaseInfo;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.model.bluetooth.a;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.am;
import com.xiaopeng.musicradio.utils.b;
import com.xiaopeng.musicradio.utils.f;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.view.WindowManagerFactory;
import com.xiaopeng.xuimanager.XUIManager;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;
import com.xiaopeng.xuimanager.mediacenter.MediaCenterManager;
import com.xiaopeng.xuimanager.mediacenter.MediaInfo;
import defpackage.agd;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import defpackage.awn;
import java.util.Iterator;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MediaCenterModel {
    public static final String ACTION_MEDIA_PLAYBACK_CONTROL = "com.xiaopeng.xuiservice.playbackControl";
    private static final String ASYNC_THREAD_NAME = "mediacenter-single-async-thread";
    public static String EXTRA_PLAYBACK_CMD = "playbackCmd";
    public static String EXTRA_PLAYBACK_PARAM = "playbackParam";
    public static final int PLAYBACK_CMD_REWIND = 13;
    public static final int STATE_BT_AVAILABLE = 2;
    public static final int STATE_BT_MEDIA_CONNECTED = 5;
    public static final int STATE_BT_MEDIA_CONNECTING = 4;
    public static final int STATE_BT_MEDIA_DISCONNECTING = 3;
    public static final int STATE_BT_SOURCE_SELECTED = 6;
    public static final int STATE_BT_UNAVAILABLE = 1;
    private static final String TAG = "MediaCenterModel";
    private static Handler sSingleAsyncHandler;
    private static HandlerThread sSingleAsyncThread;
    private MediaInfo mLastMediaInfo;
    private MediaCenterManager mMediaCenterManager;
    private ActivityManager.RunningAppProcessInfo mMusicInfo;
    private age.l mOldEvnetPlayState;
    private XUIManager mXUIManager;
    private WindowManagerFactory wmf;
    private int mLastPlayState = -1;
    private long mLastPosition = -1;
    private long mLastDuration = -1;
    private MediaCenterManager.VendorControlListener mListner = new MediaCenterManager.VendorControlListener() { // from class: com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel.1
        public int OnPlaybackControl(final int i, final int i2) {
            ban.j(new Runnable() { // from class: com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel.1.1
                @Override // java.lang.Runnable
                public void run() {
                    int i3 = i;
                    if (i3 == 2 || i3 == 7 || i3 == 6 || i3 == 4) {
                        int c = aei.a().c();
                        aek c2 = aei.a().c(c);
                        LogUtils.i(MediaCenterModel.TAG, "receive cmd: " + i + ", param: " + i2);
                        aej c3 = aeh.a().c();
                        if (c == 0 && !apx.a().d() && c3 != null && c3.f()) {
                            String listSign = ((arf) c.a().b(arf.class)).getListSign();
                            boolean a = ad.a(listSign);
                            boolean b = ad.b(listSign);
                            if (!a && !b) {
                                LogUtils.i(MediaCenterModel.TAG, "don't handle playback control as not logined or kugou authed");
                                apx.a().a(null);
                                return;
                            }
                        }
                        if ((c3 == null || c3.e()) && c == 2 && !a.i().n()) {
                            bcp.b();
                        } else if (c2 == null) {
                            MediaCenterModel.this.startMusicApp();
                            if (c == -1) {
                                if (c3 != null && !c3.f()) {
                                    switch (i) {
                                        case 6:
                                            Log.i(MediaCenterModel.TAG, "run: next");
                                            c3.d();
                                            return;
                                        case 7:
                                            Log.i(MediaCenterModel.TAG, "run: pre");
                                            c3.c();
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                BaseInfo d = aei.a().e() != null ? aei.a().e().d() : null;
                                if (d != null && (d instanceof MusicInfo)) {
                                    aei.a().c(0).play();
                                } else {
                                    am.b();
                                    Log.i(MediaCenterModel.TAG, "controlModel==null -- playDailyMusic");
                                    ((arf) c.a().b(arf.class)).playDailyMusic();
                                }
                            }
                            LogUtils.i(MediaCenterModel.TAG, "receive cmd: " + i + ", param: " + i2 + ", audiotype: " + aei.a().c() + ", but IControlModel is null");
                        } else {
                            int i4 = i;
                            if (i4 == 2) {
                                MediaCenterModel.this.startMusicApp();
                                int playState = c2.getPlayState();
                                if (playState == 1 || playState == 2) {
                                    LogUtils.i(MediaCenterModel.TAG, "pause");
                                    c2.pause();
                                    return;
                                }
                                LogUtils.i(MediaCenterModel.TAG, "play");
                                if (c3 == null || c3.e()) {
                                    amw.a().c();
                                    if (aei.a().c() == 0 && c2.d() == null) {
                                        Log.i(MediaCenterModel.TAG, "PLAYBACK_CMD_PAUSE playDailyMusic");
                                        ((arf) c.a().b(arf.class)).playDailyMusic();
                                        return;
                                    }
                                    c2.play();
                                }
                            } else if (i4 != 4) {
                                switch (i4) {
                                    case 6:
                                        MediaCenterModel.this.startMusicApp();
                                        LogUtils.i(MediaCenterModel.TAG, "next");
                                        ags.a().b();
                                        if (f.b()) {
                                            f.d();
                                        }
                                        if (c3 != null) {
                                            c3.d();
                                        }
                                        MediaCenterModel.this.resetPlayPosition();
                                        return;
                                    case 7:
                                        MediaCenterModel.this.startMusicApp();
                                        LogUtils.i(MediaCenterModel.TAG, "prev");
                                        ags.a().b();
                                        if (f.b()) {
                                            f.d();
                                        }
                                        if (c3 != null) {
                                            c3.c();
                                        }
                                        MediaCenterModel.this.resetPlayPosition();
                                        return;
                                    default:
                                        return;
                                }
                            } else {
                                LogUtils.i(MediaCenterModel.TAG, "seekTo: " + i2);
                                c2.seekTo(i2);
                            }
                        }
                    }
                }
            });
            return 0;
        }

        public int OnSwitchSource(int i) {
            switch (i) {
                case 0:
                    aei.a().b(0);
                    break;
                case 1:
                    aei.a().b(4);
                    break;
            }
            return 0;
        }

        public int OnSetFavorite(boolean z, String str) {
            Log.i(MediaCenterModel.TAG, "OnSetFavorite: " + aei.a().c() + " b = " + z + " s = " + str);
            int c = aei.a().c();
            if (c != 0) {
                if (c != 6) {
                    switch (c) {
                        case 2:
                            break;
                        case 3:
                            ((awh) c.a().b(awh.class)).favMusicOrNot(z);
                            return 0;
                        default:
                            return 0;
                    }
                } else {
                    ((aub) c.a().b(aub.class)).favMusicOrNot(z);
                    return 0;
                }
            }
            ((arf) c.a().b(arf.class)).favMusicOrNot(z);
            return 0;
        }
    };
    private MediaCenterManager.ModeChangedListener modeChangedListener = new MediaCenterManager.ModeChangedListener() { // from class: com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel.2
        public void OnModeChanged(int i) {
            Log.i(MediaCenterModel.TAG, "OnModeChanged---" + i);
            EventBus.getDefault().post(new agg.m(i));
        }
    };

    public void onPlaybackControl(int i, int i2) {
        MediaCenterManager.VendorControlListener vendorControlListener = this.mListner;
        if (vendorControlListener != null) {
            vendorControlListener.OnPlaybackControl(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SingleHolder {
        static final MediaCenterModel INSTANCE = new MediaCenterModel();

        private SingleHolder() {
        }
    }

    public static MediaCenterModel getInstance() {
        return SingleHolder.INSTANCE;
    }

    public MediaCenterModel() {
        sSingleAsyncThread = new HandlerThread(ASYNC_THREAD_NAME);
        sSingleAsyncThread.start();
        sSingleAsyncHandler = new Handler(sSingleAsyncThread.getLooper());
        initMediaCenterManager();
    }

    private void doSend(Runnable runnable) {
        sSingleAsyncHandler.post(runnable);
    }

    private void initMediaCenterManager() {
        this.mXUIManager = XUIManager.createXUIManager(com.xiaopeng.musicradio.a.a, new ServiceConnection() { // from class: com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel.3
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                LogUtils.i(MediaCenterModel.TAG, "xuiservice onServiceConnected");
                try {
                    MediaCenterModel.this.mMediaCenterManager = (MediaCenterManager) MediaCenterModel.this.mXUIManager.getXUIServiceManager("mediacenter");
                    MediaCenterModel.this.refreshInfo(aei.a().c());
                } catch (XUIServiceNotConnectedException e) {
                    e.printStackTrace();
                } catch (Exception unused) {
                }
                MediaCenterModel.this.registerListener();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                LogUtils.i(MediaCenterModel.TAG, "xuiservice onServiceDisconnected");
            }
        });
        this.mXUIManager.connect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerListener() {
        try {
            boolean isRegistered = EventBus.getDefault().isRegistered(this);
            Log.i(TAG, "registerListener.. isRegistered: " + isRegistered);
            if (!isRegistered) {
                EventBus.getDefault().register(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        MediaCenterManager mediaCenterManager = this.mMediaCenterManager;
        if (mediaCenterManager != null) {
            try {
                mediaCenterManager.vendorSetControlListener(com.xiaopeng.musicradio.a.a, this.mListner);
                this.mMediaCenterManager.registerModeChangedListener(this.modeChangedListener);
                this.mMediaCenterManager.registerBtStatusListener(new MediaCenterManager.BTStatusListener() { // from class: com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel.4
                    public void onBtStatusChanged(int i) {
                        u.c(new agd.e(i));
                        LogUtils.d(MediaCenterModel.TAG, "post MediaCenterBtStatusChanged:" + i);
                    }
                });
                EventBus.getDefault().post(new agg.m(getCurrentMode()));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public int getBtStatus() {
        try {
            return this.mMediaCenterManager.getBtStatus();
        } catch (Exception unused) {
            return 1;
        }
    }

    public boolean startBtRender() {
        try {
            this.mMediaCenterManager.playBtMedia();
            return true;
        } catch (Exception e) {
            LogUtils.e(TAG, "startBtRender exception", e);
            return false;
        }
    }

    public boolean pauseBtRender() {
        try {
            if (this.mMediaCenterManager != null) {
                this.mMediaCenterManager.pauseBtMedia();
            }
            return true;
        } catch (Exception e) {
            LogUtils.e(TAG, "pauseBtRender exception", e);
            return false;
        }
    }

    private void vendorMediaInfoNotifyViaNet(String str, String str2, String str3, String str4, String str5, int i, int i2, MusicInfo musicInfo, int i3, String str6, boolean z) {
        if (this.mMediaCenterManager == null) {
            return;
        }
        Log.i(TAG, "vendorMediaInfoNotifyViaNet.. title: " + str2 + ", album: " + str3 + ", artist: " + str4 + ", logoUrl: " + str5 + ", source: " + i3 + ", musicInfo: " + musicInfo);
        vendorMediaInfoNotify(str, str2, str3, str4, str5, i2, i3, str6, z);
    }

    private void vendorMediaInfoNotifyViaNet(String str, String str2, String str3, String str4, String str5, int i, int i2, long j, int i3, boolean z) {
        if (this.mMediaCenterManager == null) {
            return;
        }
        Log.i(TAG, "vendorMediaInfoNotifyViaNet.. title: " + str2 + ", album: " + str3 + ", artist: " + str4 + ", logoUrl: " + str5 + ", source: " + i3 + ", artistId: " + j);
        vendorMediaInfoNotify(str, str2, str3, str4, str5, i2, i3, "", z);
    }

    private boolean isContentEqual(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return true;
        }
        return TextUtils.equals(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void vendorMediaInfoNotify(java.lang.String r15, final java.lang.String r16, final java.lang.String r17, final java.lang.String r18, final java.lang.String r19, final int r20, final int r21, final java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel.vendorMediaInfoNotify(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, boolean):void");
    }

    private void updatePositionInOtherEvent() {
        if (aei.a().e() != null) {
            aek e = aei.a().e();
            vendorUpdatePosition(e.getPosition(), e.getDuration());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetPlayPosition() {
        long j = this.mLastDuration;
        if (j > 0) {
            vendorUpdatePosition(0L, j);
        } else {
            vendorUpdatePosition(0L, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vendorUpdatePlaybackStatus(final int i) {
        if (this.mMediaCenterManager == null) {
            Log.d(TAG, "vendorUpdatePlaybackStatus cancel: mMediaCenterManager == null");
        } else {
            doSend(new Runnable() { // from class: com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MediaCenterModel.this.mMediaCenterManager.vendorUpdatePlaybackStatus(i);
                        Log.d(MediaCenterModel.TAG, "do vendor UpdatePlaybackStatus : " + i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void vendorUpdatePosition(final long j, final long j2) {
        if (this.mMediaCenterManager == null) {
            return;
        }
        arf arfVar = (arf) c.a().b(arf.class);
        if ((arfVar != null ? arfVar.isInCall() : false) && j == 0) {
            Log.i(TAG, "update position skip, as in call && position is reset");
        } else if (j < 0 || j2 < 0) {
        } else {
            if (this.mLastDuration == j2 && this.mLastPosition == j) {
                Log.d(TAG, "update position skip, as the same pos = " + j);
                return;
            }
            this.mLastPosition = j;
            this.mLastDuration = j2;
            doSend(new Runnable() { // from class: com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (aei.a().c() == 2) {
                            MediaCenterModel.this.mMediaCenterManager.vendorUpdatePosition(j, 0L);
                        } else {
                            MediaCenterModel.this.mMediaCenterManager.vendorUpdatePosition(j, j2);
                        }
                        aej c = aeh.a().c();
                        if (c == null || c.f()) {
                            return;
                        }
                        Log.i(MediaCenterModel.TAG, "do vendor UpdatePosition after meditation .. position: " + j + ", duration: " + j2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioTypeChangeEvent(agg.g gVar) {
        if (gVar != null) {
            resetAudioInfoRecord();
            updatePositionInOtherEvent();
            int a = gVar.a();
            aek c = aei.a().c(a);
            if (c != null) {
                dealPlayState(new age.l(a, c.getPlayState()));
                dealAudioInfo(new age.c(a));
            }
            if (a == 6) {
                vendorUpdatePosition(0L, 0L);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealPlayState(age.l lVar) {
        if (this.mMediaCenterManager == null) {
            LogUtils.i(TAG, "dealPlayState.. mLastPlayState: " + this.mLastPlayState + ", playState: " + lVar);
        } else if (aei.a().c() != lVar.b()) {
            LogUtils.i(TAG, "dealPlayState.. skip. AudioTypeControlModel.getInstance().getAudioType(): " + aei.a().c() + ", playState.getAudioType(): " + lVar.b());
        } else {
            int a = lVar.a();
            age.l lVar2 = this.mOldEvnetPlayState;
            if (lVar2 != null && lVar2.equals(lVar)) {
                Log.i(TAG, "dealPlayState: =========");
                return;
            }
            this.mOldEvnetPlayState = new age.l(lVar.b(), lVar.a());
            this.mLastPlayState = a;
            LogUtils.i(TAG, "dealPlayState.. lastPlayState: " + a + " playState = " + lVar);
            if (a == 2 || a == 1) {
                vendorUpdatePlaybackStatus(0);
            } else if (a == 3) {
                vendorUpdatePlaybackStatus(2);
            } else {
                vendorUpdatePlaybackStatus(1);
            }
            updatePositionInOtherEvent();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioPos(age.m mVar) {
        int c;
        aek c2;
        if (this.mMediaCenterManager != null && (c = aei.a().c()) == mVar.a() && (c2 = aei.a().c(c)) != null && c2.getDuration() >= 0) {
            if (mVar.b() > 0) {
                vendorUpdatePosition(c2.getPosition(), mVar.b());
            } else {
                vendorUpdatePosition(c2.getPosition(), c2.getDuration());
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLogout(agq.v vVar) {
        refreshInfo(aei.a().c());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLogin(agq.u uVar) {
        refreshInfo(aei.a().c());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onBindSuccess(agq.h hVar) {
        if (hVar.a()) {
            refreshInfo(aei.a().c());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDownloadProgram(awn.a aVar) {
        if (aVar.a()) {
            refreshInfo(aei.a().c());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRefreshLogo(agg.w wVar) {
        refreshInfo(aei.a().c());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealLoveEvent(agq.l lVar) {
        refreshInfo(aei.a().c());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealReadLoveEvent(agq.o oVar) {
        refreshInfo(aei.a().c());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetRadioLove(agg.k kVar) {
        refreshInfo(aei.a().c());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealTryListen(age.r rVar) {
        if (aei.a().c() == 0) {
            refreshInfo(aei.a().c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshInfo(int i) {
        if (this.mMediaCenterManager == null) {
            LogUtils.i(TAG, "mMediaCenterManager is null");
            return;
        }
        final int c = aei.a().c();
        if (c == -1) {
            reset(0);
        } else if (c != i) {
            LogUtils.i(TAG, "refresh return by : currentType: " + c + ", info.getAudioType()： " + i);
        } else {
            ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel.8
                @Override // java.lang.Runnable
                public void run() {
                    int i2 = c;
                    if (i2 == 0) {
                        MediaCenterModel.this.refreshMusicInfo();
                    } else if (i2 != 6) {
                        switch (i2) {
                            case 2:
                                MediaCenterModel.this.refreshBluetoothInfo();
                                break;
                            case 3:
                                MediaCenterModel.this.refreshProgramInfo();
                                break;
                        }
                    } else {
                        MediaCenterModel.this.refreshNetRadioInfo();
                    }
                    if (MediaCenterModel.this.mLastPlayState == 2 || MediaCenterModel.this.mLastPlayState == 1) {
                        MediaCenterModel.this.vendorUpdatePlaybackStatus(0);
                    } else if (MediaCenterModel.this.mLastPlayState == 3) {
                        MediaCenterModel.this.vendorUpdatePlaybackStatus(2);
                    } else {
                        MediaCenterModel.this.vendorUpdatePlaybackStatus(1);
                    }
                }
            }, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshNetRadioInfo() {
        aub aubVar = (aub) c.a().b(aub.class);
        int i = 1;
        if (aubVar != null) {
            auc playingNetRadioInfo = aubVar.getPlayingNetRadioInfo();
            if (playingNetRadioInfo != null) {
                vendorMediaInfoNotifyViaNet(String.valueOf(playingNetRadioInfo.e()), playingNetRadioInfo.b(), "", playingNetRadioInfo.a(), playingNetRadioInfo.c(), f.e.pic_netradio_cover_240, (playingNetRadioInfo.d() && isReadLogin()) ? 0 : 0, playingNetRadioInfo.e(), 1, false);
                return;
            }
            reset(1);
            return;
        }
        reset(1);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        LogUtils.i(TAG, "dealAudioInfo.. type: " + cVar.a());
        refreshInfo(cVar.a());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateBtInfo(agq.a aVar) {
        LogUtils.d(TAG, "updateBtInfo, audioType:" + aei.a().c());
        if (aei.a().c() == 2) {
            refreshBluetoothInfo();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicLogoInfo(age.i iVar) {
        LogUtils.i(TAG, "dealMusicLogoInfo.. ");
        refreshInfo(0);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPowerChange(agg.s sVar) {
        Log.i(TAG, "onPowerChange: " + sVar.a());
        if (!sVar.a()) {
            LogUtils.d(TAG, "reset last mediaInfo");
            this.mLastMediaInfo = null;
            return;
        }
        refreshInfo(aei.a().c());
    }

    public void reset(int i) {
        vendorMediaInfoNotify("", com.xiaopeng.musicradio.a.a.getString(f.h.tip_init_title), com.xiaopeng.musicradio.a.a.getString(f.h.tip_init_sub_title), com.xiaopeng.musicradio.a.a.getString(f.h.tip_init_sub_title), null, -1, i, "", false);
        this.mLastPlayState = 3;
        vendorUpdatePlaybackStatus(1);
        vendorUpdatePosition(0L, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void refreshMusicInfo() {
        /*
            r17 = this;
            r12 = r17
            com.xiaopeng.musicradio.service.c r0 = com.xiaopeng.musicradio.service.c.a()
            java.lang.Class<arf> r1 = defpackage.arf.class
            java.lang.Object r0 = r0.b(r1)
            arf r0 = (defpackage.arf) r0
            r1 = 0
            if (r0 == 0) goto L8c
            arh r2 = r0.getPlayingInfo()
            if (r2 == 0) goto L88
            int r3 = r17.getCurrentMode()
            r4 = 1
            if (r3 != r4) goto L41
            java.lang.String r3 = r0.getListSign()
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L41
            java.lang.Class<com.xiaopeng.musicradio.bean.ListSignBean> r5 = com.xiaopeng.musicradio.bean.ListSignBean.class
            java.lang.Object r3 = com.xiaopeng.musicradio.utils.z.a(r3, r5)
            com.xiaopeng.musicradio.bean.ListSignBean r3 = (com.xiaopeng.musicradio.bean.ListSignBean) r3
            if (r3 == 0) goto L41
            java.lang.String r3 = r3.getPrefix()
            java.lang.String r5 = "listsign_local_rm_music"
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 == 0) goto L41
            r3 = 4
            r9 = r3
            goto L42
        L41:
            r9 = r1
        L42:
            boolean r3 = r17.isMusicLogin()
            java.lang.String r5 = r2.a()
            java.lang.String r6 = r2.b()
            java.lang.String r7 = ""
            java.lang.String r8 = r2.c()
            java.lang.String r10 = r2.d()
            int r11 = com.xiaopeng.musicradio.common.f.e.pic_covers_music_220
            boolean r0 = r0.isCanCollected()
            if (r0 == 0) goto L6c
            boolean r0 = r2.e()
            if (r0 == 0) goto L6a
            if (r3 == 0) goto L6a
            r13 = r4
            goto L6e
        L6a:
            r13 = r1
            goto L6e
        L6c:
            r0 = -1
            r13 = r0
        L6e:
            r14 = 0
            java.lang.String r15 = r2.g()
            boolean r16 = r2.h()
            r0 = r17
            r1 = r5
            r2 = r6
            r3 = r7
            r4 = r8
            r5 = r10
            r6 = r11
            r7 = r13
            r8 = r14
            r10 = r15
            r11 = r16
            r0.vendorMediaInfoNotifyViaNet(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L8f
        L88:
            r12.reset(r1)
            goto L8f
        L8c:
            r12.reset(r1)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel.refreshMusicInfo():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshBluetoothInfo() {
        int i;
        int i2;
        Log.i(TAG, "refreshBluetoothInfo: " + a.i().n() + " musicclose = " + a.i().v());
        arf arfVar = (arf) c.a().b(arf.class);
        if (arfVar != null && a.i().n() && !a.i().v()) {
            arg playingBtInfo = arfVar.getPlayingBtInfo();
            if (playingBtInfo.e()) {
                vendorUpdatePlaybackStatus(1);
            }
            boolean isMusicLogin = isMusicLogin();
            String f = playingBtInfo.f();
            String a = playingBtInfo.a();
            String b = playingBtInfo.b();
            String c = playingBtInfo.c();
            int i3 = f.e.pic_covers_music_220;
            if (!arfVar.isCanCollected()) {
                i = -1;
            } else if (playingBtInfo.d() && isMusicLogin) {
                i2 = 1;
                vendorMediaInfoNotifyViaNet(f, a, "", b, c, i3, i2, null, 3, "", false);
                return;
            } else {
                i = 0;
            }
            i2 = i;
            vendorMediaInfoNotifyViaNet(f, a, "", b, c, i3, i2, null, 3, "", false);
            return;
        }
        reset(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshProgramInfo() {
        awh awhVar = (awh) c.a().b(awh.class);
        if (awhVar != null) {
            awk playingInfo = awhVar.getPlayingInfo();
            if (playingInfo != null) {
                long b = playingInfo.b();
                boolean isReadLogin = isReadLogin();
                Log.i(TAG, "refreshProgramInfo: ====== " + playingInfo.f() + "login = " + isReadLogin);
                vendorMediaInfoNotifyViaNet(String.valueOf(playingInfo.d()), playingInfo.a(), playingInfo.e(), playingInfo.e(), playingInfo.c(), f.e.pic_program_default_220, (playingInfo.f() && isReadLogin) ? 1 : 0, b, 2, false);
                return;
            }
            reset(2);
        }
    }

    private boolean isMusicLogin() {
        if (w.f() == 2) {
            return aqh.a().d();
        }
        return aqi.a().f();
    }

    private boolean isReadLogin() {
        if (w.f() == 2) {
            return aqh.a().e();
        }
        return aqi.a().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startMusicApp() {
        Log.i(TAG, "startMusicApp:isMusicLogin=" + isMusicLogin() + ",isReadLogin=" + isReadLogin());
        if (com.xiaopeng.musicradio.utils.a.a().f() && aei.a().c() == 2 && !a.i().n()) {
            b.a(com.xiaopeng.musicradio.a.a.getPackageName(), com.xiaopeng.musicradio.a.a);
        }
    }

    private boolean isMusicRunning() {
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) com.xiaopeng.musicradio.a.a.getSystemService("activity")).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.importance == 100) {
                for (String str : next.pkgList) {
                    if ("com.xiaopeng.musicradio".equals(str)) {
                        this.mMusicInfo = next;
                        return true;
                    }
                }
                continue;
            }
        }
    }

    public int getCurrentMode() {
        MediaCenterManager mediaCenterManager = this.mMediaCenterManager;
        if (mediaCenterManager != null) {
            try {
                return mediaCenterManager.getCurrentMode();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public boolean isXpMusicShowingInInfoflow() {
        MediaCenterManager mediaCenterManager = this.mMediaCenterManager;
        if (mediaCenterManager != null) {
            try {
                MediaInfo currentMediaInfo = mediaCenterManager.getCurrentMediaInfo();
                if (currentMediaInfo != null) {
                    return currentMediaInfo.isXpMusic();
                }
                return true;
            } catch (XUIServiceNotConnectedException e) {
                e.printStackTrace();
                return true;
            }
        }
        return true;
    }

    public void resetAudioInfoRecord() {
        this.mLastPosition = -1L;
        this.mLastDuration = -1L;
        this.mLastMediaInfo = null;
    }

    public boolean setA2dpVolume(float f) {
        MediaCenterManager mediaCenterManager = this.mMediaCenterManager;
        if (mediaCenterManager != null) {
            try {
                mediaCenterManager.setBtVolume(f);
                return true;
            } catch (XUIServiceNotConnectedException e) {
                e.printStackTrace();
                LogUtils.e((Object) TAG, "setA2dpVolume fail", (Throwable) e);
                return false;
            }
        }
        LogUtils.e(TAG, "setA2dpVolume fail, mediacentermanager is null");
        return false;
    }

    public void setShareEvent(int i) {
        if (this.wmf == null) {
            this.wmf = WindowManagerFactory.create(com.xiaopeng.musicradio.a.a);
        }
        Log.i(TAG, "setShareEvent: " + i + " packName = " + com.xiaopeng.musicradio.a.a.getPackageName());
        this.wmf.setSharedEvent(6, i, com.xiaopeng.musicradio.a.a.getPackageName());
    }
}
