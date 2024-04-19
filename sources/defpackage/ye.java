package defpackage;
/* compiled from: Ascii.java */
/* renamed from: ye  reason: default package */
/* loaded from: classes3.dex */
public final class ye {
    public static boolean a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static String a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (a(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (a(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
