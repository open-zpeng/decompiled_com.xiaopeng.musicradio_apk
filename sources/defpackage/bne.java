package defpackage;

import java.io.File;
import java.io.FileFilter;
/* compiled from: PersistanceFileFilter.java */
/* renamed from: bne  reason: default package */
/* loaded from: classes3.dex */
public class bne implements FileFilter {
    private final String a;

    public bne(String str) {
        this.a = str;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return file.getName().endsWith(this.a);
    }
}
