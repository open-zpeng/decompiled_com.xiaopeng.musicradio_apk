package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.util.HashSet;
/* compiled from: UserEvent.java */
/* renamed from: agq  reason: default package */
/* loaded from: classes2.dex */
public class agq {

    /* compiled from: UserEvent.java */
    /* renamed from: agq$a */
    /* loaded from: classes2.dex */
    public static class a {
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$b */
    /* loaded from: classes2.dex */
    public static class b {
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$c */
    /* loaded from: classes2.dex */
    public static class c {
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$d */
    /* loaded from: classes2.dex */
    public static class d {
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$m */
    /* loaded from: classes2.dex */
    public static class m {
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$r */
    /* loaded from: classes2.dex */
    public static class r {
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$s */
    /* loaded from: classes2.dex */
    public static class s {
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$t */
    /* loaded from: classes2.dex */
    public static class t {
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$u */
    /* loaded from: classes2.dex */
    public static class u {
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$v */
    /* loaded from: classes2.dex */
    public static class v {
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$j */
    /* loaded from: classes2.dex */
    public static class j {
        private String a;

        public j(String str) {
            this.a = str;
        }
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$k */
    /* loaded from: classes2.dex */
    public static class k {
        private String a;
        private long b;
        private HashSet<String> c;

        public k() {
        }

        public k(HashSet<String> hashSet) {
            this.c = hashSet;
        }

        public k(String str, long j) {
            this.a = str;
            this.b = j;
        }

        public String a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        public boolean a(String str) {
            HashSet<String> hashSet;
            if (str == null || (hashSet = this.c) == null) {
                return false;
            }
            return hashSet.contains(str);
        }
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$e */
    /* loaded from: classes2.dex */
    public static class e {
        public final String a;
        public final int b;

        public e(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$i */
    /* loaded from: classes2.dex */
    public static class i {
        private MusicInfo a;

        public i(MusicInfo musicInfo) {
            this.a = musicInfo;
        }
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$f */
    /* loaded from: classes2.dex */
    public static class f {
        private long a;
        private boolean b;
        private boolean c;
        private String d;

        public f(long j, boolean z) {
            this(j, z, false, null);
        }

        public f(long j, boolean z, boolean z2, String str) {
            this.a = j;
            this.b = z;
            this.c = z2;
            this.d = str;
        }

        public long a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$l */
    /* loaded from: classes2.dex */
    public static class l {
        private String a;
        private long b;
        private boolean c;
        private MusicInfo d;

        public l(String str, long j, boolean z, MusicInfo musicInfo) {
            this.a = str;
            this.b = j;
            this.c = z;
            this.d = musicInfo;
        }

        public String a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }

        public MusicInfo d() {
            return this.d;
        }
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$o */
    /* loaded from: classes2.dex */
    public static class o {
        private long a;
        private boolean b;

        public o(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        public long a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$p */
    /* loaded from: classes2.dex */
    public static class p {
        private long a;

        public p(long j) {
            this.a = j;
        }

        public long a() {
            return this.a;
        }
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$q */
    /* loaded from: classes2.dex */
    public static class q {
        private long a;
        private int b;
        private boolean c;

        public q(long j, int i, boolean z) {
            this.a = j;
            this.b = i;
            this.c = z;
        }

        public long a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$n */
    /* loaded from: classes2.dex */
    public static class n {
        private long a;
        private boolean b;

        public n(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        public long a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$g */
    /* loaded from: classes2.dex */
    public static class g {
        public final String a;

        public g() {
            this(null);
        }

        public g(String str) {
            this.a = str;
        }
    }

    /* compiled from: UserEvent.java */
    /* renamed from: agq$h */
    /* loaded from: classes2.dex */
    public static class h {
        boolean a;
        boolean b = false;

        public h(boolean z) {
            this.a = z;
        }

        public boolean a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }
}
