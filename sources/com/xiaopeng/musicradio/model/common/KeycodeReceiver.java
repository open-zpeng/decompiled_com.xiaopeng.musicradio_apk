package com.xiaopeng.musicradio.model.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.xiaopeng.musicradio.utils.be;
/* loaded from: classes.dex */
public class KeycodeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.i("KeycodeReceiver", "onReceive: action = " + intent.getAction() + " keyType = " + intent.getStringExtra("keytype") + " keyfunc = " + intent.getIntExtra("keyfunc", 0));
        String stringExtra = intent.getStringExtra("keytype");
        int intExtra = intent.getIntExtra("keyfunc", 0);
        if (be.a(intent.getAction(), "com.xiaopeng.intent.action.xkey")) {
            if (be.a(stringExtra, "short") && intExtra == 1) {
                aot.a().b();
            }
        } else if (be.a(intent.getAction(), "com.xiaopeng.intent.action.bosskey") && be.a(stringExtra, "short") && intExtra == 3) {
            aot.a().b();
        }
    }
}
