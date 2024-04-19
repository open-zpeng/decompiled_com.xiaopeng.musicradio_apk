package com.xiaopeng.speech.vui.task;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.speech.vui.VuiSceneManager;
import com.xiaopeng.speech.vui.cache.VuiSceneCache;
import com.xiaopeng.speech.vui.cache.VuiSceneCacheFactory;
import com.xiaopeng.speech.vui.model.VuiScene;
import com.xiaopeng.speech.vui.model.VuiSceneInfo;
import com.xiaopeng.speech.vui.task.base.BaseTask;
import com.xiaopeng.speech.vui.utils.LogUtils;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class AddSceneTask extends BaseTask {
    private String TAG;
    private TaskWrapper viewWrapper;

    public AddSceneTask(TaskWrapper taskWrapper) {
        super(taskWrapper);
        this.TAG = "VuiEngine_AddSceneTask";
        this.viewWrapper = taskWrapper;
    }

    @Override // com.xiaopeng.speech.vui.task.base.Task
    public void execute() {
        if (this.viewWrapper.isContainNotChildrenView()) {
            addNotChildViewToScene(this.viewWrapper.getViewList(), this.viewWrapper.getSceneId(), this.viewWrapper.getPriority());
        } else if (this.viewWrapper.getPriority() != null) {
            addSceneElementGroup(this.viewWrapper.getView(), this.viewWrapper.getSceneId(), this.viewWrapper.getPriority(), this.viewWrapper.getListener());
        } else {
            addSceneElement(this.viewWrapper.getView(), this.viewWrapper.getParentElementId(), this.viewWrapper.getSceneId());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v5 */
    private void addNotChildViewToScene(List<SoftReference<View>> list, String str, bik bikVar) {
        AddSceneTask addSceneTask;
        ?? r12;
        VuiSceneInfo vuiSceneInfo;
        int i;
        VuiSceneCache vuiSceneCache;
        VuiSceneInfo vuiSceneInfo2;
        ArrayList arrayList;
        VuiScene vuiScene;
        long j;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        AddSceneTask addSceneTask2 = this;
        String str3 = str;
        if (list == null || str3 == null) {
            return;
        }
        try {
            if (VuiSceneManager.instance().canUpdateScene(str3)) {
                ArrayList arrayList4 = new ArrayList();
                long currentTimeMillis = System.currentTimeMillis();
                VuiScene newVuiScene = addSceneTask2.getNewVuiScene(str3, currentTimeMillis);
                ArrayList arrayList5 = new ArrayList();
                List<String> sceneIdList = VuiSceneManager.instance().getSceneIdList(str3);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                VuiSceneInfo sceneInfo = VuiSceneManager.instance().getSceneInfo(str3);
                if (sceneInfo == null) {
                    return;
                }
                bib elementChangedListener = sceneInfo.getElementChangedListener();
                boolean z = true;
                sceneInfo.setContainNotChildrenView(true);
                ArrayList arrayList8 = new ArrayList();
                VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                boolean z2 = false;
                int i2 = 0;
                while (i2 < list.size()) {
                    SoftReference<View> softReference = list.get(i2);
                    if (softReference == null) {
                        i = i2;
                        vuiSceneCache = sceneCache;
                        vuiSceneInfo2 = sceneInfo;
                        arrayList = arrayList5;
                        vuiScene = newVuiScene;
                        j = currentTimeMillis;
                        str2 = str3;
                        addSceneTask = addSceneTask2;
                        ArrayList arrayList9 = arrayList7;
                        arrayList2 = arrayList8;
                        arrayList3 = arrayList9;
                    } else if (softReference.get() instanceof bhz) {
                        boolean z3 = (softReference == null || !(softReference.get() instanceof RecyclerView)) ? z2 : z;
                        i = i2;
                        VuiSceneCache vuiSceneCache2 = sceneCache;
                        ArrayList arrayList10 = arrayList8;
                        vuiSceneInfo2 = sceneInfo;
                        ArrayList arrayList11 = arrayList7;
                        ArrayList arrayList12 = arrayList5;
                        vuiScene = newVuiScene;
                        long j2 = currentTimeMillis;
                        try {
                            bin buildView = buildView(softReference, arrayList5, null, null, arrayList4, currentTimeMillis, sceneIdList, arrayList6, null, 0, (softReference == null || !(softReference.get() instanceof bhz)) ? false : ((bhz) softReference.get()).isVuiLayoutLoadable(), z3, z3 ? null : elementChangedListener);
                            if (buildView == null || buildView.getId() == null) {
                                vuiSceneCache = vuiSceneCache2;
                                arrayList2 = arrayList10;
                                arrayList3 = arrayList11;
                                arrayList = arrayList12;
                                j = j2;
                                addSceneTask = this;
                                str2 = str;
                            } else {
                                j = j2;
                                buildView.setTimestamp(j);
                                addSceneTask = this;
                                addSceneTask.setVuiTag(softReference, buildView.getId());
                                vuiSceneCache = vuiSceneCache2;
                                str2 = str;
                                bin vuiElementById = vuiSceneCache.getVuiElementById(str2, buildView.getId());
                                if (vuiElementById == null) {
                                    arrayList = arrayList12;
                                } else if (buildView.equals(vuiElementById)) {
                                    arrayList2 = arrayList10;
                                    arrayList3 = arrayList11;
                                    arrayList = arrayList12;
                                } else {
                                    arrayList = arrayList12;
                                }
                                arrayList.add(buildView);
                                arrayList2 = arrayList10;
                                arrayList2.add(softReference);
                                arrayList3 = arrayList11;
                                arrayList3.add(buildView.getId());
                            }
                            z2 = z3;
                        } catch (Exception e) {
                            e = e;
                            addSceneTask = this;
                            String str4 = addSceneTask.TAG;
                            LogUtils.e(str4, "addNotChildViewToScene e:" + e.getMessage());
                            return;
                        }
                    } else {
                        i = i2;
                        vuiSceneCache = sceneCache;
                        vuiSceneInfo2 = sceneInfo;
                        arrayList = arrayList5;
                        vuiScene = newVuiScene;
                        j = currentTimeMillis;
                        str2 = str3;
                        addSceneTask = addSceneTask2;
                        ArrayList arrayList13 = arrayList7;
                        arrayList2 = arrayList8;
                        arrayList3 = arrayList13;
                    }
                    try {
                        currentTimeMillis = j;
                        addSceneTask2 = addSceneTask;
                        str3 = str2;
                        sceneCache = vuiSceneCache;
                        i2 = i + 1;
                        newVuiScene = vuiScene;
                        z = true;
                        sceneInfo = vuiSceneInfo2;
                        arrayList5 = arrayList;
                        ArrayList arrayList14 = arrayList2;
                        arrayList7 = arrayList3;
                        arrayList8 = arrayList14;
                    } catch (Exception e2) {
                        e = e2;
                        String str42 = addSceneTask.TAG;
                        LogUtils.e(str42, "addNotChildViewToScene e:" + e.getMessage());
                        return;
                    }
                }
                VuiSceneCache vuiSceneCache3 = sceneCache;
                VuiSceneInfo vuiSceneInfo3 = sceneInfo;
                ArrayList arrayList15 = arrayList5;
                VuiScene vuiScene2 = newVuiScene;
                long j3 = currentTimeMillis;
                String str5 = str3;
                AddSceneTask addSceneTask3 = addSceneTask2;
                ArrayList arrayList16 = arrayList7;
                ArrayList arrayList17 = arrayList8;
                int i3 = 0;
                while (i3 < arrayList15.size()) {
                    bin binVar = arrayList15.get(i3);
                    bin vuiElementById2 = vuiSceneCache3.getVuiElementById(str5, binVar.getId());
                    if (vuiElementById2 == null || !binVar.equals(vuiElementById2)) {
                        i3++;
                    } else {
                        arrayList15.remove(binVar);
                    }
                }
                if (arrayList15.size() > 0) {
                    vuiScene2.setElements(arrayList15);
                    if (!"user".equals(Build.TYPE) && LogUtils.getLogLevel() <= LogUtils.LOG_DEBUG_LEVEL) {
                        String str6 = addSceneTask3.TAG;
                        LogUtils.logDebug(str6, "addNotChildViewToScene completed time:" + (System.currentTimeMillis() - j3) + ListSignBean.COLLECTID_SUFFIX + VuiUtils.vuiUpdateSceneConvertToString(vuiScene2));
                    }
                    if (vuiSceneInfo3.getNotChildrenViewList() != null && vuiSceneInfo3.getNotChildrenViewIdList() != null) {
                        ArrayList arrayList18 = new ArrayList();
                        if (arrayList17.size() < vuiSceneInfo3.getNotChildrenViewList().size()) {
                            for (int i4 = 0; i4 < vuiSceneInfo3.getNotChildrenViewIdList().size(); i4++) {
                                String str7 = vuiSceneInfo3.getNotChildrenViewIdList().get(i4);
                                if (!arrayList16.contains(str7)) {
                                    arrayList18.add(str7);
                                    VuiSceneManager instance = VuiSceneManager.instance();
                                    instance.sendSceneData(3, true, str5 + ListSignBean.COLLECTID_SUFFIX + str7);
                                }
                            }
                            r12 = 1;
                        } else {
                            r12 = 1;
                        }
                        if (arrayList18.size() == vuiSceneInfo3.getNotChildrenViewIdList().size()) {
                            VuiSceneManager.instance().sendSceneData(2, r12, vuiScene2);
                            vuiSceneInfo = vuiSceneInfo3;
                        } else {
                            VuiSceneCache sceneCache2 = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
                            if (sceneCache2 != null) {
                                List<bin> fusionCache = sceneCache2.getFusionCache(str5, arrayList15, false);
                                sceneCache2.setCache(str5, fusionCache);
                                if (!"user".equals(Build.TYPE) && LogUtils.getLogLevel() <= LogUtils.LOG_DEBUG_LEVEL) {
                                    VuiScene newVuiScene2 = addSceneTask3.getNewVuiScene(str5, System.currentTimeMillis());
                                    newVuiScene2.setElements(fusionCache);
                                    String str8 = addSceneTask3.TAG;
                                    LogUtils.logDebug(str8, "addNotChildViewToScene full_scene_info" + VuiUtils.vuiSceneConvertToString(newVuiScene2));
                                }
                            }
                            VuiSceneManager.instance().sendSceneData(r12, r12, vuiScene2);
                            vuiSceneInfo = vuiSceneInfo3;
                        }
                        vuiSceneInfo.setNotChildrenViewList(arrayList17);
                        vuiSceneInfo.setNotChildrenViewIdList(arrayList16);
                        return;
                    }
                    vuiSceneInfo3.setNotChildrenViewList(arrayList17);
                    vuiSceneInfo3.setNotChildrenViewIdList(arrayList16);
                    VuiSceneManager.instance().sendSceneData(2, true, vuiScene2);
                }
            }
        } catch (Exception e3) {
            e = e3;
            addSceneTask = addSceneTask2;
        }
    }

    public void addSceneElementGroup(SoftReference<View> softReference, String str, bik bikVar, bie bieVar) {
        AddSceneTask addSceneTask;
        VuiSceneInfo sceneInfo;
        ArrayList arrayList;
        long j;
        String str2;
        try {
            ArrayList arrayList2 = new ArrayList();
            if (!(softReference instanceof bhz) || !VuiSceneManager.instance().canUpdateScene(str) || (sceneInfo = VuiSceneManager.instance().getSceneInfo(str)) == null) {
                return;
            }
            ((bhz) softReference).setVuiPriority(bikVar);
            long currentTimeMillis = System.currentTimeMillis();
            VuiScene newVuiScene = getNewVuiScene(str, currentTimeMillis);
            ArrayList arrayList3 = new ArrayList();
            List<String> sceneIdList = VuiSceneManager.instance().getSceneIdList(str);
            ArrayList arrayList4 = new ArrayList();
            VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
            try {
                bin buildView = buildView(softReference, arrayList3, null, null, arrayList2, currentTimeMillis, sceneIdList, arrayList4, null, 0, (softReference == null || !(softReference.get() instanceof bhz)) ? false : ((bhz) softReference.get()).isVuiLayoutLoadable(), softReference != null && (softReference.get() instanceof RecyclerView), (softReference == null || !(softReference.get() instanceof RecyclerView)) ? sceneInfo.getElementChangedListener() : null);
                if (buildView == null || buildView.getId() == null) {
                    arrayList = arrayList3;
                    j = currentTimeMillis;
                    addSceneTask = this;
                    str2 = str;
                } else {
                    j = currentTimeMillis;
                    buildView.setTimestamp(j);
                    addSceneTask = this;
                    try {
                        addSceneTask.setVuiTag(softReference, buildView.getId());
                        str2 = str;
                        bin vuiElementById = sceneCache.getVuiElementById(str2, buildView.getId());
                        if (vuiElementById != null) {
                            if (buildView.equals(vuiElementById)) {
                                LogUtils.logDebug(addSceneTask.TAG, "addNotChildViewToScene element same");
                                arrayList = arrayList3;
                            } else {
                                arrayList = arrayList3;
                                arrayList.add(buildView);
                            }
                        } else {
                            arrayList = arrayList3;
                            arrayList.add(buildView);
                        }
                    } catch (Exception e) {
                        e = e;
                        LogUtils.e(addSceneTask.TAG, "addSceneElementGroup e:" + e.getMessage());
                        return;
                    }
                }
                if (arrayList.size() > 0) {
                    newVuiScene.setElements(arrayList);
                    LogUtils.logInfo(addSceneTask.TAG, "addSceneElementGroup completed time:" + (System.currentTimeMillis() - j));
                    if (!"user".equals(Build.TYPE) && LogUtils.getLogLevel() <= LogUtils.LOG_DEBUG_LEVEL) {
                        LogUtils.logDebug(addSceneTask.TAG, "addSceneElementGroup:" + VuiUtils.vuiUpdateSceneConvertToString(newVuiScene));
                    }
                    String str3 = str2 + "_" + ((softReference == null || softReference.get() == null) ? -1 : softReference.get().getId());
                    VuiSceneManager.instance().setSceneIdList(str3, arrayList2);
                    VuiSceneManager.instance().addSubSceneIds(str2, Arrays.asList(str3));
                    if (softReference != null && softReference.get() != null && bieVar != null) {
                        VuiSceneManager.instance().setSceneIdList(str2, sceneIdList);
                        VuiSceneManager.instance().addVuiSceneListener(str3, softReference.get(), bieVar, null, true);
                    }
                    VuiSceneManager.instance().sendSceneData(2, true, newVuiScene);
                }
            } catch (Exception e2) {
                e = e2;
                addSceneTask = this;
            }
        } catch (Exception e3) {
            e = e3;
            addSceneTask = this;
        }
    }

    public void addSceneElement(SoftReference<View> softReference, String str, String str2) {
        VuiSceneInfo sceneInfo;
        ArrayList arrayList;
        long j;
        VuiScene vuiScene;
        ArrayList arrayList2 = new ArrayList();
        if ((softReference instanceof bhz) && VuiSceneManager.instance().canUpdateScene(str2) && (sceneInfo = VuiSceneManager.instance().getSceneInfo(str2)) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            VuiScene newVuiScene = getNewVuiScene(str2, currentTimeMillis);
            ArrayList arrayList3 = new ArrayList();
            List<String> sceneIdList = VuiSceneManager.instance().getSceneIdList(str2);
            ArrayList arrayList4 = new ArrayList();
            boolean z = false;
            boolean isVuiLayoutLoadable = (softReference == null || !(softReference.get() instanceof bhz)) ? false : ((bhz) softReference.get()).isVuiLayoutLoadable();
            if (softReference != null && (softReference.get() instanceof RecyclerView)) {
                z = true;
            }
            bin buildView = buildView(softReference, arrayList3, null, null, arrayList2, currentTimeMillis, sceneIdList, arrayList4, null, 0, isVuiLayoutLoadable, z, (softReference == null || !(softReference.get() instanceof RecyclerView)) ? sceneInfo.getElementChangedListener() : null);
            if (buildView == null || buildView.getId() == null) {
                arrayList = arrayList3;
                j = currentTimeMillis;
                vuiScene = newVuiScene;
            } else {
                j = currentTimeMillis;
                buildView.setTimestamp(j);
                arrayList = arrayList3;
                arrayList.add(buildView);
                vuiScene = newVuiScene;
            }
            vuiScene.setElements(arrayList);
            VuiSceneManager.instance().setSceneIdList(str2, sceneIdList);
            if (!"user".equals(Build.TYPE) && LogUtils.getLogLevel() <= LogUtils.LOG_DEBUG_LEVEL) {
                String str3 = this.TAG;
                LogUtils.logDebug(str3, "addSceneElement:" + VuiUtils.vuiSceneConvertToString(vuiScene) + "time:" + (System.currentTimeMillis() - j));
            }
            VuiSceneManager.instance().addSceneElement(vuiScene, str);
        }
    }

    public List<bin> build(int i, View view) {
        return build(i, view);
    }

    public List<bin> build(int i, List<View> list) {
        return build(i, list);
    }
}
