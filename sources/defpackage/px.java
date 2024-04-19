package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.f;
/* compiled from: ShapeFill.java */
/* renamed from: px  reason: default package */
/* loaded from: classes3.dex */
public class px implements pm {
    private final boolean a;
    private final Path.FillType b;
    private final String c;
    private final ox d;
    private final pa e;

    public px(String str, boolean z, Path.FillType fillType, ox oxVar, pa paVar) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = oxVar;
        this.e = paVar;
    }

    public String a() {
        return this.c;
    }

    public ox b() {
        return this.d;
    }

    public pa c() {
        return this.e;
    }

    public Path.FillType d() {
        return this.b;
    }

    @Override // defpackage.pm
    public ng a(f fVar, qc qcVar) {
        return new nk(fVar, qcVar, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + '}';
    }
}
