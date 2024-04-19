package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: KeyPath.java */
/* renamed from: ot  reason: default package */
/* loaded from: classes3.dex */
public class ot {
    private final List<String> a;
    private ou b;

    public ot(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    private ot(ot otVar) {
        this.a = new ArrayList(otVar.a);
        this.b = otVar.b;
    }

    public ot a(String str) {
        ot otVar = new ot(this);
        otVar.a.add(str);
        return otVar;
    }

    public ot a(ou ouVar) {
        ot otVar = new ot(this);
        otVar.b = ouVar;
        return otVar;
    }

    public ou a() {
        return this.b;
    }

    public boolean a(String str, int i) {
        if (b(str)) {
            return true;
        }
        if (i >= this.a.size()) {
            return false;
        }
        return this.a.get(i).equals(str) || this.a.get(i).equals("**") || this.a.get(i).equals("*");
    }

    public int b(String str, int i) {
        if (b(str)) {
            return 0;
        }
        if (this.a.get(i).equals("**")) {
            return (i != this.a.size() - 1 && this.a.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean c(String str, int i) {
        if (i >= this.a.size()) {
            return false;
        }
        boolean z = i == this.a.size() - 1;
        String str2 = this.a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.a.get(i + 1).equals(str)) {
            return i == this.a.size() + (-2) || (i == this.a.size() + (-3) && b());
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.a.size() - 1) {
                return false;
            }
            return this.a.get(i2).equals(str);
        }
    }

    public boolean d(String str, int i) {
        return str.equals("__container") || i < this.a.size() - 1 || this.a.get(i).equals("**");
    }

    private boolean b(String str) {
        return str.equals("__container");
    }

    private boolean b() {
        List<String> list = this.a;
        return list.get(list.size() - 1).equals("**");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        sb.append(this.b != null);
        sb.append('}');
        return sb.toString();
    }
}
