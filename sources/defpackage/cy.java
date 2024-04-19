package defpackage;

import java.util.ArrayList;
/* compiled from: WidgetContainer.java */
/* renamed from: cy  reason: default package */
/* loaded from: classes3.dex */
public class cy extends cq {
    public ArrayList<cq> aT = new ArrayList<>();

    @Override // defpackage.cq
    public void w() {
        this.aT.clear();
        super.w();
    }

    public void b(cq cqVar) {
        this.aT.add(cqVar);
        if (cqVar.A() != null) {
            ((cy) cqVar.A()).c(cqVar);
        }
        cqVar.a_(this);
    }

    public void c(cq cqVar) {
        this.aT.remove(cqVar);
        cqVar.w();
    }

    public ArrayList<cq> ah() {
        return this.aT;
    }

    public void ae() {
        ArrayList<cq> arrayList = this.aT;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cq cqVar = this.aT.get(i);
            if (cqVar instanceof cy) {
                ((cy) cqVar).ae();
            }
        }
    }

    @Override // defpackage.cq
    public void a(bp bpVar) {
        super.a(bpVar);
        int size = this.aT.size();
        for (int i = 0; i < size; i++) {
            this.aT.get(i).a(bpVar);
        }
    }

    public void ai() {
        this.aT.clear();
    }
}
