package com.xiaopeng.musicradio;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.xiaopeng.lib.apirouter.server.IServicePublisher;
@Keep
/* loaded from: classes.dex */
public class MusicDuiObserver implements IServicePublisher {
    private static final String TAG = "MusicDuiObserver";
    private bac mMusicNode = new bac();
    private bab mFmNode = new bab();
    private bad mMusicQuery = new bad();
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public void onEvent(String str, String str2) {
        Log.i(TAG, "action event = " + str + " data = " + str2);
        this.mMusicNode.a(str, str2);
        this.mFmNode.a(str, str2);
    }

    public void onQuery(final String str, final String str2, final String str3) {
        Log.i(TAG, "query event = " + str + " data = " + str2 + " callback = " + str3);
        this.mHandler.post(new Runnable() { // from class: com.xiaopeng.musicradio.MusicDuiObserver.1
            @Override // java.lang.Runnable
            public void run() {
                MusicDuiObserver.this.mMusicQuery.a(str, str2, str3);
            }
        });
    }
}
