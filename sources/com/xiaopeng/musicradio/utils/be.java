package com.xiaopeng.musicradio.utils;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
/* compiled from: StringUtils.java */
/* loaded from: classes2.dex */
public class be {
    public static String e(String str) {
        return str == null ? "" : str;
    }

    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void a(Context context, TextView textView, int i, String str, String... strArr) {
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (strArr != null) {
            for (String str2 : strArr) {
                if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getResources().getColor(i));
                    int indexOf = str.indexOf(str2);
                    spannableStringBuilder.setSpan(foregroundColorSpan, indexOf, str2.length() + indexOf, 34);
                }
            }
        }
        textView.setText(spannableStringBuilder);
    }

    public static SpannableStringBuilder a(int i, String str, String... strArr) {
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (strArr != null) {
            for (String str2 : strArr) {
                if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(com.xiaopeng.musicradio.a.a.getResources().getColor(i));
                    int indexOf = str.indexOf(str2);
                    spannableStringBuilder.setSpan(foregroundColorSpan, indexOf, str2.length() + indexOf, 34);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static String a(int i) {
        return com.xiaopeng.musicradio.a.a.getString(i);
    }

    public static boolean a(String str) {
        return Pattern.compile("^[+-]?[0-9]+$").matcher(str).find();
    }

    public static Map<String, String> b(String str) {
        String[] split;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int indexOf = str.indexOf("?");
        if (indexOf > -1 && !str.endsWith("?")) {
            for (String str2 : str.substring(indexOf + 1, str.length()).split("&")) {
                int indexOf2 = str2.indexOf("=");
                linkedHashMap.put(URLDecoder.decode(str2.substring(0, indexOf2), "UTF-8"), URLDecoder.decode(str2.substring(indexOf2 + 1), "UTF-8"));
            }
        }
        return linkedHashMap;
    }

    public static String c(String str) {
        int indexOf = str.indexOf("?");
        return indexOf > -1 ? str.substring(0, indexOf) : str;
    }

    public static String d(String str) {
        if (str == null || "".equals(str)) {
            return "";
        }
        return Pattern.compile("<[^>]+>", 2).matcher(Pattern.compile("<style[^>]*?>[\\s\\S]*?<\\/style>", 2).matcher(Pattern.compile("<script[^>]*?>[\\s\\S]*?<\\/script>", 2).matcher(str).replaceAll("")).replaceAll("")).replaceAll("");
    }

    public static boolean f(String str) {
        return str.matches("^[a-zA-Z]*");
    }

    public static boolean g(String str) {
        return str.matches("^[0-9]*");
    }

    public static boolean h(String str) {
        return Pattern.compile("[\\u4e00-\\u9fa5]+").matcher(str).find();
    }

    public static String i(String str) {
        char[] charArray = str.toCharArray();
        HanyuPinyinOutputFormat hanyuPinyinOutputFormat = new HanyuPinyinOutputFormat();
        hanyuPinyinOutputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        hanyuPinyinOutputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        String str2 = "";
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > 128) {
                try {
                    try {
                        return str2 + PinyinHelper.toHanyuPinyinStringArray(charArray[i], hanyuPinyinOutputFormat)[0];
                    } catch (Exception e) {
                        e.printStackTrace();
                        return str2;
                    }
                } catch (Throwable unused) {
                    return str2;
                }
            }
            str2 = str2 + charArray[i];
        }
        return str2;
    }
}
