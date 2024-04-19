package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: MineTabImpl.java */
/* renamed from: alf  reason: default package */
/* loaded from: classes2.dex */
public class alf implements ald {
    private static final Map<String, Integer> a = new HashMap();

    static {
        a.put("collect", 0);
        a.put("album", 1);
        a.put("history", 2);
        a.put("manager", 3);
    }

    @Override // defpackage.ald
    public Integer a(String str) {
        return a.get(str);
    }
}
