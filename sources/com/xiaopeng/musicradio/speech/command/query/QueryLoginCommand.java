package com.xiaopeng.musicradio.speech.command.query;

import android.util.Log;
import com.xiaopeng.musicradio.model.dui.g;
/* loaded from: classes2.dex */
public class QueryLoginCommand extends bag {
    public static final String TAG = "QueryLoginCommand";

    @Override // defpackage.bag
    public String getCommand() {
        return TAG;
    }

    public QueryLoginCommand(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // defpackage.bag
    protected void a(String str, String str2, String str3) {
        Log.i(TAG, "doCommand: " + str + " data = " + str2);
        a(str, str3, Boolean.valueOf(g.a().n()));
    }
}
