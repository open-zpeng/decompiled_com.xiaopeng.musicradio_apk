package com.xiaopeng.speech.vui.task.base;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xiaopeng.speech.vui.VuiEngineImpl;
import com.xiaopeng.speech.vui.VuiSceneManager;
import com.xiaopeng.speech.vui.cache.VuiSceneCacheFactory;
import com.xiaopeng.speech.vui.constants.Foo;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.speech.vui.model.VuiScene;
import com.xiaopeng.speech.vui.task.TaskWrapper;
import com.xiaopeng.speech.vui.utils.LogUtils;
import com.xiaopeng.speech.vui.utils.ResourceUtil;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.speech.vui.vuiengine.R;
import defpackage.bin;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class BaseTask implements bia, Task {
    private String mPackageName;
    private String mPackageVersion;
    private String sceneId;
    public TaskWrapper wrapper;
    private String TAG = "BaseTask";
    private String mSceneIdPrefix = null;
    private String[] bizTypeEnum = {"Address", "Navi", "Route", "Waypoint", "Pic", "Charge", "Connect", "Disconnect", "Null"};
    protected Gson mGson = new Gson();

    public List<bin> buildVuiElement(View view) {
        return null;
    }

    public List<bin> buildVuiElement(List<View> list) {
        return null;
    }

    public BaseTask(TaskWrapper taskWrapper) {
        this.wrapper = taskWrapper;
        TaskWrapper taskWrapper2 = this.wrapper;
        this.sceneId = taskWrapper2 != null ? taskWrapper2.getSceneId() : "";
        init();
    }

    private void init() {
        PackageInfo packageInfo;
        this.mPackageName = Foo.getContext().getApplicationInfo().packageName;
        try {
            packageInfo = Foo.getContext().getPackageManager().getPackageInfo(this.mPackageName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        this.mPackageVersion = packageInfo.versionName;
        this.mSceneIdPrefix = this.mPackageName + "-" + this.mPackageVersion;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (Thread.currentThread().isInterrupted()) {
            return;
        }
        execute();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fe, code lost:
        if (r1.equals(defpackage.bij.SILENT) != false) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.bin buildView(java.lang.ref.SoftReference<android.view.View> r24, java.util.List<defpackage.bin> r25, java.util.List<java.lang.Integer> r26, java.lang.ref.SoftReference<defpackage.bic> r27, java.util.List<java.lang.String> r28, long r29, java.util.List<java.lang.String> r31, java.util.List<java.lang.String> r32, java.lang.String r33, int r34, boolean r35, boolean r36, defpackage.bib r37) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.speech.vui.task.base.BaseTask.buildView(java.lang.ref.SoftReference, java.util.List, java.util.List, java.lang.ref.SoftReference, java.util.List, long, java.util.List, java.util.List, java.lang.String, int, boolean, boolean, bib):bin");
    }

    private bin buildVuiElementGroup(SoftReference<View> softReference, String str, List<Integer> list, SoftReference<bic> softReference2, List<String> list2, long j, List<String> list3, List<String> list4, int i, List<bin> list5, boolean z, boolean z2, bib bibVar) {
        bin buildVuiElement = buildVuiElement(softReference, list2, list3, str, i, j, z, z2);
        if (buildVuiElement == null || buildVuiElement.getId() == null || buildVuiElement.getType() == null || buildVuiElement.getType().equals(bih.XSLIDER.a())) {
            return buildVuiElement;
        }
        String id = buildVuiElement.getId();
        if (buildVuiElement.getType().equals(bih.UNKNOWN.a())) {
            String str2 = this.TAG;
            LogUtils.d(str2, "element type is unknown" + buildVuiElement.getLabel());
            removeId(softReference, buildVuiElement.getId(), list2, list3);
            return null;
        } else if (buildVuiElement.getType().equals(bih.STATEFULBUTTON.a())) {
            return buildVuiElement;
        } else {
            if (softReference != null && (softReference.get() instanceof bhz)) {
                if (((bhz) softReference.get()).isVuiLayoutLoadable() && softReference.get().getVisibility() != 0) {
                    return buildVuiElement;
                }
                if (!"com.android.systemui".equals(VuiSceneManager.instance().getmPackageName()) && softReference.get().getTag(R.id.disableChildVuiAttrsWhenInvisible) != null && softReference.get().getVisibility() != 0) {
                    return buildVuiElement;
                }
            }
            List<bin> elements = buildVuiElement.getElements();
            ArrayList arrayList = elements == null ? new ArrayList() : elements;
            List<bin> list6 = arrayList;
            getChildElements(softReference, arrayList, list, softReference2, list2, j, list3, list4, id, buildVuiElement.isLayoutLoadable() != null ? buildVuiElement.isLayoutLoadable().booleanValue() : false, z2, bibVar);
            if (list6.size() > 0) {
                buildVuiElement.setElements(list6);
                return buildVuiElement;
            }
            return buildVuiElement;
        }
    }

    private void setVuiElementChangedListener(SoftReference<View> softReference, bib bibVar, String str) {
        if (bibVar == null || !(softReference.get() instanceof bhz)) {
            return;
        }
        bhz bhzVar = (bhz) softReference.get();
        if (TextUtils.isEmpty(bhzVar.getVuiElementId())) {
            bhzVar.setVuiElementId(str);
        }
        if (bhzVar.getVuiElementChangedListener() == null) {
            ((bhz) softReference.get()).setVuiElementChangedListener(bibVar);
        }
    }

    private void removeId(SoftReference<View> softReference, String str, List<String> list, List<String> list2) {
        if (softReference == null || softReference.get() == null) {
            return;
        }
        if (list.contains(str)) {
            list.remove(str);
        }
        if (list2 != null && list2.contains(str)) {
            list2.remove(str);
        }
        if ("com.android.systemui".equals(VuiSceneManager.instance().getmPackageName()) || TextUtils.isEmpty((String) softReference.get().getTag(R.id.vuiElementId))) {
            return;
        }
        softReference.get().setTag(R.id.vuiElementId, "");
        softReference.get().setTag(null);
    }

    private String escapeQueryChars(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\'') {
                sb.append(" ");
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    private bin buildVuiElement(SoftReference<View> softReference, List<String> list, List<String> list2, String str, int i, long j, boolean z, boolean z2) {
        boolean z3;
        if (softReference == null || !(softReference.get() instanceof bhz)) {
            return null;
        }
        bin buildVuiElementAttr = buildVuiElementAttr(softReference);
        if (buildVuiElementAttr != null) {
            bhz bhzVar = (bhz) softReference.get();
            handleId(getElementId(softReference, VuiConstants.ATTRS_ELEMENT_ID), buildVuiElementAttr, list, list2, softReference, str, i, z, z2);
            if (bhzVar.isVuiLayoutLoadable()) {
                z3 = true;
            } else {
                z3 = z && !bih.XGROUPHEADER.a().equals(buildVuiElementAttr.getType());
            }
            if (z3) {
                buildVuiElementAttr.setLayoutLoadable(Boolean.valueOf(z3));
            }
            JSONObject vuiProps = bhzVar.getVuiProps();
            if (vuiProps != null) {
                if (bih.STATEFULBUTTON.a().equals(buildVuiElementAttr.getType()) || bih.RECYCLEVIEW.a().equals(buildVuiElementAttr.getType())) {
                    createElementByProps(softReference, buildVuiElementAttr, vuiProps, j, z3, false);
                } else if (vuiProps.keys().hasNext()) {
                    buildVuiElementAttr.setProps((JsonObject) this.mGson.fromJson(vuiProps.toString(), (Class<Object>) JsonObject.class));
                }
            }
            if (softReference != null && softReference.get() != null && (softReference.get() instanceof ViewGroup) && softReference.get().getVisibility() == 0 && !bhzVar.isVuiModeEnabled() && softReference != null && softReference.get() != null && bih.GROUP.a().equals(buildVuiElementAttr.getType()) && TextUtils.isEmpty(buildVuiElementAttr.getLabel()) && TextUtils.isEmpty(bhzVar.getVuiAction())) {
                if (softReference.get().getId() != -1) {
                    if (VuiUtils.getViewMode() != null && VuiUtils.getViewMode().equals(bij.DISABLED)) {
                        LogUtils.d(this.TAG, "ViewGroup is ignored:" + softReference.get());
                        if (!isContainsInAllCache(buildVuiElementAttr.getId())) {
                            removeId(softReference, buildVuiElementAttr.getId(), list, list2);
                            return null;
                        }
                    }
                } else {
                    LogUtils.d(this.TAG, "ViewGroup is ignored:" + softReference.get());
                    removeId(softReference, buildVuiElementAttr.getId(), list, list2);
                    return null;
                }
            }
        }
        return buildVuiElementAttr;
    }

    private boolean isContainsInAllCache(String str) {
        bin vuiElementById = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType()).getVuiElementById(this.sceneId, str);
        if (vuiElementById == null) {
            LogUtils.e(this.TAG, "缓存中没有此元素");
            return false;
        } else if (bih.GROUP.a().equals(vuiElementById.getType())) {
            return true;
        } else {
            LogUtils.e(this.TAG, "缓存中没有此元素");
            return false;
        }
    }

    public bin buildVuiElementAttr(SoftReference<View> softReference) {
        JSONObject jSONObject;
        if (softReference == null || !(softReference.get() instanceof bhz)) {
            return null;
        }
        bhz bhzVar = (bhz) softReference.get();
        if (VuiUtils.getViewMode() != null && VuiUtils.getViewMode().equals(bij.DISABLED) && softReference != null && !(softReference.get() instanceof ViewGroup) && !bhzVar.isVuiModeEnabled()) {
            SoftReference softReference2 = new SoftReference((View) softReference.get().getParent());
            if (((softReference2.get() instanceof bhz) && ((bhz) softReference2.get()).getVuiElementType() == bih.XTABLAYOUT) ? false : true) {
                return null;
            }
        }
        bij vuiMode = bhzVar.getVuiMode();
        if ((vuiMode == null || vuiMode.equals(bij.DISABLED) || vuiMode.equals(bij.SILENT)) ? false : true) {
            bin binVar = new bin();
            String vuiAction = bhzVar.getVuiAction();
            if (vuiAction != null) {
                binVar.setActions(vuiAction);
            }
            String elementLabel = getElementLabel(bhzVar);
            if (elementLabel == null) {
                LogUtils.e(this.TAG, "label 不合法");
                return null;
            }
            if (elementLabel.contains("'")) {
                elementLabel = escapeQueryChars(elementLabel);
            }
            binVar.setLabel(elementLabel);
            binVar.setFatherLabel(bhzVar.getVuiFatherLabel());
            String elementId = getElementId(softReference, VuiConstants.ATTRS_ELEMENT_FATHER_ID);
            if (elementId != null) {
                binVar.setFatherElementId(elementId);
            }
            String a = bih.UNKNOWN.a();
            if (softReference != null && (softReference.get() instanceof RecyclerView)) {
                binVar.setType(bih.RECYCLEVIEW.a());
            } else if (softReference != null && softReference.get() != null) {
                bih vuiElementType = bhzVar.getVuiElementType();
                if (vuiElementType != null) {
                    a = vuiElementType.a();
                }
                binVar.setType(a);
            }
            int a2 = bhzVar.getVuiPriority().a();
            if (a2 != bik.LEVEL3.a()) {
                binVar.setPriority(a2);
            }
            JSONObject vuiProps = bhzVar.getVuiProps();
            if (!"com.android.systemui".equals(VuiSceneManager.instance().getmPackageName())) {
                if (softReference != null && softReference.get() != null && softReference.get().getTag(R.id.vuiElementUnSupport) != null) {
                    if (((Boolean) softReference.get().getTag(R.id.vuiElementUnSupport)).booleanValue()) {
                        if (vuiProps == null) {
                            try {
                                vuiProps = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                        vuiProps.put(VuiConstants.PROPS_UNSUPPORTED, true);
                    } else if (vuiProps != null && vuiProps.has(VuiConstants.PROPS_UNSUPPORTED)) {
                        vuiProps.remove(VuiConstants.PROPS_UNSUPPORTED);
                    }
                }
                if (softReference != null && softReference.get() != null && softReference.get().getTag(R.id.vuiElementDefaultAction) != null && (jSONObject = (JSONObject) softReference.get().getTag(R.id.vuiElementDefaultAction)) != null) {
                    if (vuiProps == null) {
                        try {
                            vuiProps = new JSONObject();
                        } catch (Exception unused2) {
                        }
                    }
                    vuiProps.put(VuiConstants.PROPS_DEFAULTACTION, jSONObject);
                }
            }
            if (vuiProps != null) {
                if (vuiProps.has(VuiConstants.PROPS_VOICECONTROL)) {
                    try {
                        if (!vuiProps.getBoolean(VuiConstants.PROPS_VOICECONTROL)) {
                            vuiProps.remove(VuiConstants.PROPS_VOICECONTROL);
                        }
                    } catch (JSONException unused3) {
                        vuiProps.remove(VuiConstants.PROPS_VOICECONTROL);
                    }
                }
                if (vuiProps.length() > 0) {
                    bhzVar.setVuiProps(vuiProps);
                }
            }
            binVar.setPosition(bhzVar.getVuiPosition());
            if (binVar.getValues() == null) {
                VuiUtils.setValueAttribute(softReference.get(), binVar);
            }
            if (softReference != null && softReference.get() != null) {
                if (!"com.android.systemui".equals(VuiSceneManager.instance().getmPackageName())) {
                    Boolean bool = (Boolean) softReference.get().getTag(R.id.vuiElementVisible);
                    if (bool != null) {
                        if (!bool.booleanValue()) {
                            binVar.setVisible(false);
                        }
                    } else if (softReference.get().getVisibility() != 0) {
                        binVar.setVisible(false);
                    }
                } else if (softReference.get().getVisibility() != 0) {
                    binVar.setVisible(false);
                }
            }
            if (softReference != null && softReference.get() != null && softReference.get().getId() != -1 && softReference.get().getId() != 0) {
                String resourceName = VuiUtils.getResourceName(softReference.get().getId());
                if (!TextUtils.isEmpty(resourceName)) {
                    binVar.setResourceName(resourceName);
                }
            } else if (softReference != null && softReference.get() != null && !"com.android.systemui".equals(VuiSceneManager.instance().getmPackageName())) {
                Object tag = softReference.get().getTag(R.id.virtualResourceName);
                String str = this.TAG;
                LogUtils.d(str, "resourceTag:" + tag);
                if (tag != null) {
                    binVar.setResourceName((String) tag);
                }
            }
            if (vuiMode != null && vuiMode.equals(bij.UNDERSTOOD)) {
                binVar.setMode(vuiMode.a());
            }
            return binVar;
        }
        return null;
    }

    public void createElementByProps(SoftReference<View> softReference, bin binVar, JSONObject jSONObject, long j, boolean z, boolean z2) {
        Object obj;
        bin stateFulBtnCurr;
        if (jSONObject == null || softReference == null || softReference.get() == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (bih.STATEFULBUTTON.a().equals(binVar.getType()) && jSONObject.has("states")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("states");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                if (!z2) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                            if (jSONObject2 != null) {
                                Iterator<String> keys = jSONObject2.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    String string = jSONObject2.getString(next);
                                    if (!TextUtils.isEmpty(string)) {
                                        bin binVar2 = new bin();
                                        String[] split = string.split("-");
                                        if (split != null && split.length > 1) {
                                            binVar2.setValues(split[0]);
                                            binVar2.setLabel(split[1]);
                                        } else {
                                            String[] split2 = string.split("\\|");
                                            if (split2 != null && split2.length != 0) {
                                                binVar2.setValues(split2[0]);
                                                binVar2.setLabel(string);
                                            }
                                            binVar2.setValues(string);
                                            binVar2.setLabel(string);
                                        }
                                        binVar2.setType(bih.STATE.a());
                                        binVar2.setId(binVar.getId() + "_" + next);
                                        binVar2.setTimestamp(j);
                                        if (z) {
                                            binVar2.setLayoutLoadable(true);
                                        }
                                        arrayList.add(binVar2);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    binVar.setElements(arrayList);
                }
                String str = null;
                if (jSONObject.has("curState")) {
                    str = jSONObject.optString("curState");
                } else if (softReference.get() instanceof bhz) {
                    str = (String) ((bhz) softReference.get()).getVuiValue();
                }
                if (binVar.actions != null) {
                    ArrayList arrayList2 = new ArrayList(binVar.actions.entrySet());
                    JSONObject jSONObject3 = new JSONObject();
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        String str2 = (String) ((Map.Entry) arrayList2.get(i2)).getKey();
                        if ("SetCheck".equalsIgnoreCase(str2)) {
                            VuiUtils.generateElementValueJSON(jSONObject3, "SetCheck", Boolean.valueOf(softReference.get().isSelected()));
                        } else if ("SetValue".equalsIgnoreCase(str2) && (stateFulBtnCurr = getStateFulBtnCurr(str, arrayList)) != null) {
                            VuiUtils.generateElementValueJSON(jSONObject3, "SetValue", stateFulBtnCurr.getValues());
                        }
                    }
                    binVar.setValues(this.mGson.fromJson(jSONObject3.toString(), (Class<Object>) JsonObject.class));
                }
            }
        } else if (bih.RECYCLEVIEW.a().equals(binVar.getType()) && !z2 && jSONObject.has(VuiConstants.PROPS_MINVALUE) && jSONObject.has(VuiConstants.PROPS_MAXVALUE) && jSONObject.has("displayStart") && jSONObject.has("displayEnd")) {
            bin a = new bin.a().c(VuiConstants.VIRTUAL_LIST_ID).a(bih.VIRTUALLIST.a()).a(j).a();
            try {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(VuiConstants.PROPS_MINVALUE, Integer.valueOf(jSONObject.getInt(VuiConstants.PROPS_MINVALUE)));
                jsonObject.addProperty(VuiConstants.PROPS_MAXVALUE, Integer.valueOf(jSONObject.getInt(VuiConstants.PROPS_MAXVALUE)));
                jsonObject.addProperty("displayStart", Integer.valueOf(jSONObject.getInt("displayStart")));
                jsonObject.addProperty("displayEnd", Integer.valueOf(jSONObject.getInt("displayEnd")));
                jsonObject.addProperty("parentId", binVar.getId());
                if (jSONObject.has("supportVuiLabels") && (obj = jSONObject.get("supportVuiLabels")) != null && (obj instanceof List)) {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i3 = 0; i3 < ((List) obj).size(); i3++) {
                        String[] strArr = (String[]) ((List) obj).get(i3);
                        bin.a aVar = new bin.a();
                        arrayList3.add(aVar.c("10000_" + strArr[0]).a(bih.VIRTUALLISTITEM.a()).a(j).b(strArr[1]).a());
                    }
                    a.setElements(arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(a);
                a.setProps(jsonObject);
                binVar.setElements(arrayList4);
            } catch (Exception unused) {
            }
        }
        try {
            JSONObject jSONObject4 = new JSONObject();
            Iterator<String> keys2 = jSONObject.keys();
            if (bih.STATEFULBUTTON.a().equals(binVar.getType())) {
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (next2 != null && !next2.equals("states") && !next2.equals("curState")) {
                        jSONObject4.put(next2, jSONObject.get(next2));
                    }
                }
            } else if (bih.RECYCLEVIEW.a().equals(binVar.getType())) {
                while (keys2.hasNext()) {
                    String next3 = keys2.next();
                    if (next3 != null && !next3.equals(VuiConstants.PROPS_MINVALUE) && !next3.equals(VuiConstants.PROPS_MAXVALUE) && !next3.equals("displayStart") && !next3.equals("displayEnd") && !next3.equals("supportVuiLabels")) {
                        jSONObject4.put(next3, jSONObject.get(next3));
                    }
                }
            }
            if (jSONObject4.keys().hasNext()) {
                binVar.setProps((JsonObject) this.mGson.fromJson(jSONObject4.toString(), (Class<Object>) JsonObject.class));
            }
        } catch (Exception unused2) {
        }
    }

    private bin getStateFulBtnCurr(String str, List<bin> list) {
        String[] split;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty() || TextUtils.isEmpty(str) || (split = str.split("_")) == null || split.length <= 1 || !VuiUtils.isNumeric(split[1])) {
            return null;
        }
        return list.get(Integer.parseInt(split[1]) - 1);
    }

    private void getChildElements(SoftReference<View> softReference, List<bin> list, List<Integer> list2, SoftReference<bic> softReference2, List<String> list3, long j, List<String> list4, List<String> list5, String str, boolean z, boolean z2, bib bibVar) {
        int i;
        SoftReference softReference3;
        int i2;
        String vuiBizId;
        BaseTask baseTask = this;
        if (softReference == null || softReference.get() == null) {
            return;
        }
        if (softReference != null && softReference.get() != null && (softReference.get() instanceof bhz) && (vuiBizId = ((bhz) softReference.get()).getVuiBizId()) != null) {
            if (list5.contains(vuiBizId)) {
                return;
            }
            list5.add(vuiBizId);
        }
        if (softReference != null && softReference.get() != null && (softReference.get() instanceof RecyclerView)) {
            if (((RecyclerView) softReference.get()).getAdapter() == null) {
                return;
            }
            SoftReference softReference4 = new SoftReference((RecyclerView) softReference.get());
            int childCount = ((RecyclerView) softReference4.get()).getChildCount();
            if (softReference4.get() != null && ((RecyclerView) softReference4.get()).getChildCount() == 0) {
                LogUtils.e(baseTask.TAG, "RecyclerView 的child count 为0,view：" + softReference.get());
            }
            LogUtils.d(baseTask.TAG, "RecyclerView 的child count:" + ((RecyclerView) softReference4.get()).getChildCount() + ",view：" + softReference4.get());
            int i3 = 0;
            while (softReference4.get() != null && i3 < ((RecyclerView) softReference4.get()).getChildCount() && i3 < ((RecyclerView) softReference4.get()).getAdapter().a()) {
                SoftReference<View> softReference5 = new SoftReference<>(((RecyclerView) softReference4.get()).getChildAt(i3));
                if (softReference5.get() == null) {
                    LogUtils.e(baseTask.TAG, "RecyclerView 的child 为null,postion:" + i3);
                }
                int i4 = i3;
                int i5 = childCount;
                SoftReference softReference6 = softReference4;
                addChildElement(softReference5, list, list5, list2, softReference2, list3, j, list4, str, i3, z, true, bibVar);
                if (softReference6.get() == null || ((RecyclerView) softReference6.get()).getChildCount() == i5) {
                    i2 = i5;
                    baseTask = this;
                } else {
                    i2 = i5;
                    baseTask = this;
                    LogUtils.w(baseTask.TAG, "RecyclerView is not same child count:" + ((RecyclerView) softReference6.get()).getChildCount() + ",view：" + softReference6.get() + ",len:" + i2);
                }
                i3 = i4 + 1;
                childCount = i2;
                softReference4 = softReference6;
            }
        } else if (softReference != null && (softReference.get() instanceof ListView)) {
            SoftReference softReference7 = new SoftReference((ListView) softReference.get());
            int i6 = 0;
            while (softReference7.get() != null && i6 < ((ListView) softReference7.get()).getCount()) {
                if (((ListView) softReference7.get()).getAdapter() != null) {
                    i = i6;
                    softReference3 = softReference7;
                    addChildElement(new SoftReference<>(((ListView) softReference7.get()).getAdapter().getView(i6, null, (ViewGroup) softReference7.get())), list, list5, list2, softReference2, list3, j, list4, str, i6, z, z2, bibVar);
                } else {
                    i = i6;
                    softReference3 = softReference7;
                }
                i6 = i + 1;
                softReference7 = softReference3;
            }
        } else if (softReference != null && (softReference.get() instanceof ViewGroup)) {
            int i7 = 0;
            for (SoftReference softReference8 = new SoftReference((ViewGroup) softReference.get()); softReference8.get() != null && i7 < ((ViewGroup) softReference8.get()).getChildCount(); softReference8 = softReference8) {
                addChildElement(new SoftReference<>(((ViewGroup) softReference8.get()).getChildAt(i7)), list, list5, list2, softReference2, list3, j, list4, str, i7, z, z2, bibVar);
                i7++;
            }
        }
    }

    private void addChildElement(SoftReference<View> softReference, List<bin> list, List<String> list2, List<Integer> list3, SoftReference<bic> softReference2, List<String> list4, long j, List<String> list5, String str, int i, boolean z, boolean z2, bib bibVar) {
        bin buildView = buildView(softReference, list, list3, softReference2, list4, j, list5, list2, str, i, z, z2, bibVar);
        if (buildView == null || buildView.getId() == null) {
            return;
        }
        String id = buildView.getId();
        list.add(buildView);
        buildView.setTimestamp(j);
        if ((softReference.get() instanceof ViewGroup) && buildView.getType() != null && buildView.getType().equals(bih.STATEFULBUTTON.a())) {
            getChildElements(softReference, list, list3, softReference2, list4, j, list5, list2, id, z, z2, bibVar);
        }
    }

    public String handleId(String str, bin binVar, List<String> list, List<String> list2, SoftReference<View> softReference, String str2, int i, boolean z, boolean z2) {
        if ("com.android.systemui".equals(VuiSceneManager.instance().getmPackageName())) {
            if (list != null && !list.contains(str)) {
                list.add(str);
                if (binVar != null) {
                    binVar.setId(str);
                }
            }
            if (list2 != null && !list2.contains(str)) {
                list2.add(str);
            }
            return str;
        }
        if ((!z && !z2 && (str == null || str.equals("0") || !str.contains("_"))) || (softReference != null && (softReference.get() instanceof RecyclerView))) {
            String str3 = softReference.get() != null ? (String) softReference.get().getTag(R.id.vuiElementId) : null;
            if (!TextUtils.isEmpty(str3)) {
                if (!list.contains(str3)) {
                    list.add(str3);
                } else {
                    LogUtils.w(this.TAG, "更新不合法");
                }
                if (list2 != null && !list2.contains(str3)) {
                    list2.add(str3);
                }
                if (binVar != null) {
                    binVar.setId(str3);
                }
                return str3;
            }
        }
        if (str == null || str.equals("0")) {
            if (str2 == null) {
                str = "4657_" + i;
            } else {
                str = str2 + "_" + i;
            }
        } else if (list != null && list.contains(str)) {
            if (str2 == null) {
                str = str + "_" + i;
            } else {
                str = str2 + "_" + str;
                if (list.contains(str)) {
                    str = str + "_" + i;
                }
            }
        }
        if (list != null && !list.contains(str)) {
            list.add(str);
            if (binVar != null) {
                binVar.setId(str);
            }
            setVuiTag(softReference, str);
            if (list2 != null && !list2.contains(str)) {
                list2.add(str);
            }
            return str;
        }
        LogUtils.w(this.TAG, "容错失败：" + str);
        return str + "_error";
    }

    public void setVuiTag(SoftReference<View> softReference, String str) {
        if ("com.android.systemui".equals(VuiSceneManager.instance().getmPackageName()) || softReference == null || softReference.get() == null) {
            return;
        }
        if (softReference.get().getTag() == null) {
            softReference.get().setTag(str);
            softReference.get().setTag(R.id.vuiElementId, str);
            return;
        }
        String str2 = (String) softReference.get().getTag(R.id.vuiElementId);
        if (str2 == null || str2.equals(str)) {
            return;
        }
        softReference.get().setTag(str);
        softReference.get().setTag(R.id.vuiElementId, str);
    }

    private void showToast(final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.xiaopeng.speech.vui.task.base.BaseTask.1
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(Foo.getContext(), str, 1).show();
            }
        });
    }

    private String getElementLabel(bhz bhzVar) {
        String vuiLabel = bhzVar.getVuiLabel();
        CharSequence charSequence = null;
        if (vuiLabel != null) {
            if (!vuiLabel.contains("|") || vuiLabel.split("\\|").length <= 5) {
                return vuiLabel;
            }
            LogUtils.e(this.TAG, "label 不能超过5个");
            return null;
        }
        if (!"com.android.systemui".equals(VuiSceneManager.instance().getmPackageName())) {
            Object tag = ((View) bhzVar).getTag(R.id.vuiLabelUnSupportText);
            if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
                return vuiLabel == null ? "" : vuiLabel;
            }
        }
        if (bhzVar instanceof TextView) {
            if (!(bhzVar instanceof EditText)) {
                charSequence = ((TextView) bhzVar).getText();
            } else {
                EditText editText = (EditText) bhzVar;
                charSequence = editText.getHint();
                if (charSequence == null) {
                    charSequence = editText.getText();
                }
            }
        }
        return !TextUtils.isEmpty(charSequence) ? charSequence.toString() : "";
    }

    private String getElementId(SoftReference<View> softReference, String str) {
        String vuiElementId;
        if (softReference == null || !(softReference.get() instanceof bhz)) {
            return null;
        }
        bhz bhzVar = (bhz) softReference.get();
        if (str.equals(VuiConstants.ATTRS_ELEMENT_ID) && softReference != null && softReference.get() != null && softReference.get().getTag() != null && (softReference.get().getTag() instanceof String)) {
            String str2 = (String) softReference.get().getTag();
            if (str2.startsWith("4657")) {
                String str3 = this.TAG;
                LogUtils.d(str3, "client has set Tag" + str2);
                return str2;
            }
        }
        if (str.equals(VuiConstants.ATTRS_ELEMENT_FATHER_ID)) {
            vuiElementId = bhzVar.getVuiFatherElementId();
        } else {
            vuiElementId = str.equals(VuiConstants.ATTRS_ELEMENT_ID) ? bhzVar.getVuiElementId() : null;
        }
        if (vuiElementId != null && !TextUtils.isEmpty(vuiElementId)) {
            if (isNumber(vuiElementId)) {
                return vuiElementId;
            }
            return "" + ResourceUtil.getId(Foo.getContext(), vuiElementId);
        } else if (str.contains(VuiConstants.ATTRS_ELEMENT_FATHER_ID) || softReference == null || softReference.get() == null || softReference.get().getId() == -1) {
            return null;
        } else {
            return "" + softReference.get().getId();
        }
    }

    private boolean isNumber(String str) {
        return Pattern.compile("[0-9]+(_[0-9]+)*").matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VuiScene getNewVuiScene(String str, long j) {
        return new VuiScene.Builder().sceneId(str).appVersion(this.mPackageVersion).packageName(this.mPackageName).timestamp(j).build();
    }

    protected String getSceneUnqiueId(String str) {
        return this.mSceneIdPrefix + "-" + str;
    }

    public String getSceneId() {
        return this.sceneId;
    }

    public String getActiveWholeSceneId(List<String> list) {
        if (list == null) {
            return "";
        }
        String str = VuiEngineImpl.mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_LF);
        String str2 = VuiEngineImpl.mActiveSceneIds.get(VuiConstants.SCREEN_DISPLAY_RF);
        return (TextUtils.isEmpty(str) || !list.contains(str)) ? (TextUtils.isEmpty(str2) || !list.contains(str2)) ? "" : str2 : str;
    }
}
