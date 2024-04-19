package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import java.util.Collections;
import java.util.List;
/* compiled from: ShapeLayer.java */
/* renamed from: qh  reason: default package */
/* loaded from: classes3.dex */
public class qh extends qc {
    private final nh e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qh(f fVar, qf qfVar) {
        super(fVar, qfVar);
        this.e = new nh(fVar, this, new py("__container", qfVar.n()));
        this.e.a(Collections.emptyList(), Collections.emptyList());
    }

    @Override // defpackage.qc
    void b(Canvas canvas, Matrix matrix, int i) {
        this.e.a(canvas, matrix, i);
    }

    @Override // defpackage.qc, defpackage.ni
    public void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.e.a(rectF, this.a);
    }

    @Override // defpackage.qc
    protected void b(ot otVar, int i, List<ot> list, ot otVar2) {
        this.e.a(otVar, i, list, otVar2);
    }
}
