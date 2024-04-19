package com.xiaopeng.musicradio;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.xiaopeng.lib.apirouter.server.IServicePublisher;
@Keep
/* loaded from: classes.dex */
public class NapaObserver implements IServicePublisher {
    public void sendMessage(final String str, final String str2, final byte[] bArr) {
        if (!TextUtils.equals("SmallPlayerViewProxy_player_small_updatepos", str)) {
            Log.i("NapaObserver", "Unity2Android sendMessage:proxyName=" + str + ",method=" + str2 + ",value=" + bArr);
        }
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.NapaObserver.1
            @Override // java.lang.Runnable
            public void run() {
                aex.a().a(str, str2, bArr);
            }
        });
    }
}
