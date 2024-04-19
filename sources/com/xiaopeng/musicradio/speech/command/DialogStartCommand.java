package com.xiaopeng.musicradio.speech.command;

import android.util.Log;
import com.xiaopeng.musicradio.model.dui.h;
/* loaded from: classes2.dex */
public class DialogStartCommand extends bae {
    public static final String TAG = "DialogStartCommand";

    @Override // defpackage.bae
    protected void a() {
    }

    @Override // defpackage.bae
    public String getCommand() {
        return TAG;
    }

    public DialogStartCommand(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.bae
    protected void a(String str, String str2) {
        Log.i(TAG, "doCommand: " + str + " data = " + str2);
        h.a().a(bgy.a(str2));
    }
}
