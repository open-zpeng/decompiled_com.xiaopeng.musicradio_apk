package defpackage;

import com.alibaba.fastjson.asm.Opcodes;
import java.io.DataOutputStream;
import java.io.IOException;
/* renamed from: bnw  reason: default package */
/* loaded from: classes3.dex */
class bnw extends bns {
    static final boolean a;
    static Class b;
    private bns c;
    private final DataOutputStream d;
    private final bok e;
    private final bot f;
    private final bon g;
    private final int h;
    private boolean i;
    private boolean j = true;
    private boolean k = true;
    private int l = 0;
    private boolean m = false;
    private IOException n = null;
    private final byte[] o = new byte[1];

    static {
        Class cls = b;
        if (cls == null) {
            cls = a("bnw");
            b = cls;
        }
        a = !cls.desiredAssertionStatus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bnw(bns bnsVar, bnv bnvVar) {
        this.i = true;
        if (bnsVar == null) {
            throw new NullPointerException();
        }
        this.c = bnsVar;
        this.d = new DataOutputStream(bnsVar);
        this.f = new bot(65536);
        int a2 = bnvVar.a();
        this.g = bon.a(this.f, bnvVar.c(), bnvVar.d(), bnvVar.e(), bnvVar.f(), a2, a(a2), bnvVar.g(), bnvVar.h(), bnvVar.i());
        this.e = this.g.c();
        byte[] b2 = bnvVar.b();
        if (b2 != null && b2.length > 0) {
            this.e.a(a2, b2);
            this.i = false;
        }
        this.h = (((bnvVar.e() * 5) + bnvVar.d()) * 9) + bnvVar.c();
    }

    private static int a(int i) {
        if (65536 > i) {
            return 65536 - i;
        }
        return 0;
    }

    static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    private void a() {
        int c = this.f.c();
        int d = this.g.d();
        if (!a && c <= 0) {
            throw new AssertionError(c);
        }
        if (!a && d <= 0) {
            throw new AssertionError(d);
        }
        if (c + 2 < d) {
            a(d, c);
        } else {
            this.g.a();
            d = this.g.d();
            if (!a && d <= 0) {
                throw new AssertionError(d);
            }
            b(d);
        }
        this.l -= d;
        this.g.e();
        this.f.a();
    }

    private void a(int i, int i2) {
        int i3 = i - 1;
        this.d.writeByte((this.k ? this.i ? 224 : 192 : this.j ? Opcodes.IF_ICMPNE : 128) | (i3 >>> 16));
        this.d.writeShort(i3);
        this.d.writeShort(i2 - 1);
        if (this.k) {
            this.d.writeByte(this.h);
        }
        this.f.a(this.c);
        this.k = false;
        this.j = false;
        this.i = false;
    }

    private void b() {
        if (!a && this.m) {
            throw new AssertionError();
        }
        IOException iOException = this.n;
        if (iOException != null) {
            throw iOException;
        }
        this.e.d();
        while (this.l > 0) {
            try {
                this.g.f();
                a();
            } catch (IOException e) {
                this.n = e;
                throw e;
            }
        }
        this.c.write(0);
        this.m = true;
    }

    private void b(int i) {
        while (true) {
            int i2 = 1;
            if (i <= 0) {
                this.j = true;
                return;
            }
            int min = Math.min(i, 65536);
            DataOutputStream dataOutputStream = this.d;
            if (!this.i) {
                i2 = 2;
            }
            dataOutputStream.writeByte(i2);
            this.d.writeShort(min - 1);
            this.e.a(this.c, i, min);
            i -= min;
            this.i = false;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.c != null) {
            if (!this.m) {
                try {
                    b();
                } catch (IOException unused) {
                }
            }
            try {
                this.c.close();
            } catch (IOException e) {
                if (this.n == null) {
                    this.n = e;
                }
            }
            this.c = null;
        }
        IOException iOException = this.n;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        IOException iOException = this.n;
        if (iOException != null) {
            throw iOException;
        }
        if (this.m) {
            throw new bod("Stream finished or closed");
        }
        try {
            this.e.c();
            while (this.l > 0) {
                this.g.f();
                a();
            }
            this.c.flush();
        } catch (IOException e) {
            this.n = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        byte[] bArr = this.o;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.n;
        if (iOException != null) {
            throw iOException;
        }
        if (this.m) {
            throw new bod("Stream finished or closed");
        }
        while (i2 > 0) {
            try {
                int a2 = this.e.a(bArr, i, i2);
                i += a2;
                i2 -= a2;
                this.l += a2;
                if (this.g.f()) {
                    a();
                }
            } catch (IOException e) {
                this.n = e;
                throw e;
            }
        }
    }
}
