package com.xiaopeng.musicradio.speech.command.query;

import android.util.Log;
import com.xiaopeng.musicradio.model.dui.g;
/* loaded from: classes2.dex */
public class QueryPlayingTypeCommand extends bag {
    public static final String TAG = "QueryPlayingTypeCommand";

    @Override // defpackage.bag
    public String getCommand() {
        return TAG;
    }

    public QueryPlayingTypeCommand(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // defpackage.bag
    protected void a(String str, String str2, String str3) {
        Log.i(TAG, "doCommand: " + str + " type = " + g.a().f());
        a(str, str3, Integer.valueOf(g.a().f()));
    }
}
