package defpackage;

import android.content.Context;
import com.nforetek.bt.aidl.b;
import com.nforetek.bt.aidl.l;
/* compiled from: AvrcpControl.java */
/* renamed from: aaw  reason: default package */
/* loaded from: classes2.dex */
public class aaw extends aba {
    private aay e;
    private b f = new b.a() { // from class: aaw.1
        @Override // com.nforetek.bt.aidl.b
        public void a() {
            aaw.this.e.a();
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(String str, int i, int i2) {
            aaw.this.e.a(str, i, i2);
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(byte b, byte[] bArr) {
            aaw.this.e.a(b, bArr);
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(byte[] bArr, byte[] bArr2) {
            aaw.this.e.a(bArr, bArr2);
        }

        @Override // com.nforetek.bt.aidl.b
        public void b() {
            aaw.this.e.b();
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(int[] iArr, String[] strArr) {
            aaw.this.e.a(iArr, strArr);
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(long j, long j2, byte b) {
            aaw.this.e.a(j, j2, b);
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(byte b) {
            aaw.this.e.a(b);
        }

        @Override // com.nforetek.bt.aidl.b
        public void b(byte b) {
            aaw.this.e.b(b);
        }

        @Override // com.nforetek.bt.aidl.b
        public void c(byte b) {
            aaw.this.e.c(b);
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(long j) {
            aaw.this.e.a(j);
        }

        @Override // com.nforetek.bt.aidl.b
        public void c() {
            aaw.this.e.c();
        }

        @Override // com.nforetek.bt.aidl.b
        public void d() {
            aaw.this.e.d();
        }

        @Override // com.nforetek.bt.aidl.b
        public void b(long j) {
            aaw.this.e.b(j);
        }

        @Override // com.nforetek.bt.aidl.b
        public void d(byte b) {
            aaw.this.e.d(b);
        }

        @Override // com.nforetek.bt.aidl.b
        public void e(byte b) {
            aaw.this.e.e(b);
        }

        @Override // com.nforetek.bt.aidl.b
        public void b(byte[] bArr, byte[] bArr2) {
            aaw.this.e.b(bArr, bArr2);
        }

        @Override // com.nforetek.bt.aidl.b
        public void e() {
            aaw.this.e.e();
        }

        @Override // com.nforetek.bt.aidl.b
        public void f() {
            aaw.this.e.f();
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(int i, int i2) {
            aaw.this.e.a(i, i2);
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(int i) {
            aaw.this.e.a(i);
        }

        @Override // com.nforetek.bt.aidl.b
        public void f(byte b) {
            aaw.this.e.f(b);
        }

        @Override // com.nforetek.bt.aidl.b
        public void g() {
            aaw.this.e.g();
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(String[] strArr, int i, long j) {
            aaw.this.e.a(strArr, i, j);
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(int i, long j) {
            aaw.this.e.a(i, j);
        }

        @Override // com.nforetek.bt.aidl.b
        public void b(int i, long j) {
            aaw.this.e.b(i, j);
        }

        @Override // com.nforetek.bt.aidl.b
        public void c(long j) {
            aaw.this.e.c(j);
        }

        @Override // com.nforetek.bt.aidl.b
        public void b(int[] iArr, String[] strArr) {
            aaw.this.e.b(iArr, strArr);
        }

        @Override // com.nforetek.bt.aidl.b
        public void h() {
            aaw.this.e.h();
        }

        @Override // com.nforetek.bt.aidl.b
        public void c(int i, long j) {
            aaw.this.e.c(i, j);
        }

        @Override // com.nforetek.bt.aidl.b
        public void i() {
            aaw.this.e.i();
        }

        @Override // com.nforetek.bt.aidl.b
        public void g(byte b) {
            aaw.this.e.g(b);
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(int i, int i2, byte b) {
            aaw.this.e.a(i, i2, b);
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(byte[] bArr) {
            aaw.this.e.a(bArr);
        }

        @Override // com.nforetek.bt.aidl.b
        public void b(byte[] bArr) {
            aaw.this.e.b(bArr);
        }

        @Override // com.nforetek.bt.aidl.b
        public void a(String str, String str2, String str3) {
            aaw.this.e.a(str, str2, str3);
        }
    };

    public aaw(Context context, aay aayVar) {
        this.b = context;
        this.e = aayVar;
    }

    @Override // defpackage.aba
    protected void a(l lVar) {
        try {
            this.a = lVar;
            lVar.a(this.f);
        } catch (Exception e) {
            a("AvrcpControl", e);
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
                return this.a.r();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean a(String str) {
        if (this.a != null) {
            try {
                return this.a.c(str);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public String c() {
        if (this.a != null) {
            try {
                return this.a.s();
            } catch (Exception e) {
                e.printStackTrace();
                return "00:00:00:00:00:00";
            }
        }
        return "00:00:00:00:00:00";
    }

    public boolean d() {
        if (this.a != null) {
            try {
                return this.a.t();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean e() {
        if (this.a != null) {
            try {
                return this.a.v();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean f() {
        if (this.a != null) {
            try {
                return this.a.w();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean g() {
        if (this.a != null) {
            try {
                return this.a.x();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean h() {
        if (this.a != null) {
            try {
                return this.a.H();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean i() {
        if (this.a != null) {
            try {
                return this.a.I();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean a(byte b, long j) {
        if (this.a != null) {
            try {
                return this.a.a(b, j);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean a(byte b) {
        if (this.a != null) {
            try {
                return this.a.b(b);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
