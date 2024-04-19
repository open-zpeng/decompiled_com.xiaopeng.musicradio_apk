package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
/* compiled from: MqttPubRel.java */
/* renamed from: bmp  reason: default package */
/* loaded from: classes3.dex */
public class bmp extends bmj {
    public bmp(bmo bmoVar) {
        super((byte) 6);
        a(bmoVar.j());
    }

    public bmp(byte b, byte[] bArr) {
        super((byte) 6);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.a = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // defpackage.bmw
    protected byte[] aF_() {
        return l();
    }

    @Override // defpackage.bmw
    protected byte aD_() {
        return (byte) ((this.b ? 8 : 0) | 2);
    }

    @Override // defpackage.bmw
    public String toString() {
        return String.valueOf(super.toString()) + " msgId " + this.a;
    }
}
