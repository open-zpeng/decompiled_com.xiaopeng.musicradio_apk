package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: CalleeHandler.java */
/* renamed from: fy  reason: default package */
/* loaded from: classes3.dex */
class fy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Handler a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
