package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
/* compiled from: MqttPubComp.java */
/* renamed from: bmn  reason: default package */
/* loaded from: classes3.dex */
public class bmn extends bmd {
    public bmn(byte b, byte[] bArr) {
        super((byte) 7);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.a = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    public bmn(bmq bmqVar) {
        super((byte) 7);
        this.a = bmqVar.j();
    }

    public bmn(int i) {
        super((byte) 7);
        this.a = i;
    }

    @Override // defpackage.bmw
    protected byte[] aF_() {
        return l();
    }
}
