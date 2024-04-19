package com.hp.hpl.sparta;

import java.io.PrintStream;
/* compiled from: ParseSource.java */
/* loaded from: classes.dex */
class DefaultLog implements ParseLog {
    @Override // com.hp.hpl.sparta.ParseLog
    public void error(String str, String str2, int i) {
        PrintStream printStream = System.err;
        printStream.println(str2 + "(" + i + "): " + str + " (ERROR)");
    }

    @Override // com.hp.hpl.sparta.ParseLog
    public void warning(String str, String str2, int i) {
        PrintStream printStream = System.out;
        printStream.println(str2 + "(" + i + "): " + str + " (WARNING)");
    }

    @Override // com.hp.hpl.sparta.ParseLog
    public void note(String str, String str2, int i) {
        PrintStream printStream = System.out;
        printStream.println(str2 + "(" + i + "): " + str + " (NOTE)");
    }
}
