package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: FontScaleCompatViewInflater.java */
/* renamed from: beg  reason: default package */
/* loaded from: classes2.dex */
class beg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static View a(View view, String str, Context context, AttributeSet attributeSet, boolean z) {
        if (z && view != null) {
            context = view.getContext();
        }
        return a(context, str, attributeSet);
    }

    private static View a(Context context, String str, AttributeSet attributeSet) {
        if (str.contains(".")) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 5;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 4;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 3;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 2;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new bec(context, attributeSet);
            case 1:
                return new bdw(context, attributeSet);
            case 2:
                return new bdz(context, attributeSet);
            case 3:
                return new bdx(context, attributeSet);
            case 4:
                return new beb(context, attributeSet);
            case 5:
                return new bdy(context, attributeSet);
            default:
                return null;
        }
    }
}
