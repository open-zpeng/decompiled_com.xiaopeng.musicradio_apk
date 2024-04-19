package com.xiaopeng.musicradio;

import android.util.Log;
import androidx.annotation.Keep;
import com.xiaopeng.lib.apirouter.server.IServicePublisher;
import com.xiaopeng.speech.vui.VuiEngine;
@Keep
/* loaded from: classes.dex */
public class WebViewVuiObserver implements IServicePublisher {
    public void onEvent(String str, String str2) {
        Log.i("DemoObserver", "消息接收 data== " + str2);
        VuiEngine.getInstance(a.a).dispatchVuiEvent(str, str2);
    }

    public String getElementState(String str, String str2) {
        return VuiEngine.getInstance(a.a).getElementState(str, str2);
    }
}
