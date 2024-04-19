package defpackage;

import com.xiaopeng.lib.utils.DateUtils;
import com.xiaopeng.musicradio.utils.ay;
import java.util.Map;
/* compiled from: StatSessionUtil.java */
/* renamed from: bcl  reason: default package */
/* loaded from: classes2.dex */
public class bcl {
    private String a;
    private int b;

    /* compiled from: StatSessionUtil.java */
    /* renamed from: bcl$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final bcl a = new bcl();
    }

    public static bcl a() {
        return a.a;
    }

    public bcl() {
        d();
    }

    private void d() {
        int i;
        long b = ay.b("SP_STAT_SESSION_TIME", 0L);
        if (b <= 0 || !DateUtils.isToday(b)) {
            i = 1;
        } else {
            i = ay.b("SP_STAT_SESSION_COUNT", 0) + 1;
            this.b = 0;
        }
        this.a = String.format("session%d", Integer.valueOf(i));
        ay.a("SP_STAT_SESSION_COUNT", i);
        ay.a("SP_STAT_SESSION_TIME", System.currentTimeMillis());
    }

    public String b() {
        return this.a;
    }

    public String c() {
        this.b++;
        return String.format("step%d", Integer.valueOf(this.b));
    }

    public void a(Map<String, Object> map) {
        map.put("session_id", b());
        map.put("step_id", c());
    }
}
