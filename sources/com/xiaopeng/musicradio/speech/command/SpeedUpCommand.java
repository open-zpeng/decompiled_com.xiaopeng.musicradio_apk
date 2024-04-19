package com.xiaopeng.musicradio.speech.command;

import android.util.Log;
import com.xiaopeng.musicradio.model.dui.f;
/* loaded from: classes2.dex */
public class SpeedUpCommand extends bae {
    public static final String TAG = "SpeedUpCommand";

    @Override // defpackage.bae
    public String getCommand() {
        return "SpeedUpCommand";
    }

    public SpeedUpCommand(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.bae
    protected void a(String str, String str2) {
        Log.i("SpeedUpCommand", "doCommand: " + str + " data = " + str2);
        f.a().r();
    }
}
