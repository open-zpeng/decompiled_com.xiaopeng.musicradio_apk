package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
/* compiled from: WebSocketFrame.java */
/* renamed from: blx  reason: default package */
/* loaded from: classes3.dex */
public class blx {
    private byte a;
    private boolean b;
    private byte[] c;
    private boolean d;

    public byte[] a() {
        return this.c;
    }

    public boolean b() {
        return this.d;
    }

    public blx(byte b, boolean z, byte[] bArr) {
        this.d = false;
        this.a = b;
        this.b = z;
        this.c = bArr;
    }

    private void a(byte b) {
        this.b = (b & 128) != 0;
        this.a = (byte) (b & 15);
    }

    public blx(InputStream inputStream) {
        byte[] bArr;
        int i = 0;
        this.d = false;
        a((byte) inputStream.read());
        byte b = this.a;
        int i2 = 2;
        if (b != 2) {
            if (b == 8) {
                this.d = true;
                return;
            }
            throw new IOException("Invalid Frame: Opcode: " + ((int) this.a));
        }
        byte read = (byte) inputStream.read();
        boolean z = (read & 128) != 0;
        int i3 = (byte) (read & Byte.MAX_VALUE);
        if (i3 == 127) {
            i2 = 8;
        } else if (i3 != 126) {
            i2 = 0;
        }
        i3 = i2 > 0 ? 0 : i3;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            i3 |= (((byte) inputStream.read()) & 255) << (i2 * 8);
        }
        if (z) {
            bArr = new byte[4];
            inputStream.read(bArr, 0, 4);
        } else {
            bArr = null;
        }
        this.c = new byte[i3];
        int i4 = 0;
        int i5 = i3;
        while (i4 != i3) {
            int read2 = inputStream.read(this.c, i4, i5);
            i4 += read2;
            i5 -= read2;
        }
        if (!z) {
            return;
        }
        while (true) {
            byte[] bArr2 = this.c;
            if (i >= bArr2.length) {
                return;
            }
            bArr2[i] = (byte) (bArr2[i] ^ bArr[i % 4]);
            i++;
        }
    }

    public byte[] c() {
        byte[] bArr = this.c;
        int length = bArr.length + 6;
        if (bArr.length > 65535) {
            length += 8;
        } else if (bArr.length >= 126) {
            length += 2;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        a(allocate, this.a, this.b);
        byte[] d = d();
        a(allocate, this.c.length, d);
        int i = 0;
        while (true) {
            byte[] bArr2 = this.c;
            if (i < bArr2.length) {
                byte b = (byte) (bArr2[i] ^ d[i % 4]);
                bArr2[i] = b;
                allocate.put(b);
                i++;
            } else {
                allocate.flip();
                return allocate.array();
            }
        }
    }

    public static void a(ByteBuffer byteBuffer, int i, byte[] bArr) {
        if (bArr != null) {
            a(byteBuffer, i, true);
            byteBuffer.put(bArr);
            return;
        }
        a(byteBuffer, i, false);
    }

    private static void a(ByteBuffer byteBuffer, int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        int i2 = z ? -128 : 0;
        if (i <= 65535) {
            if (i >= 126) {
                byteBuffer.put((byte) (i2 | 126));
                byteBuffer.put((byte) (i >> 8));
                byteBuffer.put((byte) (i & 255));
                return;
            }
            byteBuffer.put((byte) (i | i2));
            return;
        }
        byteBuffer.put((byte) (i2 | 127));
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) ((i >> 24) & 255));
        byteBuffer.put((byte) ((i >> 16) & 255));
        byteBuffer.put((byte) ((i >> 8) & 255));
        byteBuffer.put((byte) (i & 255));
    }

    public static void a(ByteBuffer byteBuffer, byte b, boolean z) {
        byteBuffer.put((byte) ((b & 15) | (z ? (byte) 128 : (byte) 0)));
    }

    public static byte[] d() {
        SecureRandom secureRandom = new SecureRandom();
        return new byte[]{(byte) secureRandom.nextInt(255), (byte) secureRandom.nextInt(255), (byte) secureRandom.nextInt(255), (byte) secureRandom.nextInt(255)};
    }
}
