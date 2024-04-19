package defpackage;

import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController;
import com.xiaopeng.speech.protocol.node.navi.bean.NaviPreferenceBean;
/* compiled from: GenericGF.java */
/* renamed from: zx  reason: default package */
/* loaded from: classes3.dex */
public final class zx {
    public static final zx a = new zx(4201, 4096, 1);
    public static final zx b = new zx(1033, 1024, 1);
    public static final zx c = new zx(67, 64, 1);
    public static final zx d = new zx(19, 16, 1);
    public static final zx e = new zx(285, IRadioController.TEF663x_PCHANNEL, 0);
    public static final zx f = new zx(NaviPreferenceBean.CAFE_ID, IRadioController.TEF663x_PCHANNEL, 1);
    public static final zx g = f;
    public static final zx h = c;
    private final int[] i;
    private final int[] j;
    private final zy k;
    private final zy l;
    private final int m;
    private final int n;
    private final int o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, int i2) {
        return i ^ i2;
    }

    public zx(int i, int i2, int i3) {
        this.n = i;
        this.m = i2;
        this.o = i3;
        this.i = new int[i2];
        this.j = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.i[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.j[this.i[i6]] = i6;
        }
        this.k = new zy(this, new int[]{0});
        this.l = new zy(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zy a() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zy a(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.k;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new zy(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        return this.i[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        return this.j[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.i[(this.m - this.j[i]) - 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.m - 1)];
    }

    public int b() {
        return this.o;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.n) + ',' + this.m + ')';
    }
}
