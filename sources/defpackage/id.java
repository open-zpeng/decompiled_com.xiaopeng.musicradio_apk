package defpackage;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
/* compiled from: AccessibilityRecordCompat.java */
/* renamed from: id  reason: default package */
/* loaded from: classes3.dex */
public class id {
    private final AccessibilityRecord a;

    @Deprecated
    public id(Object obj) {
        this.a = (AccessibilityRecord) obj;
    }

    public static void a(AccessibilityRecord accessibilityRecord, View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }

    @Deprecated
    public void a(boolean z) {
        this.a.setScrollable(z);
    }

    @Deprecated
    public void a(int i) {
        this.a.setItemCount(i);
    }

    @Deprecated
    public void b(int i) {
        this.a.setFromIndex(i);
    }

    @Deprecated
    public void c(int i) {
        this.a.setToIndex(i);
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof id) {
            id idVar = (id) obj;
            AccessibilityRecord accessibilityRecord = this.a;
            if (accessibilityRecord == null) {
                if (idVar.a != null) {
                    return false;
                }
            } else if (!accessibilityRecord.equals(idVar.a)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
