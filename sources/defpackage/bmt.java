package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* compiled from: MqttSubscribe.java */
/* renamed from: bmt  reason: default package */
/* loaded from: classes3.dex */
public class bmt extends bmw {
    private String[] c;
    private int[] d;
    private int e;

    public bmt(byte b, byte[] bArr) {
        super((byte) 8);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.a = dataInputStream.readUnsignedShort();
        boolean z = false;
        this.e = 0;
        this.c = new String[10];
        this.d = new int[10];
        while (!z) {
            try {
                this.c[this.e] = b(dataInputStream);
                int[] iArr = this.d;
                int i = this.e;
                this.e = i + 1;
                iArr[i] = dataInputStream.readByte();
            } catch (Exception unused) {
                z = true;
            }
        }
        dataInputStream.close();
    }

    public bmt(String[] strArr, int[] iArr) {
        super((byte) 8);
        this.c = strArr;
        this.d = iArr;
        if (strArr.length != iArr.length) {
            throw new IllegalArgumentException();
        }
        this.e = strArr.length;
        for (int i : iArr) {
            bkt.a(i);
        }
    }

    @Override // defpackage.bmw
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" names:[");
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append("\"");
            stringBuffer.append(this.c[i]);
            stringBuffer.append("\"");
        }
        stringBuffer.append("] qos:[");
        for (int i2 = 0; i2 < this.e; i2++) {
            if (i2 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(this.d[i2]);
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
                dataOutputStream.writeByte(this.d[i]);
            }
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new bks(e);
        }
    }
}
