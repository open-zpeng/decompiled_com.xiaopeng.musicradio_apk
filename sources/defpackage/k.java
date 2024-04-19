package defpackage;

import android.content.Context;
import android.support.rastermill.FrameSequence;
/* compiled from: AbsLoader.java */
/* renamed from: k  reason: default package */
/* loaded from: classes3.dex */
public abstract class k implements o {
    protected Context a;
    protected String b;

    @Override // defpackage.o
    public boolean b() {
        return false;
    }

    @Override // defpackage.o
    public void d() {
    }

    public abstract FrameSequence e();

    public k(Context context) {
        this.a = context;
    }

    @Override // defpackage.o
    public String a() {
        return this.b;
    }

    @Override // defpackage.o
    public FrameSequence c() {
        if (g()) {
            FrameSequence e = e();
            if (e != null) {
                e.addFrameSequenceKey(a());
            }
            return e;
        }
        return null;
    }
}
