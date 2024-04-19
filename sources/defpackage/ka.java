package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import defpackage.jw;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TransitionSet.java */
/* renamed from: ka  reason: default package */
/* loaded from: classes3.dex */
public class ka extends jw {
    int h;
    private ArrayList<jw> j = new ArrayList<>();
    private boolean k = true;
    boolean i = false;
    private int l = 0;

    public ka a(int i) {
        switch (i) {
            case 0:
                this.k = true;
                break;
            case 1:
                this.k = false;
                break;
            default:
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    public ka a(jw jwVar) {
        b(jwVar);
        if (this.a >= 0) {
            jwVar.a(this.a);
        }
        if ((this.l & 1) != 0) {
            jwVar.a(d());
        }
        if ((this.l & 2) != 0) {
            jwVar.a(o());
        }
        if ((this.l & 4) != 0) {
            jwVar.a(m());
        }
        if ((this.l & 8) != 0) {
            jwVar.a(n());
        }
        return this;
    }

    private void b(jw jwVar) {
        this.j.add(jwVar);
        jwVar.d = this;
    }

    public int r() {
        return this.j.size();
    }

    public jw b(int i) {
        if (i < 0 || i >= this.j.size()) {
            return null;
        }
        return this.j.get(i);
    }

    @Override // defpackage.jw
    /* renamed from: c */
    public ka a(long j) {
        ArrayList<jw> arrayList;
        super.a(j);
        if (this.a >= 0 && (arrayList = this.j) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.j.get(i).a(j);
            }
        }
        return this;
    }

    @Override // defpackage.jw
    /* renamed from: d */
    public ka b(long j) {
        return (ka) super.b(j);
    }

    @Override // defpackage.jw
    /* renamed from: b */
    public ka a(TimeInterpolator timeInterpolator) {
        this.l |= 1;
        ArrayList<jw> arrayList = this.j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.j.get(i).a(timeInterpolator);
            }
        }
        return (ka) super.a(timeInterpolator);
    }

    @Override // defpackage.jw
    /* renamed from: f */
    public ka b(View view) {
        for (int i = 0; i < this.j.size(); i++) {
            this.j.get(i).b(view);
        }
        return (ka) super.b(view);
    }

    @Override // defpackage.jw
    /* renamed from: c */
    public ka a(jw.c cVar) {
        return (ka) super.a(cVar);
    }

    @Override // defpackage.jw
    /* renamed from: g */
    public ka c(View view) {
        for (int i = 0; i < this.j.size(); i++) {
            this.j.get(i).c(view);
        }
        return (ka) super.c(view);
    }

    @Override // defpackage.jw
    /* renamed from: d */
    public ka b(jw.c cVar) {
        return (ka) super.b(cVar);
    }

    @Override // defpackage.jw
    public void a(jq jqVar) {
        super.a(jqVar);
        this.l |= 4;
        if (this.j != null) {
            for (int i = 0; i < this.j.size(); i++) {
                this.j.get(i).a(jqVar);
            }
        }
    }

    private void s() {
        a aVar = new a(this);
        Iterator<jw> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
        this.h = this.j.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransitionSet.java */
    /* renamed from: ka$a */
    /* loaded from: classes3.dex */
    public static class a extends jx {
        ka a;

        a(ka kaVar) {
            this.a = kaVar;
        }

        @Override // defpackage.jx, defpackage.jw.c
        public void e(jw jwVar) {
            if (this.a.i) {
                return;
            }
            this.a.j();
            this.a.i = true;
        }

        @Override // defpackage.jx, defpackage.jw.c
        public void b(jw jwVar) {
            ka kaVar = this.a;
            kaVar.h--;
            if (this.a.h == 0) {
                ka kaVar2 = this.a;
                kaVar2.i = false;
                kaVar2.k();
            }
            jwVar.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jw
    public void a(ViewGroup viewGroup, kd kdVar, kd kdVar2, ArrayList<kc> arrayList, ArrayList<kc> arrayList2) {
        long c = c();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            jw jwVar = this.j.get(i);
            if (c > 0 && (this.k || i == 0)) {
                long c2 = jwVar.c();
                if (c2 > 0) {
                    jwVar.b(c2 + c);
                } else {
                    jwVar.b(c);
                }
            }
            jwVar.a(viewGroup, kdVar, kdVar2, arrayList, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jw
    public void e() {
        if (this.j.isEmpty()) {
            j();
            k();
            return;
        }
        s();
        if (!this.k) {
            for (int i = 1; i < this.j.size(); i++) {
                final jw jwVar = this.j.get(i);
                this.j.get(i - 1).a(new jx() { // from class: ka.1
                    @Override // defpackage.jx, defpackage.jw.c
                    public void b(jw jwVar2) {
                        jwVar.e();
                        jwVar2.b(this);
                    }
                });
            }
            jw jwVar2 = this.j.get(0);
            if (jwVar2 != null) {
                jwVar2.e();
                return;
            }
            return;
        }
        Iterator<jw> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    @Override // defpackage.jw
    public void a(kc kcVar) {
        if (a(kcVar.b)) {
            Iterator<jw> it = this.j.iterator();
            while (it.hasNext()) {
                jw next = it.next();
                if (next.a(kcVar.b)) {
                    next.a(kcVar);
                    kcVar.c.add(next);
                }
            }
        }
    }

    @Override // defpackage.jw
    public void b(kc kcVar) {
        if (a(kcVar.b)) {
            Iterator<jw> it = this.j.iterator();
            while (it.hasNext()) {
                jw next = it.next();
                if (next.a(kcVar.b)) {
                    next.b(kcVar);
                    kcVar.c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.jw
    public void c(kc kcVar) {
        super.c(kcVar);
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            this.j.get(i).c(kcVar);
        }
    }

    @Override // defpackage.jw
    public void d(View view) {
        super.d(view);
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            this.j.get(i).d(view);
        }
    }

    @Override // defpackage.jw
    public void e(View view) {
        super.e(view);
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            this.j.get(i).e(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jw
    public void l() {
        super.l();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            this.j.get(i).l();
        }
    }

    @Override // defpackage.jw
    public void a(jz jzVar) {
        super.a(jzVar);
        this.l |= 2;
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            this.j.get(i).a(jzVar);
        }
    }

    @Override // defpackage.jw
    public void a(jw.b bVar) {
        super.a(bVar);
        this.l |= 8;
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            this.j.get(i).a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.jw
    public String a(String str) {
        String a2 = super.a(str);
        for (int i = 0; i < this.j.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("\n");
            sb.append(this.j.get(i).a(str + "  "));
            a2 = sb.toString();
        }
        return a2;
    }

    @Override // defpackage.jw
    /* renamed from: p */
    public jw clone() {
        ka kaVar = (ka) super.clone();
        kaVar.j = new ArrayList<>();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            kaVar.b(this.j.get(i).clone());
        }
        return kaVar;
    }
}
