package com.xiaopeng.musicradio.utils;

import java.io.Closeable;
import java.io.IOException;
/* compiled from: CloseUtils.java */
/* loaded from: classes2.dex */
public class i {
    public static void a(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
