package defpackage;

import com.xiaopeng.speech.annotation.IQueryProcessor;
import com.xiaopeng.speech.common.bean.Value;
import com.xiaopeng.speech.common.util.c;
import defpackage.beu;
/* compiled from: SpeechQuery.java */
/* renamed from: bfd  reason: default package */
/* loaded from: classes2.dex */
public abstract class bfd<T> extends beu.a {
    protected T b;
    private boolean c = false;
    protected IQueryProcessor a = a((beu) this);

    protected void b() {
    }

    protected void c() {
    }

    public void a(boolean z) {
        this.c = z;
        if (this.c) {
            b();
        } else {
            c();
        }
    }

    public boolean a() {
        return this.c;
    }

    @Override // defpackage.beu
    public Value a(String str, String str2) {
        Value value = Value.VOID;
        if (this.a != null) {
            Value b = b(str, str2);
            c.b("SpeechQuery", "dataApi = " + str + ",param data =" + str2 + ", query result value = " + b.toString());
            return b;
        }
        return value;
    }

    private Value b(String str, String str2) {
        try {
            return new Value(this.a.a(str, str2));
        } catch (Exception e) {
            c.a(this, "performCommand error ", e);
            return Value.VOID;
        }
    }

    public String[] d() {
        IQueryProcessor iQueryProcessor = this.a;
        if (iQueryProcessor != null) {
            return iQueryProcessor.a();
        }
        return null;
    }

    private IQueryProcessor a(beu beuVar) {
        String str = beuVar.getClass().getName() + "_Processor";
        try {
            return (IQueryProcessor) Class.forName(str).getConstructor(beuVar.getClass()).newInstance(beuVar);
        } catch (Exception e) {
            e.printStackTrace();
            c.a(this, String.format("bind %s error", str), e);
            return null;
        }
    }
}
