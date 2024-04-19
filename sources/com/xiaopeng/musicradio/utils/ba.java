package com.xiaopeng.musicradio.utils;

import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* compiled from: SoftInputUtil.java */
/* loaded from: classes2.dex */
public class ba {
    public static void a(InputMethodManager inputMethodManager) {
        aw.a(inputMethodManager, "finishInputLocked", new Class[0], new Object[0]);
    }

    public static void a(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) com.xiaopeng.musicradio.a.a.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2);
        }
    }

    public static void b(View view) {
        Log.i("SoftInputUtil", "focusView: " + view);
        InputMethodManager inputMethodManager = (InputMethodManager) com.xiaopeng.musicradio.a.a.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view == null ? null : view.getWindowToken(), 0);
        }
    }
}
