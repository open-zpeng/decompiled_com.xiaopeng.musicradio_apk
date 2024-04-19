package com.xiaopeng.musicradio.utils;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.xiaopeng.xui.app.XDialogSystemType;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
/* compiled from: FileUtils.java */
/* loaded from: classes2.dex */
public class v {
    public static void a(String str, String str2, String str3, boolean z) {
        a(str, str2, str3, z, "UTF-8");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4 A[Catch: Exception -> 0x00a0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a0, blocks: (B:38:0x009c, B:42:0x00a4), top: B:46:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, java.lang.String r8) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            boolean r4 = r1.exists()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            if (r4 != 0) goto Lf
            r1.mkdirs()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
        Lf:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r4.<init>()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.lang.String r2 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r4.append(r2)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r4.append(r2)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r4.append(r5)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            boolean r4 = r2.exists()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            if (r4 != 0) goto L35
            r2.createNewFile()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
        L35:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r2.<init>()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r2.append(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r2.append(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r2.append(r5)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r4.<init>(r5, r7)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L73
            r5.<init>(r4, r8)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L73
            r5.write(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L69
            r5.flush()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L69
            r5.close()     // Catch: java.lang.Exception -> L8d
            r4.close()     // Catch: java.lang.Exception -> L8d
            goto L98
        L64:
            r6 = move-exception
            r0 = r5
            r5 = r4
            r4 = r6
            goto L9a
        L69:
            r6 = move-exception
            r0 = r5
            r5 = r4
            r4 = r6
            goto L7d
        L6e:
            r5 = move-exception
            r3 = r5
            r5 = r4
            r4 = r3
            goto L9a
        L73:
            r5 = move-exception
            r3 = r5
            r5 = r4
            r4 = r3
            goto L7d
        L78:
            r4 = move-exception
            r5 = r0
            goto L9a
        L7b:
            r4 = move-exception
            r5 = r0
        L7d:
            java.io.PrintStream r6 = java.lang.System.out     // Catch: java.lang.Throwable -> L99
            java.lang.String r7 = " write file error!!"
            r6.println(r7)     // Catch: java.lang.Throwable -> L99
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L8f
            r0.close()     // Catch: java.lang.Exception -> L8d
            goto L8f
        L8d:
            r4 = move-exception
            goto L95
        L8f:
            if (r5 == 0) goto L98
            r5.close()     // Catch: java.lang.Exception -> L8d
            goto L98
        L95:
            r4.printStackTrace()
        L98:
            return
        L99:
            r4 = move-exception
        L9a:
            if (r0 == 0) goto La2
            r0.close()     // Catch: java.lang.Exception -> La0
            goto La2
        La0:
            r5 = move-exception
            goto La8
        La2:
            if (r5 == 0) goto Lab
            r5.close()     // Catch: java.lang.Exception -> La0
            goto Lab
        La8:
            r5.printStackTrace()
        Lab:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.utils.v.a(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void");
    }

    public static void a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = File.separator;
        String[] list = context.getResources().getAssets().list(str);
        if (list.length > 0) {
            File file = new File(str2);
            if (file.exists() || file.mkdirs()) {
                for (String str4 : list) {
                    a(context, str + str3 + str4, str2 + str3 + str4);
                }
                return;
            }
            return;
        }
        b(context, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto Lb1
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Le
            goto Lb1
        Le:
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            java.io.File r5 = r0.getParentFile()
            r5.mkdirs()
            r5 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L61 java.io.FileNotFoundException -> L7c
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L61 java.io.FileNotFoundException -> L7c
            java.io.InputStream r3 = r3.open(r4)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L61 java.io.FileNotFoundException -> L7c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L61 java.io.FileNotFoundException -> L7c
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.io.IOException -> L5a java.io.FileNotFoundException -> L5c java.lang.Throwable -> L9c
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L5a java.io.FileNotFoundException -> L5c java.lang.Throwable -> L9c
            r4.<init>(r0)     // Catch: java.io.IOException -> L5a java.io.FileNotFoundException -> L5c java.lang.Throwable -> L9c
            r3.<init>(r4)     // Catch: java.io.IOException -> L5a java.io.FileNotFoundException -> L5c java.lang.Throwable -> L9c
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54 java.io.FileNotFoundException -> L57
        L36:
            int r0 = r1.read(r4)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54 java.io.FileNotFoundException -> L57
            r2 = -1
            if (r0 == r2) goto L42
            r2 = 0
            r3.write(r4, r2, r0)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54 java.io.FileNotFoundException -> L57
            goto L36
        L42:
            r3.close()     // Catch: java.io.IOException -> L4a
            r1.close()     // Catch: java.io.IOException -> L4a
            goto L98
        L4a:
            r3 = move-exception
            java.lang.Exception r5 = new java.lang.Exception
            r5.<init>(r3)
            goto L98
        L51:
            r4 = move-exception
            r5 = r3
            goto L9d
        L54:
            r4 = move-exception
            r5 = r3
            goto L63
        L57:
            r4 = move-exception
            r5 = r3
            goto L7e
        L5a:
            r4 = move-exception
            goto L63
        L5c:
            r4 = move-exception
            goto L7e
        L5e:
            r4 = move-exception
            r1 = r5
            goto L9d
        L61:
            r4 = move-exception
            r1 = r5
        L63:
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L9c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9c
            if (r5 == 0) goto L70
            r5.close()     // Catch: java.io.IOException -> L6e
            goto L70
        L6e:
            r3 = move-exception
            goto L76
        L70:
            if (r1 == 0) goto L97
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L97
        L76:
            java.lang.Exception r5 = new java.lang.Exception
            r5.<init>(r3)
            goto L98
        L7c:
            r4 = move-exception
            r1 = r5
        L7e:
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L9c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9c
            if (r5 == 0) goto L8b
            r5.close()     // Catch: java.io.IOException -> L89
            goto L8b
        L89:
            r3 = move-exception
            goto L91
        L8b:
            if (r1 == 0) goto L97
            r1.close()     // Catch: java.io.IOException -> L89
            goto L97
        L91:
            java.lang.Exception r5 = new java.lang.Exception
            r5.<init>(r3)
            goto L98
        L97:
            r5 = r3
        L98:
            if (r5 != 0) goto L9b
            return
        L9b:
            throw r5
        L9c:
            r4 = move-exception
        L9d:
            if (r5 == 0) goto La5
            r5.close()     // Catch: java.io.IOException -> La3
            goto La5
        La3:
            r3 = move-exception
            goto Lab
        La5:
            if (r1 == 0) goto Lb0
            r1.close()     // Catch: java.io.IOException -> La3
            goto Lb0
        Lab:
            java.lang.Exception r5 = new java.lang.Exception
            r5.<init>(r3)
        Lb0:
            throw r4
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.utils.v.b(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void a(String str, String str2, String str3) {
        a(str, str2, str3, false);
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str));
    }

    public static byte[] a(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
        } catch (Exception unused) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        if (!file.exists()) {
            a((Closeable) null);
            return null;
        }
        fileInputStream = new FileInputStream(file);
        try {
            byte[] a = a((InputStream) fileInputStream);
            a((Closeable) fileInputStream);
            return a;
        } catch (Exception unused2) {
            a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            a((Closeable) fileInputStream2);
            throw th;
        }
    }

    public static byte[] a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(XDialogSystemType.TYPE_LIFECYCLE_DIALOG);
        try {
            byte[] bArr = new byte[XDialogSystemType.TYPE_LIFECYCLE_DIALOG];
            while (true) {
                int read = inputStream.read(bArr, 0, bArr.length);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception unused) {
            return null;
        } finally {
            a(byteArrayOutputStream);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        return "android.resource://" + resources.getResourcePackageName(i) + "/" + resources.getResourceTypeName(i) + "/" + resources.getResourceEntryName(i);
    }

    public static String b(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1, str.length());
    }
}
