package com.xiaopeng.xui.vui.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
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
import com.xiaopeng.xui.widget.XSegmented;
import com.xiaopeng.xui.widget.XSwitch;
import com.xiaopeng.xui.widget.XTabLayout;
import com.xiaopeng.xui.widget.XTextView;
import com.xiaopeng.xui.widget.XViewPager;
import com.xiaopeng.xui.widget.slider.XSlider;
import com.xiaopeng.xui.widget.timepicker.XTimePicker;
/* loaded from: classes2.dex */
public class VuiViewUtils {
    static Handler mHandler;
    static HandlerThread mThread = new HandlerThread("VuiUpdate");

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
        if (obj instanceof XSegmented) {
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

    public static void updateVui(final bib bibVar, final View view, final bil bilVar) {
        try {
            if (mHandler == null) {
                mThread.start();
                mHandler = new Handler(mThread.getLooper());
            }
            if (mHandler != null) {
                mHandler.post(new Runnable() { // from class: com.xiaopeng.xui.vui.utils.VuiViewUtils.1
                    @Override // java.lang.Runnable
                    public void run() {
                        View view2;
                        bib bibVar2 = bib.this;
                        if (bibVar2 == null || (view2 = view) == null) {
                            return;
                        }
                        bibVar2.onVuiElementChaned(view2, bilVar);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
