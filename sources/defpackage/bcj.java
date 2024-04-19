package defpackage;

import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.be;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
/* compiled from: ReportFromStackUtil.java */
/* renamed from: bcj  reason: default package */
/* loaded from: classes2.dex */
public class bcj {
    private Stack<String>[] a = new Stack[2];
    private Queue<String>[] b = new Queue[2];
    private Boolean[] c = new Boolean[2];

    /* compiled from: ReportFromStackUtil.java */
    /* renamed from: bcj$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final bcj a = new bcj();
    }

    public static bcj a() {
        return a.a;
    }

    public void b() {
        String a2 = ay.a("report_key_from0");
        if (be.a((CharSequence) a2)) {
            return;
        }
        a(a2, 0);
    }

    public void c() {
        String a2 = ay.a("report_key_from1");
        if (be.a((CharSequence) a2)) {
            return;
        }
        a(a2, 1);
    }

    private Stack<String> a(int i) {
        Stack<String>[] stackArr = this.a;
        if (i < stackArr.length) {
            if (stackArr[i] == null) {
                stackArr[i] = new Stack<>();
            }
            return this.a[i];
        }
        return null;
    }

    private Queue<String> b(int i) {
        Queue<String>[] queueArr = this.b;
        if (i < queueArr.length) {
            if (queueArr[i] == null) {
                queueArr[i] = new ArrayDeque();
            }
            return this.b[i];
        }
        return null;
    }

    private void a(String str, int i) {
        Stack<String> a2 = a(i);
        if (a2 == null) {
            return;
        }
        a2.clear();
        if (be.a((CharSequence) str)) {
            return;
        }
        a2.add(str);
        a2.add(str);
    }

    public void d() {
        c(0);
    }

    public void e() {
        c(1);
    }

    private void c(int i) {
        Stack<String> a2 = a(i);
        if (a2 == null) {
            return;
        }
        if (a2.size() > 0) {
            a2.pop();
        }
        this.c[i] = true;
    }

    public void f() {
        d(0);
    }

    public void g() {
        d(1);
    }

    private void d(int i) {
        Queue<String> b = b(i);
        if (b == null) {
            return;
        }
        if (b.size() >= 2) {
            b.poll();
        }
        String f = f(i);
        if (!be.a((CharSequence) f)) {
            b.add(f);
        }
        this.c[i] = false;
        ay.a("report_key_from" + i, f);
    }

    public String h() {
        return e(0);
    }

    public String i() {
        return e(1);
    }

    private String e(int i) {
        Queue<String> b = b(i);
        if (b == null) {
            return null;
        }
        if (b.size() < 2) {
            Boolean[] boolArr = this.c;
            if (boolArr[i] == null || !boolArr[i].booleanValue()) {
                return b.peek();
            }
        }
        if (this.c[i].booleanValue()) {
            this.c[i] = false;
        }
        return b.poll();
    }

    private String f(int i) {
        Stack<String> a2 = a(i);
        if (a2 == null || a2.size() == 0) {
            return null;
        }
        return a2.peek();
    }
}
