package defpackage;

import com.airbnb.lottie.f;
import java.util.Arrays;
import java.util.List;
/* compiled from: ShapeGroup.java */
/* renamed from: py  reason: default package */
/* loaded from: classes3.dex */
public class py implements pm {
    private final String a;
    private final List<pm> b;

    public py(String str, List<pm> list) {
        this.a = str;
        this.b = list;
    }

    public String a() {
        return this.a;
    }

    public List<pm> b() {
        return this.b;
    }

    @Override // defpackage.pm
    public ng a(f fVar, qc qcVar) {
        return new nh(fVar, qcVar, this);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
