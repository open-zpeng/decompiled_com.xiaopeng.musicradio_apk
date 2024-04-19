package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: ReedSolomonEncoder.java */
/* renamed from: zz  reason: default package */
/* loaded from: classes3.dex */
public final class zz {
    private final zx a;
    private final List<zy> b = new ArrayList();

    public zz(zx zxVar) {
        this.a = zxVar;
        this.b.add(new zy(zxVar, new int[]{1}));
    }

    private zy a(int i) {
        if (i >= this.b.size()) {
            List<zy> list = this.b;
            zy zyVar = list.get(list.size() - 1);
            for (int size = this.b.size(); size <= i; size++) {
                zx zxVar = this.a;
                zyVar = zyVar.b(new zy(zxVar, new int[]{1, zxVar.a((size - 1) + zxVar.b())}));
                this.b.add(zyVar);
            }
        }
        return this.b.get(i);
    }

    public void a(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        zy a = a(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] a2 = new zy(this.a, iArr2).a(i, 1).c(a)[1].a();
        int length2 = i - a2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(a2, 0, iArr, length + length2, a2.length);
    }
}
