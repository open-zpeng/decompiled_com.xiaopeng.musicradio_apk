package defpackage;

import java.util.List;
/* compiled from: FontCharacter.java */
/* renamed from: os  reason: default package */
/* loaded from: classes3.dex */
public class os {
    private final List<py> a;
    private final char b;
    private final double c;
    private final double d;
    private final String e;
    private final String f;

    public static int a(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public os(List<py> list, char c, double d, double d2, String str, String str2) {
        this.a = list;
        this.b = c;
        this.c = d;
        this.d = d2;
        this.e = str;
        this.f = str2;
    }

    public List<py> a() {
        return this.a;
    }

    public double b() {
        return this.d;
    }

    public int hashCode() {
        return a(this.b, this.f, this.e);
    }
}
