package defpackage;
/* compiled from: StringUtils.java */
/* renamed from: ua  reason: default package */
/* loaded from: classes3.dex */
public class ua {
    public static boolean a(String str) {
        return !b(str);
    }

    public static boolean b(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
