package defpackage;

import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alibaba.mtl.appmonitor.model.UTDimensionValueSet;
import com.alibaba.mtl.appmonitor.model.b;
import com.alibaba.mtl.appmonitor.model.c;
import com.alibaba.mtl.appmonitor.model.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: EventRepo.java */
/* renamed from: td  reason: default package */
/* loaded from: classes3.dex */
public class td {
    private static td c;
    private AtomicInteger d = new AtomicInteger(0);
    private AtomicInteger e = new AtomicInteger(0);
    private AtomicInteger f = new AtomicInteger(0);
    private Map<UTDimensionValueSet, d> b = new ConcurrentHashMap();
    private Map<String, tb> a = new ConcurrentHashMap();

    public static synchronized td a() {
        td tdVar;
        synchronized (td.class) {
            if (c == null) {
                c = new td();
            }
            tdVar = c;
        }
        return tdVar;
    }

    private td() {
    }

    private UTDimensionValueSet a(int i, Map<String, String> map) {
        UTDimensionValueSet uTDimensionValueSet = (UTDimensionValueSet) tj.a().a(UTDimensionValueSet.class, new Object[0]);
        if (map != null) {
            uTDimensionValueSet.a(map);
        }
        uTDimensionValueSet.a(vn.ACCESS.toString(), uc.e());
        uTDimensionValueSet.a(vn.ACCESS_SUBTYPE.toString(), uc.f());
        uTDimensionValueSet.a(vn.USERID.toString(), uc.g());
        uTDimensionValueSet.a(vn.USERNICK.toString(), uc.h());
        uTDimensionValueSet.a(vn.EVENTID.toString(), String.valueOf(i));
        return uTDimensionValueSet;
    }

    public void a(int i, String str, String str2, String str3, Map<String, String> map) {
        UTDimensionValueSet a = a(i, map);
        ((sz) a(a, str, str2, str3, sz.class)).a();
        if (ud.b()) {
            sz szVar = (sz) tj.a().a(sz.class, Integer.valueOf(i), str, str2, str3);
            szVar.a();
            ub.a(a, szVar);
        }
        a(te.b(i), this.d);
    }

    public void a(int i, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        UTDimensionValueSet a = a(i, map);
        sz szVar = (sz) a(a, str, str2, str3, sz.class);
        szVar.b();
        szVar.a(str4, str5);
        if (ud.b()) {
            sz szVar2 = (sz) tj.a().a(sz.class, Integer.valueOf(i), str, str2, str3);
            szVar2.b();
            szVar2.a(str4, str5);
            ub.a(a, szVar2);
        }
        a(te.b(i), this.d);
    }

    public void a(int i, String str, String str2, String str3, double d, Map<String, String> map) {
        UTDimensionValueSet a = a(i, map);
        ((ta) a(a, str, str2, str3, ta.class)).a(d);
        if (ud.b()) {
            ta taVar = (ta) tj.a().a(ta.class, Integer.valueOf(i), str, str2, str3);
            taVar.a(d);
            ub.a(a, taVar);
        }
        a(te.b(i), this.e);
    }

    public void a(int i, String str, String str2, MeasureValueSet measureValueSet, DimensionValueSet dimensionValueSet, Map<String, String> map) {
        b a = c.a().a(str, str2);
        if (a != null) {
            if (a.f() != null) {
                a.f().b(dimensionValueSet);
            }
            if (a.g() != null) {
                a.g().b(measureValueSet);
            }
            UTDimensionValueSet a2 = a(i, map);
            ((tf) a(a2, str, str2, (String) null, tf.class)).a(dimensionValueSet, measureValueSet);
            if (ud.b()) {
                tf tfVar = (tf) tj.a().a(tf.class, Integer.valueOf(i), str, str2);
                tfVar.a(dimensionValueSet, measureValueSet);
                ub.a(a2, tfVar);
            }
            a(te.b(i), this.f);
            return;
        }
        uw.a("EventRepo", "metric is null");
    }

    public void a(Integer num, String str, String str2, String str3) {
        String a = a(str, str2);
        if (a != null) {
            a(a, num, str, str2, str3);
        }
    }

    public void a(String str, Integer num, String str2, String str3, String str4) {
        tb tbVar;
        b a = c.a().a(str2, str3);
        if (a == null || a.g() == null || a.g().a(str4) == null) {
            return;
        }
        synchronized (tb.class) {
            tbVar = this.a.get(str);
            if (tbVar == null) {
                tbVar = (tb) tj.a().a(tb.class, num, str2, str3);
                this.a.put(str, tbVar);
            }
        }
        tbVar.a(str4);
    }

    public void a(String str, String str2, String str3) {
        String a = a(str, str2);
        if (a != null) {
            a(a, str3, true, (Map<String, String>) null);
        }
    }

    public void a(String str, String str2, boolean z, Map<String, String> map) {
        tb tbVar = this.a.get(str);
        if (tbVar == null || !tbVar.b(str2)) {
            return;
        }
        this.a.remove(str);
        if (z) {
            b(tbVar.e, tbVar.f);
        }
        a(tbVar.h, tbVar.e, tbVar.f, tbVar.b(), tbVar.e(), map);
        tj.a().a((tj) tbVar);
    }

    public void a(String str, Integer num, String str2, String str3, DimensionValueSet dimensionValueSet) {
        tb tbVar;
        synchronized (tb.class) {
            tbVar = this.a.get(str);
            if (tbVar == null) {
                tbVar = (tb) tj.a().a(tb.class, num, str2, str3);
                this.a.put(str, tbVar);
            }
        }
        tbVar.a(dimensionValueSet);
    }

    private String a(String str, String str2) {
        b a = c.a().a(str, str2);
        if (a != null) {
            return a.a();
        }
        return null;
    }

    private void b(String str, String str2) {
        b a = c.a().a(str, str2);
        if (a != null) {
            a.b();
        }
    }

    private tc a(UTDimensionValueSet uTDimensionValueSet, String str, String str2, String str3, Class<? extends tc> cls) {
        Integer c2;
        d dVar;
        if (ua.a(str) && ua.a(str2) && (c2 = uTDimensionValueSet.c()) != null) {
            synchronized (this.b) {
                dVar = this.b.get(uTDimensionValueSet);
                if (dVar == null) {
                    dVar = (d) tj.a().a(d.class, new Object[0]);
                    this.b.put(uTDimensionValueSet, dVar);
                }
            }
            return dVar.a(c2, str, str2, str3, cls);
        }
        return null;
    }

    private void a(te teVar, AtomicInteger atomicInteger) {
        int incrementAndGet = atomicInteger.incrementAndGet();
        uw.a("EventRepo", teVar.toString(), " EVENT size:", String.valueOf(incrementAndGet));
        if (incrementAndGet >= teVar.c()) {
            uw.a("EventRepo", teVar.toString(), " event size exceed trigger count.");
            atomicInteger.set(0);
            b(teVar.a());
        }
    }

    public Map<UTDimensionValueSet, List<tc>> a(int i) {
        HashMap hashMap = new HashMap();
        synchronized (this.b) {
            ArrayList arrayList = new ArrayList(this.b.keySet());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                UTDimensionValueSet uTDimensionValueSet = (UTDimensionValueSet) arrayList.get(i2);
                if (uTDimensionValueSet != null && uTDimensionValueSet.c().intValue() == i) {
                    hashMap.put(uTDimensionValueSet, this.b.get(uTDimensionValueSet).a());
                    this.b.remove(uTDimensionValueSet);
                }
            }
        }
        return hashMap;
    }

    public void b() {
        ArrayList arrayList = new ArrayList(this.a.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            tb tbVar = this.a.get(str);
            if (tbVar != null && tbVar.a()) {
                this.a.remove(str);
            }
        }
    }

    public void b(int i) {
        final Map<UTDimensionValueSet, List<tc>> a = a(i);
        vg.a().a(new Runnable() { // from class: td.1
            @Override // java.lang.Runnable
            public void run() {
                ub.a(a);
            }
        });
    }
}
