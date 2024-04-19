package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import defpackage.ja;
import defpackage.jc;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoaderManagerImpl.java */
/* renamed from: jb  reason: default package */
/* loaded from: classes3.dex */
public class jb extends ja {
    static boolean a = false;
    private final i b;
    private final c c;

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: jb$a */
    /* loaded from: classes3.dex */
    public static class a<D> extends n<D> implements jc.a<D> {
        private final int e;
        private final Bundle f;
        private final jc<D> g;
        private i h;
        private b<D> i;
        private jc<D> j;

        jc<D> e() {
            return this.g;
        }

        @Override // androidx.lifecycle.LiveData
        protected void b() {
            if (jb.a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.g.a();
        }

        @Override // androidx.lifecycle.LiveData
        protected void c() {
            if (jb.a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.g.e();
        }

        void f() {
            i iVar = this.h;
            b<D> bVar = this.i;
            if (iVar == null || bVar == null) {
                return;
            }
            super.b((o) bVar);
            a(iVar, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void b(o<? super D> oVar) {
            super.b((o) oVar);
            this.h = null;
            this.i = null;
        }

        jc<D> a(boolean z) {
            if (jb.a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.g.c();
            this.g.g();
            b<D> bVar = this.i;
            if (bVar != null) {
                b((o) bVar);
                if (z) {
                    bVar.b();
                }
            }
            this.g.a((jc.a) this);
            if ((bVar != null && !bVar.a()) || z) {
                this.g.i();
                return this.j;
            }
            return this.g;
        }

        @Override // androidx.lifecycle.n, androidx.lifecycle.LiveData
        public void b(D d) {
            super.b((a<D>) d);
            jc<D> jcVar = this.j;
            if (jcVar != null) {
                jcVar.i();
                this.j = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.e);
            sb.append(" : ");
            gl.a(this.g, sb);
            sb.append("}}");
            return sb.toString();
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.e);
            printWriter.print(" mArgs=");
            printWriter.println(this.f);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.g);
            jc<D> jcVar = this.g;
            jcVar.a(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.i != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.i);
                b<D> bVar = this.i;
                bVar.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(e().a((jc<D>) a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: jb$b */
    /* loaded from: classes3.dex */
    public static class b<D> implements o<D> {
        private final jc<D> a;
        private final ja.a<D> b;
        private boolean c;

        @Override // androidx.lifecycle.o
        public void a(D d) {
            if (jb.a) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + this.a.a((jc<D>) d));
            }
            this.b.a(this.a, d);
            this.c = true;
        }

        boolean a() {
            return this.c;
        }

        void b() {
            if (this.c) {
                if (jb.a) {
                    Log.v("LoaderManager", "  Resetting: " + this.a);
                }
                this.b.a(this.a);
            }
        }

        public String toString() {
            return this.b.toString();
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.c);
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: jb$c */
    /* loaded from: classes3.dex */
    static class c extends t {
        private static final u.b a = new u.b() { // from class: jb.c.1
            @Override // androidx.lifecycle.u.b
            public <T extends t> T a(Class<T> cls) {
                return new c();
            }
        };
        private bm<a> b = new bm<>();
        private boolean c = false;

        c() {
        }

        static c a(v vVar) {
            return (c) new u(vVar, a).a(c.class);
        }

        void b() {
            int b = this.b.b();
            for (int i = 0; i < b; i++) {
                this.b.c(i).f();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.t
        public void a() {
            super.a();
            int b = this.b.b();
            for (int i = 0; i < b; i++) {
                this.b.c(i).a(true);
            }
            this.b.c();
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.b.b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.b.b(); i++) {
                    a c = this.b.c(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.b.b(i));
                    printWriter.print(": ");
                    printWriter.println(c.toString());
                    c.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public jb(i iVar, v vVar) {
        this.b = iVar;
        this.c = c.a(vVar);
    }

    @Override // defpackage.ja
    public void a() {
        this.c.b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        gl.a(this.b, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // defpackage.ja
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.c.a(str, fileDescriptor, printWriter, strArr);
    }
}
