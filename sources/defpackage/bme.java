package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
/* compiled from: MqttConnack.java */
/* renamed from: bme  reason: default package */
/* loaded from: classes3.dex */
public class bme extends bmd {
    private int c;
    private boolean d;

    @Override // defpackage.bmw
    public boolean aG_() {
        return false;
    }

    @Override // defpackage.bmw
    public String e() {
        return "Con";
    }

    public bme(byte b, byte[] bArr) {
        super((byte) 2);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.d = (dataInputStream.readUnsignedByte() & 1) == 1;
        this.c = dataInputStream.readUnsignedByte();
        dataInputStream.close();
    }

    public int aB_() {
        return this.c;
    }

    @Override // defpackage.bmw
    protected byte[] aF_() {
        return new byte[0];
    }

    @Override // defpackage.bmd, defpackage.bmw
    public String toString() {
        return String.valueOf(super.toString()) + " session present:" + this.d + " return code: " + this.c;
    }
}
