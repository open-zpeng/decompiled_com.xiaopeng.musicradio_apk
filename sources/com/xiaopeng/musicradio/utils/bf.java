package com.xiaopeng.musicradio.utils;
/* compiled from: SystemUtils.java */
/* loaded from: classes2.dex */
public class bf {
    public static boolean d() {
        return true;
    }

    public static boolean a() {
        String str = "-1";
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "persist.sys.user_def_btn", "0");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "0".equals(str);
    }

    public static boolean b() {
        String str = "0";
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "sys.xp.boot_completed", "0");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "1".equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c() {
        /*
            android.app.Application r0 = com.xiaopeng.musicradio.a.a
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            if (r0 == 0) goto L27
            boolean r0 = r0.isInteractive()
            java.lang.String r1 = "SystemUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "pm.isInteractive(): "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.xiaopeng.lib.utils.LogUtils.i(r1, r2)
            return r0
        L27:
            boolean r0 = com.xiaopeng.musicradio.utils.w.c()
            if (r0 == 0) goto L30
            java.lang.String r0 = "sys.power.xp_power_status"
            goto L32
        L30:
            java.lang.String r0 = "sys.xiaopeng.power_state"
        L32:
            java.lang.String r1 = "-1"
            r2 = 1
            r3 = 0
            java.lang.String r4 = "android.os.SystemProperties"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L79
            java.lang.String r5 = "get"
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L79
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r3] = r8     // Catch: java.lang.Exception -> L79
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r2] = r8     // Catch: java.lang.Exception -> L79
            java.lang.reflect.Method r5 = r4.getMethod(r5, r7)     // Catch: java.lang.Exception -> L79
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L79
            r6[r3] = r0     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = "-1"
            r6[r2] = r0     // Catch: java.lang.Exception -> L79
            java.lang.Object r0 = r5.invoke(r4, r6)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L79
            java.lang.String r1 = "SystemUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L74
            r4.<init>()     // Catch: java.lang.Exception -> L74
            java.lang.String r5 = "isPmNormal: "
            r4.append(r5)     // Catch: java.lang.Exception -> L74
            r4.append(r0)     // Catch: java.lang.Exception -> L74
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L74
            com.xiaopeng.lib.utils.LogUtils.i(r1, r4)     // Catch: java.lang.Exception -> L74
            goto L7e
        L74:
            r1 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
            goto L7a
        L79:
            r0 = move-exception
        L7a:
            r0.printStackTrace()
            r0 = r1
        L7e:
            java.lang.String r1 = "0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L87
            return r2
        L87:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.utils.bf.c():boolean");
    }

    public static boolean e() {
        String str = "";
        String str2 = "";
        try {
            if (h.d() != null) {
                str = h.d().getHardwareCarStage();
                str2 = h.d().getHardwareCarType();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "D20X".equals(str2 + str);
    }
}
