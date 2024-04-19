package com.xiaopeng.musicradio.speech.command;

import android.util.Log;
import com.xiaopeng.musicradio.model.dui.c;
/* loaded from: classes2.dex */
public class FmNetworkOffCommand extends bae {
    public static final String TAG = "FmNetworkOffCommand";

    @Override // defpackage.bae
    public String getCommand() {
        return TAG;
    }

    public FmNetworkOffCommand(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.bae
    protected void a(String str, String str2) {
        Log.i(TAG, "doCommand: " + str + " data = " + str2);
        c.a().f();
    }
}
