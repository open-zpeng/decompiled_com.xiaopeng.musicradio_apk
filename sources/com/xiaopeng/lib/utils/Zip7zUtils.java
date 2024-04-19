package com.xiaopeng.lib.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes.dex */
public class Zip7zUtils {
    public static void zip7z(String str, String str2) {
        File file;
        bjv bjvVar;
        bjv bjvVar2 = null;
        try {
            try {
                File file2 = new File(str2);
                file = new File(str);
                bjvVar = new bjv(file2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            if (file.isDirectory()) {
                zip7zDirectory(file, bjvVar, "");
            } else {
                zip7zFile(file, bjvVar, "");
            }
            FileUtils.closeQuietly(bjvVar);
        } catch (IOException e2) {
            e = e2;
            bjvVar2 = bjvVar;
            System.out.println(e.toString());
            FileUtils.closeQuietly(bjvVar2);
        } catch (Throwable th2) {
            th = th2;
            bjvVar2 = bjvVar;
            FileUtils.closeQuietly(bjvVar2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void zip7zFile(File file, bjv bjvVar, String str) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
            }
        } catch (FileNotFoundException e) {
            e = e;
        } catch (IOException e2) {
            e = e2;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(file.getName());
            bjvVar.a((bjh) bjvVar.a(file, sb.toString()));
            byte[] bArr = new byte[4096];
            BufferedInputStream bufferedInputStream3 = sb;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                bufferedInputStream3 = null;
                bjvVar.a(bArr, 0, read);
            }
            FileUtils.closeQuietly(bufferedInputStream);
            bufferedInputStream2 = bufferedInputStream3;
            if (bjvVar == null) {
                return;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            bufferedInputStream2 = bufferedInputStream;
            e.printStackTrace();
            FileUtils.closeQuietly(bufferedInputStream2);
            bufferedInputStream2 = bufferedInputStream2;
            if (bjvVar == null) {
                return;
            }
            bjvVar.a();
        } catch (IOException e4) {
            e = e4;
            bufferedInputStream2 = bufferedInputStream;
            e.printStackTrace();
            FileUtils.closeQuietly(bufferedInputStream2);
            bufferedInputStream2 = bufferedInputStream2;
            if (bjvVar == null) {
                return;
            }
            bjvVar.a();
        } catch (Throwable th2) {
            th = th2;
            FileUtils.closeQuietly(bufferedInputStream);
            if (bjvVar != null) {
                bjvVar.a();
            }
            throw th;
        }
        bjvVar.a();
    }

    private static void zip7zDirectory(File file, bjv bjvVar, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                zip7zDirectory(file2, bjvVar, str + file2.getName() + "/");
            } else {
                zip7zFile(file2, bjvVar, str);
            }
        }
    }
}
