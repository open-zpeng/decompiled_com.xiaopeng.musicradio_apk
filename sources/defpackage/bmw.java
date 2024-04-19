package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
/* compiled from: MqttWireMessage.java */
/* renamed from: bmw  reason: default package */
/* loaded from: classes3.dex */
public abstract class bmw {
    private static final String[] c = {"reserved", "CONNECT", "CONNACK", "PUBLISH", "PUBACK", "PUBREC", "PUBREL", "PUBCOMP", "SUBSCRIBE", "SUBACK", "UNSUBSCRIBE", "UNSUBACK", "PINGREQ", "PINGRESP", "DISCONNECT"};
    private byte d;
    protected boolean b = false;
    protected int a = 0;

    protected abstract byte aD_();

    protected abstract byte[] aF_();

    public boolean aG_() {
        return true;
    }

    public bmw(byte b) {
        this.d = b;
    }

    public byte[] aE_() {
        return new byte[0];
    }

    public byte i() {
        return this.d;
    }

    public int j() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public String e() {
        return new Integer(j()).toString();
    }

    public byte[] k() {
        try {
            int i = ((i() & 15) << 4) ^ (aD_() & 15);
            byte[] aF_ = aF_();
            int length = aF_.length + aE_().length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(i);
            dataOutputStream.write(a(length));
            dataOutputStream.write(aF_);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new bks(e);
        }
    }

    public static bmw a(bku bkuVar) {
        byte[] d = bkuVar.d();
        return a(new bmx(bkuVar.a(), bkuVar.c(), bkuVar.b(), d == null ? new byte[0] : d, bkuVar.f(), bkuVar.aC_()));
    }

    public static bmw a(byte[] bArr) {
        return a(new ByteArrayInputStream(bArr));
    }

    private static bmw a(InputStream inputStream) {
        try {
            bmc bmcVar = new bmc(inputStream);
            DataInputStream dataInputStream = new DataInputStream(bmcVar);
            int readUnsignedByte = dataInputStream.readUnsignedByte();
            byte b = (byte) (readUnsignedByte >> 4);
            byte b2 = (byte) (readUnsignedByte & 15);
            long a = (bmcVar.a() + a(dataInputStream).a()) - bmcVar.a();
            byte[] bArr = new byte[0];
            if (a > 0) {
                bArr = new byte[(int) a];
                dataInputStream.readFully(bArr, 0, bArr.length);
            }
            if (b == 1) {
                return new bmf(b2, bArr);
            }
            if (b == 3) {
                return new bmq(b2, bArr);
            }
            if (b == 4) {
                return new bmm(b2, bArr);
            }
            if (b == 7) {
                return new bmn(b2, bArr);
            }
            if (b == 2) {
                return new bme(b2, bArr);
            }
            if (b == 12) {
                return new bmk(b2, bArr);
            }
            if (b == 13) {
                return new bml(b2, bArr);
            }
            if (b == 8) {
                return new bmt(b2, bArr);
            }
            if (b == 9) {
                return new bms(b2, bArr);
            }
            if (b == 10) {
                return new bmv(b2, bArr);
            }
            if (b == 11) {
                return new bmu(b2, bArr);
            }
            if (b == 6) {
                return new bmp(b2, bArr);
            }
            if (b == 5) {
                return new bmo(b2, bArr);
            }
            if (b == 14) {
                return new bmg(b2, bArr);
            }
            throw bli.a(6);
        } catch (IOException e) {
            throw new bks(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] a(long j) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        do {
            byte b = (byte) (j % 128);
            j /= 128;
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i2 > 0) {
                b = (byte) (b | 128);
            }
            byteArrayOutputStream.write(b);
            i++;
            if (i2 <= 0) {
                break;
            }
        } while (i < 4);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static bmy a(DataInputStream dataInputStream) {
        byte readByte;
        long j = 0;
        int i = 0;
        int i2 = 1;
        do {
            i++;
            j += (readByte & Byte.MAX_VALUE) * i2;
            i2 *= 128;
        } while ((dataInputStream.readByte() & 128) != 0);
        return new bmy(j, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] l() {
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

    public void a(boolean z) {
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(DataOutputStream dataOutputStream, String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            dataOutputStream.write((byte) ((bytes.length >>> 8) & 255));
            dataOutputStream.write((byte) ((bytes.length >>> 0) & 255));
            dataOutputStream.write(bytes);
        } catch (UnsupportedEncodingException e) {
            throw new bks(e);
        } catch (IOException e2) {
            throw new bks(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b(DataInputStream dataInputStream) {
        try {
            byte[] bArr = new byte[dataInputStream.readUnsignedShort()];
            dataInputStream.readFully(bArr);
            return new String(bArr, "UTF-8");
        } catch (IOException e) {
            throw new bks(e);
        }
    }

    public String toString() {
        return c[this.d];
    }
}
