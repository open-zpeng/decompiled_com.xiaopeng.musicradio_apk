package com.xiaopeng.speech.vui.utils;

import android.os.SystemProperties;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.xiaopeng.libconfig.ipc.IpcConfig;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.VuiEngineImpl;
import com.xiaopeng.speech.vui.constants.Foo;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.speech.vui.model.VuiFeedback;
import com.xiaopeng.speech.vui.model.VuiScene;
import com.xiaopeng.view.WindowManagerFactory;
import defpackage.bin;
import java.lang.ref.SoftReference;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class VuiUtils {
    public static final String CAR_PLATFORM_A1 = "A1";
    public static final String CAR_PLATFORM_A2 = "A2";
    public static final String CAR_PLATFORM_A3 = "A3";
    public static final String CAR_PLATFORM_Q1 = "Q1";
    public static final String CAR_PLATFORM_Q2 = "Q2";
    public static final String CAR_PLATFORM_Q3 = "Q3";
    public static final String CAR_PLATFORM_Q5 = "Q5";
    public static final String CAR_PLATFORM_Q6 = "Q6";
    public static final String CAR_PLATFORM_Q7 = "Q7";
    public static final String CAR_PLATFORM_Q8 = "Q8";
    public static int LIST_VEDIO_TYPE = 1;
    private static List<String> supportMultiScreenPlatform;
    private static ExclusionStrategy mExclusionStrategy = new ExclusionStrategy() { // from class: com.xiaopeng.speech.vui.utils.VuiUtils.1
        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipClass(Class<?> cls) {
            return false;
        }

        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
            return fieldAttributes.getName().equals("timestamp");
        }
    };
    public static final List<String> VUI_ENABLE_APP = Arrays.asList("com.xiaopeng.montecarlo", "com.xiaopeng.musicradio", "com.xiaopeng.carcontrol", "com.xiaopeng.car.settings", "com.xiaopeng.chargecontrol", IpcConfig.App.CAR_CAMERA, IpcConfig.App.CAR_BT_PHONE, "com.xiaopeng.aiassistant", "com.xiaopeng.carspeechservice", VuiConstants.SCENEDEMO, "com.xiaopeng.vui.demo");
    private static ExclusionStrategy mAttrExclusionStrategy = new ExclusionStrategy() { // from class: com.xiaopeng.speech.vui.utils.VuiUtils.2
        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipClass(Class<?> cls) {
            return false;
        }

        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
            return fieldAttributes.getName().equals(VuiConstants.SCENE_ELEMENTS);
        }
    };
    private static boolean isDisableVuiFeature = false;
    private static boolean userDisabledFeature = false;
    private static String sRegion = null;
    private static bij viewMode = bij.NORMAL;
    private static String sType = null;
    private static List<String> unSupportType = new ArrayList();

    public static String getDisplayLocation(int i) {
        return (i != 0 && i == 1) ? VuiConstants.SCREEN_DISPLAY_RF : VuiConstants.SCREEN_DISPLAY_LF;
    }

    public static void test() {
        System.out.println(vuiSceneConvertToString(stringConvertToVuiScene("{\n    \"id\": \"navigation_search\",\n    \"elements\": [\n        {\n            \"type\": \"Button\",\n            \"label\": \"返回\",\n            \"id\": 10020,\n            \"position\": 2\n        },\n        {\n            \"type\": \"EditText\",\n            \"label\": \"请输入目的地\",\n            \"id\": 10030\n        },\n        {\n            \"type\": \"Button\",\n            \"label\": \"重新设置家的位置\",\n            \"id\": 10050\n        },\n        {\n            \"type\": \"Button\",\n            \"label\": \"添加公司位置\",\n            \"id\": 10056\n        },\n        {\n            \"type\": \"Button\",\n            \"label\": \"打开收藏夹\",\n            \"id\": 10062\n        },\n        {\n            \"type\": \"Button\",\n            \"label\": \"充电站\",\n            \"id\": 10098\n        },\n        {\n            \"type\": \"Button\",\n            \"label\": \"美食\",\n            \"id\": 10034\n        },\n        {\n            \"type\": \"Button\",\n            \"label\": \"洗手间\",\n            \"id\": 10089\n        },\n        {\n            \"type\": \"Button\",\n            \"label\": \"停车场\",\n            \"id\": 10056\n        },\n        {\n            \"type\": \"Button\",\n            \"label\": \"维修\",\n            \"id\": 10065\n        },\n        {\n            \"type\": \"Button\",\n            \"label\": \"小鹏4S\",\n            \"id\": 10035\n        },\n        {\n            \"type\": \"Button\",\n            \"label\": \"智能洗车\",\n            \"id\": 10076\n        },\n        {\n            \"type\": \"RecycleView\",\n            \"dynamic\": true,\n            \"id\": 10056,\n            \"elements\": [\n                {\n                    \"type\": \"Button\",\n                    \"label\": \"维修\",\n                    \"id\": 10023\n                }\n            ]\n        }\n    ]\n}")));
    }

    static {
        unSupportType.add(CAR_PLATFORM_A1);
        unSupportType.add(CAR_PLATFORM_A2);
        unSupportType.add(CAR_PLATFORM_A3);
        supportMultiScreenPlatform = new ArrayList();
        supportMultiScreenPlatform.add(CAR_PLATFORM_Q7);
    }

    public static String vuiFeedBackConvertToString(VuiFeedback vuiFeedback) {
        if (vuiFeedback == null) {
            return null;
        }
        return new GsonBuilder().create().toJson(vuiFeedback);
    }

    public static synchronized String vuiSceneConvertToString(VuiScene vuiScene) {
        synchronized (VuiUtils.class) {
            if (vuiScene == null) {
                return null;
            }
            try {
                return new GsonBuilder().registerTypeAdapter(Integer.class, new SceneIntegerTypeAdapter()).registerTypeAdapter(Boolean.class, new SceneBooleanTypeAdapter()).create().toJson(vuiScene);
            } catch (Exception e) {
                LogUtils.e("VuiUtils", "vuiSceneConvertToString e:" + e.toString());
                return null;
            }
        }
    }

    public static synchronized String vuiUpdateSceneConvertToString(VuiScene vuiScene) {
        synchronized (VuiUtils.class) {
            if (vuiScene == null) {
                return null;
            }
            try {
                return new GsonBuilder().registerTypeAdapter(Integer.class, new SceneIntegerTypeAdapter()).registerTypeAdapter(Boolean.class, new SceneBooleanTypeAdapter()).setExclusionStrategies(mExclusionStrategy).create().toJson(vuiScene);
            } catch (Exception e) {
                LogUtils.e("VuiUtils", "vuiSceneConvertToString e:" + e.toString());
                return null;
            }
        }
    }

    public static void generateElementValueJSON(JSONObject jSONObject, String str, Object obj) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", obj);
            jSONObject.put(str, jSONObject2);
        } catch (Exception e) {
            LogUtils.e("VuiUtils", "generateElementValueJSON e:" + e.getMessage());
        }
    }

    public static String vuiElementGroupConvertToString(List<bin> list) {
        if (list == null) {
            return null;
        }
        return new GsonBuilder().registerTypeAdapter(Integer.class, new SceneIntegerTypeAdapter()).registerTypeAdapter(Boolean.class, new SceneBooleanTypeAdapter()).setExclusionStrategies(mExclusionStrategy).create().toJson(list);
    }

    public static VuiScene stringConvertToVuiScene(String str) {
        Gson gson = new Gson();
        if (str == null) {
            return null;
        }
        return (VuiScene) gson.fromJson(str, (Class<Object>) VuiScene.class);
    }

    public static bin stringConvertToVuiElement(String str) {
        Gson gson = new Gson();
        if (str == null) {
            return null;
        }
        return (bin) gson.fromJson(str, (Class<Object>) bin.class);
    }

    public static boolean is3DApp(String str) {
        return VuiConstants.UNITY.equals(str) || "com.DefaultCompany.VUIDemo".equals(str);
    }

    public static boolean isActiveSceneId(String str) {
        return VuiEngineImpl.mActiveSceneIds.containsValue(str) || VuiEngineImpl.mLeftPopPanelStack.contains(str) || VuiEngineImpl.mRightPopPanelStack.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SceneIntegerTypeAdapter extends TypeAdapter<Integer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Integer read(JsonReader jsonReader) {
            return null;
        }

        SceneIntegerTypeAdapter() {
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Integer num) {
            if (num != null && num.intValue() != -1) {
                jsonWriter.value(num);
            } else {
                jsonWriter.value((Number) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SceneBooleanTypeAdapter extends TypeAdapter<Boolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Boolean read(JsonReader jsonReader) {
            return null;
        }

        SceneBooleanTypeAdapter() {
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Boolean bool) {
            if (bool != null) {
                jsonWriter.value(bool.booleanValue());
            } else {
                jsonWriter.value((Number) null);
            }
        }
    }

    public static boolean isNumer(String str) {
        try {
            return Pattern.compile("-?[0-9]+(\\.[0-9]+)?").matcher(new BigDecimal(str).toString()).matches();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isNumeric(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public static <T> T getValueByName(bin binVar, String str) {
        Map map;
        Gson gson = new Gson();
        LogUtils.logDebug("getEventValueByName", "name:" + str + ListSignBean.COLLECTID_SUFFIX + gson.toJson(binVar));
        if (binVar == null || binVar.getResultActions() == null || binVar.getResultActions().isEmpty()) {
            return null;
        }
        String str2 = binVar.getResultActions().get(0);
        if ((binVar.getValues() instanceof LinkedTreeMap) && (map = (Map) binVar.getValues()) != null) {
            if (map.get(str2) instanceof LinkedTreeMap) {
                Map map2 = (Map) map.get(str2);
                if (map2 != null && map2.containsKey(str) && map2.get(str) != null) {
                    return (T) map2.get(str);
                }
            } else if (map.get(str) != null) {
                return (T) map.get(str);
            }
        }
        return null;
    }

    public static void setStatefulButtonAttr(View view, int i, String[] strArr, String str, boolean z) {
        if (view == null || strArr == null || strArr.length <= 0) {
            return;
        }
        if ((i >= 0 || i < strArr.length) && (view instanceof bhz)) {
            bhz bhzVar = (bhz) view;
            JSONObject vuiProps = bhzVar.getVuiProps();
            if (vuiProps != null && vuiProps.has("states") && vuiProps.has("curState")) {
                try {
                    if (!z) {
                        String str2 = "state_" + (i + 1);
                        if (view != null) {
                            if (!str2.equals(bhzVar.getVuiValue())) {
                                bhzVar.setVuiValue(str2, view);
                            }
                            if (TextUtils.isEmpty(str)) {
                                bhzVar.setVuiAction("SetValue");
                            } else {
                                bhzVar.setVuiAction(str);
                            }
                            bhzVar.setVuiElementType(bih.STATEFULBUTTON);
                            return;
                        }
                        return;
                    }
                    JSONArray optJSONArray = vuiProps.optJSONArray("states");
                    if (optJSONArray.length() == strArr.length) {
                        int i2 = 0;
                        boolean z2 = false;
                        while (i2 < optJSONArray.length()) {
                            JSONObject jSONObject = optJSONArray.getJSONObject(i2);
                            String str3 = strArr[i2];
                            StringBuilder sb = new StringBuilder();
                            sb.append("state_");
                            int i3 = i2 + 1;
                            sb.append(i3);
                            if (!str3.equals(jSONObject.getString(sb.toString()))) {
                                jSONObject.put("state_" + i3, strArr[i2]);
                                optJSONArray.put(i2, jSONObject);
                                z2 = true;
                            }
                            i2 = i3;
                        }
                        if (z2) {
                            vuiProps.put("states", optJSONArray);
                            bhzVar.setVuiValue("state_" + (i + 1), view);
                            if (view != null) {
                                bhzVar.setVuiProps(vuiProps);
                                bhzVar.setVuiElementType(bih.STATEFULBUTTON);
                            }
                        } else {
                            vuiProps.optString("curState", "");
                            String str4 = "state_" + (i + 1);
                            if (view != null) {
                                if (!str4.equals(bhzVar.getVuiValue())) {
                                    bhzVar.setVuiValue(str4, view);
                                }
                                bhzVar.setVuiElementType(bih.STATEFULBUTTON);
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            bhzVar.setVuiAction("SetValue");
                            return;
                        } else {
                            bhzVar.setVuiAction(str);
                            return;
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (vuiProps == null) {
                vuiProps = new JSONObject();
            }
            JSONObject createStatefulButtonData = createStatefulButtonData(i, strArr, vuiProps, view);
            if (createStatefulButtonData == null || view == null) {
                return;
            }
            bhzVar.setVuiElementType(bih.STATEFULBUTTON);
            if (TextUtils.isEmpty(str)) {
                bhzVar.setVuiAction("SetValue");
            } else {
                bhzVar.setVuiAction(str);
            }
            bhzVar.setVuiProps(createStatefulButtonData);
        }
    }

    public static void setStatefulButtonAttr(View view, int i, String[] strArr, String str) {
        setStatefulButtonAttr(view, i, strArr, str, false);
    }

    public static void setStatefulButtonAttr(View view, int i, String[] strArr) {
        setStatefulButtonAttr(view, i, strArr, null, false);
    }

    public static JSONObject createStatefulButtonData(int i, String[] strArr, JSONObject jSONObject) {
        if (strArr == null || strArr.length == 0 || i < 0 || i > strArr.length - 1) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            Object[] objArr = new String[strArr.length];
            int i2 = 0;
            while (i2 < strArr.length) {
                JSONObject jSONObject2 = new JSONObject();
                StringBuilder sb = new StringBuilder();
                sb.append("state_");
                int i3 = i2 + 1;
                sb.append(i3);
                String sb2 = sb.toString();
                objArr[i2] = sb2;
                jSONObject2.put(sb2, strArr[i2]);
                jSONArray.put(jSONObject2);
                i2 = i3;
            }
            jSONObject.put("states", jSONArray);
            jSONObject.put("curState", objArr[i]);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JSONObject createStatefulButtonData(int i, String[] strArr, JSONObject jSONObject, View view) {
        if (strArr == null || strArr.length == 0 || !(view instanceof bhz) || i < 0 || i > strArr.length - 1) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            String[] strArr2 = new String[strArr.length];
            int i2 = 0;
            while (i2 < strArr.length) {
                JSONObject jSONObject2 = new JSONObject();
                StringBuilder sb = new StringBuilder();
                sb.append("state_");
                int i3 = i2 + 1;
                sb.append(i3);
                String sb2 = sb.toString();
                strArr2[i2] = sb2;
                jSONObject2.put(sb2, strArr[i2]);
                jSONArray.put(jSONObject2);
                i2 = i3;
            }
            jSONObject.put("states", jSONArray);
            ((bhz) view).setVuiValue(strArr2[i], view);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void setStatefulButtonValue(View view, int i) {
        if (view instanceof bhz) {
            ((bhz) view).setVuiValue("state_" + (i + 1), view);
        }
    }

    public static bin generateCommonVuiElement(String str, bih bihVar, String str2, String str3) {
        return generateCommonVuiElement(str, bihVar, str2, str3, false, bik.LEVEL3);
    }

    public static bin generateCommonVuiElement(String str, bih bihVar, String str2, String str3, boolean z, bik bikVar) {
        bin a = new bin.a().c(str).a(bihVar.a()).b(str2).d(str3).a(System.currentTimeMillis()).a();
        if (z) {
            a.setLayoutLoadable(Boolean.valueOf(z));
        }
        if (bih.RECYCLEVIEW.a().equals(bihVar.a())) {
            a.setLayoutLoadable(true);
        }
        if (bik.LEVEL3.a() != bikVar.a()) {
            a.setPriority(bikVar.a());
        }
        return a;
    }

    public static bin generateCommonVuiElement(String str, bih bihVar, String str2, String str3, boolean z, bik bikVar, int i) {
        bin a = new bin.a().c(str).a(bihVar.a()).b(str2).d(str3).a(System.currentTimeMillis()).a();
        if (z) {
            a.setLayoutLoadable(Boolean.valueOf(z));
        }
        if (bih.RECYCLEVIEW.a().equals(bihVar.a())) {
            a.setLayoutLoadable(true);
            if (LIST_VEDIO_TYPE == i) {
                JsonObject jsonObject = new JsonObject();
                new HashMap();
                jsonObject.addProperty("matchedFirstPriority", (Boolean) true);
                jsonObject.addProperty("firstPriority", (Boolean) true);
                jsonObject.addProperty("listType", "videoList");
                a.setProps(jsonObject);
            }
        }
        if (bik.LEVEL3.a() != bikVar.a()) {
            a.setPriority(bikVar.a());
        }
        return a;
    }

    public static bin generateCommonVuiElement(int i, bih bihVar, String str, String str2) {
        return generateCommonVuiElement("" + i, bihVar, str, str2);
    }

    public static bin generateCommonVuiElement(int i, bih bihVar, String str) {
        return generateCommonVuiElement("" + i, bihVar, str, (String) null);
    }

    public static bin generateCommonVuiElement(String str, bih bihVar, String str2) {
        return generateCommonVuiElement(str, bihVar, str2, (String) null);
    }

    public static bin generateStatefulButtonElement(int i, String[] strArr, int i2) {
        String a = big.SETVALUE.a();
        return generateStatefulButtonElement(i, strArr, a, "" + i2, "");
    }

    public static bin generateStatefulButtonElement(int i, String[] strArr, String str) {
        return generateStatefulButtonElement(i, strArr, big.SETVALUE.a(), str, "");
    }

    public static bin generateStatefulButtonElement(int i, String[] strArr, String str, String str2) {
        return generateStatefulButtonElement(i, strArr, str, str2, "");
    }

    public static bin generateStatefulButtonElement(int i, String[] strArr, String str, int i2) {
        return generateStatefulButtonElement(i, strArr, str, "" + i2, "");
    }

    public static bin generateStatefulButtonElement(int i, String[] strArr, String str, String str2, String str3) {
        if (str == null) {
            str = big.SETVALUE.a();
        }
        long currentTimeMillis = System.currentTimeMillis();
        bin a = new bin.a().c(str2).a(bih.STATEFULBUTTON.a()).b(str3).a(currentTimeMillis).d(str).a();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String[] split = TextUtils.isEmpty(strArr[i2]) ? null : strArr[i2].split("-");
            if (split != null) {
                bin a2 = new bin.a().c(str2 + "_state_" + i2).a(bih.STATE.a()).b(split[0]).a(currentTimeMillis).a();
                if (split.length > 1) {
                    a2.setValues(split[1]);
                } else {
                    a2.setValues(split[0]);
                }
                arrayList.add(a2);
            }
        }
        setStatefulButtonValues(i, strArr, a);
        if (!arrayList.isEmpty()) {
            a.setElements(arrayList);
        }
        return a;
    }

    public static void setStatefulButtonValues(int i, String[] strArr, bin binVar) {
        Gson gson = new Gson();
        if (binVar.getActions() == null || i < 0 || i >= strArr.length) {
            return;
        }
        ArrayList arrayList = new ArrayList(binVar.actions.entrySet());
        JSONObject jSONObject = new JSONObject();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (big.SETVALUE.a().equalsIgnoreCase((String) ((Map.Entry) arrayList.get(i2)).getKey())) {
                String[] split = TextUtils.isEmpty(strArr[i]) ? null : strArr[i].split("-");
                if (split != null && split.length >= 1) {
                    generateElementValueJSON(jSONObject, "SetValue", split[0]);
                }
            }
        }
        binVar.setValues(gson.fromJson(jSONObject.toString(), (Class<Object>) JsonObject.class));
    }

    public static boolean canUseVuiFeature() {
        return platformIsSupport() && !userDisabledFeature;
    }

    public static boolean platformIsSupport() {
        if (isOverseasVersion()) {
            return false;
        }
        String carPlatForm = getCarPlatForm();
        if (TextUtils.isEmpty(carPlatForm) && bfj.a(VuiConstants.VUI_SCENE_THIRD_APP)) {
            return true;
        }
        return (TextUtils.isEmpty(carPlatForm) || unSupportType.contains(carPlatForm) || !bfj.a("com.xiaopeng.carspeechservice")) ? false : true;
    }

    public static boolean is3DUIPlatForm() {
        boolean a = bfj.a(VuiConstants.UNITY);
        LogUtils.i("VuiUtils", "is3DUIPlatForm:  " + a);
        return a;
    }

    public static boolean isMultiScreenPlatForm() {
        return supportMultiScreenPlatform.contains(getCarPlatForm());
    }

    public static boolean isOverseasVersion() {
        if (sRegion == null) {
            sRegion = getVersionInCountryCode();
            LogUtils.i("VuiUtils", "CountryCode:" + sRegion);
        }
        if (TextUtils.isEmpty(sRegion)) {
            return false;
        }
        return "EU".equals(sRegion.toUpperCase());
    }

    public static String getVersionInCountryCode() {
        String str = SystemProperties.get("ro.xiaopeng.software", "");
        return ("".equals(str) || str == null) ? str : str.substring(7, 9);
    }

    public static boolean cannotUpload() {
        if (isFeatureDisabled()) {
            LogUtils.d("VuiUtils", "canUseVuiFeature():" + canUseVuiFeature() + ",isFeatureDisabled:" + isFeatureDisabled());
        }
        return !canUseVuiFeature() || isFeatureDisabled();
    }

    public static boolean isFeatureDisabled() {
        return isDisableVuiFeature;
    }

    public static void disableVuiFeature() {
        isDisableVuiFeature = true;
    }

    public static void enableVuiFeature() {
        isDisableVuiFeature = false;
    }

    public static void userSetFeatureState(boolean z) {
        userDisabledFeature = z;
    }

    public static String getResourceName(int i) {
        int indexOf;
        try {
            String resourceName = Foo.getContext().getResources().getResourceName(i);
            return (TextUtils.isEmpty(resourceName) || (indexOf = resourceName.indexOf(":")) == -1) ? resourceName : resourceName.substring(indexOf + 1);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void userDisableViewMode() {
        viewMode = bij.DISABLED;
    }

    public static bij getViewMode() {
        return viewMode;
    }

    public static SoftReference<View> findRecyclerView(SoftReference<View> softReference) {
        LinkedList linkedList = new LinkedList();
        linkedList.offer(softReference);
        while (!linkedList.isEmpty()) {
            SoftReference<View> softReference2 = (SoftReference) linkedList.poll();
            if (softReference2 != null && (softReference2.get() instanceof RecyclerView)) {
                return softReference2;
            }
            if (softReference2 != null && (softReference2.get() instanceof ViewGroup)) {
                SoftReference softReference3 = new SoftReference((ViewGroup) softReference2.get());
                for (int i = 0; softReference3.get() != null && i < ((ViewGroup) softReference3.get()).getChildCount(); i++) {
                    SoftReference softReference4 = new SoftReference(((ViewGroup) softReference3.get()).getChildAt(i));
                    if (softReference4.get() instanceof ViewGroup) {
                        linkedList.offer(softReference4);
                    }
                }
            }
        }
        return null;
    }

    public static View findChildRecyclerView(RecyclerView recyclerView) {
        if (recyclerView != null) {
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < recyclerView.getChildCount(); i++) {
                linkedList.offer(recyclerView.getChildAt(i));
            }
            while (!linkedList.isEmpty()) {
                View view = (View) linkedList.poll();
                if (view instanceof RecyclerView) {
                    return view;
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof ViewGroup) {
                            linkedList.offer(childAt);
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static int getExtraPage(bin binVar) {
        JsonObject props;
        if (binVar.getProps() == null || (props = binVar.getProps()) == null || !props.has("extraPage")) {
            return -1;
        }
        return props.get("extraPage").getAsInt();
    }

    public static ViewPager findViewPager(View view) {
        LinkedList linkedList = new LinkedList();
        linkedList.offer(view);
        while (!linkedList.isEmpty()) {
            View view2 = (View) linkedList.poll();
            if (view2 instanceof ViewPager) {
                return (ViewPager) view2;
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof ViewGroup) {
                        linkedList.offer(childAt);
                    }
                }
            }
        }
        return null;
    }

    public static String getPackageNameFromSceneId(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains("-")) {
            return str.split("-")[0];
        }
        if (str.contains("_")) {
            return str.split("_")[0];
        }
        return null;
    }

    public static boolean isThirdApp(String str) {
        if ("com.android.systemui".equals(str)) {
            return false;
        }
        return TextUtils.isEmpty(str) || !str.startsWith("com.xiaopeng") || "com.xiaopeng.xpdemo".equals(str) || "com.xiaopeng.VuiDemo".equals(str);
    }

    public static void setValueAttribute(View view, bin binVar) {
        Object vuiValue;
        Gson gson = new Gson();
        if (view == null || binVar == null || !(view instanceof bhz)) {
            return;
        }
        String type = binVar.getType();
        JSONObject jSONObject = new JSONObject();
        if (type != null && type.equals(bih.RADIOBUTTON.a())) {
            setPropsEvent(view, binVar, jSONObject);
        } else if (type != null && type.equals(bih.CHECKBOX.a())) {
            setPropsEvent(view, binVar, jSONObject);
        } else if (type != null && type.equals(bih.SWITCH.a())) {
            setPropsEvent(view, binVar, jSONObject);
        } else if (type != null && type.equals(bih.SEEKBAR.a())) {
            if (view != null && (view instanceof ProgressBar)) {
                generateElementValueJSON(jSONObject, big.SETVALUE.a(), Integer.valueOf(((ProgressBar) view).getProgress()));
            }
            binVar.setValues(gson.fromJson(jSONObject.toString(), (Class<Object>) JsonObject.class));
        } else {
            if (type != null && type.equals(bih.XSLIDER.a())) {
                try {
                    try {
                        vuiValue = view instanceof bhz ? ((bhz) view).getVuiValue() : null;
                        if (vuiValue == null) {
                            vuiValue = getReflexMethod(view, "getIndicatorValue");
                        }
                    } catch (Throwable th) {
                        Object reflexMethod = getReflexMethod(view, "getIndicatorValue");
                        if (reflexMethod != null && (reflexMethod instanceof Float)) {
                            generateElementValueJSON(jSONObject, big.SETVALUE.a(), Integer.valueOf(((Float) reflexMethod).intValue()));
                            binVar.setValues(gson.fromJson(jSONObject.toString(), (Class<Object>) JsonObject.class));
                        }
                        throw th;
                    }
                } catch (Throwable unused) {
                    LogUtils.e("xpui version is not correct");
                    Object reflexMethod2 = getReflexMethod(view, "getIndicatorValue");
                    if (reflexMethod2 == null || !(reflexMethod2 instanceof Float)) {
                        return;
                    }
                    generateElementValueJSON(jSONObject, big.SETVALUE.a(), Integer.valueOf(((Float) reflexMethod2).intValue()));
                }
                if (vuiValue == null || !(vuiValue instanceof Float)) {
                    return;
                }
                generateElementValueJSON(jSONObject, big.SETVALUE.a(), Integer.valueOf(((Float) vuiValue).intValue()));
                binVar.setValues(gson.fromJson(jSONObject.toString(), (Class<Object>) JsonObject.class));
            } else if (type == null || !type.equals(bih.XTABLAYOUT.a())) {
            } else {
                try {
                    try {
                        vuiValue = view instanceof bhz ? ((bhz) view).getVuiValue() : null;
                        if (vuiValue == null) {
                            vuiValue = getReflexMethod(view, "getSelectedTabIndex");
                        }
                    } catch (Throwable unused2) {
                        LogUtils.w("xpui version is not correct");
                        Object reflexMethod3 = getReflexMethod(view, "getSelectedTabIndex");
                        if (reflexMethod3 == null || !(reflexMethod3 instanceof Integer)) {
                            return;
                        }
                        generateElementValueJSON(jSONObject, big.SELECTTAB.a(), Integer.valueOf(((Integer) reflexMethod3).intValue()));
                    }
                    if (vuiValue == null || !(vuiValue instanceof Integer)) {
                        return;
                    }
                    generateElementValueJSON(jSONObject, big.SELECTTAB.a(), Integer.valueOf(((Integer) vuiValue).intValue()));
                    binVar.setValues(gson.fromJson(jSONObject.toString(), (Class<Object>) JsonObject.class));
                } catch (Throwable th2) {
                    Object reflexMethod4 = getReflexMethod(view, "getSelectedTabIndex");
                    if (reflexMethod4 != null && (reflexMethod4 instanceof Integer)) {
                        generateElementValueJSON(jSONObject, big.SELECTTAB.a(), Integer.valueOf(((Integer) reflexMethod4).intValue()));
                        binVar.setValues(gson.fromJson(jSONObject.toString(), (Class<Object>) JsonObject.class));
                    }
                    throw th2;
                }
            }
        }
    }

    private static void setPropsEvent(View view, bin binVar, JSONObject jSONObject) {
        boolean z;
        Gson gson = new Gson();
        if (view != null && (view instanceof CompoundButton)) {
            z = ((CompoundButton) view).isChecked();
        } else if (view != null && (view instanceof Checkable)) {
            z = ((Checkable) view).isChecked();
        } else if (view != null) {
            Object vuiValue = ((bhz) view).getVuiValue();
            if (vuiValue != null && (vuiValue instanceof Boolean)) {
                z = ((Boolean) vuiValue).booleanValue();
            } else {
                z = view.isSelected();
            }
        } else {
            z = false;
        }
        generateElementValueJSON(jSONObject, big.SETCHECK.a(), Boolean.valueOf(z));
        setVuiPriority((bhz) view, binVar, z);
        binVar.setValues(gson.fromJson(jSONObject.toString(), (Class<Object>) JsonObject.class));
    }

    private static void setVuiPriority(bhz bhzVar, bin binVar, boolean z) {
        if (bhzVar == null || binVar == null) {
            return;
        }
        try {
            JSONObject vuiProps = bhzVar.getVuiProps();
            if (vuiProps != null && vuiProps.has(VuiConstants.PROPS_DEFAULTPRIORITY)) {
                if (z) {
                    binVar.setPriority(bik.LEVEL1.a());
                } else {
                    binVar.setPriority(vuiProps.getInt(VuiConstants.PROPS_DEFAULTPRIORITY));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static Object getReflexMethod(View view, String str) {
        Method declaredMethod;
        if (view == null || (declaredMethod = getDeclaredMethod(view, str, null)) == null) {
            return null;
        }
        try {
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(view, null);
        } catch (Exception e) {
            LogUtils.e("VuiUtils", "getReflexMethod:" + e.getMessage());
            return null;
        }
    }

    private static Method getDeclaredMethod(Object obj, String str, Class<?>... clsArr) {
        Method declaredMethod;
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
            }
            if (declaredMethod != null) {
                return declaredMethod;
            }
        }
        return null;
    }

    public static void addScrollProps(bin binVar, View view) {
        if (binVar != null) {
            try {
                JsonObject props = binVar.getProps();
                if (props == null) {
                    props = new JsonObject();
                }
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    if (binVar.getActions() != null) {
                        ArrayList arrayList = new ArrayList(binVar.actions.entrySet());
                        if (!arrayList.isEmpty()) {
                            if (big.SCROLLBYY.a().equals(((Map.Entry) arrayList.get(0)).getKey())) {
                                props.addProperty(VuiConstants.PROPS_SCROLLUP, Boolean.valueOf(recyclerView.canScrollVertically(-1)));
                                props.addProperty(VuiConstants.PROPS_SCROLLDOWN, Boolean.valueOf(recyclerView.canScrollVertically(1)));
                            } else if (big.SCROLLBYX.a().equals(((Map.Entry) arrayList.get(0)).getKey())) {
                                props.addProperty(VuiConstants.PROPS_SCROLLRIGHT, Boolean.valueOf(recyclerView.canScrollVertically(1)));
                                props.addProperty(VuiConstants.PROPS_SCROLLLEFT, Boolean.valueOf(recyclerView.canScrollVertically(-1)));
                            }
                        }
                    }
                }
                binVar.setProps(props);
            } catch (Exception unused) {
            }
        }
    }

    public static void addProps(bin binVar, Map<String, Boolean> map) {
        if (binVar == null || map == null) {
            return;
        }
        try {
            if (map.size() > 0) {
                JsonObject props = binVar.getProps();
                if (props == null) {
                    props = new JsonObject();
                }
                ArrayList arrayList = new ArrayList(map.entrySet());
                for (int i = 0; i < arrayList.size(); i++) {
                    Map.Entry entry = (Map.Entry) arrayList.get(i);
                    props.addProperty((String) entry.getKey(), (Boolean) entry.getValue());
                }
                binVar.setProps(props);
            }
        } catch (Exception unused) {
        }
    }

    public static void addHasFeedbackProp(bhz bhzVar) {
        if (bhzVar != null) {
            try {
                JSONObject vuiProps = bhzVar.getVuiProps();
                if (vuiProps == null) {
                    vuiProps = new JSONObject();
                }
                vuiProps.put(VuiConstants.PROPS_FEEDBACK, true);
                bhzVar.setVuiProps(vuiProps);
            } catch (Exception unused) {
            }
        }
    }

    public static void addCanVoiceControlProp(bhz bhzVar) {
        if (bhzVar != null) {
            try {
                JSONObject vuiProps = bhzVar.getVuiProps();
                if (vuiProps == null) {
                    vuiProps = new JSONObject();
                }
                vuiProps.put(VuiConstants.PROPS_VOICECONTROL, true);
                bhzVar.setVuiProps(vuiProps);
            } catch (Exception unused) {
            }
        }
    }

    public static void addGeneralActProp(bhz bhzVar, String str) {
        if (bhzVar != null) {
            try {
                JSONObject vuiProps = bhzVar.getVuiProps();
                if (vuiProps == null) {
                    vuiProps = new JSONObject();
                }
                vuiProps.put(VuiConstants.PROPS_GENERALACT, str);
                bhzVar.setVuiProps(vuiProps);
            } catch (Exception unused) {
            }
        }
    }

    public static void addUnitProp(bhz bhzVar, String str) {
        if (bhzVar != null) {
            try {
                JSONObject vuiProps = bhzVar.getVuiProps();
                if (vuiProps == null) {
                    vuiProps = new JSONObject();
                }
                vuiProps.put(VuiConstants.PROPS_UNIT, str);
                bhzVar.setVuiProps(vuiProps);
            } catch (Exception unused) {
            }
        }
    }

    public static void addUnsupportProp(bhz bhzVar) {
        if (bhzVar != null) {
            try {
                JSONObject vuiProps = bhzVar.getVuiProps();
                if (vuiProps == null) {
                    vuiProps = new JSONObject();
                }
                vuiProps.put(VuiConstants.PROPS_UNSUPPORTED, true);
                bhzVar.setVuiProps(vuiProps);
            } catch (Exception unused) {
            }
        }
    }

    public static void addDisableTplProp(bhz bhzVar) {
        if (bhzVar != null) {
            try {
                JSONObject vuiProps = bhzVar.getVuiProps();
                if (vuiProps == null) {
                    vuiProps = new JSONObject();
                }
                vuiProps.put(VuiConstants.PROPS_DISABLETPL, true);
                bhzVar.setVuiProps(vuiProps);
            } catch (Exception unused) {
            }
        }
    }

    public static void addMatchFirstProp(bhz bhzVar) {
        if (bhzVar != null) {
            try {
                JSONObject vuiProps = bhzVar.getVuiProps();
                if (vuiProps == null) {
                    vuiProps = new JSONObject();
                }
                vuiProps.put(VuiConstants.PROPS_MATCHFIRSTPRIORITY, true);
                bhzVar.setVuiProps(vuiProps);
            } catch (Exception unused) {
            }
        }
    }

    public static void addSKipAlreadyProp(bhz bhzVar) {
        if (bhzVar != null) {
            try {
                JSONObject vuiProps = bhzVar.getVuiProps();
                if (vuiProps == null) {
                    vuiProps = new JSONObject();
                }
                vuiProps.put(VuiConstants.PROPS_SKIPALREADY, true);
                bhzVar.setVuiProps(vuiProps);
            } catch (Exception unused) {
            }
        }
    }

    public static void addDefaultPriorityValue(bhz bhzVar, int i) {
        if (bhzVar != null) {
            try {
                JSONObject vuiProps = bhzVar.getVuiProps();
                if (vuiProps == null) {
                    vuiProps = new JSONObject();
                }
                vuiProps.put(VuiConstants.PROPS_DEFAULTPRIORITY, i);
                bhzVar.setVuiProps(vuiProps);
            } catch (Exception unused) {
            }
        }
    }

    public static void addProps(bhz bhzVar, Map<String, Object> map) {
        if (bhzVar == null || map == null) {
            return;
        }
        try {
            if (map.size() > 0) {
                JSONObject vuiProps = bhzVar.getVuiProps();
                if (vuiProps == null) {
                    vuiProps = new JSONObject();
                }
                ArrayList arrayList = new ArrayList(map.entrySet());
                for (int i = 0; i < arrayList.size(); i++) {
                    Map.Entry entry = (Map.Entry) arrayList.get(i);
                    vuiProps.put((String) entry.getKey(), entry.getValue());
                }
                bhzVar.setVuiProps(vuiProps);
            }
        } catch (Exception unused) {
        }
    }

    public static void setRecyclerViewItemVuiAttr(bhz bhzVar, int i, String str) {
        setRecyclerViewItemVuiAttr(bhzVar, i, str, null, null);
    }

    public static void setRecyclerViewItemVuiAttr(bhz bhzVar, int i, String str, bih bihVar) {
        setRecyclerViewItemVuiAttr(bhzVar, i, str, bihVar, null);
    }

    public static void setRecyclerViewItemVuiAttr(bhz bhzVar, int i, String str, bih bihVar, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            VuiEngine.getInstance(Foo.getContext()).setVuiElementTag((View) bhzVar, str2 + "_" + i);
        } else {
            bhzVar.setVuiElementId(((View) bhzVar).getId() + "_" + i);
        }
        bhzVar.setVuiPosition(i);
        if (TextUtils.isEmpty(str)) {
            bhzVar.setVuiLabel(str);
        }
        bhzVar.setVuiPosition(i);
        if (bihVar != null) {
            bhzVar.setVuiElementType(bihVar);
        }
    }

    public static String getCarPlatForm() {
        String str = sType;
        if (str != null) {
            return str;
        }
        sType = getXpCduType();
        return sType;
    }

    public static String getXpCduType() {
        String str = SystemProperties.get("ro.xiaopeng.software", "");
        return "".equals(str) ? str : str.substring(5, 7);
    }

    public static boolean isPerformVuiAction(View view) {
        if (view instanceof bhz) {
            return ((bhz) view).isPerformVuiAction();
        }
        return false;
    }

    public static String getDisplayLocation(String str) {
        return "0".equals(str) ? VuiConstants.SCREEN_DISPLAY_LF : "1".equals(str) ? VuiConstants.SCREEN_DISPLAY_RF : (VuiConstants.SCREEN_DISPLAY_LF.equals(str) || VuiConstants.SCREEN_DISPLAY_RF.equals(str)) ? str : VuiConstants.SCREEN_DISPLAY_LF;
    }

    public static String getSourceDisplayLocation() {
        if (Foo.getContext() == null) {
            return VuiConstants.SCREEN_DISPLAY_LF;
        }
        try {
            int screenId = WindowManagerFactory.create(Foo.getContext()).getScreenId(Foo.getContext().getApplicationInfo().packageName);
            LogUtils.d("VuiUtils:  ", screenId + "");
            return String.valueOf(screenId);
        } catch (Throwable th) {
            th.printStackTrace();
            return VuiConstants.SCREEN_DISPLAY_LF;
        }
    }
}
