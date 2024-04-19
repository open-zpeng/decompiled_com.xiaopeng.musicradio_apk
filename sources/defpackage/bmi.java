package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
/* compiled from: MqttOutputStream.java */
/* renamed from: bmi  reason: default package */
/* loaded from: classes3.dex */
public class bmi extends OutputStream {
    private static final String a = "bmi";
    private static final bna b = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", a);
    private blb c;
    private BufferedOutputStream d;

    public bmi(blb blbVar, OutputStream outputStream) {
        this.c = null;
        this.c = blbVar;
        this.d = new BufferedOutputStream(outputStream);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.d.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.d.write(bArr);
        this.c.b(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.d.write(bArr, i, i2);
        this.c.b(i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.d.write(i);
    }

    public void a(bmw bmwVar) {
        byte[] k = bmwVar.k();
        byte[] aE_ = bmwVar.aE_();
        this.d.write(k, 0, k.length);
        this.c.b(k.length);
        int i = 0;
        while (i < aE_.length) {
            int min = Math.min(1024, aE_.length - i);
            this.d.write(aE_, i, min);
            i += 1024;
            this.c.b(min);
        }
        b.fine(a, "write", "529", new Object[]{bmwVar});
    }
}
