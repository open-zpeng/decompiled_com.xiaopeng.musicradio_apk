package defpackage;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.xiaopeng.lib.framework.aiassistantmodule.interactive.Constants;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: Preconditions.java */
/* renamed from: yj  reason: default package */
/* loaded from: classes3.dex */
public final class yj {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T a(@NonNullDecl T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    @CanIgnoreReturnValue
    public static int a(int i, int i2) {
        return a(i, i2, Constants.INDEX);
    }

    @CanIgnoreReturnValue
    public static int a(int i, int i2, @NullableDecl String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(c(i, i2, str));
        }
        return i;
    }

    private static String c(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return yl.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return yl.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    @CanIgnoreReturnValue
    public static int b(int i, int i2) {
        return b(i, i2, Constants.INDEX);
    }

    @CanIgnoreReturnValue
    public static int b(int i, int i2, @NullableDecl String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(d(i, i2, str));
        }
        return i;
    }

    private static String d(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return yl.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return yl.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    public static void a(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(b(i, i2, i3));
        }
    }

    private static String b(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return d(i, i3, "start index");
        }
        return (i2 < 0 || i2 > i3) ? d(i2, i3, "end index") : yl.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }
}
