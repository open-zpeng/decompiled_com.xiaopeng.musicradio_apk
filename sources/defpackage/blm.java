package defpackage;
/* compiled from: MqttPersistentData.java */
/* renamed from: blm  reason: default package */
/* loaded from: classes3.dex */
public class blm implements bku {
    private String a;
    private byte[] b;
    private int c;
    private int d;
    private byte[] e;
    private int f;
    private int g;

    public blm(String str, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
        this.e = bArr2;
        this.f = i3;
        this.g = i4;
    }

    @Override // defpackage.bku
    public byte[] a() {
        return this.b;
    }

    @Override // defpackage.bku
    public int b() {
        return this.d;
    }

    @Override // defpackage.bku
    public int c() {
        return this.c;
    }

    @Override // defpackage.bku
    public byte[] d() {
        return this.e;
    }

    @Override // defpackage.bku
    public int aC_() {
        if (this.e == null) {
            return 0;
        }
        return this.g;
    }

    @Override // defpackage.bku
    public int f() {
        return this.f;
    }
}
