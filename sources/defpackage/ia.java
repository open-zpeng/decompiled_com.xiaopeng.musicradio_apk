package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: AccessibilityEventCompat.java */
/* renamed from: ia  reason: default package */
/* loaded from: classes3.dex */
public final class ia {
    @Deprecated
    public static id a(AccessibilityEvent accessibilityEvent) {
        return new id(accessibilityEvent);
    }

    public static void a(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    public static int b(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }
}
