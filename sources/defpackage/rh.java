package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaskParser.java */
/* renamed from: rh  reason: default package */
/* loaded from: classes3.dex */
public class rh {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
        if (r0.equals("a") != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pr a(android.util.JsonReader r10, com.airbnb.lottie.d r11) {
        /*
            r10.beginObject()
            r0 = 0
            r1 = r0
            r2 = r1
        L6:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Lbc
            java.lang.String r3 = r10.nextName()
            int r4 = r3.hashCode()
            r5 = 111(0x6f, float:1.56E-43)
            r6 = 0
            r7 = 1
            r8 = 2
            r9 = -1
            if (r4 == r5) goto L3a
            r5 = 3588(0xe04, float:5.028E-42)
            if (r4 == r5) goto L30
            r5 = 3357091(0x3339a3, float:4.704286E-39)
            if (r4 == r5) goto L26
            goto L44
        L26:
            java.lang.String r4 = "mode"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L44
            r4 = r6
            goto L45
        L30:
            java.lang.String r4 = "pt"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L44
            r4 = r7
            goto L45
        L3a:
            java.lang.String r4 = "o"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L44
            r4 = r8
            goto L45
        L44:
            r4 = r9
        L45:
            switch(r4) {
                case 0: goto L56;
                case 1: goto L51;
                case 2: goto L4c;
                default: goto L48;
            }
        L48:
            r10.skipValue()
            goto L6
        L4c:
            pa r2 = defpackage.qq.b(r10, r11)
            goto L6
        L51:
            pe r1 = defpackage.qq.e(r10, r11)
            goto L6
        L56:
            java.lang.String r0 = r10.nextString()
            int r4 = r0.hashCode()
            r5 = 97
            if (r4 == r5) goto L7f
            r5 = 105(0x69, float:1.47E-43)
            if (r4 == r5) goto L75
            r5 = 115(0x73, float:1.61E-43)
            if (r4 == r5) goto L6b
            goto L88
        L6b:
            java.lang.String r4 = "s"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L88
            r6 = r7
            goto L89
        L75:
            java.lang.String r4 = "i"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L88
            r6 = r8
            goto L89
        L7f:
            java.lang.String r4 = "a"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L88
            goto L89
        L88:
            r6 = r9
        L89:
            switch(r6) {
                case 0: goto Lb8;
                case 1: goto Lb4;
                case 2: goto Lab;
                default: goto L8c;
            }
        L8c:
            java.lang.String r0 = "LOTTIE"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unknown mask mode "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = ". Defaulting to Add."
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r0, r3)
            pr$a r0 = defpackage.pr.a.MaskModeAdd
            goto L6
        Lab:
            java.lang.String r0 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r11.a(r0)
            pr$a r0 = defpackage.pr.a.MaskModeIntersect
            goto L6
        Lb4:
            pr$a r0 = defpackage.pr.a.MaskModeSubtract
            goto L6
        Lb8:
            pr$a r0 = defpackage.pr.a.MaskModeAdd
            goto L6
        Lbc:
            r10.endObject()
            pr r10 = new pr
            r10.<init>(r0, r1, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh.a(android.util.JsonReader, com.airbnb.lottie.d):pr");
    }
}
