package defpackage;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* renamed from: np  reason: default package */
/* loaded from: classes3.dex */
public class np implements nn, nq {
    private final String d;
    private final ps f;
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List<nq> e = new ArrayList();

    public np(ps psVar) {
        if (Build.VERSION.SDK_INT < 19) {
            throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
        }
        this.d = psVar.a();
        this.f = psVar;
    }

    @Override // defpackage.nn
    public void a(ListIterator<ng> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            ng previous = listIterator.previous();
            if (previous instanceof nq) {
                this.e.add((nq) previous);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.ng
    public void a(List<ng> list, List<ng> list2) {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).a(list, list2);
        }
    }

    @Override // defpackage.nq
    public Path e() {
        this.c.reset();
        switch (this.f.b()) {
            case Merge:
                a();
                break;
            case Add:
                a(Path.Op.UNION);
                break;
            case Subtract:
                a(Path.Op.REVERSE_DIFFERENCE);
                break;
            case Intersect:
                a(Path.Op.INTERSECT);
                break;
            case ExcludeIntersections:
                a(Path.Op.XOR);
                break;
        }
        return this.c;
    }

    @Override // defpackage.ng
    public String b() {
        return this.d;
    }

    private void a() {
        for (int i = 0; i < this.e.size(); i++) {
            this.c.addPath(this.e.get(i).e());
        }
    }

    @TargetApi(19)
    private void a(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.e.size() - 1; size >= 1; size--) {
            nq nqVar = this.e.get(size);
            if (nqVar instanceof nh) {
                nh nhVar = (nh) nqVar;
                List<nq> c = nhVar.c();
                for (int size2 = c.size() - 1; size2 >= 0; size2--) {
                    Path e = c.get(size2).e();
                    e.transform(nhVar.d());
                    this.b.addPath(e);
                }
            } else {
                this.b.addPath(nqVar.e());
            }
        }
        nq nqVar2 = this.e.get(0);
        if (nqVar2 instanceof nh) {
            nh nhVar2 = (nh) nqVar2;
            List<nq> c2 = nhVar2.c();
            for (int i = 0; i < c2.size(); i++) {
                Path e2 = c2.get(i).e();
                e2.transform(nhVar2.d());
                this.a.addPath(e2);
            }
        } else {
            this.a.set(nqVar2.e());
        }
        this.c.op(this.a, this.b, op);
    }
}
