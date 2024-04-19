package com.xiaopeng.musicradio.speech.command;

import android.util.Log;
import com.xiaopeng.musicradio.model.dui.f;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ForwardCommand extends bae {
    public static final String TAG = "ForwardCommand";

    @Override // defpackage.bae
    public String getCommand() {
        return TAG;
    }

    public ForwardCommand(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.bae
    protected void a(String str, String str2) {
        Log.i(TAG, "doCommand: " + str + " data = " + str2);
        try {
            f.a().a(new JSONObject(str2).optInt("value"));
        } catch (Exception e) {
            Log.e(TAG, "onEvent:forward  ", e);
        }
    }
}
