package com.xiaopeng.musicradio.speech.command.query;

import android.util.Log;
import com.xiaopeng.musicradio.model.dui.g;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class QueryCollectEmptyCommand extends bag {
    public static final String TAG = "QueryCollectEmptyCommand";

    @Override // defpackage.bag
    public String getCommand() {
        return TAG;
    }

    public QueryCollectEmptyCommand(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // defpackage.bag
    protected void a(String str, String str2, String str3) {
        int i;
        Log.i(TAG, "doCommand: " + str + " data = " + str2);
        try {
            i = new JSONObject(str2).optInt(VuiConstants.ELEMENT_TYPE);
        } catch (JSONException e) {
            e.printStackTrace();
            i = 0;
        }
        a(str, str3, Boolean.valueOf(g.a().b(i)));
    }
}
