package defpackage;
/* compiled from: RequestFailedException.java */
/* renamed from: auw  reason: default package */
/* loaded from: classes2.dex */
public class auw extends Exception {
    private int code;

    public auw(int i, String str) {
        super(str);
        this.code = i;
    }

    public int a() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String name = getClass().getName();
        String localizedMessage = getLocalizedMessage();
        if (localizedMessage == null) {
            return name + ": code = [" + this.code + "]";
        }
        return name + ": code = [" + this.code + "], message = [" + localizedMessage + "]";
    }
}
