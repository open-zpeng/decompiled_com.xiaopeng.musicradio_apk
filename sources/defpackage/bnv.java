package defpackage;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
/* renamed from: bnv  reason: default package */
/* loaded from: classes3.dex */
public class bnv extends bnr {
    static final boolean a;
    static Class b;
    private static final int[] c;
    private static final int[] d;
    private int e;
    private byte[] f = null;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    static {
        Class cls = b;
        if (cls == null) {
            cls = a("bnv");
            b = cls;
        }
        a = !cls.desiredAssertionStatus();
        c = new int[]{262144, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, 2097152, 4194304, 4194304, 8388608, 8388608, C.DEFAULT_MUXED_BUFFER_SIZE, 33554432, 67108864};
        d = new int[]{4, 8, 24, 48};
    }

    public bnv() {
        try {
            a(6);
        } catch (bob unused) {
            if (!a) {
                throw new AssertionError();
            }
            throw new RuntimeException();
        }
    }

    static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public int a() {
        return this.e;
    }

    @Override // defpackage.bnr
    public bns a(bns bnsVar) {
        return this.j == 0 ? new boa(bnsVar) : new bnw(bnsVar, this);
    }

    public void a(int i) {
        if (i < 0 || i > 9) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unsupported preset: ");
            stringBuffer.append(i);
            throw new bob(stringBuffer.toString());
        }
        this.g = 3;
        this.h = 0;
        this.i = 2;
        this.e = c[i];
        if (i <= 3) {
            this.j = 1;
            this.l = 4;
            this.k = i <= 1 ? 128 : 273;
            this.m = d[i];
            return;
        }
        this.j = 2;
        this.l = 20;
        this.k = i == 4 ? 16 : i == 5 ? 32 : 64;
        this.m = 0;
    }

    public void b(int i) {
        if (i < 4096) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("LZMA2 dictionary size must be at least 4 KiB: ");
            stringBuffer.append(i);
            stringBuffer.append(" B");
            throw new bob(stringBuffer.toString());
        } else if (i <= 805306368) {
            this.e = i;
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("LZMA2 dictionary size must not exceed 768 MiB: ");
            stringBuffer2.append(i);
            stringBuffer2.append(" B");
            throw new bob(stringBuffer2.toString());
        }
    }

    public byte[] b() {
        return this.f;
    }

    public int c() {
        return this.g;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (a) {
                throw new RuntimeException();
            }
            throw new AssertionError();
        }
    }

    public int d() {
        return this.h;
    }

    public int e() {
        return this.i;
    }

    public int f() {
        return this.j;
    }

    public int g() {
        return this.k;
    }

    public int h() {
        return this.l;
    }

    public int i() {
        return this.m;
    }
}
