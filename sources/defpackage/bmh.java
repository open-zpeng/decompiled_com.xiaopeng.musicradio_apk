package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
/* compiled from: MqttInputStream.java */
/* renamed from: bmh  reason: default package */
/* loaded from: classes3.dex */
public class bmh extends InputStream {
    private static final String a = "bmh";
    private static final bna b = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", a);
    private blb c;
    private DataInputStream d;
    private ByteArrayOutputStream e = new ByteArrayOutputStream();
    private long f = -1;
    private long g;
    private byte[] h;

    public bmh(blb blbVar, InputStream inputStream) {
        this.c = null;
        this.c = blbVar;
        this.d = new DataInputStream(inputStream);
    }

    @Override // java.io.InputStream
    public int read() {
        return this.d.read();
    }

    @Override // java.io.InputStream
    public int available() {
        return this.d.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    public bmw a() {
        try {
            if (this.f < 0) {
                this.e.reset();
                byte readByte = this.d.readByte();
                this.c.c(1);
                byte b2 = (byte) ((readByte >>> 4) & 15);
                if (b2 < 1 || b2 > 14) {
                    throw bli.a(32108);
                }
                this.f = bmw.a(this.d).a();
                this.e.write(readByte);
                this.e.write(bmw.a(this.f));
                this.h = new byte[(int) (this.e.size() + this.f)];
                this.g = 0L;
            }
            if (this.f >= 0) {
                b();
                this.f = -1L;
                byte[] byteArray = this.e.toByteArray();
                System.arraycopy(byteArray, 0, this.h, 0, byteArray.length);
                bmw a2 = bmw.a(this.h);
                b.fine(a, "readMqttWireMessage", "501", new Object[]{a2});
                return a2;
            }
            return null;
        } catch (SocketTimeoutException unused) {
            return null;
        }
    }

    private void b() {
        int size = this.e.size();
        long j = this.g;
        int i = size + ((int) j);
        int i2 = (int) (this.f - j);
        if (i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                int read = this.d.read(this.h, i + i3, i2 - i3);
                this.c.c(read);
                if (read < 0) {
                    throw new EOFException();
                }
                i3 += read;
            } catch (SocketTimeoutException e) {
                this.g += i3;
                throw e;
            }
        }
    }
}
