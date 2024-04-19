package defpackage;

import java.io.File;
import java.io.FilenameFilter;
/* compiled from: PersistanceFileNameFilter.java */
/* renamed from: bnf  reason: default package */
/* loaded from: classes3.dex */
public class bnf implements FilenameFilter {
    private final String a;

    public bnf(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.endsWith(this.a);
    }
}
