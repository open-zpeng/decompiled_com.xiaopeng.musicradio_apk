package com.xiaopeng.speech.protocol.query.speech;
/* compiled from: ISpeechQueryCaller.java */
/* loaded from: classes2.dex */
public interface a {
    int a();

    boolean a(String str);

    boolean b();

    default boolean b(String str) {
        return false;
    }

    boolean c();

    int d();

    String e();

    default int f() {
        return -1;
    }

    default int g() {
        return -1;
    }

    default int h() {
        return 1;
    }

    default boolean i() {
        return false;
    }
}
