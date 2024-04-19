package com.xiaopeng.musicradio.speech.command;

import android.util.Log;
import com.xiaopeng.musicradio.model.dui.f;
import java.math.BigDecimal;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class SpeedSetCommand extends bae {
    public static final String TAG = "SpeedUpCommand";

    @Override // defpackage.bae
    public String getCommand() {
        return "SpeedUpCommand";
    }

    public SpeedSetCommand(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.bae
    protected void a(String str, String str2) {
        Log.i("SpeedUpCommand", "doCommand: " + str + " data = " + str2);
        try {
            f.a().a(BigDecimal.valueOf(new JSONObject(str2).optDouble("value")).floatValue());
        } catch (Exception e) {
            Log.e("SpeedUpCommand", "onEvent:set  ", e);
        }
    }
}
