package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: Gson.java */
/* renamed from: mq  reason: default package */
/* loaded from: classes3.dex */
public final class mq {
    final ms a;
    final my b;
    private final ThreadLocal<Map<mo<?>, a<?>>> c;
    private final Map<mo<?>, nd<?>> d;
    private final List<nc> e;
    private final ma f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: mq$a */
    /* loaded from: classes3.dex */
    public static class a<T> extends nd<T> {
        private nd<T> a;

        a() {
        }

        @Override // defpackage.nd
        public T a(mj mjVar) {
            nd<T> ndVar = this.a;
            if (ndVar != null) {
                return ndVar.a(mjVar);
            }
            throw new IllegalStateException();
        }

        @Override // defpackage.nd
        public void a(mk mkVar, T t) {
            nd<T> ndVar = this.a;
            if (ndVar == null) {
                throw new IllegalStateException();
            }
            ndVar.a(mkVar, t);
        }

        public void a(nd<T> ndVar) {
            if (this.a != null) {
                throw new AssertionError();
            }
            this.a = ndVar;
        }
    }

    public mq() {
        this(lz.a, mi.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, nb.DEFAULT, Collections.emptyList());
    }

    mq(lz lzVar, mp mpVar, Map<Type, mr<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, nb nbVar, List<nc> list) {
        this.c = new ThreadLocal<>();
        this.d = Collections.synchronizedMap(new HashMap());
        this.a = new ms() { // from class: mq.1
        };
        this.b = new my() { // from class: mq.2
        };
        this.f = new ma(map);
        this.g = z;
        this.i = z3;
        this.h = z4;
        this.j = z5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(lx.Q);
        arrayList.add(lt.a);
        arrayList.add(lzVar);
        arrayList.addAll(list);
        arrayList.add(lx.x);
        arrayList.add(lx.m);
        arrayList.add(lx.g);
        arrayList.add(lx.i);
        arrayList.add(lx.k);
        arrayList.add(lx.a(Long.TYPE, Long.class, a(nbVar)));
        arrayList.add(lx.a(Double.TYPE, Double.class, a(z6)));
        arrayList.add(lx.a(Float.TYPE, Float.class, b(z6)));
        arrayList.add(lx.r);
        arrayList.add(lx.t);
        arrayList.add(lx.z);
        arrayList.add(lx.B);
        arrayList.add(lx.a(BigDecimal.class, lx.v));
        arrayList.add(lx.a(BigInteger.class, lx.w));
        arrayList.add(lx.D);
        arrayList.add(lx.F);
        arrayList.add(lx.f164J);
        arrayList.add(lx.O);
        arrayList.add(lx.H);
        arrayList.add(lx.d);
        arrayList.add(lp.a);
        arrayList.add(lx.M);
        arrayList.add(lv.a);
        arrayList.add(lw.a);
        arrayList.add(lx.K);
        arrayList.add(lm.a);
        arrayList.add(lx.R);
        arrayList.add(lx.b);
        arrayList.add(new ln(this.f));
        arrayList.add(new lr(this.f, z2));
        arrayList.add(new ls(this.f, mpVar, lzVar));
        this.e = Collections.unmodifiableList(arrayList);
    }

    private mk a(Writer writer) {
        if (this.i) {
            writer.write(")]}'\n");
        }
        mk mkVar = new mk(writer);
        if (this.j) {
            mkVar.c("  ");
        }
        mkVar.d(this.g);
        return mkVar;
    }

    private nd<Number> a(nb nbVar) {
        return nbVar == nb.DEFAULT ? lx.n : new nd<Number>() { // from class: mq.5
            @Override // defpackage.nd
            public void a(mk mkVar, Number number) {
                if (number == null) {
                    mkVar.f();
                } else {
                    mkVar.b(number.toString());
                }
            }

            @Override // defpackage.nd
            /* renamed from: b */
            public Number a(mj mjVar) {
                if (mjVar.f() == ml.NULL) {
                    mjVar.j();
                    return null;
                }
                return Long.valueOf(mjVar.l());
            }
        };
    }

    private nd<Number> a(boolean z) {
        return z ? lx.p : new nd<Number>() { // from class: mq.3
            @Override // defpackage.nd
            public void a(mk mkVar, Number number) {
                if (number == null) {
                    mkVar.f();
                    return;
                }
                mq.this.a(number.doubleValue());
                mkVar.a(number);
            }

            @Override // defpackage.nd
            /* renamed from: b */
            public Double a(mj mjVar) {
                if (mjVar.f() == ml.NULL) {
                    mjVar.j();
                    return null;
                }
                return Double.valueOf(mjVar.k());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private static void a(Object obj, mj mjVar) {
        if (obj != null) {
            try {
                if (mjVar.f() == ml.END_DOCUMENT) {
                    return;
                }
                throw new mu("JSON document was not fully consumed.");
            } catch (mm e) {
                throw new na(e);
            } catch (IOException e2) {
                throw new mu(e2);
            }
        }
    }

    private nd<Number> b(boolean z) {
        return z ? lx.o : new nd<Number>() { // from class: mq.4
            @Override // defpackage.nd
            public void a(mk mkVar, Number number) {
                if (number == null) {
                    mkVar.f();
                    return;
                }
                mq.this.a(number.floatValue());
                mkVar.a(number);
            }

            @Override // defpackage.nd
            /* renamed from: b */
            public Float a(mj mjVar) {
                if (mjVar.f() == ml.NULL) {
                    mjVar.j();
                    return null;
                }
                return Float.valueOf((float) mjVar.k());
            }
        };
    }

    public <T> T a(Reader reader, Type type) {
        mj mjVar = new mj(reader);
        T t = (T) a(mjVar, type);
        a(t, mjVar);
        return t;
    }

    public <T> T a(String str, Class<T> cls) {
        return (T) mh.a((Class) cls).cast(a(str, (Type) cls));
    }

    public <T> T a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) a((Reader) new StringReader(str), type);
    }

    public <T> T a(mj mjVar, Type type) {
        boolean p = mjVar.p();
        boolean z = true;
        mjVar.a(true);
        try {
            try {
                try {
                    mjVar.f();
                    z = false;
                    T a2 = a((mo) mo.a(type)).a(mjVar);
                    mjVar.a(p);
                    return a2;
                } catch (IOException e) {
                    throw new na(e);
                }
            } catch (EOFException e2) {
                if (z) {
                    mjVar.a(p);
                    return null;
                }
                throw new na(e2);
            } catch (IllegalStateException e3) {
                throw new na(e3);
            }
        } catch (Throwable th) {
            mjVar.a(p);
            throw th;
        }
    }

    public String a(Object obj) {
        return obj == null ? a((ne) mv.a) : a(obj, obj.getClass());
    }

    public String a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String a(ne neVar) {
        StringWriter stringWriter = new StringWriter();
        a(neVar, stringWriter);
        return stringWriter.toString();
    }

    public <T> nd<T> a(Class<T> cls) {
        return a((mo) mo.b(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> nd<T> a(mo<T> moVar) {
        nd<T> ndVar = (nd<T>) this.d.get(moVar);
        if (ndVar != null) {
            return ndVar;
        }
        Map<mo<?>, a<?>> map = this.c.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.c.set(map);
            z = true;
        }
        a<?> aVar = map.get(moVar);
        if (aVar != null) {
            return aVar;
        }
        try {
            a<?> aVar2 = new a<>();
            map.put(moVar, aVar2);
            for (nc ncVar : this.e) {
                nd ndVar2 = (nd<T>) ncVar.a(this, moVar);
                if (ndVar2 != null) {
                    aVar2.a((nd<?>) ndVar2);
                    this.d.put(moVar, ndVar2);
                    return ndVar2;
                }
            }
            throw new IllegalArgumentException("GSON cannot handle " + moVar);
        } finally {
            map.remove(moVar);
            if (z) {
                this.c.remove();
            }
        }
    }

    public <T> nd<T> a(nc ncVar, mo<T> moVar) {
        boolean z = false;
        for (nc ncVar2 : this.e) {
            if (z) {
                nd<T> a2 = ncVar2.a(this, moVar);
                if (a2 != null) {
                    return a2;
                }
            } else if (ncVar2 == ncVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + moVar);
    }

    public void a(Object obj, Type type, Appendable appendable) {
        try {
            a(obj, type, a(mg.a(appendable)));
        } catch (IOException e) {
            throw new mu(e);
        }
    }

    public void a(Object obj, Type type, mk mkVar) {
        nd a2 = a((mo) mo.a(type));
        boolean g = mkVar.g();
        mkVar.b(true);
        boolean h = mkVar.h();
        mkVar.c(this.h);
        boolean i = mkVar.i();
        mkVar.d(this.g);
        try {
            try {
                a2.a(mkVar, obj);
            } catch (IOException e) {
                throw new mu(e);
            }
        } finally {
            mkVar.b(g);
            mkVar.c(h);
            mkVar.d(i);
        }
    }

    public void a(ne neVar, Appendable appendable) {
        try {
            a(neVar, a(mg.a(appendable)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void a(ne neVar, mk mkVar) {
        boolean g = mkVar.g();
        mkVar.b(true);
        boolean h = mkVar.h();
        mkVar.c(this.h);
        boolean i = mkVar.i();
        mkVar.d(this.g);
        try {
            try {
                mg.a(neVar, mkVar);
            } catch (IOException e) {
                throw new mu(e);
            }
        } finally {
            mkVar.b(g);
            mkVar.c(h);
            mkVar.d(i);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.g + "factories:" + this.e + ",instanceCreators:" + this.f + "}";
    }
}
