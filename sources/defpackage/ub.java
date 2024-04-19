package defpackage;

import com.alibaba.mtl.appmonitor.f;
import com.alibaba.mtl.appmonitor.model.UTDimensionValueSet;
import com.xiaopeng.musicradio.bean.ListSignBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: UTUtil.java */
/* renamed from: ub  reason: default package */
/* loaded from: classes3.dex */
public class ub {
    public static void a(Map<UTDimensionValueSet, List<tc>> map) {
        Integer c;
        for (Map.Entry<UTDimensionValueSet, List<tc>> entry : map.entrySet()) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            UTDimensionValueSet key = entry.getKey();
            List<tc> value = entry.getValue();
            if (value.size() != 0 && (c = key.c()) != null) {
                te b = te.b(c.intValue());
                int i = 0;
                tg tgVar = (tg) tj.a().a(tg.class, new Object[0]);
                tgVar.b = c.intValue();
                if (key.b() != null) {
                    tgVar.f.putAll(key.b());
                }
                HashMap hashMap = new HashMap();
                hashMap.put("meta", f.a());
                tm tmVar = (tm) tj.a().a(tm.class, new Object[0]);
                for (tc tcVar : value) {
                    tmVar.put(tcVar.c());
                    if (i == 0) {
                        sb.append(tcVar.e);
                        sb2.append(tcVar.f);
                    } else {
                        sb.append(ListSignBean.COLLECTID_SUFFIX);
                        sb.append(tcVar.e);
                        sb2.append(ListSignBean.COLLECTID_SUFFIX);
                        sb2.append(tcVar.f);
                    }
                    i++;
                    tj.a().a((tj) tcVar);
                }
                hashMap.put("data", tmVar);
                tgVar.f.put(b.d(), new JSONObject(hashMap).toString());
                String sb3 = sb.toString();
                String sb4 = sb2.toString();
                tgVar.f.put(vn.ARG1.toString(), sb3);
                tgVar.f.put(vn.ARG2.toString(), sb4);
                tgVar.c = sb3;
                tgVar.d = sb4;
                b(tgVar);
                tj.a().a((tj) tmVar);
            }
            tj.a().a((tj) key);
        }
    }

    public static void a(UTDimensionValueSet uTDimensionValueSet, tc tcVar) {
        Integer c = uTDimensionValueSet.c();
        if (c != null) {
            te b = te.b(c.intValue());
            tg tgVar = (tg) tj.a().a(tg.class, new Object[0]);
            tgVar.b = 6699;
            if (uTDimensionValueSet.b() != null) {
                tgVar.f.putAll(uTDimensionValueSet.b());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("meta", f.a());
            hashMap.put("_event_id", c);
            tm tmVar = (tm) tj.a().a(tm.class, new Object[0]);
            tmVar.put(tcVar.c());
            tj.a().a((tj) tcVar);
            hashMap.put("data", tmVar);
            tgVar.f.put(b.d(), new JSONObject(hashMap).toString());
            tgVar.f.put(vn.EVENTID.toString(), String.valueOf(6699));
            b(tgVar);
            tj.a().a((tj) tmVar);
        }
    }

    public static void a(tg tgVar) {
        if (tgVar == null) {
            return;
        }
        uc.a(tgVar.a, String.valueOf(tgVar.b), tgVar.c, tgVar.d, tgVar.e, tgVar.f);
        tj.a().a((tj) tgVar);
    }

    public static void b(tg tgVar) {
        uw.a("UTUtil", "upload without flowback. args:", tgVar.f);
        ty.a().a(tgVar.f);
        tj.a().a((tj) tgVar);
    }
}
