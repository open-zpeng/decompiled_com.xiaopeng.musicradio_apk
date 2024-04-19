package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.nforetek.bt.aidl.c;
import com.nforetek.bt.aidl.l;
/* compiled from: BluetoothControl.java */
/* renamed from: abd  reason: default package */
/* loaded from: classes2.dex */
public class abd extends aba {
    private aaz e;
    private c f = new c.a() { // from class: abd.1
        @Override // com.nforetek.bt.aidl.c
        public void a() {
            Log.d("BluetoothControl", "onBluetoothServiceReady");
            if (abd.this.e != null) {
                abd.this.e.a();
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void a(int i, int i2) {
            Log.d("BluetoothControl", "onAdapterStateChanged newState:" + i2);
            if (abd.this.e != null) {
                abd.this.e.a(i, i2);
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void b(int i, int i2) {
            if (abd.this.e != null) {
                abd.this.e.b(i, i2);
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void b() {
            if (abd.this.e != null) {
                abd.this.e.b();
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void c() {
            if (abd.this.e != null) {
                abd.this.e.c();
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void a(int i, String[] strArr, String[] strArr2, int[] iArr, byte[] bArr) {
            if (abd.this.e != null) {
                abd.this.e.a(i, strArr, strArr2, iArr, bArr);
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void a(String str, String str2, byte b) {
            if (abd.this.e != null) {
                abd.this.e.a(str, str2, b);
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void a(String str, String str2, int i, int i2) {
            if (abd.this.e != null) {
                abd.this.e.a(str, str2, i, i2);
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void a(String str, String str2, int i) {
            if (abd.this.e != null) {
                abd.this.e.a(str, str2, i);
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void a(String str) {
            if (abd.this.e != null) {
                abd.this.e.a(str);
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void b(String str) {
            if (abd.this.e != null) {
                abd.this.e.b(str);
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void c(String str) {
            if (abd.this.e != null) {
                abd.this.e.c(str);
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void a(int i) {
            if (abd.this.e != null) {
                abd.this.e.a(i);
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void a(String str, int i, int i2) {
            if (abd.this.e != null) {
                abd.this.e.a(str, i, i2);
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void b(String str, int i, int i2) {
            if (abd.this.e != null) {
                abd.this.e.b(str, i, i2);
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void c(String str, int i, int i2) {
            if (abd.this.e != null) {
                abd.this.e.c(str, i, i2);
            }
        }

        @Override // com.nforetek.bt.aidl.c
        public void d(String str, int i, int i2) {
            if (abd.this.e != null) {
                abd.this.e.d(str, i, i2);
            }
        }
    };

    public abd(Context context, aaz aazVar) {
        this.b = context;
        this.e = aazVar;
    }

    @Override // defpackage.aba
    protected void a(l lVar) {
        try {
            this.a = lVar;
            Log.d("BluetoothControl", "bluetooth registerCallback " + this.a);
            lVar.a(this.f);
            Log.d("BluetoothControl", "bluetooth nf btService registerCallback ");
        } catch (Exception e) {
            a("BluetoothControl", e);
        }
    }

    @Override // defpackage.aba
    protected void a() {
        try {
            Log.d("BluetoothControl", "release");
            if (this.a != null) {
                this.a.b(this.f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String b() {
        a("BluetoothControl", "getBtRemoteDeviceName");
        if (this.a == null) {
            return "";
        }
        try {
            String c = c();
            return !TextUtils.isEmpty(c) ? this.a.j(c) : "";
        } catch (Exception e) {
            a("BluetoothControl", e);
            return "";
        }
    }

    public String c() {
        return super.b("BluetoothControl");
    }
}
