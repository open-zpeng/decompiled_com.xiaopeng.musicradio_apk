package defpackage;

import android.os.Handler;
import com.xiaopeng.speech.annotation.ICommandProcessor;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.d;
import defpackage.bft;
/* compiled from: SpeechNode.java */
/* renamed from: bfc  reason: default package */
/* loaded from: classes2.dex */
public abstract class bfc<T> extends bft.a {
    protected Handler c;
    private boolean d = false;
    protected d<T> b = new d<>();
    protected ICommandProcessor a = a((bft) this);

    protected void b() {
    }

    protected void c() {
    }

    public void a(boolean z) {
        this.d = z;
        if (this.d) {
            b();
        } else {
            c();
        }
    }

    public boolean a() {
        return this.d;
    }

    public void a(Handler handler) {
        this.c = handler;
    }

    public void a(T t) {
        this.b.a(t);
    }

    @Override // defpackage.bft
    public void a(final String str, final String str2) {
        if (this.a != null) {
            Handler handler = this.c;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bfc.1
                    @Override // java.lang.Runnable
                    public void run() {
                        bfc.this.b(str, str2);
                    }
                });
            } else {
                b(str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        if (!"jarvis.dm.listening".equals(str) && !"jarvis.dm.wait".equals(str)) {
            c.b(this, "performCommand, command = " + str + ", data = " + str2);
        }
        try {
            this.a.a(str, str2);
        } catch (Exception e) {
            c.a(this, "performCommand error ", e);
        }
    }

    public String[] d() {
        ICommandProcessor iCommandProcessor = this.a;
        if (iCommandProcessor != null) {
            return iCommandProcessor.a();
        }
        return null;
    }

    private ICommandProcessor a(bft bftVar) {
        String str = bftVar.getClass().getName() + "_Processor";
        try {
            return (ICommandProcessor) Class.forName(str).getConstructor(bftVar.getClass()).newInstance(bftVar);
        } catch (Exception e) {
            e.printStackTrace();
            c.a(this, String.format("bind %s error", str), e);
            return null;
        }
    }
}
