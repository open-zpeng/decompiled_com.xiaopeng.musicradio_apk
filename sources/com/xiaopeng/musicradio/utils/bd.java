package com.xiaopeng.musicradio.utils;

import android.os.storage.StorageManager;
import android.os.storage.VolumeInfo;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import java.util.List;
/* compiled from: StorageUtil.java */
/* loaded from: classes2.dex */
public class bd {
    public static int a() {
        StorageManager storageManager = (StorageManager) com.xiaopeng.musicradio.a.a.getSystemService("storage");
        try {
            for (VolumeInfo volumeInfo : (List) storageManager.getClass().getMethod("getVolumes", new Class[0]).invoke(storageManager, new Object[0])) {
                LogUtils.d("StorageUtil", "volumeInfo = " + volumeInfo + " , volumeInfo.getDisk() = " + volumeInfo.getDisk());
                if (volumeInfo.getDisk() != null && volumeInfo.getDisk().isUsb()) {
                    return volumeInfo.getState();
                }
            }
        } catch (Exception e) {
            Log.e("StorageUtil", "getUDiskPath: ", e);
        }
        return 0;
    }
}
