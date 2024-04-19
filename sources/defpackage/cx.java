package defpackage;

import defpackage.da;
import java.util.HashSet;
/* compiled from: VirtualLayout.java */
/* renamed from: cx  reason: default package */
/* loaded from: classes3.dex */
public class cx extends cv {
    private int aA = 0;
    private int aB = 0;
    private int aC = 0;
    private int aD = 0;
    private int aE = 0;
    private int aF = 0;
    private int aG = 0;
    private int aH = 0;
    private boolean aI = false;
    private int aJ = 0;
    private int aK = 0;
    protected da.a a = new da.a();
    da.b az = null;

    public int b() {
        return this.aA;
    }

    public int c() {
        return this.aB;
    }

    public int f() {
        return this.aG;
    }

    public int g() {
        return this.aH;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z) {
        this.aI = z;
    }

    public boolean h() {
        return this.aI;
    }

    @Override // defpackage.cv, defpackage.cu
    public void a(cr crVar) {
        i();
    }

    public void i() {
        for (int i = 0; i < this.ay; i++) {
            cq cqVar = this.ax[i];
            if (cqVar != null) {
                cqVar.b(true);
            }
        }
    }

    public boolean a(HashSet<cq> hashSet) {
        for (int i = 0; i < this.ay; i++) {
            if (hashSet.contains(this.ax[i])) {
                return true;
            }
        }
        return false;
    }
}
