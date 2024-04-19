package com.xiaopeng.speech.vui;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.internal.policy.DecorView;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.speech.vui.cache.VuiDisplayLocationInfoCache;
import com.xiaopeng.speech.vui.cache.VuiSceneBuildCache;
import com.xiaopeng.speech.vui.cache.VuiSceneCache;
import com.xiaopeng.speech.vui.cache.VuiSceneCacheFactory;
import com.xiaopeng.speech.vui.constants.Foo;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.speech.vui.listener.IUnityVuiSceneListener;
import com.xiaopeng.speech.vui.listener.IUnityVuiStateListener;
import com.xiaopeng.speech.vui.listener.IVuiEventListener;
import com.xiaopeng.speech.vui.model.VuiFeedback;
import com.xiaopeng.speech.vui.model.VuiScene;
import com.xiaopeng.speech.vui.model.VuiSceneInfo;
import com.xiaopeng.speech.vui.model.VuiSceneState;
import com.xiaopeng.speech.vui.task.TaskDispatcher;
import com.xiaopeng.speech.vui.task.TaskWrapper;
import com.xiaopeng.speech.vui.utils.LogUtils;
import com.xiaopeng.speech.vui.utils.SceneMergeUtils;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.speech.vui.vuiengine.BuildConfig;
import com.xiaopeng.speech.vui.vuiengine.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class VuiEngineImpl {
    private static final String TAG = "VuiEngine";
    private static final String VUI_SCENE_TAG = "PopPanel";
    private EventDispatcher eventDispatcher;
    private Context mContext;
    private Handler mDispatherHandler;
    private HandlerThread mDispatherThread;
    private Handler mHandler;
    private String mPackageName;
    private String mPackageVersion;
    private Resources mResources;
    private HandlerThread mThread;
    private TaskDispatcher taskStructure;
    public static final ConcurrentMap<String, String> mActiveSceneIds = new ConcurrentHashMap();
    public static String mSceneIdPrefix = null;
    public static ConcurrentSkipListSet<String> mLeftPopPanelStack = new ConcurrentSkipListSet<>();
    public static ConcurrentSkipListSet<String> mRightPopPanelStack = new ConcurrentSkipListSet<>();
    private List<String> mainThreadSceneList = Arrays.asList("MainMusicConcentration");
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    private List<String> mEnterSceneIds = Collections.synchronizedList(new ArrayList());
    private Handler mainHandler = new Handler(Looper.getMainLooper());
    private List<String> mLFEnterSceneStack = new ArrayList();
    private List<String> mRFEnterSceneStack = new ArrayList();
    private List<String> mBackNaviSceneStack = new ArrayList();
    private UpdateElementAttrRun mUpdateElementAttrRun = null;
    private UpdateSceneRun mUpdateSceneRun = null;
    private List<IUnityVuiStateListener> vuiStateListeners = new ArrayList();
    private Map<String, String> querySceneIdMap = new HashMap();

    public VuiEngineImpl(Context context, boolean z) {
        LogUtils.logInfo(TAG, BuildConfig.BUILD_VERSION);
        if (VuiUtils.canUseVuiFeature()) {
            this.mContext = context;
            Foo.setContext(this.mContext);
            lazyInitThread();
            this.mResources = this.mContext.getResources();
            this.mPackageName = context.getApplicationInfo().packageName;
            VuiSceneManager.instance().setmPackageName(this.mPackageName);
            VuiSceneManager.instance().setContext(this.mContext);
            VuiSceneManager.instance().setEngine(this);
            this.eventDispatcher = new EventDispatcher(this.mContext, z);
            this.taskStructure = new TaskDispatcher();
            try {
                this.mPackageVersion = context.getPackageManager().getPackageInfo(this.mPackageName, 0).versionName;
                VuiSceneManager.instance().setmPackageVersion(this.mPackageVersion);
                mSceneIdPrefix = this.mPackageName + "-" + this.mPackageVersion;
            } catch (Exception e) {
                e.printStackTrace();
                LogUtils.e(TAG, "VuiEngine init e:" + e.getMessage());
            }
        }
    }

    private void lazyInitThread() {
        if (this.mThread == null) {
            this.mThread = new HandlerThread("VuiEngine-Thread");
            this.mThread.start();
            this.mHandler = new Handler(this.mThread.getLooper());
        }
        if (this.mDispatherThread == null) {
            this.mDispatherThread = new HandlerThread("VuiEngine-Disptcher-Thread");
            this.mDispatherThread.start();
            this.mDispatherHandler = new Handler(this.mDispatherThread.getLooper());
        }
    }

    public void enterScene(String str, boolean z) {
        enterScene(str, VuiUtils.getSourceDisplayLocation(), z);
    }

    public void enterScene(final String str, final String str2, final boolean z) {
        Handler handler;
        if (VuiUtils.canUseVuiFeature()) {
            if (TextUtils.isEmpty(str2)) {
                str2 = VuiConstants.SCREEN_DISPLAY_LF;
            }
            if (str == null || (handler = this.mHandler) == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.1
                /* JADX WARN: Removed duplicated region for block: B:111:0x0313 A[Catch: Exception -> 0x0543, TryCatch #0 {Exception -> 0x0543, blocks: (B:2:0x0000, B:4:0x0018, B:6:0x0031, B:8:0x0047, B:10:0x0051, B:12:0x0076, B:15:0x0084, B:17:0x0090, B:20:0x00a5, B:22:0x00aa, B:24:0x00c6, B:26:0x00d2, B:27:0x00db, B:29:0x00e5, B:32:0x00f0, B:34:0x00fc, B:49:0x0158, B:36:0x0107, B:38:0x0113, B:40:0x0125, B:42:0x012d, B:44:0x0135, B:45:0x0140, B:47:0x0145, B:48:0x014f, B:51:0x0175, B:53:0x0183, B:56:0x018c, B:58:0x01c4, B:60:0x01cc, B:62:0x01d6, B:64:0x01de, B:65:0x01f6, B:67:0x01fe, B:68:0x0203, B:70:0x020d, B:72:0x0217, B:74:0x021f, B:75:0x0237, B:77:0x023f, B:78:0x0244, B:81:0x024f, B:83:0x0259, B:85:0x0265, B:91:0x028e, B:93:0x02b6, B:95:0x02c0, B:98:0x02cb, B:100:0x02d3, B:103:0x02e2, B:105:0x02ec, B:111:0x0313, B:113:0x0324, B:117:0x0341, B:114:0x032e, B:116:0x0338, B:118:0x034a, B:120:0x0388, B:122:0x0394, B:123:0x03e2, B:125:0x03f0, B:127:0x03fc, B:128:0x041c, B:129:0x0427, B:131:0x0431, B:133:0x043d, B:134:0x048b, B:136:0x0497, B:138:0x04a3, B:140:0x04af, B:141:0x04c5, B:143:0x04f6, B:145:0x0504, B:147:0x0510, B:148:0x052f, B:106:0x02f9, B:108:0x0303, B:86:0x026f, B:88:0x0279, B:90:0x0285, B:149:0x0539), top: B:154:0x0000 }] */
                /* JADX WARN: Removed duplicated region for block: B:120:0x0388 A[Catch: Exception -> 0x0543, TryCatch #0 {Exception -> 0x0543, blocks: (B:2:0x0000, B:4:0x0018, B:6:0x0031, B:8:0x0047, B:10:0x0051, B:12:0x0076, B:15:0x0084, B:17:0x0090, B:20:0x00a5, B:22:0x00aa, B:24:0x00c6, B:26:0x00d2, B:27:0x00db, B:29:0x00e5, B:32:0x00f0, B:34:0x00fc, B:49:0x0158, B:36:0x0107, B:38:0x0113, B:40:0x0125, B:42:0x012d, B:44:0x0135, B:45:0x0140, B:47:0x0145, B:48:0x014f, B:51:0x0175, B:53:0x0183, B:56:0x018c, B:58:0x01c4, B:60:0x01cc, B:62:0x01d6, B:64:0x01de, B:65:0x01f6, B:67:0x01fe, B:68:0x0203, B:70:0x020d, B:72:0x0217, B:74:0x021f, B:75:0x0237, B:77:0x023f, B:78:0x0244, B:81:0x024f, B:83:0x0259, B:85:0x0265, B:91:0x028e, B:93:0x02b6, B:95:0x02c0, B:98:0x02cb, B:100:0x02d3, B:103:0x02e2, B:105:0x02ec, B:111:0x0313, B:113:0x0324, B:117:0x0341, B:114:0x032e, B:116:0x0338, B:118:0x034a, B:120:0x0388, B:122:0x0394, B:123:0x03e2, B:125:0x03f0, B:127:0x03fc, B:128:0x041c, B:129:0x0427, B:131:0x0431, B:133:0x043d, B:134:0x048b, B:136:0x0497, B:138:0x04a3, B:140:0x04af, B:141:0x04c5, B:143:0x04f6, B:145:0x0504, B:147:0x0510, B:148:0x052f, B:106:0x02f9, B:108:0x0303, B:86:0x026f, B:88:0x0279, B:90:0x0285, B:149:0x0539), top: B:154:0x0000 }] */
                /* JADX WARN: Removed duplicated region for block: B:129:0x0427 A[Catch: Exception -> 0x0543, TryCatch #0 {Exception -> 0x0543, blocks: (B:2:0x0000, B:4:0x0018, B:6:0x0031, B:8:0x0047, B:10:0x0051, B:12:0x0076, B:15:0x0084, B:17:0x0090, B:20:0x00a5, B:22:0x00aa, B:24:0x00c6, B:26:0x00d2, B:27:0x00db, B:29:0x00e5, B:32:0x00f0, B:34:0x00fc, B:49:0x0158, B:36:0x0107, B:38:0x0113, B:40:0x0125, B:42:0x012d, B:44:0x0135, B:45:0x0140, B:47:0x0145, B:48:0x014f, B:51:0x0175, B:53:0x0183, B:56:0x018c, B:58:0x01c4, B:60:0x01cc, B:62:0x01d6, B:64:0x01de, B:65:0x01f6, B:67:0x01fe, B:68:0x0203, B:70:0x020d, B:72:0x0217, B:74:0x021f, B:75:0x0237, B:77:0x023f, B:78:0x0244, B:81:0x024f, B:83:0x0259, B:85:0x0265, B:91:0x028e, B:93:0x02b6, B:95:0x02c0, B:98:0x02cb, B:100:0x02d3, B:103:0x02e2, B:105:0x02ec, B:111:0x0313, B:113:0x0324, B:117:0x0341, B:114:0x032e, B:116:0x0338, B:118:0x034a, B:120:0x0388, B:122:0x0394, B:123:0x03e2, B:125:0x03f0, B:127:0x03fc, B:128:0x041c, B:129:0x0427, B:131:0x0431, B:133:0x043d, B:134:0x048b, B:136:0x0497, B:138:0x04a3, B:140:0x04af, B:141:0x04c5, B:143:0x04f6, B:145:0x0504, B:147:0x0510, B:148:0x052f, B:106:0x02f9, B:108:0x0303, B:86:0x026f, B:88:0x0279, B:90:0x0285, B:149:0x0539), top: B:154:0x0000 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 1358
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.speech.vui.VuiEngineImpl.AnonymousClass1.run():void");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isChangeActiveScene(String str, Context context, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            bie vuiSceneListener = VuiSceneManager.instance().getVuiSceneListener(str2);
            if (!TextUtils.isEmpty(str2) && (str2.endsWith("Dialog") || str2.endsWith("dialog"))) {
                list.add(i, str);
                return false;
            }
            if (vuiSceneListener instanceof Dialog) {
                Context context2 = getContext(str2);
                LogUtils.logDebug(TAG, "enterScene stackContext:" + context2);
                if (context2 != null && (context2.equals(context) || ((context instanceof Activity) && ((context2 instanceof Service) || (context2 instanceof Application))))) {
                    LogUtils.logInfo(TAG, "enterScene has same context:" + i);
                    list.add(i, str);
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
        if (r4.equals(r11) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
        if (r0 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
        if (r0 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handlerEnterScene(java.lang.String r9, boolean r10, java.lang.String r11) {
        /*
            r8 = this;
            com.xiaopeng.speech.vui.VuiSceneManager r0 = com.xiaopeng.speech.vui.VuiSceneManager.instance()
            java.lang.String r1 = r8.mPackageName
            java.lang.String r10 = r0.enterScene(r9, r1, r10, r11)
            java.lang.String r0 = "VuiEngine"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handlerEnterScene result:"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.xiaopeng.speech.vui.utils.LogUtils.i(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto Lce
            com.xiaopeng.speech.vui.cache.VuiSceneCacheFactory r0 = com.xiaopeng.speech.vui.cache.VuiSceneCacheFactory.instance()
            com.xiaopeng.speech.vui.cache.VuiSceneCacheFactory$CacheType r1 = com.xiaopeng.speech.vui.cache.VuiSceneCacheFactory.CacheType.BUILD
            int r1 = r1.getType()
            com.xiaopeng.speech.vui.cache.VuiSceneCache r0 = r0.getSceneCache(r1)
            com.xiaopeng.speech.vui.cache.VuiSceneBuildCache r0 = (com.xiaopeng.speech.vui.cache.VuiSceneBuildCache) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L49
            java.lang.String r3 = r0.getDisplayCache(r9)
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L49
            r0.setDisplayLocation(r9, r11)
            r0 = r1
            goto L4a
        L49:
            r0 = r2
        L4a:
            com.xiaopeng.speech.vui.cache.VuiSceneCacheFactory r3 = com.xiaopeng.speech.vui.cache.VuiSceneCacheFactory.instance()
            com.xiaopeng.speech.vui.cache.VuiSceneCacheFactory$CacheType r4 = com.xiaopeng.speech.vui.cache.VuiSceneCacheFactory.CacheType.DISPLAY_LOCATION
            int r4 = r4.getType()
            com.xiaopeng.speech.vui.cache.VuiSceneCache r3 = r3.getSceneCache(r4)
            com.xiaopeng.speech.vui.cache.VuiDisplayLocationInfoCache r3 = (com.xiaopeng.speech.vui.cache.VuiDisplayLocationInfoCache) r3
            if (r3 == 0) goto Lae
            java.lang.String r4 = r3.getDisplayCache(r9)
            java.lang.String r5 = "VuiEngine"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "sceneId:"
            r6.append(r7)
            r6.append(r9)
            java.lang.String r7 = "displayLocationCacheInfo:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = ",displayLocation:"
            r6.append(r7)
            r6.append(r11)
            java.lang.String r7 = ",enterNewScene:"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.xiaopeng.speech.vui.utils.LogUtils.d(r5, r6)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto Lab
            boolean r0 = r4.equals(r11)
            if (r0 != 0) goto La4
            boolean r0 = r3.isSending()
            if (r0 != 0) goto La4
            r3.removeDisplayCache(r9)
            goto Lb2
        La4:
            boolean r11 = r4.equals(r11)
            if (r11 == 0) goto Lb1
            goto Lb2
        Lab:
            if (r0 != 0) goto Lb1
            goto Lb2
        Lae:
            if (r0 != 0) goto Lb1
            goto Lb2
        Lb1:
            r2 = r1
        Lb2:
            if (r2 == 0) goto Lce
            com.xiaopeng.speech.vui.VuiSceneManager r11 = com.xiaopeng.speech.vui.VuiSceneManager.instance()
            boolean r11 = r11.canUpdateScene(r9)
            if (r11 == 0) goto Lce
            long r2 = java.lang.System.currentTimeMillis()
            com.xiaopeng.speech.vui.model.VuiScene r11 = r8.getNewVuiScene(r9, r2)
            com.xiaopeng.speech.vui.VuiSceneManager r0 = com.xiaopeng.speech.vui.VuiSceneManager.instance()
            r2 = 5
            r0.sendSceneData(r2, r1, r11)
        Lce:
            boolean r11 = com.xiaopeng.speech.vui.utils.VuiUtils.cannotUpload()
            if (r11 == 0) goto Ld5
            return
        Ld5:
            com.xiaopeng.speech.vui.VuiSceneManager r11 = com.xiaopeng.speech.vui.VuiSceneManager.instance()
            bie r9 = r11.getVuiSceneListener(r9)
            if (r9 == 0) goto Lef
            if (r10 != 0) goto Le5
            r9.onBuildScene()
            goto Lef
        Le5:
            android.os.Handler r10 = r8.mHandler
            com.xiaopeng.speech.vui.VuiEngineImpl$2 r11 = new com.xiaopeng.speech.vui.VuiEngineImpl$2
            r11.<init>()
            r10.post(r11)
        Lef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.speech.vui.VuiEngineImpl.handlerEnterScene(java.lang.String, boolean, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext(String str) {
        View rootView = VuiSceneManager.instance().getRootView(str);
        if (rootView != null) {
            Context context = rootView != null ? rootView.getContext() : null;
            if (rootView instanceof DecorView) {
                return context;
            }
            if (context != null && (context instanceof ContextWrapper)) {
                context = getDialogOwnContext(context);
            }
            if (context != null && (context instanceof Application) && !"com.xiaopeng.musicradio".equals(this.mPackageName)) {
                View findViewById = rootView != null ? rootView.findViewById(16908290) : null;
                if (findViewById != null && (findViewById instanceof ViewGroup)) {
                    return getDialogOwnContext(((ViewGroup) findViewById).getChildAt(0).getContext());
                }
            }
            return context;
        }
        return null;
    }

    private Context getDialogOwnContext(Context context) {
        if ((context instanceof Activity) || (context instanceof Service) || (context instanceof Application)) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return getDialogOwnContext(context);
    }

    public String getSceneUnqiueId(String str) {
        return mSceneIdPrefix + "-" + str;
    }

    public void exitDupScene(String str, boolean z, bie bieVar) {
        if (bieVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        exitScene(bieVar.toString() + "-" + str, z);
    }

    public void enterDupScene(String str, boolean z, bie bieVar) {
        if (bieVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        enterScene(bieVar.toString() + "-" + str, z);
    }

    public void exitScene(String str, boolean z) {
        exitScene(str, VuiUtils.getSourceDisplayLocation(), z, null);
    }

    public void exitScene(final String str, String str2, final boolean z, final bie bieVar) {
        if (!VuiUtils.canUseVuiFeature() || str == null || this.mHandler == null) {
            return;
        }
        final String str3 = TextUtils.isEmpty(str2) ? VuiConstants.SCREEN_DISPLAY_LF : str2;
        this.mHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                    VuiSceneInfo sceneInfo = VuiSceneManager.instance().getSceneInfo(sceneUnqiueId);
                    if (bieVar != null && sceneInfo != null && sceneInfo.getListener() != null && !bieVar.equals(sceneInfo.getListener())) {
                        LogUtils.w(VuiEngineImpl.TAG, "要退出的场景和目前持有的场景数据不一致");
                    } else if (str.endsWith(VuiEngineImpl.VUI_SCENE_TAG)) {
                        if (VuiConstants.SCREEN_DISPLAY_LF.equals(str3)) {
                            if (VuiEngineImpl.mLeftPopPanelStack.contains(sceneUnqiueId)) {
                                VuiEngineImpl.mLeftPopPanelStack.remove(sceneUnqiueId);
                                LogUtils.i(VuiEngineImpl.TAG, "exitScene:" + sceneUnqiueId + ",mLeftPopPanelStack:" + VuiEngineImpl.mLeftPopPanelStack + " mRightPopPanelStack:" + VuiEngineImpl.mRightPopPanelStack + ListSignBean.COLLECTID_SUFFIX + VuiEngineImpl.mActiveSceneIds);
                                VuiSceneManager.instance().exitScene(sceneUnqiueId, VuiEngineImpl.this.mPackageName, z, str3);
                            }
                        } else if (VuiConstants.SCREEN_DISPLAY_RF.equals(str3) && VuiEngineImpl.mRightPopPanelStack.contains(sceneUnqiueId)) {
                            VuiEngineImpl.mRightPopPanelStack.remove(sceneUnqiueId);
                            LogUtils.i(VuiEngineImpl.TAG, "exitScene:" + sceneUnqiueId + ",mLeftPopPanelStack:" + VuiEngineImpl.mLeftPopPanelStack + " mRightPopPanelStack:" + VuiEngineImpl.mRightPopPanelStack + ListSignBean.COLLECTID_SUFFIX + VuiEngineImpl.mActiveSceneIds);
                            VuiSceneManager.instance().exitScene(sceneUnqiueId, VuiEngineImpl.this.mPackageName, z, str3);
                        }
                    } else {
                        if (VuiConstants.SCREEN_DISPLAY_LF.equals(str3)) {
                            VuiEngineImpl.this.mLFEnterSceneStack.remove(sceneUnqiueId);
                        } else if (!VuiConstants.SCREEN_DISPLAY_RF.equals(str3)) {
                            return;
                        } else {
                            VuiEngineImpl.this.mRFEnterSceneStack.remove(sceneUnqiueId);
                        }
                        if (VuiEngineImpl.this.mBackNaviSceneStack.contains(sceneUnqiueId)) {
                            VuiEngineImpl.this.mBackNaviSceneStack.remove(sceneUnqiueId);
                        }
                        LogUtils.i(VuiEngineImpl.TAG, "exitScene:" + sceneUnqiueId + ",mLFEnterSceneStack:" + VuiEngineImpl.this.mLFEnterSceneStack + " mRFEnterSceneStack:" + VuiEngineImpl.this.mRFEnterSceneStack + ListSignBean.COLLECTID_SUFFIX + VuiEngineImpl.mActiveSceneIds);
                        VuiSceneManager.instance().exitScene(sceneUnqiueId, VuiEngineImpl.this.mPackageName, z, str3);
                        if (VuiEngineImpl.mActiveSceneIds.containsValue(sceneUnqiueId)) {
                            if (VuiConstants.SCREEN_DISPLAY_LF.equals(str3)) {
                                if (VuiEngineImpl.this.mLFEnterSceneStack.size() != 0) {
                                    String str4 = (String) VuiEngineImpl.this.mLFEnterSceneStack.get(VuiEngineImpl.this.mLFEnterSceneStack.size() - 1);
                                    VuiEngineImpl.mActiveSceneIds.put(VuiConstants.SCREEN_DISPLAY_LF, str4);
                                    VuiEngineImpl.this.handlerEnterScene(str4, z, str3);
                                } else {
                                    VuiEngineImpl.mActiveSceneIds.put(VuiConstants.SCREEN_DISPLAY_LF, "");
                                }
                            } else if (VuiConstants.SCREEN_DISPLAY_RF.equals(str3)) {
                                if (VuiEngineImpl.this.mRFEnterSceneStack.size() != 0) {
                                    String str5 = (String) VuiEngineImpl.this.mRFEnterSceneStack.get(VuiEngineImpl.this.mRFEnterSceneStack.size() - 1);
                                    VuiEngineImpl.mActiveSceneIds.put(VuiConstants.SCREEN_DISPLAY_RF, str5);
                                    VuiEngineImpl.this.handlerEnterScene(str5, z, str3);
                                } else {
                                    VuiEngineImpl.mActiveSceneIds.put(VuiConstants.SCREEN_DISPLAY_RF, "");
                                }
                            }
                        }
                        Log.d(VuiEngineImpl.TAG, "exitScene:" + sceneUnqiueId + ",mLFEnterSceneStack:" + VuiEngineImpl.this.mLFEnterSceneStack + " mRFEnterSceneStack:" + VuiEngineImpl.this.mRFEnterSceneStack + ListSignBean.COLLECTID_SUFFIX + VuiEngineImpl.mActiveSceneIds);
                        if (VuiEngineImpl.this.mLFEnterSceneStack.size() != 0 || VuiEngineImpl.this.mBackNaviSceneStack.size() <= 0) {
                            return;
                        }
                        for (int i = 0; i < VuiEngineImpl.this.mBackNaviSceneStack.size(); i++) {
                            VuiEngineImpl.this.mLFEnterSceneStack.add(VuiEngineImpl.this.mBackNaviSceneStack.get(i));
                        }
                        String str6 = (String) VuiEngineImpl.this.mLFEnterSceneStack.get(VuiEngineImpl.this.mLFEnterSceneStack.size() - 1);
                        VuiEngineImpl.mActiveSceneIds.put(VuiConstants.SCREEN_DISPLAY_LF, str6);
                        VuiEngineImpl.this.handlerEnterScene(str6, z, VuiConstants.SCREEN_DISPLAY_LF);
                        VuiEngineImpl.this.mBackNaviSceneStack.clear();
                    }
                } catch (Exception e) {
                    LogUtils.e(VuiEngineImpl.TAG, "e:" + e.fillInStackTrace());
                }
            }
        });
    }

    public void buildScene(String str, View view, List<Integer> list, bic bicVar, List<String> list2, boolean z, ISceneCallbackHandler iSceneCallbackHandler) {
        buildScene(str, view, list, bicVar, list2, z, iSceneCallbackHandler, VuiConstants.SCREEN_DISPLAY_LF, (bie) null);
    }

    public void buildScene(final String str, final View view, final List<Integer> list, final bic bicVar, final List<String> list2, final boolean z, final ISceneCallbackHandler iSceneCallbackHandler, final String str2, final bie bieVar) {
        if (VuiUtils.cannotUpload()) {
            return;
        }
        if (view == null || str == null) {
            return;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.4
            @Override // java.lang.Runnable
            public void run() {
                List list3;
                try {
                    String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                    VuiSceneInfo sceneInfo = VuiSceneManager.instance().getSceneInfo(sceneUnqiueId);
                    if (bieVar != null && sceneInfo != null && sceneInfo.getListener() != null && !bieVar.equals(sceneInfo.getListener())) {
                        LogUtils.w(VuiEngineImpl.TAG, "要build的场景和目前持有的场景数据不一致");
                    } else if (VuiSceneManager.instance().getVuiSceneState(sceneUnqiueId) == VuiSceneState.INIT.getState() && z) {
                        LogUtils.e(VuiEngineImpl.TAG, str + "场景数据的创建必须在场景被激活后");
                    } else {
                        LogUtils.logDebug(VuiEngineImpl.TAG, "buildScene:" + str);
                        if (list2 != null) {
                            List arrayList = new ArrayList();
                            arrayList.addAll(list2);
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                String str3 = (String) arrayList.get(i);
                                arrayList.remove(str3);
                                arrayList.add(i, VuiEngineImpl.this.getSceneUnqiueId(str3));
                            }
                            list3 = arrayList;
                        } else {
                            list3 = null;
                        }
                        VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, TaskDispatcher.TaskType.BUILD, list, bicVar, list3, Arrays.asList(view), z, iSceneCallbackHandler, str2, bieVar));
                    }
                } catch (Exception e) {
                    LogUtils.e(VuiEngineImpl.TAG, "e:" + e.fillInStackTrace());
                }
            }
        }, 200L);
    }

    public void buildScene(String str, List<View> list, List<Integer> list2, bic bicVar, List<String> list3, boolean z, ISceneCallbackHandler iSceneCallbackHandler) {
        buildScene(str, list, list2, bicVar, list3, z, iSceneCallbackHandler, VuiConstants.SCREEN_DISPLAY_LF, (bie) null);
    }

    public void buildScene(final String str, final List<View> list, final List<Integer> list2, final bic bicVar, final List<String> list3, final boolean z, final ISceneCallbackHandler iSceneCallbackHandler, final String str2, final bie bieVar) {
        if (VuiUtils.cannotUpload() || str == null || this.mMainHandler == null) {
            return;
        }
        if (list == null || list.isEmpty()) {
            View rootView = VuiSceneManager.instance().getRootView(getSceneUnqiueId(str));
            if (rootView != null) {
                buildScene(str, rootView, list2, bicVar, list3, z, iSceneCallbackHandler, str2, bieVar);
            }
        } else if (list.size() == 1) {
            buildScene(str, list.get(0), list2, bicVar, list3, z, iSceneCallbackHandler, str2, bieVar);
        } else {
            this.mHandler.postDelayed(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    List list4;
                    try {
                        String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                        VuiSceneInfo sceneInfo = VuiSceneManager.instance().getSceneInfo(sceneUnqiueId);
                        if (bieVar != null && sceneInfo != null && sceneInfo.getListener() != null && !bieVar.equals(sceneInfo.getListener())) {
                            LogUtils.w(VuiEngineImpl.TAG, "要build的场景和目前持有的场景数据不一致");
                        } else if (VuiSceneManager.instance().getVuiSceneState(sceneUnqiueId) == VuiSceneState.INIT.getState() && z) {
                            LogUtils.e(VuiEngineImpl.TAG, str + "场景数据的创建必须在场景被激活后");
                        } else {
                            LogUtils.logDebug(VuiEngineImpl.TAG, "buildScene:" + str);
                            if (list3 != null) {
                                List arrayList = new ArrayList();
                                arrayList.addAll(list3);
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    String str3 = (String) arrayList.get(i);
                                    arrayList.remove(str3);
                                    arrayList.add(i, VuiEngineImpl.this.getSceneUnqiueId(str3));
                                }
                                list4 = arrayList;
                            } else {
                                list4 = null;
                            }
                            VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, TaskDispatcher.TaskType.BUILD, list2, bicVar, list4, list, z, iSceneCallbackHandler, str2, bieVar));
                        }
                    } catch (Exception e) {
                        LogUtils.e(VuiEngineImpl.TAG, e.fillInStackTrace());
                    }
                }
            }, 200L);
        }
    }

    public void updateElementAttribute(final String str, final List<View> list) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    if (VuiUtils.cannotUpload() || list == null || TextUtils.isEmpty(str)) {
                        return;
                    }
                    LogUtils.logDebug(VuiEngineImpl.TAG, "updateElementAttribute");
                    if (VuiEngineImpl.this.mUpdateElementAttrRun != null) {
                        if (str.equals(VuiEngineImpl.this.mUpdateElementAttrRun.getSceneId())) {
                            VuiEngineImpl.this.mHandler.removeCallbacks(VuiEngineImpl.this.mUpdateElementAttrRun);
                            HashSet hashSet = new HashSet(VuiEngineImpl.this.mUpdateElementAttrRun.getUpdateViews());
                            hashSet.addAll(list);
                            VuiEngineImpl.this.mUpdateElementAttrRun.setUpdateViews(new ArrayList(hashSet));
                            VuiEngineImpl.this.mHandler.postDelayed(VuiEngineImpl.this.mUpdateElementAttrRun, 50L);
                            return;
                        }
                        VuiEngineImpl.this.mUpdateElementAttrRun.run();
                        VuiEngineImpl vuiEngineImpl = VuiEngineImpl.this;
                        vuiEngineImpl.mUpdateElementAttrRun = new UpdateElementAttrRun();
                        VuiEngineImpl.this.mUpdateElementAttrRun.setSceneId(str);
                        VuiEngineImpl.this.mUpdateElementAttrRun.setUpdateViews(list);
                        VuiEngineImpl.this.mHandler.postDelayed(VuiEngineImpl.this.mUpdateElementAttrRun, 50L);
                        return;
                    }
                    VuiEngineImpl vuiEngineImpl2 = VuiEngineImpl.this;
                    vuiEngineImpl2.mUpdateElementAttrRun = new UpdateElementAttrRun();
                    VuiEngineImpl.this.mUpdateElementAttrRun.setSceneId(str);
                    VuiEngineImpl.this.mUpdateElementAttrRun.setUpdateViews(list);
                    VuiEngineImpl.this.mHandler.postDelayed(VuiEngineImpl.this.mUpdateElementAttrRun, 50L);
                }
            });
        }
    }

    public void setUpdateElementValue(final String str, final String str2, final Object obj) {
        if (VuiUtils.cannotUpload()) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && obj != null) {
                this.mHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.7
                    @Override // java.lang.Runnable
                    public void run() {
                        String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                        if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                            VuiScene newVuiScene = VuiEngineImpl.this.getNewVuiScene(sceneUnqiueId, System.currentTimeMillis());
                            VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                            if (sceneCache != null) {
                                LogUtils.i(VuiEngineImpl.TAG, "newSceneId：" + sceneUnqiueId + "，elementId：" + str2);
                                bin vuiElementById = sceneCache.getVuiElementById(sceneUnqiueId, str2);
                                StringBuilder sb = new StringBuilder();
                                sb.append("targetElement：");
                                sb.append(vuiElementById);
                                LogUtils.i(VuiEngineImpl.TAG, sb.toString());
                                if (vuiElementById != null) {
                                    vuiElementById.setValues(obj);
                                    LogUtils.i(VuiEngineImpl.TAG, "targetElement：" + vuiElementById);
                                    List<bin> asList = Arrays.asList(vuiElementById);
                                    LogUtils.i(VuiEngineImpl.TAG, "resultElement：" + asList);
                                    newVuiScene.setElements(asList);
                                    List<bin> fusionCache = sceneCache.getFusionCache(sceneUnqiueId, asList, false);
                                    sceneCache.setCache(sceneUnqiueId, fusionCache);
                                    if (!"user".equals(Build.TYPE) && LogUtils.getLogLevel() <= LogUtils.LOG_DEBUG_LEVEL) {
                                        VuiScene newVuiScene2 = VuiEngineImpl.this.getNewVuiScene(sceneUnqiueId, System.currentTimeMillis());
                                        newVuiScene2.setElements(fusionCache);
                                        LogUtils.logDebug(VuiEngineImpl.TAG, "updateSceneTask full_scene_info" + VuiUtils.vuiSceneConvertToString(newVuiScene2));
                                    }
                                    VuiSceneManager.instance().sendSceneData(1, true, newVuiScene);
                                }
                            }
                        }
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    public void setUpdateElementVisible(final String str, final String str2, final boolean z) {
        if (VuiUtils.cannotUpload() || TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.8
            @Override // java.lang.Runnable
            public void run() {
                bin vuiElementById;
                String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                    VuiScene newVuiScene = VuiEngineImpl.this.getNewVuiScene(sceneUnqiueId, System.currentTimeMillis());
                    VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                    if (sceneCache == null || (vuiElementById = sceneCache.getVuiElementById(sceneUnqiueId, str2)) != null) {
                        return;
                    }
                    vuiElementById.setVisible(Boolean.valueOf(z));
                    List<bin> asList = Arrays.asList(vuiElementById);
                    newVuiScene.setElements(asList);
                    List<bin> fusionCache = sceneCache.getFusionCache(sceneUnqiueId, asList, false);
                    sceneCache.setCache(sceneUnqiueId, fusionCache);
                    if (!"user".equals(Build.TYPE) && LogUtils.getLogLevel() <= LogUtils.LOG_DEBUG_LEVEL) {
                        VuiScene newVuiScene2 = VuiEngineImpl.this.getNewVuiScene(sceneUnqiueId, System.currentTimeMillis());
                        newVuiScene2.setElements(fusionCache);
                        LogUtils.logDebug(VuiEngineImpl.TAG, "updateSceneTask full_scene_info" + VuiUtils.vuiSceneConvertToString(newVuiScene2));
                    }
                    VuiSceneManager.instance().sendSceneData(1, true, newVuiScene);
                }
            }
        });
    }

    public void vuiFeedback(String str, String str2) {
        if (VuiUtils.cannotUpload()) {
            return;
        }
        VuiSceneManager.instance().vuiFeedBack(str, str2);
    }

    public void addVuiStateChangeListener(IUnityVuiStateListener iUnityVuiStateListener) {
        if (this.vuiStateListeners.contains(iUnityVuiStateListener)) {
            return;
        }
        this.vuiStateListeners.add(iUnityVuiStateListener);
    }

    public void removeVuiStateChangeListener(IUnityVuiStateListener iUnityVuiStateListener) {
        if (this.vuiStateListeners.contains(iUnityVuiStateListener)) {
            this.vuiStateListeners.remove(iUnityVuiStateListener);
        }
    }

    public void updateListIndexState() {
        if (this.vuiStateListeners != null) {
            for (int i = 0; i < this.vuiStateListeners.size(); i++) {
                IUnityVuiStateListener iUnityVuiStateListener = this.vuiStateListeners.get(i);
                if (iUnityVuiStateListener != null) {
                    if (isInSpeech()) {
                        iUnityVuiStateListener.onShowVuiListIndex();
                    } else {
                        iUnityVuiStateListener.onHideVuiListIndex();
                    }
                }
            }
        }
    }

    private void checkScrollSubViewIsInsight(String str, JSONArray jSONArray) {
        if (str == null || jSONArray == null || VuiUtils.cannotUpload()) {
            return;
        }
        try {
            IUnityVuiSceneListener iUnityVuiSceneListener = (IUnityVuiSceneListener) VuiSceneManager.instance().getVuiSceneListener(str);
            if (iUnityVuiSceneListener == null) {
                return;
            }
            if (jSONArray != null || jSONArray.length() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("scrollViewId");
                        JSONArray jSONArray2 = new JSONArray();
                        if (jSONObject.has(optString)) {
                            jSONArray2 = jSONObject.getJSONArray(optString);
                        }
                        jSONArray2.put(optJSONObject.optString("elementId"));
                        jSONObject.put(optString, jSONArray2);
                    }
                }
                LogUtils.i(TAG, "checkScrollSubViewIsInsight:" + jSONObject.toString());
                if (jSONObject.length() > 0) {
                    iUnityVuiSceneListener.checkSubElementsIsInsight(jSONObject.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onVuiQuery(String str, String str2) {
        IUnityVuiSceneListener iUnityVuiSceneListener;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString(VuiConstants.SCENE_ID, "");
            if (VuiUtils.is3DApp(VuiUtils.getPackageNameFromSceneId(optString))) {
                if ("vui.scrollview.childview.visible".equals(str)) {
                    checkScrollSubViewIsInsight(optString, jSONObject.optJSONArray(VuiConstants.SCENE_ELEMENTS));
                } else if ("vui.element.scroll.state".equals(str)) {
                    String optString2 = jSONObject.optString("elementId", "");
                    String optString3 = jSONObject.optString(VuiConstants.EVENT_VALUE_DIRECTION, "");
                    VuiSceneInfo sceneInfo = VuiSceneManager.instance().getSceneInfo(optString);
                    if (sceneInfo != null) {
                        List<String> subSceneList = sceneInfo.getSubSceneList();
                        LogUtils.logInfo(TAG, "subSceneIds:" + subSceneList);
                        if (subSceneList != null) {
                            for (int i = 0; i < subSceneList.size(); i++) {
                                String str3 = subSceneList.get(i);
                                if (((VuiSceneBuildCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType())).getVuiElementById(str3, optString2) != null && (iUnityVuiSceneListener = (IUnityVuiSceneListener) VuiSceneManager.instance().getVuiSceneListener(str3)) != null) {
                                    this.querySceneIdMap.put(str3, optString);
                                    iUnityVuiSceneListener.getScrollViewState(optString2, optString3);
                                    return;
                                }
                            }
                        }
                    }
                    IUnityVuiSceneListener iUnityVuiSceneListener2 = (IUnityVuiSceneListener) VuiSceneManager.instance().getVuiSceneListener(optString);
                    if (iUnityVuiSceneListener2 != null) {
                        iUnityVuiSceneListener2.getScrollViewState(optString2, optString3);
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void onVuiQueryCallBack(String str, String str2, String str3) {
        LogUtils.d(TAG, "onVuiQueryCallBack:" + str + ",event:" + str2);
        String sceneUnqiueId = getSceneUnqiueId(str);
        if (this.querySceneIdMap.containsKey(sceneUnqiueId)) {
            this.querySceneIdMap.remove(sceneUnqiueId);
            sceneUnqiueId = this.querySceneIdMap.get(sceneUnqiueId);
        }
        if (getJSONType(str3)) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                jSONObject.put(VuiConstants.SCENE_ID, sceneUnqiueId);
                VuiSceneManager.instance().onVuiQueryCallBack(sceneUnqiueId, str2, jSONObject.toString());
                return;
            } catch (JSONException unused) {
                return;
            }
        }
        VuiSceneManager.instance().onVuiQueryCallBack(sceneUnqiueId, str2, str3);
    }

    /* loaded from: classes2.dex */
    class UpdateElementAttrRun implements Runnable {
        private String sceneId;
        private List<View> updateViews;

        UpdateElementAttrRun() {
        }

        public String getSceneId() {
            return this.sceneId;
        }

        public void setSceneId(String str) {
            this.sceneId = str;
        }

        public List<View> getUpdateViews() {
            return this.updateViews;
        }

        public void setUpdateViews(List<View> list) {
            this.updateViews = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            VuiEngineImpl.this.mHandler.removeCallbacks(VuiEngineImpl.this.mUpdateElementAttrRun);
            VuiEngineImpl.this.mUpdateElementAttrRun = null;
            String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(this.sceneId);
            if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                LogUtils.logDebug(VuiEngineImpl.TAG, "updateSceneElementAttribute:" + this.sceneId);
                VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, TaskDispatcher.TaskType.UPDATEATTRIBUTE, this.updateViews));
            }
        }
    }

    /* loaded from: classes2.dex */
    class UpdateSceneRun implements Runnable {
        private String sceneId;
        private List<View> updateViews;

        UpdateSceneRun() {
        }

        public String getSceneId() {
            return this.sceneId;
        }

        public void setSceneId(String str) {
            this.sceneId = str;
        }

        public List<View> getUpdateViews() {
            return this.updateViews;
        }

        public void setUpdateViews(List<View> list) {
            this.updateViews = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            VuiEngineImpl.this.mHandler.removeCallbacks(VuiEngineImpl.this.mUpdateSceneRun);
            VuiEngineImpl.this.mUpdateSceneRun = null;
            String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(this.sceneId);
            if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                LogUtils.logDebug(VuiEngineImpl.TAG, "updateScene:" + this.sceneId);
                VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, TaskDispatcher.TaskType.UPDATE, this.updateViews));
            }
        }
    }

    public void updateRecyclerViewItemView(String str, List<View> list, RecyclerView recyclerView) {
        if (VuiUtils.cannotUpload() || list == null || TextUtils.isEmpty(str)) {
            return;
        }
        String sceneUnqiueId = getSceneUnqiueId(str);
        if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
            LogUtils.logInfo(TAG, "updateRecyclerViewItemView:" + str);
            this.taskStructure.dispatchTask(structureViewWrapper(sceneUnqiueId, TaskDispatcher.TaskType.UPDATERECYCLEVIEWITEM, list, recyclerView));
        }
    }

    public void updateScene(final String str, final View view) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.9
                @Override // java.lang.Runnable
                public void run() {
                    if (VuiUtils.cannotUpload() || view == null || TextUtils.isEmpty(str)) {
                        return;
                    }
                    LogUtils.logDebug(VuiEngineImpl.TAG, "updateScene");
                    if (VuiEngineImpl.this.mUpdateSceneRun != null) {
                        if (str.equals(VuiEngineImpl.this.mUpdateSceneRun.getSceneId())) {
                            VuiEngineImpl.this.mHandler.removeCallbacks(VuiEngineImpl.this.mUpdateSceneRun);
                            HashSet hashSet = new HashSet(VuiEngineImpl.this.mUpdateSceneRun.getUpdateViews());
                            hashSet.add(view);
                            VuiEngineImpl.this.mUpdateSceneRun.setUpdateViews(new ArrayList(hashSet));
                            VuiEngineImpl.this.mHandler.postDelayed(VuiEngineImpl.this.mUpdateSceneRun, 50L);
                            return;
                        }
                        VuiEngineImpl.this.mUpdateSceneRun.run();
                        VuiEngineImpl vuiEngineImpl = VuiEngineImpl.this;
                        vuiEngineImpl.mUpdateSceneRun = new UpdateSceneRun();
                        VuiEngineImpl.this.mUpdateSceneRun.setSceneId(str);
                        VuiEngineImpl.this.mUpdateSceneRun.setUpdateViews(Arrays.asList(view));
                        VuiEngineImpl.this.mHandler.postDelayed(VuiEngineImpl.this.mUpdateSceneRun, 50L);
                        return;
                    }
                    VuiEngineImpl vuiEngineImpl2 = VuiEngineImpl.this;
                    vuiEngineImpl2.mUpdateSceneRun = new UpdateSceneRun();
                    VuiEngineImpl.this.mUpdateSceneRun.setSceneId(str);
                    VuiEngineImpl.this.mUpdateSceneRun.setUpdateViews(Arrays.asList(view));
                    VuiEngineImpl.this.mHandler.postDelayed(VuiEngineImpl.this.mUpdateSceneRun, 50L);
                }
            });
        }
    }

    public void updateScene(final String str, final List<View> list) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.10
                @Override // java.lang.Runnable
                public void run() {
                    if (VuiUtils.cannotUpload() || list == null || TextUtils.isEmpty(str)) {
                        return;
                    }
                    LogUtils.logDebug(VuiEngineImpl.TAG, "updateScene");
                    try {
                        String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                        if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                            LogUtils.logDebug(VuiEngineImpl.TAG, "updateScene:" + str);
                            VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, TaskDispatcher.TaskType.UPDATE, (List<Integer>) null, (bic) null, list));
                        }
                    } catch (Exception e) {
                        LogUtils.e(VuiEngineImpl.TAG, e.fillInStackTrace());
                    }
                }
            });
        }
    }

    public void updateScene(final String str, final List<View> list, final List<Integer> list2, final bic bicVar) {
        if (VuiUtils.cannotUpload() || list == null || str == null) {
            return;
        }
        if (list.size() == 1) {
            updateScene(str, list.get(0), list2, bicVar);
        } else {
            this.mHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.11
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                        if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                            LogUtils.logDebug(VuiEngineImpl.TAG, "updateScene:" + str);
                            VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, TaskDispatcher.TaskType.UPDATE, list2, bicVar, list));
                        }
                    } catch (Exception e) {
                        LogUtils.e(VuiEngineImpl.TAG, e.fillInStackTrace());
                    }
                }
            });
        }
    }

    public void updateScene(final String str, final View view, final List<Integer> list, final bic bicVar) {
        if (VuiUtils.cannotUpload() || view == null || str == null) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.12
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (VuiEngineImpl.this.mainThreadSceneList.contains(str) && (view instanceof RecyclerView)) {
                        VuiEngineImpl.this.mMainHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.12.1
                            @Override // java.lang.Runnable
                            public void run() {
                                String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                                if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                                    LogUtils.logDebug(VuiEngineImpl.TAG, "updateScene:" + str);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(view);
                                    VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, TaskDispatcher.TaskType.UPDATE, list, bicVar, arrayList));
                                }
                            }
                        });
                    } else {
                        String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                        if (!VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                            return;
                        }
                        LogUtils.logDebug(VuiEngineImpl.TAG, "updateScene:" + str);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view);
                        VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, TaskDispatcher.TaskType.UPDATE, list, bicVar, arrayList));
                    }
                } catch (Exception e) {
                    LogUtils.e(VuiEngineImpl.TAG, e.fillInStackTrace());
                }
            }
        });
    }

    public void handleNewRootviewToScene(final String str, final List<View> list, final bik bikVar) {
        Handler handler;
        if (VuiUtils.cannotUpload() || (handler = this.mHandler) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.13
            @Override // java.lang.Runnable
            public void run() {
                String str2;
                if (list == null || (str2 = str) == null) {
                    return;
                }
                String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str2);
                if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                    LogUtils.logDebug(VuiEngineImpl.TAG, "handleNewRootviewToScene:" + str);
                    VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, bikVar, TaskDispatcher.TaskType.ADD, (List<View>) list, true));
                }
            }
        });
    }

    public void removeOtherRootViewFromScene(final String str, final List<View> list) {
        Handler handler;
        if (VuiUtils.cannotUpload() || (handler = this.mHandler) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.14
            @Override // java.lang.Runnable
            public void run() {
                String str2 = str;
                if (str2 == null) {
                    return;
                }
                String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str2);
                if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                    LogUtils.logDebug(VuiEngineImpl.TAG, "removeOtherRootViewFromScene:" + str);
                    VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, TaskDispatcher.TaskType.REMOVE, list));
                }
            }
        });
    }

    public void removeOtherRootViewFromScene(final String str) {
        Handler handler;
        if (VuiUtils.cannotUpload() || (handler = this.mHandler) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.15
            @Override // java.lang.Runnable
            public void run() {
                String str2 = str;
                if (str2 == null) {
                    return;
                }
                String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str2);
                if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                    LogUtils.logDebug(VuiEngineImpl.TAG, "removeOtherRootViewFromScene:" + str);
                    VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, TaskDispatcher.TaskType.REMOVE, null));
                }
            }
        });
    }

    public void addSceneElementGroup(final View view, final String str, final bik bikVar, final bie bieVar) {
        Handler handler;
        if (VuiUtils.cannotUpload() || view == null || str == null || (handler = this.mHandler) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.16
            @Override // java.lang.Runnable
            public void run() {
                String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                    LogUtils.logDebug(VuiEngineImpl.TAG, "addSceneElementGroup:" + str);
                    VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, (String) null, bikVar, bieVar, view));
                }
            }
        });
    }

    public void addSceneElement(final View view, final String str, final String str2) {
        Handler handler;
        if (VuiUtils.cannotUpload() || view == null || str2 == null || (handler = this.mHandler) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.17
            @Override // java.lang.Runnable
            public void run() {
                String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str2);
                if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                    LogUtils.logDebug(VuiEngineImpl.TAG, "addSceneElement:" + str2);
                    VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, str, (bik) null, (bie) null, view));
                }
            }
        });
    }

    public void removeSceneElementGroup(final String str, final String str2, final bie bieVar) {
        Handler handler;
        if (VuiUtils.cannotUpload() || str2 == null || str == null || (handler = this.mHandler) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.18
            @Override // java.lang.Runnable
            public void run() {
                String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str2);
                if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                    LogUtils.logDebug(VuiEngineImpl.TAG, "removeSceneElementGroup:" + str2);
                    VuiEngineImpl.this.taskStructure.dispatchTask(VuiEngineImpl.this.structureViewWrapper(sceneUnqiueId, TaskDispatcher.TaskType.REMOVE, str, bieVar));
                }
            }
        });
    }

    public void removeVuiElement(final String str, final String str2) {
        if (VuiUtils.cannotUpload() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.19
            @Override // java.lang.Runnable
            public void run() {
                if (VuiSceneManager.instance().canUpdateScene(VuiEngineImpl.this.getSceneUnqiueId(str))) {
                    LogUtils.logInfo(VuiEngineImpl.TAG, "removeVuiElement:" + str + ",elementId:" + str2);
                    VuiSceneManager instance = VuiSceneManager.instance();
                    instance.sendSceneData(3, true, str + ListSignBean.COLLECTID_SUFFIX + str2);
                }
            }
        });
    }

    public void dispatchVuiEvent(final String str, final String str2) {
        Handler handler = this.mDispatherHandler;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.20
            @Override // java.lang.Runnable
            public void run() {
                if (VuiUtils.canUseVuiFeature()) {
                    LogUtils.logDebug(VuiEngineImpl.TAG, "dispatchVuiEvent:" + str);
                    if (str.equals(VuiConstants.VUI_FEATURE_DISABLE)) {
                        VuiUtils.disableVuiFeature();
                        VuiSceneManager.instance().setFeatureState(false);
                        LogUtils.logInfo(VuiEngineImpl.TAG, "disableVuiFeature:" + VuiEngineImpl.this.vuiStateListeners.size());
                        if (VuiEngineImpl.this.isInSpeech()) {
                            if (VuiEngineImpl.this.vuiStateListeners != null) {
                                for (int i = 0; i < VuiEngineImpl.this.vuiStateListeners.size(); i++) {
                                    IUnityVuiStateListener iUnityVuiStateListener = (IUnityVuiStateListener) VuiEngineImpl.this.vuiStateListeners.get(i);
                                    if (iUnityVuiStateListener != null) {
                                        iUnityVuiStateListener.onHideVuiListIndex();
                                    }
                                }
                            }
                            VuiEngineImpl.this.onVuiStateChanged();
                        }
                    } else if (str.equals(VuiConstants.VUI_FEATURE_ENABLE)) {
                        VuiUtils.enableVuiFeature();
                        VuiSceneManager.instance().setFeatureState(true);
                        LogUtils.logInfo(VuiEngineImpl.TAG, "enableVuiFeature:");
                    } else if (str.equals(VuiConstants.DM_START_EVENT)) {
                        VuiSceneManager.instance().setInSpeech(true);
                        VuiEngineImpl.this.sendVuiStateChangedEvent(true);
                    } else if (str.equals(VuiConstants.DM_END_EVENT)) {
                        VuiSceneManager.instance().setInSpeech(false);
                        VuiEngineImpl.this.sendVuiStateChangedEvent(false);
                    } else if (str.equals(VuiConstants.REBUILD_EVENT) || str.equals(VuiConstants.SCENE_REBUILD_EVENT)) {
                        if (VuiUtils.cannotUpload() || TextUtils.isEmpty(str2) || !VuiUtils.getPackageNameFromSceneId(str2).equals(VuiEngineImpl.this.mPackageName)) {
                            return;
                        }
                        List<bin> cache = ((VuiSceneBuildCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType())).getCache(str2);
                        if (cache != null && !cache.isEmpty()) {
                            VuiScene newVuiScene = VuiEngineImpl.this.getNewVuiScene(str2, System.currentTimeMillis());
                            newVuiScene.setElements(cache);
                            VuiSceneCacheFactory.instance().removeAllCache(str2);
                            VuiSceneManager.instance().sendSceneData(0, true, newVuiScene);
                            return;
                        }
                        bie vuiSceneListener = VuiSceneManager.instance().getVuiSceneListener(str2);
                        if (vuiSceneListener != null) {
                            vuiSceneListener.onBuildScene();
                        }
                    } else if (!VuiUtils.cannotUpload() && !TextUtils.isEmpty(str2)) {
                        try {
                            VuiEngineImpl.this.eventDispatcher.dispatch(str, str2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVuiStateChanged() {
        final bie vuiSceneListener;
        final bie vuiSceneListener2;
        try {
            List<String> list = this.mLFEnterSceneStack;
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                if (!TextUtils.isEmpty(str) && (vuiSceneListener2 = VuiSceneManager.instance().getVuiSceneListener(str)) != null) {
                    this.mainHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.21
                        @Override // java.lang.Runnable
                        public void run() {
                            vuiSceneListener2.onVuiStateChanged();
                        }
                    });
                }
            }
            List<String> list2 = this.mRFEnterSceneStack;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                String str2 = list2.get(i2);
                if (!TextUtils.isEmpty(str2) && (vuiSceneListener = VuiSceneManager.instance().getVuiSceneListener(str2)) != null) {
                    this.mainHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.22
                        @Override // java.lang.Runnable
                        public void run() {
                            vuiSceneListener.onVuiStateChanged();
                        }
                    });
                }
            }
        } catch (Exception unused) {
            LogUtils.e(TAG, "sendVuiStateChangedEvent error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendVuiStateChangedEvent(boolean z) {
        if (VuiUtils.cannotUpload()) {
            return;
        }
        updateListIndexState();
        onVuiStateChanged();
    }

    public String getElementState(String str, String str2) {
        if (VuiUtils.cannotUpload()) {
            return null;
        }
        LogUtils.logDebug(TAG, "getElementState:" + str + ",elementId:" + str2);
        if (getJSONType(str2)) {
            return VuiSceneManager.instance().checkScrollSubViewIsVisible(str, str2);
        }
        return VuiSceneManager.instance().getElementState(str, str2);
    }

    public boolean getJSONType(String str) {
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            if (trim.startsWith("{") && trim.endsWith("}")) {
                return true;
            }
            if (trim.startsWith("[") && trim.endsWith("]")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VuiScene getNewVuiScene(String str, long j) {
        return new VuiScene.Builder().sceneId(str).appVersion(this.mPackageVersion).packageName(this.mPackageName).timestamp(j).build();
    }

    public void vuiFeedback(View view, VuiFeedback vuiFeedback) {
        if (VuiUtils.cannotUpload()) {
            return;
        }
        VuiSceneManager.instance().vuiFeedBack(view, vuiFeedback);
    }

    public void vuiFeedback(String str, VuiFeedback vuiFeedback) {
        if (VuiUtils.cannotUpload()) {
            return;
        }
        VuiSceneManager.instance().vuiFeedBack(str, vuiFeedback);
    }

    public void subscribe(final String str) {
        Handler handler;
        if (VuiUtils.canUseVuiFeature() && (handler = this.mHandler) != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.23
                @Override // java.lang.Runnable
                public void run() {
                    LogUtils.logInfo(VuiEngineImpl.TAG, "subscribe:" + str);
                    VuiSceneManager.instance().subscribe(str);
                }
            });
        }
    }

    public void subscribeVuiFeature() {
        Handler handler;
        if (VuiUtils.canUseVuiFeature() && (handler = this.mHandler) != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.24
                @Override // java.lang.Runnable
                public void run() {
                    LogUtils.logInfo(VuiEngineImpl.TAG, "subscribeVuiFeature");
                    VuiSceneManager.instance().subscribeVuiFeature();
                }
            });
        }
    }

    public void unSubscribeVuiFeature() {
        Handler handler;
        if (VuiUtils.canUseVuiFeature() && (handler = this.mHandler) != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.25
                @Override // java.lang.Runnable
                public void run() {
                    LogUtils.logInfo(VuiEngineImpl.TAG, "subscribeVuiFeature");
                    VuiSceneManager.instance().unSubscribeVuiFeature();
                }
            });
        }
    }

    public void unSubscribe() {
        Handler handler;
        if (VuiUtils.canUseVuiFeature() && (handler = this.mHandler) != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.26
                @Override // java.lang.Runnable
                public void run() {
                    LogUtils.logInfo(VuiEngineImpl.TAG, "unSubscribe");
                    VuiSceneManager.instance().unSubscribe();
                }
            });
        }
    }

    public void addVuiSceneListener(String str, View view, bie bieVar, bib bibVar, boolean z) {
        addVuiSceneListener(str, view, bieVar, bibVar, z, false);
    }

    public void addDupVuiSceneListener(String str, View view, bie bieVar, bib bibVar, boolean z) {
        addVuiSceneListener(str, view, bieVar, bibVar, z, true);
    }

    public void addVuiSceneListener(final String str, final View view, final bie bieVar, final bib bibVar, final boolean z, final boolean z2) {
        Handler handler;
        if (!VuiUtils.canUseVuiFeature() || (handler = this.mHandler) == null || str == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.27
            @Override // java.lang.Runnable
            public void run() {
                LogUtils.logDebug(VuiEngineImpl.TAG, "addVuiSceneListener :" + str);
                String str2 = str;
                if (z2) {
                    str2 = bieVar.toString() + "-" + str;
                }
                VuiSceneManager.instance().addVuiSceneListener(VuiEngineImpl.this.getSceneUnqiueId(str2), view, bieVar, bibVar, z);
            }
        });
    }

    public void removeDupVuiSceneListener(String str, bie bieVar, boolean z) {
        if (bieVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        removeVuiSceneListener(bieVar.toString() + "-" + str, bieVar, z);
    }

    public void removeVuiSceneListener(final String str, final bie bieVar, final boolean z) {
        Handler handler;
        if (VuiUtils.canUseVuiFeature() && (handler = this.mHandler) != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.28
                @Override // java.lang.Runnable
                public void run() {
                    String str2 = str;
                    if (str2 == null) {
                        return;
                    }
                    String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str2);
                    VuiSceneInfo sceneInfo = VuiSceneManager.instance().getSceneInfo(sceneUnqiueId);
                    boolean z2 = false;
                    if (sceneInfo != null && sceneInfo.isWholeScene()) {
                        z2 = true;
                    }
                    if (bieVar != null && sceneInfo != null && sceneInfo.getListener() != null && !bieVar.equals(sceneInfo.getListener())) {
                        LogUtils.w(VuiEngineImpl.TAG, "要销毁的场景和目前持有的场景数据不一致");
                        return;
                    }
                    if (!VuiEngineImpl.mActiveSceneIds.containsValue(sceneUnqiueId)) {
                        if (VuiEngineImpl.this.mLFEnterSceneStack.contains(sceneUnqiueId)) {
                            VuiEngineImpl.this.mLFEnterSceneStack.remove(sceneUnqiueId);
                        } else if (VuiEngineImpl.this.mRFEnterSceneStack.contains(sceneUnqiueId)) {
                            VuiEngineImpl.this.mRFEnterSceneStack.remove(sceneUnqiueId);
                        } else if (VuiEngineImpl.mRightPopPanelStack.contains(sceneUnqiueId)) {
                            VuiEngineImpl.mRightPopPanelStack.remove(sceneUnqiueId);
                            VuiEngineImpl.this.exitScene(str, VuiConstants.SCREEN_DISPLAY_RF, true, bieVar);
                        } else if (VuiEngineImpl.mLeftPopPanelStack.contains(sceneUnqiueId)) {
                            VuiEngineImpl.mLeftPopPanelStack.remove(sceneUnqiueId);
                            VuiEngineImpl.this.exitScene(str, VuiConstants.SCREEN_DISPLAY_LF, true, bieVar);
                        }
                    } else {
                        VuiEngineImpl.this.exitScene(str, sceneInfo != null ? sceneInfo.isWholeScene() : true);
                    }
                    LogUtils.logDebug(VuiEngineImpl.TAG, "removeVuiSceneListener :" + str + ",isupload:" + z2 + ",keepCache:" + z);
                    VuiEngineImpl.this.taskStructure.removeTask(sceneUnqiueId);
                    VuiSceneManager.instance().removeVuiSceneListener(sceneUnqiueId, z2, z, bieVar);
                }
            });
        }
    }

    public void setVuiElementTag(View view, String str) {
        if (!VuiUtils.canUseVuiFeature() || view == null) {
            return;
        }
        String str2 = "4657_" + str;
        view.setTag(str2);
        if (view instanceof bhz) {
            ((bhz) view).setVuiElementId(str2);
        }
    }

    public String getVuiElementTag(View view) {
        if (!VuiUtils.canUseVuiFeature() || view == null) {
            return null;
        }
        String str = (String) view.getTag();
        if (str.startsWith("4657")) {
            return str;
        }
        return null;
    }

    public void setVuiElementUnSupportTag(View view, boolean z) {
        if (!VuiUtils.canUseVuiFeature() || view == null) {
            return;
        }
        view.setTag(R.id.vuiElementUnSupport, Boolean.valueOf(z));
    }

    public void setVuiCustomDisableControlTag(View view) {
        if (!VuiUtils.canUseVuiFeature() || view == null) {
            return;
        }
        view.setTag(R.id.customDisableControl, true);
    }

    public void setHasFeedBackTxtByViewDisable(View view, String str) {
        if (!VuiUtils.canUseVuiFeature() || view == null) {
            return;
        }
        view.setTag(R.id.customDisableFeedbackTTS, str);
    }

    public void setVuiCustomDisableFeedbackTag(View view) {
        if (!VuiUtils.canUseVuiFeature() || view == null) {
            return;
        }
        view.setTag(R.id.customDisableFeedback, true);
    }

    public void setVuiElementDefaultAction(View view, String str, Object obj) {
        if (!VuiUtils.canUseVuiFeature() || view == null || str == null || obj == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            VuiUtils.generateElementValueJSON(jSONObject, str, obj);
            view.setTag(R.id.vuiElementDefaultAction, jSONObject);
        } catch (Exception e) {
            LogUtils.e(TAG, e.fillInStackTrace());
        }
    }

    public void setVuiStatefulButtonClick(View view) {
        if (!VuiUtils.canUseVuiFeature() || view == null) {
            return;
        }
        view.setTag(R.id.vuiStatefulButtonClick, true);
    }

    public void disableChildVuiAttrWhenInvisible(View view) {
        if (!VuiUtils.canUseVuiFeature() || view == null) {
            return;
        }
        view.setTag(R.id.disableChildVuiAttrsWhenInvisible, true);
    }

    public void setVuiLabelUnSupportText(View... viewArr) {
        if (!VuiUtils.canUseVuiFeature() || viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            view.setTag(R.id.vuiLabelUnSupportText, true);
        }
    }

    public void setVuiElementVisibleTag(View view, boolean z) {
        if (!VuiUtils.canUseVuiFeature() || view == null) {
            return;
        }
        view.setTag(R.id.vuiElementVisible, Boolean.valueOf(z));
    }

    public Boolean getVuiElementVisibleTag(View view) {
        Boolean bool;
        if (!VuiUtils.canUseVuiFeature() || view == null || (bool = (Boolean) view.getTag(R.id.vuiElementVisible)) == null) {
            return null;
        }
        return bool;
    }

    public void disableVuiFeature() {
        LogUtils.logInfo(TAG, "user disable feature");
        VuiUtils.userSetFeatureState(true);
    }

    public void enableVuiFeature() {
        LogUtils.logInfo(TAG, "user enable feature");
        VuiUtils.userSetFeatureState(false);
    }

    public boolean isVuiFeatureDisabled() {
        return VuiUtils.cannotUpload();
    }

    public boolean isInSpeech() {
        return VuiSceneManager.instance().isInSpeech();
    }

    public String getVuiElementId(String str, int i, String str2) {
        if (str != null) {
            str2 = str + "_" + str2;
        }
        if (i != -1) {
            return str2 + "_" + i;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<TaskWrapper> structureViewWrapper(String str, TaskDispatcher.TaskType taskType, String str2, bie bieVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TaskWrapper((View) null, str, taskType, bieVar, str2));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<TaskWrapper> structureViewWrapper(String str, bik bikVar, TaskDispatcher.TaskType taskType, List<View> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TaskWrapper(str, bikVar, taskType, list, z));
        return arrayList;
    }

    private List<TaskWrapper> structureViewWrapper(String str, TaskDispatcher.TaskType taskType, List<Integer> list, bic bicVar, List<String> list2, List<View> list3, boolean z, ISceneCallbackHandler iSceneCallbackHandler) {
        ArrayList arrayList = new ArrayList();
        if (list3 == null || list3.size() == 0) {
            return arrayList;
        }
        if (list3.size() == 1) {
            arrayList.add(new TaskWrapper(list3.get(0), str, list3.get(0).getId(), taskType, list, bicVar, list2, z, iSceneCallbackHandler));
        } else {
            arrayList.add(new TaskWrapper(list3, str, taskType, list, bicVar, list2, z, iSceneCallbackHandler));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<TaskWrapper> structureViewWrapper(String str, TaskDispatcher.TaskType taskType, List<Integer> list, bic bicVar, List<String> list2, List<View> list3, boolean z, ISceneCallbackHandler iSceneCallbackHandler, String str2, bie bieVar) {
        ArrayList arrayList = new ArrayList();
        if (list3 == null || list3.size() == 0) {
            return arrayList;
        }
        if (list3.size() == 1) {
            arrayList.add(new TaskWrapper(list3.get(0), str, list3.get(0).getId(), taskType, list, bicVar, list2, z, iSceneCallbackHandler, str2, bieVar));
        } else {
            arrayList.add(new TaskWrapper(list3, str, taskType, list, bicVar, list2, z, iSceneCallbackHandler, str2, bieVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<TaskWrapper> structureViewWrapper(String str, TaskDispatcher.TaskType taskType, List<Integer> list, bic bicVar, List<View> list2) {
        ArrayList arrayList = new ArrayList();
        if (list2 == null || list2.isEmpty()) {
            return arrayList;
        }
        if (list2.size() == 1) {
            View view = list2.get(0);
            if (view.getId() != -1) {
                arrayList.add(new TaskWrapper(view, str, view.getId(), taskType, list, bicVar));
            } else {
                arrayList.add(new TaskWrapper(view, str, taskType, list, bicVar));
            }
        } else {
            arrayList.add(new TaskWrapper(list2, str, taskType, list, bicVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<TaskWrapper> structureViewWrapper(String str, TaskDispatcher.TaskType taskType, List<View> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() == 1) {
            View view = list.get(0);
            if (view.getId() != -1) {
                arrayList.add(new TaskWrapper(view, view.getId(), str, taskType));
            } else {
                arrayList.add(new TaskWrapper(str, taskType, view));
            }
        } else {
            arrayList.add(new TaskWrapper(str, taskType, list));
        }
        return arrayList;
    }

    private List<TaskWrapper> structureViewWrapper(String str, TaskDispatcher.TaskType taskType, List<View> list, RecyclerView recyclerView) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() == 1) {
            View view = list.get(0);
            if (view.getId() != -1) {
                arrayList.add(new TaskWrapper(view, view.getId(), str, taskType, recyclerView));
            } else {
                arrayList.add(new TaskWrapper(str, taskType, view, recyclerView));
            }
        } else {
            arrayList.add(new TaskWrapper(str, taskType, list, recyclerView));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<TaskWrapper> structureViewWrapper(String str, String str2, bik bikVar, bie bieVar, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        for (View view : viewArr) {
            if (view != null) {
                if (bikVar == null) {
                    arrayList.add(new TaskWrapper(view, str, view.getId(), TaskDispatcher.TaskType.ADD, str2));
                } else {
                    arrayList.add(new TaskWrapper(view, str, view.getId(), TaskDispatcher.TaskType.ADD, bikVar, bieVar));
                }
            }
        }
        return arrayList;
    }

    public VuiScene createVuiScene(String str, long j) {
        return new VuiScene.Builder().sceneId(getSceneUnqiueId(str)).appVersion(this.mPackageVersion).packageName(this.mPackageName).timestamp(j).build();
    }

    public void setLoglevel(int i) {
        LogUtils.setLogLevel(i);
    }

    public void addVuiEventListener(final String str, final IVuiEventListener iVuiEventListener) {
        Handler handler;
        if (!VuiUtils.canUseVuiFeature() || (handler = this.mHandler) == null || str == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.29
            @Override // java.lang.Runnable
            public void run() {
                LogUtils.logDebug(VuiEngineImpl.TAG, "addVuiEventListener :" + str);
                VuiSceneManager.instance().addVuiEventListener(VuiEngineImpl.this.getSceneUnqiueId(str), iVuiEventListener);
            }
        });
    }

    public void disableViewVuiMode() {
        LogUtils.logInfo(TAG, "user disable view's vui mode");
        VuiUtils.userDisableViewMode();
    }

    public void setExecuteVirtualTag(View view, String str) {
        if (!VuiUtils.canUseVuiFeature() || view == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            view.setTag(R.id.executeVirtualId, VuiConstants.VIRTUAL_LIST_ID);
            return;
        }
        int i = R.id.executeVirtualId;
        view.setTag(i, "10000_" + str);
    }

    public void setVirtualResourceNameTag(View view, String str) {
        if (!VuiUtils.canUseVuiFeature() || view == null || TextUtils.isEmpty(str)) {
            return;
        }
        view.setTag(R.id.virtualResourceName, str);
    }

    public void setCustomDoActionTag(View view) {
        if (!VuiUtils.canUseVuiFeature() || view == null) {
            return;
        }
        view.setTag(R.id.customDoAction, true);
    }

    public void setProcessName(String str) {
        VuiSceneManager.instance().setProcessName(str);
    }

    public void init(String str) {
        subscribe(this.mPackageName + "." + str);
    }

    public void addVuiSceneListener(String str, bie bieVar) {
        addVuiSceneListener(str, null, bieVar, null, true);
    }

    public void updateDisplayLocation(final String str, final String str2) {
        if (VuiUtils.cannotUpload()) {
            return;
        }
        LogUtils.i(TAG, "updateDisplayLocation");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.30
            @Override // java.lang.Runnable
            public void run() {
                String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                VuiDisplayLocationInfoCache vuiDisplayLocationInfoCache = (VuiDisplayLocationInfoCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.DISPLAY_LOCATION.getType());
                vuiDisplayLocationInfoCache.setCache(sceneUnqiueId, str2);
                if (VuiEngineImpl.this.mLFEnterSceneStack.contains(sceneUnqiueId) && VuiConstants.SCREEN_DISPLAY_RF.equals(str2)) {
                    VuiEngineImpl.this.enterScene(str, str2, true);
                }
                if (VuiEngineImpl.this.mRFEnterSceneStack.contains(sceneUnqiueId) && VuiConstants.SCREEN_DISPLAY_LF.equals(str2)) {
                    VuiEngineImpl.this.enterScene(str, str2, true);
                }
                if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                    VuiScene newVuiScene = VuiEngineImpl.this.getNewVuiScene(sceneUnqiueId, System.currentTimeMillis());
                    newVuiScene.setDisplayLocation(str2);
                    LogUtils.i(VuiEngineImpl.TAG, "updateDisplayLocation ===    " + str2);
                    VuiSceneManager.instance().sendSceneData(5, false, newVuiScene);
                    return;
                }
                vuiDisplayLocationInfoCache.removeDisplayCache(sceneUnqiueId);
            }
        });
    }

    public void setBuildElements(String str) {
        if (VuiUtils.cannotUpload()) {
            return;
        }
        try {
            VuiScene stringConvertToVuiScene = VuiUtils.stringConvertToVuiScene(str);
            String sceneId = stringConvertToVuiScene.getSceneId();
            List<bin> elements = stringConvertToVuiScene.getElements();
            if (elements == null) {
                elements = new ArrayList<>();
            }
            if (TextUtils.isEmpty(sceneId)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean("isMainScene");
            JSONArray jSONArray = jSONObject.getJSONArray("subSceneIds");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(getSceneUnqiueId(jSONArray.getString(i)));
            }
            LogUtils.logInfo(TAG, "sceneId:" + sceneId + "isMainScene:" + z + ",subSceneIds:" + arrayList);
            setBuildElements(stringConvertToVuiScene.getSceneId(), elements, z, arrayList);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setBuildElements(String str, List<bin> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        setBuildElements(str, list, true, null);
    }

    public void setBuildElements(final String str, final List<bin> list, final boolean z, final List<String> list2) {
        if (VuiUtils.cannotUpload() || TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.31
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                    int vuiSceneState = VuiSceneManager.instance().getVuiSceneState(sceneUnqiueId);
                    if (vuiSceneState == VuiSceneState.INIT.getState()) {
                        LogUtils.e(VuiEngineImpl.TAG, str + "场景数据的创建必须在场景被激活后");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    VuiScene newVuiScene = VuiEngineImpl.this.getNewVuiScene(sceneUnqiueId, currentTimeMillis);
                    newVuiScene.setElements(list);
                    VuiSceneBuildCache vuiSceneBuildCache = (VuiSceneBuildCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                    if (vuiSceneBuildCache != null) {
                        vuiSceneBuildCache.setCache(sceneUnqiueId, list);
                        vuiSceneBuildCache.setDisplayLocation(sceneUnqiueId, VuiUtils.getDisplayLocation(newVuiScene.getDisplayLocation()));
                    }
                    VuiSceneInfo sceneInfo = VuiSceneManager.instance().getSceneInfo(sceneUnqiueId);
                    if (sceneInfo != null && !z) {
                        sceneInfo.setBuild(true);
                    }
                    if (z) {
                        if (list2 == null || list2.isEmpty()) {
                            VuiEngineImpl.this.setMainSceneBuildElements(sceneInfo, newVuiScene);
                        } else {
                            for (int i = 0; i < list2.size(); i++) {
                                String str2 = (String) list2.get(i);
                                if (VuiSceneManager.instance().getVuiSceneListener(str2) == null) {
                                    if (sceneInfo != null) {
                                        sceneInfo.updateAddSubSceneNum();
                                    }
                                    VuiSceneManager.instance().initSubSceneInfo(str2, sceneUnqiueId);
                                } else {
                                    if (vuiSceneBuildCache != null) {
                                        List<bin> cache = vuiSceneBuildCache.getCache(str2);
                                        LogUtils.logDebug(VuiEngineImpl.TAG, "buildElement:" + cache);
                                        if (cache != null && !cache.isEmpty()) {
                                            if (sceneInfo != null) {
                                                sceneInfo.updateAddSubSceneNum();
                                            }
                                            list.addAll(cache);
                                        } else {
                                            VuiSceneInfo sceneInfo2 = VuiSceneManager.instance().getSceneInfo(str2);
                                            if (sceneInfo2 != null && sceneInfo != null) {
                                                if (sceneInfo2.isBuild()) {
                                                    sceneInfo.updateAddSubSceneNum();
                                                } else {
                                                    sceneInfo2.getState();
                                                    if (vuiSceneState == VuiSceneState.ACTIVE.getState()) {
                                                        LogUtils.logInfo(VuiEngineImpl.TAG, "build subScene");
                                                        bie listener = sceneInfo2.getListener();
                                                        if (listener != null) {
                                                            listener.onBuildScene();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    VuiSceneManager.instance().setWholeSceneId(str2, sceneUnqiueId);
                                }
                            }
                            VuiSceneManager.instance().addSubSceneIds(sceneUnqiueId, list2);
                            if (sceneInfo != null && sceneInfo.isFull()) {
                                VuiEngineImpl.this.setMainSceneBuildElements(sceneInfo, newVuiScene);
                            }
                        }
                    } else {
                        List<String> wholeSceneId = sceneInfo != null ? sceneInfo.getWholeSceneId() : null;
                        if (wholeSceneId != null) {
                            int size = wholeSceneId.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                String str3 = wholeSceneId.get(i2);
                                VuiSceneInfo sceneInfo3 = VuiSceneManager.instance().getSceneInfo(str3);
                                if (sceneInfo3 != null && sceneInfo3.isFull()) {
                                    VuiScene newVuiScene2 = VuiEngineImpl.this.getNewVuiScene(str3, currentTimeMillis);
                                    newVuiScene2.setElements(list);
                                    sceneInfo3.setBuildComplete(true);
                                    sceneInfo3.setBuild(true);
                                    VuiEngineImpl.this.setSubSceneElementToCache(str3, vuiSceneBuildCache, list);
                                    VuiSceneManager.instance().sendSceneData(1, true, newVuiScene2);
                                } else if (sceneInfo3 != null && !sceneInfo3.isFull()) {
                                    sceneInfo3.updateAddSubSceneNum();
                                    List<bin> subSceneElementToCache = VuiEngineImpl.this.setSubSceneElementToCache(str3, vuiSceneBuildCache, list);
                                    if (sceneInfo3.isFull()) {
                                        sceneInfo3.setBuildComplete(true);
                                        sceneInfo3.setBuild(true);
                                        LogUtils.logInfo(VuiEngineImpl.TAG, str3 + " full scene build completed ");
                                        if (VuiUtils.isActiveSceneId(str3)) {
                                            VuiScene newVuiScene3 = VuiEngineImpl.this.getNewVuiScene(str3, currentTimeMillis);
                                            newVuiScene3.setElements(subSceneElementToCache);
                                            VuiSceneManager.instance().sendSceneData(0, false, newVuiScene3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    VuiSceneManager.instance().setIsWholeScene(sceneUnqiueId, z);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<bin> setSubSceneElementToCache(String str, VuiSceneCache vuiSceneCache, List<bin> list) {
        List<bin> cache = vuiSceneCache.getCache(str);
        if (cache == null) {
            cache = new ArrayList<>();
        }
        if (cache.contains(list.get(0))) {
            return cache;
        }
        List<bin> merge = SceneMergeUtils.merge(cache, list, false);
        vuiSceneCache.setCache(str, merge);
        if (!"user".equals(Build.TYPE) && LogUtils.getLogLevel() <= LogUtils.LOG_DEBUG_LEVEL && !VuiUtils.isActiveSceneId(str)) {
            VuiScene newVuiScene = getNewVuiScene(str, System.currentTimeMillis());
            newVuiScene.setElements(merge);
            LogUtils.logDebug(TAG, "buildScene full_scene_info:" + VuiUtils.vuiSceneConvertToString(newVuiScene));
        }
        return merge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainSceneBuildElements(VuiSceneInfo vuiSceneInfo, VuiScene vuiScene) {
        if (!"user".equals(Build.TYPE) && LogUtils.getLogLevel() <= LogUtils.LOG_DEBUG_LEVEL) {
            LogUtils.logDebug(TAG, "BuildSceneTask full_scene_info" + VuiUtils.vuiSceneConvertToString(vuiScene));
        }
        if (vuiSceneInfo != null) {
            vuiSceneInfo.setBuild(true);
            vuiSceneInfo.setBuildComplete(true);
        }
        VuiSceneManager.instance().sendSceneData(0, false, vuiScene);
    }

    public void setUpdateElements(String str, List<bin> list) {
        setUpdateElements(str, list, VuiConstants.SCREEN_DISPLAY_LF);
    }

    public void setUpdateElements(final String str, final String str2, int i) {
        if (VuiUtils.cannotUpload() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.32
            @Override // java.lang.Runnable
            public void run() {
                VuiScene newVuiScene;
                try {
                    LogUtils.d(VuiEngineImpl.TAG, "sceneId:" + str + ",data:" + str2);
                    bin stringConvertToVuiElement = VuiUtils.stringConvertToVuiElement(str2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(stringConvertToVuiElement);
                    String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                    if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        VuiSceneInfo sceneInfo = VuiSceneManager.instance().getSceneInfo(sceneUnqiueId);
                        if (sceneInfo == null) {
                            return;
                        }
                        VuiScene newVuiScene2 = VuiEngineImpl.this.getNewVuiScene(sceneUnqiueId, currentTimeMillis);
                        VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                        if (sceneCache != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                bin binVar = (bin) arrayList.get(i2);
                                bin vuiElementById = sceneCache.getVuiElementById(sceneUnqiueId, binVar.getId());
                                if (vuiElementById == null || !vuiElementById.equals(binVar)) {
                                    if (binVar.getElements() == null && vuiElementById != null && vuiElementById.getElements() != null) {
                                        binVar.setElements(vuiElementById.getElements());
                                    }
                                    arrayList2.add(binVar);
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                return;
                            }
                            newVuiScene2.setElements(arrayList2);
                            List<bin> fusionCache = sceneCache.getFusionCache(sceneUnqiueId, arrayList2, false);
                            sceneCache.setCache(sceneUnqiueId, fusionCache);
                            if (sceneInfo.isWholeScene()) {
                                if (!"user".equals(Build.TYPE) && LogUtils.getLogLevel() <= LogUtils.LOG_DEBUG_LEVEL) {
                                    VuiEngineImpl.this.getNewVuiScene(sceneUnqiueId, currentTimeMillis).setElements(fusionCache);
                                    LogUtils.logDebug(VuiEngineImpl.TAG, "updateSceneTask full_scene_info" + VuiUtils.vuiSceneConvertToString(newVuiScene));
                                }
                                VuiSceneManager.instance().sendSceneData(1, true, newVuiScene2);
                                return;
                            }
                            if (sceneCache != null) {
                                sceneCache.setCache(sceneUnqiueId, sceneCache.getFusionCache(sceneUnqiueId, arrayList, false));
                            }
                            List<String> wholeSceneId = sceneInfo.getWholeSceneId();
                            int size = wholeSceneId == null ? 0 : wholeSceneId.size();
                            if (size > 0) {
                                String activeWholeSceneId = VuiEngineImpl.this.getActiveWholeSceneId(wholeSceneId);
                                if (!TextUtils.isEmpty(activeWholeSceneId)) {
                                    LogUtils.logDebug(VuiEngineImpl.TAG, "updateScene wholeSceneIds:" + wholeSceneId);
                                    VuiScene newVuiScene3 = VuiEngineImpl.this.getNewVuiScene(activeWholeSceneId, currentTimeMillis);
                                    newVuiScene3.setElements(arrayList);
                                    VuiEngineImpl.this.setWholeSceneCache(activeWholeSceneId, sceneCache, arrayList);
                                    VuiSceneManager.instance().sendSceneData(1, true, newVuiScene3);
                                }
                                for (int i3 = 0; i3 < size; i3++) {
                                    String str3 = wholeSceneId.get(i3);
                                    if (!TextUtils.isEmpty(str3) && !VuiUtils.isActiveSceneId(str3)) {
                                        VuiScene newVuiScene4 = VuiEngineImpl.this.getNewVuiScene(str3, currentTimeMillis);
                                        newVuiScene4.setElements(arrayList);
                                        VuiEngineImpl.this.setWholeSceneCache(str3, sceneCache, arrayList);
                                        VuiSceneManager.instance().sendSceneData(1, true, newVuiScene4);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public void setUpdateElements(final String str, final List<bin> list, final String str2) {
        if (VuiUtils.cannotUpload() || TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiEngineImpl.33
            @Override // java.lang.Runnable
            public void run() {
                VuiScene newVuiScene;
                try {
                    String sceneUnqiueId = VuiEngineImpl.this.getSceneUnqiueId(str);
                    if (VuiSceneManager.instance().canUpdateScene(sceneUnqiueId)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        VuiSceneInfo sceneInfo = VuiSceneManager.instance().getSceneInfo(sceneUnqiueId);
                        if (sceneInfo == null) {
                            return;
                        }
                        VuiScene newVuiScene2 = VuiEngineImpl.this.getNewVuiScene(sceneUnqiueId, currentTimeMillis);
                        VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                        if (sceneCache != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i = 0; i < list.size(); i++) {
                                bin binVar = (bin) list.get(i);
                                bin vuiElementById = sceneCache.getVuiElementById(sceneUnqiueId, binVar.getId());
                                if (vuiElementById == null || !vuiElementById.equals(binVar)) {
                                    if (binVar.getElements() == null && vuiElementById != null && vuiElementById.getElements() != null) {
                                        binVar.setElements(vuiElementById.getElements());
                                    }
                                    arrayList.add(binVar);
                                }
                            }
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            newVuiScene2.setElements(arrayList);
                            newVuiScene2.setDisplayLocation(str2);
                            List<bin> fusionCache = sceneCache.getFusionCache(sceneUnqiueId, arrayList, false);
                            sceneCache.setCache(sceneUnqiueId, fusionCache);
                            if (sceneInfo.isWholeScene()) {
                                if (!"user".equals(Build.TYPE) && LogUtils.getLogLevel() <= LogUtils.LOG_DEBUG_LEVEL) {
                                    VuiEngineImpl.this.getNewVuiScene(sceneUnqiueId, currentTimeMillis).setElements(fusionCache);
                                    newVuiScene2.setDisplayLocation(str2);
                                    LogUtils.logDebug(VuiEngineImpl.TAG, "updateSceneTask full_scene_info" + VuiUtils.vuiSceneConvertToString(newVuiScene));
                                }
                                VuiSceneManager.instance().sendSceneData(1, true, newVuiScene2);
                                return;
                            }
                            if (sceneCache != null) {
                                sceneCache.setCache(sceneUnqiueId, sceneCache.getFusionCache(sceneUnqiueId, list, false));
                            }
                            List<String> wholeSceneId = sceneInfo.getWholeSceneId();
                            int size = wholeSceneId == null ? 0 : wholeSceneId.size();
                            if (size > 0) {
                                String activeWholeSceneId = VuiEngineImpl.this.getActiveWholeSceneId(wholeSceneId);
                                if (!TextUtils.isEmpty(activeWholeSceneId)) {
                                    LogUtils.logDebug(VuiEngineImpl.TAG, "updateScene wholeSceneIds:" + wholeSceneId);
                                    VuiScene newVuiScene3 = VuiEngineImpl.this.getNewVuiScene(activeWholeSceneId, currentTimeMillis);
                                    newVuiScene3.setElements(list);
                                    newVuiScene3.setDisplayLocation(str2);
                                    VuiEngineImpl.this.setWholeSceneCache(activeWholeSceneId, sceneCache, list);
                                    VuiSceneManager.instance().sendSceneData(1, true, newVuiScene3);
                                }
                                for (int i2 = 0; i2 < size; i2++) {
                                    String str3 = wholeSceneId.get(i2);
                                    if (!TextUtils.isEmpty(str3) && !VuiUtils.isActiveSceneId(str3)) {
                                        VuiScene newVuiScene4 = VuiEngineImpl.this.getNewVuiScene(str3, currentTimeMillis);
                                        newVuiScene4.setElements(list);
                                        newVuiScene4.setDisplayLocation(str2);
                                        VuiEngineImpl.this.setWholeSceneCache(str3, sceneCache, list);
                                        VuiSceneManager.instance().sendSceneData(1, true, newVuiScene4);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                    LogUtils.e(VuiEngineImpl.TAG, "setUpdateElements exception");
                }
            }
        });
    }

    public String getActiveWholeSceneId(List<String> list) {
        if (list == null) {
            return "";
        }
        String str = mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_LF);
        String str2 = mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_RF);
        return (TextUtils.isEmpty(str) || !list.contains(str)) ? (TextUtils.isEmpty(str2) || !list.contains(str2)) ? "" : str2 : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWholeSceneCache(String str, VuiSceneCache vuiSceneCache, List<bin> list) {
        if (vuiSceneCache != null) {
            List<bin> fusionCache = vuiSceneCache.getFusionCache(str, list, false);
            vuiSceneCache.setCache(str, fusionCache);
            if ("user".equals(Build.TYPE) || LogUtils.getLogLevel() > LogUtils.LOG_DEBUG_LEVEL) {
                return;
            }
            VuiScene newVuiScene = getNewVuiScene(str, System.currentTimeMillis());
            newVuiScene.setElements(fusionCache);
            LogUtils.logDebug(TAG, "updateSceneTask full_scene_info" + VuiUtils.vuiSceneConvertToString(newVuiScene));
        }
    }

    public bin getVuiElement(String str, String str2) {
        VuiSceneCache sceneCache;
        if (VuiUtils.cannotUpload() || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || (sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType())) == null) {
            return null;
        }
        return sceneCache.getVuiElementById(getSceneUnqiueId(str), str2);
    }

    public VuiScene getVuiScene(String str) {
        List<bin> cache;
        if (VuiUtils.cannotUpload() || TextUtils.isEmpty(str)) {
            return null;
        }
        VuiScene createVuiScene = createVuiScene(str, System.currentTimeMillis());
        VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
        if (sceneCache != null && (cache = sceneCache.getCache(createVuiScene.getSceneId())) != null && cache.isEmpty()) {
            createVuiScene.setElements(cache);
        }
        return createVuiScene;
    }

    public boolean isSpeechShowNumber() {
        if (VuiUtils.cannotUpload()) {
            return false;
        }
        return VuiSceneManager.instance().isInSpeech();
    }

    public Map<String, String> getActiveSceneId() {
        return mActiveSceneIds;
    }
}
