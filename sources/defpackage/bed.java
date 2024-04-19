package defpackage;

import android.text.TextUtils;
/* compiled from: FontScaleUtils.java */
/* renamed from: bed  reason: default package */
/* loaded from: classes2.dex */
public class bed {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean a(String str) {
        char c;
        if (TextUtils.isEmpty(str) || str.contains(".")) {
            return false;
        }
        switch (str.hashCode()) {
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }
}
