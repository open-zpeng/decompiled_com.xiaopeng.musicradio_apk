package defpackage;

import android.content.Context;
/* compiled from: DensityUtil.java */
/* renamed from: aaq  reason: default package */
/* loaded from: classes2.dex */
public class aaq {
    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
