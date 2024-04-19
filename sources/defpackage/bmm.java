package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
/* compiled from: MqttPubAck.java */
/* renamed from: bmm  reason: default package */
/* loaded from: classes3.dex */
public class bmm extends bmd {
    public bmm(byte b, byte[] bArr) {
        super((byte) 4);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.a = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    public bmm(bmq bmqVar) {
        super((byte) 4);
        this.a = bmqVar.j();
    }

    @Override // defpackage.bmw
    protected byte[] aF_() {
        return l();
    }
}
