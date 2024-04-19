package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
/* compiled from: MqttPubRec.java */
/* renamed from: bmo  reason: default package */
/* loaded from: classes3.dex */
public class bmo extends bmd {
    public bmo(byte b, byte[] bArr) {
        super((byte) 5);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.a = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    public bmo(bmq bmqVar) {
        super((byte) 5);
        this.a = bmqVar.j();
    }

    @Override // defpackage.bmw
    protected byte[] aF_() {
        return l();
    }
}
