package com.xiaopeng.musicradio.utils;

import android.view.View;
import android.view.ViewParent;
import defpackage.agu;
/* compiled from: ViewUtil.java */
/* loaded from: classes2.dex */
public class bk {
    public static boolean a(View view) {
        if (view.getVisibility() != 0) {
            return true;
        }
        View rootView = view.getRootView();
        for (ViewParent parent = view.getParent(); parent != null && rootView != parent; parent = parent.getParent()) {
            if ((parent instanceof View) && ((View) parent).getVisibility() != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(View view) {
        View rootView = view.getRootView();
        for (ViewParent parent = view.getParent(); parent != null && rootView != parent; parent = parent.getParent()) {
            if ((parent instanceof View) && ((View) parent).getTag(agu.a.tag_dialog) != null) {
                return true;
            }
        }
        return false;
    }
}
