package defpackage;

import android.content.Context;
import android.util.Log;
import com.nforetek.bt.aidl.l;
import defpackage.abc;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AbsControl.java */
/* renamed from: aba  reason: default package */
/* loaded from: classes2.dex */
public abstract class aba {
    public l a;
    public Context b;
    List<abc.a> c = new ArrayList();
    public abc d = new abc() { // from class: aba.1
        @Override // defpackage.abc
        public void a(abc.a aVar) {
            synchronized (aba.this.c) {
                aba.this.c.add(aVar);
            }
        }

        private void c() {
            synchronized (aba.this.c) {
                for (abc.a aVar : aba.this.c) {
                    aVar.a();
                }
            }
        }

        @Override // defpackage.abc
        public void a(l lVar) {
            aba.this.a(lVar);
            c();
        }

        @Override // defpackage.abc
        public void a() {
            aba.this.a();
        }
    };

    protected abstract void a();

    protected abstract void a(l lVar);

    public String b(String str) {
        a(str, "getHfpConnectedAddress");
        l lVar = this.a;
        if (lVar == null) {
            return "";
        }
        try {
            return lVar.af();
        } catch (Exception e) {
            a(str, e);
            return "";
        }
    }

    public void a(String str, Exception exc) {
        Log.e(str, "" + exc);
    }

    public void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" pkg:");
        Context context = this.b;
        sb.append(context != null ? context.getPackageName() : "");
        Log.d(str, sb.toString());
        if (this.a == null) {
            Log.d(str, "nForeService == null");
        }
    }
}
