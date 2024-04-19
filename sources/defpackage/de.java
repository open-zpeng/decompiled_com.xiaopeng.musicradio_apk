package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: DependencyNode.java */
/* renamed from: de  reason: default package */
/* loaded from: classes3.dex */
public class de implements dc {
    Cdo d;
    int f;
    public int g;
    public dc a = null;
    public boolean b = false;
    public boolean c = false;
    a e = a.UNKNOWN;
    int h = 1;
    df i = null;
    public boolean j = false;
    List<dc> k = new ArrayList();
    List<de> l = new ArrayList();

    /* compiled from: DependencyNode.java */
    /* renamed from: de$a */
    /* loaded from: classes3.dex */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public de(Cdo cdo) {
        this.d = cdo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.d.C());
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }

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

    @Override // defpackage.dc
    public void a(dc dcVar) {
        for (de deVar : this.l) {
            if (!deVar.j) {
                return;
            }
        }
        this.c = true;
        dc dcVar2 = this.a;
        if (dcVar2 != null) {
            dcVar2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        de deVar2 = null;
        int i = 0;
        for (de deVar3 : this.l) {
            if (!(deVar3 instanceof df)) {
                i++;
                deVar2 = deVar3;
            }
        }
        if (deVar2 != null && i == 1 && deVar2.j) {
            df dfVar = this.i;
            if (dfVar != null) {
                if (!dfVar.j) {
                    return;
                }
                this.f = this.h * this.i.g;
            }
            a(deVar2.g + this.f);
        }
        dc dcVar3 = this.a;
        if (dcVar3 != null) {
            dcVar3.a(this);
        }
    }

    public void b(dc dcVar) {
        this.k.add(dcVar);
        if (this.j) {
            dcVar.a(dcVar);
        }
    }

    public void a() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }
}
