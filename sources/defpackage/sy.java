package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: TextUtils.java */
/* renamed from: sy  reason: default package */
/* loaded from: classes3.dex */
public class sy {
    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append("    at ");
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static Map<String, String> a(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            String substring = encodedQuery.substring(i, indexOf2);
            if (!TextUtils.isEmpty(substring)) {
                linkedHashMap.put(Uri.decode(substring), Uri.decode(indexOf2 == indexOf ? "" : encodedQuery.substring(indexOf2 + 1, indexOf)));
            }
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
