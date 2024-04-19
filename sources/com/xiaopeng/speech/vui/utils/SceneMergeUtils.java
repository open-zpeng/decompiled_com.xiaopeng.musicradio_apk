package com.xiaopeng.speech.vui.utils;

import android.text.TextUtils;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class SceneMergeUtils {
    public static synchronized List<bin> updateMerge(List<bin> list, List<bin> list2, boolean z) {
        synchronized (SceneMergeUtils.class) {
            List<bin> merge = merge(list, list2, z);
            if (merge != null && !merge.isEmpty()) {
                return duplicateRemoval(merge);
            }
            return merge;
        }
    }

    private static List<bin> duplicateRemoval(List<bin> list) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        bin binVar = new bin();
        binVar.setElements(list);
        binVar.setId("-1");
        findNode(binVar, null, hashMap, hashMap2);
        return binVar.getElements();
    }

    private static void findNode(bin binVar, bin binVar2, Map<String, bin> map, Map<String, bin> map2) {
        if (binVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(binVar.getId())) {
            if (map.containsKey(binVar.getId())) {
                bin binVar3 = map.get(binVar.getId());
                if (binVar3 == null) {
                    return;
                }
                if (binVar.getTimestamp() >= binVar3.getTimestamp()) {
                    bin binVar4 = map2.get(binVar.getId());
                    if (binVar4 == null) {
                        return;
                    }
                    if (binVar4.getElements() != null && !binVar4.getElements().isEmpty()) {
                        binVar4.getElements().remove(map.get(binVar.getId()));
                    }
                    map.put(binVar.getId(), binVar);
                    map2.put(binVar.getId(), binVar2);
                }
            } else {
                map.put(binVar.getId(), binVar);
                map2.put(binVar.getId(), binVar2);
            }
        }
        List<bin> elements = binVar.getElements();
        if (elements != null) {
            for (int i = 0; i < elements.size(); i++) {
                findNode(elements.get(i), binVar, map, map2);
            }
        }
    }

    public static synchronized List<bin> merge(List<bin> list, List<bin> list2, boolean z) {
        synchronized (SceneMergeUtils.class) {
            if (list2 != null) {
                if (!list2.isEmpty()) {
                    if (list != null && !list.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (bin binVar : list2) {
                            mergeElement(list, binVar, arrayList, z);
                        }
                        if (list2.size() != arrayList.size() && list2.size() > arrayList.size()) {
                            for (bin binVar2 : list2) {
                                if (binVar2.getId() != null && !arrayList.contains(binVar2.getId())) {
                                    list.add(binVar2);
                                }
                            }
                        }
                        return list;
                    }
                    return list2;
                }
            }
            return list;
        }
    }

    public static synchronized List<bin> removeElementById(List<bin> list, List<String> list2) {
        synchronized (SceneMergeUtils.class) {
            if (list != null) {
                if (!list.isEmpty()) {
                    if (list2 != null && !list2.isEmpty()) {
                        for (String str : list2) {
                            removeElement(list, str);
                        }
                        return list;
                    }
                    return list;
                }
            }
            return list;
        }
    }

    public static String removeElementById(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(VuiConstants.SCENE_ELEMENTS)) {
                JSONArray jSONArray = jSONObject.getJSONArray(VuiConstants.SCENE_ELEMENTS);
                for (String str2 : list) {
                    removeElement(jSONArray, str2);
                }
                return String.valueOf(jSONArray);
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static void removeElement(List<bin> list, String str) {
        if (TextUtils.isEmpty(str) || list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            bin binVar = list.get(i);
            if (binVar != null) {
                if (str.equals(binVar.getId())) {
                    list.remove(i);
                    return;
                } else if (binVar.getElements() != null && !binVar.getElements().isEmpty()) {
                    removeElement(binVar.getElements(), str);
                }
            }
        }
    }

    private static void mergeElement(List<bin> list, bin binVar, List<String> list2, boolean z) {
        if (binVar == null || list == null || binVar.getId() == null) {
            return;
        }
        for (bin binVar2 : list) {
            if (binVar.getId().equals(binVar2.getId())) {
                int indexOf = list.indexOf(binVar2);
                if (z && binVar.getElements() == null && binVar2.getElements() != null) {
                    binVar.setElements(binVar2.getElements());
                }
                list.set(indexOf, binVar);
                list2.add(binVar.getId());
                return;
            } else if (binVar2.getElements() != null && !binVar2.getElements().isEmpty()) {
                mergeElement(binVar2.getElements(), binVar, list2, z);
            }
        }
    }

    private static void removeElement(JSONArray jSONArray, String str) {
        if (str == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null && jSONObject.has("id")) {
                if (!TextUtils.isEmpty(jSONObject.optString("id")) && jSONObject.optString("id").equals(str)) {
                    jSONArray.remove(i);
                    return;
                } else if (jSONObject.has(VuiConstants.SCENE_ELEMENTS) && jSONObject.optJSONArray(VuiConstants.SCENE_ELEMENTS).length() > 0) {
                    removeElement(jSONObject.optJSONArray(VuiConstants.SCENE_ELEMENTS), str);
                }
            }
        }
    }
}
