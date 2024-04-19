package com.xiaopeng.musicradio.speech.command;

import android.util.Log;
import com.xiaopeng.musicradio.model.dui.f;
import com.xiaopeng.speech.protocol.node.music.bean.CollectHistoryMusic;
/* loaded from: classes2.dex */
public class PlayHistroyCommand extends bae {
    public static final String TAG = "PlayHistroyCommand";

    @Override // defpackage.bae
    public String getCommand() {
        return TAG;
    }

    public PlayHistroyCommand(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.bae
    protected void a(String str, String str2) {
        Log.i(TAG, "doCommand: " + str + " data = " + str2);
        f.a().b(CollectHistoryMusic.fromJson(str2));
    }
}
