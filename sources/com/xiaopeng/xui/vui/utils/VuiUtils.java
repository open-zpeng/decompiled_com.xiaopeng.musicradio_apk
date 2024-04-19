package com.xiaopeng.xui.vui.utils;

import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.xui.vui.VuiView;
import com.xiaopeng.xui.widget.XButton;
import com.xiaopeng.xui.widget.XCheckBox;
import com.xiaopeng.xui.widget.XEditText;
import com.xiaopeng.xui.widget.XGroupHeader;
import com.xiaopeng.xui.widget.XImageButton;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XProgressBar;
import com.xiaopeng.xui.widget.XRadioButton;
import com.xiaopeng.xui.widget.XRadioGroup;
import com.xiaopeng.xui.widget.XRecyclerView;
import com.xiaopeng.xui.widget.XScrollView;
import com.xiaopeng.xui.widget.XSeekBar;
import com.xiaopeng.xui.widget.XSwitch;
import com.xiaopeng.xui.widget.XTabLayout;
import com.xiaopeng.xui.widget.XTextView;
import com.xiaopeng.xui.widget.XViewPager;
import com.xiaopeng.xui.widget.slider.XSlider;
import com.xiaopeng.xui.widget.timepicker.XTimePicker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@Deprecated
/* loaded from: classes2.dex */
public class VuiUtils {
    public static bih getElementType(Object obj) {
        if (obj instanceof XImageView) {
            return bih.IMAGEVIEW;
        }
        if (obj instanceof XImageButton) {
            return bih.IMAGEBUTTON;
        }
        if (obj instanceof XButton) {
            return bih.BUTTON;
        }
        if (obj instanceof XTextView) {
            return bih.TEXTVIEW;
        }
        if (obj instanceof XRadioButton) {
            return bih.RADIOBUTTON;
        }
        if (obj instanceof XCheckBox) {
            return bih.CHECKBOX;
        }
        if (obj instanceof XSwitch) {
            return bih.SWITCH;
        }
        if (obj instanceof XRecyclerView) {
            return bih.RECYCLEVIEW;
        }
        if (obj instanceof XProgressBar) {
            return bih.PROGRESSBAR;
        }
        if (obj instanceof XScrollView) {
            return bih.SCROLLVIEW;
        }
        if (obj instanceof XSlider) {
            return bih.XSLIDER;
        }
        if (obj instanceof XTabLayout) {
            return bih.XTABLAYOUT;
        }
        if (obj instanceof XRadioGroup) {
            return bih.RADIOGROUP;
        }
        if (obj instanceof XEditText) {
            return bih.EDITTEXT;
        }
        if (obj instanceof XGroupHeader) {
            return bih.XGROUPHEADER;
        }
        if (obj instanceof XSeekBar) {
            return bih.SEEKBAR;
        }
        if (obj instanceof XTimePicker) {
            return bih.TIMEPICKER;
        }
        if (obj instanceof XViewPager) {
            return bih.VIEWPAGER;
        }
        if (obj instanceof ViewGroup) {
            return bih.GROUP;
        }
        return bih.UNKNOWN;
    }

    @Deprecated
    public static boolean isPerformVuiAction(View view) {
        return isPerformVuiActionAndReset(view);
    }

    public static boolean isPerformVuiActionNonReset(View view) {
        if (view instanceof VuiView) {
            return ((VuiView) view).isPerformVuiAction();
        }
        return false;
    }

    public static boolean isPerformVuiActionAndReset(View view) {
        if (view instanceof VuiView) {
            VuiView vuiView = (VuiView) view;
            boolean isPerformVuiAction = vuiView.isPerformVuiAction();
            vuiView.setPerformVuiAction(false);
            return isPerformVuiAction;
        }
        return false;
    }

    public static void setStatefulButtonAttr(VuiView vuiView, int i, String[] strArr) {
        JSONObject createStatefulButtonData;
        if (vuiView == null || (createStatefulButtonData = createStatefulButtonData(i, strArr)) == null) {
            return;
        }
        vuiView.setVuiElementType(bih.STATEFULBUTTON);
        vuiView.setVuiAction("SetValue");
        vuiView.setVuiProps(createStatefulButtonData);
    }

    public static JSONObject createStatefulButtonData(int i, String[] strArr) {
        if (strArr == null || strArr.length == 0 || i < 0 || i > strArr.length - 1) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
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
}
