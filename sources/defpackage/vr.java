package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
/* compiled from: SecurityRequestAuth.java */
/* renamed from: vr  reason: default package */
/* loaded from: classes3.dex */
public class vr implements vq {
    private String a;
    private String b;
    private Object c = null;
    private Object d = null;
    private Class e = null;
    private Field f = null;
    private Field g = null;
    private Field h = null;
    private Method i = null;
    private int j = 1;
    private boolean k = false;

    @Override // defpackage.vq
    public String a() {
        return this.a;
    }

    public vr(String str, String str2) {
        this.a = null;
        this.a = str;
        this.b = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[Catch: Throwable -> 0x00c9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:39:0x00d1, B:15:0x0041, B:17:0x004a, B:23:0x0084, B:35:0x00ad, B:28:0x009b, B:21:0x007a), top: B:49:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void b() {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr.b():void");
    }

    @Override // defpackage.vq
    public String a(String str) {
        Class cls;
        if (!this.k) {
            b();
        }
        if (this.a == null) {
            uw.a("SecurityRequestAuth", "There is no appkey,please check it!");
            return null;
        } else if (str == null) {
            return null;
        } else {
            if (this.c != null && (cls = this.e) != null && this.f != null && this.g != null && this.h != null && this.i != null && this.d != null) {
                try {
                    Object newInstance = cls.newInstance();
                    this.f.set(newInstance, this.a);
                    ((Map) this.g.get(newInstance)).put("INPUT", str);
                    this.h.set(newInstance, Integer.valueOf(this.j));
                    return (String) this.i.invoke(this.d, newInstance, this.b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }
}
