package com.xiaopeng.musicradio.speech.command;

import android.util.Log;
import com.xiaopeng.musicradio.model.dui.f;
/* loaded from: classes2.dex */
public class PlayUsbCommand extends bae {
    public static final String TAG = "PlayUsbCommand";

    @Override // defpackage.bae
    public String getCommand() {
        return TAG;
    }

    public PlayUsbCommand(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.bae
    protected void a(String str, String str2) {
        Log.i(TAG, "doCommand: " + str + " data = " + str2);
        f.a().v();
    }
}
