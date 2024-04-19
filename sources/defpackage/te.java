package defpackage;

import com.alibaba.fastjson.asm.Opcodes;
/* compiled from: EventType.java */
/* renamed from: te  reason: default package */
/* loaded from: classes3.dex */
public enum te {
    ALARM(65501, 30, "alarmData", 5000),
    COUNTER(65502, 30, "counterData", 5000),
    OFFLINE_COUNTER(65133, 30, "counterData", 5000),
    STAT(65503, 30, "statData", 5000);
    
    static String f = "EventType";
    private int e;
    private int h;
    private int k;
    private String t;
    private int i = 25;
    private int j = Opcodes.GETFIELD;
    private boolean m = true;

    te(int i, int i2, String str, int i3) {
        this.e = i;
        this.h = i2;
        this.t = str;
        this.k = i3;
    }

    public int a() {
        return this.e;
    }

    public boolean b() {
        return this.m;
    }

    public void a(boolean z) {
        this.m = z;
    }

    public int c() {
        return this.h;
    }

    public void a(int i) {
        String str = f;
        uw.a(str, "[setTriggerCount]", this.t, i + "");
        this.h = i;
    }

    public static te b(int i) {
        te[] values;
        for (te teVar : values()) {
            if (teVar != null && teVar.a() == i) {
                return teVar;
            }
        }
        return null;
    }

    public String d() {
        return this.t;
    }

    public int e() {
        return this.i;
    }

    public int f() {
        return this.j;
    }

    public void c(int i) {
        this.i = i;
        this.j = i;
    }

    public int g() {
        return this.k;
    }

    public void d(int i) {
        this.k = i;
    }
}
