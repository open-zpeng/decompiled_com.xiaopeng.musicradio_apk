package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: HelperWidget.java */
/* renamed from: cv  reason: default package */
/* loaded from: classes3.dex */
public class cv extends cq implements cu {
    public cq[] ax = new cq[4];
    public int ay = 0;

    @Override // defpackage.cu
    public void a(cr crVar) {
    }

    @Override // defpackage.cu
    public void a(cq cqVar) {
        if (cqVar == this || cqVar == null) {
            return;
        }
        int i = this.ay + 1;
        cq[] cqVarArr = this.ax;
        if (i > cqVarArr.length) {
            this.ax = (cq[]) Arrays.copyOf(cqVarArr, cqVarArr.length * 2);
        }
        cq[] cqVarArr2 = this.ax;
        int i2 = this.ay;
        cqVarArr2[i2] = cqVar;
        this.ay = i2 + 1;
    }

    @Override // defpackage.cq
    public void a(cq cqVar, HashMap<cq, cq> hashMap) {
        super.a(cqVar, hashMap);
        cv cvVar = (cv) cqVar;
        this.ay = 0;
        int i = cvVar.ay;
        for (int i2 = 0; i2 < i; i2++) {
            a(hashMap.get(cvVar.ax[i2]));
        }
    }

    @Override // defpackage.cu
    public void b_() {
        this.ay = 0;
        Arrays.fill(this.ax, (Object) null);
    }

    public void a(ArrayList<dn> arrayList, int i, dn dnVar) {
        for (int i2 = 0; i2 < this.ay; i2++) {
            dnVar.a(this.ax[i2]);
        }
        for (int i3 = 0; i3 < this.ay; i3++) {
            dh.a(this.ax[i3], i, arrayList, dnVar);
        }
    }

    public int A(int i) {
        for (int i2 = 0; i2 < this.ay; i2++) {
            cq cqVar = this.ax[i2];
            if (i == 0 && cqVar.av != -1) {
                return cqVar.av;
            }
            if (i == 1 && cqVar.aw != -1) {
                return cqVar.aw;
            }
        }
        return -1;
    }
}
