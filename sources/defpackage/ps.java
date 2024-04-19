package defpackage;

import com.airbnb.lottie.c;
import com.airbnb.lottie.f;
/* compiled from: MergePaths.java */
/* renamed from: ps  reason: default package */
/* loaded from: classes3.dex */
public class ps implements pm {
    private final String a;
    private final a b;

    /* compiled from: MergePaths.java */
    /* renamed from: ps$a */
    /* loaded from: classes3.dex */
    public enum a {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        public static a a(int i) {
            switch (i) {
                case 1:
                    return Merge;
                case 2:
                    return Add;
                case 3:
                    return Subtract;
                case 4:
                    return Intersect;
                case 5:
                    return ExcludeIntersections;
                default:
                    return Merge;
            }
        }
    }

    public ps(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public String a() {
        return this.a;
    }

    public a b() {
        return this.b;
    }

    @Override // defpackage.pm
    public ng a(f fVar, qc qcVar) {
        if (!fVar.a()) {
            c.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new np(this);
    }

    public String toString() {
        return "MergePaths{mode=" + this.b + '}';
    }
}
