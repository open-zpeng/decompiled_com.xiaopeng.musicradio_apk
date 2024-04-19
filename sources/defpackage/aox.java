package defpackage;

import com.xiaopeng.musicradio.utils.u;
import defpackage.agh;
/* compiled from: MainPageModel.java */
/* renamed from: aox  reason: default package */
/* loaded from: classes2.dex */
public class aox {
    private String a;
    private agh.b b;

    /* compiled from: MainPageModel.java */
    /* renamed from: aox$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final aox a = new aox();
    }

    public static aox a() {
        return a.a;
    }

    private aox() {
    }

    public void a(String str) {
        a(str, false);
    }

    public void a(String str, boolean z) {
        this.a = str;
        if (z) {
            u.c(new aga(str));
        }
    }

    public agh.b b() {
        return this.b;
    }

    public void a(agh.b bVar) {
        this.b = bVar;
    }
}
