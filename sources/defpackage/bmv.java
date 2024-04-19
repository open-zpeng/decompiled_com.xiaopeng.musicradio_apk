package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* compiled from: MqttUnsubscribe.java */
/* renamed from: bmv  reason: default package */
/* loaded from: classes3.dex */
public class bmv extends bmw {
    private String[] c;
    private int d;

    public bmv(byte b, byte[] bArr) {
        super((byte) 10);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.a = dataInputStream.readUnsignedShort();
        boolean z = false;
        this.d = 0;
        this.c = new String[10];
        while (!z) {
            try {
                this.c[this.d] = b(dataInputStream);
            } catch (Exception unused) {
                z = true;
            }
        }
        dataInputStream.close();
    }

    @Override // defpackage.bmw
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" names:[");
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append("\"" + this.c[i] + "\"");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    @Override // defpackage.bmw
    protected byte aD_() {
        return (byte) ((this.b ? 8 : 0) | 2);
    }

    @Override // defpackage.bmw
    protected byte[] aF_() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(this.a);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new bks(e);
        }
    }

    @Override // defpackage.bmw
    public byte[] aE_() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            for (int i = 0; i < this.c.length; i++) {
                a(dataOutputStream, this.c[i]);
            }
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new bks(e);
        }
    }
}
