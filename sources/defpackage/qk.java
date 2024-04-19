package defpackage;
/* compiled from: FileExtension.java */
/* renamed from: qk  reason: default package */
/* loaded from: classes3.dex */
public enum qk {
    Json(".json"),
    Zip(".zip");
    
    public final String extension;

    qk(String str) {
        this.extension = str;
    }

    public String a() {
        return ".temp" + this.extension;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }
}
