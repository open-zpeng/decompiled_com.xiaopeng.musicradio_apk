package com.xiaopeng.speech.vui.task;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.speech.vui.VuiSceneManager;
import com.xiaopeng.speech.vui.model.VuiSceneInfo;
import com.xiaopeng.speech.vui.task.base.BaseTask;
import com.xiaopeng.speech.vui.utils.LogUtils;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class RemoveTask extends BaseTask {
    private String TAG;
    private String sceneId;
    private TaskWrapper viewWrapper;

    public RemoveTask(TaskWrapper taskWrapper) {
        super(taskWrapper);
        this.TAG = "VuiEngine_RemoveTask";
        this.viewWrapper = taskWrapper;
        this.sceneId = taskWrapper.getSceneId();
    }

    @Override // com.xiaopeng.speech.vui.task.base.Task
    public void execute() {
        RemoveTask removeTask;
        int i;
        List<SoftReference<View>> list;
        List<String> list2;
        boolean z;
        bib bibVar;
        boolean z2;
        char c;
        RemoveTask removeTask2;
        RemoveTask removeTask3 = this;
        try {
            char c2 = 3;
            boolean z3 = true;
            bib bibVar2 = null;
            boolean z4 = false;
            try {
                if (removeTask3.viewWrapper.getElementGroupId() == null) {
                    VuiSceneInfo sceneInfo = VuiSceneManager.instance().getSceneInfo(removeTask3.sceneId);
                    if (sceneInfo != null) {
                        sceneInfo.setLastAddStr(null);
                    }
                    if (removeTask3.viewWrapper.getViewList() == null) {
                        LogUtils.logInfo(removeTask3.TAG, "RemoveTask: sceneId" + removeTask3.sceneId);
                        if (sceneInfo == null || !sceneInfo.isContainNotChildrenView()) {
                            return;
                        }
                        List<String> notChildrenViewIdList = sceneInfo.getNotChildrenViewIdList();
                        if (notChildrenViewIdList != null) {
                            for (int i2 = 0; i2 < notChildrenViewIdList.size(); i2++) {
                                VuiSceneManager.instance().sendSceneData(3, true, removeTask3.sceneId + ListSignBean.COLLECTID_SUFFIX + notChildrenViewIdList.get(i2));
                            }
                        }
                        sceneInfo.setContainNotChildrenView(false);
                        sceneInfo.setNotChildrenViewIdList(null);
                        sceneInfo.setNotChildrenViewList(null);
                        return;
                    }
                    LogUtils.logDebug(removeTask3.TAG, "RemoveTask: view list" + removeTask3.sceneId);
                    ArrayList arrayList = new ArrayList();
                    long currentTimeMillis = System.currentTimeMillis();
                    List<String> sceneIdList = VuiSceneManager.instance().getSceneIdList(removeTask3.sceneId);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (sceneInfo == null || !sceneInfo.isContainNotChildrenView()) {
                        return;
                    }
                    List<String> notChildrenViewIdList2 = sceneInfo.getNotChildrenViewIdList();
                    List<SoftReference<View>> notChildrenViewList = sceneInfo.getNotChildrenViewList();
                    int i3 = 0;
                    while (i3 < removeTask3.viewWrapper.getViewList().size()) {
                        SoftReference<View> softReference = removeTask3.viewWrapper.getViewList().get(i3);
                        if (!notChildrenViewList.contains(softReference)) {
                            i = i3;
                            list = notChildrenViewList;
                            list2 = notChildrenViewIdList2;
                            z = z4;
                            bibVar = bibVar2;
                            z2 = z3;
                            c = c2;
                            removeTask2 = removeTask3;
                        } else if (softReference == null) {
                            i = i3;
                            list = notChildrenViewList;
                            list2 = notChildrenViewIdList2;
                            z = z4;
                            bibVar = bibVar2;
                            z2 = z3;
                            c = c2;
                            removeTask2 = removeTask3;
                        } else if (softReference.get() instanceof bhz) {
                            i = i3;
                            List<SoftReference<View>> list3 = notChildrenViewList;
                            List<String> list4 = notChildrenViewIdList2;
                            try {
                                bin buildView = buildView(softReference, arrayList3, null, null, arrayList, currentTimeMillis, sceneIdList, arrayList2, null, 0, (softReference == null || !(softReference.get() instanceof bhz)) ? z4 : ((bhz) softReference.get()).isVuiLayoutLoadable(), (softReference == null || !(softReference.get() instanceof RecyclerView)) ? z4 : z3, (softReference == null || !(softReference.get() instanceof RecyclerView)) ? sceneInfo.getElementChangedListener() : bibVar2);
                                if (buildView == null || buildView.getId() == null) {
                                    list = list3;
                                    list2 = list4;
                                    removeTask2 = this;
                                    z2 = true;
                                    c = 3;
                                } else {
                                    list2 = list4;
                                    if (list2.contains(buildView.getId())) {
                                        VuiSceneManager instance = VuiSceneManager.instance();
                                        StringBuilder sb = new StringBuilder();
                                        removeTask2 = this;
                                        sb.append(removeTask2.sceneId);
                                        sb.append(ListSignBean.COLLECTID_SUFFIX);
                                        sb.append(buildView.getId());
                                        z2 = true;
                                        c = 3;
                                        instance.sendSceneData(3, true, sb.toString());
                                        list2.remove(buildView.getId());
                                        list = list3;
                                        list.remove(softReference);
                                    } else {
                                        list = list3;
                                        removeTask2 = this;
                                        z2 = true;
                                        c = 3;
                                    }
                                }
                                if (list2.isEmpty() && list.isEmpty()) {
                                    z = false;
                                    sceneInfo.setContainNotChildrenView(false);
                                    bibVar = null;
                                    sceneInfo.setNotChildrenViewIdList(null);
                                    sceneInfo.setNotChildrenViewList(null);
                                } else {
                                    z = false;
                                    bibVar = null;
                                    sceneInfo.setNotChildrenViewIdList(list2);
                                    sceneInfo.setNotChildrenViewList(list);
                                }
                            } catch (Exception e) {
                                e = e;
                                removeTask = this;
                                LogUtils.e(removeTask.TAG, "e:" + e.getMessage());
                                return;
                            }
                        } else {
                            i = i3;
                            list = notChildrenViewList;
                            list2 = notChildrenViewIdList2;
                            z = z4;
                            bibVar = bibVar2;
                            z2 = z3;
                            c = c2;
                            removeTask2 = removeTask3;
                        }
                        notChildrenViewList = list;
                        z4 = z;
                        notChildrenViewIdList2 = list2;
                        bibVar2 = bibVar;
                        removeTask3 = removeTask2;
                        z3 = z2;
                        c2 = c;
                        i3 = i + 1;
                    }
                    return;
                }
                String str = removeTask3.sceneId + "_" + removeTask3.viewWrapper.getElementGroupId();
                LogUtils.logInfo(removeTask3.TAG, "RemoveTask: subSceneid" + str);
                List<String> sceneIdList2 = VuiSceneManager.instance().getSceneIdList(removeTask3.sceneId);
                List<String> sceneIdList3 = VuiSceneManager.instance().getSceneIdList(str);
                if (sceneIdList3 != null) {
                    sceneIdList2.removeAll(sceneIdList3);
                    VuiSceneManager.instance().setSceneIdList(removeTask3.sceneId, sceneIdList2);
                    VuiSceneManager.instance().removeSubSceneIds(removeTask3.sceneId, str);
                    VuiSceneManager.instance().removeVuiSceneListener(str, false, false, null);
                }
                VuiSceneManager.instance().sendSceneData(3, true, removeTask3.sceneId + ListSignBean.COLLECTID_SUFFIX + removeTask3.viewWrapper.getElementGroupId());
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            removeTask = removeTask3;
        }
    }

    public List<bin> build(int i, View view) {
        return build(i, view);
    }

    public List<bin> build(int i, List<View> list) {
        return build(i, list);
    }
}
