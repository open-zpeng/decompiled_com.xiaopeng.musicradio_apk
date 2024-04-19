package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* compiled from: MqttPublish.java */
/* renamed from: bmq  reason: default package */
/* loaded from: classes3.dex */
public class bmq extends bmj {
    private bkt c;
    private String d;
    private byte[] e;

    @Override // defpackage.bmw
    public boolean aG_() {
        return true;
    }

    public bmq(String str, bkt bktVar) {
        super((byte) 3);
        this.e = null;
        this.d = str;
        this.c = bktVar;
    }

    public bmq(byte b, byte[] bArr) {
        super((byte) 3);
        this.e = null;
        this.c = new bmr();
        this.c.b(3 & (b >> 1));
        if ((b & 1) == 1) {
            this.c.b(true);
        }
        if ((b & 8) == 8) {
            ((bmr) this.c).a(true);
        }
        bmc bmcVar = new bmc(new ByteArrayInputStream(bArr));
        DataInputStream dataInputStream = new DataInputStream(bmcVar);
        this.d = b(dataInputStream);
        if (this.c.c() > 0) {
            this.a = dataInputStream.readUnsignedShort();
        }
        byte[] bArr2 = new byte[bArr.length - bmcVar.a()];
        dataInputStream.readFully(bArr2);
        dataInputStream.close();
        this.c.a(bArr2);
    }

    @Override // defpackage.bmw
    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] a = this.c.a();
        int min = Math.min(a.length, 20);
        for (int i = 0; i < min; i++) {
            String hexString = Integer.toHexString(a[i]);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            stringBuffer.append(hexString);
        }
        try {
            str = new String(a, 0, min, "UTF-8");
        } catch (Exception unused) {
            str = "?";
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(super.toString());
        stringBuffer2.append(" qos:");
        stringBuffer2.append(this.c.c());
        if (this.c.c() > 0) {
            stringBuffer2.append(" msgId:");
            stringBuffer2.append(this.a);
        }
        stringBuffer2.append(" retained:");
        stringBuffer2.append(this.c.b());
        stringBuffer2.append(" dup:");
        stringBuffer2.append(this.b);
        stringBuffer2.append(" topic:\"");
        stringBuffer2.append(this.d);
        stringBuffer2.append("\"");
        stringBuffer2.append(" payload:[hex:");
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(" utf8:\"");
        stringBuffer2.append(str);
        stringBuffer2.append("\"");
        stringBuffer2.append(" length:");
        stringBuffer2.append(a.length);
        stringBuffer2.append("]");
        return stringBuffer2.toString();
    }

    @Override // defpackage.bmw
    protected byte aD_() {
        byte c = (byte) (this.c.c() << 1);
        if (this.c.b()) {
            c = (byte) (c | 1);
        }
        return (this.c.e() || this.b) ? (byte) (c | 8) : c;
    }

    public String g() {
        return this.d;
    }

    public bkt h() {
        return this.c;
    }

    protected static byte[] a(bkt bktVar) {
        return bktVar.a();
    }

    @Override // defpackage.bmw
    public byte[] aE_() {
        if (this.e == null) {
            this.e = a(this.c);
        }
        return this.e;
    }

    @Override // defpackage.bmj, defpackage.bku
    public int aC_() {
        try {
            return aE_().length;
        } catch (bks unused) {
            return 0;
        }
    }

    @Override // defpackage.bmw
    public void a(int i) {
        super.a(i);
        bkt bktVar = this.c;
        if (bktVar instanceof bmr) {
            ((bmr) bktVar).d(i);
        }
    }

    @Override // defpackage.bmw
    protected byte[] aF_() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            a(dataOutputStream, this.d);
            if (this.c.c() > 0) {
                dataOutputStream.writeShort(this.a);
            }
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new bks(e);
        }
    }
}
