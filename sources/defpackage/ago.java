package defpackage;

import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProgramEvent.java */
/* renamed from: ago  reason: default package */
/* loaded from: classes2.dex */
public class ago {

    /* compiled from: ProgramEvent.java */
    /* renamed from: ago$a */
    /* loaded from: classes2.dex */
    public static class a {
        private List<ProgramBean> a;

        public a(List<ProgramBean> list) {
            this.a = list;
        }
    }

    /* compiled from: ProgramEvent.java */
    /* renamed from: ago$c */
    /* loaded from: classes2.dex */
    public static class c {
        private List<ProgramBean> a;

        public c(List<ProgramBean> list) {
            this.a = list;
        }
    }

    /* compiled from: ProgramEvent.java */
    /* renamed from: ago$f */
    /* loaded from: classes2.dex */
    public static class f {
        public RdAlbumBean a;
        private boolean b;
        private boolean c;

        public void a(boolean z) {
            this.c = z;
        }

        public f(RdAlbumBean rdAlbumBean) {
            this.a = rdAlbumBean;
        }

        public void b(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: ProgramEvent.java */
    /* renamed from: ago$b */
    /* loaded from: classes2.dex */
    public static class b {
        private int a;

        public b(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    /* compiled from: ProgramEvent.java */
    /* renamed from: ago$e */
    /* loaded from: classes2.dex */
    public static class e {
        private int a;

        public e(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    /* compiled from: ProgramEvent.java */
    /* renamed from: ago$d */
    /* loaded from: classes2.dex */
    public static class d {
        private int a;
        private int b;

        public d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* compiled from: ProgramEvent.java */
    /* renamed from: ago$g */
    /* loaded from: classes2.dex */
    public static class g {
        private List<RdAlbumBean> a = new ArrayList();

        public g(List<RdAlbumBean> list) {
            this.a.addAll(list);
        }

        public List<RdAlbumBean> a() {
            return this.a;
        }
    }
}
