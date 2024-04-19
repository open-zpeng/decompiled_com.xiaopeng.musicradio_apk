package com.xiaopeng.xui.vui.utils;
/* loaded from: classes2.dex */
public class VuiCommonUtils {
    public static bik getViewLeveByPriority(int i) {
        switch (i) {
            case 0:
                return bik.LEVEL1;
            case 1:
                return bik.LEVEL2;
            case 2:
                return bik.LEVEL3;
            case 3:
                return bik.LEVEL4;
            default:
                return bik.LEVEL3;
        }
    }

    public static bij getVuiMode(int i) {
        switch (i) {
            case 1:
                return bij.DISABLED;
            case 2:
                return bij.SILENT;
            case 3:
                return bij.UNDERSTOOD;
            default:
                return bij.NORMAL;
        }
    }

    public static bii getFeedbackType(int i) {
        switch (i) {
            case 1:
                return bii.SOUND;
            case 2:
                return bii.TTS;
            default:
                return bii.SOUND;
        }
    }

    public static bih getElementType(int i) {
        switch (i) {
            case 1:
                return bih.BUTTON;
            case 2:
                return bih.LISTVIEW;
            case 3:
                return bih.CHECKBOX;
            case 4:
                return bih.RADIOBUTTON;
            case 5:
                return bih.RADIOGROUP;
            case 6:
                return bih.GROUP;
            case 7:
                return bih.EDITTEXT;
            case 8:
                return bih.PROGRESSBAR;
            case 9:
                return bih.SEEKBAR;
            case 10:
                return bih.TABHOST;
            case 11:
                return bih.SEARCHVIEW;
            case 12:
                return bih.RATINGBAR;
            case 13:
                return bih.IMAGEBUTTON;
            case 14:
                return bih.IMAGEVIEW;
            case 15:
                return bih.SCROLLVIEW;
            case 16:
                return bih.TEXTVIEW;
            case 17:
                return bih.RECYCLEVIEW;
            case 18:
                return bih.SWITCH;
            case 19:
                return bih.CUSTOM;
            case 20:
                return bih.XSLIDER;
            case 21:
                return bih.XTABLAYOUT;
            case 22:
                return bih.XGROUPHEADER;
            default:
                return bih.UNKNOWN;
        }
    }
}
