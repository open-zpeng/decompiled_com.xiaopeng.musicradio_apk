package com.xiaopeng.speech.protocol.query.speech.vui;
/* compiled from: ISpeechVuiQueryCaller.java */
/* loaded from: classes2.dex */
public interface b {
    boolean a();

    boolean a(int i, String str, String str2, String str3, String str4);

    boolean a(String str, String str2, String str3, String str4);

    boolean a(String str, String str2, String str3, String str4, String str5);

    default boolean a(String[] strArr) {
        return true;
    }

    int b(String str, String str2, String str3, String str4);

    boolean c(String str, String str2, String str3, String str4);

    String d(String str, String str2, String str3, String str4);

    boolean e(String str, String str2, String str3, String str4);

    boolean f(String str, String str2, String str3, String str4);

    default boolean g(String str, String str2, String str3, String str4) {
        return false;
    }

    default String h(String str, String str2, String str3, String str4) {
        return "";
    }
}
