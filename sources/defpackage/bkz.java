package defpackage;

import java.io.UnsupportedEncodingException;
import org.jaudiotagger.audio.asf.data.MetadataDescriptor;
/* compiled from: MqttTopic.java */
/* renamed from: bkz  reason: default package */
/* loaded from: classes3.dex */
public class bkz {
    private String a;

    public String a() {
        return this.a;
    }

    public String toString() {
        return a();
    }

    public static void a(String str, boolean z) {
        try {
            int length = str.getBytes("UTF-8").length;
            if (length < 1 || length > 65535) {
                throw new IllegalArgumentException(String.format("Invalid topic length, should be in range[%d, %d]!", new Integer(1), new Integer((int) MetadataDescriptor.WORD_MAXVALUE)));
            }
            if (z) {
                if (bnh.a(str, new String[]{"#", "+"})) {
                    return;
                }
                if (bnh.b(str, "#") > 1 || (str.contains("#") && !str.endsWith("/#"))) {
                    throw new IllegalArgumentException("Invalid usage of multi-level wildcard in topic string: " + str);
                }
                a(str);
            } else if (bnh.a(str, "#+")) {
                throw new IllegalArgumentException("The topic name MUST NOT contain any wildcard characters (#+)");
            }
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    private static void a(String str) {
        char charAt = "+".charAt(0);
        char charAt2 = "/".charAt(0);
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        while (i < length) {
            int i2 = i - 1;
            char c = i2 >= 0 ? charArray[i2] : (char) 0;
            int i3 = i + 1;
            char c2 = i3 < length ? charArray[i3] : (char) 0;
            if (charArray[i] == charAt && ((c != charAt2 && c != 0) || (c2 != charAt2 && c2 != 0))) {
                throw new IllegalArgumentException(String.format("Invalid usage of single-level wildcard in topic string '%s'!", str));
            }
            i = i3;
        }
    }

    public static boolean a(String str, String str2) {
        int length = str2.length();
        int length2 = str.length();
        a(str, true);
        a(str2, false);
        if (str.equals(str2)) {
            return true;
        }
        int i = 0;
        int i2 = 0;
        while (i < length2 && i2 < length && ((str2.charAt(i2) != '/' || str.charAt(i) == '/') && (str.charAt(i) == '+' || str.charAt(i) == '#' || str.charAt(i) == str2.charAt(i2)))) {
            if (str.charAt(i) == '+') {
                int i3 = i2 + 1;
                while (i3 < length && str2.charAt(i3) != '/') {
                    i2++;
                    i3 = i2 + 1;
                }
            } else if (str.charAt(i) == '#') {
                i2 = length - 1;
            }
            i++;
            i2++;
        }
        return i2 == length && i == length2;
    }
}
