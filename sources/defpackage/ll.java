package defpackage;
/* compiled from: $Gson$Preconditions.java */
/* renamed from: ll  reason: default package */
/* loaded from: classes3.dex */
public final class ll {
    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }
}
