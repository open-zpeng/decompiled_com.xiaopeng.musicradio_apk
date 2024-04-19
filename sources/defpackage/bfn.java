package defpackage;

import defpackage.bfk;
/* compiled from: RecognizeListenerImpl.java */
/* renamed from: bfn  reason: default package */
/* loaded from: classes2.dex */
class bfn extends bfk.a {
    private final bfm a;

    public bfn(bfm bfmVar) {
        this.a = bfmVar;
    }

    @Override // defpackage.bfk
    public void a(String str, boolean z) {
        this.a.a(str, z);
    }

    @Override // defpackage.bfk
    public void a(int i, String str) {
        this.a.a(i, str);
    }

    @Override // defpackage.bfk
    public void a(int i, int i2) {
        this.a.a(i, i2);
    }

    @Override // defpackage.bfk
    public void a(int i, int i2, int i3, String str, byte[] bArr) {
        this.a.a(i, i2, i3, str, bArr);
    }
}
