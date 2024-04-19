package defpackage;

import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController;
import java.lang.reflect.Array;
/* renamed from: bom  reason: default package */
/* loaded from: classes3.dex */
abstract class bom {
    final int a;
    final int[] b = new int[4];
    final bor c = new bor();
    final short[][] d = (short[][]) Array.newInstance(short.class, 12, 16);
    final short[] e = new short[12];
    final short[] f = new short[12];
    final short[] g = new short[12];
    final short[] h = new short[12];
    final short[][] i = (short[][]) Array.newInstance(short.class, 12, 16);
    final short[][] j = (short[][]) Array.newInstance(short.class, 4, 64);
    final short[][] k = {new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
    final short[] l = new short[16];

    /* renamed from: bom$a */
    /* loaded from: classes3.dex */
    abstract class a {
        final short[] a = new short[2];
        final short[][] b = (short[][]) Array.newInstance(short.class, 16, 8);
        final short[][] c = (short[][]) Array.newInstance(short.class, 16, 8);
        final short[] d = new short[IRadioController.TEF663x_PCHANNEL];
        private final bom e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(bom bomVar) {
            this.e = bomVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            bos.a(this.a);
            int i = 0;
            while (true) {
                short[][] sArr = this.b;
                if (i >= sArr.length) {
                    break;
                }
                bos.a(sArr[i]);
                i++;
            }
            for (int i2 = 0; i2 < this.b.length; i2++) {
                bos.a(this.c[i2]);
            }
            bos.a(this.d);
        }
    }

    /* renamed from: bom$b */
    /* loaded from: classes3.dex */
    abstract class b {
        private final int a;
        private final int b;
        private final bom c;

        /* renamed from: bom$b$a */
        /* loaded from: classes3.dex */
        abstract class a {
            final short[] a = new short[768];
            private final b b;

            /* JADX INFO: Access modifiers changed from: package-private */
            public a(b bVar) {
                this.b = bVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void a() {
                bos.a(this.a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(bom bomVar, int i, int i2) {
            this.c = bomVar;
            this.a = i;
            this.b = (1 << i2) - 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int a(int i, int i2) {
            int i3 = this.a;
            return (i >> (8 - i3)) + ((i2 & this.b) << i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bom(int i) {
        this.a = (1 << i) - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(int i) {
        if (i < 6) {
            return i - 2;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        int[] iArr = this.b;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.c.a();
        int i2 = 0;
        while (true) {
            short[][] sArr = this.d;
            if (i2 >= sArr.length) {
                break;
            }
            bos.a(sArr[i2]);
            i2++;
        }
        bos.a(this.e);
        bos.a(this.f);
        bos.a(this.g);
        bos.a(this.h);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.i;
            if (i3 >= sArr2.length) {
                break;
            }
            bos.a(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.j;
            if (i4 >= sArr3.length) {
                break;
            }
            bos.a(sArr3[i4]);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.k;
            if (i >= sArr4.length) {
                bos.a(this.l);
                return;
            } else {
                bos.a(sArr4[i]);
                i++;
            }
        }
    }
}
