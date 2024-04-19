package defpackage;
/* compiled from: BaseRequestAuth.java */
/* renamed from: vp  reason: default package */
/* loaded from: classes3.dex */
public class vp implements vq {
    private String a;
    private String b;
    private boolean c;

    @Override // defpackage.vq
    public String a() {
        return this.a;
    }

    public vp(String str, String str2, boolean z) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public boolean b() {
        return this.c;
    }

    @Override // defpackage.vq
    public String a(String str) {
        if (this.a == null || this.b == null) {
            uw.a("BaseRequestAuth", "There is no appkey,please check it!");
            return null;
        } else if (str == null) {
            return null;
        } else {
            return ux.a(ux.c((str + this.b).getBytes()));
        }
    }
}
