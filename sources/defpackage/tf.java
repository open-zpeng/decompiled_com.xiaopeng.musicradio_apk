package defpackage;

import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alibaba.mtl.appmonitor.model.b;
import com.alibaba.mtl.appmonitor.model.c;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: StatEvent.java */
/* renamed from: tf  reason: default package */
/* loaded from: classes3.dex */
public class tf extends tc {
    private b a;
    private Map<DimensionValueSet, a> b;

    public synchronized void a(DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        a aVar;
        if (dimensionValueSet == null) {
            DimensionValueSet dimensionValueSet2 = (DimensionValueSet) tj.a().a(DimensionValueSet.class, new Object[0]);
            dimensionValueSet2.a(dimensionValueSet);
            dimensionValueSet = dimensionValueSet2;
        }
        if (this.b.containsKey(dimensionValueSet)) {
            aVar = this.b.get(dimensionValueSet);
        } else {
            DimensionValueSet dimensionValueSet3 = (DimensionValueSet) tj.a().a(DimensionValueSet.class, new Object[0]);
            dimensionValueSet3.a(dimensionValueSet);
            a aVar2 = new a();
            this.b.put(dimensionValueSet3, aVar2);
            aVar = aVar2;
        }
        if (this.a != null ? this.a.a(dimensionValueSet, measureValueSet) : false) {
            aVar.b();
            aVar.a(measureValueSet);
        } else {
            aVar.c();
            if (this.a.h()) {
                aVar.a(measureValueSet);
            }
        }
        uw.a("StatEvent", "entity  count:", Integer.valueOf(aVar.b), " noise:", Integer.valueOf(aVar.c));
    }

    @Override // defpackage.tc
    public synchronized JSONObject c() {
        JSONObject c;
        Set<String> keySet;
        c = super.c();
        try {
            if (this.a != null) {
                c.put("isCommitDetail", String.valueOf(this.a.h()));
            }
            JSONArray jSONArray = (JSONArray) tj.a().a(tm.class, new Object[0]);
            if (this.b != null) {
                for (Map.Entry<DimensionValueSet, a> entry : this.b.entrySet()) {
                    JSONObject jSONObject = (JSONObject) tj.a().a(tn.class, new Object[0]);
                    DimensionValueSet key = entry.getKey();
                    a value = entry.getValue();
                    Object valueOf = Integer.valueOf(value.b);
                    Object valueOf2 = Integer.valueOf(value.c);
                    jSONObject.put("count", valueOf);
                    jSONObject.put("noise", valueOf2);
                    jSONObject.put("dimensions", key != null ? new JSONObject(key.b()) : "");
                    List<Map<String, Map<String, Double>>> a2 = value.a();
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < a2.size(); i++) {
                        JSONObject jSONObject2 = new JSONObject();
                        Map<String, Map<String, Double>> map = a2.get(i);
                        if (map != null && (keySet = map.keySet()) != null) {
                            for (String str : keySet) {
                                if (map.get(str) != null) {
                                    jSONObject2.put(str, new JSONObject(map.get(str)));
                                } else {
                                    jSONObject2.put(str, "");
                                }
                            }
                        }
                        jSONArray2.put(jSONObject2);
                    }
                    jSONObject.put("measures", jSONArray2);
                    jSONArray.put(jSONObject);
                }
            }
            c.put("values", jSONArray);
        } catch (Exception unused) {
        }
        return c;
    }

    @Override // defpackage.tc, defpackage.tk
    public synchronized void d() {
        super.d();
        this.a = null;
        for (DimensionValueSet dimensionValueSet : this.b.keySet()) {
            tj.a().a((tj) dimensionValueSet);
        }
        this.b.clear();
    }

    @Override // defpackage.tc, defpackage.tk
    public void a(Object... objArr) {
        super.a(objArr);
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.a = c.a().a(this.e, this.f);
    }

    /* compiled from: StatEvent.java */
    /* renamed from: tf$a */
    /* loaded from: classes3.dex */
    public class a {
        private int b = 0;
        private int c = 0;
        private List<MeasureValueSet> d = new ArrayList();

        public a() {
        }

        public void a(MeasureValueSet measureValueSet) {
            if (measureValueSet != null) {
                if (tf.this.a != null && tf.this.a.h()) {
                    this.d.add(b(measureValueSet));
                } else if (this.d.isEmpty()) {
                    this.d.add(b(measureValueSet));
                } else {
                    this.d.get(0).a(measureValueSet);
                }
            }
        }

        private MeasureValueSet b(MeasureValueSet measureValueSet) {
            List<Measure> b;
            MeasureValueSet measureValueSet2 = (MeasureValueSet) tj.a().a(MeasureValueSet.class, new Object[0]);
            if (tf.this.a != null && tf.this.a.g() != null && (b = tf.this.a.g().b()) != null) {
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    Measure measure = b.get(i);
                    if (measure != null) {
                        MeasureValue measureValue = (MeasureValue) tj.a().a(MeasureValue.class, new Object[0]);
                        MeasureValue a = measureValueSet.a(measure.b());
                        if (a.b() != null) {
                            measureValue.a(a.b().doubleValue());
                        }
                        measureValue.b(a.e());
                        measureValueSet2.a(measure.b(), measureValue);
                    }
                }
            }
            return measureValueSet2;
        }

        public List<Map<String, Map<String, Double>>> a() {
            Map<String, MeasureValue> b;
            List<MeasureValueSet> list = this.d;
            if (list == null || list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                MeasureValueSet measureValueSet = this.d.get(i);
                if (measureValueSet != null && (b = measureValueSet.b()) != null && !b.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, MeasureValue> entry : b.entrySet()) {
                        HashMap hashMap2 = new HashMap();
                        String key = entry.getKey();
                        MeasureValue value = entry.getValue();
                        hashMap2.put("value", Double.valueOf(value.e()));
                        if (value.b() != null) {
                            hashMap2.put(VuiConstants.EVENT_VALUE_OFFSET, value.b());
                        }
                        hashMap.put(key, hashMap2);
                    }
                    arrayList.add(hashMap);
                }
            }
            return arrayList;
        }

        public void b() {
            this.b++;
        }

        public void c() {
            this.c++;
        }
    }
}
