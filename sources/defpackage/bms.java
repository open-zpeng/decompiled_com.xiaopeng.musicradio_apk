package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
/* compiled from: MqttSuback.java */
/* renamed from: bms  reason: default package */
/* loaded from: classes3.dex */
public class bms extends bmd {
    private int[] c;

    public bms(byte b, byte[] bArr) {
        super((byte) 9);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.a = dataInputStream.readUnsignedShort();
        this.c = new int[bArr.length - 2];
        int i = 0;
        for (int read = dataInputStream.read(); read != -1; read = dataInputStream.read()) {
            this.c[i] = read;
            i++;
        }
        dataInputStream.close();
    }

    @Override // defpackage.bmw
    protected byte[] aF_() {
        return new byte[0];
    }

    @Override // defpackage.bmd, defpackage.bmw
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" granted Qos");
        for (int i = 0; i < this.c.length; i++) {
            stringBuffer.append(" ");
            stringBuffer.append(this.c[i]);
        }
        return stringBuffer.toString();
    }
}
