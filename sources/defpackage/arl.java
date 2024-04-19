package defpackage;

import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.z;
import java.util.List;
/* compiled from: AuditionDataOperation.java */
/* renamed from: arl  reason: default package */
/* loaded from: classes2.dex */
public class arl {
    private List<Long> a;

    /* compiled from: AuditionDataOperation.java */
    /* renamed from: arl$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final arl a = new arl();
    }

    public arl() {
        c();
    }

    private void c() {
        ban.a(new Runnable() { // from class: arl.1
            @Override // java.lang.Runnable
            public void run() {
                arl.this.a = z.b(ay.a("SP_AUDITION_ID_LIST"), Long.class);
            }
        });
    }

    public static arl a() {
        return a.a;
    }

    public List<Long> b() {
        return this.a;
    }

    public void a(List<Long> list) {
        this.a = list;
    }
}
