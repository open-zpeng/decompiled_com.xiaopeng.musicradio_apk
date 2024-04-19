package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: MapTypeAdapterFactory.java */
/* renamed from: lr  reason: default package */
/* loaded from: classes3.dex */
public final class lr implements nc {
    private final ma a;
    private final boolean b;

    /* compiled from: MapTypeAdapterFactory.java */
    /* renamed from: lr$a */
    /* loaded from: classes3.dex */
    private final class a<K, V> extends nd<Map<K, V>> {
        private final nd<K> b;
        private final nd<V> c;
        private final md<? extends Map<K, V>> d;

        public a(mq mqVar, Type type, nd<K> ndVar, Type type2, nd<V> ndVar2, md<? extends Map<K, V>> mdVar) {
            this.b = new lu(mqVar, ndVar, type);
            this.c = new lu(mqVar, ndVar2, type2);
            this.d = mdVar;
        }

        private String a(ne neVar) {
            if (!neVar.m()) {
                if (neVar.n()) {
                    return "null";
                }
                throw new AssertionError();
            }
            mz q = neVar.q();
            if (q.i()) {
                return String.valueOf(q.a());
            }
            if (q.g()) {
                return Boolean.toString(q.f());
            }
            if (q.j()) {
                return q.b();
            }
            throw new AssertionError();
        }

        @Override // defpackage.nd
        public /* bridge */ /* synthetic */ void a(mk mkVar, Object obj) {
            a(mkVar, (Map) ((Map) obj));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void a(mk mkVar, Map<K, V> map) {
            if (map == null) {
                mkVar.f();
            } else if (!lr.this.b) {
                mkVar.d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    mkVar.a(String.valueOf(entry.getKey()));
                    this.c.a(mkVar, entry.getValue());
                }
                mkVar.e();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    ne a = this.b.a((nd<K>) entry2.getKey());
                    arrayList.add(a);
                    arrayList2.add(entry2.getValue());
                    z |= a.k() || a.l();
                }
                if (!z) {
                    mkVar.d();
                    while (i < arrayList.size()) {
                        mkVar.a(a((ne) arrayList.get(i)));
                        this.c.a(mkVar, arrayList2.get(i));
                        i++;
                    }
                    mkVar.e();
                    return;
                }
                mkVar.b();
                while (i < arrayList.size()) {
                    mkVar.b();
                    mg.a((ne) arrayList.get(i), mkVar);
                    this.c.a(mkVar, arrayList2.get(i));
                    mkVar.c();
                    i++;
                }
                mkVar.c();
            }
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Map<K, V> a(mj mjVar) {
            ml f = mjVar.f();
            if (f == ml.NULL) {
                mjVar.j();
                return null;
            }
            Map<K, V> a = this.d.a();
            if (f == ml.BEGIN_ARRAY) {
                mjVar.a();
                while (mjVar.e()) {
                    mjVar.a();
                    K a2 = this.b.a(mjVar);
                    if (a.put(a2, this.c.a(mjVar)) != null) {
                        throw new na("duplicate key: " + a2);
                    }
                    mjVar.b();
                }
                mjVar.b();
            } else {
                mjVar.c();
                while (mjVar.e()) {
                    mb.a.a(mjVar);
                    K a3 = this.b.a(mjVar);
                    if (a.put(a3, this.c.a(mjVar)) != null) {
                        throw new na("duplicate key: " + a3);
                    }
                }
                mjVar.d();
            }
            return a;
        }
    }

    public lr(ma maVar, boolean z) {
        this.a = maVar;
        this.b = z;
    }

    private nd<?> a(mq mqVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? lx.f : mqVar.a((mo) mo.a(type));
    }

    @Override // defpackage.nc
    public <T> nd<T> a(mq mqVar, mo<T> moVar) {
        Type b = moVar.b();
        if (Map.class.isAssignableFrom(moVar.a())) {
            Type[] b2 = ly.b(b, ly.e(b));
            return new a(mqVar, b2[0], a(mqVar, b2[0]), b2[1], mqVar.a((mo) mo.a(b2[1])), this.a.a(moVar));
        }
        return null;
    }
}
