package defpackage;

import android.os.Looper;
import com.xiaopeng.lib.utils.LogUtils;
import java.text.SimpleDateFormat;
/* compiled from: TimeUtils.java */
/* renamed from: bdk  reason: default package */
/* loaded from: classes2.dex */
public class bdk {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyy/MM/dd");
    private static Looper b = Looper.getMainLooper();

    public static String a(long j) {
        try {
            if (Looper.myLooper() == b) {
                return a.format(Long.valueOf(j));
            }
            new SimpleDateFormat("yyyy/MM/dd").format(Long.valueOf(j));
            return "";
        } catch (Throwable th) {
            LogUtils.e("TimeUtils", "convertTime", th);
            return "";
        }
    }
}
