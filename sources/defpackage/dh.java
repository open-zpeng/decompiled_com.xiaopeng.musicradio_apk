package defpackage;

import defpackage.cq;
import java.util.ArrayList;
/* compiled from: Grouping.java */
/* renamed from: dh  reason: default package */
/* loaded from: classes3.dex */
public class dh {
    public static boolean a(cq.a aVar, cq.a aVar2, cq.a aVar3, cq.a aVar4) {
        return (aVar3 == cq.a.FIXED || aVar3 == cq.a.WRAP_CONTENT || (aVar3 == cq.a.MATCH_PARENT && aVar != cq.a.WRAP_CONTENT)) || (aVar4 == cq.a.FIXED || aVar4 == cq.a.WRAP_CONTENT || (aVar4 == cq.a.MATCH_PARENT && aVar2 != cq.a.WRAP_CONTENT));
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a9 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(defpackage.cr r16, defpackage.da.b r17) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh.a(cr, da$b):boolean");
    }

    private static dn a(ArrayList<dn> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dn dnVar = arrayList.get(i2);
            if (i == dnVar.c) {
                return dnVar;
            }
        }
        return null;
    }

    public static dn a(cq cqVar, int i, ArrayList<dn> arrayList, dn dnVar) {
        int i2;
        int A;
        if (i == 0) {
            i2 = cqVar.av;
        } else {
            i2 = cqVar.aw;
        }
        if (i2 != -1 && (dnVar == null || i2 != dnVar.c)) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                dn dnVar2 = arrayList.get(i3);
                if (dnVar2.b() == i2) {
                    if (dnVar != null) {
                        dnVar.a(i, dnVar2);
                        arrayList.remove(dnVar);
                    }
                    dnVar = dnVar2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return dnVar;
        }
        if (dnVar == null) {
            if ((cqVar instanceof cv) && (A = ((cv) cqVar).A(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    dn dnVar3 = arrayList.get(i4);
                    if (dnVar3.b() == A) {
                        dnVar = dnVar3;
                        break;
                    }
                    i4++;
                }
            }
            if (dnVar == null) {
                dnVar = new dn(i);
            }
            arrayList.add(dnVar);
        }
        if (dnVar.a(cqVar)) {
            if (cqVar instanceof ct) {
                ct ctVar = (ct) cqVar;
                ctVar.b().a(ctVar.c() == 0 ? 1 : 0, arrayList, dnVar);
            }
            if (i == 0) {
                cqVar.av = dnVar.b();
                cqVar.z.a(i, arrayList, dnVar);
                cqVar.B.a(i, arrayList, dnVar);
            } else {
                cqVar.aw = dnVar.b();
                cqVar.A.a(i, arrayList, dnVar);
                cqVar.D.a(i, arrayList, dnVar);
                cqVar.C.a(i, arrayList, dnVar);
            }
            cqVar.G.a(i, arrayList, dnVar);
        }
        return dnVar;
    }
}
