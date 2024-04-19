package defpackage;
/* compiled from: MqttMessage.java */
/* renamed from: bkt  reason: default package */
/* loaded from: classes3.dex */
public class bkt {
    private int messageId;
    private byte[] payload;
    private boolean mutable = true;
    private int qos = 1;
    private boolean retained = false;
    private boolean dup = false;

    public static void a(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException();
        }
    }

    public bkt() {
        a(new byte[0]);
    }

    public bkt(byte[] bArr) {
        a(bArr);
    }

    public byte[] a() {
        return this.payload;
    }

    public void a(byte[] bArr) {
        d();
        if (bArr == null) {
            throw new NullPointerException();
        }
        this.payload = bArr;
    }

    public boolean b() {
        return this.retained;
    }

    public void b(boolean z) {
        d();
        this.retained = z;
    }

    public int c() {
        return this.qos;
    }

    public void b(int i) {
        d();
        a(i);
        this.qos = i;
    }

    public String toString() {
        return new String(this.payload);
    }

    protected void d() {
        if (!this.mutable) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z) {
        this.dup = z;
    }

    public boolean e() {
        return this.dup;
    }

    public void c(int i) {
        this.messageId = i;
    }
}
