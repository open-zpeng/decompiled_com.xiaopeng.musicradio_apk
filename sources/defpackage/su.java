package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.alibaba.android.arouter.facade.template.ILogger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ClassUtils.java */
/* renamed from: su  reason: default package */
/* loaded from: classes3.dex */
public class su {
    private static final String a = "code_cache" + File.separator + "secondary-dexes";

    private static SharedPreferences b(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    public static Set<String> a(Context context, final String str) {
        final HashSet hashSet = new HashSet();
        List<String> a2 = a(context);
        final CountDownLatch countDownLatch = new CountDownLatch(a2.size());
        for (final String str2 : a2) {
            ss.a().execute(new Runnable() { // from class: su.1
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
                    if (r0 == null) goto L18;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        r4 = this;
                        r0 = 0
                        java.lang.String r1 = r1     // Catch: java.lang.Throwable -> L51
                        java.lang.String r2 = ".zip"
                        boolean r1 = r1.endsWith(r2)     // Catch: java.lang.Throwable -> L51
                        if (r1 == 0) goto L26
                        java.lang.String r1 = r1     // Catch: java.lang.Throwable -> L51
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
                        r2.<init>()     // Catch: java.lang.Throwable -> L51
                        java.lang.String r3 = r1     // Catch: java.lang.Throwable -> L51
                        r2.append(r3)     // Catch: java.lang.Throwable -> L51
                        java.lang.String r3 = ".tmp"
                        r2.append(r3)     // Catch: java.lang.Throwable -> L51
                        java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L51
                        r3 = 0
                        dalvik.system.DexFile r0 = dalvik.system.DexFile.loadDex(r1, r2, r3)     // Catch: java.lang.Throwable -> L51
                        goto L2e
                    L26:
                        dalvik.system.DexFile r1 = new dalvik.system.DexFile     // Catch: java.lang.Throwable -> L51
                        java.lang.String r2 = r1     // Catch: java.lang.Throwable -> L51
                        r1.<init>(r2)     // Catch: java.lang.Throwable -> L51
                        r0 = r1
                    L2e:
                        java.util.Enumeration r1 = r0.entries()     // Catch: java.lang.Throwable -> L51
                    L32:
                        boolean r2 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L51
                        if (r2 == 0) goto L4c
                        java.lang.Object r2 = r1.nextElement()     // Catch: java.lang.Throwable -> L51
                        java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L51
                        java.lang.String r3 = r2     // Catch: java.lang.Throwable -> L51
                        boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> L51
                        if (r3 == 0) goto L32
                        java.util.Set r3 = r3     // Catch: java.lang.Throwable -> L51
                        r3.add(r2)     // Catch: java.lang.Throwable -> L51
                        goto L32
                    L4c:
                        if (r0 == 0) goto L5e
                        goto L5b
                    L4f:
                        r1 = move-exception
                        goto L64
                    L51:
                        r1 = move-exception
                        java.lang.String r2 = "ARouter"
                        java.lang.String r3 = "Scan map file in dex files made error."
                        android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L4f
                        if (r0 == 0) goto L5e
                    L5b:
                        r0.close()     // Catch: java.lang.Throwable -> L5e
                    L5e:
                        java.util.concurrent.CountDownLatch r0 = r4
                        r0.countDown()
                        return
                    L64:
                        if (r0 == 0) goto L69
                        r0.close()     // Catch: java.lang.Throwable -> L69
                    L69:
                        java.util.concurrent.CountDownLatch r0 = r4
                        r0.countDown()
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.su.AnonymousClass1.run():void");
                }
            });
        }
        countDownLatch.await();
        Log.d(ILogger.defaultTag, "Filter " + hashSet.size() + " classes by packageName <" + str + ">");
        return hashSet;
    }

    public static List<String> a(Context context) {
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        File file = new File(applicationInfo.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(applicationInfo.sourceDir);
        String str = file.getName() + ".classes";
        if (!a()) {
            int i = b(context).getInt("dex.number", 1);
            File file2 = new File(applicationInfo.dataDir, a);
            for (int i2 = 2; i2 <= i; i2++) {
                File file3 = new File(file2, str + i2 + ".zip");
                if (file3.isFile()) {
                    arrayList.add(file3.getAbsolutePath());
                } else {
                    throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + "'");
                }
            }
        }
        if (sp.b()) {
            arrayList.addAll(a(applicationInfo));
        }
        return arrayList;
    }

    private static List<String> a(ApplicationInfo applicationInfo) {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21 && applicationInfo.splitSourceDirs != null) {
            arrayList.addAll(Arrays.asList(applicationInfo.splitSourceDirs));
            Log.d(ILogger.defaultTag, "Found InstantRun support");
        } else {
            try {
                File file = new File((String) Class.forName("com.android.tools.fd.runtime.Paths").getMethod("getDexFileDirectory", String.class).invoke(null, applicationInfo.packageName));
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        if (file2 != null && file2.exists() && file2.isFile() && file2.getName().endsWith(".dex")) {
                            arrayList.add(file2.getAbsolutePath());
                        }
                    }
                    Log.d(ILogger.defaultTag, "Found InstantRun support");
                }
            } catch (Exception e) {
                Log.e(ILogger.defaultTag, "InstantRun support error, " + e.getMessage());
            }
        }
        return arrayList;
    }

    private static boolean a() {
        boolean z = false;
        String str = null;
        try {
            if (b()) {
                str = "'YunOS'";
                if (Integer.valueOf(System.getProperty("ro.build.version.sdk")).intValue() >= 21) {
                    z = true;
                }
            } else {
                str = "'Android'";
                String property = System.getProperty("java.vm.version");
                if (property != null) {
                    Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
                    if (matcher.matches()) {
                        int parseInt = Integer.parseInt(matcher.group(1));
                        int parseInt2 = Integer.parseInt(matcher.group(2));
                        if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                            z = true;
                        }
                    }
                }
            }
        } catch (NumberFormatException | Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with name ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i(ILogger.defaultTag, sb.toString());
        return z;
    }

    private static boolean b() {
        try {
            String property = System.getProperty("ro.yunos.version");
            String property2 = System.getProperty("java.vm.name");
            if (property2 == null || !property2.toLowerCase().contains("lemur")) {
                if (property == null) {
                    return false;
                }
                if (property.trim().length() <= 0) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
