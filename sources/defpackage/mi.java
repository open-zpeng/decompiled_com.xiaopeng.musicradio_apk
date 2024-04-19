package defpackage;

import java.lang.reflect.Field;
/* compiled from: FieldNamingPolicy.java */
/* renamed from: mi  reason: default package */
/* loaded from: classes3.dex */
public enum mi implements mp {
    IDENTITY { // from class: mi.1
        @Override // defpackage.mp
        public String a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: mi.2
        @Override // defpackage.mp
        public String a(Field field) {
            return mi.b(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: mi.3
        @Override // defpackage.mp
        public String a(Field field) {
            return mi.b(mi.b(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: mi.4
        @Override // defpackage.mp
        public String a(Field field) {
            return mi.b(field.getName(), "_").toLowerCase();
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: mi.5
        @Override // defpackage.mp
        public String a(Field field) {
            return mi.b(field.getName(), "-").toLowerCase();
        }
    };

    private static String a(char c, String str, int i) {
        if (i < str.length()) {
            return c + str.substring(i);
        }
        return String.valueOf(c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        char charAt;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            charAt = str.charAt(i);
            if (i >= str.length() - 1 || Character.isLetter(charAt)) {
                break;
            }
            sb.append(charAt);
            i++;
        }
        if (i == str.length()) {
            return sb.toString();
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(a(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
