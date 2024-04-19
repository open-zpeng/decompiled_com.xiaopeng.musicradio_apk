package defpackage;

import java.util.regex.Pattern;
/* compiled from: StringUtil.java */
/* renamed from: bhb  reason: default package */
/* loaded from: classes2.dex */
public class bhb {
    public static boolean a(String str) {
        if (str == null || str.trim().equals("")) {
            return false;
        }
        return Pattern.compile("([+|-])?(([0-9]+.[0-9]*)|([0-9]*.[0-9]+)|([0-9]+))((e|E)([+|-])?[0-9]+)?").matcher(str).matches();
    }
}
