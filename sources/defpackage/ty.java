package defpackage;

import java.util.Map;
/* compiled from: UTAggregationPlugin.java */
/* renamed from: ty  reason: default package */
/* loaded from: classes3.dex */
public class ty {
    private static final String a = null;
    private static ty b;

    private ty() {
    }

    public static synchronized ty a() {
        ty tyVar;
        synchronized (ty.class) {
            if (b == null) {
                b = new ty();
            }
            tyVar = b;
        }
        return tyVar;
    }

    public void a(Map<String, String> map) {
        if (map == null) {
            return;
        }
        uw.a(a, "[sendToUT]:", " args:", map);
        if (!uc.h) {
            map.put("_fuamf", "yes");
            vh.a(map);
        } else if (map != null) {
            uc.a(map.get(vn.PAGE.toString()), map.get(vn.EVENTID.toString()), map.get(vn.ARG1.toString()), map.get(vn.ARG2.toString()), map.get(vn.ARG3.toString()), map);
        }
    }
}
