package defpackage;

import defpackage.de;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DimensionDependency.java */
/* renamed from: df  reason: default package */
/* loaded from: classes3.dex */
public class df extends de {
    public int m;

    public df(Cdo cdo) {
        super(cdo);
        if (cdo instanceof dk) {
            this.e = de.a.HORIZONTAL_DIMENSION;
        } else {
            this.e = de.a.VERTICAL_DIMENSION;
        }
    }

    @Override // defpackage.de
    public void a(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (dc dcVar : this.k) {
            dcVar.a(dcVar);
        }
    }
}
