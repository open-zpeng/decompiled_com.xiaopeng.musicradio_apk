package com.xiaopeng.musicradio.utils;

import android.content.Context;
import java.io.File;
/* compiled from: DataCleanUtil.java */
/* loaded from: classes2.dex */
public class l {
    public static void a(Context context) {
        a(context.getCacheDir());
    }

    private static void a(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            file2.delete();
        }
    }
}
