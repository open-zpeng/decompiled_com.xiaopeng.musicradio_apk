package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MaskKeyframeAnimation.java */
/* renamed from: od  reason: default package */
/* loaded from: classes3.dex */
public class od {
    private final List<nx<pw, Path>> a;
    private final List<nx<Integer, Integer>> b;
    private final List<pr> c;

    public od(List<pr> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).b().a());
            this.b.add(list.get(i).c().a());
        }
    }

    public List<pr> a() {
        return this.c;
    }

    public List<nx<pw, Path>> b() {
        return this.a;
    }

    public List<nx<Integer, Integer>> c() {
        return this.b;
    }
}
