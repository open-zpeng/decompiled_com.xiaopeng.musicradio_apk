package defpackage;
/* compiled from: ParseUtils.java */
/* renamed from: tz  reason: default package */
/* loaded from: classes3.dex */
public class tz {
    public static int a(String str) {
        if (ua.a(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return 0;
    }
}
