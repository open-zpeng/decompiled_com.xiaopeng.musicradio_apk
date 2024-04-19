package defpackage;

import android.content.Context;
/* compiled from: ScreenUtils.java */
/* renamed from: acq  reason: default package */
/* loaded from: classes2.dex */
public class acq {
    private static int a = -1;
    private static int b = -1;

    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
