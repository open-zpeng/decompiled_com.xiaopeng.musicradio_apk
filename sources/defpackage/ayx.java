package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: BaseSearchItem.java */
/* renamed from: ayx  reason: default package */
/* loaded from: classes2.dex */
public class ayx<T> {
    private List<T> a = new ArrayList();
    private int b;

    public ayx(List<T> list, int i) {
        this.a.addAll(list);
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public List<T> b() {
        return this.a;
    }
}
