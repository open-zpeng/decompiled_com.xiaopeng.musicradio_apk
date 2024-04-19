package defpackage;

import java.io.IOException;
import java.io.StringWriter;
/* compiled from: JsonElement.java */
/* renamed from: ne  reason: default package */
/* loaded from: classes3.dex */
public abstract class ne {
    public Number a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    Boolean h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean k() {
        return this instanceof mt;
    }

    public boolean l() {
        return this instanceof mx;
    }

    public boolean m() {
        return this instanceof mz;
    }

    public boolean n() {
        return this instanceof mv;
    }

    public mx o() {
        if (l()) {
            return (mx) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public mt p() {
        if (k()) {
            return (mt) this;
        }
        throw new IllegalStateException("This is not a JSON Array.");
    }

    public mz q() {
        if (m()) {
            return (mz) this;
        }
        throw new IllegalStateException("This is not a JSON Primitive.");
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            mk mkVar = new mk(stringWriter);
            mkVar.b(true);
            mg.a(this, mkVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
