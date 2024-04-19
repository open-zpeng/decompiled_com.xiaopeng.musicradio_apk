package defpackage;

import java.math.BigInteger;
/* compiled from: JsonPrimitive.java */
/* renamed from: mz  reason: default package */
/* loaded from: classes3.dex */
public final class mz extends ne {
    private static final Class<?>[] a = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    private Object b;

    public mz(Boolean bool) {
        a(bool);
    }

    public mz(Number number) {
        a(number);
    }

    public mz(String str) {
        a(str);
    }

    private static boolean a(mz mzVar) {
        Object obj = mzVar.b;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    private static boolean b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : a) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ne
    public Number a() {
        Object obj = this.b;
        return obj instanceof String ? new mc((String) obj) : (Number) obj;
    }

    void a(Object obj) {
        if (obj instanceof Character) {
            obj = String.valueOf(((Character) obj).charValue());
        } else {
            ll.a((obj instanceof Number) || b(obj));
        }
        this.b = obj;
    }

    @Override // defpackage.ne
    public String b() {
        return i() ? a().toString() : g() ? h().toString() : (String) this.b;
    }

    @Override // defpackage.ne
    public double c() {
        return i() ? a().doubleValue() : Double.parseDouble(b());
    }

    @Override // defpackage.ne
    public long d() {
        return i() ? a().longValue() : Long.parseLong(b());
    }

    @Override // defpackage.ne
    public int e() {
        return i() ? a().intValue() : Integer.parseInt(b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mz mzVar = (mz) obj;
        if (this.b == null) {
            return mzVar.b == null;
        } else if (a(this) && a(mzVar)) {
            return a().longValue() == mzVar.a().longValue();
        } else if ((this.b instanceof Number) && (mzVar.b instanceof Number)) {
            double doubleValue = a().doubleValue();
            double doubleValue2 = mzVar.a().doubleValue();
            if (doubleValue != doubleValue2) {
                return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
            }
            return true;
        } else {
            return this.b.equals(mzVar.b);
        }
    }

    @Override // defpackage.ne
    public boolean f() {
        return g() ? h().booleanValue() : Boolean.parseBoolean(b());
    }

    public boolean g() {
        return this.b instanceof Boolean;
    }

    @Override // defpackage.ne
    Boolean h() {
        return (Boolean) this.b;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.b == null) {
            return 31;
        }
        if (a(this)) {
            doubleToLongBits = a().longValue();
        } else {
            Object obj = this.b;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(a().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean i() {
        return this.b instanceof Number;
    }

    public boolean j() {
        return this.b instanceof String;
    }
}
