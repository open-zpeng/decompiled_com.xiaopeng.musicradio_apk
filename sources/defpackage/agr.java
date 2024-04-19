package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.speech.protocol.node.dialog.DialogNode;
import com.xiaopeng.speech.protocol.node.dialog.b;
/* compiled from: AudioChangeObserver.java */
/* renamed from: agr  reason: default package */
/* loaded from: classes2.dex */
public class agr extends BroadcastReceiver {
    private boolean a;
    private b b;

    /* compiled from: AudioChangeObserver.java */
    /* renamed from: agr$a */
    /* loaded from: classes2.dex */
    private static class a {
        private static final agr a = new agr();
    }

    public static agr a() {
        return a.a;
    }

    public void b() {
        bfb.b().j().a(DialogNode.class, this.b);
    }

    private agr() {
        this.a = false;
        this.b = new com.xiaopeng.speech.protocol.node.dialog.a() { // from class: agr.1
            @Override // com.xiaopeng.speech.protocol.node.dialog.a, com.xiaopeng.speech.protocol.node.dialog.b
            public void a(bgy bgyVar) {
                agr.this.a = true;
            }

            @Override // com.xiaopeng.speech.protocol.node.dialog.a, com.xiaopeng.speech.protocol.node.dialog.b
            public void a(bgx bgxVar) {
                agr.this.a = false;
                agr.this.a(0);
            }
        };
        IntentFilter intentFilter = new IntentFilter("android.media.RINGER_MODE_CHANGED");
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        com.xiaopeng.musicradio.a.a.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        int intExtra = intent.getIntExtra("android.media.EXTRA_HAS_MUSIC_RUNNING_FLAG", 0);
        int intExtra2 = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
        LogUtils.i("AudioChangeObserver", "onReceive: " + action + ", muteFlag:" + intExtra + ", streemType:" + intExtra2);
        if ((TextUtils.equals(action, "android.media.RINGER_MODE_CHANGED") || TextUtils.equals(action, "android.media.VOLUME_CHANGED_ACTION")) && intExtra2 == 3) {
            a(intExtra);
            LogUtils.d("AudioChangeObserver", "sendAudioChange muteFlag:" + intExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (this.a) {
            ags.a().d();
        }
    }
}
