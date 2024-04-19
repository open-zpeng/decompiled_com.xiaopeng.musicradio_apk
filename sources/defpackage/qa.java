package defpackage;

import android.graphics.Paint;
import com.airbnb.lottie.f;
import java.util.List;
/* compiled from: ShapeStroke.java */
/* renamed from: qa  reason: default package */
/* loaded from: classes3.dex */
public class qa implements pm {
    private final String a;
    private final oy b;
    private final List<oy> c;
    private final ox d;
    private final pa e;
    private final oy f;
    private final a g;
    private final b h;
    private final float i;

    /* compiled from: ShapeStroke.java */
    /* renamed from: qa$a */
    /* loaded from: classes3.dex */
    public enum a {
        Butt,
        Round,
        Unknown;

        public Paint.Cap a() {
            switch (this) {
                case Butt:
                    return Paint.Cap.BUTT;
                case Round:
                    return Paint.Cap.ROUND;
                default:
                    return Paint.Cap.SQUARE;
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    /* renamed from: qa$b */
    /* loaded from: classes3.dex */
    public enum b {
        Miter,
        Round,
        Bevel;

        public Paint.Join a() {
            switch (this) {
                case Bevel:
                    return Paint.Join.BEVEL;
                case Miter:
                    return Paint.Join.MITER;
                case Round:
                    return Paint.Join.ROUND;
                default:
                    return null;
            }
        }
    }

    public qa(String str, oy oyVar, List<oy> list, ox oxVar, pa paVar, oy oyVar2, a aVar, b bVar, float f) {
        this.a = str;
        this.b = oyVar;
        this.c = list;
        this.d = oxVar;
        this.e = paVar;
        this.f = oyVar2;
        this.g = aVar;
        this.h = bVar;
        this.i = f;
    }

    @Override // defpackage.pm
    public ng a(f fVar, qc qcVar) {
        return new nv(fVar, qcVar, this);
    }

    public String a() {
        return this.a;
    }

    public ox b() {
        return this.d;
    }

    public pa c() {
        return this.e;
    }

    public oy d() {
        return this.f;
    }

    public List<oy> e() {
        return this.c;
    }

    public oy f() {
        return this.b;
    }

    public a g() {
        return this.g;
    }

    public b h() {
        return this.h;
    }

    public float i() {
        return this.i;
    }
}
