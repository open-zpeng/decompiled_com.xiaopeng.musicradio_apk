package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
/* compiled from: StrokeContent.java */
/* renamed from: nv  reason: default package */
/* loaded from: classes3.dex */
public class nv extends nf {
    private final qc b;
    private final String c;
    private final nx<Integer, Integer> d;
    private nx<ColorFilter, ColorFilter> e;

    public nv(f fVar, qc qcVar, qa qaVar) {
        super(fVar, qcVar, qaVar.g().a(), qaVar.h().a(), qaVar.i(), qaVar.c(), qaVar.d(), qaVar.e(), qaVar.f());
        this.b = qcVar;
        this.c = qaVar.a();
        this.d = qaVar.b().a();
        this.d.a(this);
        qcVar.a(this.d);
    }

    @Override // defpackage.nf, defpackage.ni
    public void a(Canvas canvas, Matrix matrix, int i) {
        this.a.setColor(this.d.e().intValue());
        if (this.e != null) {
            this.a.setColorFilter(this.e.e());
        }
        super.a(canvas, matrix, i);
    }

    @Override // defpackage.ng
    public String b() {
        return this.c;
    }

    @Override // defpackage.nf, defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
        super.a((nv) t, (sf<nv>) sfVar);
        if (t == j.b) {
            this.d.a((sf<Integer>) sfVar);
        } else if (t == j.x) {
            if (sfVar == null) {
                this.e = null;
                return;
            }
            this.e = new om(sfVar);
            this.e.a(this);
            this.b.a(this.d);
        }
    }
}
