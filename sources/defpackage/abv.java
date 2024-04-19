package defpackage;

import android.util.Pair;
import java.util.List;
/* compiled from: RemoteMethod.java */
/* renamed from: abv  reason: default package */
/* loaded from: classes2.dex */
public class abv {
    private String a;
    private int b;
    private List<Pair<String, String>> c;

    public abv(String str, int i, List<Pair<String, String>> list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public List<Pair<String, String>> c() {
        return this.c;
    }
}
