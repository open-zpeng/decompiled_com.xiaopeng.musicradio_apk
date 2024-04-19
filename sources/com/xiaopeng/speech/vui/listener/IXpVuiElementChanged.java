package com.xiaopeng.speech.vui.listener;

import android.view.View;
import java.util.List;
/* loaded from: classes2.dex */
public interface IXpVuiElementChanged {
    default void onVuiElementChanged(String str, View view) {
    }

    default void onVuiElementChanged(String str, View view, List<bin> list) {
    }

    default void onVuiElementChanged(String str, View view, String[] strArr, int i) {
    }
}
