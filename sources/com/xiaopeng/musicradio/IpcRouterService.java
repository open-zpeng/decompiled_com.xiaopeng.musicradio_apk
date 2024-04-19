package com.xiaopeng.musicradio;

import android.util.Log;
import androidx.annotation.Keep;
import com.xiaopeng.lib.apirouter.server.IServicePublisher;
import com.xiaopeng.musicradio.speech.command.PushCommand;
import org.json.JSONException;
import org.json.JSONObject;
@Keep
/* loaded from: classes.dex */
public class IpcRouterService implements IServicePublisher {
    private static final String TAG = "MusicIpcRouterService";

    public void onReceiverData(int i, String str) {
        JSONObject jSONObject;
        Log.i(TAG, "onReceiverData: " + i + " bundle = " + str);
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        new PushCommand(i, jSONObject).onEvent();
    }
}
