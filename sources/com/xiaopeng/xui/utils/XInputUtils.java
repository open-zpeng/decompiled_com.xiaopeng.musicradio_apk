package com.xiaopeng.xui.utils;

import android.view.View;
import com.google.android.exoplayer2.C;
/* loaded from: classes2.dex */
public class XInputUtils {
    public static void ignoreHiddenInput(View view) {
        view.setTag(C.ENCODING_PCM_MU_LAW, 1001);
    }
}
