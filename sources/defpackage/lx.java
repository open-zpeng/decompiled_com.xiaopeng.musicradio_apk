package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
/* compiled from: TypeAdapters.java */
/* renamed from: lx  reason: default package */
/* loaded from: classes3.dex */
public final class lx {
    public static final nd<Class> a = new nd<Class>() { // from class: lx.1
        @Override // defpackage.nd
        public void a(mk mkVar, Class cls) {
            if (cls == null) {
                mkVar.f();
                return;
            }
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Class a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    };
    public static final nc b = a(Class.class, a);
    public static final nd<BitSet> c = new nd<BitSet>() { // from class: lx.4
        @Override // defpackage.nd
        public void a(mk mkVar, BitSet bitSet) {
            if (bitSet == null) {
                mkVar.f();
                return;
            }
            mkVar.b();
            for (int i2 = 0; i2 < bitSet.length(); i2++) {
                mkVar.a(bitSet.get(i2) ? 1L : 0L);
            }
            mkVar.c();
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
            if (r7.m() != 0) goto L16;
         */
        @Override // defpackage.nd
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet a(defpackage.mj r7) {
            /*
                r6 = this;
                ml r0 = r7.f()
                ml r1 = defpackage.ml.NULL
                if (r0 != r1) goto Ld
                r7.j()
                r7 = 0
                return r7
            Ld:
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r7.a()
                ml r1 = r7.f()
                r2 = 0
                r3 = r2
            L1b:
                ml r4 = defpackage.ml.END_ARRAY
                if (r1 == r4) goto L7d
                int[] r4 = defpackage.lx.AnonymousClass18.a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                switch(r4) {
                    case 1: goto L6b;
                    case 2: goto L66;
                    case 3: goto L42;
                    default: goto L2b;
                }
            L2b:
                na r7 = new na
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L42:
                java.lang.String r1 = r7.h()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L4f
                if (r1 == 0) goto L4d
                goto L71
            L4d:
                r5 = r2
                goto L71
            L4f:
                na r7 = new na
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L66:
                boolean r5 = r7.i()
                goto L71
            L6b:
                int r1 = r7.m()
                if (r1 == 0) goto L4d
            L71:
                if (r5 == 0) goto L76
                r0.set(r3)
            L76:
                int r3 = r3 + 1
                ml r1 = r7.f()
                goto L1b
            L7d:
                r7.b()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lx.AnonymousClass4.a(mj):java.util.BitSet");
        }
    };
    public static final nc d = a(BitSet.class, c);
    public static final nd<Boolean> e = new nd<Boolean>() { // from class: lx.15
        @Override // defpackage.nd
        public void a(mk mkVar, Boolean bool) {
            if (bool == null) {
                mkVar.f();
            } else {
                mkVar.a(bool.booleanValue());
            }
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Boolean a(mj mjVar) {
            if (mjVar.f() != ml.NULL) {
                return mjVar.f() == ml.STRING ? Boolean.valueOf(Boolean.parseBoolean(mjVar.h())) : Boolean.valueOf(mjVar.i());
            }
            mjVar.j();
            return null;
        }
    };
    public static final nd<Boolean> f = new nd<Boolean>() { // from class: lx.19
        @Override // defpackage.nd
        public void a(mk mkVar, Boolean bool) {
            mkVar.b(bool == null ? "null" : bool.toString());
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Boolean a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            return Boolean.valueOf(mjVar.h());
        }
    };
    public static final nc g = a(Boolean.TYPE, Boolean.class, e);
    public static final nd<Number> h = new nd<Number>() { // from class: lx.20
        @Override // defpackage.nd
        public void a(mk mkVar, Number number) {
            mkVar.a(number);
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Number a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            try {
                return Byte.valueOf((byte) mjVar.m());
            } catch (NumberFormatException e2) {
                throw new na(e2);
            }
        }
    };
    public static final nc i = a(Byte.TYPE, Byte.class, h);
    public static final nd<Number> j = new nd<Number>() { // from class: lx.21
        @Override // defpackage.nd
        public void a(mk mkVar, Number number) {
            mkVar.a(number);
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Number a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            try {
                return Short.valueOf((short) mjVar.m());
            } catch (NumberFormatException e2) {
                throw new na(e2);
            }
        }
    };
    public static final nc k = a(Short.TYPE, Short.class, j);
    public static final nd<Number> l = new nd<Number>() { // from class: lx.23
        @Override // defpackage.nd
        public void a(mk mkVar, Number number) {
            mkVar.a(number);
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Number a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            try {
                return Integer.valueOf(mjVar.m());
            } catch (NumberFormatException e2) {
                throw new na(e2);
            }
        }
    };
    public static final nc m = a(Integer.TYPE, Integer.class, l);
    public static final nd<Number> n = new nd<Number>() { // from class: lx.24
        @Override // defpackage.nd
        public void a(mk mkVar, Number number) {
            mkVar.a(number);
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Number a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            try {
                return Long.valueOf(mjVar.l());
            } catch (NumberFormatException e2) {
                throw new na(e2);
            }
        }
    };
    public static final nd<Number> o = new nd<Number>() { // from class: lx.25
        @Override // defpackage.nd
        public void a(mk mkVar, Number number) {
            mkVar.a(number);
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Number a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            return Float.valueOf((float) mjVar.k());
        }
    };
    public static final nd<Number> p = new nd<Number>() { // from class: lx.12
        @Override // defpackage.nd
        public void a(mk mkVar, Number number) {
            mkVar.a(number);
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Number a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            return Double.valueOf(mjVar.k());
        }
    };
    public static final nd<Number> q = new nd<Number>() { // from class: lx.22
        @Override // defpackage.nd
        public void a(mk mkVar, Number number) {
            mkVar.a(number);
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Number a(mj mjVar) {
            ml f2 = mjVar.f();
            int i2 = AnonymousClass18.a[f2.ordinal()];
            if (i2 != 1) {
                if (i2 == 4) {
                    mjVar.j();
                    return null;
                }
                throw new na("Expecting number, got: " + f2);
            }
            return new mc(mjVar.h());
        }
    };
    public static final nc r = a(Number.class, q);
    public static final nd<Character> s = new nd<Character>() { // from class: lx.26
        @Override // defpackage.nd
        public void a(mk mkVar, Character ch) {
            mkVar.b(ch == null ? null : String.valueOf(ch));
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Character a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            String h2 = mjVar.h();
            if (h2.length() == 1) {
                return Character.valueOf(h2.charAt(0));
            }
            throw new na("Expecting character, got: " + h2);
        }
    };
    public static final nc t = a(Character.TYPE, Character.class, s);
    public static final nd<String> u = new nd<String>() { // from class: lx.27
        @Override // defpackage.nd
        public void a(mk mkVar, String str) {
            mkVar.b(str);
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public String a(mj mjVar) {
            ml f2 = mjVar.f();
            if (f2 != ml.NULL) {
                return f2 == ml.BOOLEAN ? Boolean.toString(mjVar.i()) : mjVar.h();
            }
            mjVar.j();
            return null;
        }
    };
    public static final nd<BigDecimal> v = new nd<BigDecimal>() { // from class: lx.28
        @Override // defpackage.nd
        public void a(mk mkVar, BigDecimal bigDecimal) {
            mkVar.a(bigDecimal);
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public BigDecimal a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            try {
                return new BigDecimal(mjVar.h());
            } catch (NumberFormatException e2) {
                throw new na(e2);
            }
        }
    };
    public static final nd<BigInteger> w = new nd<BigInteger>() { // from class: lx.29
        @Override // defpackage.nd
        public void a(mk mkVar, BigInteger bigInteger) {
            mkVar.a(bigInteger);
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public BigInteger a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            try {
                return new BigInteger(mjVar.h());
            } catch (NumberFormatException e2) {
                throw new na(e2);
            }
        }
    };
    public static final nc x = a(String.class, u);
    public static final nd<StringBuilder> y = new nd<StringBuilder>() { // from class: lx.30
        @Override // defpackage.nd
        public void a(mk mkVar, StringBuilder sb) {
            mkVar.b(sb == null ? null : sb.toString());
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public StringBuilder a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            return new StringBuilder(mjVar.h());
        }
    };
    public static final nc z = a(StringBuilder.class, y);
    public static final nd<StringBuffer> A = new nd<StringBuffer>() { // from class: lx.31
        @Override // defpackage.nd
        public void a(mk mkVar, StringBuffer stringBuffer) {
            mkVar.b(stringBuffer == null ? null : stringBuffer.toString());
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public StringBuffer a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            return new StringBuffer(mjVar.h());
        }
    };
    public static final nc B = a(StringBuffer.class, A);
    public static final nd<URL> C = new nd<URL>() { // from class: lx.2
        @Override // defpackage.nd
        public void a(mk mkVar, URL url) {
            mkVar.b(url == null ? null : url.toExternalForm());
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public URL a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            String h2 = mjVar.h();
            if ("null".equals(h2)) {
                return null;
            }
            return new URL(h2);
        }
    };
    public static final nc D = a(URL.class, C);
    public static final nd<URI> E = new nd<URI>() { // from class: lx.3
        @Override // defpackage.nd
        public void a(mk mkVar, URI uri) {
            mkVar.b(uri == null ? null : uri.toASCIIString());
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public URI a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            try {
                String h2 = mjVar.h();
                if ("null".equals(h2)) {
                    return null;
                }
                return new URI(h2);
            } catch (URISyntaxException e2) {
                throw new mu(e2);
            }
        }
    };
    public static final nc F = a(URI.class, E);
    public static final nd<InetAddress> G = new nd<InetAddress>() { // from class: lx.5
        @Override // defpackage.nd
        public void a(mk mkVar, InetAddress inetAddress) {
            mkVar.b(inetAddress == null ? null : inetAddress.getHostAddress());
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public InetAddress a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            return InetAddress.getByName(mjVar.h());
        }
    };
    public static final nc H = b(InetAddress.class, G);
    public static final nd<UUID> I = new nd<UUID>() { // from class: lx.6
        @Override // defpackage.nd
        public void a(mk mkVar, UUID uuid) {
            mkVar.b(uuid == null ? null : uuid.toString());
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public UUID a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            return UUID.fromString(mjVar.h());
        }
    };

    /* renamed from: J  reason: collision with root package name */
    public static final nc f164J = a(UUID.class, I);
    public static final nc K = new nc() { // from class: lx.7
        @Override // defpackage.nc
        public <T> nd<T> a(mq mqVar, mo<T> moVar) {
            if (moVar.a() != Timestamp.class) {
                return null;
            }
            final nd<T> a2 = mqVar.a((Class) Date.class);
            return (nd<T>) new nd<Timestamp>() { // from class: lx.7.1
                @Override // defpackage.nd
                public void a(mk mkVar, Timestamp timestamp) {
                    a2.a(mkVar, timestamp);
                }

                @Override // defpackage.nd
                /* renamed from: b */
                public Timestamp a(mj mjVar) {
                    Date date = (Date) a2.a(mjVar);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }
            };
        }
    };
    public static final nd<Calendar> L = new nd<Calendar>() { // from class: lx.8
        @Override // defpackage.nd
        public void a(mk mkVar, Calendar calendar) {
            if (calendar == null) {
                mkVar.f();
                return;
            }
            mkVar.d();
            mkVar.a("year");
            mkVar.a(calendar.get(1));
            mkVar.a("month");
            mkVar.a(calendar.get(2));
            mkVar.a("dayOfMonth");
            mkVar.a(calendar.get(5));
            mkVar.a("hourOfDay");
            mkVar.a(calendar.get(11));
            mkVar.a("minute");
            mkVar.a(calendar.get(12));
            mkVar.a("second");
            mkVar.a(calendar.get(13));
            mkVar.e();
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Calendar a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            mjVar.c();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (mjVar.f() != ml.END_OBJECT) {
                String g2 = mjVar.g();
                int m2 = mjVar.m();
                if ("year".equals(g2)) {
                    i2 = m2;
                } else if ("month".equals(g2)) {
                    i3 = m2;
                } else if ("dayOfMonth".equals(g2)) {
                    i4 = m2;
                } else if ("hourOfDay".equals(g2)) {
                    i5 = m2;
                } else if ("minute".equals(g2)) {
                    i6 = m2;
                } else if ("second".equals(g2)) {
                    i7 = m2;
                }
            }
            mjVar.d();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }
    };
    public static final nc M = b(Calendar.class, GregorianCalendar.class, L);
    public static final nd<Locale> N = new nd<Locale>() { // from class: lx.9
        @Override // defpackage.nd
        public void a(mk mkVar, Locale locale) {
            mkVar.b(locale == null ? null : locale.toString());
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Locale a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(mjVar.h(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }
    };
    public static final nc O = a(Locale.class, N);
    public static final nd<ne> P = new nd<ne>() { // from class: lx.10
        @Override // defpackage.nd
        public void a(mk mkVar, ne neVar) {
            if (neVar == null || neVar.n()) {
                mkVar.f();
            } else if (neVar.m()) {
                mz q2 = neVar.q();
                if (q2.i()) {
                    mkVar.a(q2.a());
                } else if (q2.g()) {
                    mkVar.a(q2.f());
                } else {
                    mkVar.b(q2.b());
                }
            } else if (neVar.k()) {
                mkVar.b();
                Iterator<ne> it = neVar.p().iterator();
                while (it.hasNext()) {
                    a(mkVar, it.next());
                }
                mkVar.c();
            } else if (!neVar.l()) {
                throw new IllegalArgumentException("Couldn't write " + neVar.getClass());
            } else {
                mkVar.d();
                for (Map.Entry<String, ne> entry : neVar.o().g()) {
                    mkVar.a(entry.getKey());
                    a(mkVar, entry.getValue());
                }
                mkVar.e();
            }
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public ne a(mj mjVar) {
            switch (AnonymousClass18.a[mjVar.f().ordinal()]) {
                case 1:
                    return new mz(new mc(mjVar.h()));
                case 2:
                    return new mz(Boolean.valueOf(mjVar.i()));
                case 3:
                    return new mz(mjVar.h());
                case 4:
                    mjVar.j();
                    return mv.a;
                case 5:
                    mt mtVar = new mt();
                    mjVar.a();
                    while (mjVar.e()) {
                        mtVar.a(a(mjVar));
                    }
                    mjVar.b();
                    return mtVar;
                case 6:
                    mx mxVar = new mx();
                    mjVar.c();
                    while (mjVar.e()) {
                        mxVar.a(mjVar.g(), a(mjVar));
                    }
                    mjVar.d();
                    return mxVar;
                default:
                    throw new IllegalArgumentException();
            }
        }
    };
    public static final nc Q = b(ne.class, P);
    public static final nc R = a();

    /* compiled from: TypeAdapters.java */
    /* renamed from: lx$a */
    /* loaded from: classes3.dex */
    private static final class a<T extends Enum<T>> extends nd<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        public a(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    lh lhVar = (lh) cls.getField(name).getAnnotation(lh.class);
                    name = lhVar != null ? lhVar.a() : name;
                    this.a.put(name, t);
                    this.b.put(t, name);
                }
            } catch (NoSuchFieldException unused) {
                throw new AssertionError();
            }
        }

        public void a(mk mkVar, T t) {
            mkVar.b(t == null ? null : this.b.get(t));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.nd
        public /* bridge */ /* synthetic */ void a(mk mkVar, Object obj) {
            a(mkVar, (mk) ((Enum) obj));
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public T a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            return this.a.get(mjVar.h());
        }
    }

    public static nc a() {
        return new nc() { // from class: lx.11
            @Override // defpackage.nc
            public <T> nd<T> a(mq mqVar, mo<T> moVar) {
                Class a2 = moVar.a();
                if (!Enum.class.isAssignableFrom(a2) || a2 == Enum.class) {
                    return null;
                }
                if (!a2.isEnum()) {
                    a2 = (Class<? super Object>) a2.getSuperclass();
                }
                return new a(a2);
            }
        };
    }

    public static <TT> nc a(final Class<TT> cls, final Class<TT> cls2, final nd<? super TT> ndVar) {
        return new nc() { // from class: lx.14
            @Override // defpackage.nc
            public <T> nd<T> a(mq mqVar, mo<T> moVar) {
                Class<? super T> a2 = moVar.a();
                if (a2 == cls || a2 == cls2) {
                    return ndVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + ndVar + "]";
            }
        };
    }

    public static <TT> nc a(final Class<TT> cls, final nd<TT> ndVar) {
        return new nc() { // from class: lx.13
            @Override // defpackage.nc
            public <T> nd<T> a(mq mqVar, mo<T> moVar) {
                if (moVar.a() == cls) {
                    return ndVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + ndVar + "]";
            }
        };
    }

    public static <TT> nc b(final Class<TT> cls, final Class<? extends TT> cls2, final nd<? super TT> ndVar) {
        return new nc() { // from class: lx.16
            @Override // defpackage.nc
            public <T> nd<T> a(mq mqVar, mo<T> moVar) {
                Class<? super T> a2 = moVar.a();
                if (a2 == cls || a2 == cls2) {
                    return ndVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + ndVar + "]";
            }
        };
    }

    public static <TT> nc b(final Class<TT> cls, final nd<TT> ndVar) {
        return new nc() { // from class: lx.17
            @Override // defpackage.nc
            public <T> nd<T> a(mq mqVar, mo<T> moVar) {
                if (cls.isAssignableFrom(moVar.a())) {
                    return ndVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + ndVar + "]";
            }
        };
    }
}
