package defpackage;
/* compiled from: AudioDefaultStatus.java */
/* renamed from: aeg  reason: default package */
/* loaded from: classes2.dex */
public class aeg implements aej {
    @Override // defpackage.aej
    public boolean e() {
        return true;
    }

    @Override // defpackage.aej
    public boolean f() {
        return true;
    }

    @Override // defpackage.aej
    public void a() {
        aek e = aei.a().e();
        if (e != null && e.d() != null) {
            e.play();
        } else if (aeh.a().d() != null) {
            aeh.a().d().a();
        }
    }

    @Override // defpackage.aej
    public void b() {
        aek e = aei.a().e();
        if (e != null) {
            e.pause();
        }
        ags.a().a(false);
    }

    @Override // defpackage.aej
    public void c() {
        aek e = aei.a().e();
        if (e != null) {
            e.b();
            aeh.a().e().b();
        }
    }

    @Override // defpackage.aej
    public void d() {
        aek e = aei.a().e();
        if (e != null) {
            e.a();
            aeh.a().e().a();
        }
    }
}
