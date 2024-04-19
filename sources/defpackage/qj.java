package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import com.airbnb.lottie.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: TextLayer.java */
/* renamed from: qj  reason: default package */
/* loaded from: classes3.dex */
public class qj extends qc {
    private final char[] e;
    private final RectF f;
    private final Matrix g;
    private final Paint h;
    private final Paint i;
    private final Map<os, List<nh>> j;
    private final ok k;
    private final f l;
    private final d m;
    private nx<Integer, Integer> n;
    private nx<Integer, Integer> o;
    private nx<Float, Float> p;
    private nx<Float, Float> q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qj(f fVar, qf qfVar) {
        super(fVar, qfVar);
        this.e = new char[1];
        this.f = new RectF();
        this.g = new Matrix();
        this.h = new Paint(1) { // from class: qj.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.i = new Paint(1) { // from class: qj.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.j = new HashMap();
        this.l = fVar;
        this.m = qfVar.a();
        this.k = qfVar.s().a();
        this.k.a(this);
        a(this.k);
        ph t = qfVar.t();
        if (t != null && t.a != null) {
            this.n = t.a.a();
            this.n.a(this);
            a(this.n);
        }
        if (t != null && t.b != null) {
            this.o = t.b.a();
            this.o.a(this);
            a(this.o);
        }
        if (t != null && t.c != null) {
            this.p = t.c.a();
            this.p.a(this);
            a(this.p);
        }
        if (t == null || t.d == null) {
            return;
        }
        this.q = t.d.a();
        this.q.a(this);
        a(this.q);
    }

    @Override // defpackage.qc
    void b(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.l.p()) {
            canvas.setMatrix(matrix);
        }
        oq e = this.k.e();
        or orVar = this.m.i().get(e.b);
        if (orVar == null) {
            canvas.restore();
            return;
        }
        nx<Integer, Integer> nxVar = this.n;
        if (nxVar != null) {
            this.h.setColor(nxVar.e().intValue());
        } else {
            this.h.setColor(e.h);
        }
        nx<Integer, Integer> nxVar2 = this.o;
        if (nxVar2 != null) {
            this.i.setColor(nxVar2.e().intValue());
        } else {
            this.i.setColor(e.i);
        }
        int intValue = (this.d.a().e().intValue() * 255) / 100;
        this.h.setAlpha(intValue);
        this.i.setAlpha(intValue);
        nx<Float, Float> nxVar3 = this.p;
        if (nxVar3 != null) {
            this.i.setStrokeWidth(nxVar3.e().floatValue());
        } else {
            this.i.setStrokeWidth((float) (e.j * sc.a() * sc.a(matrix)));
        }
        if (this.l.p()) {
            a(e, matrix, orVar, canvas);
        } else {
            a(e, orVar, matrix, canvas);
        }
        canvas.restore();
    }

    private void a(oq oqVar, Matrix matrix, or orVar, Canvas canvas) {
        float f = ((float) oqVar.c) / 100.0f;
        float a = sc.a(matrix);
        String str = oqVar.a;
        for (int i = 0; i < str.length(); i++) {
            os a2 = this.m.h().a(os.a(str.charAt(i), orVar.a(), orVar.c()));
            if (a2 != null) {
                a(a2, matrix, f, oqVar, canvas);
                float b = ((float) a2.b()) * f * sc.a() * a;
                float f2 = oqVar.e / 10.0f;
                nx<Float, Float> nxVar = this.q;
                if (nxVar != null) {
                    f2 += nxVar.e().floatValue();
                }
                canvas.translate(b + (f2 * a), 0.0f);
            }
        }
    }

    private void a(oq oqVar, or orVar, Matrix matrix, Canvas canvas) {
        float a = sc.a(matrix);
        Typeface a2 = this.l.a(orVar.a(), orVar.c());
        if (a2 == null) {
            return;
        }
        String str = oqVar.a;
        p o = this.l.o();
        if (o != null) {
            str = o.a(str);
        }
        this.h.setTypeface(a2);
        this.h.setTextSize((float) (oqVar.c * sc.a()));
        this.i.setTypeface(this.h.getTypeface());
        this.i.setTextSize(this.h.getTextSize());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            a(charAt, oqVar, canvas);
            char[] cArr = this.e;
            cArr[0] = charAt;
            float measureText = this.h.measureText(cArr, 0, 1);
            float f = oqVar.e / 10.0f;
            nx<Float, Float> nxVar = this.q;
            if (nxVar != null) {
                f += nxVar.e().floatValue();
            }
            canvas.translate(measureText + (f * a), 0.0f);
        }
    }

    private void a(os osVar, Matrix matrix, float f, oq oqVar, Canvas canvas) {
        List<nh> a = a(osVar);
        for (int i = 0; i < a.size(); i++) {
            Path e = a.get(i).e();
            e.computeBounds(this.f, false);
            this.g.set(matrix);
            this.g.preTranslate(0.0f, ((float) (-oqVar.g)) * sc.a());
            this.g.preScale(f, f);
            e.transform(this.g);
            if (oqVar.k) {
                a(e, this.h, canvas);
                a(e, this.i, canvas);
            } else {
                a(e, this.i, canvas);
                a(e, this.h, canvas);
            }
        }
    }

    private void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void a(char c, oq oqVar, Canvas canvas) {
        this.e[0] = c;
        if (oqVar.k) {
            a(this.e, this.h, canvas);
            a(this.e, this.i, canvas);
            return;
        }
        a(this.e, this.i, canvas);
        a(this.e, this.h, canvas);
    }

    private void a(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
    }

    private List<nh> a(os osVar) {
        if (this.j.containsKey(osVar)) {
            return this.j.get(osVar);
        }
        List<py> a = osVar.a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new nh(this.l, this, a.get(i)));
        }
        this.j.put(osVar, arrayList);
        return arrayList;
    }

    @Override // defpackage.qc, defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
        nx<Float, Float> nxVar;
        nx<Float, Float> nxVar2;
        nx<Integer, Integer> nxVar3;
        nx<Integer, Integer> nxVar4;
        super.a((qj) t, (sf<qj>) sfVar);
        if (t == j.a && (nxVar4 = this.n) != null) {
            nxVar4.a((sf<Integer>) sfVar);
        } else if (t == j.b && (nxVar3 = this.o) != null) {
            nxVar3.a((sf<Integer>) sfVar);
        } else if (t == j.k && (nxVar2 = this.p) != null) {
            nxVar2.a((sf<Float>) sfVar);
        } else if (t != j.l || (nxVar = this.q) == null) {
        } else {
            nxVar.a((sf<Float>) sfVar);
        }
    }
}
