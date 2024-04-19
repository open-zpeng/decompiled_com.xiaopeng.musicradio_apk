package com.xiaopeng.musicradio.proxy;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
/* compiled from: MusicCommonProxyFactory.java */
/* loaded from: classes2.dex */
public class c implements aew {
    @Override // defpackage.aew
    public aev a(String str) {
        Log.i("MusicCommonProxyFactory", "createViewProxy: " + str);
        if (TextUtils.equals("MusicCommonProxy", str)) {
            return new b(com.xiaopeng.musicradio.a.a(), str);
        }
        return null;
    }

    @Override // defpackage.aew
    public List<String> a() {
        return Arrays.asList("MusicCommonProxy");
    }
}
