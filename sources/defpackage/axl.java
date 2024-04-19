package defpackage;

import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.utils.ay;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProgramDataMgr.java */
/* renamed from: axl  reason: default package */
/* loaded from: classes2.dex */
public class axl {
    private List<ProgramBean> a = new ArrayList();
    private String b = "begin";
    private final String c = "JourneyMusicInfo";
    private final String d = "readingSpeed";
    private float e = -1.0f;
    private int f = 8;
    private int g = 0;
    private int h = 1;

    /* compiled from: ProgramDataMgr.java */
    /* renamed from: axl$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final axl a = new axl();
    }

    public static axl a() {
        return a.a;
    }

    public List<ProgramBean> b() {
        return this.a;
    }

    public void a(List<ProgramBean> list) {
        if (list != null) {
            this.a = list;
        }
    }

    public String c() {
        return this.b;
    }

    public void a(String str) {
        this.b = str;
    }

    public void d() {
        this.a.clear();
        this.b = "begin";
    }

    public float e() {
        if (this.e == -1.0f) {
            this.e = ay.b("program_speed", 1.0f);
        }
        return this.e;
    }

    public void a(float f) {
        this.e = f;
        ay.a("program_speed", f);
    }
}
