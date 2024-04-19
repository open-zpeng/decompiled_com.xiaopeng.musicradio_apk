package defpackage;
/* compiled from: VuiMode.java */
/* renamed from: bij  reason: default package */
/* loaded from: classes2.dex */
public enum bij {
    DISABLED("Disabled"),
    SILENT("Silent"),
    UNDERSTOOD("Understood"),
    NORMAL("Normal");
    
    String a;

    bij(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }
}
