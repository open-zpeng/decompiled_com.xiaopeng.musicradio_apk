package defpackage;

import android.content.Context;
import com.nforetek.bt.aidl.NfHfpClientCall;
import com.nforetek.bt.aidl.e;
import com.nforetek.bt.aidl.l;
import java.util.Collections;
import java.util.List;
/* compiled from: PhoneControl.java */
/* renamed from: abe  reason: default package */
/* loaded from: classes2.dex */
public class abe extends aba {
    private abb e;
    private e f = new e.a() { // from class: abe.1
        @Override // com.nforetek.bt.aidl.e
        public void a() {
            if (abe.this.e != null) {
                abe.this.e.a();
            }
        }

        @Override // com.nforetek.bt.aidl.e
        public void a(String str, int i, int i2) {
            if (abe.this.e != null) {
                abe.this.e.a(str, i, i2);
            }
        }

        @Override // com.nforetek.bt.aidl.e
        public void b(String str, int i, int i2) {
            if (abe.this.e != null) {
                abe.this.e.b(str, i, i2);
            }
        }

        @Override // com.nforetek.bt.aidl.e
        public void a(String str, boolean z) {
            if (abe.this.e != null) {
                abe.this.e.a(str, z);
            }
        }

        @Override // com.nforetek.bt.aidl.e
        public void a(String str, int i) {
            if (abe.this.e != null) {
                abe.this.e.a(str, i);
            }
        }

        @Override // com.nforetek.bt.aidl.e
        public void b(String str, boolean z) {
            if (abe.this.e != null) {
                abe.this.e.b(str, z);
            }
        }

        @Override // com.nforetek.bt.aidl.e
        public void c(String str, boolean z) {
            if (abe.this.e != null) {
                abe.this.e.c(str, z);
            }
        }

        @Override // com.nforetek.bt.aidl.e
        public void a(String str, int i, int i2, int i3) {
            if (abe.this.e != null) {
                abe.this.e.a(str, i, i2, i3);
            }
        }

        @Override // com.nforetek.bt.aidl.e
        public void b(String str, int i, int i2, int i3) {
            if (abe.this.e != null) {
                abe.this.e.b(str, i, i2, i3);
            }
        }

        @Override // com.nforetek.bt.aidl.e
        public void a(String str, NfHfpClientCall nfHfpClientCall) {
            if (abe.this.e != null) {
                abe.this.e.a(str, nfHfpClientCall.a(), nfHfpClientCall.b(), nfHfpClientCall.c(), nfHfpClientCall.d(), nfHfpClientCall.e());
            }
        }

        @Override // com.nforetek.bt.aidl.e
        public void a(String str, String str2, String str3, boolean z) {
            if (abe.this.e != null) {
                abe.this.e.a(str, str2, str3, z);
            }
        }
    };

    public abe(Context context, abb abbVar) {
        this.b = context;
        this.e = abbVar;
    }

    @Override // defpackage.aba
    protected void a(l lVar) {
        try {
            this.a = lVar;
            lVar.a(this.f);
        } catch (Exception e) {
            a("PhoneControl", e);
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
        a("PhoneControl", "isHfpConnected");
        if (this.a == null) {
            return false;
        }
        try {
            return this.a.ae();
        } catch (Exception e) {
            a("PhoneControl", e);
            return false;
        }
    }

    public List<NfHfpClientCall> c() {
        a("PhoneControl", "getCallList");
        if (this.a != null) {
            try {
                return this.a.ai();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Collections.emptyList();
    }
}
