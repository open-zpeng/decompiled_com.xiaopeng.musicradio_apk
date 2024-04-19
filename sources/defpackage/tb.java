package defpackage;

import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alibaba.mtl.appmonitor.model.b;
import com.alibaba.mtl.appmonitor.model.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: DurationEvent.java */
/* renamed from: tb  reason: default package */
/* loaded from: classes3.dex */
public class tb extends tc {
    private static final Long a = 300000L;
    private b b;
    private MeasureValueSet c;
    private DimensionValueSet d;
    private Map<String, MeasureValue> i;
    private Long j;

    public boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        List<Measure> b = this.b.g().b();
        if (b != null) {
            int size = b.size();
            for (int i = 0; i < size; i++) {
                Measure measure = b.get(i);
                if (measure != null) {
                    double doubleValue = measure.a() != null ? measure.a().doubleValue() : a.longValue();
                    MeasureValue measureValue = this.i.get(measure.b());
                    if (measureValue != null && !measureValue.c() && currentTimeMillis - measureValue.e() > doubleValue) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.i.isEmpty()) {
            this.j = Long.valueOf(currentTimeMillis);
        }
        this.i.put(str, (MeasureValue) tj.a().a(MeasureValue.class, Double.valueOf(currentTimeMillis), Double.valueOf(currentTimeMillis - this.j.longValue())));
    }

    public boolean b(String str) {
        MeasureValue measureValue = this.i.get(str);
        if (measureValue != null) {
            double currentTimeMillis = System.currentTimeMillis();
            uw.a("DurationEvent", "statEvent consumeTime. module:", this.e, " monitorPoint:", this.f, " measureName:", str, " time:", Double.valueOf(currentTimeMillis - measureValue.e()));
            measureValue.b(currentTimeMillis - measureValue.e());
            measureValue.a(true);
            this.c.a(str, measureValue);
            if (this.b.g().a(this.c)) {
                return true;
            }
        }
        return false;
    }

    public void a(DimensionValueSet dimensionValueSet) {
        DimensionValueSet dimensionValueSet2 = this.d;
        if (dimensionValueSet2 == null) {
            this.d = dimensionValueSet;
        } else {
            dimensionValueSet2.a(dimensionValueSet);
        }
    }

    public MeasureValueSet b() {
        return this.c;
    }

    public DimensionValueSet e() {
        return this.d;
    }

    @Override // defpackage.tc, defpackage.tk
    public void d() {
        super.d();
        this.b = null;
        this.j = null;
        for (MeasureValue measureValue : this.i.values()) {
            tj.a().a((tj) measureValue);
        }
        this.i.clear();
        if (this.c != null) {
            tj.a().a((tj) this.c);
            this.c = null;
        }
        if (this.d != null) {
            tj.a().a((tj) this.d);
            this.d = null;
        }
    }

    @Override // defpackage.tc, defpackage.tk
    public void a(Object... objArr) {
        super.a(objArr);
        if (this.i == null) {
            this.i = new HashMap();
        }
        this.b = c.a().a(this.e, this.f);
        if (this.b.f() != null) {
            this.d = (DimensionValueSet) tj.a().a(DimensionValueSet.class, new Object[0]);
            this.b.f().b(this.d);
        }
        this.c = (MeasureValueSet) tj.a().a(MeasureValueSet.class, new Object[0]);
    }
}
