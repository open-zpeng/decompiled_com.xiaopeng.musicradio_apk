package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.utils.r;
/* compiled from: WindowChangedReceiver.java */
/* renamed from: agt  reason: default package */
/* loaded from: classes2.dex */
public class agt extends BroadcastReceiver {
    private boolean a;
    private Context b;

    public agt(Context context) {
        this.b = context;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.xiaopeng.intent.action.ACTIVITY_CHANGED".equals(action)) {
            try {
                String stringExtra = intent.getStringExtra("android.intent.extra.COMPONENT");
                Log.i("WindowChangedReceiver", "onReceive:action=" + action + ",component=" + stringExtra);
                if (TextUtils.isEmpty(stringExtra)) {
                    return;
                }
                a(ComponentName.unflattenFromString(stringExtra));
            } catch (Exception unused) {
                Log.e("WindowChangedReceiver", "componentInfo : error");
            }
        }
    }

    private boolean a(ComponentName componentName) {
        if (componentName == null) {
            return false;
        }
        if (this.b.getPackageName().equals(componentName.getPackageName())) {
            return true;
        }
        r.c();
        return true;
    }

    public void a() {
        if (this.a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.xiaopeng.intent.action.ACTIVITY_CHANGED");
        this.b.registerReceiver(this, intentFilter);
        this.a = true;
    }
}
