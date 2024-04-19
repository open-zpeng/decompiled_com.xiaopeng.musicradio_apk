package defpackage;
/* compiled from: QRCode.java */
/* renamed from: aai  reason: default package */
/* loaded from: classes2.dex */
public final class aai {
    private aab a;
    private aaa b;
    private aac c;
    private int d = -1;
    private aae e;

    public static boolean b(int i) {
        return i >= 0 && i < 8;
    }

    public aae a() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }

    public void a(aab aabVar) {
        this.a = aabVar;
    }

    public void a(aaa aaaVar) {
        this.b = aaaVar;
    }

    public void a(aac aacVar) {
        this.c = aacVar;
    }

    public void a(int i) {
        this.d = i;
    }

    public void a(aae aaeVar) {
        this.e = aaeVar;
    }
}
