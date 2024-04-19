package defpackage;

import java.math.BigDecimal;
/* compiled from: LazilyParsedNumber.java */
/* renamed from: mc  reason: default package */
/* loaded from: classes3.dex */
public final class mc extends Number {
    private final String O000000o;

    public mc(String str) {
        this.O000000o = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.O000000o);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.O000000o);
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.O000000o);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.O000000o);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.O000000o).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.O000000o);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.O000000o).longValue();
        }
    }

    public String toString() {
        return this.O000000o;
    }
}
