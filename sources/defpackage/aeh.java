package defpackage;
/* compiled from: AudioManagerModel.java */
/* renamed from: aeh  reason: default package */
/* loaded from: classes2.dex */
public class aeh {
    private aej a;
    private b b;
    private a c;

    /* compiled from: AudioManagerModel.java */
    /* renamed from: aeh$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: AudioManagerModel.java */
    /* renamed from: aeh$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AudioManagerModel.java */
    /* renamed from: aeh$c */
    /* loaded from: classes2.dex */
    public static class c {
        static final aeh a = new aeh();
    }

    public static aeh a() {
        return c.a;
    }

    public aeh() {
        b();
    }

    public void b() {
        this.a = new aeg();
    }

    public aej c() {
        return this.a;
    }

    public void a(b bVar) {
        this.b = bVar;
    }

    public b d() {
        return this.b;
    }

    public void a(a aVar) {
        this.c = aVar;
    }

    public a e() {
        return this.c;
    }
}
