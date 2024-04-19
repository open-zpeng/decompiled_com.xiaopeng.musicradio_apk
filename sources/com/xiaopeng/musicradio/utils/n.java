package com.xiaopeng.musicradio.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: DateUtil.java */
/* loaded from: classes2.dex */
public class n {
    public static String a(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i / 60;
        if (i2 < 10) {
            sb.append("0");
            sb.append(i2);
        } else {
            sb.append(i2);
        }
        sb.append(":");
        int i3 = i % 60;
        if (i3 < 10) {
            sb.append("0");
            sb.append(i3);
        } else {
            sb.append(i3);
        }
        return sb.toString();
    }

    public static String a(String str, Long l) {
        return new SimpleDateFormat(str).format(new Date(l.longValue()));
    }
}
