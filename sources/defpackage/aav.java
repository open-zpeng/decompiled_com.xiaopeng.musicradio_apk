package defpackage;

import android.content.Context;
import com.nforetek.bt.aidl.a;
import com.nforetek.bt.aidl.l;
/* compiled from: A2dpControl.java */
/* renamed from: aav  reason: default package */
/* loaded from: classes2.dex */
public class aav extends aba {
    private aax e;
    private a f = new a.AbstractBinderC0107a() { // from class: aav.1
        @Override // com.nforetek.bt.aidl.a
        public void a() {
            aav.this.e.a();
        }

        @Override // com.nforetek.bt.aidl.a
        public void a(String str, int i, int i2) {
            aav.this.e.a(str, i, i2);
        }
    };

    public aav(Context context, aax aaxVar) {
        this.b = context;
        this.e = aaxVar;
    }

    @Override // defpackage.aba
    protected void a(l lVar) {
        try {
            this.a = lVar;
            lVar.a(this.f);
        } catch (Exception e) {
            a("A2dpControl", e);
        }
    }

    @Override // defpackage.aba
    protected void a() {
        try {
            if (this.a != null) {
                this.a.b(this.f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean b() {
        if (this.a != null) {
            try {
                return this.a.l();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public int a(String str) {
        if (this.a != null) {
            try {
                return this.a.k();
            } catch (Exception e) {
                e.printStackTrace();
                return 100;
            }
        }
        return 100;
    }

    public String c() {
        if (this.a != null) {
            try {
                return this.a.m();
            } catch (Exception e) {
                e.printStackTrace();
                return "00:00:00:00:00:00";
            }
        }
        return "00:00:00:00:00:00";
    }

    public boolean a(int i) {
        if (this.a != null) {
            try {
                return this.a.a(i);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
