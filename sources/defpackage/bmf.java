package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* compiled from: MqttConnect.java */
/* renamed from: bmf  reason: default package */
/* loaded from: classes3.dex */
public class bmf extends bmw {
    private String c;
    private boolean d;
    private bkt e;
    private String f;
    private char[] g;
    private int h;
    private String i;
    private int j;

    @Override // defpackage.bmw
    protected byte aD_() {
        return (byte) 0;
    }

    @Override // defpackage.bmw
    public boolean aG_() {
        return false;
    }

    @Override // defpackage.bmw
    public String e() {
        return "Con";
    }

    public bmf(byte b, byte[] bArr) {
        super((byte) 1);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        b(dataInputStream);
        dataInputStream.readByte();
        dataInputStream.readByte();
        this.h = dataInputStream.readUnsignedShort();
        this.c = b(dataInputStream);
        dataInputStream.close();
    }

    public bmf(String str, int i, boolean z, int i2, String str2, char[] cArr, bkt bktVar, String str3) {
        super((byte) 1);
        this.c = str;
        this.d = z;
        this.h = i2;
        this.f = str2;
        this.g = cArr;
        this.e = bktVar;
        this.i = str3;
        this.j = i;
    }

    @Override // defpackage.bmw
    public String toString() {
        return String.valueOf(super.toString()) + " clientId " + this.c + " keepAliveInterval " + this.h;
    }

    @Override // defpackage.bmw
    protected byte[] aF_() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (this.j == 3) {
                a(dataOutputStream, "MQIsdp");
            } else if (this.j == 4) {
                a(dataOutputStream, "MQTT");
            }
            dataOutputStream.write(this.j);
            byte b = this.d ? (byte) 2 : (byte) 0;
            if (this.e != null) {
                b = (byte) (((byte) (b | 4)) | (this.e.c() << 3));
                if (this.e.b()) {
                    b = (byte) (b | 32);
                }
            }
            if (this.f != null) {
                b = (byte) (b | 128);
                if (this.g != null) {
                    b = (byte) (b | 64);
                }
            }
            dataOutputStream.write(b);
            dataOutputStream.writeShort(this.h);
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
            a(dataOutputStream, this.c);
            if (this.e != null) {
                a(dataOutputStream, this.i);
                dataOutputStream.writeShort(this.e.a().length);
                dataOutputStream.write(this.e.a());
            }
            if (this.f != null) {
                a(dataOutputStream, this.f);
                if (this.g != null) {
                    a(dataOutputStream, new String(this.g));
                }
            }
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new bks(e);
        }
    }
}
