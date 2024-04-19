package com.xiaopeng.speech.vui;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewRootImpl;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.gson.Gson;
import com.xiaopeng.lib.framework.aiassistantmodule.sensor.ContextSensor;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.speech.protocol.bean.recommend.RecommendBean;
import com.xiaopeng.speech.vui.cache.VuiDisplayLocationInfoCache;
import com.xiaopeng.speech.vui.cache.VuiSceneBuildCache;
import com.xiaopeng.speech.vui.cache.VuiSceneCache;
import com.xiaopeng.speech.vui.cache.VuiSceneCacheFactory;
import com.xiaopeng.speech.vui.cache.VuiSceneRemoveCache;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.speech.vui.listener.IVuiEventListener;
import com.xiaopeng.speech.vui.listener.IXpVuiSceneListener;
import com.xiaopeng.speech.vui.model.VuiEventInfo;
import com.xiaopeng.speech.vui.model.VuiFeedback;
import com.xiaopeng.speech.vui.model.VuiScene;
import com.xiaopeng.speech.vui.model.VuiSceneInfo;
import com.xiaopeng.speech.vui.model.VuiSceneState;
import com.xiaopeng.speech.vui.utils.LogUtils;
import com.xiaopeng.speech.vui.utils.ResourceUtil;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class VuiSceneManager {
    private static int SEND_UPLOAD_MESSAGE = 1;
    public static final int TYPE_ADD = 2;
    public static final int TYPE_BUILD = 0;
    public static final int TYPE_DISPLAY_LOCATION = 5;
    public static final int TYPE_REMOVE = 3;
    public static final int TYPE_UPDATE = 1;
    public static final int TYPE_UPDATEATTR = 4;
    private static final int VUI_RETRY_MAX_COUNT = 3;
    private static final String VUI_SCENE_AUTHORITY = "com.xiaopeng.speech.vuiscene";
    private static final int VUI_UPDATE_FAILED_ERRO_CODE = -500;
    private final String TAG;
    Map<String, Integer> feedbackInfo;
    private String mActiveSceneId;
    private Handler mApiRouterHandler;
    private HandlerThread mApiRouterThread;
    private Binder mBinder;
    private Context mContext;
    private Handler mHandler;
    private boolean mIsInSpeech;
    private Handler mLocalVuiRouterHandler;
    private HandlerThread mLocalVuiThread;
    private String mObserver;
    private String mPackageName;
    private String mPackageVersion;
    private String mProcessName;
    private VuiBroadCastReceiver mReceiver;
    private HandlerThread mThread;
    private ConcurrentHashMap<String, VuiSceneInfo> mVuiSceneInfoMap;
    private ConcurrentHashMap<String, VuiSceneInfo> mVuiSubSceneInfoMap;
    private List<String> sceneIds;
    private VuiEngineImpl vuiEngine;
    private static final Uri VUI_SCENE_URI = Uri.parse("content://com.xiaopeng.speech.vuiscene/scene");
    private static final Uri VUI_SCENE_DELETE_URI = Uri.parse("content://com.xiaopeng.speech.vuiscene/scene/delete/");
    private static int REMOVE_FEED_BACK = 2;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasProcessFeature() {
        return true;
    }

    public void setInSpeech(boolean z) {
        this.mIsInSpeech = z;
        if (this.mIsInSpeech) {
            sendSceneData(null);
        }
    }

    public void setEngine(VuiEngineImpl vuiEngineImpl) {
        this.vuiEngine = vuiEngineImpl;
    }

    public boolean isInSpeech() {
        return this.mIsInSpeech;
    }

    private VuiSceneManager() {
        this.TAG = "VuiSceneManager";
        this.mIsInSpeech = false;
        this.mBinder = null;
        this.mReceiver = null;
        this.feedbackInfo = new HashMap();
        this.mProcessName = null;
        this.sceneIds = new ArrayList();
        this.mVuiSceneInfoMap = new ConcurrentHashMap<>();
        this.mVuiSubSceneInfoMap = new ConcurrentHashMap<>();
        lazyInitThread();
    }

    public static final VuiSceneManager instance() {
        return Holder.Instance;
    }

    public void subscribe(String str) {
        if (!bfj.a(this.mPackageName, str)) {
            LogUtils.e("VuiSceneManager", "注册observer不合法,observer是app的包名加observer的类名组成");
            return;
        }
        this.mObserver = str;
        if (VuiUtils.canUseVuiFeature()) {
            subscribe(false);
            sendBroadCast();
            registerReceiver();
        }
    }

    private void lazyInitThread() {
        if (this.mThread == null) {
            this.mThread = new HandlerThread("VuiSceneManager-Thread");
            this.mThread.start();
            this.mHandler = new VuiSceneHandler(this.mThread.getLooper());
        }
        if (this.mApiRouterThread == null) {
            this.mApiRouterThread = new HandlerThread("VuiSceneManager-Apirouter-Thread");
            this.mApiRouterThread.start();
            this.mApiRouterHandler = new Handler(this.mApiRouterThread.getLooper());
        }
        if (this.mLocalVuiThread == null) {
            this.mLocalVuiThread = new HandlerThread("VuiSceneManager-LocalVui-Thread");
            this.mLocalVuiThread.start();
            this.mLocalVuiRouterHandler = new Handler(this.mLocalVuiThread.getLooper());
        }
    }

    public void reSetBinder() {
        this.mBinder = null;
    }

    public void setFeatureState(boolean z) {
        try {
            if (VuiUtils.isFeatureDisabled() != z) {
                if (z) {
                    VuiSceneBuildCache vuiSceneBuildCache = (VuiSceneBuildCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                    if (VuiEngineImpl.mActiveSceneIds.size() > 0 && this.mPackageName != null && this.mPackageName.equals(getTopRunningPackageName())) {
                        handlerActiveScene(VuiEngineImpl.mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_LF), VuiConstants.SCREEN_DISPLAY_LF);
                        handlerActiveScene(VuiEngineImpl.mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_RF), VuiConstants.SCREEN_DISPLAY_RF);
                    }
                    if (VuiEngineImpl.mLeftPopPanelStack.size() > 0) {
                        Iterator<String> it = VuiEngineImpl.mLeftPopPanelStack.iterator();
                        while (it.hasNext()) {
                            handlerActiveScene(it.next(), VuiConstants.SCREEN_DISPLAY_LF);
                        }
                    }
                    if (VuiEngineImpl.mRightPopPanelStack.size() > 0) {
                        Iterator<String> it2 = VuiEngineImpl.mRightPopPanelStack.iterator();
                        while (it2.hasNext()) {
                            handlerActiveScene(it2.next(), VuiConstants.SCREEN_DISPLAY_RF);
                        }
                        return;
                    }
                    return;
                }
                handleAllSceneCache(true);
                handleSceneDataInfo();
            }
        } catch (Exception unused) {
        }
    }

    private void handlerActiveScene(String str, String str2) {
        bie vuiSceneListener;
        VuiSceneBuildCache vuiSceneBuildCache = (VuiSceneBuildCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<bin> cache = vuiSceneBuildCache.getCache(str);
        if ((cache == null || cache.isEmpty()) && (vuiSceneListener = instance().getVuiSceneListener(str)) != null) {
            vuiSceneListener.onBuildScene();
        }
        enterScene(str, this.mPackageName, true, str2);
    }

    public void storeFeedbackInfo(int i, String str, String str2) {
        LogUtils.logInfo("VuiSceneManager", "storeFeedbackInfo:" + str2 + ",soundArea:" + i);
        this.feedbackInfo.put(str2, Integer.valueOf(i));
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = REMOVE_FEED_BACK;
        obtainMessage.obj = str2;
        this.mHandler.sendMessageDelayed(obtainMessage, 1000L);
    }

    public synchronized void insertVuiProviderWhenDeath() {
        LogUtils.d("VuiSceneManager", "insertVuiProviderWhenDeath");
        String str = VuiEngineImpl.mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_LF);
        String str2 = VuiEngineImpl.mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_RF);
        if (!TextUtils.isEmpty(str)) {
            reBuildSceneToVuiProvider(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            reBuildSceneToVuiProvider(str2);
        }
        if (VuiEngineImpl.mLeftPopPanelStack.size() > 0) {
            Iterator<String> it = VuiEngineImpl.mLeftPopPanelStack.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!TextUtils.isEmpty(next)) {
                    reBuildSceneToVuiProvider(next);
                }
            }
        }
        if (VuiEngineImpl.mRightPopPanelStack.size() > 0) {
            Iterator<String> it2 = VuiEngineImpl.mRightPopPanelStack.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (!TextUtils.isEmpty(next2)) {
                    reBuildSceneToVuiProvider(next2);
                }
            }
        }
    }

    public synchronized void reBuildSceneToVuiProvider(final String str) {
        try {
            this.mHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.1
                @Override // java.lang.Runnable
                public void run() {
                    List<bin> cache;
                    VuiScene build = new VuiScene.Builder().sceneId(str).appVersion(VuiSceneManager.this.mPackageVersion).packageName(VuiSceneManager.this.mPackageName).timestamp(System.currentTimeMillis()).build();
                    VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                    if (sceneCache == null || (cache = sceneCache.getCache(str)) == null || cache.isEmpty()) {
                        return;
                    }
                    build.setElements(sceneCache.getCache(str));
                    VuiSceneManager.this.sendSceneData(0, false, build, false);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void insertVuiSceneToProvider(String str, String str2, String str3) {
        LogUtils.logInfo("VuiSceneManager", "insertVuiSceneToProvider:sceneId = " + str);
        ContentResolver contentResolver = this.mContext.getContentResolver();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("scene_id", str);
            contentValues.put("scene_info", str2);
            contentValues.put("scene_type", str3);
            Uri insert = contentResolver.insert(VUI_SCENE_URI, contentValues);
            long parseId = ContentUris.parseId(insert);
            if (insert != null && parseId > 0) {
                LogUtils.d("VuiSceneManager", "insertVuiSceneToProvider" + str3 + "success");
                contentResolver.notifyChange(insert, null);
                return;
            }
            char c = 65535;
            int hashCode = str3.hashCode();
            boolean z = false;
            if (hashCode != -838846263) {
                if (hashCode != 94094958) {
                    if (hashCode == 1671764162 && str3.equals("display")) {
                        c = 2;
                    }
                } else if (str3.equals("build")) {
                    c = 0;
                }
            } else if (str3.equals("update")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    LogUtils.d("VuiSceneManager", "insertVuiSceneToProvider build retryResult" + retryInsertVuiProvider(contentValues));
                    return;
                case 1:
                case 2:
                    if (parseId == -500) {
                        VuiScene build = new VuiScene.Builder().sceneId(str).appVersion(this.mPackageVersion).packageName(this.mPackageName).timestamp(System.currentTimeMillis()).build();
                        VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                        if (sceneCache != null) {
                            List<bin> cache = sceneCache.getCache(str);
                            if (cache != null && !cache.isEmpty()) {
                                build.setElements(sceneCache.getCache(str));
                                String vuiSceneConvertToString = VuiUtils.vuiSceneConvertToString(build);
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("scene_id", str);
                                contentValues2.put("scene_info", vuiSceneConvertToString);
                                contentValues2.put("scene_type", "build");
                                z = retryInsertVuiProvider(contentValues2);
                            }
                            if (z) {
                                LogUtils.d("VuiSceneManager", "insertVuiSceneToProvider update retryResult" + retryInsertVuiProvider(contentValues));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    private boolean retryInsertVuiProvider(ContentValues contentValues) {
        ContentResolver contentResolver = this.mContext.getContentResolver();
        for (int i = 3; i > 0; i--) {
            Uri insert = contentResolver.insert(VUI_SCENE_URI, contentValues);
            long parseId = ContentUris.parseId(insert);
            if (insert != null && parseId > 0) {
                contentResolver.notifyChange(insert, null);
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public void deleteVuiSceneById(java.lang.String r12) {
        /*
            r11 = this;
            android.content.Context r0 = r11.mContext
            android.content.ContentResolver r0 = r0.getContentResolver()
            r7 = 0
            java.lang.String r8 = "scene_id = ?"
            android.net.Uri r2 = com.xiaopeng.speech.vui.VuiSceneManager.VUI_SCENE_URI     // Catch: java.lang.Throwable -> L51
            r3 = 0
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L51
            r10 = 0
            r5[r10] = r12     // Catch: java.lang.Throwable -> L51
            r6 = 0
            r1 = r0
            r4 = r8
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L51
            r2 = -1
            if (r1 == 0) goto L2e
            boolean r4 = r1.moveToNext()     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L2e
            java.lang.String r4 = "_id"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L52
            long r4 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L52
            goto L2f
        L2e:
            r4 = r2
        L2f:
            android.net.Uri r6 = com.xiaopeng.speech.vui.VuiSceneManager.VUI_SCENE_URI     // Catch: java.lang.Throwable -> L52
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L52
            r9[r10] = r12     // Catch: java.lang.Throwable -> L52
            int r12 = r0.delete(r6, r8, r9)     // Catch: java.lang.Throwable -> L52
            if (r12 <= 0) goto L52
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 == 0) goto L52
            android.net.Uri r12 = com.xiaopeng.speech.vui.VuiSceneManager.VUI_SCENE_DELETE_URI     // Catch: java.lang.Throwable -> L52
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r12, r4)     // Catch: java.lang.Throwable -> L52
            r0.notifyChange(r12, r7)     // Catch: java.lang.Throwable -> L52
            goto L52
        L49:
            r12 = move-exception
            goto L4d
        L4b:
            r12 = move-exception
            r1 = r7
        L4d:
            r1.close()
            throw r12
        L51:
            r1 = r7
        L52:
            r1.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.speech.vui.VuiSceneManager.deleteVuiSceneById(java.lang.String):void");
    }

    public void vuiFeedBack(final String str, final String str2) {
        if (this.mApiRouterHandler == null || !this.feedbackInfo.containsKey(str)) {
            return;
        }
        final int intValue = this.feedbackInfo.get(str).intValue();
        this.feedbackInfo.remove(str);
        LogUtils.logInfo("VuiSceneManager", "vuiFeedBack:" + str + ",soundArea:" + intValue + ",content:" + str2);
        this.mApiRouterHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.2
            @Override // java.lang.Runnable
            public void run() {
                Uri.Builder builder = new Uri.Builder();
                Uri.Builder appendQueryParameter = builder.authority(VuiSceneManager.this.getAuthority()).path("vuiSoundAreaFeedback").appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, VuiSceneManager.this.mPackageName).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("resourceName", str).appendQueryParameter("state", "-1").appendQueryParameter(VuiConstants.ELEMENT_TYPE, bii.TTS.a()).appendQueryParameter("content", str2);
                appendQueryParameter.appendQueryParameter("soundArea", "" + intValue);
                try {
                    LogUtils.logDebug("VuiSceneManager", "vuiSoundAreaFeedback ");
                    String str3 = (String) abt.a(builder.build());
                    LogUtils.logInfo("VuiSceneManager", "vuiSoundAreaFeedback success");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void updateListIndexState() {
        VuiEngineImpl vuiEngineImpl = this.vuiEngine;
        if (vuiEngineImpl != null) {
            vuiEngineImpl.updateListIndexState();
        }
    }

    public void onVuiQueryCallBack(final String str, final String str2, final String str3) {
        Handler handler;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (handler = this.mApiRouterHandler) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.3
            @Override // java.lang.Runnable
            public void run() {
                LogUtils.logInfo("VuiSceneManager", "onVuiQueryCallBack:" + str + ",event:" + str2 + ",result:" + str3);
                Uri.Builder builder = new Uri.Builder();
                builder.authority(VuiSceneManager.this.getAuthority()).path("onVuiQueryCallBack").appendQueryParameter(VuiConstants.SCENE_ID, str).appendQueryParameter("event", str2).appendQueryParameter(RecommendBean.SHOW_TIME_RESULT, str3);
                try {
                    LogUtils.logDebug("VuiSceneManager", "onVuiQueryCallBack ");
                    String str4 = (String) abt.a(builder.build());
                    LogUtils.logInfo("VuiSceneManager", "onVuiQueryCallBack success");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void exitScene(final String str, final String str2, final boolean z, final String str3, boolean z2) {
        if (str == null || str2 == null || !VuiUtils.canUseVuiFeature()) {
            return;
        }
        if (!z2) {
            if (getVuiSceneState(str) == VuiSceneState.ACTIVE.getState()) {
                updateSceneState(str, VuiSceneState.UNACTIVE.getState());
            } else {
                LogUtils.e("VuiSceneManager", "场景未激活不能执行退出");
                return;
            }
        }
        this.mApiRouterHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (z) {
                        Uri.Builder builder = new Uri.Builder();
                        if (!VuiUtils.is3DUIPlatForm()) {
                            builder.authority(VuiSceneManager.this.getAuthority()).path("exitScene").appendQueryParameter(VuiConstants.SCENE_ID, str).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, str2).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion);
                        } else {
                            builder.authority(VuiSceneManager.this.getAuthority()).path("exitDisplayLocationScene").appendQueryParameter(VuiConstants.SCENE_ID, str).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, str2).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("displayLocation", str3);
                        }
                        LogUtils.logDebug("VuiSceneManager", "exitScene-------------- " + str + ",displayLocation:" + str3);
                        abt.a(builder.build());
                        StringBuilder sb = new StringBuilder();
                        sb.append("exitScene---success---------- ");
                        sb.append(str);
                        LogUtils.logDebug("VuiSceneManager", sb.toString());
                    }
                } catch (Exception e) {
                    LogUtils.e("VuiSceneManager", "exitScene--e: " + e.fillInStackTrace());
                    Uri.Builder builder2 = new Uri.Builder();
                    if (VuiUtils.is3DUIPlatForm()) {
                        builder2.authority(VuiSceneManager.this.getAuthority()).path("exitScene").appendQueryParameter(VuiConstants.SCENE_ID, str).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, str2).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion);
                    }
                    try {
                        abt.a(builder2.build());
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    public boolean isNaviTop() {
        try {
            Uri.Builder builder = new Uri.Builder();
            builder.authority(getAuthority()).path("isNaviTop");
            return ((Boolean) abt.a(builder.build())).booleanValue();
        } catch (RemoteException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class VuiSceneHandler extends Handler {
        public VuiSceneHandler() {
        }

        public VuiSceneHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != VuiSceneManager.SEND_UPLOAD_MESSAGE) {
                if (message.what == VuiSceneManager.REMOVE_FEED_BACK) {
                    String str = (String) message.obj;
                    if (VuiSceneManager.this.feedbackInfo.containsKey(str)) {
                        VuiSceneManager.this.feedbackInfo.remove(str);
                        return;
                    }
                    return;
                }
                return;
            }
            int i = message.arg1;
            boolean z = message.arg2 == 1;
            if (i == 2) {
                VuiSceneManager.this.addSceneElementGroup((VuiScene) message.obj, z);
            } else if (i == 0) {
                VuiSceneManager.this.buildScene((VuiScene) message.obj, z, true);
            } else if (i == 1) {
                VuiSceneManager.this.updateDynamicScene((VuiScene) message.obj, z);
            } else if (i == 4) {
                VuiSceneManager.this.updateSceneElementAttr((VuiScene) message.obj, z);
            } else if (i == 5) {
                VuiSceneManager.this.updateDisplayLocation((VuiScene) message.obj, z);
            } else {
                String str2 = (String) message.obj;
                int indexOf = str2.indexOf(ListSignBean.COLLECTID_SUFFIX);
                VuiSceneManager.this.removeSceneElementGroup(str2.substring(0, indexOf), str2.substring(indexOf + 1), z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDisplayLocation(final VuiScene vuiScene, final boolean z) {
        if (VuiUtils.isMultiScreenPlatForm()) {
            LogUtils.i("VuiSceneManager", "updateDisplayLocation  =======   ");
            Handler handler = this.mApiRouterHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.5
                    @Override // java.lang.Runnable
                    public void run() {
                        VuiScene vuiScene2;
                        String sceneId;
                        if (VuiUtils.cannotUpload() || (vuiScene2 = vuiScene) == null || (sceneId = vuiScene2.getSceneId()) == null) {
                            return;
                        }
                        VuiDisplayLocationInfoCache vuiDisplayLocationInfoCache = (VuiDisplayLocationInfoCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.DISPLAY_LOCATION.getType());
                        if (z) {
                            vuiDisplayLocationInfoCache.setCache(sceneId, vuiScene.getDisplayLocation());
                        }
                        String vuiSceneConvertToString = VuiUtils.vuiSceneConvertToString(vuiScene);
                        LogUtils.i("VuiSceneManager", "updateDisplayLocation  =======   " + vuiSceneConvertToString);
                        if (VuiSceneManager.this.isUploadScene(sceneId)) {
                            vuiDisplayLocationInfoCache.setSendState(true);
                            Uri.Builder builder = new Uri.Builder();
                            builder.authority(VuiSceneManager.this.getAuthority()).path("updateDisplayLocation").appendQueryParameter(VuiConstants.SCENE_ID, sceneId).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, vuiScene.getPackageName()).appendQueryParameter("packageVersion", vuiScene.getVersion()).appendQueryParameter("sceneData", vuiSceneConvertToString);
                            try {
                                LogUtils.logDebug("VuiSceneManager", " updateDisplayLocation to CarSpeech" + sceneId);
                                String str = (String) abt.a(builder.build());
                                vuiDisplayLocationInfoCache.setSendState(false);
                                LogUtils.logInfo("VuiSceneManager", "updateDisplayLocation to CarSpeech success" + sceneId + ",result:" + str);
                                if (!TextUtils.isEmpty(str) && vuiDisplayLocationInfoCache != null && vuiScene.getDisplayLocation().equals(vuiDisplayLocationInfoCache.getDisplayCache(sceneId))) {
                                    vuiDisplayLocationInfoCache.removeDisplayCache(sceneId);
                                }
                            } catch (RemoteException e) {
                                e.printStackTrace();
                                LogUtils.e("VuiSceneManager", "updateDisplayLocation " + e.fillInStackTrace());
                                vuiDisplayLocationInfoCache.setSendState(false);
                            }
                            if ("user".equals(Build.TYPE) || LogUtils.getLogLevel() > LogUtils.LOG_DEBUG_LEVEL) {
                                return;
                            }
                            LogUtils.logDebug("VuiSceneManager", "updateDisplayLocation " + VuiUtils.vuiSceneConvertToString(vuiScene));
                        }
                    }
                });
            }
        }
    }

    private void registerReceiver() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (VuiUtils.canUseVuiFeature()) {
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction(VuiConstants.INTENT_ACTION_CARSPEECH_START);
                            intentFilter.addAction(VuiConstants.INTENT_ACTION_ENV_CHANGED);
                            intentFilter.addAction(VuiConstants.INTENT_ACTION_VUIPROVIDER_DEATH);
                            intentFilter.addAction(VuiConstants.INTENT_ACTION_LOCAL_SCENE_NOT_FOUND);
                            VuiSceneManager.this.mReceiver = new VuiBroadCastReceiver();
                            ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).registerReceiver(VuiSceneManager.this.mReceiver, intentFilter);
                        }
                    } catch (Exception e) {
                        LogUtils.e("VuiSceneManager", "registerReceiver e:" + e.getMessage());
                    }
                }
            });
        }
    }

    public void handleSceneDataInfo() {
        if (VuiEngineImpl.mActiveSceneIds.size() > 0) {
            String str = VuiEngineImpl.mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_RF);
            String str2 = VuiEngineImpl.mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_LF);
            if (!TextUtils.isEmpty(str2)) {
                enterScene(str2, this.mPackageName, true, VuiConstants.SCREEN_DISPLAY_LF);
            }
            if (!TextUtils.isEmpty(str)) {
                enterScene(str, this.mPackageName, true, VuiConstants.SCREEN_DISPLAY_RF);
            }
        }
        if (VuiEngineImpl.mLeftPopPanelStack.size() > 0) {
            Iterator<String> it = VuiEngineImpl.mLeftPopPanelStack.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!TextUtils.isEmpty(next)) {
                    enterScene(next, this.mPackageName, true, VuiConstants.SCREEN_DISPLAY_LF);
                }
            }
        }
        if (VuiEngineImpl.mRightPopPanelStack.size() > 0) {
            Iterator<String> it2 = VuiEngineImpl.mRightPopPanelStack.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (!TextUtils.isEmpty(next2)) {
                    enterScene(next2, this.mPackageName, true, VuiConstants.SCREEN_DISPLAY_RF);
                }
            }
        }
    }

    public void handleAllSceneCache(boolean z) {
        try {
            if (this.sceneIds == null) {
                return;
            }
            for (int i = 0; i < this.sceneIds.size(); i++) {
                String str = this.sceneIds.get(i);
                if (z) {
                    VuiSceneCacheFactory.instance().removeAllCache(str);
                    VuiSceneInfo vuiSceneInfo = this.mVuiSceneInfoMap.get(str);
                    if (vuiSceneInfo != null) {
                        vuiSceneInfo.reset(false);
                        this.mVuiSceneInfoMap.put(str, vuiSceneInfo);
                    }
                } else {
                    ((VuiSceneBuildCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType())).setUploadedState(str, false);
                    VuiSceneCacheFactory.instance().removeOtherCache(str);
                }
            }
        } catch (Exception e) {
            LogUtils.e("VuiSceneManager", "handleAllSceneCache e:" + e.getMessage());
        }
    }

    public void sendBroadCast() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.7
                @Override // java.lang.Runnable
                public void run() {
                    if (VuiSceneManager.this.mBinder == null) {
                        VuiSceneManager.this.mBinder = new Binder();
                    }
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    intent.setAction("com.xiaopeng.speech.vuiengine.start");
                    intent.setPackage("com.xiaopeng.carspeechservice");
                    bundle.putBinder("client", VuiSceneManager.this.mBinder);
                    bundle.putString("name", VuiSceneManager.this.mPackageName);
                    bundle.putString("version", VuiSceneManager.this.mPackageVersion);
                    if (VuiSceneManager.this.hasProcessFeature()) {
                        bundle.putString("processName", VuiSceneManager.this.getProcessName());
                    }
                    intent.putExtra("bundle", bundle);
                    VuiSceneManager.this.mContext.sendBroadcast(intent);
                }
            });
        }
    }

    public void subscribeVuiFeature() {
        if (VuiUtils.canUseVuiFeature()) {
            subscribe(false);
            sendBroadCast();
            registerReceiver();
        }
    }

    public void unSubscribeVuiFeature() {
        Handler handler;
        if (VuiUtils.canUseVuiFeature() && (handler = this.mHandler) != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        abt.a(new Uri.Builder().authority(VuiSceneManager.this.getAuthority()).path("unsubscribeVuiFeatureProcess").appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, VuiSceneManager.this.mPackageName).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("processName", VuiSceneManager.this.getProcessName()).build());
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void subscribe(final boolean z) {
        Handler handler = this.mApiRouterHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.9
                @Override // java.lang.Runnable
                public void run() {
                    if (VuiUtils.canUseVuiFeature()) {
                        LogUtils.logInfo("VuiSceneManager", "subscribe：" + VuiSceneManager.this.mObserver);
                        if (TextUtils.isEmpty(VuiSceneManager.this.mObserver)) {
                            LogUtils.e("VuiSceneManager", "mObserver == null");
                            try {
                                String str = (String) abt.a(new Uri.Builder().authority(VuiSceneManager.this.getAuthority()).path("subscribeVuiFeatureProcess").appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, VuiSceneManager.this.mPackageName).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("processName", VuiSceneManager.this.getProcessName()).build());
                                LogUtils.logDebug("VuiSceneManager", "subscribeVuiFeature：" + str);
                                if (!TextUtils.isEmpty(str)) {
                                    if (str.contains("dm_start")) {
                                        VuiSceneManager.this.mIsInSpeech = true;
                                    } else if (str.contains("dm_end")) {
                                        VuiSceneManager.this.mIsInSpeech = false;
                                    } else if (str.contains("vui_disabled")) {
                                        VuiSceneManager.this.setFeatureState(false);
                                        VuiUtils.disableVuiFeature();
                                    } else if (str.contains("vui_enable")) {
                                        VuiSceneManager.this.setFeatureState(true);
                                        VuiUtils.enableVuiFeature();
                                    }
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        new String[]{"command://scene.control"};
                        try {
                            if (VuiSceneManager.this.hasProcessFeature()) {
                                abt.a(new Uri.Builder().authority(VuiSceneManager.this.getAuthority()).path("subscribeProcess").appendQueryParameter("observer", VuiSceneManager.this.mObserver).appendQueryParameter("param", "").appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, VuiSceneManager.this.mPackageName).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("sceneList", VuiSceneManager.this.sceneIds.toString()).appendQueryParameter("processName", VuiSceneManager.this.getProcessName()).build());
                            } else {
                                abt.a(new Uri.Builder().authority(VuiSceneManager.this.getAuthority()).path(ContextSensor.CMD_SUBSCRIBE).appendQueryParameter("observer", VuiSceneManager.this.mObserver).appendQueryParameter("param", "").appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, VuiSceneManager.this.mPackageName).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("sceneList", VuiSceneManager.this.sceneIds.toString()).build());
                            }
                            if (z) {
                                VuiSceneManager.this.handleSceneDataInfo();
                            }
                        } catch (Exception e) {
                            LogUtils.e("VuiSceneManager", "subscribe e:" + e.fillInStackTrace());
                            VuiSceneManager.this.subscribe(z);
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getProcessName() {
        /*
            r5 = this;
            java.lang.String r0 = r5.mProcessName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = r5.mProcessName
            return r0
        Lb:
            r0 = 0
            java.lang.String r1 = "main"
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            r3.<init>()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            java.lang.String r4 = "/proc/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            r3.append(r4)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            java.lang.String r4 = "/cmdline"
            r3.append(r4)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            java.lang.String r0 = r5.mPackageName     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            if (r0 == 0) goto L50
            java.lang.String r0 = r5.mPackageName     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            java.lang.String r2 = ""
            java.lang.String r0 = r1.replace(r0, r2)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            r1 = r0
        L50:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            if (r0 == 0) goto L5a
            java.lang.String r0 = "main"
            r1 = r0
            goto L60
        L5a:
            r0 = 1
            java.lang.String r0 = r1.substring(r0)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            r1 = r0
        L60:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            r0.<init>()     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            r0.append(r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            java.lang.String r2 = ",pid_"
            r0.append(r2)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            int r2 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            r0.append(r2)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            r5.mProcessName = r0     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            java.lang.String r0 = r5.mProcessName     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L9c
            r3.close()     // Catch: java.lang.Exception -> L80
            goto L84
        L80:
            r1 = move-exception
            r1.printStackTrace()
        L84:
            return r0
        L85:
            r0 = move-exception
            goto L8e
        L87:
            r1 = move-exception
            r3 = r0
            r0 = r1
            goto L9d
        L8b:
            r2 = move-exception
            r3 = r0
            r0 = r2
        L8e:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L9c
            if (r3 == 0) goto L9b
            r3.close()     // Catch: java.lang.Exception -> L97
            goto L9b
        L97:
            r0 = move-exception
            r0.printStackTrace()
        L9b:
            return r1
        L9c:
            r0 = move-exception
        L9d:
            if (r3 == 0) goto La7
            r3.close()     // Catch: java.lang.Exception -> La3
            goto La7
        La3:
            r1 = move-exception
            r1.printStackTrace()
        La7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.speech.vui.VuiSceneManager.getProcessName():java.lang.String");
    }

    public void setProcessName(String str) {
        this.mProcessName = str + ",pid_" + Process.myPid();
    }

    public void unSubscribe() {
        Handler handler;
        if (VuiUtils.canUseVuiFeature() && (handler = this.mHandler) != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.10
                @Override // java.lang.Runnable
                public void run() {
                    VuiSceneManager.this.unsubscribe();
                }
            });
        }
    }

    public void unsubscribe() {
        if (TextUtils.isEmpty(this.mObserver)) {
            LogUtils.e("VuiSceneManager", "mObserver == null");
            return;
        }
        Handler handler = this.mApiRouterHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.11
                @Override // java.lang.Runnable
                public void run() {
                    if (VuiSceneManager.this.hasProcessFeature()) {
                        try {
                            abt.a(new Uri.Builder().authority(VuiSceneManager.this.getAuthority()).path("unsubscribeProcess").appendQueryParameter("observer", VuiSceneManager.this.mObserver).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, VuiSceneManager.this.mPackageName).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("processName", VuiSceneManager.this.getProcessName()).build());
                            return;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            LogUtils.e("VuiSceneManager", "unsubscribe e:" + th.getMessage());
                            return;
                        }
                    }
                    try {
                        abt.a(new Uri.Builder().authority(VuiSceneManager.this.getAuthority()).path(ContextSensor.CMD_UNSUBSCRIBE).appendQueryParameter("observer", VuiSceneManager.this.mObserver).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, VuiSceneManager.this.mPackageName).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).build());
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        LogUtils.e("VuiSceneManager", "unsubscribe e:" + th2.getMessage());
                    }
                }
            });
        }
    }

    public synchronized void sendSceneData(final String str) {
        try {
            this.mHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.12
                @Override // java.lang.Runnable
                public void run() {
                    if (VuiUtils.cannotUpload()) {
                        return;
                    }
                    String str2 = str;
                    if (!TextUtils.isEmpty(str2)) {
                        VuiSceneManager.this.checkUploadScene(str2);
                        return;
                    }
                    String str3 = VuiEngineImpl.mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_LF);
                    String str4 = VuiEngineImpl.mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_RF);
                    LogUtils.i("VuiSceneManager", "sendSceneData   ========   " + str3 + "   ::::  " + str4);
                    if (!TextUtils.isEmpty(str3)) {
                        VuiSceneManager.this.checkUploadScene(str3);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        VuiSceneManager.this.checkUploadScene(str4);
                    }
                    if (VuiEngineImpl.mLeftPopPanelStack.size() > 0) {
                        Iterator<String> it = VuiEngineImpl.mLeftPopPanelStack.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            if (!TextUtils.isEmpty(next)) {
                                VuiSceneManager.this.checkUploadScene(next);
                            }
                        }
                    }
                    if (VuiEngineImpl.mRightPopPanelStack.size() > 0) {
                        Iterator<String> it2 = VuiEngineImpl.mRightPopPanelStack.iterator();
                        while (it2.hasNext()) {
                            String next2 = it2.next();
                            if (!TextUtils.isEmpty(next2)) {
                                VuiSceneManager.this.checkUploadScene(next2);
                            }
                        }
                    }
                }
            });
        } catch (Exception e) {
            e.fillInStackTrace();
            LogUtils.e("VuiSceneManager", "sendSceneData e:" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUploadScene(String str) {
        VuiSceneCache sceneCache;
        int fusionType;
        VuiDisplayLocationInfoCache vuiDisplayLocationInfoCache;
        List<bin> cache;
        if (!isUploadScene(str) || (sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.UPDATE.getType())) == null || (fusionType = sceneCache.getFusionType(str)) == VuiSceneCacheFactory.CacheType.DEFAULT.getType()) {
            return;
        }
        VuiScene build = new VuiScene.Builder().sceneId(str).appVersion(this.mPackageVersion).packageName(this.mPackageName).timestamp(System.currentTimeMillis()).build();
        if (fusionType == VuiSceneCacheFactory.CacheType.UPDATE.getType()) {
            build.setElements(sceneCache.getCache(str));
            sendSceneData(1, false, build, false);
        } else if (fusionType == VuiSceneCacheFactory.CacheType.BUILD.getType()) {
            VuiSceneCache sceneCache2 = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
            if (sceneCache2 == null || (cache = sceneCache2.getCache(str)) == null || cache.isEmpty()) {
                return;
            }
            build.setElements(sceneCache2.getCache(str));
            sendSceneData(0, false, build, false);
        } else if (fusionType == VuiSceneCacheFactory.CacheType.REMOVE.getType()) {
            VuiSceneRemoveCache vuiSceneRemoveCache = (VuiSceneRemoveCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.REMOVE.getType());
            if (vuiSceneRemoveCache != null) {
                sendSceneData(3, false, str + ListSignBean.COLLECTID_SUFFIX + vuiSceneRemoveCache.getRemoveCache(str).toString().replace("[", "").replace("]", ""), false);
            }
        } else if (fusionType != VuiSceneCacheFactory.CacheType.DISPLAY_LOCATION.getType() || (vuiDisplayLocationInfoCache = (VuiDisplayLocationInfoCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.DISPLAY_LOCATION.getType())) == null) {
        } else {
            String displayCache = vuiDisplayLocationInfoCache.getDisplayCache(build.getSceneId());
            if (TextUtils.isEmpty(displayCache)) {
                return;
            }
            build.setDisplayLocation(displayCache);
            updateDisplayLocation(build, true);
        }
    }

    public void sendSceneData(int i, boolean z, Object obj) {
        sendSceneData(i, z, obj, true);
    }

    public void sendSceneData(final int i, boolean z, final Object obj, boolean z2) {
        Handler handler;
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.arg1 = i;
        obtainMessage.what = SEND_UPLOAD_MESSAGE;
        obtainMessage.arg2 = z ? 1 : 0;
        obtainMessage.obj = obj;
        this.mHandler.sendMessage(obtainMessage);
        if (VuiUtils.is3DUIPlatForm() && z2 && (handler = this.mLocalVuiRouterHandler) != null && obj != null && (obj instanceof VuiScene)) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.13
                @Override // java.lang.Runnable
                public void run() {
                    int i2 = i;
                    if (i2 == 3) {
                        VuiScene vuiScene = (VuiScene) obj;
                        if (vuiScene == null || TextUtils.isEmpty(vuiScene.getSceneId())) {
                            return;
                        }
                        VuiSceneManager.this.deleteVuiSceneById(vuiScene.getSceneId());
                    } else if (i2 != 5) {
                        switch (i2) {
                            case 0:
                                VuiScene vuiScene2 = (VuiScene) obj;
                                String vuiSceneConvertToString = VuiUtils.vuiSceneConvertToString(vuiScene2);
                                if (TextUtils.isEmpty(vuiSceneConvertToString)) {
                                    return;
                                }
                                VuiSceneManager.this.insertVuiSceneToProvider(vuiScene2.getSceneId(), vuiSceneConvertToString, "build");
                                return;
                            case 1:
                                VuiScene vuiScene3 = (VuiScene) obj;
                                String vuiSceneConvertToString2 = VuiUtils.vuiSceneConvertToString(vuiScene3);
                                if (TextUtils.isEmpty(vuiSceneConvertToString2)) {
                                    return;
                                }
                                VuiSceneManager.this.insertVuiSceneToProvider(vuiScene3.getSceneId(), vuiSceneConvertToString2, "update");
                                return;
                            default:
                                return;
                        }
                    } else {
                        VuiScene vuiScene4 = (VuiScene) obj;
                        String vuiSceneConvertToString3 = VuiUtils.vuiSceneConvertToString(vuiScene4);
                        if (TextUtils.isEmpty(vuiSceneConvertToString3)) {
                            return;
                        }
                        VuiSceneManager.this.insertVuiSceneToProvider(vuiScene4.getSceneId(), vuiSceneConvertToString3, "display");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class Holder {
        private static final VuiSceneManager Instance = new VuiSceneManager();

        private Holder() {
        }
    }

    public void buildScene(final VuiScene vuiScene, final boolean z, final boolean z2) {
        Handler handler = this.mApiRouterHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.14
                @Override // java.lang.Runnable
                public void run() {
                    VuiScene vuiScene2;
                    String sceneId;
                    if (VuiUtils.cannotUpload() || (vuiScene2 = vuiScene) == null || vuiScene2.getElements() == null || vuiScene.getElements().size() < 0 || (sceneId = vuiScene.getSceneId()) == null) {
                        return;
                    }
                    VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                    if (z || z2 || !sceneCache.getUploadedState(sceneId)) {
                        if (sceneCache != null && z) {
                            List<bin> cache = sceneCache.getCache(sceneId);
                            if (cache != null && !cache.isEmpty()) {
                                vuiScene.setElements(sceneCache.getUpdateFusionCache(sceneId, vuiScene.getElements(), false));
                            }
                            sceneCache.setCache(sceneId, vuiScene.getElements());
                        }
                        String vuiSceneConvertToString = VuiUtils.vuiSceneConvertToString(vuiScene);
                        VuiSceneInfo sceneInfo = VuiSceneManager.instance().getSceneInfo(sceneId);
                        if (sceneInfo != null && sceneInfo.isWholeScene() && sceneInfo.isFull()) {
                            sceneInfo.setLastAddStr(null);
                            sceneInfo.setLastUpdateStr(null);
                            LogUtils.logDebug("VuiSceneManager", "build full_scene_info:" + vuiSceneConvertToString);
                            if (VuiSceneManager.this.isUploadScene(sceneId)) {
                                Uri.Builder builder = new Uri.Builder();
                                builder.authority(VuiSceneManager.this.getAuthority()).path("buildScene").appendQueryParameter(VuiConstants.SCENE_ID, sceneId).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, vuiScene.getPackageName()).appendQueryParameter("packageVersion", vuiScene.getVersion()).appendQueryParameter("sceneData", vuiSceneConvertToString);
                                try {
                                    LogUtils.logDebug("VuiSceneManager", " send buildScene to CarSpeech" + sceneId);
                                    if (sceneCache != null) {
                                        sceneCache.setUploadedState(sceneId, false);
                                    }
                                    String str = (String) abt.a(builder.build());
                                    if (!TextUtils.isEmpty(str) && sceneCache != null) {
                                        sceneCache.setUploadedState(sceneId, true);
                                    }
                                    LogUtils.logInfo("VuiSceneManager", " send buildScene to CarSpeech success" + sceneId + ",result:" + str);
                                } catch (RemoteException e) {
                                    e.printStackTrace();
                                    if (sceneCache != null) {
                                        sceneCache.setUploadedState(sceneId, false);
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public void addSceneElement(final VuiScene vuiScene, final String str) {
        Handler handler = this.mApiRouterHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.15
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (VuiUtils.cannotUpload()) {
                            return;
                        }
                        String vuiSceneConvertToString = VuiUtils.vuiSceneConvertToString(vuiScene);
                        Uri.Builder builder = new Uri.Builder();
                        builder.authority(VuiSceneManager.this.getAuthority()).path("addSceneElement").appendQueryParameter(VuiConstants.SCENE_ID, vuiScene.getSceneId()).appendQueryParameter("parentId", str).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, vuiScene.getPackageName()).appendQueryParameter("packageVersion", vuiScene.getVersion()).appendQueryParameter("sceneData", vuiSceneConvertToString);
                        LogUtils.logDebug("VuiSceneManager", "addSceneElement to CarSpeech " + vuiScene.getSceneId());
                        LogUtils.logInfo("VuiSceneManager", "addSceneElement to CarSpeech success" + vuiScene.getSceneId() + ",result:" + ((String) abt.a(builder.build())));
                    } catch (Exception e) {
                        e.printStackTrace();
                        LogUtils.e("VuiSceneManager", "addSceneElement e:" + e.getMessage());
                    }
                }
            });
        }
    }

    public void addSceneElementGroup(final VuiScene vuiScene, boolean z) {
        Handler handler = this.mApiRouterHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.16
                @Override // java.lang.Runnable
                public void run() {
                    VuiScene vuiScene2;
                    String sceneId;
                    VuiSceneRemoveCache vuiSceneRemoveCache;
                    List<bin> elements;
                    if (VuiUtils.cannotUpload() || (vuiScene2 = vuiScene) == null || (sceneId = vuiScene2.getSceneId()) == null) {
                        return;
                    }
                    VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.UPDATE.getType());
                    VuiSceneCache sceneCache2 = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                    int type = VuiSceneCacheFactory.CacheType.DEFAULT.getType();
                    List<bin> list = null;
                    if (sceneCache != null) {
                        type = sceneCache.getFusionType(sceneId);
                        if (type == VuiSceneCacheFactory.CacheType.UPDATE.getType()) {
                            list = sceneCache.getUpdateFusionCache(sceneId, vuiScene.getElements(), false);
                        } else if (type == VuiSceneCacheFactory.CacheType.BUILD.getType()) {
                            if (sceneCache2 != null) {
                                list = sceneCache2.getFusionCache(sceneId, vuiScene.getElements(), false);
                            }
                        } else if (type == VuiSceneCacheFactory.CacheType.REMOVE.getType() && (vuiSceneRemoveCache = (VuiSceneRemoveCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.REMOVE.getType())) != null && (elements = vuiScene.getElements()) != null && elements.size() == 1) {
                            vuiSceneRemoveCache.deleteRemoveIdFromCache(sceneId, vuiScene.getElements().get(0).id);
                        }
                        if (list != null) {
                            vuiScene.setElements(list);
                        }
                    }
                    if (VuiSceneManager.this.isUploadScene(sceneId)) {
                        if (type == VuiSceneCacheFactory.CacheType.BUILD.getType()) {
                            VuiSceneManager.this.sendBuildCacheInOther(sceneId, vuiScene, sceneCache2);
                            return;
                        }
                        String vuiSceneConvertToString = VuiUtils.vuiSceneConvertToString(vuiScene);
                        Uri.Builder builder = new Uri.Builder();
                        builder.authority(VuiSceneManager.this.getAuthority()).path("addSceneElementGroup").appendQueryParameter(VuiConstants.SCENE_ID, sceneId).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, vuiScene.getPackageName()).appendQueryParameter("packageVersion", vuiScene.getVersion()).appendQueryParameter("sceneData", vuiSceneConvertToString);
                        try {
                            LogUtils.logDebug("VuiSceneManager", "addSceneElementGroup to CarSpeech " + sceneId);
                            String str = (String) abt.a(builder.build());
                            LogUtils.logInfo("VuiSceneManager", "addSceneElementGroup to CarSpeech success " + sceneId + ",result:" + str);
                            if (TextUtils.isEmpty(str)) {
                                if (sceneCache != null) {
                                    sceneCache.setCache(sceneId, vuiScene.getElements());
                                }
                            } else if (type == VuiSceneCacheFactory.CacheType.UPDATE.getType()) {
                                sceneCache.removeCache(sceneId);
                            }
                        } catch (RemoteException e) {
                            LogUtils.e("VuiSceneManager", "addSceneElementGroup " + e.fillInStackTrace());
                            e.printStackTrace();
                            if (sceneCache != null) {
                                sceneCache.setCache(sceneId, vuiScene.getElements());
                            }
                        }
                        if (sceneCache2 != null) {
                            List<bin> fusionCache = sceneCache2.getFusionCache(sceneId, vuiScene.getElements(), false);
                            if (fusionCache != null) {
                                sceneCache2.setCache(sceneId, fusionCache);
                            }
                            vuiScene.setElements(fusionCache);
                        }
                        if ("user".equals(Build.TYPE) || LogUtils.getLogLevel() > LogUtils.LOG_DEBUG_LEVEL) {
                            return;
                        }
                        LogUtils.logDebug("VuiSceneManager", "addSceneElementGroup full_scene_info:" + VuiUtils.vuiSceneConvertToString(vuiScene));
                        return;
                    }
                    if (type != VuiSceneCacheFactory.CacheType.BUILD.getType()) {
                        if (sceneCache != null) {
                            sceneCache.setCache(sceneId, vuiScene.getElements());
                        }
                        if (sceneCache2 != null) {
                            List<bin> fusionCache2 = sceneCache2.getFusionCache(sceneId, vuiScene.getElements(), false);
                            if (fusionCache2 != null) {
                                sceneCache2.setCache(sceneId, fusionCache2);
                            }
                            vuiScene.setElements(fusionCache2);
                        }
                    } else if (sceneCache2 != null) {
                        sceneCache2.setCache(sceneId, vuiScene.getElements());
                    }
                    if ("user".equals(Build.TYPE) || LogUtils.getLogLevel() > LogUtils.LOG_DEBUG_LEVEL) {
                        return;
                    }
                    LogUtils.logDebug("VuiSceneManager", "addSceneElementGroup from full_scene_info:" + VuiUtils.vuiSceneConvertToString(vuiScene));
                }
            });
        }
    }

    public void removeSceneElementGroup(final String str, final String str2, final boolean z) {
        Handler handler = this.mApiRouterHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.17
                @Override // java.lang.Runnable
                public void run() {
                    if (VuiUtils.cannotUpload()) {
                        return;
                    }
                    VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.UPDATE.getType());
                    VuiSceneCache sceneCache2 = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                    VuiSceneRemoveCache vuiSceneRemoveCache = (VuiSceneRemoveCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.REMOVE.getType());
                    String str3 = str2;
                    if (str == null || str3 == null) {
                        return;
                    }
                    VuiScene build = new VuiScene.Builder().sceneId(str).packageName(VuiSceneManager.this.mPackageName).appVersion(VuiSceneManager.this.mPackageVersion).timestamp(System.currentTimeMillis()).build();
                    if (!z) {
                        Uri.Builder builder = new Uri.Builder();
                        builder.authority(VuiSceneManager.this.getAuthority()).path("removeSceneElementGroup").appendQueryParameter(VuiConstants.SCENE_ID, str).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, VuiSceneManager.this.mPackageName).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("id", str3).appendQueryParameter("sceneData", VuiUtils.vuiSceneConvertToString(build));
                        try {
                            String str4 = (String) abt.a(builder.build());
                            LogUtils.logInfo("VuiSceneManager", "removeSceneElementGroup to CarSpeech success" + str + ",result:" + str4);
                            if (TextUtils.isEmpty(str4)) {
                                if (vuiSceneRemoveCache != null) {
                                    vuiSceneRemoveCache.setCache(str, str3);
                                }
                            } else if (vuiSceneRemoveCache != null) {
                                vuiSceneRemoveCache.removeCache(str);
                            }
                            return;
                        } catch (RemoteException e) {
                            e.printStackTrace();
                            if (vuiSceneRemoveCache != null) {
                                vuiSceneRemoveCache.setCache(str, str3);
                                return;
                            }
                            return;
                        }
                    }
                    int type = VuiSceneCacheFactory.CacheType.DEFAULT.getType();
                    List<bin> list = null;
                    if (sceneCache != null) {
                        type = sceneCache.getFusionType(str);
                        if (type == VuiSceneCacheFactory.CacheType.UPDATE.getType()) {
                            list = sceneCache.removeElementFromCache(str, str3);
                        } else if (type == VuiSceneCacheFactory.CacheType.BUILD.getType()) {
                            if (sceneCache2 != null) {
                                list = sceneCache2.removeElementFromCache(str, str3);
                            }
                        } else if (type == VuiSceneCacheFactory.CacheType.REMOVE.getType() && vuiSceneRemoveCache != null) {
                            vuiSceneRemoveCache.getRemoveCache(str).add(str3);
                            str3 = VuiSceneManager.this.sceneIds.toString().replace("[", "").replace("]", "");
                        }
                        if (list != null) {
                            if (!list.isEmpty()) {
                                build.setElements(list);
                            } else {
                                VuiSceneManager.this.removeSceneElementGroup(str, str3, z);
                                return;
                            }
                        }
                    }
                    if (VuiSceneManager.this.isUploadScene(str)) {
                        if (type == VuiSceneCacheFactory.CacheType.BUILD.getType()) {
                            VuiSceneManager.this.sendBuildCacheInOther(str, build, sceneCache2);
                            return;
                        } else if (type == VuiSceneCacheFactory.CacheType.UPDATE.getType()) {
                            VuiSceneManager.this.updateDynamicScene(build, true);
                            return;
                        } else {
                            Uri.Builder builder2 = new Uri.Builder();
                            builder2.authority(VuiSceneManager.this.getAuthority()).path("removeSceneElementGroup").appendQueryParameter(VuiConstants.SCENE_ID, str).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, VuiSceneManager.this.mPackageName).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("id", str3).appendQueryParameter("sceneData", VuiUtils.vuiSceneConvertToString(build));
                            try {
                                String str5 = (String) abt.a(builder2.build());
                                LogUtils.logInfo("VuiSceneManager", "removeSceneElementGroup to CarSpeech success" + str + ",result:" + str5);
                                if (TextUtils.isEmpty(str5)) {
                                    if (vuiSceneRemoveCache != null) {
                                        vuiSceneRemoveCache.setCache(str, str3);
                                    }
                                } else if (vuiSceneRemoveCache != null) {
                                    vuiSceneRemoveCache.removeCache(str);
                                }
                            } catch (RemoteException e2) {
                                e2.printStackTrace();
                                if (vuiSceneRemoveCache != null) {
                                    vuiSceneRemoveCache.setCache(str, str3);
                                }
                            }
                            if (sceneCache2 != null) {
                                List<bin> removeElementFromCache = sceneCache2.removeElementFromCache(str, str3);
                                if (removeElementFromCache != null) {
                                    sceneCache2.setCache(str, removeElementFromCache);
                                }
                                build.setElements(removeElementFromCache);
                            }
                            if ("user".equals(Build.TYPE) || LogUtils.getLogLevel() > LogUtils.LOG_DEBUG_LEVEL) {
                                return;
                            }
                            LogUtils.logDebug("VuiSceneManager", "removeSceneElementGroup " + VuiUtils.vuiSceneConvertToString(build));
                            return;
                        }
                    }
                    if (type != VuiSceneCacheFactory.CacheType.BUILD.getType()) {
                        if (type == VuiSceneCacheFactory.CacheType.UPDATE.getType()) {
                            if (sceneCache != null) {
                                sceneCache.setCache(str, build.getElements());
                            }
                        } else if (type == VuiSceneCacheFactory.CacheType.REMOVE.getType()) {
                            if (vuiSceneRemoveCache != null) {
                                vuiSceneRemoveCache.setCache(str, str3);
                            }
                        } else if (vuiSceneRemoveCache != null) {
                            vuiSceneRemoveCache.setCache(str, str3);
                        }
                        if (sceneCache2 != null) {
                            List<bin> removeElementFromCache2 = sceneCache2.removeElementFromCache(str, str3);
                            if (removeElementFromCache2 != null) {
                                sceneCache2.setCache(str, removeElementFromCache2);
                            }
                            build.setElements(removeElementFromCache2);
                        }
                    } else if (sceneCache2 != null) {
                        sceneCache2.setCache(str, build.getElements());
                    }
                    if ("user".equals(Build.TYPE) || LogUtils.getLogLevel() > LogUtils.LOG_DEBUG_LEVEL) {
                        return;
                    }
                    LogUtils.logDebug("VuiSceneManager", "removeSceneElementGroup:" + VuiUtils.vuiSceneConvertToString(build));
                }
            });
        }
    }

    public void vuiFeedBack(final View view, final VuiFeedback vuiFeedback) {
        Handler handler = this.mApiRouterHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.18
                @Override // java.lang.Runnable
                public void run() {
                    View view2;
                    if (vuiFeedback == null || (view2 = view) == null) {
                        return;
                    }
                    String str = null;
                    if (view2 != null && view2.getId() != -1 && view.getId() != 0) {
                        str = VuiUtils.getResourceName(view.getId());
                    }
                    if (VuiUtils.is3DUIPlatForm()) {
                        VuiSceneManager.this.vuiFeedBack(str, vuiFeedback.content);
                        return;
                    }
                    Uri.Builder builder = new Uri.Builder();
                    Uri.Builder appendQueryParameter = builder.authority(VuiSceneManager.this.getAuthority()).path("vuiFeedback").appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, VuiSceneManager.this.mPackageName).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("resourceName", str);
                    appendQueryParameter.appendQueryParameter("state", "" + vuiFeedback.state).appendQueryParameter(VuiConstants.ELEMENT_TYPE, vuiFeedback.getFeedbackType().a()).appendQueryParameter("content", vuiFeedback.content);
                    try {
                        LogUtils.logDebug("VuiSceneManager", "vuiFeedBack ");
                        String str2 = (String) abt.a(builder.build());
                        LogUtils.logInfo("VuiSceneManager", "vuiFeedBack success");
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void vuiFeedBack(final String str, final VuiFeedback vuiFeedback) {
        Handler handler = this.mApiRouterHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.19
                @Override // java.lang.Runnable
                public void run() {
                    if (vuiFeedback == null || TextUtils.isEmpty(str)) {
                        return;
                    }
                    String str2 = "";
                    if (VuiUtils.is3DUIPlatForm()) {
                        int intValue = Integer.valueOf(str).intValue();
                        if (intValue != -1 && intValue != 0) {
                            str2 = VuiUtils.getResourceName(intValue);
                        }
                        VuiSceneManager.this.vuiFeedBack(str2, vuiFeedback.content);
                        return;
                    }
                    Uri.Builder builder = new Uri.Builder();
                    Uri.Builder appendQueryParameter = builder.authority(VuiSceneManager.this.getAuthority()).path("vuiFeedback").appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, VuiSceneManager.this.mPackageName).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("resourceName", "");
                    appendQueryParameter.appendQueryParameter("state", "" + vuiFeedback.state).appendQueryParameter(VuiConstants.ELEMENT_TYPE, vuiFeedback.getFeedbackType().a()).appendQueryParameter("content", vuiFeedback.content);
                    try {
                        LogUtils.logDebug("VuiSceneManager", "vuiFeedBack ");
                        String str3 = (String) abt.a(builder.build());
                        LogUtils.logInfo("VuiSceneManager", "vuiFeedBack success");
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void updateSceneElementAttr(final VuiScene vuiScene, boolean z) {
        Handler handler = this.mApiRouterHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.20
                @Override // java.lang.Runnable
                public void run() {
                    VuiScene vuiScene2;
                    String sceneId;
                    if (VuiUtils.cannotUpload() || (vuiScene2 = vuiScene) == null || vuiScene2.getElements() == null || vuiScene.getElements().size() < 0 || (sceneId = vuiScene.getSceneId()) == null) {
                        return;
                    }
                    VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                    VuiSceneCache sceneCache2 = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.UPDATE.getType());
                    int type = VuiSceneCacheFactory.CacheType.DEFAULT.getType();
                    List<bin> list = null;
                    if (sceneCache2 != null) {
                        type = sceneCache2.getFusionType(sceneId);
                        if (type == VuiSceneCacheFactory.CacheType.UPDATE.getType()) {
                            list = sceneCache2.getUpdateFusionCache(sceneId, vuiScene.getElements(), true);
                        } else if (type == VuiSceneCacheFactory.CacheType.BUILD.getType() && sceneCache != null) {
                            list = sceneCache.getFusionCache(sceneId, vuiScene.getElements(), true);
                        }
                        if (list != null) {
                            vuiScene.setElements(list);
                        }
                    }
                    String vuiSceneConvertToString = VuiUtils.vuiSceneConvertToString(vuiScene);
                    if (VuiSceneManager.this.isUploadScene(sceneId)) {
                        if (type == VuiSceneCacheFactory.CacheType.BUILD.getType()) {
                            VuiSceneManager.this.sendBuildCacheInOther(sceneId, vuiScene, sceneCache);
                            return;
                        }
                        Uri.Builder builder = new Uri.Builder();
                        builder.authority(VuiSceneManager.this.getAuthority()).path("updateScene").appendQueryParameter(VuiConstants.SCENE_ID, sceneId).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, vuiScene.getPackageName()).appendQueryParameter("packageVersion", vuiScene.getVersion()).appendQueryParameter("sceneData", vuiSceneConvertToString);
                        try {
                            LogUtils.logDebug("VuiSceneManager", " updateSceneElementAttr to CarSpeech" + sceneId);
                            String str = (String) abt.a(builder.build());
                            LogUtils.logInfo("VuiSceneManager", "updateSceneElementAttr to CarSpeech success" + sceneId + ",result:" + str);
                            if (TextUtils.isEmpty(str)) {
                                if (sceneCache2 != null) {
                                    sceneCache2.setCache(sceneId, vuiScene.getElements());
                                }
                            } else if (sceneCache2 != null) {
                                sceneCache2.removeCache(sceneId);
                            }
                        } catch (RemoteException e) {
                            e.printStackTrace();
                            LogUtils.e("VuiSceneManager", "updateSceneElementAttr " + e.fillInStackTrace());
                            if (sceneCache2 != null) {
                                sceneCache2.setCache(sceneId, vuiScene.getElements());
                            }
                        }
                        if (sceneCache != null) {
                            List<bin> fusionCache = sceneCache.getFusionCache(sceneId, vuiScene.getElements(), true);
                            if (fusionCache != null) {
                                sceneCache.setCache(sceneId, fusionCache);
                            }
                            vuiScene.setElements(fusionCache);
                        }
                        if ("user".equals(Build.TYPE) || LogUtils.getLogLevel() > LogUtils.LOG_DEBUG_LEVEL) {
                            return;
                        }
                        LogUtils.logDebug("VuiSceneManager", "updateSceneElementAttr " + VuiUtils.vuiSceneConvertToString(vuiScene));
                        return;
                    }
                    if (type != VuiSceneCacheFactory.CacheType.BUILD.getType()) {
                        if (sceneCache2 != null) {
                            sceneCache2.setCache(sceneId, ((VuiScene) new Gson().fromJson(vuiSceneConvertToString, (Class<Object>) VuiScene.class)).getElements());
                        }
                        if (sceneCache != null) {
                            List<bin> fusionCache2 = sceneCache.getFusionCache(sceneId, vuiScene.getElements(), true);
                            if (fusionCache2 != null) {
                                sceneCache.setCache(sceneId, fusionCache2);
                            }
                            vuiScene.setElements(fusionCache2);
                        }
                    } else if (sceneCache != null) {
                        sceneCache.setCache(sceneId, vuiScene.getElements());
                    }
                    if ("user".equals(Build.TYPE) || LogUtils.getLogLevel() > LogUtils.LOG_DEBUG_LEVEL) {
                        return;
                    }
                    LogUtils.logDebug("VuiSceneManager", "updateSceneElementAttr cache" + VuiUtils.vuiSceneConvertToString(vuiScene));
                }
            });
        }
    }

    public void updateDynamicScene(final VuiScene vuiScene, final boolean z) {
        Handler handler = this.mApiRouterHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.21
                @Override // java.lang.Runnable
                public void run() {
                    VuiScene vuiScene2;
                    String sceneId;
                    if (VuiUtils.cannotUpload() || (vuiScene2 = vuiScene) == null || vuiScene2.getElements() == null || vuiScene.getElements().size() < 0 || (sceneId = vuiScene.getSceneId()) == null || VuiSceneManager.this.getSceneInfo(sceneId) == null) {
                        return;
                    }
                    VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                    VuiSceneCache sceneCache2 = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.UPDATE.getType());
                    if (!z) {
                        if (VuiSceneManager.this.isUploadScene(sceneId) && sceneCache2.getFusionType(sceneId) == VuiSceneCacheFactory.CacheType.UPDATE.getType()) {
                            String vuiSceneConvertToString = VuiUtils.vuiSceneConvertToString(vuiScene);
                            Uri.Builder builder = new Uri.Builder();
                            builder.authority(VuiSceneManager.this.getAuthority()).path("updateScene").appendQueryParameter(VuiConstants.SCENE_ID, sceneId).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, vuiScene.getPackageName()).appendQueryParameter("packageVersion", vuiScene.getVersion()).appendQueryParameter("sceneData", vuiSceneConvertToString);
                            try {
                                LogUtils.logDebug("VuiSceneManager", " updateScene to CarSpeech " + sceneId);
                                String str = (String) abt.a(builder.build());
                                if (TextUtils.isEmpty(str)) {
                                    if (sceneCache2 != null) {
                                        sceneCache2.setCache(sceneId, vuiScene.getElements());
                                    }
                                } else if (sceneCache2 != null) {
                                    sceneCache2.removeCache(sceneId);
                                }
                                LogUtils.logInfo("VuiSceneManager", " updateScene to CarSpeech success" + sceneId + ",result:" + str);
                                return;
                            } catch (RemoteException e) {
                                e.printStackTrace();
                                LogUtils.e("VuiSceneManager", "updateScene " + e.fillInStackTrace());
                                if (sceneCache2 != null) {
                                    sceneCache2.setCache(sceneId, vuiScene.getElements());
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    int type = VuiSceneCacheFactory.CacheType.DEFAULT.getType();
                    List<bin> list = null;
                    if (sceneCache2 != null) {
                        type = sceneCache2.getFusionType(sceneId);
                        if (type == VuiSceneCacheFactory.CacheType.UPDATE.getType()) {
                            list = sceneCache2.getUpdateFusionCache(sceneId, vuiScene.getElements(), false);
                        } else if (type == VuiSceneCacheFactory.CacheType.BUILD.getType() && sceneCache != null) {
                            list = sceneCache.getCache(sceneId);
                        }
                        if (list != null) {
                            vuiScene.setElements(list);
                        }
                    }
                    if (VuiSceneManager.this.isUploadScene(sceneId)) {
                        if (type == VuiSceneCacheFactory.CacheType.BUILD.getType()) {
                            VuiSceneManager.this.sendBuildCacheInOther(sceneId, vuiScene, sceneCache);
                            return;
                        }
                        String vuiSceneConvertToString2 = VuiUtils.vuiSceneConvertToString(vuiScene);
                        Uri.Builder builder2 = new Uri.Builder();
                        builder2.authority(VuiSceneManager.this.getAuthority()).path("updateScene").appendQueryParameter(VuiConstants.SCENE_ID, sceneId).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, vuiScene.getPackageName()).appendQueryParameter("packageVersion", vuiScene.getVersion()).appendQueryParameter("sceneData", vuiSceneConvertToString2);
                        try {
                            LogUtils.logDebug("VuiSceneManager", " updateScene to CarSpeech" + sceneId);
                            String str2 = (String) abt.a(builder2.build());
                            LogUtils.logInfo("VuiSceneManager", "updateScene to CarSpeech success" + sceneId + ",result:" + str2);
                            if (TextUtils.isEmpty(str2)) {
                                if (sceneCache2 != null) {
                                    sceneCache2.setCache(sceneId, vuiScene.getElements());
                                }
                            } else if (sceneCache2 != null) {
                                sceneCache2.removeCache(sceneId);
                            }
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                            LogUtils.e("VuiSceneManager", "updateScene " + e2.fillInStackTrace());
                            if (sceneCache2 != null) {
                                sceneCache2.setCache(sceneId, vuiScene.getElements());
                            }
                        }
                    } else if (type == VuiSceneCacheFactory.CacheType.BUILD.getType() || sceneCache2 == null) {
                    } else {
                        sceneCache2.setCache(sceneId, vuiScene.getElements());
                    }
                }
            });
        }
    }

    public String enterScene(final String str, final String str2, boolean z, final String str3) {
        String str4;
        if (str == null || str2 == null) {
            return "";
        }
        str4 = "";
        try {
        } catch (Exception e) {
            LogUtils.e("VuiSceneManager", "enterScene--------------e: " + e.fillInStackTrace());
            e.printStackTrace();
        }
        if (VuiUtils.canUseVuiFeature()) {
            int vuiSceneState = getVuiSceneState(str);
            LogUtils.logInfo("VuiSceneManager", "enterScene: sceneState:" + vuiSceneState + ",sceneId:" + str);
            if (vuiSceneState == VuiSceneState.INIT.getState()) {
                if (z) {
                    cleanExpiredSceneTime(str);
                }
                updateSceneState(str, VuiSceneState.ACTIVE.getState());
                str4 = null;
            } else if (vuiSceneState == VuiSceneState.UNACTIVE.getState()) {
                str4 = isNeedBuild(str) ? null : "";
                updateSceneState(str, VuiSceneState.ACTIVE.getState());
            } else if (vuiSceneState == VuiSceneState.IDLE.getState()) {
                LogUtils.e("VuiSceneManager", "未注册场景信息，场景数据将不能使用");
            } else if (vuiSceneState == VuiSceneState.ACTIVE.getState() && isNeedBuild(str)) {
                str4 = null;
            }
            if ("com.xiaopeng.montecarlo".equals(this.mPackageName) && !this.mPackageName.equals(getTopRunningPackageName())) {
                return VuiUtils.cannotUpload() ? "" : str4;
            }
            if (z) {
                if (isUploadScene(str) && !VuiUtils.cannotUpload()) {
                    sendSceneData(str);
                }
                this.mApiRouterHandler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.22
                    @Override // java.lang.Runnable
                    public void run() {
                        String str5;
                        try {
                            if (VuiSceneManager.this.hasProcessFeature()) {
                                Uri.Builder builder = new Uri.Builder();
                                if (VuiUtils.is3DUIPlatForm()) {
                                    builder.authority(VuiSceneManager.this.getAuthority()).path("enterDisplayLocationScene").appendQueryParameter(VuiConstants.SCENE_ID, str).appendQueryParameter("displayLocation", str3).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, str2).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("processName", VuiSceneManager.this.getProcessName());
                                    LogUtils.logDebug("VuiSceneManager", "enterScene:  sceneId:" + str + ",dispalyLocation:" + str3);
                                    str5 = (String) abt.a(builder.build());
                                } else {
                                    builder.authority(VuiSceneManager.this.getAuthority()).path("enterProcessScene").appendQueryParameter(VuiConstants.SCENE_ID, str).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, str2).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("processName", VuiSceneManager.this.getProcessName());
                                    LogUtils.logDebug("VuiSceneManager", "enterScene: sceneId:" + str);
                                    str5 = (String) abt.a(builder.build());
                                }
                                if (TextUtils.isEmpty(str5) && VuiSceneManager.this.mIsInSpeech) {
                                    VuiSceneManager.this.mIsInSpeech = false;
                                }
                                LogUtils.logDebug("VuiSceneManager", "enterScene: sceneId success:" + str + ",result:" + str5);
                                return;
                            }
                            Uri.Builder builder2 = new Uri.Builder();
                            builder2.authority(VuiSceneManager.this.getAuthority()).path("enterScene").appendQueryParameter(VuiConstants.SCENE_ID, str).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, str2).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion);
                            LogUtils.logDebug("VuiSceneManager", "enterScene: sceneId:" + str);
                            if (TextUtils.isEmpty((String) abt.a(builder2.build())) && VuiSceneManager.this.mIsInSpeech) {
                                VuiSceneManager.this.mIsInSpeech = false;
                            }
                            LogUtils.logDebug("VuiSceneManager", "enterScene: sceneId success:" + str);
                        } catch (Exception e2) {
                            LogUtils.e("VuiSceneManager", "enterScene--------------e: " + e2.fillInStackTrace());
                        }
                    }
                });
            }
            return VuiUtils.cannotUpload() ? "" : str4;
        }
        return "";
    }

    private void updateSceneState(String str, int i) {
        VuiSceneInfo sceneInfo = getSceneInfo(str);
        if (sceneInfo != null) {
            sceneInfo.setState(i);
        }
    }

    public void exitScene(String str, String str2, boolean z, String str3) {
        exitScene(str, str2, z, str3, false);
    }

    public void destroyScene(final String str) {
        Handler handler;
        if (str == null || (handler = this.mApiRouterHandler) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.23
            @Override // java.lang.Runnable
            public void run() {
                VuiSceneBuildCache vuiSceneBuildCache = (VuiSceneBuildCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                if (vuiSceneBuildCache != null && vuiSceneBuildCache.getUploadedState(str) && !VuiUtils.cannotUpload()) {
                    try {
                        Uri.Builder builder = new Uri.Builder();
                        if (!VuiSceneManager.this.hasProcessFeature()) {
                            builder.authority(VuiSceneManager.this.getAuthority()).path("destroyScene").appendQueryParameter("sceneIds", str).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, VuiSceneManager.this.mPackageName).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion);
                        } else {
                            builder.authority(VuiSceneManager.this.getAuthority()).path("destroyProcessScene").appendQueryParameter("sceneIds", str).appendQueryParameter(VuiConstants.SCENE_PACKAGE_NAME, VuiSceneManager.this.mPackageName).appendQueryParameter("packageVersion", VuiSceneManager.this.mPackageVersion).appendQueryParameter("processName", VuiSceneManager.this.getProcessName());
                        }
                        LogUtils.logDebug("VuiSceneManager", "destroyScene-------------- " + str);
                        abt.a(builder.build());
                        LogUtils.logDebug("VuiSceneManager", "destroyScene--------------success " + str);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                LogUtils.logDebug("VuiSceneManager", "destory removeAllCache--------------" + str);
                VuiSceneCacheFactory.instance().removeAllCache(str);
            }
        });
    }

    public void cleanExpiredSceneTime(final String str) {
        Handler handler;
        if (str == null || (handler = this.mApiRouterHandler) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaopeng.speech.vui.VuiSceneManager.24
            @Override // java.lang.Runnable
            public void run() {
                Uri.Builder builder = new Uri.Builder();
                builder.authority(VuiSceneManager.this.getAuthority()).path("cleanExpiredSceneTime").appendQueryParameter(VuiConstants.SCENE_ID, str);
                LogUtils.logDebug("VuiSceneManager", "cleanExpiredSceneTime-------------- " + str);
                try {
                    abt.a(builder.build());
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public VuiSceneInfo getSceneInfo(String str) {
        ConcurrentHashMap<String, VuiSceneInfo> concurrentHashMap;
        if (str == null || (concurrentHashMap = this.mVuiSceneInfoMap) == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.mVuiSceneInfoMap.get(str);
    }

    public void setWholeSceneId(String str, String str2) {
        VuiSceneInfo sceneInfo = getSceneInfo(str);
        if (sceneInfo != null) {
            sceneInfo.setWholeSceneId(str2);
            this.mVuiSceneInfoMap.put(str, sceneInfo);
        }
    }

    public void setIsWholeScene(String str, boolean z) {
        VuiSceneInfo sceneInfo = getSceneInfo(str);
        if (sceneInfo != null) {
            sceneInfo.setWholeScene(z);
            this.mVuiSceneInfoMap.put(str, sceneInfo);
        }
    }

    public void addSubSceneIds(String str, List<String> list) {
        VuiSceneInfo vuiSceneInfo;
        if (this.mVuiSceneInfoMap.containsKey(str) && (vuiSceneInfo = this.mVuiSceneInfoMap.get(str)) != null) {
            List<String> subSceneList = vuiSceneInfo.getSubSceneList();
            if (subSceneList == null) {
                subSceneList = new ArrayList<>();
            }
            subSceneList.addAll(list);
            vuiSceneInfo.setSubSceneList(subSceneList);
            this.mVuiSceneInfoMap.put(str, vuiSceneInfo);
        }
    }

    public void removeSubSceneIds(String str, String str2) {
        VuiSceneInfo vuiSceneInfo;
        if (this.mVuiSceneInfoMap.containsKey(str) && (vuiSceneInfo = this.mVuiSceneInfoMap.get(str)) != null) {
            List<String> subSceneList = vuiSceneInfo.getSubSceneList();
            if (subSceneList == null) {
                subSceneList = new ArrayList<>();
            }
            if (subSceneList.contains(str2)) {
                subSceneList.remove(str2);
            }
            vuiSceneInfo.setSubSceneList(subSceneList);
            this.mVuiSceneInfoMap.put(str, vuiSceneInfo);
        }
    }

    public void setSceneIdList(String str, List<String> list) {
        VuiSceneInfo sceneInfo = getSceneInfo(str);
        if (sceneInfo != null) {
            sceneInfo.setIdList(list);
            this.mVuiSceneInfoMap.put(str, sceneInfo);
        }
    }

    public List<String> getSceneIdList(String str) {
        VuiSceneInfo sceneInfo = getSceneInfo(str);
        if (sceneInfo != null) {
            return sceneInfo.getIdList();
        }
        return null;
    }

    public void addVuiSceneListener(String str, View view, bie bieVar, bib bibVar, boolean z) {
        LogUtils.logInfo("VuiSceneManager", "addVuiSceneListener-- " + str + ",needBuild:" + z);
        if (VuiUtils.canUseVuiFeature()) {
            LogUtils.logInfo("VuiSceneManager", "sceneId-- " + str + ",listener:" + bieVar);
            if (TextUtils.isEmpty(str) || bieVar == null) {
                LogUtils.logInfo("VuiSceneManager", "sceneId-- " + str + ",listener:" + bieVar);
                LogUtils.e("VuiSceneManager", "场景注册时所需变量不能为空");
            } else if (view == null && !(bieVar instanceof IXpVuiSceneListener) && !VuiUtils.is3DApp(this.mPackageName) && !VuiUtils.isThirdApp(this.mPackageName) && !str.endsWith("Dialog") && !str.endsWith("dialog")) {
                LogUtils.e("VuiSceneManager", "场景注册时所需变量不能为空");
            } else {
                if (z && (this.mVuiSceneInfoMap.containsKey(str) || this.sceneIds.contains(str))) {
                    if (bieVar != null && bieVar.equals(getVuiSceneListener(str))) {
                        LogUtils.w("VuiSceneManager", "上次场景撤销未调用removeVuiSceneListener或重复创建场景");
                    }
                    VuiSceneCacheFactory.instance().removeAllCache(str);
                }
                VuiSceneInfo vuiSceneInfo = new VuiSceneInfo();
                boolean z2 = true;
                if (this.mVuiSubSceneInfoMap.containsKey(str)) {
                    vuiSceneInfo = this.mVuiSubSceneInfoMap.get(str);
                    this.mVuiSubSceneInfoMap.remove(str);
                } else if (this.mVuiSceneInfoMap.containsKey(str)) {
                    vuiSceneInfo = this.mVuiSceneInfoMap.get(str);
                    if (z) {
                        vuiSceneInfo.reset(true);
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                vuiSceneInfo.setListener(bieVar);
                vuiSceneInfo.setRootView(view);
                vuiSceneInfo.setElementChangedListener(bibVar);
                if (z) {
                    vuiSceneInfo.setState(VuiSceneState.INIT.getState());
                } else if (vuiSceneInfo.isBuildComplete()) {
                    vuiSceneInfo.setState(VuiSceneState.UNACTIVE.getState());
                } else {
                    vuiSceneInfo.reset(false);
                    VuiSceneCacheFactory.instance().removeAllCache(str);
                }
                LogUtils.logDebug("VuiSceneManager", "build:" + vuiSceneInfo.isBuild());
                this.mVuiSceneInfoMap.put(str, vuiSceneInfo);
                if (bieVar != null && z2) {
                    LogUtils.i("VuiSceneManager", "onBuildScene");
                    bieVar.onBuildScene();
                }
                if (this.sceneIds.contains(str)) {
                    return;
                }
                this.sceneIds.add(str);
            }
        }
    }

    public void initSubSceneInfo(String str, String str2) {
        LogUtils.d("VuiSceneManager", "initSubSceneInfo subSceneId:" + str + ",sceneId:" + str2);
        VuiSceneInfo vuiSceneInfo = new VuiSceneInfo();
        if (this.mVuiSubSceneInfoMap.containsKey(str)) {
            vuiSceneInfo = this.mVuiSubSceneInfoMap.get(str);
        }
        vuiSceneInfo.setWholeScene(false);
        vuiSceneInfo.setWholeSceneId(str2);
        this.mVuiSubSceneInfoMap.put(str, vuiSceneInfo);
    }

    public void removeVuiSceneListener(String str, boolean z, boolean z2, bie bieVar) {
        if (VuiUtils.canUseVuiFeature()) {
            if (str == null) {
                LogUtils.e("VuiSceneManager", "销毁场景时SceneId不能为空");
                return;
            }
            if (!this.mVuiSceneInfoMap.containsKey(str) || !this.sceneIds.contains(str)) {
                LogUtils.w("VuiSceneManager", "销毁场景前请先注册场景，重复销毁信息");
            }
            if (this.mVuiSceneInfoMap.containsKey(str)) {
                VuiSceneInfo vuiSceneInfo = this.mVuiSceneInfoMap.get(str);
                if (bieVar != null && vuiSceneInfo.getListener() != null && !bieVar.equals(vuiSceneInfo.getListener())) {
                    LogUtils.w("VuiSceneManager", "要销毁的场景和目前持有的场景数据不一致");
                    return;
                } else if (z2) {
                    LogUtils.logInfo("VuiSceneManager", "removeVuiSceneListener-------------- " + z2 + ",info:" + vuiSceneInfo);
                    vuiSceneInfo.resetViewInfo();
                    this.mVuiSceneInfoMap.put(str, vuiSceneInfo);
                } else {
                    List<String> subSceneList = vuiSceneInfo.getSubSceneList();
                    if (subSceneList != null) {
                        for (String str2 : subSceneList) {
                            VuiSceneInfo vuiSceneInfo2 = this.mVuiSceneInfoMap.get(str2);
                            if (vuiSceneInfo2 != null && vuiSceneInfo2.getWholeSceneId() != null && vuiSceneInfo2.getWholeSceneId().contains(str)) {
                                vuiSceneInfo2.getWholeSceneId().remove(str);
                                this.mVuiSceneInfoMap.put(str2, vuiSceneInfo2);
                            }
                        }
                    }
                    vuiSceneInfo.reset(true);
                    this.mVuiSceneInfoMap.remove(str);
                    if (this.sceneIds.contains(str)) {
                        this.sceneIds.remove(str);
                    }
                }
            }
            if (z2) {
                return;
            }
            if (z) {
                destroyScene(str);
            } else {
                VuiSceneCacheFactory.instance().removeAllCache(str);
            }
        }
    }

    public bie getVuiSceneListener(String str) {
        VuiSceneInfo sceneInfo = getSceneInfo(str);
        if (sceneInfo != null) {
            return sceneInfo.getListener();
        }
        return null;
    }

    public View getRootView(String str) {
        VuiSceneInfo sceneInfo = getSceneInfo(str);
        if (sceneInfo != null) {
            return sceneInfo.getRootView();
        }
        return null;
    }

    public void setmPackageName(String str) {
        this.mPackageName = str;
    }

    public void setmPackageVersion(String str) {
        this.mPackageVersion = str;
    }

    public String getmPackageName() {
        return this.mPackageName;
    }

    public String getmPackageVersion() {
        return this.mPackageVersion;
    }

    public boolean getVuiSceneBuild(String str) {
        VuiSceneInfo sceneInfo = getSceneInfo(str);
        if (sceneInfo != null) {
            return sceneInfo.isBuild();
        }
        return false;
    }

    public int getVuiSceneState(String str) {
        VuiSceneInfo sceneInfo = getSceneInfo(str);
        if (sceneInfo != null) {
            return sceneInfo.getState();
        }
        return VuiSceneState.IDLE.getState();
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    private String getTopRunningPackageName() {
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.mContext.getSystemService("activity")).getRunningTasks(1);
        if (runningTasks == null || runningTasks.size() <= 0) {
            return null;
        }
        return runningTasks.get(0).topActivity.getPackageName();
    }

    public String checkScrollSubViewIsVisible(String str, String str2) {
        if (str == null || str2 == null || VuiUtils.cannotUpload()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            JSONArray optJSONArray = jSONObject.optJSONArray(VuiConstants.SCENE_ELEMENTS);
            if (optJSONArray != null || optJSONArray.length() > 0) {
                JSONArray jSONArray = new JSONArray();
                if (!VuiUtils.is3DApp(VuiUtils.getPackageNameFromSceneId(str))) {
                    JSONObject jSONObject2 = null;
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("elementId");
                            String optString2 = optJSONObject.optString("scrollViewId");
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("elementId", optString);
                            VuiEventInfo findView = findView(str, optString);
                            VuiEventInfo findView2 = findView(str, optString2);
                            if (findView != null && findView.hitView != null) {
                                if (findView2 != null && findView2.hitView != null) {
                                    if (findView2.hitView instanceof ScrollView) {
                                        Rect rect = new Rect();
                                        findView2.hitView.getHitRect(rect);
                                        if (findView.hitView.getLocalVisibleRect(rect)) {
                                            jSONObject3.put("visible", true);
                                        } else {
                                            jSONObject3.put("visible", false);
                                        }
                                    }
                                } else {
                                    jSONObject3.put("visible", true);
                                }
                            }
                            jSONObject2 = jSONObject3;
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put(VuiConstants.SCENE_ELEMENTS, jSONArray);
                return String.valueOf(jSONObject);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getElementState(String str, String str2) {
        bin vuiElementById;
        ViewPager viewPager;
        JSONObject vuiProps;
        if (str == null || str2 == null || VuiUtils.cannotUpload() || (vuiElementById = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType()).getVuiElementById(str, str2)) == null) {
            return null;
        }
        boolean is3DApp = VuiUtils.is3DApp(VuiUtils.getPackageNameFromSceneId(str));
        bie vuiSceneListener = instance().getVuiSceneListener(str);
        VuiEventInfo findView = (VuiUtils.isThirdApp(VuiUtils.getPackageNameFromSceneId(str)) || is3DApp || (vuiSceneListener != null && (vuiSceneListener instanceof IXpVuiSceneListener))) ? null : findView(str, str2);
        if (bih.RECYCLEVIEW.a().equals(vuiElementById.getType())) {
            if (findView != null && findView.hitView != null && (findView.hitView instanceof RecyclerView)) {
                RecyclerView recyclerView = (RecyclerView) findView.hitView;
                if ((recyclerView instanceof bhz) && (vuiProps = ((bhz) recyclerView).getVuiProps()) != null && vuiProps.has(VuiConstants.PROPS_DISABLETPL)) {
                    try {
                        if (vuiProps.getBoolean(VuiConstants.PROPS_DISABLETPL)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(VuiConstants.PROPS_SCROLLUP, true);
                            jSONObject.put(VuiConstants.PROPS_SCROLLDOWN, true);
                            return jSONObject.toString();
                        }
                    } catch (Exception unused) {
                    }
                }
                boolean canScrollVertically = recyclerView.canScrollVertically(-1);
                boolean canScrollVertically2 = recyclerView.canScrollVertically(1);
                boolean canScrollHorizontally = recyclerView.canScrollHorizontally(-1);
                boolean canScrollHorizontally2 = recyclerView.canScrollHorizontally(1);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (((bhz) recyclerView).getVuiAction().equals(big.SCROLLBYY.a())) {
                        jSONObject2.put(VuiConstants.PROPS_SCROLLUP, canScrollVertically);
                        jSONObject2.put(VuiConstants.PROPS_SCROLLDOWN, canScrollVertically2);
                    } else {
                        jSONObject2.put(VuiConstants.PROPS_SCROLLLEFT, canScrollHorizontally);
                        jSONObject2.put(VuiConstants.PROPS_SCROLLRIGHT, canScrollHorizontally2);
                    }
                    LogUtils.logInfo("VuiSceneManager", "getElementState jsonObject: " + jSONObject2.toString() + ",sceneId:" + str + ",elementId:" + str2);
                    return jSONObject2.toString();
                } catch (JSONException e) {
                    LogUtils.e("VuiSceneManager", "getElementState e:" + e.getMessage());
                    return null;
                }
            } else if (vuiElementById.getProps() != null) {
                return vuiElementById.getProps().toString();
            } else {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(VuiConstants.PROPS_SCROLLUP, true);
                    jSONObject3.put(VuiConstants.PROPS_SCROLLDOWN, true);
                    LogUtils.logInfo("VuiSceneManager", "getElementState jsonObject: " + jSONObject3.toString() + ",sceneId:" + str + ",elementId:" + str2);
                    return jSONObject3.toString();
                } catch (JSONException e2) {
                    LogUtils.e("VuiSceneManager", "getElementState e:" + e2.getMessage());
                    return null;
                }
            }
        }
        if (bih.VIEWPAGER.a().equals(vuiElementById.getType())) {
            if (VuiUtils.getExtraPage(vuiElementById) != -1) {
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(VuiConstants.PROPS_SCROLLLEFT, true);
                    jSONObject4.put(VuiConstants.PROPS_SCROLLRIGHT, true);
                    LogUtils.logInfo("VuiSceneManager", "getElementState jsonObject: " + jSONObject4.toString() + ",sceneId:" + str + ",elementId:" + str2);
                    return jSONObject4.toString();
                } catch (JSONException e3) {
                    LogUtils.e("VuiSceneManager", "getElementState e:" + e3.getMessage());
                    return null;
                }
            } else if (findView != null && findView.hitView != null) {
                if (!(findView.hitView instanceof ViewPager)) {
                    viewPager = VuiUtils.findViewPager(findView.hitView);
                } else {
                    viewPager = (ViewPager) findView.hitView;
                }
                if (viewPager != null) {
                    try {
                        boolean canScrollHorizontally3 = viewPager.canScrollHorizontally(-1);
                        boolean canScrollHorizontally4 = viewPager.canScrollHorizontally(1);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put(VuiConstants.PROPS_SCROLLLEFT, canScrollHorizontally3);
                        jSONObject5.put(VuiConstants.PROPS_SCROLLRIGHT, canScrollHorizontally4);
                        LogUtils.logInfo("VuiSceneManager", "getElementState jsonObject: " + jSONObject5.toString() + ",sceneId:" + str + ",elementId:" + str2);
                        return jSONObject5.toString();
                    } catch (JSONException e4) {
                        LogUtils.e("VuiSceneManager", "getElementState e:" + e4.getMessage());
                        return null;
                    }
                }
            }
        } else {
            boolean z = false;
            if (bih.SCROLLVIEW.a().equals(vuiElementById.getType())) {
                if (vuiElementById != null && vuiElementById.getActions() != null) {
                    ArrayList arrayList = new ArrayList(vuiElementById.actions.entrySet());
                    if (!arrayList.isEmpty()) {
                        if (big.SCROLLBYY.a().equals(((Map.Entry) arrayList.get(0)).getKey())) {
                            if (findView != null && findView.hitView != null) {
                                if (findView.hitView instanceof ScrollView) {
                                    View childAt = ((ViewGroup) findView.hitView).getChildAt(0);
                                    if (childAt == null) {
                                        return null;
                                    }
                                    try {
                                        JSONObject jSONObject6 = new JSONObject();
                                        int scrollY = findView.hitView.getScrollY();
                                        jSONObject6.put(VuiConstants.PROPS_SCROLLUP, scrollY != 0);
                                        if (scrollY + findView.hitView.getHeight() != childAt.getMeasuredHeight()) {
                                            z = true;
                                        }
                                        jSONObject6.put(VuiConstants.PROPS_SCROLLDOWN, z);
                                        LogUtils.logInfo("VuiSceneManager", "getElementState jsonObject: " + jSONObject6.toString() + ",sceneId:" + str + ",elementId:" + str2);
                                        return jSONObject6.toString();
                                    } catch (Exception e5) {
                                        e5.printStackTrace();
                                        LogUtils.e("VuiSceneManager", "getElementState e:" + e5.getMessage());
                                        return null;
                                    }
                                }
                                Rect rect = new Rect();
                                findView.hitView.getGlobalVisibleRect(rect);
                                try {
                                    JSONObject jSONObject7 = new JSONObject();
                                    int scrollY2 = findView.hitView.getScrollY();
                                    jSONObject7.put(VuiConstants.PROPS_SCROLLUP, scrollY2 != 0);
                                    if (scrollY2 + rect.height() < findView.hitView.getMeasuredHeight()) {
                                        z = true;
                                    }
                                    jSONObject7.put(VuiConstants.PROPS_SCROLLDOWN, z);
                                    LogUtils.logInfo("VuiSceneManager", "getElementState jsonObject: " + jSONObject7.toString() + ",sceneId:" + str + ",elementId:" + str2);
                                    return jSONObject7.toString();
                                } catch (Exception e6) {
                                    e6.printStackTrace();
                                    LogUtils.e("VuiSceneManager", "getElementState e:" + e6.getMessage());
                                    return null;
                                }
                            }
                        } else if (big.SCROLLBYX.a().equals(((Map.Entry) arrayList.get(0)).getKey()) && findView != null && findView.hitView != null && !(findView.hitView instanceof ScrollView)) {
                            View view = (View) findView.hitView.getParent();
                            if (view.getWidth() < findView.hitView.getWidth()) {
                                try {
                                    JSONObject jSONObject8 = new JSONObject();
                                    int scrollX = view.getScrollX();
                                    LogUtils.e("VuiSceneManager", "view width:" + findView.hitView.getWidth() + ",parent:" + view.getWidth() + ",scrollX:" + scrollX);
                                    jSONObject8.put(VuiConstants.PROPS_SCROLLLEFT, scrollX != 0);
                                    if (scrollX + view.getWidth() < findView.hitView.getWidth()) {
                                        z = true;
                                    }
                                    jSONObject8.put(VuiConstants.PROPS_SCROLLRIGHT, z);
                                    LogUtils.logInfo("VuiSceneManager", "getElementState jsonObject: " + jSONObject8.toString() + ",sceneId:" + str + ",elementId:" + str2);
                                    return jSONObject8.toString();
                                } catch (Exception e7) {
                                    e7.printStackTrace();
                                    LogUtils.e("VuiSceneManager", "getElementState e:" + e7.getMessage());
                                    return null;
                                }
                            }
                        }
                    }
                }
            } else {
                if (findView != null && findView.hitView != null) {
                    vuiElementById.setEnabled(findView.hitView.isEnabled() ? null : false);
                }
                String json = new Gson().toJson(vuiElementById);
                LogUtils.logInfo("VuiSceneManager", "getElementState:  result:  " + json);
                return json;
            }
        }
        return null;
    }

    public VuiEventInfo findView(String str, String str2) {
        View hitView;
        if (str == null || str2 == null) {
            return null;
        }
        try {
            VuiEventInfo findViewFromSceneInfo = findViewFromSceneInfo(str, str2);
            if (findViewFromSceneInfo != null) {
                LogUtils.logDebug("VuiSceneManager", "findViewFromSceneInfo elementId:" + str2 + ",view:" + findViewFromSceneInfo.hitView + ",sceneId:" + findViewFromSceneInfo.sceneId);
                return findViewFromSceneInfo;
            }
            VuiEventInfo findRootView = findRootView(str, str2);
            StringBuilder sb = new StringBuilder();
            sb.append("findView elementId:");
            sb.append(str2);
            sb.append(",rootView:");
            sb.append(findRootView != null ? findRootView.hitView : null);
            sb.append(",sceneId:");
            sb.append(findRootView != null ? findRootView.sceneId : "");
            LogUtils.logDebug("VuiSceneManager", sb.toString());
            if (findRootView != null && findRootView.hitView != null) {
                return new VuiEventInfo(getHitView(findRootView.hitView, str2), findRootView.sceneId);
            }
            VuiSceneInfo sceneInfo = getSceneInfo(str);
            LogUtils.logInfo("VuiSceneManager", "findView view by rootview");
            View rootView = sceneInfo == null ? null : sceneInfo.getRootView();
            if (rootView != null) {
                View hitView2 = getHitView(rootView, str2);
                if (hitView2 == null) {
                    List<String> subSceneList = sceneInfo.getSubSceneList();
                    int size = subSceneList == null ? 0 : subSceneList.size();
                    for (int i = 0; i < size; i++) {
                        String str3 = subSceneList.get(i);
                        VuiSceneInfo sceneInfo2 = TextUtils.isEmpty(str3) ? null : getSceneInfo(str3);
                        View rootView2 = sceneInfo2 == null ? null : sceneInfo2.getRootView();
                        if (rootView2 != null && (hitView = getHitView(rootView2, str2)) != null) {
                            return new VuiEventInfo(hitView, str3);
                        }
                    }
                    return findViewFromSceneInfo;
                }
                return new VuiEventInfo(hitView2, str);
            }
            return findViewFromSceneInfo;
        } catch (Exception e) {
            LogUtils.e("VuiSceneManager", "findView e:" + e.getMessage());
            return null;
        }
    }

    private View getHitView(View view, String str) {
        if (view != null) {
            View findViewWithTag = view.findViewWithTag(str);
            if (findViewWithTag == null) {
                View findViewWithId = findViewWithId(str, view);
                if (findViewWithId != null) {
                    LogUtils.logDebug("VuiSceneManager", "findViewWithId:   Tag====  " + findViewWithId.getTag());
                    return findViewWithId;
                }
                LogUtils.e("VuiSceneManager", "findViewWithId  View is null");
                return findViewWithId;
            }
            return findViewWithTag;
        }
        return null;
    }

    private VuiEventInfo findViewFromSceneInfo(String str, String str2) {
        VuiSceneInfo sceneInfo;
        List<SoftReference<View>> notChildrenViewList;
        if (str != null && str2 != null && (sceneInfo = getSceneInfo(str)) != null && sceneInfo.isContainNotChildrenView() && (notChildrenViewList = sceneInfo.getNotChildrenViewList()) != null) {
            for (int i = 0; i < notChildrenViewList.size(); i++) {
                SoftReference<View> softReference = notChildrenViewList.get(i);
                if (softReference != null && softReference.get() != null) {
                    View findViewWithTag = softReference.get().findViewWithTag(str2);
                    if (findViewWithTag != null) {
                        return new VuiEventInfo(findViewWithTag, str);
                    }
                    View findViewWithId = findViewWithId(str2, softReference.get());
                    if (findViewWithId != null) {
                        LogUtils.logDebug("VuiSceneManager", "findViewWithId:   Tag====  " + findViewWithId.getTag());
                        return new VuiEventInfo(findViewWithId, str);
                    }
                }
            }
        }
        return null;
    }

    private VuiEventInfo findRootView(String str, String str2) {
        VuiSceneInfo sceneInfo;
        VuiEventInfo vuiEventInfo = null;
        if (str == null || str2 == null || (sceneInfo = getSceneInfo(str)) == null) {
            return null;
        }
        LogUtils.logDebug("VuiSceneManager", "findRootView idList:" + sceneInfo.getIdList());
        if (sceneInfo.getIdList() != null && sceneInfo.getIdList().contains(str2)) {
            return new VuiEventInfo(getRootView(str), str);
        }
        List<String> subSceneList = sceneInfo.getSubSceneList();
        if (subSceneList != null) {
            LogUtils.logDebug("VuiSceneManager", "findRootView subSceneList:" + subSceneList);
        }
        if (subSceneList != null) {
            int size = subSceneList.size();
            for (int i = 0; i < size; i++) {
                vuiEventInfo = findRootView(subSceneList.get(i), str2);
                if (vuiEventInfo != null) {
                    return vuiEventInfo;
                }
            }
            return vuiEventInfo;
        }
        return null;
    }

    public View findViewWithId(String str, View view) {
        String substring;
        LogUtils.logInfo("VuiSceneManager", "findViewWithId  ===  " + str);
        if (view == null || str == null) {
            return view;
        }
        if (str.indexOf("_") != -1) {
            String substring2 = str.substring(0, str.indexOf("_"));
            if (TextUtils.isEmpty(substring2)) {
                return null;
            }
            if (substring2.length() > 4) {
                String[] split = str.split("_");
                if (split.length <= 2) {
                    substring = split[1];
                } else {
                    substring = str.substring(str.indexOf("_", 1) + 1, str.indexOf("_", str.indexOf("_") + 1));
                }
                if (substring.length() < 4) {
                    int id = ResourceUtil.getId(this.mContext, substring2);
                    LogUtils.logInfo("VuiSceneManager", "findViewWithId view tag: " + view.findViewById(id).getTag());
                    View listView = getListView(view.findViewById(id));
                    if (listView == null) {
                        return null;
                    }
                    if (listView instanceof RecyclerView) {
                        view = ((RecyclerView) listView).getLayoutManager().c(Integer.valueOf(substring).intValue()).findViewById(id);
                    }
                    return split.length <= 2 ? view : findViewWithId(str.substring(str.indexOf("_", str.indexOf("_") + 1) + 1), view);
                }
                return findViewWithId(str.substring(str.indexOf("_") + 1), view.findViewById(ResourceUtil.getId(this.mContext, substring2)));
            }
            return findViewWithId(str.substring(str.indexOf("_") + 1), view);
        }
        return view.findViewById(ResourceUtil.getId(this.mContext, str));
    }

    private View getListView(View view) {
        if (view == null || (view instanceof ListView) || (view instanceof RecyclerView)) {
            return view;
        }
        if (view.getParent() == null) {
            return null;
        }
        return view.getParent() instanceof ViewRootImpl ? view : getListView((View) view.getParent());
    }

    private View getScrollView(View view) {
        if (view == null || (view instanceof ListView) || (view instanceof ScrollView)) {
            return view;
        }
        if (view.getParent() == null) {
            return null;
        }
        return view.getParent() instanceof ViewRootImpl ? view : getScrollView((View) view.getParent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUploadScene(String str) {
        LogUtils.logDebug("VuiSceneManager", "isUploadScene sceneId:" + str + ",getTopRunningPackageName:" + getTopRunningPackageName() + ",mIsInSpeech:" + this.mIsInSpeech + ",VuiEngine.mLFActiveSceneId:" + VuiEngineImpl.mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_LF) + " VuiEngine.mRFActiveSceneId: " + VuiEngineImpl.mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_RF) + ",mPackageName" + this.mPackageName);
        String str2 = this.mPackageName;
        if (str2 == null || str == null) {
            return false;
        }
        if ("com.android.systemui".equals(str2)) {
            return true;
        }
        if (this.mIsInSpeech && (VuiEngineImpl.mLeftPopPanelStack.contains(str) || VuiEngineImpl.mRightPopPanelStack.contains(str))) {
            return true;
        }
        if (this.mIsInSpeech && VuiEngineImpl.mActiveSceneIds.containsValue(str) && (str.endsWith("Dialog") || str.endsWith("dialog"))) {
            return true;
        }
        if (this.mIsInSpeech && VuiEngineImpl.mActiveSceneIds.containsValue(str) && "com.xiaopeng.carspeechservice".equals(this.mPackageName)) {
            return true;
        }
        if ((this.mIsInSpeech && VuiEngineImpl.mActiveSceneIds.containsValue(str) && ("com.xiaopeng.car.settings".equals(this.mPackageName) || "com.xiaopeng.carcontrol".equals(this.mPackageName) || "com.xiaopeng.chargecontrol".equals(this.mPackageName) || VuiConstants.UNITY.equals(this.mPackageName))) || "com.xiaopeng.caraccount".equals(this.mPackageName)) {
            return true;
        }
        return this.mIsInSpeech && this.mPackageName.equals(getTopRunningPackageName()) && VuiEngineImpl.mActiveSceneIds.containsValue(str);
    }

    public boolean canUpdateScene(String str) {
        if (str == null) {
            return false;
        }
        if (!getVuiSceneBuild(str)) {
            LogUtils.logDebug("VuiSceneManager", str + "场景数据的update必须在场build后");
            return false;
        } else if (getVuiSceneState(str) == VuiSceneState.IDLE.getState()) {
            LogUtils.logDebug("VuiSceneManager", str + "场景数据的build必须在场景被激活后");
            return false;
        } else {
            return true;
        }
    }

    private boolean isNeedBuild(String str) {
        VuiSceneInfo sceneInfo = getSceneInfo(str);
        if (sceneInfo != null) {
            return !sceneInfo.isBuild();
        }
        return true;
    }

    public boolean canRunUpdateSceneTask(String str) {
        List<bin> cache;
        if (str == null || (cache = ((VuiSceneBuildCache) VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType())).getCache(str)) == null || cache.isEmpty()) {
            return false;
        }
        if (getVuiSceneState(str) == VuiSceneState.IDLE.getState()) {
            LogUtils.logDebug("VuiSceneManager", str + "场景数据的build必须在场景被激活后");
            return false;
        }
        return true;
    }

    public void addVuiEventListener(String str, IVuiEventListener iVuiEventListener) {
        VuiSceneInfo sceneInfo;
        LogUtils.logInfo("VuiSceneManager", "addVuiEventListener-- " + str);
        if (!VuiUtils.canUseVuiFeature() || str == null || iVuiEventListener == null || (sceneInfo = getSceneInfo(str)) == null) {
            return;
        }
        sceneInfo.setEventListener(iVuiEventListener);
    }

    public IVuiEventListener getVuiEventListener(String str) {
        VuiSceneInfo sceneInfo = getSceneInfo(str);
        if (sceneInfo == null) {
            return null;
        }
        return sceneInfo.getEventListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendBuildCacheInOther(String str, VuiScene vuiScene, VuiSceneCache vuiSceneCache) {
        VuiSceneInfo sceneInfo = getSceneInfo(str);
        if (sceneInfo == null || !sceneInfo.isBuildComplete()) {
            return;
        }
        buildScene(vuiScene, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAuthority() {
        return !bfj.a() ? VuiConstants.VUI_SCENE_THIRD_AUTHORITY : VuiConstants.VUI_SCENE_AUTHORITY;
    }
}
