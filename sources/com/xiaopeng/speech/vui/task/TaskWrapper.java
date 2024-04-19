package com.xiaopeng.speech.vui.task;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.speech.vui.ISceneCallbackHandler;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.speech.vui.task.TaskDispatcher;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class TaskWrapper {
    private List<Integer> customizeIds;
    private String displayLocation;
    private String elementGroupId;
    private SoftReference<bic> elementListener;
    private boolean isContainNotChildrenView;
    private boolean isWholeScene;
    private bie listener;
    private ISceneCallbackHandler mSceneCallbackHandler;
    private String parentElementId;
    private bik priority;
    private SoftReference<RecyclerView> recyclerView;
    private String sceneId;
    private List<String> subSceneIds;
    private TaskDispatcher.TaskType taskType;
    private String vid;
    private SoftReference<View> view;
    private List<SoftReference<View>> viewList;

    public boolean isContainNotChildrenView() {
        return this.isContainNotChildrenView;
    }

    public boolean isWholeScene() {
        return this.isWholeScene;
    }

    public String getDisplayLocation() {
        return this.displayLocation;
    }

    public void setDisplayLocation(String str) {
        this.displayLocation = str;
    }

    public List<SoftReference<View>> getViewList() {
        return this.viewList;
    }

    public List<String> getSubSceneIds() {
        return this.subSceneIds;
    }

    public TaskWrapper() {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
    }

    public TaskWrapper(String str, TaskDispatcher.TaskType taskType, List<View> list) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.sceneId = str;
        this.taskType = taskType;
        revertViewListToSoftReference(list);
    }

    public TaskWrapper(String str, TaskDispatcher.TaskType taskType, List<View> list, RecyclerView recyclerView) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.sceneId = str;
        this.taskType = taskType;
        revertViewListToSoftReference(list);
        this.recyclerView = new SoftReference<>(recyclerView);
    }

    private void revertViewListToSoftReference(List<View> list) {
        if (list != null) {
            this.viewList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                this.viewList.add(new SoftReference<>(list.get(i)));
            }
        }
    }

    public TaskWrapper(String str, TaskDispatcher.TaskType taskType, View view) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.sceneId = str;
        this.taskType = taskType;
        this.view = new SoftReference<>(view);
    }

    public TaskWrapper(String str, TaskDispatcher.TaskType taskType, View view, RecyclerView recyclerView) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.sceneId = str;
        this.taskType = taskType;
        this.view = new SoftReference<>(view);
        this.recyclerView = new SoftReference<>(recyclerView);
    }

    public TaskWrapper(View view, int i, String str, TaskDispatcher.TaskType taskType) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.sceneId = str;
        this.taskType = taskType;
        this.view = new SoftReference<>(view);
        this.vid = String.valueOf(i);
    }

    public TaskWrapper(View view, int i, String str, TaskDispatcher.TaskType taskType, RecyclerView recyclerView) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.sceneId = str;
        this.taskType = taskType;
        this.view = new SoftReference<>(view);
        this.vid = String.valueOf(i);
        this.recyclerView = new SoftReference<>(recyclerView);
    }

    public TaskWrapper(String str, bik bikVar, TaskDispatcher.TaskType taskType, List<View> list, boolean z) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        revertViewListToSoftReference(list);
        this.sceneId = str;
        this.priority = bikVar;
        this.taskType = taskType;
        this.isContainNotChildrenView = z;
    }

    public TaskWrapper(View view, String str, int i, TaskDispatcher.TaskType taskType, bik bikVar, bie bieVar) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.view = new SoftReference<>(view);
        this.sceneId = str;
        this.vid = String.valueOf(i);
        this.taskType = taskType;
        this.priority = bikVar;
        this.listener = bieVar;
    }

    public TaskWrapper(View view, String str, int i, TaskDispatcher.TaskType taskType, String str2) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.view = new SoftReference<>(view);
        this.sceneId = str;
        this.vid = String.valueOf(i);
        this.taskType = taskType;
        this.parentElementId = str2;
    }

    public TaskWrapper(View view, String str, int i, TaskDispatcher.TaskType taskType, List<Integer> list, bic bicVar) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.view = new SoftReference<>(view);
        this.sceneId = str;
        this.vid = String.valueOf(i);
        this.taskType = taskType;
        this.customizeIds = list;
        this.elementListener = new SoftReference<>(bicVar);
    }

    public TaskWrapper(View view, String str, TaskDispatcher.TaskType taskType, List<Integer> list, bic bicVar) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.view = new SoftReference<>(view);
        this.sceneId = str;
        this.taskType = taskType;
        this.customizeIds = list;
        this.elementListener = new SoftReference<>(bicVar);
    }

    public TaskWrapper(List<View> list, String str, TaskDispatcher.TaskType taskType, List<Integer> list2, bic bicVar) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        revertViewListToSoftReference(list);
        this.sceneId = str;
        this.taskType = taskType;
        this.elementListener = new SoftReference<>(bicVar);
        this.customizeIds = list2;
    }

    public TaskWrapper(View view, String str, int i, TaskDispatcher.TaskType taskType, List<Integer> list, bic bicVar, List<String> list2, boolean z, ISceneCallbackHandler iSceneCallbackHandler) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.view = new SoftReference<>(view);
        this.sceneId = str;
        this.vid = String.valueOf(i);
        this.taskType = taskType;
        this.customizeIds = list;
        this.elementListener = new SoftReference<>(bicVar);
        this.subSceneIds = list2;
        this.isWholeScene = z;
        this.mSceneCallbackHandler = iSceneCallbackHandler;
    }

    public TaskWrapper(View view, String str, int i, TaskDispatcher.TaskType taskType, List<Integer> list, bic bicVar, List<String> list2, boolean z, ISceneCallbackHandler iSceneCallbackHandler, String str2) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.view = new SoftReference<>(view);
        this.sceneId = str;
        this.vid = String.valueOf(i);
        this.taskType = taskType;
        this.customizeIds = list;
        this.elementListener = new SoftReference<>(bicVar);
        this.subSceneIds = list2;
        this.isWholeScene = z;
        this.mSceneCallbackHandler = iSceneCallbackHandler;
        this.displayLocation = str2;
    }

    public TaskWrapper(View view, String str, int i, TaskDispatcher.TaskType taskType, List<Integer> list, bic bicVar, List<String> list2, boolean z, ISceneCallbackHandler iSceneCallbackHandler, String str2, bie bieVar) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.view = new SoftReference<>(view);
        this.sceneId = str;
        this.vid = String.valueOf(i);
        this.taskType = taskType;
        this.customizeIds = list;
        this.elementListener = new SoftReference<>(bicVar);
        this.subSceneIds = list2;
        this.isWholeScene = z;
        this.mSceneCallbackHandler = iSceneCallbackHandler;
        this.displayLocation = str2;
        this.listener = bieVar;
    }

    public TaskWrapper(List<View> list, String str, TaskDispatcher.TaskType taskType, List<Integer> list2, bic bicVar, List<String> list3, boolean z, ISceneCallbackHandler iSceneCallbackHandler) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        revertViewListToSoftReference(list);
        this.sceneId = str;
        this.vid = String.valueOf(this.vid);
        this.taskType = taskType;
        this.customizeIds = list2;
        this.elementListener = new SoftReference<>(bicVar);
        this.subSceneIds = list3;
        this.isWholeScene = z;
        this.mSceneCallbackHandler = iSceneCallbackHandler;
    }

    public TaskWrapper(List<View> list, String str, TaskDispatcher.TaskType taskType, List<Integer> list2, bic bicVar, List<String> list3, boolean z, ISceneCallbackHandler iSceneCallbackHandler, String str2) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        revertViewListToSoftReference(list);
        this.sceneId = str;
        this.vid = String.valueOf(this.vid);
        this.taskType = taskType;
        this.customizeIds = list2;
        this.elementListener = new SoftReference<>(bicVar);
        this.subSceneIds = list3;
        this.isWholeScene = z;
        this.mSceneCallbackHandler = iSceneCallbackHandler;
        this.displayLocation = str2;
    }

    public TaskWrapper(List<View> list, String str, TaskDispatcher.TaskType taskType, List<Integer> list2, bic bicVar, List<String> list3, boolean z, ISceneCallbackHandler iSceneCallbackHandler, String str2, bie bieVar) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        revertViewListToSoftReference(list);
        this.sceneId = str;
        this.vid = String.valueOf(this.vid);
        this.taskType = taskType;
        this.customizeIds = list2;
        this.elementListener = new SoftReference<>(bicVar);
        this.subSceneIds = list3;
        this.isWholeScene = z;
        this.mSceneCallbackHandler = iSceneCallbackHandler;
        this.displayLocation = str2;
        this.listener = bieVar;
    }

    public TaskWrapper(View view, String str, TaskDispatcher.TaskType taskType, bie bieVar, String str2) {
        this.isWholeScene = true;
        this.isContainNotChildrenView = false;
        this.displayLocation = VuiConstants.SCREEN_DISPLAY_LF;
        this.view = new SoftReference<>(view);
        this.sceneId = str;
        this.vid = str2;
        this.listener = bieVar;
        this.taskType = taskType;
        this.elementGroupId = str2;
    }

    public TaskDispatcher.TaskType getTaskType() {
        return this.taskType;
    }

    public List<Integer> getCustomizeIds() {
        return this.customizeIds;
    }

    public bik getPriority() {
        return this.priority;
    }

    public void setPriority(bik bikVar) {
        this.priority = bikVar;
    }

    public bie getListener() {
        return this.listener;
    }

    public void setListener(bie bieVar) {
        this.listener = bieVar;
    }

    public String getParentElementId() {
        return this.parentElementId;
    }

    public String getElementGroupId() {
        return this.elementGroupId;
    }

    public void setElementGroupId(String str) {
        this.elementGroupId = str;
    }

    public void setParentElementId(String str) {
        this.parentElementId = str;
    }

    public void setCustomizeIds(List<Integer> list) {
        this.customizeIds = list;
    }

    public SoftReference<bic> getElementListener() {
        return this.elementListener;
    }

    public void setElementListener(bic bicVar) {
        this.elementListener = new SoftReference<>(bicVar);
    }

    public void setTaskType(TaskDispatcher.TaskType taskType) {
        this.taskType = taskType;
    }

    public SoftReference<View> getView() {
        return this.view;
    }

    public void setView(View view) {
        this.view = new SoftReference<>(view);
    }

    public String getSceneId() {
        return this.sceneId;
    }

    public void setSceneId(String str) {
        this.sceneId = str;
    }

    public String getVid() {
        return this.vid;
    }

    public void setVid(String str) {
        this.vid = str;
    }

    public ISceneCallbackHandler getSceneCallbackHandler() {
        return this.mSceneCallbackHandler;
    }

    public void setReturnCallBack(ISceneCallbackHandler iSceneCallbackHandler) {
        this.mSceneCallbackHandler = iSceneCallbackHandler;
    }

    public SoftReference<RecyclerView> getRecyclerView() {
        return this.recyclerView;
    }
}
