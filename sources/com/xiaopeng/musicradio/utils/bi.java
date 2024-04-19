package com.xiaopeng.musicradio.utils;

import android.os.SystemProperties;
/* compiled from: UserUtil.java */
/* loaded from: classes2.dex */
public class bi {
    public static String a() {
        return SystemProperties.get("persist.sys.mcu.hardwareId");
    }
}
