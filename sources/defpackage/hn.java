package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;
/* compiled from: PointerIconCompat.java */
/* renamed from: hn  reason: default package */
/* loaded from: classes3.dex */
public final class hn {
    private Object a;

    private hn(Object obj) {
        this.a = obj;
    }

    public Object a() {
        return this.a;
    }

    public static hn a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new hn(PointerIcon.getSystemIcon(context, i));
        }
        return new hn(null);
    }
}
