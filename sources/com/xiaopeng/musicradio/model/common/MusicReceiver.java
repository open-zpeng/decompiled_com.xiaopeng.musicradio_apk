package com.xiaopeng.musicradio.model.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.config.CommonConfig;
import com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel;
import com.xiaopeng.musicradio.model.mediacenter.command.MediaCenterCommand;
import com.xiaopeng.musicradio.utils.bf;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
/* loaded from: classes.dex */
public class MusicReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : "";
        Log.i("MusicReceiver", "Receive-》" + action);
        if (TextUtils.isEmpty(action)) {
            return;
        }
        if ("com.xiaopeng.ACTION_KEEP_ALIVE".equals(action)) {
            if (bf.c()) {
                a.a().a(action);
            }
        } else if (action.equals(CommonConfig.ACTION_BROADCAST_PM_STATUS_CHANGE)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                int i = extras.getInt("status", 4);
                Log.i("MusicReceiver", "Receive-》status" + i);
                if (i == 0) {
                    u.c(new agg.s(true));
                } else if (i == 1) {
                    u.c(new agg.s(false));
                }
            }
        } else if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
            Log.i("MusicReceiver", "onReceive: bootcomplete ");
            try {
                com.xiaopeng.musicradio.model.car.a.a().b();
            } catch (Exception e) {
                Log.e("MusicReceiver", "onReceive: ", e);
            }
        } else if ("android.intent.action.MY_PACKAGE_REPLACED".equals(action)) {
            LogUtils.w("MusicReceiver", "received ACTION_PACKAGE_REPLACED action and music replay!");
        } else if ("com.xiaopeng.xui.WELCOME_SOUND".equals(action)) {
            Log.i("MusicReceiver", "onReceive: welcom =============");
            com.xiaopeng.musicradio.model.car.a.a().c();
        } else if (MediaCenterModel.ACTION_MEDIA_PLAYBACK_CONTROL.equalsIgnoreCase(action)) {
            int intExtra = intent.getIntExtra(MediaCenterModel.EXTRA_PLAYBACK_CMD, -1);
            int intExtra2 = intent.getIntExtra(MediaCenterModel.EXTRA_PLAYBACK_PARAM, 0);
            LogUtils.i("MusicReceiver", "onReceive:action media playback cmd:" + intExtra + ", param:" + intExtra2);
            new MediaCenterCommand(String.valueOf(intExtra), String.valueOf(intExtra2)).onEvent();
        }
    }
}
