package defpackage;

import android.util.Pair;
import java.util.HashMap;
/* compiled from: DesignTool.java */
/* renamed from: dv  reason: default package */
/* loaded from: classes3.dex */
public class dv {
    static final HashMap<Pair<Integer, Integer>, String> a = new HashMap<>();
    static final HashMap<String, String> b = new HashMap<>();
    private final ek c;
    private String d = null;
    private String e = null;
    private int f = -1;
    private int g = -1;

    public dv(ek ekVar) {
        this.c = ekVar;
    }

    static {
        a.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        a.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        a.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        a.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        a.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        a.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        a.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        a.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        a.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        a.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        a.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        a.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        a.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        b.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        b.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        b.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        b.put("layout_constraintTop_toTopOf", "layout_marginTop");
        b.put("layout_constraintStart_toStartOf", "layout_marginStart");
        b.put("layout_constraintStart_toEndOf", "layout_marginStart");
        b.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        b.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        b.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        b.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        b.put("layout_constraintRight_toRightOf", "layout_marginRight");
        b.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }
}
