package com.xiaopeng.musicradio.speech.command;

import android.util.Log;
import com.xiaopeng.musicradio.model.dui.f;
import com.xiaopeng.speech.protocol.node.music.bean.SearchMusic;
/* loaded from: classes2.dex */
public class SearchMusicCommand extends bae {
    public static final String TAG = "SearchMusicCommand";

    @Override // defpackage.bae
    public String getCommand() {
        return TAG;
    }

    public SearchMusicCommand(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.bae
    protected void a(String str, String str2) {
        Log.i(TAG, "doCommand: " + str + " data = " + str2);
        f.a().a(str, SearchMusic.a(str2));
    }
}
