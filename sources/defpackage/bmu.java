package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
/* compiled from: MqttUnsubAck.java */
/* renamed from: bmu  reason: default package */
/* loaded from: classes3.dex */
public class bmu extends bmd {
    public bmu(byte b, byte[] bArr) {
        super((byte) 11);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.a = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // defpackage.bmw
    protected byte[] aF_() {
        return new byte[0];
    }
}
