package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: WidgetGroup.java */
/* renamed from: dn  reason: default package */
/* loaded from: classes3.dex */
public class dn {
    static int b;
    int c;
    int e;
    ArrayList<cq> a = new ArrayList<>();
    boolean d = false;
    ArrayList<a> f = null;
    private int g = -1;

    public dn(int i) {
        this.c = -1;
        this.e = 0;
        int i2 = b;
        b = i2 + 1;
        this.c = i2;
        this.e = i;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.c;
    }

    public boolean a(cq cqVar) {
        if (this.a.contains(cqVar)) {
            return false;
        }
        this.a.add(cqVar);
        return true;
    }

    public void a(boolean z) {
        this.d = z;
    }

    private String c() {
        int i = this.e;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    public String toString() {
        Iterator<cq> it;
        String str = c() + " [" + this.c + "] <";
        while (this.a.iterator().hasNext()) {
            str = str + " " + it.next().C();
        }
        return str + " >";
    }

    public void a(int i, dn dnVar) {
        Iterator<cq> it = this.a.iterator();
        while (it.hasNext()) {
            cq next = it.next();
            dnVar.a(next);
            if (i == 0) {
                next.av = dnVar.b();
            } else {
                next.aw = dnVar.b();
            }
        }
        this.g = dnVar.c;
    }

    public int a(bq bqVar, int i) {
        if (this.a.size() == 0) {
            return 0;
        }
        return a(bqVar, this.a, i);
    }

    private int a(bq bqVar, ArrayList<cq> arrayList, int i) {
        cr crVar = (cr) arrayList.get(0).A();
        bqVar.b();
        crVar.a(bqVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).a(bqVar, false);
        }
        if (i == 0 && crVar.aF > 0) {
            cn.a(crVar, bqVar, arrayList, 0);
        }
        if (i == 1 && crVar.aG > 0) {
            cn.a(crVar, bqVar, arrayList, 1);
        }
        try {
            bqVar.f();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f.add(new a(arrayList.get(i3), bqVar, i));
        }
        if (i == 0) {
            int b2 = bqVar.b(crVar.z);
            int b3 = bqVar.b(crVar.B);
            bqVar.b();
            return b3 - b2;
        }
        int b4 = bqVar.b(crVar.A);
        int b5 = bqVar.b(crVar.C);
        bqVar.b();
        return b5 - b4;
    }

    public void a(int i) {
        this.e = i;
    }

    public void a(ArrayList<dn> arrayList) {
        int size = this.a.size();
        if (this.g != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                dn dnVar = arrayList.get(i);
                if (this.g == dnVar.c) {
                    a(this.e, dnVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetGroup.java */
    /* renamed from: dn$a */
    /* loaded from: classes3.dex */
    public class a {
        WeakReference<cq> a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;

        public a(cq cqVar, bq bqVar, int i) {
            this.a = new WeakReference<>(cqVar);
            this.b = bqVar.b(cqVar.z);
            this.c = bqVar.b(cqVar.A);
            this.d = bqVar.b(cqVar.B);
            this.e = bqVar.b(cqVar.C);
            this.f = bqVar.b(cqVar.D);
            this.g = i;
        }
    }
}
